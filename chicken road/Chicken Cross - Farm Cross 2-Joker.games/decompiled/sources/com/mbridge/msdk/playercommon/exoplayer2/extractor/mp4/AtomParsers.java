package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.audio.Ac3Util;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FixedSampleSizeRechunker;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.AvcConfig;
import com.mbridge.msdk.playercommon.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 3;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_vide = Util.getIntegerCodeForString("vide");
    private static final int TYPE_soun = Util.getIntegerCodeForString("soun");
    private static final int TYPE_text = Util.getIntegerCodeForString("text");
    private static final int TYPE_sbtl = Util.getIntegerCodeForString("sbtl");
    private static final int TYPE_subt = Util.getIntegerCodeForString("subt");
    private static final int TYPE_clcp = Util.getIntegerCodeForString("clcp");
    private static final int TYPE_meta = Util.getIntegerCodeForString(Constants.REFERRER_API_META);

    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    private interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == 0 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }

    private static final class TkhdData {
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    public static final class UnhandledEditListException extends ParserException {
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(3, 0, length)] && jArr[Util.constrainValue(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_esds) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int readUnsignedFixedPoint1616;
        int i7;
        String str2;
        String str3;
        DrmInitData drmInitData2;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        DrmInitData drmInitData3 = drmInitData;
        parsableByteArray.setPosition(i11 + 16);
        int i12 = 0;
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        int i13 = 2;
        boolean z3 = true;
        if (i6 == 0 || i6 == 1) {
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i7 = readUnsignedShort;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            i7 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int i14 = i;
        if (i14 == Atom.TYPE_enca) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i11, i3);
            if (parseSampleEntryEncryptionData != null) {
                i14 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str4 = "audio/raw";
        String str5 = i14 == Atom.TYPE_ac_3 ? "audio/ac3" : i14 == Atom.TYPE_ec_3 ? "audio/eac3" : i14 == Atom.TYPE_dtsc ? "audio/vnd.dts" : (i14 == Atom.TYPE_dtsh || i14 == Atom.TYPE_dtsl) ? "audio/vnd.dts.hd" : i14 == Atom.TYPE_dtse ? "audio/vnd.dts.hd;profile=lbr" : i14 == Atom.TYPE_samr ? "audio/3gpp" : i14 == Atom.TYPE_sawb ? "audio/amr-wb" : (i14 == Atom.TYPE_lpcm || i14 == Atom.TYPE_sowt) ? "audio/raw" : i14 == Atom.TYPE__mp3 ? "audio/mpeg" : i14 == Atom.TYPE_alac ? "audio/alac" : null;
        int i15 = readUnsignedFixedPoint1616;
        int i16 = i7;
        int i17 = position;
        byte[] bArr = null;
        while (i17 - i11 < i3) {
            parsableByteArray.setPosition(i17);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0 ? z3 : i12, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            int i18 = Atom.TYPE_esds;
            if (readInt2 == i18) {
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
                z2 = z3;
                i8 = i13;
                i9 = i12;
            } else if (z && readInt2 == Atom.TYPE_wave) {
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
                i8 = i13;
                i9 = i12;
                z2 = true;
            } else {
                if (readInt2 == Atom.TYPE_dac3) {
                    parsableByteArray.setPosition(i17 + 8);
                    stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData4);
                } else if (readInt2 == Atom.TYPE_dec3) {
                    parsableByteArray.setPosition(i17 + 8);
                    stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData4);
                } else {
                    if (readInt2 == Atom.TYPE_ddts) {
                        i10 = i17;
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        z2 = true;
                        i8 = i13;
                        i9 = i12;
                        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str5, null, -1, -1, i16, i15, null, drmInitData2, 0, str);
                        readInt = readInt;
                    } else {
                        i10 = i17;
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        i8 = i13;
                        i9 = i12;
                        z2 = true;
                        if (readInt2 == Atom.TYPE_alac) {
                            byte[] bArr2 = new byte[readInt];
                            i17 = i10;
                            parsableByteArray.setPosition(i17);
                            parsableByteArray.readBytes(bArr2, i9, readInt);
                            bArr = bArr2;
                            str5 = str2;
                            i17 += readInt;
                            i12 = i9;
                            z3 = z2;
                            drmInitData4 = drmInitData2;
                            i13 = i8;
                            str4 = str3;
                            i11 = i2;
                        }
                    }
                    i17 = i10;
                    str5 = str2;
                    i17 += readInt;
                    i12 = i9;
                    z3 = z2;
                    drmInitData4 = drmInitData2;
                    i13 = i8;
                    str4 = str3;
                    i11 = i2;
                }
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
                i8 = i13;
                i9 = i12;
                z2 = true;
                str5 = str2;
                i17 += readInt;
                i12 = i9;
                z3 = z2;
                drmInitData4 = drmInitData2;
                i13 = i8;
                str4 = str3;
                i11 = i2;
            }
            int findEsdsPosition = readInt2 == i18 ? i17 : findEsdsPosition(parsableByteArray, i17, readInt);
            if (findEsdsPosition != -1) {
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, findEsdsPosition);
                str5 = (String) parseEsdsFromParent.first;
                bArr = (byte[]) parseEsdsFromParent.second;
                if ("audio/mp4a-latm".equals(str5)) {
                    Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                    i15 = ((Integer) parseAacAudioSpecificConfig.first).intValue();
                    i16 = ((Integer) parseAacAudioSpecificConfig.second).intValue();
                }
                i17 += readInt;
                i12 = i9;
                z3 = z2;
                drmInitData4 = drmInitData2;
                i13 = i8;
                str4 = str3;
                i11 = i2;
            }
            str5 = str2;
            i17 += readInt;
            i12 = i9;
            z3 = z2;
            drmInitData4 = drmInitData2;
            i13 = i8;
            str4 = str3;
            i11 = i2;
        }
        String str6 = str5;
        String str7 = str4;
        DrmInitData drmInitData5 = drmInitData4;
        int i19 = i13;
        if (stsdData.format != null || str6 == null) {
            return;
        }
        stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str6, null, -1, -1, i16, i15, str7.equals(str6) ? i19 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData5, 0, str);
    }

    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_frma) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == Atom.TYPE_schm) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == Atom.TYPE_schi) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        Assertions.checkArgument(num != null, "frma atom is mandatory");
        Assertions.checkArgument(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        Assertions.checkArgument(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, parseSchiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        if (containerAtom == null || (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) == null) {
            return Pair.create(null, null);
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        int readInt = parsableByteArray.readInt();
        if (readInt == TYPE_soun) {
            return 1;
        }
        if (readInt == TYPE_vide) {
            return 2;
        }
        if (readInt == TYPE_text || readInt == TYPE_sbtl || readInt == TYPE_subt || readInt == TYPE_clcp) {
            return 3;
        }
        return readInt == TYPE_meta ? 4 : -1;
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 4 : 8);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(readUnsignedInt), "" + ((char) (((readUnsignedShort >> 10) & 31) + 96)) + ((char) (((readUnsignedShort >> 5) & 31) + 96)) + ((char) ((readUnsignedShort & 31) + 96)));
    }

    private static Metadata parseMetaAtom(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_ilst) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_proj) {
                return Arrays.copyOfRange(parsableByteArray.data, i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == Atom.TYPE_sinf && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_tenc) {
                int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = readUnsignedByte & 15;
                    i4 = (readUnsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += readInt;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0384 A[EDGE_INSN: B:135:0x0384->B:136:0x0384 BREAK  A[LOOP:5: B:123:0x0348->B:132:0x037e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        Track track2;
        String str;
        long[] jArr;
        int[] iArr;
        int i3;
        long[] jArr2;
        int[] iArr2;
        long j;
        long scaleLargeTimestamp;
        String str2;
        int i4;
        long[] jArr3;
        boolean z2;
        int i5;
        long[] jArr4;
        long[] jArr5;
        int[] iArr3;
        long[] jArr6;
        int[] iArr4;
        int i6;
        long[] jArr7;
        String str3;
        boolean z3;
        int[] iArr5;
        long[] jArr8;
        int[] iArr6;
        String str4;
        int i7;
        SampleSizeBox sampleSizeBox;
        long[] jArr9;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_co64);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stts).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = null;
        ParsableByteArray parsableByteArray5 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray6 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            i = parsableByteArray6.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i2 = parsableByteArray5.readUnsignedIntToInt();
            r16 = i2 > 0 ? parsableByteArray5.readUnsignedIntToInt() - 1 : -1;
            long j2 = 0;
            if (!stz2SampleSizeBox.isFixedSampleSize() && "audio/raw".equals(track.format.sampleMimeType) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0) {
                long[] jArr10 = new long[sampleCount];
                int[] iArr7 = new int[sampleCount];
                int i8 = i2;
                long[] jArr11 = new long[sampleCount];
                int[] iArr8 = new int[sampleCount];
                int i9 = readUnsignedIntToInt3;
                long j3 = 0;
                long j4 = 0;
                int i10 = readUnsignedIntToInt;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = i8;
                int i17 = r16;
                int i18 = i;
                int i19 = readUnsignedIntToInt2;
                while (i11 < sampleCount) {
                    while (i15 == 0) {
                        Assertions.checkState(chunkIterator.moveNext());
                        j4 = chunkIterator.offset;
                        i15 = chunkIterator.numSamples;
                        i10 = i10;
                        i19 = i19;
                    }
                    int i20 = i10;
                    int i21 = i19;
                    if (parsableByteArray6 != null) {
                        while (i13 == 0 && i18 > 0) {
                            i13 = parsableByteArray6.readUnsignedIntToInt();
                            i14 = parsableByteArray6.readInt();
                            i18--;
                        }
                        i13--;
                    }
                    int i22 = i14;
                    jArr10[i11] = j4;
                    int readNextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                    iArr7[i11] = readNextSampleSize;
                    if (readNextSampleSize > i12) {
                        jArr9 = jArr10;
                        i12 = readNextSampleSize;
                        sampleSizeBox = stz2SampleSizeBox;
                    } else {
                        sampleSizeBox = stz2SampleSizeBox;
                        jArr9 = jArr10;
                    }
                    jArr11[i11] = j3 + i22;
                    iArr8[i11] = parsableByteArray4 == null ? 1 : 0;
                    if (i11 == i17) {
                        iArr8[i11] = 1;
                        i16--;
                        if (i16 > 0) {
                            i17 = parsableByteArray4.readUnsignedIntToInt() - 1;
                        }
                    }
                    j3 += i9;
                    int i23 = i21 - 1;
                    if (i23 == 0 && i20 > 0) {
                        i20--;
                        i23 = parsableByteArray3.readUnsignedIntToInt();
                        i9 = parsableByteArray3.readInt();
                    }
                    int i24 = i23;
                    j4 += iArr7[i11];
                    i15--;
                    i11++;
                    stz2SampleSizeBox = sampleSizeBox;
                    jArr10 = jArr9;
                    i19 = i24;
                    i14 = i22;
                    i10 = i20;
                }
                int i25 = i10;
                int i26 = i19;
                int i27 = i14;
                long[] jArr12 = jArr10;
                j = j3 + i27;
                Assertions.checkArgument(i13 == 0);
                while (i18 > 0) {
                    Assertions.checkArgument(parsableByteArray6.readUnsignedIntToInt() == 0);
                    parsableByteArray6.readInt();
                    i18--;
                }
                if (i16 == 0 && i26 == 0) {
                    i7 = i15;
                    if (i7 == 0 && i25 == 0) {
                        track2 = track;
                        str = TAG;
                        jArr2 = jArr11;
                        iArr = iArr7;
                        iArr2 = iArr8;
                        i3 = i12;
                        jArr = jArr12;
                    }
                } else {
                    i7 = i15;
                }
                track2 = track;
                String str5 = "Inconsistent stbl box for track " + track2.id + ": remainingSynchronizationSamples " + i16 + ", remainingSamplesAtTimestampDelta " + i26 + ", remainingSamplesInChunk " + i7 + ", remainingTimestampDeltaChanges " + i25;
                str = TAG;
                Log.w(str, str5);
                jArr2 = jArr11;
                iArr = iArr7;
                iArr2 = iArr8;
                i3 = i12;
                jArr = jArr12;
            } else {
                track2 = track;
                str = TAG;
                int i28 = chunkIterator.length;
                long[] jArr13 = new long[i28];
                int[] iArr9 = new int[i28];
                while (chunkIterator.moveNext()) {
                    int i29 = chunkIterator.index;
                    jArr13[i29] = chunkIterator.offset;
                    iArr9[i29] = chunkIterator.numSamples;
                }
                Format format = track2.format;
                FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format.pcmEncoding, format.channelCount), jArr13, iArr9, readUnsignedIntToInt3);
                jArr = rechunk.offsets;
                iArr = rechunk.sizes;
                i3 = rechunk.maximumSize;
                jArr2 = rechunk.timestamps;
                iArr2 = rechunk.flags;
                j = rechunk.duration;
            }
            scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
            if (track2.editListDurations != null || gaplessInfoHolder.hasGaplessInfo()) {
                Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                return new TrackSampleTable(track, jArr, iArr, i3, jArr2, iArr2, scaleLargeTimestamp);
            }
            long[] jArr14 = track2.editListDurations;
            if (jArr14.length == 1 && track2.type == 1 && jArr2.length >= 2) {
                long j5 = track2.editListMediaTimes[0];
                long scaleLargeTimestamp2 = j5 + Util.scaleLargeTimestamp(jArr14[0], track2.timescale, track2.movieTimescale);
                str2 = str;
                if (canApplyEditWithGaplessInfo(jArr2, j, j5, scaleLargeTimestamp2)) {
                    long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j5 - jArr2[0], track2.format.sampleRate, track2.timescale);
                    i4 = i3;
                    long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track2.format.sampleRate, track2.timescale);
                    if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= 2147483647L && scaleLargeTimestamp4 <= 2147483647L) {
                        gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                        gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                        Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                        return new TrackSampleTable(track, jArr, iArr, i4, jArr2, iArr2, scaleLargeTimestamp);
                    }
                    jArr3 = track2.editListDurations;
                    if (jArr3.length != 1 && jArr3[0] == 0) {
                        long j6 = track2.editListMediaTimes[0];
                        for (int i30 = 0; i30 < jArr2.length; i30++) {
                            jArr2[i30] = Util.scaleLargeTimestamp(jArr2[i30] - j6, 1000000L, track2.timescale);
                        }
                        return new TrackSampleTable(track, jArr, iArr, i4, jArr2, iArr2, Util.scaleLargeTimestamp(j - j6, 1000000L, track2.timescale));
                    }
                    z2 = track2.type != 1;
                    int i31 = 0;
                    int i32 = 0;
                    boolean z4 = false;
                    i5 = 0;
                    while (true) {
                        jArr4 = track2.editListDurations;
                        if (i5 < jArr4.length) {
                            break;
                        }
                        long[] jArr15 = jArr;
                        int[] iArr10 = iArr;
                        long j7 = track2.editListMediaTimes[i5];
                        if (j7 != -1) {
                            long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr4[i5], track2.timescale, track2.movieTimescale);
                            int binarySearchCeil = Util.binarySearchCeil(jArr2, j7, true, true);
                            int binarySearchCeil2 = Util.binarySearchCeil(jArr2, j7 + scaleLargeTimestamp5, z2, false);
                            i31 += binarySearchCeil2 - binarySearchCeil;
                            boolean z5 = i32 != binarySearchCeil;
                            i32 = binarySearchCeil2;
                            z4 = z5 | z4;
                        }
                        i5++;
                        jArr = jArr15;
                        iArr = iArr10;
                    }
                    jArr5 = jArr;
                    iArr3 = iArr;
                    boolean z6 = z4 | (i31 == sampleCount);
                    jArr6 = !z6 ? new long[i31] : jArr5;
                    int[] iArr11 = !z6 ? new int[i31] : iArr3;
                    int i33 = !z6 ? 0 : i4;
                    iArr4 = !z6 ? new int[i31] : iArr2;
                    long[] jArr16 = new long[i31];
                    i6 = 0;
                    int i34 = 0;
                    while (true) {
                        jArr7 = track2.editListDurations;
                        if (i6 < jArr7.length) {
                            return new TrackSampleTable(track, jArr6, iArr11, i33, jArr16, iArr4, Util.scaleLargeTimestamp(j2, 1000000L, track2.timescale));
                        }
                        long[] jArr17 = jArr5;
                        long j8 = track2.editListMediaTimes[i6];
                        long j9 = jArr7[i6];
                        if (j8 != -1) {
                            int i35 = i33;
                            int[] iArr12 = iArr4;
                            long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j9, track2.timescale, track2.movieTimescale) + j8;
                            int binarySearchCeil3 = Util.binarySearchCeil(jArr2, j8, true, true);
                            int binarySearchCeil4 = Util.binarySearchCeil(jArr2, scaleLargeTimestamp6, z2, false);
                            if (z6) {
                                int i36 = binarySearchCeil4 - binarySearchCeil3;
                                System.arraycopy(jArr17, binarySearchCeil3, jArr6, i34, i36);
                                iArr5 = iArr3;
                                System.arraycopy(iArr5, binarySearchCeil3, iArr11, i34, i36);
                                jArr8 = jArr6;
                                iArr6 = iArr12;
                                System.arraycopy(iArr2, binarySearchCeil3, iArr6, i34, i36);
                            } else {
                                iArr5 = iArr3;
                                jArr8 = jArr6;
                                iArr6 = iArr12;
                            }
                            if (binarySearchCeil3 >= binarySearchCeil4) {
                                str4 = str2;
                            } else {
                                if ((iArr6[i34] & 1) == 0) {
                                    Log.w(str2, "Ignoring edit list: edit does not start with a sync sample.");
                                    throw new UnhandledEditListException();
                                }
                                str4 = str2;
                            }
                            z3 = z2;
                            int i37 = binarySearchCeil3;
                            int i38 = i34;
                            int i39 = i35;
                            while (i37 < binarySearchCeil4) {
                                int i40 = binarySearchCeil4;
                                String str6 = str4;
                                long j10 = j8;
                                jArr16[i38] = Util.scaleLargeTimestamp(j2, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(jArr2[i37] - j8, 1000000L, track2.timescale);
                                if (z6 && iArr11[i38] > i39) {
                                    i39 = iArr5[i37];
                                }
                                i38++;
                                i37++;
                                binarySearchCeil4 = i40;
                                j8 = j10;
                                str4 = str6;
                            }
                            str3 = str4;
                            i33 = i39;
                            i34 = i38;
                        } else {
                            str3 = str2;
                            z3 = z2;
                            iArr5 = iArr3;
                            jArr8 = jArr6;
                            iArr6 = iArr4;
                        }
                        j2 += j9;
                        i6++;
                        jArr5 = jArr17;
                        iArr4 = iArr6;
                        z2 = z3;
                        jArr6 = jArr8;
                        str2 = str3;
                        iArr3 = iArr5;
                    }
                }
            } else {
                str2 = str;
            }
            i4 = i3;
            jArr3 = track2.editListDurations;
            if (jArr3.length != 1) {
            }
            if (track2.type != 1) {
            }
            int i312 = 0;
            int i322 = 0;
            boolean z42 = false;
            i5 = 0;
            while (true) {
                jArr4 = track2.editListDurations;
                if (i5 < jArr4.length) {
                }
                i5++;
                jArr = jArr15;
                iArr = iArr10;
            }
            jArr5 = jArr;
            iArr3 = iArr;
            boolean z62 = z42 | (i312 == sampleCount);
            if (!z62) {
            }
            if (!z62) {
            }
            if (!z62) {
            }
            if (!z62) {
            }
            long[] jArr162 = new long[i312];
            i6 = 0;
            int i342 = 0;
            while (true) {
                jArr7 = track2.editListDurations;
                if (i6 < jArr7.length) {
                }
                j2 += j9;
                i6++;
                jArr5 = jArr17;
                iArr4 = iArr6;
                z2 = z3;
                jArr6 = jArr8;
                str2 = str3;
                iArr3 = iArr5;
            }
        } else {
            i2 = 0;
        }
        parsableByteArray4 = parsableByteArray5;
        long j22 = 0;
        if (!stz2SampleSizeBox.isFixedSampleSize() && "audio/raw".equals(track.format.sampleMimeType) && readUnsignedIntToInt == 0 && i == 0 && i2 == 0) {
        }
        scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        if (track2.editListDurations != null) {
        }
        Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
        return new TrackSampleTable(track, jArr, iArr, i3, jArr2, iArr2, scaleLargeTimestamp);
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i3 = 0; i3 < readInt; i3++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            Assertions.checkArgument(readInt2 > 0, "childAtomSize should be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == Atom.TYPE_avc1 || readInt3 == Atom.TYPE_avc3 || readInt3 == Atom.TYPE_encv || readInt3 == Atom.TYPE_mp4v || readInt3 == Atom.TYPE_hvc1 || readInt3 == Atom.TYPE_hev1 || readInt3 == Atom.TYPE_s263 || readInt3 == Atom.TYPE_vp08 || readInt3 == Atom.TYPE_vp09) {
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i, i2, drmInitData, stsdData, i3);
            } else if (readInt3 == Atom.TYPE_mp4a || readInt3 == Atom.TYPE_enca || readInt3 == Atom.TYPE_ac_3 || readInt3 == Atom.TYPE_ec_3 || readInt3 == Atom.TYPE_dtsc || readInt3 == Atom.TYPE_dtse || readInt3 == Atom.TYPE_dtsh || readInt3 == Atom.TYPE_dtsl || readInt3 == Atom.TYPE_samr || readInt3 == Atom.TYPE_sawb || readInt3 == Atom.TYPE_lpcm || readInt3 == Atom.TYPE_sowt || readInt3 == Atom.TYPE__mp3 || readInt3 == Atom.TYPE_alac) {
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, z, drmInitData, stsdData, i3);
            } else if (readInt3 == Atom.TYPE_TTML || readInt3 == Atom.TYPE_tx3g || readInt3 == Atom.TYPE_wvtt || readInt3 == Atom.TYPE_stpp || readInt3 == Atom.TYPE_c608) {
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i, str, stsdData);
            } else if (readInt3 == Atom.TYPE_camm) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i), "application/x-camera-motion", null, -1, null);
            }
            parsableByteArray.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i != Atom.TYPE_TTML) {
            if (i == Atom.TYPE_tx3g) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == Atom.TYPE_wvtt) {
                str2 = "application/x-mp4-vtt";
            } else if (i == Atom.TYPE_stpp) {
                j = 0;
            } else {
                if (i != Atom.TYPE_c608) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, list);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullAtomVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullAtomVersion == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i3 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.data[position + i3] != -1) {
                long readUnsignedInt = parseFullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j = readUnsignedInt;
                }
            } else {
                i3++;
            }
        }
        parsableByteArray.skipBytes(16);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i2 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i2 = 270;
        } else if (readInt2 == -65536 && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i2 = 180;
        }
        return new TkhdData(readInt, j, i2);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        Atom.LeafAtom leafAtom2;
        long j2;
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int parseHdlr = parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data);
        if (parseHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        if (j == -9223372036854775807L) {
            leafAtom2 = leafAtom;
            j2 = parseTkhd.duration;
        } else {
            leafAtom2 = leafAtom;
            j2 = j;
        }
        long parseMvhd = parseMvhd(leafAtom2.data);
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, parseMvhd) : -9223372036854775807L;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> parseMdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData parseStsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, parseTkhd.id, parseTkhd.rotationDegrees, (String) parseMdhd.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> parseEdts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        return new Track(parseTkhd.id, parseHdlr, ((Long) parseMdhd.first).longValue(), parseMvhd, scaleLargeTimestamp, parseStsd.format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z) {
        if (z) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == Atom.TYPE_meta) {
                parsableByteArray.setPosition(position);
                return parseMetaAtom(parsableByteArray, position + readInt);
            }
            parsableByteArray.skipBytes(readInt - 8);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str = null;
        int i7 = i;
        if (i7 == Atom.TYPE_encv) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i3);
            if (parseSampleEntryEncryptionData != null) {
                i7 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i6] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitData2;
        float f = 1.0f;
        List<byte[]> list = null;
        byte[] bArr = null;
        int i8 = -1;
        boolean z = false;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i2 == i3) {
                break;
            }
            int i9 = 1;
            Assertions.checkArgument(readInt > 0, "childAtomSize should be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == Atom.TYPE_avcC) {
                Assertions.checkState(str == null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                list = parse.initializationData;
                stsdData.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z) {
                    f = parse.pixelWidthAspectRatio;
                }
                str = "video/avc";
            } else if (readInt2 == Atom.TYPE_hvcC) {
                Assertions.checkState(str == null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                list = parse2.initializationData;
                stsdData.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                str = "video/hevc";
            } else if (readInt2 == Atom.TYPE_vpcC) {
                Assertions.checkState(str == null);
                str = i7 == Atom.TYPE_vp08 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (readInt2 == Atom.TYPE_d263) {
                Assertions.checkState(str == null);
                str = "video/3gpp";
            } else if (readInt2 == Atom.TYPE_esds) {
                Assertions.checkState(str == null);
                Pair<String, byte[]> parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                str = (String) parseEsdsFromParent.first;
                list = Collections.singletonList((byte[]) parseEsdsFromParent.second);
            } else if (readInt2 == Atom.TYPE_pasp) {
                f = parsePaspFromParent(parsableByteArray, position2);
                z = true;
            } else if (readInt2 == Atom.TYPE_sv3d) {
                bArr = parseProjFromParent(parsableByteArray, position2, readInt);
            } else if (readInt2 == Atom.TYPE_st3d) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(3);
                if (readUnsignedByte == 0) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte2 != 0) {
                        if (readUnsignedByte2 != 1) {
                            i9 = 2;
                            if (readUnsignedByte2 != 2) {
                                if (readUnsignedByte2 == 3) {
                                    i8 = 3;
                                }
                            }
                        }
                        i8 = i9;
                    } else {
                        i8 = 0;
                    }
                }
            }
            position += readInt;
        }
        if (str == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i4), str, null, -1, -1, readUnsignedShort, readUnsignedShort2, -1.0f, list, i5, f, bArr, i8, null, drmInitData3);
    }
}
