package androidx.media3.common;

/* loaded from: classes7.dex */
public class TrackSelectionParameters {
    private static final java.lang.String AMEXKernel;
    private static final java.lang.String AMEXKernela;
    private static final java.lang.String ArtificialStackFrames;
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String CoroutineDebuggingKt;
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT;

    @java.lang.Deprecated
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final java.lang.String _BOUNDARY;
    private static final java.lang.String _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f2743a;
    private static final java.lang.String accessartificialFrame;
    private static final java.lang.String b;
    private static final java.lang.String c;
    private static final java.lang.String coroutineBoundary;
    private static final java.lang.String coroutineCreation;
    private static final java.lang.String d;
    private static final java.lang.String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final java.lang.String getOutputMinFrameDurationlomOqCM;
    private static final java.lang.String getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static final java.lang.String getOutputStallDuration;
    private static final java.lang.String getOutputStallDurationlomOqCM;
    private static final java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private static final java.lang.String init;
    private static final java.lang.String isOutputSupportedFor;
    private static final java.lang.String isOutputSupportedForhNQ4ISI;
    private static final java.lang.String kernelVersion;
    private static final java.lang.String release;
    private static final java.lang.String resetTransaction;
    private static final java.lang.String toString;
    private static final java.lang.String unwrapAs;
    public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
    public final com.google.common.collect.ImmutableSet<java.lang.Integer> disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final boolean isPrioritizeImageOverVideoEnabled;
    public final boolean isViewportSizeLimitedByPhysicalDisplaySize;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final com.google.common.collect.ImmutableMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLabels;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredTextLabels;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoLabels;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoLanguages;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectTextByDefault;
    public final boolean selectUndeterminedTextLanguage;
    public final boolean usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public static class Builder {
        private int AMEXKernel;
        private com.google.common.collect.ImmutableList<java.lang.String> ArtificialStackFrames;
        private boolean Camera2StreamConfigurationMap;
        private int CoroutineDebuggingKt;
        private int _BOUNDARY;
        private boolean _CREATION;

        /* renamed from: a, reason: collision with root package name */
        private com.google.common.collect.ImmutableList<java.lang.String> f2744a;
        private com.google.common.collect.ImmutableList<java.lang.String> accessartificialFrame;
        private com.google.common.collect.ImmutableList<java.lang.String> b;
        private int c;
        private com.google.common.collect.ImmutableList<java.lang.String> coroutineBoundary;
        private int coroutineCreation;
        private boolean d;
        private com.google.common.collect.ImmutableList<java.lang.String> getARTIFICIAL_FRAME_PACKAGE_NAME;
        private androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences getHighResolutionOutputSizeshNQ4ISI;
        private java.util.HashSet<java.lang.Integer> getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private boolean getInputFormats;
        private int getInputSizeshNQ4ISI;
        private boolean getOutputFormats;
        private int getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private int getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;
        private com.google.common.collect.ImmutableList<java.lang.String> getValidOutputFormatsForInputhNQ4ISI;
        private boolean init;
        private com.google.common.collect.ImmutableList<java.lang.String> isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private boolean kernelVersion;
        private int toString;
        private java.util.HashMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> unwrapAs;

        public Builder() {
            this.getOutputStallDurationlomOqCM = Integer.MAX_VALUE;
            this.getOutputSizeshNQ4ISI = Integer.MAX_VALUE;
            this.getOutputStallDuration = Integer.MAX_VALUE;
            this.getHighSpeedVideoSizesFor = Integer.MAX_VALUE;
            this.AMEXKernel = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.getInputFormats = true;
            this.d = true;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = com.google.common.collect.ImmutableList.of();
            this.f2744a = com.google.common.collect.ImmutableList.of();
            this.b = com.google.common.collect.ImmutableList.of();
            this._BOUNDARY = 0;
            this.getValidOutputFormatsForInputhNQ4ISI = com.google.common.collect.ImmutableList.of();
            this.isOutputSupportedFor = com.google.common.collect.ImmutableList.of();
            this.CoroutineDebuggingKt = 0;
            this.getInputSizeshNQ4ISI = Integer.MAX_VALUE;
            this.getOutputMinFrameDuration = Integer.MAX_VALUE;
            this.coroutineBoundary = com.google.common.collect.ImmutableList.of();
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT;
            this._CREATION = false;
            this.ArtificialStackFrames = com.google.common.collect.ImmutableList.of();
            this.coroutineCreation = 0;
            this.kernelVersion = true;
            this.accessartificialFrame = com.google.common.collect.ImmutableList.of();
            this.getHighSpeedVideoSizes = 0;
            this.init = false;
            this.getOutputFormats = false;
            this.getHighSpeedVideoFpsRangesFor = false;
            this.Camera2StreamConfigurationMap = false;
            this.unwrapAs = new java.util.HashMap<>();
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet<>();
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context) {
            this();
        }

        protected Builder(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            Camera2StreamConfigurationMap(trackSelectionParameters);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected Builder(android.os.Bundle bundle) {
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences build;
            com.google.common.collect.ImmutableList fromBundleList;
            this.getOutputStallDurationlomOqCM = bundle.getInt(androidx.media3.common.TrackSelectionParameters.unwrapAs, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxVideoWidth);
            this.getOutputSizeshNQ4ISI = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputMinFrameDurationlomOqCM, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxVideoHeight);
            this.getOutputStallDuration = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputSizes, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxVideoFrameRate);
            this.getHighSpeedVideoSizesFor = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputStallDurationlomOqCM, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxVideoBitrate);
            this.toString = bundle.getInt(androidx.media3.common.TrackSelectionParameters.isOutputSupportedForhNQ4ISI, androidx.media3.common.TrackSelectionParameters.DEFAULT.minVideoWidth);
            this.isOutputSupportedForhNQ4ISI = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getValidOutputFormatsForInputhNQ4ISI, androidx.media3.common.TrackSelectionParameters.DEFAULT.minVideoHeight);
            this.getOutputMinFrameDurationlomOqCM = bundle.getInt(androidx.media3.common.TrackSelectionParameters.toString, androidx.media3.common.TrackSelectionParameters.DEFAULT.minVideoFrameRate);
            this.getOutputSizes = bundle.getInt(androidx.media3.common.TrackSelectionParameters.isOutputSupportedFor, androidx.media3.common.TrackSelectionParameters.DEFAULT.minVideoBitrate);
            this.AMEXKernel = bundle.getInt(androidx.media3.common.TrackSelectionParameters.resetTransaction, androidx.media3.common.TrackSelectionParameters.DEFAULT.viewportWidth);
            int i = bundle.getInt(androidx.media3.common.TrackSelectionParameters.AMEXKernela, androidx.media3.common.TrackSelectionParameters.DEFAULT.viewportHeight);
            this.c = i;
            this.getInputFormats = this.AMEXKernel == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getHighSpeedVideoSizesFor, androidx.media3.common.TrackSelectionParameters.DEFAULT.isViewportSizeLimitedByPhysicalDisplaySize);
            this.d = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.release, androidx.media3.common.TrackSelectionParameters.DEFAULT.viewportOrientationMayChange);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters._BOUNDARY), new java.lang.String[0]));
            this.f2744a = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.getARTIFICIAL_FRAME_PACKAGE_NAME), new java.lang.String[0]));
            this.b = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.f2743a), new java.lang.String[0]));
            this._BOUNDARY = bundle.getInt(androidx.media3.common.TrackSelectionParameters.d, androidx.media3.common.TrackSelectionParameters.DEFAULT.preferredVideoRoleFlags);
            this.getValidOutputFormatsForInputhNQ4ISI = getHighSpeedVideoFpsRangesFor((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.accessartificialFrame), new java.lang.String[0]));
            this.isOutputSupportedFor = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.coroutineCreation), new java.lang.String[0]));
            this.CoroutineDebuggingKt = bundle.getInt(androidx.media3.common.TrackSelectionParameters.CoroutineDebuggingKt, androidx.media3.common.TrackSelectionParameters.DEFAULT.preferredAudioRoleFlags);
            this.getInputSizeshNQ4ISI = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputSizeshNQ4ISI, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxAudioChannelCount);
            this.getOutputMinFrameDuration = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputStallDuration, androidx.media3.common.TrackSelectionParameters.DEFAULT.maxAudioBitrate);
            this.coroutineBoundary = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.coroutineBoundary), new java.lang.String[0]));
            android.os.Bundle bundle2 = bundle.getBundle(androidx.media3.common.TrackSelectionParameters.getHighSpeedVideoSizes);
            if (bundle2 != null) {
                build = androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.fromBundle(bundle2);
            } else {
                build = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().setAudioOffloadMode(bundle.getInt(androidx.media3.common.TrackSelectionParameters.Camera2StreamConfigurationMap, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getInputSizeshNQ4ISI, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getOutputMinFrameDuration, androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT.isSpeedChangeSupportRequired)).build();
            }
            this.getHighResolutionOutputSizeshNQ4ISI = build;
            this._CREATION = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.AMEXKernel, androidx.media3.common.TrackSelectionParameters.DEFAULT.selectTextByDefault);
            this.ArtificialStackFrames = getHighSpeedVideoFpsRangesFor((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters._CREATION), new java.lang.String[0]));
            this.coroutineCreation = bundle.getInt(androidx.media3.common.TrackSelectionParameters.b, androidx.media3.common.TrackSelectionParameters.DEFAULT.preferredTextRoleFlags);
            this.kernelVersion = this.ArtificialStackFrames.isEmpty() && this.coroutineCreation == 0 && bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.init, androidx.media3.common.TrackSelectionParameters.DEFAULT.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager);
            this.getHighSpeedVideoSizes = bundle.getInt(androidx.media3.common.TrackSelectionParameters.getOutputFormats, androidx.media3.common.TrackSelectionParameters.DEFAULT.ignoredTextSelectionFlags);
            this.accessartificialFrame = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.ArtificialStackFrames), new java.lang.String[0]));
            this.init = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.kernelVersion, androidx.media3.common.TrackSelectionParameters.DEFAULT.selectUndeterminedTextLanguage);
            this.getOutputFormats = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getInputFormats, androidx.media3.common.TrackSelectionParameters.DEFAULT.isPrioritizeImageOverVideoEnabled);
            this.getHighSpeedVideoFpsRangesFor = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getHighSpeedVideoFpsRanges, androidx.media3.common.TrackSelectionParameters.DEFAULT.forceLowestBitrate);
            this.Camera2StreamConfigurationMap = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.getHighResolutionOutputSizeshNQ4ISI, androidx.media3.common.TrackSelectionParameters.DEFAULT.forceHighestSupportedBitrate);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.TrackSelectionParameters.c);
            if (parcelableArrayList == null) {
                fromBundleList = com.google.common.collect.ImmutableList.of();
            } else {
                fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.TrackSelectionParameters$Builder$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.TrackSelectionOverride.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            this.unwrapAs = new java.util.HashMap<>();
            for (int i2 = 0; i2 < fromBundleList.size(); i2++) {
                androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) fromBundleList.get(i2);
                this.unwrapAs.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
            int[] iArr = (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(androidx.media3.common.TrackSelectionParameters.getHighSpeedVideoFpsRangesFor), new int[0]);
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet<>();
            for (int i3 : iArr) {
                this.getHighSpeedVideoFpsRanges.add(java.lang.Integer.valueOf(i3));
            }
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes", "preferredVideoLabels", "preferredAudioLabels", "preferredTextLabels"})
        private void Camera2StreamConfigurationMap(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.getOutputStallDurationlomOqCM = trackSelectionParameters.maxVideoWidth;
            this.getOutputSizeshNQ4ISI = trackSelectionParameters.maxVideoHeight;
            this.getOutputStallDuration = trackSelectionParameters.maxVideoFrameRate;
            this.getHighSpeedVideoSizesFor = trackSelectionParameters.maxVideoBitrate;
            this.toString = trackSelectionParameters.minVideoWidth;
            this.isOutputSupportedForhNQ4ISI = trackSelectionParameters.minVideoHeight;
            this.getOutputMinFrameDurationlomOqCM = trackSelectionParameters.minVideoFrameRate;
            this.getOutputSizes = trackSelectionParameters.minVideoBitrate;
            this.AMEXKernel = trackSelectionParameters.viewportWidth;
            this.c = trackSelectionParameters.viewportHeight;
            this.getInputFormats = trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize;
            this.d = trackSelectionParameters.viewportOrientationMayChange;
            this.f2744a = trackSelectionParameters.preferredVideoLabels;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = trackSelectionParameters.preferredVideoMimeTypes;
            this.b = trackSelectionParameters.preferredVideoLanguages;
            this._BOUNDARY = trackSelectionParameters.preferredVideoRoleFlags;
            this.getValidOutputFormatsForInputhNQ4ISI = trackSelectionParameters.preferredAudioLanguages;
            this.CoroutineDebuggingKt = trackSelectionParameters.preferredAudioRoleFlags;
            this.isOutputSupportedFor = trackSelectionParameters.preferredAudioLabels;
            this.getInputSizeshNQ4ISI = trackSelectionParameters.maxAudioChannelCount;
            this.getOutputMinFrameDuration = trackSelectionParameters.maxAudioBitrate;
            this.coroutineBoundary = trackSelectionParameters.preferredAudioMimeTypes;
            this.getHighResolutionOutputSizeshNQ4ISI = trackSelectionParameters.audioOffloadPreferences;
            this._CREATION = trackSelectionParameters.selectTextByDefault;
            this.ArtificialStackFrames = trackSelectionParameters.preferredTextLanguages;
            this.coroutineCreation = trackSelectionParameters.preferredTextRoleFlags;
            this.kernelVersion = trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
            this.accessartificialFrame = trackSelectionParameters.preferredTextLabels;
            this.getHighSpeedVideoSizes = trackSelectionParameters.ignoredTextSelectionFlags;
            this.init = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.getOutputFormats = trackSelectionParameters.isPrioritizeImageOverVideoEnabled;
            this.getHighSpeedVideoFpsRangesFor = trackSelectionParameters.forceLowestBitrate;
            this.Camera2StreamConfigurationMap = trackSelectionParameters.forceHighestSupportedBitrate;
            this.getHighSpeedVideoFpsRanges = new java.util.HashSet<>(trackSelectionParameters.disabledTrackTypes);
            this.unwrapAs = new java.util.HashMap<>(trackSelectionParameters.overrides);
        }

        protected androidx.media3.common.TrackSelectionParameters.Builder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            Camera2StreamConfigurationMap(trackSelectionParameters);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSize(int i, int i2) {
            this.getOutputStallDurationlomOqCM = i;
            this.getOutputSizeshNQ4ISI = i2;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoFrameRate(int i) {
            this.getOutputStallDuration = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoBitrate(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoSize(int i, int i2) {
            this.toString = i;
            this.isOutputSupportedForhNQ4ISI = i2;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoFrameRate(int i) {
            this.getOutputMinFrameDurationlomOqCM = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoBitrate(int i) {
            this.getOutputSizes = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(boolean z) {
            this.getInputFormats = true;
            this.d = z;
            this.c = Integer.MAX_VALUE;
            this.AMEXKernel = Integer.MAX_VALUE;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
            return setViewportSizeToPhysicalDisplaySize(z);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSize(int i, int i2, boolean z) {
            this.AMEXKernel = i;
            this.c = i2;
            this.d = z;
            this.getInputFormats = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeType(java.lang.String str) {
            return str == null ? setPreferredVideoMimeTypes(new java.lang.String[0]) : setPreferredVideoMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredVideoLanguages(new java.lang.String[0]);
            }
            return setPreferredVideoLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLanguages(java.lang.String... strArr) {
            this.b = getHighSpeedVideoFpsRangesFor(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLabels(java.lang.String... strArr) {
            this.f2744a = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i) {
            this._BOUNDARY = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredAudioLanguages(new java.lang.String[0]);
            }
            return setPreferredAudioLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.getValidOutputFormatsForInputhNQ4ISI = getHighSpeedVideoFpsRangesFor(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i) {
            this.CoroutineDebuggingKt = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLabels(java.lang.String... strArr) {
            this.isOutputSupportedFor = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioChannelCount(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioBitrate(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeType(java.lang.String str) {
            return str == null ? setPreferredAudioMimeTypes(new java.lang.String[0]) : setPreferredAudioMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.coroutineBoundary = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.getHighResolutionOutputSizeshNQ4ISI = audioOffloadPreferences;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setSelectTextByDefault(boolean z) {
            this._CREATION = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.kernelVersion = true;
            this.ArtificialStackFrames = com.google.common.collect.ImmutableList.of();
            this.coroutineCreation = 0;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            return setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredTextLanguages(new java.lang.String[0]);
            }
            return setPreferredTextLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
            this.ArtificialStackFrames = getHighSpeedVideoFpsRangesFor(strArr);
            this.kernelVersion = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i) {
            this.coroutineCreation = i;
            this.kernelVersion = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLabels(java.lang.String... strArr) {
            this.accessartificialFrame = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
            this.init = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPrioritizeImageOverVideoEnabled(boolean z) {
            this.getOutputFormats = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceLowestBitrate(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.unwrapAs.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            clearOverridesOfType(trackSelectionOverride.getType());
            this.unwrapAs.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
            this.unwrapAs.remove(trackGroup);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverridesOfType(int i) {
            java.util.Iterator<androidx.media3.common.TrackSelectionOverride> it = this.unwrapAs.values().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == i) {
                    it.remove();
                }
            }
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverrides() {
            this.unwrapAs.clear();
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.getHighSpeedVideoFpsRanges.clear();
            this.getHighSpeedVideoFpsRanges.addAll(set);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
            if (z) {
                this.getHighSpeedVideoFpsRanges.add(java.lang.Integer.valueOf(i));
                return this;
            }
            this.getHighSpeedVideoFpsRanges.remove(java.lang.Integer.valueOf(i));
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters build() {
            return new androidx.media3.common.TrackSelectionParameters(this);
        }

        private static com.google.common.collect.ImmutableList<java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (java.lang.String str : (java.lang.String[]) com.google.common.base.Preconditions.checkNotNull(strArr)) {
                builder.add((com.google.common.collect.ImmutableList.Builder) androidx.media3.common.util.Util.normalizeLanguageCode((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str)));
            }
            return builder.build();
        }
    }

    public static final class AudioOffloadPreferences {
        public static final int AUDIO_OFFLOAD_MODE_DISABLED = 0;
        public static final int AUDIO_OFFLOAD_MODE_ENABLED = 1;
        public static final int AUDIO_OFFLOAD_MODE_REQUIRED = 2;
        public final int audioOffloadMode;
        public final boolean isGaplessSupportRequired;
        public final boolean isSpeedChangeSupportRequired;
        public static final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences DEFAULT = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().build();
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(3);

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface AudioOffloadMode {
        }

        /* synthetic */ AudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private int getHighSpeedVideoFpsRanges = 0;
            private boolean Camera2StreamConfigurationMap = false;
            private boolean getHighResolutionOutputSizeshNQ4ISI = false;

            public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setAudioOffloadMode(int i) {
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsGaplessSupportRequired(boolean z) {
                this.Camera2StreamConfigurationMap = z;
                return this;
            }

            public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsSpeedChangeSupportRequired(boolean z) {
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                return this;
            }

            public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences build() {
                return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences(this, (byte) 0);
            }
        }

        private AudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder) {
            this.audioOffloadMode = builder.getHighSpeedVideoFpsRanges;
            this.isGaplessSupportRequired = builder.Camera2StreamConfigurationMap;
            this.isSpeedChangeSupportRequired = builder.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder buildUpon() {
            return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().setAudioOffloadMode(this.audioOffloadMode).setIsGaplessSupportRequired(this.isGaplessSupportRequired).setIsSpeedChangeSupportRequired(this.isSpeedChangeSupportRequired);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = (androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences) obj;
            return this.audioOffloadMode == audioOffloadPreferences.audioOffloadMode && this.isGaplessSupportRequired == audioOffloadPreferences.isGaplessSupportRequired && this.isSpeedChangeSupportRequired == audioOffloadPreferences.isSpeedChangeSupportRequired;
        }

        public final int hashCode() {
            return ((((this.audioOffloadMode + 31) * 31) + (this.isGaplessSupportRequired ? 1 : 0)) * 31) + (this.isSpeedChangeSupportRequired ? 1 : 0);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(getHighSpeedVideoFpsRangesFor, this.audioOffloadMode);
            bundle.putBoolean(getHighSpeedVideoSizes, this.isGaplessSupportRequired);
            bundle.putBoolean(getHighSpeedVideoFpsRanges, this.isSpeedChangeSupportRequired);
            return bundle;
        }

        public static androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = DEFAULT;
            return builder.setAudioOffloadMode(bundle.getInt(str, audioOffloadPreferences.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(getHighSpeedVideoSizes, audioOffloadPreferences.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(getHighSpeedVideoFpsRanges, audioOffloadPreferences.isSpeedChangeSupportRequired)).build();
        }
    }

    static {
        androidx.media3.common.TrackSelectionParameters build = new androidx.media3.common.TrackSelectionParameters.Builder().build();
        DEFAULT = build;
        DEFAULT_WITHOUT_CONTEXT = build;
        accessartificialFrame = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        CoroutineDebuggingKt = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        _CREATION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        b = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        kernelVersion = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        unwrapAs = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        getOutputStallDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        isOutputSupportedForhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        getValidOutputFormatsForInputhNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(11);
        toString = androidx.media3.common.util.Util.intToStringMaxRadix(12);
        isOutputSupportedFor = androidx.media3.common.util.Util.intToStringMaxRadix(13);
        resetTransaction = androidx.media3.common.util.Util.intToStringMaxRadix(14);
        AMEXKernela = androidx.media3.common.util.Util.intToStringMaxRadix(15);
        release = androidx.media3.common.util.Util.intToStringMaxRadix(16);
        _BOUNDARY = androidx.media3.common.util.Util.intToStringMaxRadix(17);
        getOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(18);
        getOutputStallDuration = androidx.media3.common.util.Util.intToStringMaxRadix(19);
        coroutineBoundary = androidx.media3.common.util.Util.intToStringMaxRadix(20);
        getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(21);
        getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(22);
        c = androidx.media3.common.util.Util.intToStringMaxRadix(23);
        getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(24);
        d = androidx.media3.common.util.Util.intToStringMaxRadix(25);
        getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(26);
        Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(27);
        getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(28);
        getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(29);
        getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(30);
        getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(31);
        f2743a = androidx.media3.common.util.Util.intToStringMaxRadix(32);
        getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(33);
        init = androidx.media3.common.util.Util.intToStringMaxRadix(34);
        AMEXKernel = androidx.media3.common.util.Util.intToStringMaxRadix(35);
        getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(36);
        coroutineCreation = androidx.media3.common.util.Util.intToStringMaxRadix(37);
        ArtificialStackFrames = androidx.media3.common.util.Util.intToStringMaxRadix(38);
    }

    @java.lang.Deprecated
    public static androidx.media3.common.TrackSelectionParameters getDefaults(android.content.Context context) {
        return DEFAULT;
    }

    protected TrackSelectionParameters(androidx.media3.common.TrackSelectionParameters.Builder builder) {
        this.maxVideoWidth = builder.getOutputStallDurationlomOqCM;
        this.maxVideoHeight = builder.getOutputSizeshNQ4ISI;
        this.maxVideoFrameRate = builder.getOutputStallDuration;
        this.maxVideoBitrate = builder.getHighSpeedVideoSizesFor;
        this.minVideoWidth = builder.toString;
        this.minVideoHeight = builder.isOutputSupportedForhNQ4ISI;
        this.minVideoFrameRate = builder.getOutputMinFrameDurationlomOqCM;
        this.minVideoBitrate = builder.getOutputSizes;
        this.viewportWidth = builder.AMEXKernel;
        this.viewportHeight = builder.c;
        this.isViewportSizeLimitedByPhysicalDisplaySize = builder.getInputFormats;
        this.viewportOrientationMayChange = builder.d;
        this.preferredVideoMimeTypes = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.preferredVideoLabels = builder.f2744a;
        this.preferredVideoLanguages = builder.b;
        this.preferredVideoRoleFlags = builder._BOUNDARY;
        this.preferredAudioLanguages = builder.getValidOutputFormatsForInputhNQ4ISI;
        this.preferredAudioRoleFlags = builder.CoroutineDebuggingKt;
        this.maxAudioChannelCount = builder.getInputSizeshNQ4ISI;
        this.preferredAudioLabels = builder.isOutputSupportedFor;
        this.maxAudioBitrate = builder.getOutputMinFrameDuration;
        this.preferredAudioMimeTypes = builder.coroutineBoundary;
        this.audioOffloadPreferences = builder.getHighResolutionOutputSizeshNQ4ISI;
        this.selectTextByDefault = builder._CREATION;
        this.preferredTextLanguages = builder.ArtificialStackFrames;
        this.preferredTextRoleFlags = builder.coroutineCreation;
        this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = builder.kernelVersion;
        this.preferredTextLabels = builder.accessartificialFrame;
        this.ignoredTextSelectionFlags = builder.getHighSpeedVideoSizes;
        this.selectUndeterminedTextLanguage = builder.init;
        this.isPrioritizeImageOverVideoEnabled = builder.getOutputFormats;
        this.forceLowestBitrate = builder.getHighSpeedVideoFpsRangesFor;
        this.forceHighestSupportedBitrate = builder.Camera2StreamConfigurationMap;
        this.overrides = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) builder.unwrapAs);
        this.disabledTrackTypes = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) builder.getHighSpeedVideoFpsRanges);
    }

    public androidx.media3.common.TrackSelectionParameters.Builder buildUpon() {
        return new androidx.media3.common.TrackSelectionParameters.Builder(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.TrackSelectionParameters trackSelectionParameters = (androidx.media3.common.TrackSelectionParameters) obj;
        return this.maxVideoWidth == trackSelectionParameters.maxVideoWidth && this.maxVideoHeight == trackSelectionParameters.maxVideoHeight && this.maxVideoFrameRate == trackSelectionParameters.maxVideoFrameRate && this.maxVideoBitrate == trackSelectionParameters.maxVideoBitrate && this.minVideoWidth == trackSelectionParameters.minVideoWidth && this.minVideoHeight == trackSelectionParameters.minVideoHeight && this.minVideoFrameRate == trackSelectionParameters.minVideoFrameRate && this.minVideoBitrate == trackSelectionParameters.minVideoBitrate && this.viewportOrientationMayChange == trackSelectionParameters.viewportOrientationMayChange && this.viewportWidth == trackSelectionParameters.viewportWidth && this.viewportHeight == trackSelectionParameters.viewportHeight && this.isViewportSizeLimitedByPhysicalDisplaySize == trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize && this.preferredVideoMimeTypes.equals(trackSelectionParameters.preferredVideoMimeTypes) && this.preferredVideoLabels.equals(trackSelectionParameters.preferredVideoLabels) && this.preferredVideoLanguages.equals(trackSelectionParameters.preferredVideoLanguages) && this.preferredVideoRoleFlags == trackSelectionParameters.preferredVideoRoleFlags && this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.maxAudioChannelCount == trackSelectionParameters.maxAudioChannelCount && this.preferredAudioLabels.equals(trackSelectionParameters.preferredAudioLabels) && this.maxAudioBitrate == trackSelectionParameters.maxAudioBitrate && this.preferredAudioMimeTypes.equals(trackSelectionParameters.preferredAudioMimeTypes) && this.audioOffloadPreferences.equals(trackSelectionParameters.audioOffloadPreferences) && this.selectTextByDefault == trackSelectionParameters.selectTextByDefault && this.preferredTextLabels.equals(trackSelectionParameters.preferredTextLabels) && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager == trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager && this.ignoredTextSelectionFlags == trackSelectionParameters.ignoredTextSelectionFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.isPrioritizeImageOverVideoEnabled == trackSelectionParameters.isPrioritizeImageOverVideoEnabled && this.forceLowestBitrate == trackSelectionParameters.forceLowestBitrate && this.forceHighestSupportedBitrate == trackSelectionParameters.forceHighestSupportedBitrate && this.overrides.equals(trackSelectionParameters.overrides) && this.disabledTrackTypes.equals(trackSelectionParameters.disabledTrackTypes);
    }

    public int hashCode() {
        int i = this.maxVideoWidth;
        int i2 = this.maxVideoHeight;
        int i3 = this.maxVideoFrameRate;
        int i4 = this.maxVideoBitrate;
        int i5 = this.minVideoWidth;
        int i6 = this.minVideoHeight;
        int i7 = this.minVideoFrameRate;
        int i8 = this.minVideoBitrate;
        boolean z = this.viewportOrientationMayChange;
        int i9 = this.viewportWidth;
        int i10 = this.viewportHeight;
        boolean z2 = this.isViewportSizeLimitedByPhysicalDisplaySize;
        int hashCode = this.preferredVideoMimeTypes.hashCode();
        int hashCode2 = this.preferredVideoLabels.hashCode();
        int hashCode3 = this.preferredVideoLanguages.hashCode();
        int i11 = this.preferredVideoRoleFlags;
        int hashCode4 = this.preferredAudioLanguages.hashCode();
        int i12 = this.preferredAudioRoleFlags;
        int i13 = this.maxAudioChannelCount;
        int hashCode5 = this.preferredAudioLabels.hashCode();
        int i14 = this.maxAudioBitrate;
        int hashCode6 = this.preferredAudioMimeTypes.hashCode();
        int hashCode7 = this.audioOffloadPreferences.hashCode();
        boolean z3 = this.selectTextByDefault;
        int hashCode8 = this.preferredTextLanguages.hashCode();
        int i15 = this.preferredTextRoleFlags;
        boolean z4 = this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
        int hashCode9 = this.preferredTextLabels.hashCode();
        int i16 = this.ignoredTextSelectionFlags;
        boolean z5 = this.selectUndeterminedTextLanguage;
        boolean z6 = this.isPrioritizeImageOverVideoEnabled;
        boolean z7 = this.forceLowestBitrate;
        boolean z8 = this.forceHighestSupportedBitrate;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + (z ? 1 : 0)) * 31) + i9) * 31) + i10) * 31) + (z2 ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i11) * 31) + hashCode4) * 31) + i12) * 31) + i13) * 31) + hashCode5) * 31) + i14) * 31) + hashCode6) * 31) + hashCode7) * 31) + (z3 ? 1 : 0)) * 31) + hashCode8) * 31) + i15) * 31) + (z4 ? 1 : 0)) * 31) + hashCode9) * 31) + i16) * 31) + (z5 ? 1 : 0)) * 31) + (z6 ? 1 : 0)) * 31) + (z7 ? 1 : 0)) * 31) + (z8 ? 1 : 0)) * 31) + this.overrides.hashCode()) * 31) + this.disabledTrackTypes.hashCode();
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(unwrapAs, this.maxVideoWidth);
        bundle.putInt(getOutputMinFrameDurationlomOqCM, this.maxVideoHeight);
        bundle.putInt(getOutputSizes, this.maxVideoFrameRate);
        bundle.putInt(getOutputStallDurationlomOqCM, this.maxVideoBitrate);
        bundle.putInt(isOutputSupportedForhNQ4ISI, this.minVideoWidth);
        bundle.putInt(getValidOutputFormatsForInputhNQ4ISI, this.minVideoHeight);
        bundle.putInt(toString, this.minVideoFrameRate);
        bundle.putInt(isOutputSupportedFor, this.minVideoBitrate);
        bundle.putInt(resetTransaction, this.viewportWidth);
        bundle.putInt(AMEXKernela, this.viewportHeight);
        bundle.putBoolean(getHighSpeedVideoSizesFor, this.isViewportSizeLimitedByPhysicalDisplaySize);
        bundle.putBoolean(release, this.viewportOrientationMayChange);
        bundle.putStringArray(_BOUNDARY, (java.lang.String[]) this.preferredVideoMimeTypes.toArray(new java.lang.String[0]));
        bundle.putStringArray(f2743a, (java.lang.String[]) this.preferredVideoLanguages.toArray(new java.lang.String[0]));
        bundle.putStringArray(getARTIFICIAL_FRAME_PACKAGE_NAME, (java.lang.String[]) this.preferredVideoLabels.toArray(new java.lang.String[0]));
        bundle.putInt(d, this.preferredVideoRoleFlags);
        bundle.putStringArray(accessartificialFrame, (java.lang.String[]) this.preferredAudioLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(CoroutineDebuggingKt, this.preferredAudioRoleFlags);
        bundle.putInt(getOutputSizeshNQ4ISI, this.maxAudioChannelCount);
        bundle.putInt(getOutputStallDuration, this.maxAudioBitrate);
        bundle.putStringArray(coroutineCreation, (java.lang.String[]) this.preferredAudioLabels.toArray(new java.lang.String[0]));
        bundle.putStringArray(coroutineBoundary, (java.lang.String[]) this.preferredAudioMimeTypes.toArray(new java.lang.String[0]));
        bundle.putBoolean(AMEXKernel, this.selectTextByDefault);
        bundle.putStringArray(_CREATION, (java.lang.String[]) this.preferredTextLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(b, this.preferredTextRoleFlags);
        bundle.putBoolean(init, this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager);
        bundle.putStringArray(ArtificialStackFrames, (java.lang.String[]) this.preferredTextLabels.toArray(new java.lang.String[0]));
        bundle.putInt(getOutputFormats, this.ignoredTextSelectionFlags);
        bundle.putBoolean(kernelVersion, this.selectUndeterminedTextLanguage);
        bundle.putInt(Camera2StreamConfigurationMap, this.audioOffloadPreferences.audioOffloadMode);
        bundle.putBoolean(getInputSizeshNQ4ISI, this.audioOffloadPreferences.isGaplessSupportRequired);
        bundle.putBoolean(getOutputMinFrameDuration, this.audioOffloadPreferences.isSpeedChangeSupportRequired);
        bundle.putBundle(getHighSpeedVideoSizes, this.audioOffloadPreferences.toBundle());
        bundle.putBoolean(getInputFormats, this.isPrioritizeImageOverVideoEnabled);
        bundle.putBoolean(getHighSpeedVideoFpsRanges, this.forceLowestBitrate);
        bundle.putBoolean(getHighResolutionOutputSizeshNQ4ISI, this.forceHighestSupportedBitrate);
        bundle.putParcelableArrayList(c, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.overrides.values(), new com.google.common.base.Function() { // from class: androidx.media3.common.TrackSelectionParameters$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((androidx.media3.common.TrackSelectionOverride) obj).toBundle();
            }
        }));
        bundle.putIntArray(getHighSpeedVideoFpsRangesFor, com.google.common.primitives.Ints.toArray(this.disabledTrackTypes));
        return bundle;
    }

    public static androidx.media3.common.TrackSelectionParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(bundle).build();
    }
}
