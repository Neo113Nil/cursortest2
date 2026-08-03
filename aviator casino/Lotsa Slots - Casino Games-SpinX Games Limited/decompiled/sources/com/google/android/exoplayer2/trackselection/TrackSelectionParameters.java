package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public class TrackSelectionParameters implements com.google.android.exoplayer2.Bundleable {

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.trackselection.TrackSelectionParameters> CREATOR;

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.trackselection.TrackSelectionParameters DEFAULT;
    public static final com.google.android.exoplayer2.trackselection.TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final int FIELD_DISABLED_TRACK_TYPE = 24;
    private static final int FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = 22;
    private static final int FIELD_FORCE_LOWEST_BITRATE = 21;
    private static final int FIELD_IGNORED_TEXT_SELECTION_FLAGS = 26;
    private static final int FIELD_MAX_AUDIO_BITRATE = 19;
    private static final int FIELD_MAX_AUDIO_CHANNEL_COUNT = 18;
    private static final int FIELD_MAX_VIDEO_BITRATE = 9;
    private static final int FIELD_MAX_VIDEO_FRAMERATE = 8;
    private static final int FIELD_MAX_VIDEO_HEIGHT = 7;
    private static final int FIELD_MAX_VIDEO_WIDTH = 6;
    private static final int FIELD_MIN_VIDEO_BITRATE = 13;
    private static final int FIELD_MIN_VIDEO_FRAMERATE = 12;
    private static final int FIELD_MIN_VIDEO_HEIGHT = 11;
    private static final int FIELD_MIN_VIDEO_WIDTH = 10;
    private static final int FIELD_PREFERRED_AUDIO_LANGUAGES = 1;
    private static final int FIELD_PREFERRED_AUDIO_MIME_TYPES = 20;
    private static final int FIELD_PREFERRED_AUDIO_ROLE_FLAGS = 2;
    private static final int FIELD_PREFERRED_TEXT_LANGUAGES = 3;
    private static final int FIELD_PREFERRED_TEXT_ROLE_FLAGS = 4;
    private static final int FIELD_PREFERRED_VIDEO_MIMETYPES = 17;
    private static final int FIELD_PREFERRED_VIDEO_ROLE_FLAGS = 25;
    private static final int FIELD_SELECTION_OVERRIDES = 23;
    private static final int FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = 5;
    private static final int FIELD_VIEWPORT_HEIGHT = 15;
    private static final int FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = 16;
    private static final int FIELD_VIEWPORT_WIDTH = 14;
    public final com.google.common.collect.ImmutableSet<java.lang.Integer> disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
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
    public final com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectUndeterminedTextLanguage;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public static class Builder {
        private java.util.HashSet<java.lang.Integer> disabledTrackTypes;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int ignoredTextSelectionFlags;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private java.util.HashMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioLanguages;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredTextLanguages;
        private int preferredTextRoleFlags;
        private com.google.common.collect.ImmutableList<java.lang.String> preferredVideoMimeTypes;
        private int preferredVideoRoleFlags;
        private boolean selectUndeterminedTextLanguage;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        @java.lang.Deprecated
        public Builder() {
            this.maxVideoWidth = Integer.MAX_VALUE;
            this.maxVideoHeight = Integer.MAX_VALUE;
            this.maxVideoFrameRate = Integer.MAX_VALUE;
            this.maxVideoBitrate = Integer.MAX_VALUE;
            this.viewportWidth = Integer.MAX_VALUE;
            this.viewportHeight = Integer.MAX_VALUE;
            this.viewportOrientationMayChange = true;
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.of();
            this.preferredVideoRoleFlags = 0;
            this.preferredAudioLanguages = com.google.common.collect.ImmutableList.of();
            this.preferredAudioRoleFlags = 0;
            this.maxAudioChannelCount = Integer.MAX_VALUE;
            this.maxAudioBitrate = Integer.MAX_VALUE;
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.of();
            this.preferredTextLanguages = com.google.common.collect.ImmutableList.of();
            this.preferredTextRoleFlags = 0;
            this.ignoredTextSelectionFlags = 0;
            this.selectUndeterminedTextLanguage = false;
            this.forceLowestBitrate = false;
            this.forceHighestSupportedBitrate = false;
            this.overrides = new java.util.HashMap<>();
            this.disabledTrackTypes = new java.util.HashSet<>();
        }

        public Builder(android.content.Context context) {
            this();
            setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            setViewportSizeToPhysicalDisplaySize(context, true);
        }

        protected Builder(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected Builder(android.os.Bundle bundle) {
            com.google.common.collect.ImmutableList fromBundleList;
            this.maxVideoWidth = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(6), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoWidth);
            this.maxVideoHeight = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(7), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoHeight);
            this.maxVideoFrameRate = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(8), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoFrameRate);
            this.maxVideoBitrate = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(9), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxVideoBitrate);
            this.minVideoWidth = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(10), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoWidth);
            this.minVideoHeight = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(11), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoHeight);
            this.minVideoFrameRate = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(12), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoFrameRate);
            this.minVideoBitrate = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(13), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.minVideoBitrate);
            this.viewportWidth = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(14), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportWidth);
            this.viewportHeight = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(15), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportHeight);
            this.viewportOrientationMayChange = bundle.getBoolean(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(16), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.viewportOrientationMayChange);
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(17)), new java.lang.String[0]));
            this.preferredVideoRoleFlags = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(25), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredVideoRoleFlags);
            this.preferredAudioLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(1)), new java.lang.String[0]));
            this.preferredAudioRoleFlags = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(2), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredAudioRoleFlags);
            this.maxAudioChannelCount = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(18), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxAudioChannelCount);
            this.maxAudioBitrate = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(19), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.maxAudioBitrate);
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(20)), new java.lang.String[0]));
            this.preferredTextLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getStringArray(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(3)), new java.lang.String[0]));
            this.preferredTextRoleFlags = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(4), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.preferredTextRoleFlags);
            this.ignoredTextSelectionFlags = bundle.getInt(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(26), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.ignoredTextSelectionFlags);
            this.selectUndeterminedTextLanguage = bundle.getBoolean(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(5), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.selectUndeterminedTextLanguage);
            this.forceLowestBitrate = bundle.getBoolean(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(21), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.forceLowestBitrate);
            this.forceHighestSupportedBitrate = bundle.getBoolean(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(22), com.google.android.exoplayer2.trackselection.TrackSelectionParameters.DEFAULT_WITHOUT_CONTEXT.forceHighestSupportedBitrate);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(23));
            if (parcelableArrayList == null) {
                fromBundleList = com.google.common.collect.ImmutableList.of();
            } else {
                fromBundleList = com.google.android.exoplayer2.util.BundleableUtil.fromBundleList(com.google.android.exoplayer2.trackselection.TrackSelectionOverride.CREATOR, parcelableArrayList);
            }
            this.overrides = new java.util.HashMap<>();
            for (int i = 0; i < fromBundleList.size(); i++) {
                com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) fromBundleList.get(i);
                this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
            int[] iArr = (int[]) com.google.common.base.MoreObjects.firstNonNull(bundle.getIntArray(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.keyForField(24)), new int[0]);
            this.disabledTrackTypes = new java.util.HashSet<>();
            for (int i2 : iArr) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i2));
            }
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
        private void init(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            this.maxVideoWidth = trackSelectionParameters.maxVideoWidth;
            this.maxVideoHeight = trackSelectionParameters.maxVideoHeight;
            this.maxVideoFrameRate = trackSelectionParameters.maxVideoFrameRate;
            this.maxVideoBitrate = trackSelectionParameters.maxVideoBitrate;
            this.minVideoWidth = trackSelectionParameters.minVideoWidth;
            this.minVideoHeight = trackSelectionParameters.minVideoHeight;
            this.minVideoFrameRate = trackSelectionParameters.minVideoFrameRate;
            this.minVideoBitrate = trackSelectionParameters.minVideoBitrate;
            this.viewportWidth = trackSelectionParameters.viewportWidth;
            this.viewportHeight = trackSelectionParameters.viewportHeight;
            this.viewportOrientationMayChange = trackSelectionParameters.viewportOrientationMayChange;
            this.preferredVideoMimeTypes = trackSelectionParameters.preferredVideoMimeTypes;
            this.preferredVideoRoleFlags = trackSelectionParameters.preferredVideoRoleFlags;
            this.preferredAudioLanguages = trackSelectionParameters.preferredAudioLanguages;
            this.preferredAudioRoleFlags = trackSelectionParameters.preferredAudioRoleFlags;
            this.maxAudioChannelCount = trackSelectionParameters.maxAudioChannelCount;
            this.maxAudioBitrate = trackSelectionParameters.maxAudioBitrate;
            this.preferredAudioMimeTypes = trackSelectionParameters.preferredAudioMimeTypes;
            this.preferredTextLanguages = trackSelectionParameters.preferredTextLanguages;
            this.preferredTextRoleFlags = trackSelectionParameters.preferredTextRoleFlags;
            this.ignoredTextSelectionFlags = trackSelectionParameters.ignoredTextSelectionFlags;
            this.selectUndeterminedTextLanguage = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.forceLowestBitrate = trackSelectionParameters.forceLowestBitrate;
            this.forceHighestSupportedBitrate = trackSelectionParameters.forceHighestSupportedBitrate;
            this.disabledTrackTypes = new java.util.HashSet<>(trackSelectionParameters.disabledTrackTypes);
            this.overrides = new java.util.HashMap<>(trackSelectionParameters.overrides);
        }

        protected com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder set(com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
            return setMaxVideoSize(1279, 719);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
            return setMaxVideoSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoSize(int i, int i2) {
            this.maxVideoWidth = i;
            this.maxVideoHeight = i2;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoFrameRate(int i) {
            this.maxVideoFrameRate = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxVideoBitrate(int i) {
            this.maxVideoBitrate = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoSize(int i, int i2) {
            this.minVideoWidth = i;
            this.minVideoHeight = i2;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoFrameRate(int i) {
            this.minVideoFrameRate = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMinVideoBitrate(int i) {
            this.minVideoBitrate = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z) {
            android.graphics.Point currentDisplayModeSize = com.google.android.exoplayer2.util.Util.getCurrentDisplayModeSize(context);
            return setViewportSize(currentDisplayModeSize.x, currentDisplayModeSize.y, z);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
            return setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setViewportSize(int i, int i2, boolean z) {
            this.viewportWidth = i;
            this.viewportHeight = i2;
            this.viewportOrientationMayChange = z;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeType(java.lang.String str) {
            return str == null ? setPreferredVideoMimeTypes(new java.lang.String[0]) : setPreferredVideoMimeTypes(str);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.preferredVideoMimeTypes = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i) {
            this.preferredVideoRoleFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredAudioLanguages(new java.lang.String[0]);
            }
            return setPreferredAudioLanguages(str);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.preferredAudioLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i) {
            this.preferredAudioRoleFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioChannelCount(int i) {
            this.maxAudioChannelCount = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setMaxAudioBitrate(int i) {
            this.maxAudioBitrate = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeType(java.lang.String str) {
            return str == null ? setPreferredAudioMimeTypes(new java.lang.String[0]) : setPreferredAudioMimeTypes(str);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.preferredAudioMimeTypes = com.google.common.collect.ImmutableList.copyOf(strArr);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            if (com.google.android.exoplayer2.util.Util.SDK_INT >= 19) {
                setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(context);
            }
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguage(java.lang.String str) {
            if (str == null) {
                return setPreferredTextLanguages(new java.lang.String[0]);
            }
            return setPreferredTextLanguages(str);
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
            this.preferredTextLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i) {
            this.preferredTextRoleFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i) {
            this.ignoredTextSelectionFlags = i;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z) {
            this.selectUndeterminedTextLanguage = z;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceLowestBitrate(boolean z) {
            this.forceLowestBitrate = z;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z) {
            this.forceHighestSupportedBitrate = z;
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder addOverride(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setOverrideForType(com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride) {
            clearOverridesOfType(trackSelectionOverride.getType());
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverride(com.google.android.exoplayer2.source.TrackGroup trackGroup) {
            this.overrides.remove(trackGroup);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverridesOfType(int i) {
            java.util.Iterator<com.google.android.exoplayer2.trackselection.TrackSelectionOverride> it = this.overrides.values().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == i) {
                    it.remove();
                }
            }
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder clearOverrides() {
            this.overrides.clear();
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.disabledTrackTypes.clear();
            this.disabledTrackTypes.addAll(set);
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder setTrackTypeDisabled(int i, boolean z) {
            if (z) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i));
            } else {
                this.disabledTrackTypes.remove(java.lang.Integer.valueOf(i));
            }
            return this;
        }

        public com.google.android.exoplayer2.trackselection.TrackSelectionParameters build() {
            return new com.google.android.exoplayer2.trackselection.TrackSelectionParameters(this);
        }

        private void setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettingsV19(android.content.Context context) {
            android.view.accessibility.CaptioningManager captioningManager;
            if ((com.google.android.exoplayer2.util.Util.SDK_INT >= 23 || android.os.Looper.myLooper() != null) && (captioningManager = (android.view.accessibility.CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.preferredTextRoleFlags = 1088;
                java.util.Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.preferredTextLanguages = com.google.common.collect.ImmutableList.of(com.google.android.exoplayer2.util.Util.getLocaleLanguageTag(locale));
                }
            }
        }

        private static com.google.common.collect.ImmutableList<java.lang.String> normalizeLanguageCodes(java.lang.String[] strArr) {
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (java.lang.String str : (java.lang.String[]) com.google.android.exoplayer2.util.Assertions.checkNotNull(strArr)) {
                builder.add((com.google.common.collect.ImmutableList.Builder) com.google.android.exoplayer2.util.Util.normalizeLanguageCode((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(str)));
            }
            return builder.build();
        }
    }

    static {
        com.google.android.exoplayer2.trackselection.TrackSelectionParameters build = new com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder().build();
        DEFAULT_WITHOUT_CONTEXT = build;
        DEFAULT = build;
        CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.trackselection.TrackSelectionParameters$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                return com.google.android.exoplayer2.trackselection.TrackSelectionParameters.fromBundle(bundle);
            }
        };
    }

    public static com.google.android.exoplayer2.trackselection.TrackSelectionParameters getDefaults(android.content.Context context) {
        return new com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder(context).build();
    }

    protected TrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder builder) {
        this.maxVideoWidth = builder.maxVideoWidth;
        this.maxVideoHeight = builder.maxVideoHeight;
        this.maxVideoFrameRate = builder.maxVideoFrameRate;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.minVideoWidth = builder.minVideoWidth;
        this.minVideoHeight = builder.minVideoHeight;
        this.minVideoFrameRate = builder.minVideoFrameRate;
        this.minVideoBitrate = builder.minVideoBitrate;
        this.viewportWidth = builder.viewportWidth;
        this.viewportHeight = builder.viewportHeight;
        this.viewportOrientationMayChange = builder.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = builder.preferredVideoMimeTypes;
        this.preferredVideoRoleFlags = builder.preferredVideoRoleFlags;
        this.preferredAudioLanguages = builder.preferredAudioLanguages;
        this.preferredAudioRoleFlags = builder.preferredAudioRoleFlags;
        this.maxAudioChannelCount = builder.maxAudioChannelCount;
        this.maxAudioBitrate = builder.maxAudioBitrate;
        this.preferredAudioMimeTypes = builder.preferredAudioMimeTypes;
        this.preferredTextLanguages = builder.preferredTextLanguages;
        this.preferredTextRoleFlags = builder.preferredTextRoleFlags;
        this.ignoredTextSelectionFlags = builder.ignoredTextSelectionFlags;
        this.selectUndeterminedTextLanguage = builder.selectUndeterminedTextLanguage;
        this.forceLowestBitrate = builder.forceLowestBitrate;
        this.forceHighestSupportedBitrate = builder.forceHighestSupportedBitrate;
        this.overrides = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) builder.overrides);
        this.disabledTrackTypes = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) builder.disabledTrackTypes);
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder buildUpon() {
        return new com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.TrackSelectionParameters trackSelectionParameters = (com.google.android.exoplayer2.trackselection.TrackSelectionParameters) obj;
        return this.maxVideoWidth == trackSelectionParameters.maxVideoWidth && this.maxVideoHeight == trackSelectionParameters.maxVideoHeight && this.maxVideoFrameRate == trackSelectionParameters.maxVideoFrameRate && this.maxVideoBitrate == trackSelectionParameters.maxVideoBitrate && this.minVideoWidth == trackSelectionParameters.minVideoWidth && this.minVideoHeight == trackSelectionParameters.minVideoHeight && this.minVideoFrameRate == trackSelectionParameters.minVideoFrameRate && this.minVideoBitrate == trackSelectionParameters.minVideoBitrate && this.viewportOrientationMayChange == trackSelectionParameters.viewportOrientationMayChange && this.viewportWidth == trackSelectionParameters.viewportWidth && this.viewportHeight == trackSelectionParameters.viewportHeight && this.preferredVideoMimeTypes.equals(trackSelectionParameters.preferredVideoMimeTypes) && this.preferredVideoRoleFlags == trackSelectionParameters.preferredVideoRoleFlags && this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.maxAudioChannelCount == trackSelectionParameters.maxAudioChannelCount && this.maxAudioBitrate == trackSelectionParameters.maxAudioBitrate && this.preferredAudioMimeTypes.equals(trackSelectionParameters.preferredAudioMimeTypes) && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.ignoredTextSelectionFlags == trackSelectionParameters.ignoredTextSelectionFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.forceLowestBitrate == trackSelectionParameters.forceLowestBitrate && this.forceHighestSupportedBitrate == trackSelectionParameters.forceHighestSupportedBitrate && this.overrides.equals(trackSelectionParameters.overrides) && this.disabledTrackTypes.equals(trackSelectionParameters.disabledTrackTypes);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + this.preferredVideoMimeTypes.hashCode()) * 31) + this.preferredVideoRoleFlags) * 31) + this.preferredAudioLanguages.hashCode()) * 31) + this.preferredAudioRoleFlags) * 31) + this.maxAudioChannelCount) * 31) + this.maxAudioBitrate) * 31) + this.preferredAudioMimeTypes.hashCode()) * 31) + this.preferredTextLanguages.hashCode()) * 31) + this.preferredTextRoleFlags) * 31) + this.ignoredTextSelectionFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31) + this.overrides.hashCode()) * 31) + this.disabledTrackTypes.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(6), this.maxVideoWidth);
        bundle.putInt(keyForField(7), this.maxVideoHeight);
        bundle.putInt(keyForField(8), this.maxVideoFrameRate);
        bundle.putInt(keyForField(9), this.maxVideoBitrate);
        bundle.putInt(keyForField(10), this.minVideoWidth);
        bundle.putInt(keyForField(11), this.minVideoHeight);
        bundle.putInt(keyForField(12), this.minVideoFrameRate);
        bundle.putInt(keyForField(13), this.minVideoBitrate);
        bundle.putInt(keyForField(14), this.viewportWidth);
        bundle.putInt(keyForField(15), this.viewportHeight);
        bundle.putBoolean(keyForField(16), this.viewportOrientationMayChange);
        bundle.putStringArray(keyForField(17), (java.lang.String[]) this.preferredVideoMimeTypes.toArray(new java.lang.String[0]));
        bundle.putInt(keyForField(25), this.preferredVideoRoleFlags);
        bundle.putStringArray(keyForField(1), (java.lang.String[]) this.preferredAudioLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(keyForField(2), this.preferredAudioRoleFlags);
        bundle.putInt(keyForField(18), this.maxAudioChannelCount);
        bundle.putInt(keyForField(19), this.maxAudioBitrate);
        bundle.putStringArray(keyForField(20), (java.lang.String[]) this.preferredAudioMimeTypes.toArray(new java.lang.String[0]));
        bundle.putStringArray(keyForField(3), (java.lang.String[]) this.preferredTextLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(keyForField(4), this.preferredTextRoleFlags);
        bundle.putInt(keyForField(26), this.ignoredTextSelectionFlags);
        bundle.putBoolean(keyForField(5), this.selectUndeterminedTextLanguage);
        bundle.putBoolean(keyForField(21), this.forceLowestBitrate);
        bundle.putBoolean(keyForField(22), this.forceHighestSupportedBitrate);
        bundle.putParcelableArrayList(keyForField(23), com.google.android.exoplayer2.util.BundleableUtil.toBundleArrayList(this.overrides.values()));
        bundle.putIntArray(keyForField(24), com.google.common.primitives.Ints.toArray(this.disabledTrackTypes));
        return bundle;
    }

    public static com.google.android.exoplayer2.trackselection.TrackSelectionParameters fromBundle(android.os.Bundle bundle) {
        return new com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder(bundle).build();
    }

    protected static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
