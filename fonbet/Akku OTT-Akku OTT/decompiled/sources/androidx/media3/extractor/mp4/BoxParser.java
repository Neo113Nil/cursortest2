package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import androidx.collection.h;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import androidx.work.WorkInfo;
import com.google.common.base.f;
import com.google.common.base.g;
import com.google.common.collect.G;
import com.google.common.collect.i0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes3.dex */
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subp = 1937072752;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j, long j2) {
            this.avgBitrate = j;
            this.maxBitrate = j2;
        }

        public static /* synthetic */ long access$1400(BtrtData btrtData) {
            return btrtData.maxBitrate;
        }

        public static /* synthetic */ long access$1500(BtrtData btrtData) {
            return btrtData.avgBitrate;
        }
    }

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
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

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j, long j2) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j;
            this.peakBitrate = j2;
        }

        public static /* synthetic */ String access$1300(EsdsData esdsData) {
            return esdsData.mimeType;
        }

        public static /* synthetic */ long access$1600(EsdsData esdsData) {
            return esdsData.peakBitrate;
        }

        public static /* synthetic */ long access$1700(EsdsData esdsData) {
            return esdsData.bitrate;
        }

        public static /* synthetic */ byte[] access$700(EsdsData esdsData) {
            return esdsData.initializationData;
        }
    }

    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }

        public static /* synthetic */ StriData access$1100(EyesData eyesData) {
            return eyesData.striData;
        }
    }

    public static final class MdhdData {

        @Nullable
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j, long j2, @Nullable String str) {
            this.timescale = j;
            this.mediaDurationUs = j2;
            this.language = str;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z2, boolean z3) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z2;
            this.eyeViewsReversed = z3;
        }

        public static /* synthetic */ boolean access$1200(StriData striData) {
            return striData.eyeViewsReversed;
        }
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
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

    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;

        /* renamed from: id, reason: collision with root package name */
        private final int f46id;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i, long j, int i2, int i3, int i4, int i5) {
            this.f46id = i;
            this.duration = j;
            this.alternateGroup = i2;
            this.rotationDegrees = i3;
            this.width = i4;
            this.height = i5;
        }
    }

    public static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public static /* synthetic */ EyesData access$1000(VexuData vexuData) {
            return vexuData.eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i, int i2) {
        Assertions.checkState(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(com.google.common.primitives.c.d(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3])))));
        }
        StringBuilder c = h.c("size: ", i, i2, "x", "\npalette: ");
        c.append(new g(", ").b(arrayList));
        c.append("\n");
        return c.toString();
    }

    @Nullable
    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c = cArr[i2];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp || i == TYPE_subp) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(8);
        for (int i = 0; i < readBits; i++) {
            parsableBitArray.skipBytes(1);
            int readBits2 = parsableBitArray.readBits(8);
            for (int i2 = 0; i2 < readBits2; i2++) {
                parsableBitArray.skipBits(6);
                boolean readBit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int readBits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(readBits3);
                builder.setChromaBitdepth(readBits3);
                parsableBitArray.skipBytes(1);
                if (readBit) {
                    int readBits4 = parsableBitArray.readBits(8);
                    int readBits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, @Nullable String str, boolean z, @Nullable DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int i6;
        int readUnsignedShort;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i7;
        int i8;
        String str2;
        int i9;
        String str3;
        String str4;
        String str5;
        String str6;
        int i10;
        int i11;
        int i12 = i;
        int i13 = i3;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        if (z) {
            i6 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            i7 = 2;
            if (i6 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int readUnsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z2 = (readUnsignedIntToInt3 & 1) != 0;
            boolean z3 = (readUnsignedIntToInt3 & 2) != 0;
            if (z2) {
                if (readUnsignedIntToInt2 == 32) {
                    i8 = 4;
                    parsableByteArray.skipBytes(8);
                    readUnsignedShort = readUnsignedIntToInt;
                    i7 = 2;
                    readInt = 0;
                }
                i8 = -1;
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                i7 = 2;
                readInt = 0;
            } else {
                if (readUnsignedIntToInt2 == 8) {
                    i8 = 3;
                } else if (readUnsignedIntToInt2 == 16) {
                    i8 = z3 ? 268435456 : 2;
                } else if (readUnsignedIntToInt2 == 24) {
                    i8 = z3 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else {
                    if (readUnsignedIntToInt2 == 32) {
                        i8 = z3 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                    }
                    i8 = -1;
                }
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                i7 = 2;
                readInt = 0;
            }
        }
        if (i12 == 1767992678) {
            readUnsignedFixedPoint1616 = -1;
            readUnsignedShort = -1;
        } else {
            if (i12 != 1935764850) {
                readUnsignedFixedPoint1616 = i12 == 1935767394 ? 16000 : 8000;
            }
            readUnsignedShort = 1;
        }
        int position = parsableByteArray.getPosition();
        if (i12 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i13);
            if (parseSampleEntryEncryptionData != null) {
                i12 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str7 = "audio/mhm1";
        if (i12 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i12 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i12 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i12 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i12 == 1685353320 || i12 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i12 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i12 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i12 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i12 != 1935767394) {
                if (i12 != 1936684916) {
                    if (i12 == 1953984371) {
                        str3 = "audio/raw";
                        i9 = 268435456;
                    } else if (i12 == 1819304813) {
                        if (i8 != -1) {
                            i9 = i8;
                            str3 = "audio/raw";
                        }
                    } else if (i12 == 778924082 || i12 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i12 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i12 == 1835560241) {
                        i9 = i8;
                        str3 = "audio/mhm1";
                    } else if (i12 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i12 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i12 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i12 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i12 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i12 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i12 == 1767992678) {
                        str2 = MimeTypes.AUDIO_IAMF;
                    } else {
                        i9 = i8;
                        str3 = null;
                    }
                    int i14 = i9;
                    List<byte[]> list = null;
                    String str8 = null;
                    EsdsData esdsData = null;
                    BtrtData btrtData = null;
                    while (position - i2 < i13) {
                        parsableByteArray.setPosition(position);
                        int readInt2 = parsableByteArray.readInt();
                        String str9 = str8;
                        ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
                        int readInt3 = parsableByteArray.readInt();
                        if (readInt3 == 1835557187) {
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.skipBytes(1);
                            int readUnsignedByte = parsableByteArray.readUnsignedByte();
                            parsableByteArray.skipBytes(1);
                            String format = Objects.equals(str3, str7) ? String.format("mhm1.%02X", Integer.valueOf(readUnsignedByte)) : String.format("mha1.%02X", Integer.valueOf(readUnsignedByte));
                            int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                            str9 = format;
                            byte[] bArr = new byte[readUnsignedShort2];
                            str4 = str7;
                            parsableByteArray.readBytes(bArr, 0, readUnsignedShort2);
                            list = list == null ? G.n(bArr) : G.o(bArr, list.get(0));
                        } else {
                            str4 = str7;
                            if (readInt3 == 1835557200) {
                                parsableByteArray.setPosition(position + 8);
                                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                                if (readUnsignedByte2 > 0) {
                                    byte[] bArr2 = new byte[readUnsignedByte2];
                                    parsableByteArray.readBytes(bArr2, 0, readUnsignedByte2);
                                    list = list == null ? G.n(bArr2) : G.o(list.get(0), bArr2);
                                }
                            } else {
                                if (readInt3 == 1702061171 || (z && readInt3 == 2002876005)) {
                                    int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, readInt2);
                                    if (findBoxPosition != -1) {
                                        esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                                        str3 = esdsData.mimeType;
                                        byte[] bArr3 = esdsData.initializationData;
                                        if (bArr3 != null) {
                                            if ("audio/vorbis".equals(str3)) {
                                                list = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                            } else {
                                                if ("audio/mp4a-latm".equals(str3)) {
                                                    AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                                    readUnsignedFixedPoint1616 = parseAudioSpecificConfig.sampleRateHz;
                                                    readUnsignedShort = parseAudioSpecificConfig.channelCount;
                                                    str5 = parseAudioSpecificConfig.codecs;
                                                } else {
                                                    str5 = str9;
                                                }
                                                i0 n = G.n(bArr3);
                                                str6 = str5;
                                                list = n;
                                            }
                                        }
                                    }
                                    str6 = str9;
                                } else if (readInt3 == 1651798644) {
                                    btrtData = parseBtrtFromParent(parsableByteArray, position);
                                } else {
                                    if (readInt3 == 1684103987) {
                                        parsableByteArray.setPosition(position + 8);
                                        stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                                    } else if (readInt3 == 1684366131) {
                                        parsableByteArray.setPosition(position + 8);
                                        stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                                    } else if (readInt3 == 1684103988) {
                                        parsableByteArray.setPosition(position + 8);
                                        stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitData2);
                                    } else if (readInt3 == 1684892784) {
                                        if (readInt <= 0) {
                                            throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                                        }
                                        str6 = str9;
                                        readUnsignedFixedPoint1616 = readInt;
                                        readUnsignedShort = i7;
                                    } else if (readInt3 == 1684305011 || readInt3 == 1969517683) {
                                        stsdData.format = new Format.Builder().setId(i4).setSampleMimeType(str3).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                                        str6 = str9;
                                    } else if (readInt3 == 1682927731) {
                                        int i15 = readInt2 - 8;
                                        byte[] bArr4 = opusMagic;
                                        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i15);
                                        parsableByteArray.setPosition(position + 8);
                                        parsableByteArray.readBytes(copyOf, bArr4.length, i15);
                                        list = OpusUtil.buildInitializationData(copyOf);
                                    } else if (readInt3 == 1684425825) {
                                        byte[] bArr5 = new byte[readInt2 - 8];
                                        bArr5[0] = 102;
                                        bArr5[1] = 76;
                                        bArr5[i7] = 97;
                                        bArr5[3] = 67;
                                        parsableByteArray.setPosition(position + 12);
                                        parsableByteArray.readBytes(bArr5, 4, readInt2 - 12);
                                        list = G.n(bArr5);
                                    } else {
                                        if (readInt3 == 1634492771) {
                                            int i16 = readInt2 - 12;
                                            byte[] bArr6 = new byte[i16];
                                            parsableByteArray.setPosition(position + 12);
                                            parsableByteArray.readBytes(bArr6, 0, i16);
                                            Pair<Integer, Integer> parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                            readUnsignedFixedPoint1616 = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                                            readUnsignedShort = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                                            list = G.n(bArr6);
                                        } else if (readInt3 == 1767990114) {
                                            parsableByteArray.setPosition(position + 9);
                                            int readUnsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                            byte[] bArr7 = new byte[readUnsignedLeb128ToInt];
                                            parsableByteArray.readBytes(bArr7, 0, readUnsignedLeb128ToInt);
                                            String buildIamfCodecString = CodecSpecificDataUtil.buildIamfCodecString(bArr7);
                                            i0 n2 = G.n(bArr7);
                                            str6 = buildIamfCodecString;
                                            list = n2;
                                        } else if (readInt3 == 1885564227) {
                                            parsableByteArray.setPosition(position + 12);
                                            ByteOrder byteOrder = (parsableByteArray.readUnsignedByte() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                            if (i12 == 1768973165) {
                                                i10 = Util.getPcmEncoding(readUnsignedByte3, byteOrder);
                                                i11 = -1;
                                            } else {
                                                if (i12 == 1718641517 && readUnsignedByte3 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                                    i10 = 4;
                                                    i11 = -1;
                                                }
                                                i10 = i14;
                                                i11 = -1;
                                            }
                                            i14 = i10;
                                            if (i10 != i11) {
                                                str3 = "audio/raw";
                                            }
                                        }
                                        str6 = str9;
                                    }
                                    str6 = str9;
                                }
                                position += readInt2;
                                str7 = str4;
                                str8 = str6;
                                i13 = i3;
                            }
                        }
                        str6 = str9;
                        position += readInt2;
                        str7 = str4;
                        str8 = str6;
                        i13 = i3;
                    }
                    String str10 = str8;
                    if (stsdData.format != null || str3 == null) {
                        return;
                    }
                    Format.Builder language = new Format.Builder().setId(i4).setSampleMimeType(str3).setCodecs(str10).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i14).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
                    if (esdsData != null) {
                        language.setAverageBitrate(com.google.common.primitives.c.f(esdsData.bitrate)).setPeakBitrate(com.google.common.primitives.c.f(esdsData.peakBitrate));
                    } else if (btrtData != null) {
                        language.setAverageBitrate(com.google.common.primitives.c.f(btrtData.avgBitrate)).setPeakBitrate(com.google.common.primitives.c.f(btrtData.maxBitrate));
                    }
                    stsdData.format = language.build();
                    return;
                }
                i9 = i7;
                str3 = "audio/raw";
                int i142 = i9;
                List<byte[]> list2 = null;
                String str82 = null;
                EsdsData esdsData2 = null;
                BtrtData btrtData2 = null;
                while (position - i2 < i13) {
                }
                String str102 = str82;
                if (stsdData.format != null) {
                    return;
                } else {
                    return;
                }
            }
            str2 = "audio/amr-wb";
        }
        String str11 = str2;
        i9 = i8;
        str3 = str11;
        int i1422 = i9;
        List<byte[]> list22 = null;
        String str822 = null;
        EsdsData esdsData22 = null;
        BtrtData btrtData22 = null;
        while (position - i2 < i13) {
        }
        String str1022 = str822;
        if (stsdData.format != null) {
        }
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean readBit = parsableBitArray.readBit();
        boolean readBit2 = parsableBitArray.readBit();
        if (readBits == 2 && readBit) {
            builder.setLumaBitdepth(readBit2 ? 12 : 10);
            builder.setChromaBitdepth(readBit2 ? 12 : 10);
        } else if (readBits <= 2) {
            builder.setLumaBitdepth(readBit ? 10 : 8);
            builder.setChromaBitdepth(readBit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int readBits2 = parsableBitArray.readBits(4);
        if (readBits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + readBits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean readBit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (readBit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int readBits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int readBits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= readBits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int readBits5 = parsableBitArray.readBits(4);
        int readBits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(readBits5 + 1);
        parsableBitArray.skipBits(readBits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean readBit4 = parsableBitArray.readBit();
        if (readBit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (readBit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean readBit5 = parsableBitArray.readBit();
        if (readBits3 == 2 && readBit5) {
            parsableBitArray.skipBit();
        }
        if (readBits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int readBits7 = parsableBitArray.readBits(8);
            int readBits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits7)).setColorRange(((z || readBits7 != 1 || readBits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8));
        }
        return builder.build();
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i4 = -1;
        int i5 = 0;
        String str = null;
        Integer num = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i4 = i3;
                i5 = readInt;
            }
            i3 += readInt;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1701606260);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i = 0; i < readUnsignedIntToInt; i++) {
            jArr[i] = parseFullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = parseFullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        if (j <= 0) {
            j = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j, readUnsignedInt > 0 ? readUnsignedInt : -1L);
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

    public static int parseFullBoxFlags(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
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

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long readUnsignedInt2 = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt2 != 0) {
                    long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedInt2, 1000000L, readUnsignedInt);
                    readUnsignedInt = readUnsignedInt;
                    j = scaleLargeTimestamp;
                }
            } else {
                i2++;
            }
        }
        return new MdhdData(readUnsignedInt, j, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1751411826);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(1801812339);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                androidx.compose.runtime.collection.a.c(readInt4, "Skipped metadata with unknown key index: ", TAG);
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, readInt + i3);
            }
            i3 += readInt;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    @Nullable
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
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullBoxVersion == 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        long[] jArr;
        int[] iArr2;
        long j;
        long j2;
        int i10;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        int i11;
        int[] iArr5;
        int i12;
        ?? r8;
        int i13;
        Track track2 = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1937011578);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, track2.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(1937013298);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (track2.type == 2) {
            long j3 = track2.mediaDurationUs;
            if (j3 > 0) {
                track2 = track2.copyWithFormat(track2.format.buildUpon().setFrameRate(sampleCount / (j3 / 1000000.0f)).build());
            }
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(1937007471);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1668232756));
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1937011827))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i3 = parsableByteArray4.readUnsignedIntToInt();
            if (i3 > 0) {
                i2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                i4 = 0;
            } else {
                i2 = -1;
                i4 = 0;
                parsableByteArray4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
            i4 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track2.format.sampleMimeType;
        if (((fixedSampleSize == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && readUnsignedIntToInt == 0 && i == 0 && i3 == 0)) ? i4 : 1) != 0) {
            int i14 = chunkIterator.length;
            long[] jArr3 = new long[i14];
            int[] iArr6 = new int[i14];
            while (chunkIterator.moveNext()) {
                int i15 = chunkIterator.index;
                jArr3[i15] = chunkIterator.offset;
                iArr6[i15] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr3, iArr6, readUnsignedIntToInt3);
            long[] jArr4 = rechunk.offsets;
            int[] iArr7 = rechunk.sizes;
            int i16 = rechunk.maximumSize;
            long[] jArr5 = rechunk.timestamps;
            int[] iArr8 = rechunk.flags;
            long j4 = rechunk.duration;
            j2 = rechunk.totalSize;
            j = j4;
            i5 = 1;
            jArr = jArr5;
            iArr2 = iArr8;
            i10 = i16;
            iArr3 = iArr7;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[sampleCount];
            int[] iArr9 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            i5 = 1;
            int[] iArr10 = new int[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
            int i17 = readUnsignedIntToInt3;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            long j5 = 0;
            long j6 = 0;
            int i18 = i;
            int i19 = i2;
            int i20 = i4;
            int i21 = i20;
            int i22 = i21;
            int i23 = i22;
            int i24 = readUnsignedIntToInt2;
            long j7 = 0;
            int i25 = readUnsignedIntToInt;
            int i26 = i3;
            int i27 = i23;
            while (true) {
                if (i20 >= sampleCount) {
                    i6 = i25;
                    i7 = i24;
                    iArr = iArr9;
                    i8 = i22;
                    break;
                }
                long j8 = j6;
                int i28 = i22;
                boolean z2 = true;
                while (i28 == 0) {
                    z2 = chunkIterator.moveNext();
                    if (!z2) {
                        break;
                    }
                    int i29 = i25;
                    long j9 = chunkIterator.offset;
                    i28 = chunkIterator.numSamples;
                    j8 = j9;
                    i25 = i29;
                    i24 = i24;
                    sampleCount = sampleCount;
                }
                int i30 = sampleCount;
                i6 = i25;
                i7 = i24;
                if (!z2) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i20);
                    int[] copyOf2 = Arrays.copyOf(iArr9, i20);
                    jArr7 = Arrays.copyOf(jArr7, i20);
                    iArr10 = Arrays.copyOf(iArr10, i20);
                    jArr6 = copyOf;
                    iArr = copyOf2;
                    sampleCount = i20;
                    i8 = i28;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int i31 = i23;
                    while (i31 == 0 && i18 > 0) {
                        i31 = parsableByteArray6.readUnsignedIntToInt();
                        i21 = parsableByteArray6.readInt();
                        i18--;
                    }
                    i23 = i31 - 1;
                }
                jArr6[i20] = j8;
                int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr9[i20] = readNextSampleSize;
                j7 += readNextSampleSize;
                if (readNextSampleSize > i27) {
                    i27 = readNextSampleSize;
                }
                jArr7[i20] = j5 + i21;
                iArr10[i20] = parsableByteArray7 == null ? 1 : i4;
                if (i20 == i19) {
                    iArr10[i20] = 1;
                    i26--;
                    if (i26 > 0) {
                        i19 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j5 += i17;
                i24 = i7 - 1;
                if (i24 != 0 || i6 <= 0) {
                    i25 = i6;
                } else {
                    i25 = i6 - 1;
                    i24 = parsableByteArray3.readUnsignedIntToInt();
                    i17 = parsableByteArray3.readInt();
                }
                long j10 = j8 + iArr9[i20];
                i22 = i28 - 1;
                i20++;
                j6 = j10;
                sampleCount = i30;
            }
            long j11 = j5 + i21;
            if (parsableByteArray6 != null) {
                while (i18 > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        i9 = i4;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i18--;
                }
            }
            i9 = 1;
            if (i26 != 0 || i7 != 0 || i8 != 0 || i6 != 0 || i23 != 0 || i9 == 0) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(track2.f47id);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i26);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i7);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i8);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i6);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i23);
                sb.append(i9 == 0 ? ", ctts invalid" : "");
                Log.w(TAG, sb.toString());
            }
            jArr = jArr7;
            iArr2 = iArr10;
            j = j11;
            j2 = j7;
            i10 = i27;
            jArr2 = jArr6;
            iArr3 = iArr;
        }
        long j12 = track2.mediaDurationUs;
        if (j12 > 0) {
            long scaleLargeValue = Util.scaleLargeValue(j2 * 8, 1000000L, j12, RoundingMode.HALF_DOWN);
            if (scaleLargeValue > 0 && scaleLargeValue < SieveCacheKt.NodeLinkMask) {
                track2 = track2.copyWithFormat(track2.format.buildUpon().setAverageBitrate((int) scaleLargeValue).build());
            }
        }
        Track track3 = track2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track3.timescale);
        long[] jArr8 = track3.editListDurations;
        if (jArr8 == null) {
            Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track3.timescale);
            return new TrackSampleTable(track3, jArr2, iArr3, i10, jArr, iArr2, scaleLargeTimestamp);
        }
        int[] iArr11 = iArr2;
        int i32 = i5;
        if (jArr8.length == i32 && track3.type == i32 && jArr.length >= 2) {
            long j13 = ((long[]) Assertions.checkNotNull(track3.editListMediaTimes))[i4];
            long scaleLargeTimestamp2 = j13 + Util.scaleLargeTimestamp(track3.editListDurations[i4], track3.timescale, track3.movieTimescale);
            if (canApplyEditWithGaplessInfo(jArr, j, j13, scaleLargeTimestamp2)) {
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j13 - jArr[i4], track3.format.sampleRate, track3.timescale);
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j - scaleLargeTimestamp2, track3.format.sampleRate, track3.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= SieveCacheKt.NodeLinkMask && scaleLargeTimestamp4 <= SieveCacheKt.NodeLinkMask) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track3.timescale);
                    return new TrackSampleTable(track3, jArr2, iArr3, i10, jArr, iArr11, Util.scaleLargeTimestamp(track3.editListDurations[i4], 1000000L, track3.movieTimescale));
                }
            }
        }
        long[] jArr9 = track3.editListDurations;
        if (jArr9.length == 1 && jArr9[i4] == 0) {
            long j14 = ((long[]) Assertions.checkNotNull(track3.editListMediaTimes))[i4];
            for (int i33 = i4; i33 < jArr.length; i33++) {
                jArr[i33] = Util.scaleLargeTimestamp(jArr[i33] - j14, 1000000L, track3.timescale);
            }
            return new TrackSampleTable(track3, jArr2, iArr3, i10, jArr, iArr11, Util.scaleLargeTimestamp(j - j14, 1000000L, track3.timescale));
        }
        ?? r1 = track3.type == 1 ? 1 : i4;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track3.editListMediaTimes);
        int i34 = i4;
        int i35 = i34;
        int i36 = i35;
        int i37 = i36;
        while (true) {
            long[] jArr11 = track3.editListDurations;
            iArr4 = iArr13;
            if (i34 >= jArr11.length) {
                break;
            }
            int i38 = i34;
            int i39 = i35;
            long j15 = jArr10[i38];
            if (j15 != -1) {
                long j16 = jArr11[i38];
                iArr5 = iArr3;
                i12 = i10;
                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(j16, track3.timescale, track3.movieTimescale);
                i11 = i38;
                iArr12[i11] = Util.binarySearchFloor(jArr, j15, true, true);
                long j17 = j15 + scaleLargeTimestamp5;
                r8 = i4;
                iArr4[i11] = Util.binarySearchCeil(jArr, j17, (boolean) r1, (boolean) r8);
                int i40 = iArr12[i11];
                while (true) {
                    i13 = iArr12[i11];
                    if (i13 < 0 || (iArr11[i13] & 1) != 0) {
                        break;
                    }
                    iArr12[i11] = i13 - 1;
                }
                if (i13 < 0) {
                    iArr12[i11] = i40;
                    while (true) {
                        int i41 = iArr12[i11];
                        if (i41 >= iArr4[i11] || (iArr11[i41] & 1) != 0) {
                            break;
                        }
                        iArr12[i11] = i41 + 1;
                    }
                }
                if (track3.type == 2 && iArr12[i11] != iArr4[i11]) {
                    while (true) {
                        int i42 = iArr4[i11];
                        if (i42 >= jArr.length - 1 || jArr[i42 + 1] > j17) {
                            break;
                        }
                        iArr4[i11] = i42 + 1;
                    }
                }
                int i43 = iArr4[i11];
                int i44 = iArr12[i11];
                i36 += i43 - i44;
                i35 = i39 | (i37 != i44 ? 1 : r8 == true ? 1 : 0);
                i37 = i43;
            } else {
                i11 = i38;
                iArr5 = iArr3;
                i12 = i10;
                r8 = i4;
                i35 = i39;
            }
            i34 = i11 + 1;
            i4 = r8;
            iArr3 = iArr5;
            iArr13 = iArr4;
            i10 = i12;
        }
        int[] iArr14 = iArr3;
        int i45 = i10;
        int i46 = i4;
        int i47 = i35 | (i36 != sampleCount ? 1 : i46);
        long[] jArr12 = i47 != 0 ? new long[i36] : jArr2;
        int[] iArr15 = i47 != 0 ? new int[i36] : iArr14;
        int i48 = i47 != 0 ? i46 : i45;
        int[] iArr16 = i47 != 0 ? new int[i36] : iArr11;
        long[] jArr13 = new long[i36];
        int i49 = i48;
        int i50 = i46;
        int i51 = i50;
        long j18 = 0;
        while (i46 < track3.editListDurations.length) {
            long j19 = track3.editListMediaTimes[i46];
            int i52 = iArr12[i46];
            int i53 = iArr4[i46];
            int i54 = i47;
            if (i47 != 0) {
                int i55 = i53 - i52;
                System.arraycopy(jArr2, i52, jArr12, i51, i55);
                System.arraycopy(iArr14, i52, iArr15, i51, i55);
                System.arraycopy(iArr11, i52, iArr16, i51, i55);
            }
            int i56 = i49;
            while (i52 < i53) {
                long[] jArr14 = jArr12;
                int[] iArr17 = iArr12;
                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j18, 1000000L, track3.movieTimescale);
                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr[i52] - j19, 1000000L, track3.timescale);
                if (scaleLargeTimestamp7 < 0) {
                    i50 = 1;
                }
                jArr13[i51] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                if (i54 != 0 && iArr15[i51] > i56) {
                    i56 = iArr14[i52];
                }
                i51++;
                i52++;
                iArr12 = iArr17;
                jArr12 = jArr14;
            }
            j18 += track3.editListDurations[i46];
            i46++;
            i49 = i56;
            jArr12 = jArr12;
            i47 = i54;
        }
        long[] jArr15 = jArr12;
        long scaleLargeTimestamp8 = Util.scaleLargeTimestamp(j18, 1000000L, track3.movieTimescale);
        if (i50 != 0) {
            track3 = track3.copyWithFormat(track3.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(track3, jArr15, iArr15, i49, jArr13, iArr16, scaleLargeTimestamp8);
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((readUnsignedByte & 1) == 1, (readUnsignedByte & 2) == 2, (readUnsignedByte & 8) == 8));
            }
            position += readInt;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i = 0; i < readInt; i++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241) {
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData.f46id, str, tkhdData.rotationDegrees, drmInitData, stsdData, i);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678 || readInt3 == 1768973165 || readInt3 == 1718641517) {
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData.f46id, str, z, drmInitData, stsdData, i);
            } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672 || readInt3 == 1836070003) {
                StsdData stsdData2 = stsdData;
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, tkhdData, str, stsdData2);
                stsdData = stsdData2;
            } else if (readInt3 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, readInt3, position, tkhdData.f46id, stsdData);
            } else if (readInt3 == 1667329389) {
                stsdData.format = new Format.Builder().setId(tkhdData.f46id).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, TkhdData tkhdData, @Nullable String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        i0 i0Var = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i4 = i3 - 16;
                byte[] bArr = new byte[i4];
                parsableByteArray.readBytes(bArr, 0, i4);
                i0Var = G.n(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i != 1836070003) {
                    throw new IllegalStateException();
                }
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    EsdsData parseEsdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (parseEsdsFromParent.initializationData == null || parseEsdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    i0Var = G.n(Util.getUtf8Bytes(formatVobsubIdx(parseEsdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            stsdData.format = new Format.Builder().setId(tkhdData.f46id).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j).setInitializationData(i0Var).build();
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i = parseFullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long readUnsignedInt = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j = readUnsignedInt;
                }
            } else {
                i2++;
            }
        }
        parsableByteArray.skipBytes(10);
        int i3 = 0;
        long j2 = j;
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && ((readInt4 == -65536 || readInt4 == 65536) && readInt5 == 0)) {
            i3 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && ((readInt4 == 65536 || readInt4 == -65536) && readInt5 == 0)) {
            i3 = 270;
        } else if ((readInt2 == -65536 || readInt2 == 65536) && readInt3 == 0 && readInt4 == 0 && readInt5 == -65536) {
            i3 = 180;
        }
        int i4 = i3;
        parsableByteArray.skipBytes(16);
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        return new TkhdData(readInt, j2, readUnsignedShort, i4, readShort, parsableByteArray.readShort());
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Format format;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> parseEdts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1953196132))).data);
        long j2 = j == -9223372036854775807L ? parseTkhd.duration : j;
        long j3 = parseMvhd(leafBox.data).timescale;
        long scaleLargeTimestamp = j2 != -9223372036854775807L ? Util.scaleLargeTimestamp(j2, 1000000L, j3) : -9223372036854775807L;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212));
        MdhdData parseMdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(1835296868))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(1937011556);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafBoxOfType.data, parseTkhd, parseMdhd.language, drmInitData, z2);
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(1701082227)) == null || (parseEdts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        if (parseTkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(parseTkhd.alternateGroup);
            Format.Builder buildUpon = parseStsd.format.buildUpon();
            Metadata metadata = parseStsd.format.metadata;
            format = buildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            format = parseStsd.format;
        }
        return new Track(parseTkhd.f46id, trackTypeForHdlr, parseMdhd.timescale, j3, scaleLargeTimestamp, parseMdhd.mediaDurationUs, format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j, @Nullable DrmInitData drmInitData, boolean z, boolean z2, f<Track, Track> fVar) throws ParserException {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099 && (apply = fVar.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(1836476516)), j, drmInitData, z, z2))) != null) {
                arrayList.add(parseStbl(apply, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(1835297121))).getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + readInt));
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + readInt));
            } else if (readInt2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    @Nullable
    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        EyesData eyesData = null;
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                eyesData = parseStereoViewBox(parsableByteArray, position, readInt);
            }
            position += readInt;
        }
        if (eyesData == null) {
            return null;
        }
        return new VexuData(eyesData);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r7v26 java.util.List<byte[]>), method size: 1777
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static void parseVideoSampleEntry(androidx.media3.common.util.ParsableByteArray r41, int r42, int r43, int r44, int r45, @androidx.annotation.Nullable java.lang.String r46, int r47, @androidx.annotation.Nullable androidx.media3.common.DrmInitData r48, androidx.media3.extractor.mp4.BoxParser.StsdData r49, int r50) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseVideoSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, int, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = ((i >> 8) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int a = androidx.credentials.exceptions.publickeycredential.a.a(i3, 14075, 10000, i2);
        int i4 = (i & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i5 = (i2 - ((i4 * 3455) / 10000)) - ((i3 * 7169) / 10000);
        int a2 = androidx.credentials.exceptions.publickeycredential.a.a(i4, 17790, 10000, i2);
        return Util.constrainValue(a2, 0, 255) | (Util.constrainValue(a, 0, 255) << 16) | (Util.constrainValue(i5, 0, 255) << 8);
    }
}
