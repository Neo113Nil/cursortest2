package androidx.media3.common;

/* loaded from: classes7.dex */
public final class Format {
    public static final int CUE_REPLACEMENT_BEHAVIOR_MERGE = 1;
    public static final int CUE_REPLACEMENT_BEHAVIOR_REPLACE = 2;
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int auxiliaryTrackType;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final java.lang.String codecs;
    public final androidx.media3.common.ColorInfo colorInfo;
    public final java.lang.String containerMimeType;
    public final int cryptoType;
    public final int cueReplacementBehavior;
    public final java.lang.Object customData;
    public final int decodedHeight;
    public final int decodedWidth;
    public final androidx.media3.common.DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    private int exchange;
    public final float frameRate;
    public final boolean hasPrerollSamples;
    public final int height;
    public final java.lang.String id;
    public final java.util.List<byte[]> initializationData;
    public final java.lang.String label;
    public final java.util.List<androidx.media3.common.Label> labels;
    public final java.lang.String language;
    public final int maxInputSize;
    public final int maxNumReorderSamples;
    public final int maxSubLayers;
    public final androidx.media3.common.Metadata metadata;
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
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;
    private static final androidx.media3.common.Format getHighSpeedVideoFpsRangesFor = new androidx.media3.common.Format.Builder().build();
    private static final java.lang.String toString = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String isOutputSupportedForhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String coroutineBoundary = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String c = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2738a = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String CoroutineDebuggingKt = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String AMEXKernela = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(9);
    private static final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(10);
    private static final java.lang.String accessartificialFrame = androidx.media3.common.util.Util.intToStringMaxRadix(11);
    private static final java.lang.String unwrapAs = androidx.media3.common.util.Util.intToStringMaxRadix(12);
    private static final java.lang.String getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(13);
    private static final java.lang.String init = androidx.media3.common.util.Util.intToStringMaxRadix(14);
    private static final java.lang.String release = androidx.media3.common.util.Util.intToStringMaxRadix(15);
    private static final java.lang.String isOutputSupportedFor = androidx.media3.common.util.Util.intToStringMaxRadix(16);
    private static final java.lang.String getOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(17);
    private static final java.lang.String b = androidx.media3.common.util.Util.intToStringMaxRadix(18);
    private static final java.lang.String _CREATION = androidx.media3.common.util.Util.intToStringMaxRadix(19);
    private static final java.lang.String _BOUNDARY = androidx.media3.common.util.Util.intToStringMaxRadix(20);
    private static final java.lang.String kernelVersion = androidx.media3.common.util.Util.intToStringMaxRadix(21);
    private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(22);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(23);
    private static final java.lang.String AMEXKernel = androidx.media3.common.util.Util.intToStringMaxRadix(24);
    private static final java.lang.String coroutineCreation = androidx.media3.common.util.Util.intToStringMaxRadix(25);
    private static final java.lang.String getOutputStallDuration = androidx.media3.common.util.Util.intToStringMaxRadix(26);
    private static final java.lang.String getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(27);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(28);
    private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(29);
    private static final java.lang.String d = androidx.media3.common.util.Util.intToStringMaxRadix(30);
    private static final java.lang.String resetTransaction = androidx.media3.common.util.Util.intToStringMaxRadix(31);
    private static final java.lang.String getValidOutputFormatsForInputhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(32);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(33);
    private static final java.lang.String ArtificialStackFrames = androidx.media3.common.util.Util.intToStringMaxRadix(34);
    private static final java.lang.String getOutputStallDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(35);
    private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(36);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CueReplacementBehavior {
    }

    /* synthetic */ Format(androidx.media3.common.Format.Builder builder, byte b2) {
        this(builder);
    }

    public static final class Builder {
        private int AMEXKernel;
        private int AMEXKernela;
        private int ArtificialStackFrames;
        private int Camera2StreamConfigurationMap;
        private java.util.List<androidx.media3.common.Label> CoroutineDebuggingKt;
        private int _BOUNDARY;
        private androidx.media3.common.Metadata _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private float f2739a;
        private java.lang.String accessartificialFrame;
        private int b;
        private byte[] c;
        private int coroutineBoundary;
        private java.lang.String coroutineCreation;
        private int d;
        private int exchange;
        private int getARTIFICIAL_FRAME_PACKAGE_NAME;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private java.lang.Object getInputSizeshNQ4ISI;
        private java.lang.String getOutputFormats;
        private androidx.media3.common.ColorInfo getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private androidx.media3.common.DrmInitData getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private boolean getValidOutputFormatsForInputhNQ4ISI;
        private int init;
        private java.util.List<byte[]> isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private java.lang.String kernelVersion;
        private long release;
        private int requestPINEntry;
        private int resetTransaction;
        private int startTransaction;
        private java.lang.String toString;
        private float unwrapAs;

        /* synthetic */ Builder(androidx.media3.common.Format format, byte b) {
            this(format);
        }

        public Builder() {
            this.CoroutineDebuggingKt = com.google.common.collect.ImmutableList.of();
            this.getHighSpeedVideoSizes = -1;
            this.b = -1;
            this.ArtificialStackFrames = -1;
            this.coroutineBoundary = -1;
            this.release = Long.MAX_VALUE;
            this.requestPINEntry = -1;
            this.isOutputSupportedForhNQ4ISI = -1;
            this.getOutputStallDurationlomOqCM = -1;
            this.getOutputStallDuration = -1;
            this.unwrapAs = -1.0f;
            this.f2739a = 1.0f;
            this.startTransaction = -1;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = -1;
            this.Camera2StreamConfigurationMap = -1;
            this.init = -1;
            this._BOUNDARY = -1;
            this.getHighSpeedVideoFpsRanges = -1;
            this.getInputFormats = 1;
            this.resetTransaction = -1;
            this.exchange = -1;
            this.getHighSpeedVideoSizesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        private Builder(androidx.media3.common.Format format) {
            this.toString = format.id;
            this.accessartificialFrame = format.label;
            this.CoroutineDebuggingKt = format.labels;
            this.coroutineCreation = format.language;
            this.AMEXKernela = format.selectionFlags;
            this.d = format.roleFlags;
            this.getHighSpeedVideoSizes = format.averageBitrate;
            this.b = format.peakBitrate;
            this.getHighSpeedVideoFpsRangesFor = format.codecs;
            this._CREATION = format.metadata;
            this.getInputSizeshNQ4ISI = format.customData;
            this.getOutputFormats = format.containerMimeType;
            this.kernelVersion = format.sampleMimeType;
            this.ArtificialStackFrames = format.maxInputSize;
            this.coroutineBoundary = format.maxNumReorderSamples;
            this.isOutputSupportedFor = format.initializationData;
            this.getOutputSizes = format.drmInitData;
            this.release = format.subsampleOffsetUs;
            this.getValidOutputFormatsForInputhNQ4ISI = format.hasPrerollSamples;
            this.requestPINEntry = format.width;
            this.isOutputSupportedForhNQ4ISI = format.height;
            this.getOutputStallDurationlomOqCM = format.decodedWidth;
            this.getOutputStallDuration = format.decodedHeight;
            this.unwrapAs = format.frameRate;
            this.AMEXKernel = format.rotationDegrees;
            this.f2739a = format.pixelWidthHeightRatio;
            this.c = format.projectionData;
            this.startTransaction = format.stereoMode;
            this.getOutputMinFrameDuration = format.colorInfo;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = format.maxSubLayers;
            this.Camera2StreamConfigurationMap = format.channelCount;
            this.init = format.sampleRate;
            this._BOUNDARY = format.pcmEncoding;
            this.getOutputMinFrameDurationlomOqCM = format.encoderDelay;
            this.getOutputSizeshNQ4ISI = format.encoderPadding;
            this.getHighSpeedVideoFpsRanges = format.accessibilityChannel;
            this.getInputFormats = format.cueReplacementBehavior;
            this.resetTransaction = format.tileCountHorizontal;
            this.exchange = format.tileCountVertical;
            this.getHighSpeedVideoSizesFor = format.cryptoType;
        }

        public final androidx.media3.common.Format.Builder setId(java.lang.String str) {
            this.toString = str;
            return this;
        }

        public final androidx.media3.common.Format.Builder setId(int i) {
            this.toString = java.lang.Integer.toString(i);
            return this;
        }

        public final androidx.media3.common.Format.Builder setLabel(java.lang.String str) {
            this.accessartificialFrame = str;
            return this;
        }

        public final androidx.media3.common.Format.Builder setLabels(java.util.List<androidx.media3.common.Label> list) {
            this.CoroutineDebuggingKt = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public final androidx.media3.common.Format.Builder setLanguage(java.lang.String str) {
            this.coroutineCreation = str;
            return this;
        }

        public final androidx.media3.common.Format.Builder setSelectionFlags(int i) {
            this.AMEXKernela = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setRoleFlags(int i) {
            this.d = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setAuxiliaryTrackType(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setAverageBitrate(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setPeakBitrate(int i) {
            this.b = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setCodecs(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
            return this;
        }

        public final androidx.media3.common.Format.Builder setMetadata(androidx.media3.common.Metadata metadata) {
            this._CREATION = metadata;
            return this;
        }

        public final androidx.media3.common.Format.Builder setCustomData(java.lang.Object obj) {
            this.getInputSizeshNQ4ISI = obj;
            return this;
        }

        public final androidx.media3.common.Format.Builder setContainerMimeType(java.lang.String str) {
            this.getOutputFormats = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public final androidx.media3.common.Format.Builder setSampleMimeType(java.lang.String str) {
            this.kernelVersion = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            return this;
        }

        public final androidx.media3.common.Format.Builder setMaxInputSize(int i) {
            this.ArtificialStackFrames = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setMaxNumReorderSamples(int i) {
            this.coroutineBoundary = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setInitializationData(java.util.List<byte[]> list) {
            this.isOutputSupportedFor = list;
            return this;
        }

        public final androidx.media3.common.Format.Builder setDrmInitData(androidx.media3.common.DrmInitData drmInitData) {
            this.getOutputSizes = drmInitData;
            return this;
        }

        public final androidx.media3.common.Format.Builder setSubsampleOffsetUs(long j) {
            this.release = j;
            return this;
        }

        public final androidx.media3.common.Format.Builder setHasPrerollSamples(boolean z) {
            this.getValidOutputFormatsForInputhNQ4ISI = z;
            return this;
        }

        public final androidx.media3.common.Format.Builder setWidth(int i) {
            this.requestPINEntry = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setHeight(int i) {
            this.isOutputSupportedForhNQ4ISI = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setDecodedWidth(int i) {
            this.getOutputStallDurationlomOqCM = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setDecodedHeight(int i) {
            this.getOutputStallDuration = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setFrameRate(float f) {
            this.unwrapAs = f;
            return this;
        }

        public final androidx.media3.common.Format.Builder setRotationDegrees(int i) {
            this.AMEXKernel = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setPixelWidthHeightRatio(float f) {
            this.f2739a = f;
            return this;
        }

        public final androidx.media3.common.Format.Builder setProjectionData(byte[] bArr) {
            this.c = bArr;
            return this;
        }

        public final androidx.media3.common.Format.Builder setStereoMode(int i) {
            this.startTransaction = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setColorInfo(androidx.media3.common.ColorInfo colorInfo) {
            this.getOutputMinFrameDuration = colorInfo;
            return this;
        }

        public final androidx.media3.common.Format.Builder setMaxSubLayers(int i) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setChannelCount(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setSampleRate(int i) {
            this.init = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setPcmEncoding(int i) {
            this._BOUNDARY = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setEncoderDelay(int i) {
            this.getOutputMinFrameDurationlomOqCM = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setEncoderPadding(int i) {
            this.getOutputSizeshNQ4ISI = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setAccessibilityChannel(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setCueReplacementBehavior(int i) {
            this.getInputFormats = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setTileCountHorizontal(int i) {
            this.resetTransaction = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setTileCountVertical(int i) {
            this.exchange = i;
            return this;
        }

        public final androidx.media3.common.Format.Builder setCryptoType(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public final androidx.media3.common.Format build() {
            return new androidx.media3.common.Format(this, (byte) 0);
        }
    }

    private Format(androidx.media3.common.Format.Builder builder) {
        boolean z;
        java.lang.String str;
        this.id = builder.toString;
        java.lang.String normalizeLanguageCode = androidx.media3.common.util.Util.normalizeLanguageCode(builder.coroutineCreation);
        this.language = normalizeLanguageCode;
        if (!builder.CoroutineDebuggingKt.isEmpty() || builder.accessartificialFrame == null) {
            if (builder.CoroutineDebuggingKt.isEmpty() || builder.accessartificialFrame != null) {
                if (!builder.CoroutineDebuggingKt.isEmpty() || builder.accessartificialFrame != null) {
                    for (int i = 0; i < builder.CoroutineDebuggingKt.size(); i++) {
                        if (!((androidx.media3.common.Label) builder.CoroutineDebuggingKt.get(i)).value.equals(builder.accessartificialFrame)) {
                        }
                    }
                    z = false;
                    com.google.common.base.Preconditions.checkState(z);
                    this.labels = builder.CoroutineDebuggingKt;
                    this.label = builder.accessartificialFrame;
                }
                z = true;
                com.google.common.base.Preconditions.checkState(z);
                this.labels = builder.CoroutineDebuggingKt;
                this.label = builder.accessartificialFrame;
            } else {
                this.labels = builder.CoroutineDebuggingKt;
                java.util.List list = builder.CoroutineDebuggingKt;
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        androidx.media3.common.Label label = (androidx.media3.common.Label) it.next();
                        if (android.text.TextUtils.equals(label.language, normalizeLanguageCode)) {
                            str = label.value;
                            break;
                        }
                    } else {
                        str = ((androidx.media3.common.Label) list.get(0)).value;
                        break;
                    }
                }
                this.label = str;
            }
        } else {
            this.labels = com.google.common.collect.ImmutableList.of(new androidx.media3.common.Label(normalizeLanguageCode, builder.accessartificialFrame));
            this.label = builder.accessartificialFrame;
        }
        this.selectionFlags = builder.AMEXKernela;
        com.google.common.base.Preconditions.checkState(builder.getHighResolutionOutputSizeshNQ4ISI == 0 || (builder.d & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.roleFlags = builder.d;
        this.auxiliaryTrackType = builder.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = builder.getHighSpeedVideoSizes;
        this.averageBitrate = i2;
        int i3 = builder.b;
        this.peakBitrate = i3;
        this.bitrate = i3 != -1 ? i3 : i2;
        this.codecs = builder.getHighSpeedVideoFpsRangesFor;
        this.metadata = builder._CREATION;
        this.customData = builder.getInputSizeshNQ4ISI;
        this.containerMimeType = builder.getOutputFormats;
        this.sampleMimeType = builder.kernelVersion;
        this.maxInputSize = builder.ArtificialStackFrames;
        this.maxNumReorderSamples = builder.coroutineBoundary;
        this.initializationData = builder.isOutputSupportedFor == null ? java.util.Collections.emptyList() : builder.isOutputSupportedFor;
        androidx.media3.common.DrmInitData drmInitData = builder.getOutputSizes;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.release;
        this.hasPrerollSamples = builder.getValidOutputFormatsForInputhNQ4ISI;
        this.width = builder.requestPINEntry;
        this.height = builder.isOutputSupportedForhNQ4ISI;
        this.decodedWidth = builder.getOutputStallDurationlomOqCM;
        this.decodedHeight = builder.getOutputStallDuration;
        this.frameRate = builder.unwrapAs;
        this.rotationDegrees = builder.AMEXKernel == -1 ? 0 : builder.AMEXKernel;
        this.pixelWidthHeightRatio = builder.f2739a == -1.0f ? 1.0f : builder.f2739a;
        this.projectionData = builder.c;
        this.stereoMode = builder.startTransaction;
        this.colorInfo = builder.getOutputMinFrameDuration;
        this.maxSubLayers = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.channelCount = builder.Camera2StreamConfigurationMap;
        this.sampleRate = builder.init;
        this.pcmEncoding = builder._BOUNDARY;
        this.encoderDelay = builder.getOutputMinFrameDurationlomOqCM == -1 ? 0 : builder.getOutputMinFrameDurationlomOqCM;
        this.encoderPadding = builder.getOutputSizeshNQ4ISI != -1 ? builder.getOutputSizeshNQ4ISI : 0;
        this.accessibilityChannel = builder.getHighSpeedVideoFpsRanges;
        this.cueReplacementBehavior = builder.getInputFormats;
        this.tileCountHorizontal = builder.resetTransaction;
        this.tileCountVertical = builder.exchange;
        if (builder.getHighSpeedVideoSizesFor != 0 || drmInitData == null) {
            this.cryptoType = builder.getHighSpeedVideoSizesFor;
        } else {
            this.cryptoType = 1;
        }
    }

    public final androidx.media3.common.Format.Builder buildUpon() {
        return new androidx.media3.common.Format.Builder(this, (byte) 0);
    }

    public final androidx.media3.common.Format withManifestFormatInfo(androidx.media3.common.Format format) {
        java.lang.String str;
        androidx.media3.common.Metadata copyWithAppendedEntriesFrom;
        if (this == format) {
            return this;
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(this.sampleMimeType);
        java.lang.String str2 = format.id;
        int i = format.tileCountHorizontal;
        int i2 = format.tileCountVertical;
        java.lang.String str3 = format.label;
        if (str3 == null) {
            str3 = this.label;
        }
        java.util.List<androidx.media3.common.Label> list = !format.labels.isEmpty() ? format.labels : this.labels;
        java.lang.String str4 = this.language;
        if ((trackType == 3 || trackType == 1) && (str = format.language) != null) {
            str4 = str;
        }
        int i3 = this.averageBitrate;
        if (i3 == -1) {
            i3 = format.averageBitrate;
        }
        int i4 = this.peakBitrate;
        if (i4 == -1) {
            i4 = format.peakBitrate;
        }
        java.lang.String str5 = this.codecs;
        if (str5 == null) {
            java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, trackType);
            if (androidx.media3.common.util.Util.splitCodecs(codecsOfType).length == 1) {
                str5 = codecsOfType;
            }
        }
        androidx.media3.common.Metadata metadata = this.metadata;
        if (metadata == null) {
            copyWithAppendedEntriesFrom = format.metadata;
        } else {
            copyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(format.metadata);
        }
        float f = this.frameRate;
        if (f == -1.0f && trackType == 2) {
            f = format.frameRate;
        }
        return buildUpon().setId(str2).setLabel(str3).setLabels(list).setLanguage(str4).setSelectionFlags(this.selectionFlags | format.selectionFlags).setRoleFlags(this.roleFlags | format.roleFlags).setAverageBitrate(i3).setPeakBitrate(i4).setCodecs(str5).setMetadata(copyWithAppendedEntriesFrom).setDrmInitData(androidx.media3.common.DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData)).setFrameRate(f).setTileCountHorizontal(i).setTileCountVertical(i2).build();
    }

    public final androidx.media3.common.Format copyWithCryptoType(int i) {
        return buildUpon().setCryptoType(i).build();
    }

    public final int getPixelCount() {
        int i;
        int i2 = this.width;
        if (i2 == -1 || (i = this.height) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Format(");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append(", ");
        sb.append(this.colorInfo);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        sb.append(this.sampleRate);
        sb.append("])");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.exchange == 0) {
            java.lang.String str = this.id;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.label;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.labels.hashCode();
            java.lang.String str3 = this.language;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            int i = this.selectionFlags;
            int i2 = this.roleFlags;
            int i3 = this.auxiliaryTrackType;
            int i4 = this.averageBitrate;
            int i5 = this.peakBitrate;
            java.lang.String str4 = this.codecs;
            int hashCode5 = str4 == null ? 0 : str4.hashCode();
            androidx.media3.common.Metadata metadata = this.metadata;
            int hashCode6 = metadata == null ? 0 : metadata.hashCode();
            java.lang.Object obj = this.customData;
            int hashCode7 = obj == null ? 0 : obj.hashCode();
            java.lang.String str5 = this.containerMimeType;
            int hashCode8 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.sampleMimeType;
            int hashCode9 = str6 != null ? str6.hashCode() : 0;
            int i6 = this.maxInputSize;
            int i7 = hashCode8;
            int i8 = (int) this.subsampleOffsetUs;
            int i9 = this.width;
            int i10 = this.height;
            int i11 = this.decodedWidth;
            int i12 = this.decodedHeight;
            int floatToIntBits = java.lang.Float.floatToIntBits(this.frameRate);
            int i13 = this.rotationDegrees;
            int floatToIntBits2 = java.lang.Float.floatToIntBits(this.pixelWidthHeightRatio);
            int i14 = this.stereoMode;
            int i15 = this.maxSubLayers;
            int i16 = this.channelCount;
            int i17 = this.sampleRate;
            int i18 = this.pcmEncoding;
            int i19 = this.encoderDelay;
            int i20 = this.encoderPadding;
            int i21 = this.accessibilityChannel;
            this.exchange = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i7) * 31) + hashCode9) * 31) + i6) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + floatToIntBits) * 31) + i13) * 31) + floatToIntBits2) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        }
        return this.exchange;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.common.Format format = (androidx.media3.common.Format) obj;
            int i2 = this.exchange;
            if ((i2 == 0 || (i = format.exchange) == 0 || i2 == i) && this.selectionFlags == format.selectionFlags && this.roleFlags == format.roleFlags && this.auxiliaryTrackType == format.auxiliaryTrackType && this.averageBitrate == format.averageBitrate && this.peakBitrate == format.peakBitrate && this.maxInputSize == format.maxInputSize && this.subsampleOffsetUs == format.subsampleOffsetUs && this.width == format.width && this.height == format.height && this.decodedWidth == format.decodedWidth && this.decodedHeight == format.decodedHeight && this.rotationDegrees == format.rotationDegrees && this.stereoMode == format.stereoMode && this.maxSubLayers == format.maxSubLayers && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.accessibilityChannel == format.accessibilityChannel && this.tileCountHorizontal == format.tileCountHorizontal && this.tileCountVertical == format.tileCountVertical && this.cryptoType == format.cryptoType && java.lang.Float.compare(this.frameRate, format.frameRate) == 0 && java.lang.Float.compare(this.pixelWidthHeightRatio, format.pixelWidthHeightRatio) == 0 && java.util.Objects.equals(this.id, format.id) && java.util.Objects.equals(this.label, format.label) && this.labels.equals(format.labels) && java.util.Objects.equals(this.codecs, format.codecs) && java.util.Objects.equals(this.containerMimeType, format.containerMimeType) && java.util.Objects.equals(this.sampleMimeType, format.sampleMimeType) && java.util.Objects.equals(this.language, format.language) && java.util.Arrays.equals(this.projectionData, format.projectionData) && java.util.Objects.equals(this.metadata, format.metadata) && java.util.Objects.equals(this.colorInfo, format.colorInfo) && java.util.Objects.equals(this.drmInitData, format.drmInitData) && initializationDataEquals(format) && java.util.Objects.equals(this.customData, format.customData)) {
                return true;
            }
        }
        return false;
    }

    public final boolean initializationDataEquals(androidx.media3.common.Format format) {
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

    public static java.lang.String toLogString(androidx.media3.common.Format format) {
        if (format == null) {
            return "null";
        }
        com.google.common.base.Joiner on = com.google.common.base.Joiner.on(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("id=");
        sb.append(format.id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.containerMimeType != null) {
            sb.append(", container=");
            sb.append(format.containerMimeType);
        }
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
                if (uuid.equals(androidx.media3.common.C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add(androidx.media3.common.C.CENC_TYPE_cenc);
                } else if (uuid.equals(androidx.media3.common.C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(androidx.media3.common.C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(androidx.media3.common.C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(androidx.media3.common.C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown (");
                    sb2.append(uuid);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sb.append(", drm=[");
            on.appendTo(sb, (java.lang.Iterable<?>) linkedHashSet);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.decodedWidth != -1 && format.decodedHeight != -1) {
            sb.append(", decRes=");
            sb.append(format.decodedWidth);
            sb.append("x");
            sb.append(format.decodedHeight);
        }
        if (!com.google.common.math.DoubleMath.fuzzyEquals(format.pixelWidthHeightRatio, 1.0d, 0.001d)) {
            sb.append(", par=");
            sb.append(androidx.media3.common.util.Util.formatInvariant("%.3f", java.lang.Float.valueOf(format.pixelWidthHeightRatio)));
        }
        androidx.media3.common.ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null && colorInfo.isValid()) {
            sb.append(", color=");
            sb.append(format.colorInfo.toLogString());
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.maxSubLayers != -1) {
            sb.append(", maxSubLayers=");
            sb.append(format.maxSubLayers);
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
        if (!format.labels.isEmpty()) {
            sb.append(", labels=[");
            on.appendTo(sb, (java.lang.Iterable<?>) com.google.common.collect.Lists.transform(format.labels, new com.google.common.base.Function() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda2
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Format.getHighSpeedVideoFpsRanges((androidx.media3.common.Label) obj);
                }
            }));
            sb.append("]");
        }
        if (format.selectionFlags != 0) {
            sb.append(", selectionFlags=[");
            on.appendTo(sb, (java.lang.Iterable<?>) androidx.media3.common.util.Util.getSelectionFlagStrings(format.selectionFlags));
            sb.append("]");
        }
        if (format.roleFlags != 0) {
            sb.append(", roleFlags=[");
            on.appendTo(sb, (java.lang.Iterable<?>) androidx.media3.common.util.Util.getRoleFlagStrings(format.roleFlags));
            sb.append("]");
        }
        if (format.customData != null) {
            sb.append(", customData=");
            sb.append(format.customData);
        }
        if ((format.roleFlags & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            sb.append(androidx.media3.common.util.Util.getAuxiliaryTrackTypeString(format.auxiliaryTrackType));
        }
        return sb.toString();
    }

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(androidx.media3.common.Label label) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(label.language);
        sb.append(": ");
        sb.append(label.value);
        return sb.toString();
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(toString, this.id);
        bundle.putString(isOutputSupportedForhNQ4ISI, this.label);
        bundle.putParcelableArrayList(getValidOutputFormatsForInputhNQ4ISI, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.labels, new com.google.common.base.Function() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.Label) obj).toBundle();
            }
        }));
        bundle.putString(coroutineBoundary, this.language);
        bundle.putInt(c, this.selectionFlags);
        bundle.putInt(f2738a, this.roleFlags);
        int i = this.auxiliaryTrackType;
        if (i != getHighSpeedVideoFpsRangesFor.auxiliaryTrackType) {
            bundle.putInt(Camera2StreamConfigurationMap, i);
        }
        bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, this.averageBitrate);
        bundle.putInt(CoroutineDebuggingKt, this.peakBitrate);
        bundle.putString(getOutputFormats, this.codecs);
        bundle.putString(getHighSpeedVideoSizesFor, this.containerMimeType);
        bundle.putString(getARTIFICIAL_FRAME_PACKAGE_NAME, this.sampleMimeType);
        bundle.putInt(accessartificialFrame, this.maxInputSize);
        for (int i2 = 0; i2 < this.initializationData.size(); i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(unwrapAs);
            sb.append("_");
            sb.append(java.lang.Integer.toString(i2, 36));
            bundle.putByteArray(sb.toString(), this.initializationData.get(i2));
        }
        bundle.putParcelable(getOutputMinFrameDurationlomOqCM, this.drmInitData);
        bundle.putLong(init, this.subsampleOffsetUs);
        bundle.putInt(release, this.width);
        bundle.putInt(isOutputSupportedFor, this.height);
        bundle.putInt(getOutputStallDurationlomOqCM, this.decodedWidth);
        bundle.putInt(getInputFormats, this.decodedHeight);
        bundle.putFloat(getOutputSizeshNQ4ISI, this.frameRate);
        bundle.putInt(b, this.rotationDegrees);
        bundle.putFloat(_CREATION, this.pixelWidthHeightRatio);
        bundle.putByteArray(_BOUNDARY, this.projectionData);
        bundle.putInt(kernelVersion, this.stereoMode);
        androidx.media3.common.ColorInfo colorInfo = this.colorInfo;
        if (colorInfo != null) {
            bundle.putBundle(getInputSizeshNQ4ISI, colorInfo.toBundle());
        }
        bundle.putInt(ArtificialStackFrames, this.maxSubLayers);
        bundle.putInt(getHighSpeedVideoFpsRanges, this.channelCount);
        bundle.putInt(AMEXKernel, this.sampleRate);
        bundle.putInt(coroutineCreation, this.pcmEncoding);
        bundle.putInt(getOutputStallDuration, this.encoderDelay);
        bundle.putInt(getOutputSizes, this.encoderPadding);
        bundle.putInt(getHighSpeedVideoSizes, this.accessibilityChannel);
        bundle.putInt(d, this.tileCountHorizontal);
        bundle.putInt(resetTransaction, this.tileCountVertical);
        bundle.putInt(getOutputMinFrameDuration, this.cryptoType);
        return bundle;
    }

    public static androidx.media3.common.Format fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
        androidx.media3.common.util.BundleCollectionUtil.ensureClassLoader(bundle);
        java.lang.String string = bundle.getString(toString);
        androidx.media3.common.Format format = getHighSpeedVideoFpsRangesFor;
        java.lang.String str = format.id;
        if (string == null) {
            string = str;
        }
        androidx.media3.common.Format.Builder id = builder.setId(string);
        java.lang.String string2 = bundle.getString(isOutputSupportedForhNQ4ISI);
        java.lang.String str2 = format.label;
        if (string2 == null) {
            string2 = str2;
        }
        id.setLabel(string2);
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getValidOutputFormatsForInputhNQ4ISI);
        if (parcelableArrayList == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.Format$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.media3.common.Label.fromBundle((android.os.Bundle) obj);
                }
            }, parcelableArrayList);
        }
        androidx.media3.common.Format.Builder labels = builder.setLabels(fromBundleList);
        java.lang.String string3 = bundle.getString(coroutineBoundary);
        java.lang.String str3 = format.language;
        if (string3 == null) {
            string3 = str3;
        }
        androidx.media3.common.Format.Builder peakBitrate = labels.setLanguage(string3).setSelectionFlags(bundle.getInt(c, format.selectionFlags)).setRoleFlags(bundle.getInt(f2738a, format.roleFlags)).setAuxiliaryTrackType(bundle.getInt(Camera2StreamConfigurationMap, format.auxiliaryTrackType)).setAverageBitrate(bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, format.averageBitrate)).setPeakBitrate(bundle.getInt(CoroutineDebuggingKt, format.peakBitrate));
        java.lang.String string4 = bundle.getString(getOutputFormats);
        java.lang.String str4 = format.codecs;
        if (string4 == null) {
            string4 = str4;
        }
        androidx.media3.common.Format.Builder codecs = peakBitrate.setCodecs(string4);
        java.lang.String string5 = bundle.getString(getHighSpeedVideoSizesFor);
        java.lang.String str5 = format.containerMimeType;
        if (string5 == null) {
            string5 = str5;
        }
        androidx.media3.common.Format.Builder containerMimeType = codecs.setContainerMimeType(string5);
        java.lang.String string6 = bundle.getString(getARTIFICIAL_FRAME_PACKAGE_NAME);
        java.lang.String str6 = format.sampleMimeType;
        if (string6 == null) {
            string6 = str6;
        }
        containerMimeType.setSampleMimeType(string6).setMaxInputSize(bundle.getInt(accessartificialFrame, format.maxInputSize));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(unwrapAs);
            sb.append("_");
            sb.append(java.lang.Integer.toString(i, 36));
            byte[] byteArray = bundle.getByteArray(sb.toString());
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        androidx.media3.common.Format.Builder drmInitData = builder.setInitializationData(arrayList).setDrmInitData((androidx.media3.common.DrmInitData) bundle.getParcelable(getOutputMinFrameDurationlomOqCM));
        java.lang.String str7 = init;
        androidx.media3.common.Format format2 = getHighSpeedVideoFpsRangesFor;
        drmInitData.setSubsampleOffsetUs(bundle.getLong(str7, format2.subsampleOffsetUs)).setWidth(bundle.getInt(release, format2.width)).setHeight(bundle.getInt(isOutputSupportedFor, format2.height)).setDecodedWidth(bundle.getInt(getOutputStallDurationlomOqCM, format2.decodedWidth)).setDecodedHeight(bundle.getInt(getInputFormats, format2.decodedHeight)).setFrameRate(bundle.getFloat(getOutputSizeshNQ4ISI, format2.frameRate)).setRotationDegrees(bundle.getInt(b, format2.rotationDegrees)).setPixelWidthHeightRatio(bundle.getFloat(_CREATION, format2.pixelWidthHeightRatio)).setProjectionData(bundle.getByteArray(_BOUNDARY)).setStereoMode(bundle.getInt(kernelVersion, format2.stereoMode)).setMaxSubLayers(bundle.getInt(ArtificialStackFrames, format2.maxSubLayers));
        android.os.Bundle bundle2 = bundle.getBundle(getInputSizeshNQ4ISI);
        if (bundle2 != null) {
            builder.setColorInfo(androidx.media3.common.ColorInfo.fromBundle(bundle2));
        }
        builder.setChannelCount(bundle.getInt(getHighSpeedVideoFpsRanges, format2.channelCount)).setSampleRate(bundle.getInt(AMEXKernel, format2.sampleRate)).setPcmEncoding(bundle.getInt(coroutineCreation, format2.pcmEncoding)).setEncoderDelay(bundle.getInt(getOutputStallDuration, format2.encoderDelay)).setEncoderPadding(bundle.getInt(getOutputSizes, format2.encoderPadding)).setAccessibilityChannel(bundle.getInt(getHighSpeedVideoSizes, format2.accessibilityChannel)).setTileCountHorizontal(bundle.getInt(d, format2.tileCountHorizontal)).setTileCountVertical(bundle.getInt(resetTransaction, format2.tileCountVertical)).setCryptoType(bundle.getInt(getOutputMinFrameDuration, format2.cryptoType));
        return builder.build();
    }
}
