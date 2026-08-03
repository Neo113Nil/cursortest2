package com.google.android.exoplayer2.extractor.ts;

/* loaded from: classes3.dex */
public final class DefaultTsPayloadReaderFactory implements com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final java.util.List<com.google.android.exoplayer2.Format> closedCaptionFormats;
    private final int flags;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, com.google.common.collect.ImmutableList.of());
    }

    public DefaultTsPayloadReaderFactory(int i, java.util.List<com.google.android.exoplayer2.Format> list) {
        this.flags = i;
        this.closedCaptionFormats = list;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public android.util.SparseArray<com.google.android.exoplayer2.extractor.ts.TsPayloadReader> createInitialPayloadReaders() {
        return new android.util.SparseArray<>();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
    public com.google.android.exoplayer2.extractor.ts.TsPayloadReader createPayloadReader(int i, com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.MpegAudioReader(esInfo.language));
            }
            if (i == 21) {
                return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.Id3Reader());
            }
            if (i == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
            }
            if (i == 36) {
                return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.H265Reader(buildSeiReader(esInfo)));
            }
            if (i != 89) {
                if (i != 138) {
                    if (i == 172) {
                        return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.Ac4Reader(esInfo.language));
                    }
                    if (i == 257) {
                        return new com.google.android.exoplayer2.extractor.ts.SectionReader(new com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (!isSet(2)) {
                                        break;
                                    }
                                    break;
                                case 16:
                                    break;
                                case 17:
                                    if (!isSet(2)) {
                                        break;
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 130:
                                            if (!isSet(64)) {
                                            }
                                            break;
                                    }
                            }
                            return null;
                        }
                        return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.Ac3Reader(esInfo.language));
                    }
                    if (isSet(16)) {
                        return null;
                    }
                    return new com.google.android.exoplayer2.extractor.ts.SectionReader(new com.google.android.exoplayer2.extractor.ts.PassthroughSectionPayloadReader("application/x-scte35"));
                }
                return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.DtsReader(esInfo.language));
            }
            return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.DvbSubtitleReader(esInfo.dvbSubtitleInfos));
        }
        return new com.google.android.exoplayer2.extractor.ts.PesReader(new com.google.android.exoplayer2.extractor.ts.H262Reader(buildUserDataReader(esInfo)));
    }

    private com.google.android.exoplayer2.extractor.ts.SeiReader buildSeiReader(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        return new com.google.android.exoplayer2.extractor.ts.SeiReader(getClosedCaptionFormats(esInfo));
    }

    private com.google.android.exoplayer2.extractor.ts.UserDataReader buildUserDataReader(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        return new com.google.android.exoplayer2.extractor.ts.UserDataReader(getClosedCaptionFormats(esInfo));
    }

    private java.util.List<com.google.android.exoplayer2.Format> getClosedCaptionFormats(com.google.android.exoplayer2.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        java.lang.String str;
        int i;
        java.util.List<byte[]> list;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(esInfo.descriptorBytes);
        java.util.List<com.google.android.exoplayer2.Format> list2 = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (readUnsignedByte == 134) {
                list2 = new java.util.ArrayList<>();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                    java.lang.String readString = parsableByteArray.readString(3);
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z = (readUnsignedByte3 & 128) != 0;
                    if (z) {
                        i = readUnsignedByte3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte readUnsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (z) {
                        list = com.google.android.exoplayer2.util.CodecSpecificDataUtil.buildCea708InitializationData((readUnsignedByte4 & com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO) != 0);
                    } else {
                        list = null;
                    }
                    list2.add(new com.google.android.exoplayer2.Format.Builder().setSampleMimeType(str).setLanguage(readString).setAccessibilityChannel(i).setInitializationData(list).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return list2;
    }

    private boolean isSet(int i) {
        return (i & this.flags) != 0;
    }
}
