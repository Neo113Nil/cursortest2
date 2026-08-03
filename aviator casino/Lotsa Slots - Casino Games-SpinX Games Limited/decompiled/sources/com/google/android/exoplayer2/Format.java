package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class Format implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_ACCESSIBILITY_CHANNEL = 28;
    private static final int FIELD_AVERAGE_BITRATE = 5;
    private static final int FIELD_CHANNEL_COUNT = 23;
    private static final int FIELD_CODECS = 7;
    private static final int FIELD_COLOR_INFO = 22;
    private static final int FIELD_CONTAINER_MIME_TYPE = 9;
    private static final int FIELD_CRYPTO_TYPE = 29;
    private static final int FIELD_DRM_INIT_DATA = 13;
    private static final int FIELD_ENCODER_DELAY = 26;
    private static final int FIELD_ENCODER_PADDING = 27;
    private static final int FIELD_FRAME_RATE = 17;
    private static final int FIELD_HEIGHT = 16;
    private static final int FIELD_ID = 0;
    private static final int FIELD_INITIALIZATION_DATA = 12;
    private static final int FIELD_LABEL = 1;
    private static final int FIELD_LANGUAGE = 2;
    private static final int FIELD_MAX_INPUT_SIZE = 11;
    private static final int FIELD_METADATA = 8;
    private static final int FIELD_PCM_ENCODING = 25;
    private static final int FIELD_PEAK_BITRATE = 6;
    private static final int FIELD_PIXEL_WIDTH_HEIGHT_RATIO = 19;
    private static final int FIELD_PROJECTION_DATA = 20;
    private static final int FIELD_ROLE_FLAGS = 4;
    private static final int FIELD_ROTATION_DEGREES = 18;
    private static final int FIELD_SAMPLE_MIME_TYPE = 10;
    private static final int FIELD_SAMPLE_RATE = 24;
    private static final int FIELD_SELECTION_FLAGS = 3;
    private static final int FIELD_STEREO_MODE = 21;
    private static final int FIELD_SUBSAMPLE_OFFSET_US = 14;
    private static final int FIELD_WIDTH = 15;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final java.lang.String codecs;
    public final com.google.android.exoplayer2.video.ColorInfo colorInfo;
    public final java.lang.String containerMimeType;
    public final int cryptoType;
    public final com.google.android.exoplayer2.drm.DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    public final java.lang.String id;
    public final java.util.List<byte[]> initializationData;
    public final java.lang.String label;
    public final java.lang.String language;
    public final int maxInputSize;
    public final com.google.android.exoplayer2.metadata.Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final java.lang.String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;
    private static final com.google.android.exoplayer2.Format DEFAULT = new com.google.android.exoplayer2.Format.Builder().build();
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Format> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.Format fromBundle;
            fromBundle = com.google.android.exoplayer2.Format.fromBundle(bundle);
            return fromBundle;
        }
    };

    private static <T> T defaultIfNull(T t, T t2) {
        return t != null ? t : t2;
    }

    public static final class Builder {
        private int accessibilityChannel;
        private int averageBitrate;
        private int channelCount;
        private java.lang.String codecs;
        private com.google.android.exoplayer2.video.ColorInfo colorInfo;
        private java.lang.String containerMimeType;
        private int cryptoType;
        private com.google.android.exoplayer2.drm.DrmInitData drmInitData;
        private int encoderDelay;
        private int encoderPadding;
        private float frameRate;
        private int height;
        private java.lang.String id;
        private java.util.List<byte[]> initializationData;
        private java.lang.String label;
        private java.lang.String language;
        private int maxInputSize;
        private com.google.android.exoplayer2.metadata.Metadata metadata;
        private int pcmEncoding;
        private int peakBitrate;
        private float pixelWidthHeightRatio;
        private byte[] projectionData;
        private int roleFlags;
        private int rotationDegrees;
        private java.lang.String sampleMimeType;
        private int sampleRate;
        private int selectionFlags;
        private int stereoMode;
        private long subsampleOffsetUs;
        private int width;

        public Builder() {
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cryptoType = 0;
        }

        private Builder(com.google.android.exoplayer2.Format format) {
            this.id = format.id;
            this.label = format.label;
            this.language = format.language;
            this.selectionFlags = format.selectionFlags;
            this.roleFlags = format.roleFlags;
            this.averageBitrate = format.averageBitrate;
            this.peakBitrate = format.peakBitrate;
            this.codecs = format.codecs;
            this.metadata = format.metadata;
            this.containerMimeType = format.containerMimeType;
            this.sampleMimeType = format.sampleMimeType;
            this.maxInputSize = format.maxInputSize;
            this.initializationData = format.initializationData;
            this.drmInitData = format.drmInitData;
            this.subsampleOffsetUs = format.subsampleOffsetUs;
            this.width = format.width;
            this.height = format.height;
            this.frameRate = format.frameRate;
            this.rotationDegrees = format.rotationDegrees;
            this.pixelWidthHeightRatio = format.pixelWidthHeightRatio;
            this.projectionData = format.projectionData;
            this.stereoMode = format.stereoMode;
            this.colorInfo = format.colorInfo;
            this.channelCount = format.channelCount;
            this.sampleRate = format.sampleRate;
            this.pcmEncoding = format.pcmEncoding;
            this.encoderDelay = format.encoderDelay;
            this.encoderPadding = format.encoderPadding;
            this.accessibilityChannel = format.accessibilityChannel;
            this.cryptoType = format.cryptoType;
        }

        public com.google.android.exoplayer2.Format.Builder setId(java.lang.String str) {
            this.id = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setId(int i) {
            this.id = java.lang.Integer.toString(i);
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setLabel(java.lang.String str) {
            this.label = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setLanguage(java.lang.String str) {
            this.language = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setSelectionFlags(int i) {
            this.selectionFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setRoleFlags(int i) {
            this.roleFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setAverageBitrate(int i) {
            this.averageBitrate = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setPeakBitrate(int i) {
            this.peakBitrate = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setCodecs(java.lang.String str) {
            this.codecs = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setContainerMimeType(java.lang.String str) {
            this.containerMimeType = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setSampleMimeType(java.lang.String str) {
            this.sampleMimeType = str;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setMaxInputSize(int i) {
            this.maxInputSize = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setInitializationData(java.util.List<byte[]> list) {
            this.initializationData = list;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setDrmInitData(com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
            this.drmInitData = drmInitData;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setSubsampleOffsetUs(long j) {
            this.subsampleOffsetUs = j;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setFrameRate(float f) {
            this.frameRate = f;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setRotationDegrees(int i) {
            this.rotationDegrees = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setProjectionData(byte[] bArr) {
            this.projectionData = bArr;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setStereoMode(int i) {
            this.stereoMode = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setColorInfo(com.google.android.exoplayer2.video.ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setChannelCount(int i) {
            this.channelCount = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setSampleRate(int i) {
            this.sampleRate = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setPcmEncoding(int i) {
            this.pcmEncoding = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setEncoderDelay(int i) {
            this.encoderDelay = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setEncoderPadding(int i) {
            this.encoderPadding = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setAccessibilityChannel(int i) {
            this.accessibilityChannel = i;
            return this;
        }

        public com.google.android.exoplayer2.Format.Builder setCryptoType(int i) {
            this.cryptoType = i;
            return this;
        }

        public com.google.android.exoplayer2.Format build() {
            return new com.google.android.exoplayer2.Format(this);
        }
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createVideoSampleFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, float f, java.util.List<byte[]> list, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i3).setHeight(i4).setFrameRate(f).build();
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createVideoSampleFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, float f, java.util.List<byte[]> list, int i5, float f2, com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setWidth(i3).setHeight(i4).setFrameRate(f).setRotationDegrees(i5).setPixelWidthHeightRatio(f2).build();
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createAudioSampleFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, java.util.List<byte[]> list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, int i5, java.lang.String str4) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setLanguage(str4).setSelectionFlags(i5).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i3).setSampleRate(i4).build();
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createAudioSampleFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, int i3, int i4, int i5, java.util.List<byte[]> list, com.google.android.exoplayer2.drm.DrmInitData drmInitData, int i6, java.lang.String str4) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setLanguage(str4).setSelectionFlags(i6).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str3).setSampleMimeType(str2).setMaxInputSize(i2).setInitializationData(list).setDrmInitData(drmInitData).setChannelCount(i3).setSampleRate(i4).setPcmEncoding(i5).build();
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createContainerFormat(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, int i3, java.lang.String str6) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setLabel(str2).setLanguage(str6).setSelectionFlags(i2).setRoleFlags(i3).setAverageBitrate(i).setPeakBitrate(i).setCodecs(str5).setContainerMimeType(str3).setSampleMimeType(str4).build();
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.Format createSampleFormat(java.lang.String str, java.lang.String str2) {
        return new com.google.android.exoplayer2.Format.Builder().setId(str).setSampleMimeType(str2).build();
    }

    private Format(com.google.android.exoplayer2.Format.Builder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.language = com.google.android.exoplayer2.util.Util.normalizeLanguageCode(builder.language);
        this.selectionFlags = builder.selectionFlags;
        this.roleFlags = builder.roleFlags;
        int i = builder.averageBitrate;
        this.averageBitrate = i;
        int i2 = builder.peakBitrate;
        this.peakBitrate = i2;
        this.bitrate = i2 != -1 ? i2 : i;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.initializationData = builder.initializationData == null ? java.util.Collections.emptyList() : builder.initializationData;
        com.google.android.exoplayer2.drm.DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.width = builder.width;
        this.height = builder.height;
        this.frameRate = builder.frameRate;
        this.rotationDegrees = builder.rotationDegrees == -1 ? 0 : builder.rotationDegrees;
        this.pixelWidthHeightRatio = builder.pixelWidthHeightRatio == -1.0f ? 1.0f : builder.pixelWidthHeightRatio;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        this.encoderDelay = builder.encoderDelay == -1 ? 0 : builder.encoderDelay;
        this.encoderPadding = builder.encoderPadding != -1 ? builder.encoderPadding : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        if (builder.cryptoType != 0 || drmInitData == null) {
            this.cryptoType = builder.cryptoType;
        } else {
            this.cryptoType = 1;
        }
    }

    public com.google.android.exoplayer2.Format.Builder buildUpon() {
        return new com.google.android.exoplayer2.Format.Builder();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithMaxInputSize(int i) {
        return buildUpon().setMaxInputSize(i).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithSubsampleOffsetUs(long j) {
        return buildUpon().setSubsampleOffsetUs(j).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithLabel(java.lang.String str) {
        return buildUpon().setLabel(str).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithManifestFormatInfo(com.google.android.exoplayer2.Format format) {
        return withManifestFormatInfo(format);
    }

    public com.google.android.exoplayer2.Format withManifestFormatInfo(com.google.android.exoplayer2.Format format) {
        java.lang.String str;
        com.google.android.exoplayer2.metadata.Metadata copyWithAppendedEntriesFrom;
        if (this == format) {
            return this;
        }
        int trackType = com.google.android.exoplayer2.util.MimeTypes.getTrackType(this.sampleMimeType);
        java.lang.String str2 = format.id;
        java.lang.String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        java.lang.String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i = this.averageBitrate;
        if (i == -1) {
            i = format.averageBitrate;
        }
        int i2 = this.peakBitrate;
        if (i2 == -1) {
            i2 = format.peakBitrate;
        }
        java.lang.String str5 = this.codecs;
        if (str5 == null) {
            java.lang.String codecsOfType = com.google.android.exoplayer2.util.Util.getCodecsOfType(format.codecs, trackType);
            if (com.google.android.exoplayer2.util.Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        com.google.android.exoplayer2.metadata.Metadata metadata = this.metadata;
        if (metadata == null) {
            copyWithAppendedEntriesFrom = format.metadata;
        } else {
            copyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(format.metadata);
        }
        float f = this.frameRate;
        if (f == -1.0f && trackType == 2) {
            f = format.frameRate;
        }
        int i3 = this.selectionFlags | format.selectionFlags;
        return buildUpon().setId(str2).setLabel(str3).setLanguage(str4).setSelectionFlags(i3).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i).setPeakBitrate(i2).setCodecs(str5).setMetadata(copyWithAppendedEntriesFrom).setDrmInitData(com.google.android.exoplayer2.drm.DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithGaplessInfo(int i, int i2) {
        return buildUpon().setEncoderDelay(i).setEncoderPadding(i2).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithFrameRate(float f) {
        return buildUpon().setFrameRate(f).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithDrmInitData(com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        return buildUpon().setDrmInitData(drmInitData).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithMetadata(com.google.android.exoplayer2.metadata.Metadata metadata) {
        return buildUpon().setMetadata(metadata).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithBitrate(int i) {
        return buildUpon().setAverageBitrate(i).setPeakBitrate(i).build();
    }

    @java.lang.Deprecated
    public com.google.android.exoplayer2.Format copyWithVideoSize(int i, int i2) {
        return buildUpon().setWidth(i).setHeight(i2).build();
    }

    public com.google.android.exoplayer2.Format copyWithCryptoType(int i) {
        return buildUpon().setCryptoType(i).build();
    }

    public int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public java.lang.String toString() {
        return "Format(" + this.id + ", " + this.label + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.codecs + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + "], [" + this.channelCount + ", " + this.sampleRate + "])";
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.id;
            int hashCode = (com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.label;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            java.lang.String str3 = this.language;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            java.lang.String str4 = this.codecs;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            com.google.android.exoplayer2.metadata.Metadata metadata = this.metadata;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            java.lang.String str5 = this.containerMimeType;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            java.lang.String str6 = this.sampleMimeType;
            this.hashCode = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + java.lang.Float.floatToIntBits(this.frameRate)) * 31) + this.rotationDegrees) * 31) + java.lang.Float.floatToIntBits(this.pixelWidthHeightRatio)) * 31) + this.stereoMode) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.Format format = (com.google.android.exoplayer2.Format) obj;
        int i2 = this.hashCode;
        return (i2 == 0 || (i = format.hashCode) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.cryptoType == format.cryptoType && java.lang.Float.compare(this.frameRate, format.frameRate) == 0 && java.lang.Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && com.google.android.exoplayer2.util.Util.areEqual(this.id, format.id) && com.google.android.exoplayer2.util.Util.areEqual(this.label, format.label) && com.google.android.exoplayer2.util.Util.areEqual(this.codecs, format.codecs) && com.google.android.exoplayer2.util.Util.areEqual(this.containerMimeType, format.containerMimeType) && com.google.android.exoplayer2.util.Util.areEqual(this.sampleMimeType, format.sampleMimeType) && com.google.android.exoplayer2.util.Util.areEqual(this.language, format.language) && java.util.Arrays.equals(this.projectionData, format.projectionData) && com.google.android.exoplayer2.util.Util.areEqual(this.metadata, format.metadata) && com.google.android.exoplayer2.util.Util.areEqual(this.colorInfo, format.colorInfo) && com.google.android.exoplayer2.util.Util.areEqual(this.drmInitData, format.drmInitData) && initializationDataEquals(format);
    }

    public boolean initializationDataEquals(com.google.android.exoplayer2.Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!java.util.Arrays.equals(this.initializationData.get(i), format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String toLogString(com.google.android.exoplayer2.Format format) {
        if (format == null) {
            return kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("id=");
        sb.append(format.id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.codecs != null) {
            sb.append(", codecs=");
            sb.append(format.codecs);
        }
        if (format.drmInitData != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i = 0; i < format.drmInitData.schemeDataCount; i++) {
                java.util.UUID uuid = format.drmInitData.get(i).uuid;
                if (uuid.equals(com.google.android.exoplayer2.C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(com.google.android.exoplayer2.C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(com.google.android.exoplayer2.C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(com.google.android.exoplayer2.C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(com.google.android.exoplayer2.C.UUID_NIL)) {
                    linkedHashSet.add(com.unity3d.ads.core.data.model.exception.GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            sb.append(", drm=[");
            com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).appendTo(sb, (java.lang.Iterable<? extends java.lang.Object>) linkedHashSet);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        if (format.label != null) {
            sb.append(", label=");
            sb.append(format.label);
        }
        if (format.selectionFlags != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if ((format.selectionFlags & 4) != 0) {
                arrayList.add("auto");
            }
            if ((format.selectionFlags & 1) != 0) {
                arrayList.add(com.unity3d.ads.BuildConfig.FLAVOR);
            }
            if ((format.selectionFlags & 2) != 0) {
                arrayList.add("forced");
            }
            sb.append(", selectionFlags=[");
            com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).appendTo(sb, (java.lang.Iterable<? extends java.lang.Object>) arrayList);
            sb.append(com.ironsource.X3.j.e);
        }
        if (format.roleFlags != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if ((format.roleFlags & 1) != 0) {
                arrayList2.add(com.ironsource.X3.i.Z);
            }
            if ((format.roleFlags & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((format.roleFlags & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((format.roleFlags & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((format.roleFlags & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((format.roleFlags & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((format.roleFlags & 64) != 0) {
                arrayList2.add(com.facebook.share.internal.ShareConstants.FEED_CAPTION_PARAM);
            }
            if ((format.roleFlags & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((format.roleFlags & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((format.roleFlags & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((format.roleFlags & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((format.roleFlags & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((format.roleFlags & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((format.roleFlags & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((format.roleFlags & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            sb.append(", roleFlags=[");
            com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA).appendTo(sb, (java.lang.Iterable<? extends java.lang.Object>) arrayList2);
            sb.append(com.ironsource.X3.j.e);
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        return toBundle(false);
    }

    public android.os.Bundle toBundle(boolean z) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(keyForField(0), this.id);
        bundle.putString(keyForField(1), this.label);
        bundle.putString(keyForField(2), this.language);
        bundle.putInt(keyForField(3), this.selectionFlags);
        bundle.putInt(keyForField(4), this.roleFlags);
        bundle.putInt(keyForField(5), this.averageBitrate);
        bundle.putInt(keyForField(6), this.peakBitrate);
        bundle.putString(keyForField(7), this.codecs);
        if (!z) {
            bundle.putParcelable(keyForField(8), this.metadata);
        }
        bundle.putString(keyForField(9), this.containerMimeType);
        bundle.putString(keyForField(10), this.sampleMimeType);
        bundle.putInt(keyForField(11), this.maxInputSize);
        for (int i = 0; i < this.initializationData.size(); i++) {
            bundle.putByteArray(keyForInitializationData(i), this.initializationData.get(i));
        }
        bundle.putParcelable(keyForField(13), this.drmInitData);
        bundle.putLong(keyForField(14), this.subsampleOffsetUs);
        bundle.putInt(keyForField(15), this.width);
        bundle.putInt(keyForField(16), this.height);
        bundle.putFloat(keyForField(17), this.frameRate);
        bundle.putInt(keyForField(18), this.rotationDegrees);
        bundle.putFloat(keyForField(19), this.pixelWidthHeightRatio);
        bundle.putByteArray(keyForField(20), this.projectionData);
        bundle.putInt(keyForField(21), this.stereoMode);
        if (this.colorInfo != null) {
            bundle.putBundle(keyForField(22), this.colorInfo.toBundle());
        }
        bundle.putInt(keyForField(23), this.channelCount);
        bundle.putInt(keyForField(24), this.sampleRate);
        bundle.putInt(keyForField(25), this.pcmEncoding);
        bundle.putInt(keyForField(26), this.encoderDelay);
        bundle.putInt(keyForField(27), this.encoderPadding);
        bundle.putInt(keyForField(28), this.accessibilityChannel);
        bundle.putInt(keyForField(29), this.cryptoType);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.Format fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.Format.Builder builder = new com.google.android.exoplayer2.Format.Builder();
        com.google.android.exoplayer2.util.BundleableUtil.ensureClassLoader(bundle);
        int i = 0;
        java.lang.String string = bundle.getString(keyForField(0));
        com.google.android.exoplayer2.Format format = DEFAULT;
        builder.setId((java.lang.String) defaultIfNull(string, format.id)).setLabel((java.lang.String) defaultIfNull(bundle.getString(keyForField(1)), format.label)).setLanguage((java.lang.String) defaultIfNull(bundle.getString(keyForField(2)), format.language)).setSelectionFlags(bundle.getInt(keyForField(3), format.selectionFlags)).setRoleFlags(bundle.getInt(keyForField(4), format.roleFlags)).setAverageBitrate(bundle.getInt(keyForField(5), format.averageBitrate)).setPeakBitrate(bundle.getInt(keyForField(6), format.peakBitrate)).setCodecs((java.lang.String) defaultIfNull(bundle.getString(keyForField(7)), format.codecs)).setMetadata((com.google.android.exoplayer2.metadata.Metadata) defaultIfNull((com.google.android.exoplayer2.metadata.Metadata) bundle.getParcelable(keyForField(8)), format.metadata)).setContainerMimeType((java.lang.String) defaultIfNull(bundle.getString(keyForField(9)), format.containerMimeType)).setSampleMimeType((java.lang.String) defaultIfNull(bundle.getString(keyForField(10)), format.sampleMimeType)).setMaxInputSize(bundle.getInt(keyForField(11), format.maxInputSize));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(keyForInitializationData(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        com.google.android.exoplayer2.Format.Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((com.google.android.exoplayer2.drm.DrmInitData) bundle.getParcelable(keyForField(13)));
        java.lang.String keyForField = keyForField(14);
        com.google.android.exoplayer2.Format format2 = DEFAULT;
        drmInitData.setSubsampleOffsetUs(bundle.getLong(keyForField, format2.subsampleOffsetUs)).setWidth(bundle.getInt(keyForField(15), format2.width)).setHeight(bundle.getInt(keyForField(16), format2.height)).setFrameRate(bundle.getFloat(keyForField(17), format2.frameRate)).setRotationDegrees(bundle.getInt(keyForField(18), format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(keyForField(19), format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(keyForField(20))).setStereoMode(bundle.getInt(keyForField(21), format2.stereoMode));
        android.os.Bundle bundle2 = bundle.getBundle(keyForField(22));
        if (bundle2 != null) {
            builder.setColorInfo(com.google.android.exoplayer2.video.ColorInfo.CREATOR.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(keyForField(23), format2.channelCount)).setSampleRate(bundle.getInt(keyForField(24), format2.sampleRate)).setPcmEncoding(bundle.getInt(keyForField(25), format2.pcmEncoding)).setEncoderDelay(bundle.getInt(keyForField(26), format2.encoderDelay)).setEncoderPadding(bundle.getInt(keyForField(27), format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(keyForField(28), format2.accessibilityChannel)).setCryptoType(bundle.getInt(keyForField(29), format2.cryptoType));
        return builder.build();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static java.lang.String keyForInitializationData(int i) {
        return keyForField(12) + "_" + java.lang.Integer.toString(i, 36);
    }
}
