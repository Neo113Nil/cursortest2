package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.MappingTrackSelector {
    private static final java.lang.String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final java.lang.String TAG = "DefaultTrackSelector";
    private com.google.android.exoplayer2.audio.AudioAttributes audioAttributes;
    public final android.content.Context context;
    private final boolean deviceIsTV;
    private final java.lang.Object lock;
    private com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
    private com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializer;
    private final com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory trackSelectionFactory;
    private static final com.google.common.collect.Ordering<java.lang.Integer> FORMAT_VALUE_ORDERING = com.google.common.collect.Ordering.from(new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.lambda$static$0((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    });
    private static final com.google.common.collect.Ordering<java.lang.Integer> NO_ORDER = com.google.common.collect.Ordering.from(new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.lambda$static$1((java.lang.Integer) obj, (java.lang.Integer) obj2);
        }
    });

    static /* synthetic */ int lambda$static$1(java.lang.Integer num, java.lang.Integer num2) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @java.lang.Deprecated
    public static final class ParametersBuilder extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder {
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder delegate;

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @java.lang.Deprecated
        public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
            return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
        }

        @java.lang.Deprecated
        public ParametersBuilder() {
            this.delegate = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder();
        }

        public ParametersBuilder(android.content.Context context) {
            this.delegate = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder set(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoSize(int i, int i2) {
            this.delegate.setMaxVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoSize(int i, int i2) {
            this.delegate.setMinVideoSize(i, i2);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setViewportSize(int i, int i2, boolean z) {
            this.delegate.setViewportSize(i, i2, z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeType(java.lang.String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguage(java.lang.String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeType(java.lang.String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguage(java.lang.String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextLanguages(java.lang.String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setSelectUndeterminedTextLanguage(boolean z) {
            this.delegate.setSelectUndeterminedTextLanguage(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setForceLowestBitrate(boolean z) {
            this.delegate.setForceLowestBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setForceHighestSupportedBitrate(boolean z) {
            this.delegate.setForceHighestSupportedBitrate(z);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverride(com.google.android.exoplayer2.source.TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setTrackTypeDisabled(int i, boolean z) {
            this.delegate.setTrackTypeDisabled(i, z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setTunnelingEnabled(boolean z) {
            this.delegate.setTunnelingEnabled(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z) {
            this.delegate.setAllowMultipleAdaptiveSelections(z);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setRendererDisabled(int i, boolean z) {
            this.delegate.setRendererDisabled(i, z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder setSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build() {
            return this.delegate.build();
        }
    }

    public static final class Parameters extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters> CREATOR;

        @java.lang.Deprecated
        public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT;
        public static final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final int FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = 1006;
        private static final int FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1015;
        private static final int FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = 1004;
        private static final int FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = 1005;
        private static final int FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = 1009;
        private static final int FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1014;
        private static final int FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = 1001;
        private static final int FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = 1002;
        private static final int FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = 1016;
        private static final int FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NCESSARY = 1003;
        private static final int FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = 1007;
        private static final int FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = 1000;
        private static final int FIELD_RENDERER_DISABLED_INDICES = 1013;
        private static final int FIELD_SELECTION_OVERRIDES = 1012;
        private static final int FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = 1010;
        private static final int FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = 1011;
        private static final int FIELD_TUNNELING_ENABLED = 1008;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final android.util.SparseBooleanArray rendererDisabledFlags;
        private final android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final android.util.SparseBooleanArray rendererDisabledFlags;
            private final android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public /* bridge */ /* synthetic */ com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set set) {
                return setDisabledTrackTypes((java.util.Set<java.lang.Integer>) set);
            }

            @java.lang.Deprecated
            public Builder() {
                this.selectionOverrides = new android.util.SparseArray<>();
                this.rendererDisabledFlags = new android.util.SparseBooleanArray();
                init();
            }

            public Builder(android.content.Context context) {
                super(context);
                this.selectionOverrides = new android.util.SparseArray<>();
                this.rendererDisabledFlags = new android.util.SparseBooleanArray();
                init();
            }

            private Builder(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(android.os.Bundle bundle) {
                super(bundle);
                init();
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1000), parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1001), parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1002), parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1014), parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1003), parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1004), parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1005), parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1006), parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1015), parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1016), parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1007), parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1008), parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1009), parameters.allowMultipleAdaptiveSelections));
                this.selectionOverrides = new android.util.SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1013)));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder set(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoSize(int i, int i2) {
                super.setMaxVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoSize(int i, int i2) {
                super.setMinVideoSize(i, i2);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedVideoConstraintsIfNecessary(boolean z) {
                this.exceedVideoConstraintsIfNecessary = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z) {
                this.allowVideoMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoNonSeamlessAdaptiveness(boolean z) {
                this.allowVideoNonSeamlessAdaptiveness = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
                super.setViewportSizeToPhysicalDisplaySize(context, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setViewportSize(int i, int i2, boolean z) {
                super.setViewportSize(i, i2, z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeType(java.lang.String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguage(java.lang.String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedAudioConstraintsIfNecessary(boolean z) {
                this.exceedAudioConstraintsIfNecessary = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z) {
                this.allowAudioMixedMimeTypeAdaptiveness = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z) {
                this.allowAudioMixedSampleRateAdaptiveness = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z) {
                this.allowAudioMixedChannelCountAdaptiveness = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeType(java.lang.String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z) {
                this.constrainAudioChannelCountToDeviceCapabilities = z;
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguage(java.lang.String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
                super.setSelectUndeterminedTextLanguage(z);
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setForceLowestBitrate(boolean z) {
                super.setForceLowestBitrate(z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setForceHighestSupportedBitrate(boolean z) {
                super.setForceHighestSupportedBitrate(z);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setTrackTypeDisabled(int i, boolean z) {
                super.setTrackTypeDisabled(i, z);
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setExceedRendererCapabilitiesIfNecessary(boolean z) {
                this.exceedRendererCapabilitiesIfNecessary = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setTunnelingEnabled(boolean z) {
                this.tunnelingEnabled = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setAllowMultipleAdaptiveSelections(boolean z) {
                this.allowMultipleAdaptiveSelections = z;
                return this;
            }

            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setRendererDisabled(int i, boolean z) {
                if (this.rendererDisabledFlags.get(i) == z) {
                    return this;
                }
                if (z) {
                    this.rendererDisabledFlags.put(i, true);
                } else {
                    this.rendererDisabledFlags.delete(i);
                }
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder setSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride) {
                java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new java.util.HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray) && com.google.android.exoplayer2.util.Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray) {
                java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides(int i) {
                java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
            public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build() {
                return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters(this);
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
            }

            private static android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> cloneSelectionOverrides(android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
                android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2 = new android.util.SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new java.util.HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(android.os.Bundle bundle) {
                com.google.common.collect.ImmutableList fromBundleList;
                android.util.SparseArray fromBundleSparseArray;
                int[] intArray = bundle.getIntArray(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1010));
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1011));
                if (parcelableArrayList == null) {
                    fromBundleList = com.google.common.collect.ImmutableList.of();
                } else {
                    fromBundleList = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.source.TrackGroupArray.CREATOR, parcelableArrayList);
                }
                android.util.SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.keyForField(1012));
                if (sparseParcelableArray == null) {
                    fromBundleSparseArray = new android.util.SparseArray();
                } else {
                    fromBundleSparseArray = com.google.android.exoplayer2.util.BundleableUtil.fromBundleSparseArray(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.CREATOR, sparseParcelableArray);
                }
                if (intArray == null || intArray.length != fromBundleList.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    setSelectionOverride(intArray[i], (com.google.android.exoplayer2.source.TrackGroupArray) fromBundleList.get(i), (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) fromBundleSparseArray.get(i));
                }
            }

            private android.util.SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new android.util.SparseBooleanArray();
                }
                android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }
        }

        static {
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder().build();
            DEFAULT_WITHOUT_CONTEXT = build;
            DEFAULT = build;
            CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.Bundleable.Creator
                public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters build2;
                    build2 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder(bundle).build();
                    return build2;
                }
            };
        }

        public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getDefaults(android.content.Context context) {
            return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder(context).build();
        }

        private Parameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @java.lang.Deprecated
        public boolean hasSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray) {
            java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride getSelectionOverride(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray) {
            java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUpon() {
            return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) obj;
            return super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = super.toBundle();
            bundle.putBoolean(keyForField(1000), this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1001), this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1002), this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(keyForField(1014), this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(keyForField(1003), this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1004), this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1005), this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(keyForField(1006), this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(keyForField(1015), this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(keyForField(1016), this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(keyForField(1007), this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(keyForField(1008), this.tunnelingEnabled);
            bundle.putBoolean(keyForField(1009), this.allowMultipleAdaptiveSelections);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(keyForField(1013), getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static void putSelectionOverridesToBundle(android.os.Bundle bundle, android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.util.SparseArray sparseArray2 = new android.util.SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (java.util.Map.Entry<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(java.lang.Integer.valueOf(keyAt));
                }
                bundle.putIntArray(keyForField(1010), com.google.common.primitives.Ints.toArray(arrayList));
                bundle.putParcelableArrayList(keyForField(1011), com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(keyForField(1012), com.google.android.exoplayer2.util.BundleableUtil.toBundleSparseArray(sparseArray2));
            }
        }

        private static int[] getKeysFromSparseBooleanArray(android.util.SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static boolean areRendererDisabledFlagsEqual(android.util.SparseBooleanArray sparseBooleanArray, android.util.SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray, android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (java.util.Map.Entry<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> entry : map.entrySet()) {
                com.google.android.exoplayer2.source.TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !com.google.android.exoplayer2.util.Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class SelectionOverride implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride.lambda$static$0(bundle);
            }
        };
        private static final int FIELD_GROUP_INDEX = 0;
        private static final int FIELD_TRACKS = 1;
        private static final int FIELD_TRACK_TYPE = 2;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.groupIndex = i;
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.tracks = copyOf;
            this.length = iArr.length;
            this.type = i2;
            java.util.Arrays.sort(copyOf);
        }

        public boolean containsTrack(int i) {
            for (int i2 : this.tracks) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + java.util.Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && java.util.Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(keyForField(0), this.groupIndex);
            bundle.putIntArray(keyForField(1), this.tracks);
            bundle.putInt(keyForField(2), this.type);
            return bundle;
        }

        static /* synthetic */ com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride lambda$static$0(android.os.Bundle bundle) {
            boolean z = false;
            int i = bundle.getInt(keyForField(0), -1);
            int[] intArray = bundle.getIntArray(keyForField(1));
            int i2 = bundle.getInt(keyForField(2), -1);
            if (i >= 0 && i2 >= 0) {
                z = true;
            }
            com.google.android.exoplayer2.util.Assertions.checkArgument(z);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(intArray);
            return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride(i, intArray, i2);
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    static /* synthetic */ int lambda$static$0(java.lang.Integer num, java.lang.Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    @java.lang.Deprecated
    public DefaultTrackSelector() {
        this(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT, new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(android.content.Context context) {
        this(context, new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(android.content.Context context, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory factory) {
        this(context, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(context), factory);
    }

    public DefaultTrackSelector(android.content.Context context, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory());
    }

    @java.lang.Deprecated
    public DefaultTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (android.content.Context) null);
    }

    public DefaultTrackSelector(android.content.Context context, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    private DefaultTrackSelector(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory factory, android.content.Context context) {
        this.lock = new java.lang.Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) {
            this.parameters = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.DEFAULT_WITHOUT_CONTEXT : com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = com.google.android.exoplayer2.audio.AudioAttributes.DEFAULT;
        boolean z = context != null && com.google.android.exoplayer2.util.Util.isTv(context);
        this.deviceIsTV = z;
        if (!z && context != null && com.google.android.exoplayer2.util.Util.SDK_INT >= 32) {
            this.spatializer = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void release() {
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.release();
            }
        }
        super.release();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters getParameters() {
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) {
            setParametersInternal((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) trackSelectionParameters);
        }
        setParametersInternal(new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder().set(trackSelectionParameters).build());
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setAudioAttributes(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes) {
        boolean z;
        synchronized (this.lock) {
            z = !this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (z) {
            maybeInvalidateForAudioChannelCountConstraints();
        }
    }

    @java.lang.Deprecated
    public void setParameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public void setParameters(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    public com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    private void setParametersInternal(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) {
        boolean z;
        com.google.android.exoplayer2.util.Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            z = !this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (z) {
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
                com.google.android.exoplayer2.util.Log.w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
            }
            invalidate();
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    protected final android.util.Pair<com.google.android.exoplayer2.RendererConfiguration[], com.google.android.exoplayer2.trackselection.ExoTrackSelection[]> selectTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            parameters = this.parameters;
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && com.google.android.exoplayer2.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                spatializerWrapperV32.ensureInitialized(this, (android.os.Looper) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(android.os.Looper.myLooper()));
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] selectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, selectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, selectAllTracks);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(rendererType))) {
                selectAllTracks[i] = null;
            }
        }
        com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections = this.trackSelectionFactory.createTrackSelections(selectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurationArr = new com.google.android.exoplayer2.RendererConfiguration[rendererCount];
        for (int i2 = 0; i2 < rendererCount; i2++) {
            rendererConfigurationArr[i2] = (parameters.getRendererDisabled(i2) || parameters.disabledTrackTypes.contains(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i2))) || (mappedTrackInfo.getRendererType(i2) != -2 && createTrackSelections[i2] == null)) ? null : com.google.android.exoplayer2.RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, createTrackSelections);
        }
        return android.util.Pair.create(rendererConfigurationArr, createTrackSelections);
    }

    protected com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] selectAllTracks(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        int rendererCount = mappedTrackInfo.getRendererCount();
        com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr = new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[rendererCount];
        android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (selectVideoTrack != null) {
            definitionArr[((java.lang.Integer) selectVideoTrack.second).intValue()] = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) selectVideoTrack.first;
        }
        android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (selectAudioTrack != null) {
            definitionArr[((java.lang.Integer) selectAudioTrack.second).intValue()] = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) selectAudioTrack.first;
        }
        android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, selectAudioTrack == null ? null : ((com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) selectAudioTrack.first).group.getFormat(((com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) selectAudioTrack.first).tracks[0]).language);
        if (selectTextTrack != null) {
            definitionArr[((java.lang.Integer) selectTextTrack.second).intValue()] = (com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition) selectTextTrack.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
        return definitionArr;
    }

    protected android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectVideoTrack(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        return selectTracksForType(2, mappedTrackInfo, iArr, new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda2
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr3) {
                java.util.List createForTrackGroup;
                createForTrackGroup = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i, trackGroup, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.this, iArr3, iArr2[i]);
                return createForTrackGroup;
            }
        }, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda3
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    protected android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectAudioTrack(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        final boolean z = false;
        int i = 0;
        while (true) {
            if (i < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda5
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i2, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr3) {
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.this.m5440xc9e179dc(parameters, z, i2, trackGroup, iArr3);
            }
        }, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    /* renamed from: lambda$selectAudioTrack$3$com-google-android-exoplayer2-trackselection-DefaultTrackSelector, reason: not valid java name */
    /* synthetic */ java.util.List m5440xc9e179dc(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, boolean z, int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr) {
        return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo.createForTrackGroup(i, trackGroup, parameters, iArr, z, new com.google.common.base.Predicate() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                boolean isAudioFormatWithinAudioChannelCountConstraints;
                isAudioFormatWithinAudioChannelCountConstraints = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.this.isAudioFormatWithinAudioChannelCountConstraints((com.google.android.exoplayer2.Format) obj);
                return isAudioFormatWithinAudioChannelCountConstraints;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(com.google.android.exoplayer2.Format format) {
        boolean z;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV322;
        synchronized (this.lock) {
            z = !this.parameters.constrainAudioChannelCountToDeviceCapabilities || this.deviceIsTV || format.channelCount <= 2 || (isDolbyAudio(format) && (com.google.android.exoplayer2.util.Util.SDK_INT < 32 || (spatializerWrapperV322 = this.spatializer) == null || !spatializerWrapperV322.isSpatializationSupported())) || (com.google.android.exoplayer2.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format));
        }
        return z;
    }

    protected android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTextTrack(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, final java.lang.String str) throws com.google.android.exoplayer2.ExoPlaybackException {
        return selectTracksForType(3, mappedTrackInfo, iArr, new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda7
            @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final java.util.List create(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr2) {
                java.util.List createForTrackGroup;
                createForTrackGroup = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i, trackGroup, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.this, iArr2, str);
                return createForTrackGroup;
            }
        }, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo.compareSelections((java.util.List) obj, (java.util.List) obj2);
            }
        });
    }

    protected com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition selectOtherTrack(int i, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, int[][] iArr, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.source.TrackGroup trackGroup = null;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
            com.google.android.exoplayer2.source.TrackGroup trackGroup2 = trackGroupArray.get(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (isSupported(iArr2[i4], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore2 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore(trackGroup2.getFormat(i4), iArr2[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition(trackGroup, i2);
    }

    private <T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> android.util.Pair<com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition, java.lang.Integer> selectTracksForType(int i, com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory<T> factory, java.util.Comparator<java.util.List<T>> comparator) {
        int i2;
        java.util.RandomAccess randomAccess;
        com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int rendererCount = mappedTrackInfo.getRendererCount();
        int i3 = 0;
        while (i3 < rendererCount) {
            if (i == mappedTrackInfo2.getRendererType(i3)) {
                com.google.android.exoplayer2.source.TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i3);
                for (int i4 = 0; i4 < trackGroups.length; i4++) {
                    com.google.android.exoplayer2.source.TrackGroup trackGroup = trackGroups.get(i4);
                    java.util.List<T> create = factory.create(i3, trackGroup, iArr[i3][i4]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i5 = 0;
                    while (i5 < trackGroup.length) {
                        T t = create.get(i5);
                        int selectionEligibility = t.getSelectionEligibility();
                        if (zArr[i5] || selectionEligibility == 0) {
                            i2 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccess = com.google.common.collect.ImmutableList.of(t);
                                i2 = rendererCount;
                            } else {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(t);
                                int i6 = i5 + 1;
                                while (i6 < trackGroup.length) {
                                    T t2 = create.get(i6);
                                    int i7 = rendererCount;
                                    if (t2.getSelectionEligibility() == 2 && t.isCompatibleForAdaptationWith(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    rendererCount = i7;
                                }
                                i2 = rendererCount;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5++;
                        rendererCount = i2;
                    }
                }
            }
            i3++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.List list = (java.util.List) java.util.Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) list.get(i8)).trackIndex;
        }
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo trackInfo = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo) list.get(0);
        return android.util.Pair.create(new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), java.lang.Integer.valueOf(trackInfo.rendererIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z;
        com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            z = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && com.google.android.exoplayer2.util.Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
        }
        if (z) {
            invalidate();
        }
    }

    private static void applyTrackSelectionOverrides(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), trackSelectionParameters, hashMap);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, hashMap);
        for (int i2 = 0; i2 < rendererCount; i2++) {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) hashMap.get(java.lang.Integer.valueOf(mappedTrackInfo.getRendererType(i2)));
            if (trackSelectionOverride != null) {
                definitionArr[i2] = (trackSelectionOverride.trackIndices.isEmpty() || mappedTrackInfo.getTrackGroups(i2).indexOf(trackSelectionOverride.mediaTrackGroup) == -1) ? null : new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, com.google.common.primitives.Ints.toArray(trackSelectionOverride.trackIndices));
            }
        }
    }

    private static void collectTrackSelectionOverrides(com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters, java.util.Map<java.lang.Integer, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map) {
        com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride;
        for (int i = 0; i < trackGroupArray.length; i++) {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(java.lang.Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(java.lang.Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    private static void applyLegacyRendererOverrides(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            com.google.android.exoplayer2.source.TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void maybeConfigureRenderersForTunneling(com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, com.google.android.exoplayer2.RendererConfiguration[] rendererConfigurationArr, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < mappedTrackInfo.getRendererCount(); i3++) {
            int rendererType = mappedTrackInfo.getRendererType(i3);
            com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i3], mappedTrackInfo.getTrackGroups(i3), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
        }
        z = true;
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            com.google.android.exoplayer2.RendererConfiguration rendererConfiguration = new com.google.android.exoplayer2.RendererConfiguration(true);
            rendererConfigurationArr[i2] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int indexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (com.google.android.exoplayer2.RendererCapabilities.CC.getTunnelingSupport(iArr[indexOf][exoTrackSelection.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    protected static boolean isSupported(int i, boolean z) {
        int formatSupport = com.google.android.exoplayer2.RendererCapabilities.CC.getFormatSupport(i);
        return formatSupport == 4 || (z && formatSupport == 3);
    }

    protected static java.lang.String normalizeUndeterminedLanguageToNull(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int getFormatLanguageScore(com.google.android.exoplayer2.Format format, java.lang.String str, boolean z) {
        if (!android.text.TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        java.lang.String normalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        java.lang.String normalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (normalizeUndeterminedLanguageToNull2 == null || normalizeUndeterminedLanguageToNull == null) {
            return (z && normalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (normalizeUndeterminedLanguageToNull2.startsWith(normalizeUndeterminedLanguageToNull) || normalizeUndeterminedLanguageToNull.startsWith(normalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return com.google.android.exoplayer2.util.Util.splitAtFirst(normalizeUndeterminedLanguageToNull2, "-")[0].equals(com.google.android.exoplayer2.util.Util.splitAtFirst(normalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(com.google.android.exoplayer2.source.TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            for (int i4 = 0; i4 < trackGroup.length; i4++) {
                com.google.android.exoplayer2.Format format = trackGroup.getFormat(i4);
                if (format.width > 0 && format.height > 0) {
                    android.graphics.Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z, i, i2, format.width, format.height);
                    int i5 = format.width * format.height;
                    if (format.width >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && format.height >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i5 < i3) {
                        i3 = i5;
                    }
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.graphics.Point getMaxVideoSizeInViewport(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
        }
        i2 = i;
        i = i2;
        int i5 = i3 * i;
        int i6 = i4 * i2;
        if (i5 >= i6) {
            return new android.graphics.Point(i2, com.google.android.exoplayer2.util.Util.ceilDivide(i6, i3));
        }
        return new android.graphics.Point(com.google.android.exoplayer2.util.Util.ceilDivide(i5, i4), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i2) {
        if (i == 0 || i != i2) {
            return java.lang.Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        str.hashCode();
        switch (str) {
        }
        return 0;
    }

    private static boolean isDolbyAudio(com.google.android.exoplayer2.Format format) {
        if (format.sampleMimeType == null) {
            return false;
        }
        java.lang.String str = format.sampleMimeType;
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class TrackInfo<T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> {
        public final com.google.android.exoplayer2.Format format;
        public final int rendererIndex;
        public final com.google.android.exoplayer2.source.TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<T>> {
            java.util.List<T> create(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t);

        public TrackInfo(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int i2) {
            this.rendererIndex = i;
            this.trackGroup = trackGroup;
            this.trackIndex = i2;
            this.format = trackGroup.getFormat(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class VideoTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> createForTrackGroup(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, int i2) {
            int maxVideoPixelsToRetainForViewport = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                int pixelCount = trackGroup.getFormat(i3).getPixelCount();
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo(i, trackGroup, i3, parameters, iArr[i3], i2, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        public VideoTrackInfo(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int i2, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int i3, int i4, boolean z) {
            super(i, trackGroup, i2);
            this.parameters = parameters;
            int i5 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i4 & i5) != 0;
            this.isWithinMaxConstraints = z && (this.format.width == -1 || this.format.width <= parameters.maxVideoWidth) && ((this.format.height == -1 || this.format.height <= parameters.maxVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate <= ((float) parameters.maxVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxVideoBitrate)));
            this.isWithinMinConstraints = z && (this.format.width == -1 || this.format.width >= parameters.minVideoWidth) && ((this.format.height == -1 || this.format.height >= parameters.minVideoHeight) && ((this.format.frameRate == -1.0f || this.format.frameRate >= ((float) parameters.minVideoFrameRate)) && (this.format.bitrate == -1 || this.format.bitrate >= parameters.minVideoBitrate)));
            this.isWithinRendererCapabilities = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i3, false);
            this.bitrate = this.format.bitrate;
            this.pixelCount = this.format.getPixelCount();
            this.preferredRoleFlagsScore = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            int i6 = 0;
            while (true) {
                if (i6 >= parameters.preferredVideoMimeTypes.size()) {
                    i6 = Integer.MAX_VALUE;
                    break;
                } else if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredVideoMimeTypes.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            this.preferredMimeTypeMatchIndex = i6;
            this.usesPrimaryDecoder = com.google.android.exoplayer2.RendererCapabilities.CC.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = com.google.android.exoplayer2.RendererCapabilities.CC.getHardwareAccelerationSupport(i3) == 64;
            this.codecPreferenceScore = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i3, i5);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo) {
            return (this.allowMixedMimeTypes || com.google.android.exoplayer2.util.Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) && (this.parameters.allowVideoMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration));
        }

        private int evaluateSelectionEligibility(int i, int i2) {
            if ((this.format.roleFlags & 16384) != 0 || !com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (this.isWithinMaxConstraints || this.parameters.exceedVideoConstraintsIfNecessary) {
                return (!com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (i & i2) == 0) ? 1 : 2;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            com.google.common.collect.ComparisonChain compareFalseFirst = com.google.common.collect.ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(java.lang.Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), com.google.common.collect.Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                compareFalseFirst = compareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return compareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo videoTrackInfo2) {
            com.google.common.collect.Ordering reverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            return com.google.common.collect.ComparisonChain.start().compare(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), videoTrackInfo.parameters.forceLowestBitrate ? com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : com.google.android.exoplayer2.trackselection.DefaultTrackSelector.NO_ORDER).compare(java.lang.Integer.valueOf(videoTrackInfo.pixelCount), java.lang.Integer.valueOf(videoTrackInfo2.pixelCount), reverse).compare(java.lang.Integer.valueOf(videoTrackInfo.bitrate), java.lang.Integer.valueOf(videoTrackInfo2.bitrate), reverse).result();
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> list, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo> list2) {
            return com.google.common.collect.ComparisonChain.start().compare((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }), (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }), new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareNonQualityPreferences;
                    compareNonQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareNonQualityPreferences;
                }
            }).compare(list.size(), list2.size()).compare((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }), (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) java.util.Collections.max(list2, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }), new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    int compareQualityPreferences;
                    compareQualityPreferences = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj, (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.VideoTrackInfo) obj2);
                    return compareQualityPreferences;
                }
            }).result();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class AudioTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final java.lang.String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> createForTrackGroup(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, boolean z, com.google.common.base.Predicate<com.google.android.exoplayer2.Format> predicate) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo(i, trackGroup, i2, parameters, iArr[i2], z, predicate));
            }
            return builder.build();
        }

        public AudioTrackInfo(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int i2, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int i3, boolean z, com.google.common.base.Predicate<com.google.android.exoplayer2.Format> predicate) {
            super(i, trackGroup, i2);
            int i4;
            int i5;
            int i6;
            this.parameters = parameters;
            this.language = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 >= parameters.preferredAudioLanguages.size()) {
                    i7 = Integer.MAX_VALUE;
                    i5 = 0;
                    break;
                } else {
                    i5 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i7), false);
                    if (i5 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = i5;
            this.preferredRoleFlagsScore = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            this.hasMainOrNoRoleFlag = this.format.roleFlags == 0 || (this.format.roleFlags & 1) != 0;
            this.isDefaultSelectionFlag = (this.format.selectionFlags & 1) != 0;
            this.channelCount = this.format.channelCount;
            this.sampleRate = this.format.sampleRate;
            this.bitrate = this.format.bitrate;
            this.isWithinConstraints = (this.format.bitrate == -1 || this.format.bitrate <= parameters.maxAudioBitrate) && (this.format.channelCount == -1 || this.format.channelCount <= parameters.maxAudioChannelCount) && predicate.apply(this.format);
            java.lang.String[] systemLanguageCodes = com.google.android.exoplayer2.util.Util.getSystemLanguageCodes();
            int i8 = 0;
            while (true) {
                if (i8 >= systemLanguageCodes.length) {
                    i8 = Integer.MAX_VALUE;
                    i6 = 0;
                    break;
                } else {
                    i6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i8], false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i8;
            this.localeLanguageScore = i6;
            int i9 = 0;
            while (true) {
                if (i9 < parameters.preferredAudioMimeTypes.size()) {
                    if (this.format.sampleMimeType != null && this.format.sampleMimeType.equals(parameters.preferredAudioMimeTypes.get(i9))) {
                        i4 = i9;
                        break;
                    }
                    i9++;
                } else {
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i4;
            this.usesPrimaryDecoder = com.google.android.exoplayer2.RendererCapabilities.CC.getDecoderSupport(i3) == 128;
            this.usesHardwareAcceleration = com.google.android.exoplayer2.RendererCapabilities.CC.getHardwareAccelerationSupport(i3) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i3, z);
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            return (this.parameters.allowAudioMixedChannelCountAdaptiveness || (this.format.channelCount != -1 && this.format.channelCount == audioTrackInfo.format.channelCount)) && (this.parameters.allowAudioMixedMimeTypeAdaptiveness || (this.format.sampleMimeType != null && android.text.TextUtils.equals(this.format.sampleMimeType, audioTrackInfo.format.sampleMimeType))) && ((this.parameters.allowAudioMixedSampleRateAdaptiveness || (this.format.sampleRate != -1 && this.format.sampleRate == audioTrackInfo.format.sampleRate)) && (this.parameters.allowAudioMixedDecoderSupportAdaptiveness || (this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration)));
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo audioTrackInfo) {
            com.google.common.collect.Ordering reverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING : com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            com.google.common.collect.ComparisonChain compare = com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(java.lang.Integer.valueOf(this.preferredLanguageIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredLanguageIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(java.lang.Integer.valueOf(this.localeLanguageMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(java.lang.Integer.valueOf(this.preferredMimeTypeMatchIndex), java.lang.Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), com.google.common.collect.Ordering.natural().reverse()).compare(java.lang.Integer.valueOf(this.bitrate), java.lang.Integer.valueOf(audioTrackInfo.bitrate), this.parameters.forceLowestBitrate ? com.google.android.exoplayer2.trackselection.DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : com.google.android.exoplayer2.trackselection.DefaultTrackSelector.NO_ORDER).compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compare(java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(audioTrackInfo.channelCount), reverse).compare(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(audioTrackInfo.sampleRate), reverse);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.bitrate);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(audioTrackInfo.bitrate);
            if (!com.google.android.exoplayer2.util.Util.areEqual(this.language, audioTrackInfo.language)) {
                reverse = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.NO_ORDER;
            }
            return compare.compare(valueOf, valueOf2, reverse).result();
        }

        private int evaluateSelectionEligibility(int i, boolean z) {
            if (!com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (this.isWithinConstraints || this.parameters.exceedAudioConstraintsIfNecessary) {
                return (!com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i, false) || !this.isWithinConstraints || this.format.bitrate == -1 || this.parameters.forceHighestSupportedBitrate || this.parameters.forceLowestBitrate || (!this.parameters.allowMultipleAdaptiveSelections && z)) ? 1 : 2;
            }
            return 0;
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> list, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo> list2) {
            return ((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list)).compareTo((com.google.android.exoplayer2.trackselection.DefaultTrackSelector.AudioTrackInfo) java.util.Collections.max(list2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TextTrackInfo extends com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            return false;
        }

        public static com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> createForTrackGroup(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int[] iArr, java.lang.String str) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                builder.add((com.google.common.collect.ImmutableList.Builder) new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo(i, trackGroup, i2, parameters, iArr[i2], str));
            }
            return builder.build();
        }

        public TextTrackInfo(int i, com.google.android.exoplayer2.source.TrackGroup trackGroup, int i2, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters parameters, int i3, java.lang.String str) {
            super(i, trackGroup, i2);
            com.google.common.collect.ImmutableList<java.lang.String> immutableList;
            int i4;
            int i5 = 0;
            this.isWithinRendererCapabilities = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i3, false);
            int i6 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i6 & 1) != 0;
            this.isForced = (i6 & 2) != 0;
            if (parameters.preferredTextLanguages.isEmpty()) {
                immutableList = com.google.common.collect.ImmutableList.of("");
            } else {
                immutableList = parameters.preferredTextLanguages;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= immutableList.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                } else {
                    i4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, immutableList.get(i7), parameters.selectUndeterminedTextLanguage);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.preferredLanguageIndex = i7;
            this.preferredLanguageScore = i4;
            int roleFlagMatchScore = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.getFormatLanguageScore(this.format, str, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore;
            boolean z = i4 > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore > 0);
            if (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i3, parameters.exceedRendererCapabilitiesIfNecessary) && z) {
                i5 = 1;
            }
            this.selectionEligibility = i5;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo textTrackInfo) {
            com.google.common.collect.ComparisonChain compare = com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(java.lang.Integer.valueOf(this.preferredLanguageIndex), java.lang.Integer.valueOf(textTrackInfo.preferredLanguageIndex), com.google.common.collect.Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(java.lang.Boolean.valueOf(this.isForced), java.lang.Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? com.google.common.collect.Ordering.natural() : com.google.common.collect.Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                compare = compare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return compare.result();
        }

        public static int compareSelections(java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> list, java.util.List<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    private static final class OtherTrackScore implements java.lang.Comparable<com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(com.google.android.exoplayer2.Format format, int i) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.isSupported(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(com.google.android.exoplayer2.trackselection.DefaultTrackSelector.OtherTrackScore otherTrackScore) {
            return com.google.common.collect.ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    private static class SpatializerWrapperV32 {
        private android.os.Handler handler;
        private android.media.Spatializer.OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final android.media.Spatializer spatializer;

        public static com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32 tryCreateInstance(android.content.Context context) {
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32(audioManager.getSpatializer());
        }

        private SpatializerWrapperV32(android.media.Spatializer spatializer) {
            this.spatializer = spatializer;
            this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        }

        public void ensureInitialized(final com.google.android.exoplayer2.trackselection.DefaultTrackSelector defaultTrackSelector, android.os.Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new android.media.Spatializer.OnSpatializerStateChangedListener(this) { // from class: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerEnabledChanged(android.media.Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                    public void onSpatializerAvailableChanged(android.media.Spatializer spatializer, boolean z) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                android.os.Handler handler = new android.os.Handler(looper);
                this.handler = handler;
                android.media.Spatializer spatializer = this.spatializer;
                java.util.Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0(handler), this.listener);
            }
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean canBeSpatialized(com.google.android.exoplayer2.audio.AudioAttributes audioAttributes, com.google.android.exoplayer2.Format format) {
            android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(com.google.android.exoplayer2.util.Util.getAudioTrackChannelConfig(("audio/eac3-joc".equals(format.sampleMimeType) && format.channelCount == 16) ? 12 : format.channelCount));
            if (format.sampleRate != -1) {
                channelMask.setSampleRate(format.sampleRate);
            }
            return this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public void release() {
            android.media.Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.listener;
            if (onSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((android.os.Handler) com.google.android.exoplayer2.util.Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }
}
