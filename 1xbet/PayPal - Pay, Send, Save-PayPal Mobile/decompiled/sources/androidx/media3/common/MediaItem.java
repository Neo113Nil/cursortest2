package androidx.media3.common;

/* loaded from: classes7.dex */
public final class MediaItem {
    public static final java.lang.String DEFAULT_MEDIA_ID = "";
    public final androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.ClippingProperties clippingProperties;
    public final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    public final androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
    public final java.lang.String mediaId;
    public final androidx.media3.common.MediaMetadata mediaMetadata;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.LocalConfiguration playbackProperties;
    public final androidx.media3.common.MediaItem.RequestMetadata requestMetadata;
    public static final androidx.media3.common.MediaItem EMPTY = new androidx.media3.common.MediaItem.Builder().build();
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    /* synthetic */ MediaItem(java.lang.String str, androidx.media3.common.MediaItem.ClippingProperties clippingProperties, androidx.media3.common.MediaItem.LocalConfiguration localConfiguration, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.common.MediaItem.RequestMetadata requestMetadata, byte b) {
        this(str, clippingProperties, localConfiguration, liveConfiguration, mediaMetadata, requestMetadata);
    }

    public static androidx.media3.common.MediaItem fromUri(java.lang.String str) {
        return new androidx.media3.common.MediaItem.Builder().setUri(str).build();
    }

    public static androidx.media3.common.MediaItem fromUri(android.net.Uri uri) {
        return new androidx.media3.common.MediaItem.Builder().setUri(uri).build();
    }

    public static final class Builder {
        private java.lang.String Camera2StreamConfigurationMap;
        private androidx.media3.common.MediaItem.AdsConfiguration getHighResolutionOutputSizeshNQ4ISI;
        private androidx.media3.common.MediaItem.ClippingConfiguration.Builder getHighSpeedVideoFpsRanges;
        private long getHighSpeedVideoFpsRangesFor;
        private androidx.media3.common.MediaItem.DrmConfiguration.Builder getHighSpeedVideoSizes;
        private java.lang.String getHighSpeedVideoSizesFor;
        private androidx.media3.common.MediaItem.LiveConfiguration.Builder getInputFormats;
        private androidx.media3.common.MediaMetadata getInputSizeshNQ4ISI;
        private java.lang.String getOutputFormats;
        private androidx.media3.common.MediaItem.RequestMetadata getOutputMinFrameDuration;
        private java.lang.Object getOutputMinFrameDurationlomOqCM;
        private android.net.Uri getOutputSizes;
        private java.util.List<androidx.media3.common.StreamKey> getOutputSizeshNQ4ISI;
        private com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> getOutputStallDurationlomOqCM;

        /* synthetic */ Builder(androidx.media3.common.MediaItem mediaItem, byte b) {
            this(mediaItem);
        }

        public Builder() {
            this.getHighSpeedVideoFpsRanges = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            this.getHighSpeedVideoSizes = new androidx.media3.common.MediaItem.DrmConfiguration.Builder((byte) 0);
            this.getOutputSizeshNQ4ISI = java.util.Collections.emptyList();
            this.getOutputStallDurationlomOqCM = com.google.common.collect.ImmutableList.of();
            this.getInputFormats = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            this.getOutputMinFrameDuration = androidx.media3.common.MediaItem.RequestMetadata.EMPTY;
            this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.C.TIME_UNSET;
        }

        private Builder(androidx.media3.common.MediaItem mediaItem) {
            this();
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder;
            this.getHighSpeedVideoFpsRanges = mediaItem.clippingConfiguration.buildUpon();
            this.getOutputFormats = mediaItem.mediaId;
            this.getInputSizeshNQ4ISI = mediaItem.mediaMetadata;
            this.getInputFormats = mediaItem.liveConfiguration.buildUpon();
            this.getOutputMinFrameDuration = mediaItem.requestMetadata;
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.Camera2StreamConfigurationMap = localConfiguration.customCacheKey;
                this.getHighSpeedVideoSizesFor = localConfiguration.mimeType;
                this.getOutputSizes = localConfiguration.uri;
                this.getOutputSizeshNQ4ISI = localConfiguration.streamKeys;
                this.getOutputStallDurationlomOqCM = localConfiguration.subtitleConfigurations;
                this.getOutputMinFrameDurationlomOqCM = localConfiguration.tag;
                if (localConfiguration.drmConfiguration != null) {
                    builder = localConfiguration.drmConfiguration.buildUpon();
                } else {
                    builder = new androidx.media3.common.MediaItem.DrmConfiguration.Builder((byte) 0);
                }
                this.getHighSpeedVideoSizes = builder;
                this.getHighResolutionOutputSizeshNQ4ISI = localConfiguration.adsConfiguration;
                this.getHighSpeedVideoFpsRangesFor = localConfiguration.imageDurationMs;
            }
        }

        public final androidx.media3.common.MediaItem.Builder setMediaId(java.lang.String str) {
            this.getOutputFormats = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setUri(java.lang.String str) {
            return setUri(str == null ? null : android.net.Uri.parse(str));
        }

        public final androidx.media3.common.MediaItem.Builder setUri(android.net.Uri uri) {
            this.getOutputSizes = uri;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setMimeType(java.lang.String str) {
            this.getHighSpeedVideoSizesFor = str;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
            this.getHighSpeedVideoFpsRanges = clippingConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setClipStartPositionMs(long j) {
            this.getHighSpeedVideoFpsRanges.setStartPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setClipEndPositionMs(long j) {
            this.getHighSpeedVideoFpsRanges.setEndPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setClipRelativeToLiveWindow(boolean z) {
            this.getHighSpeedVideoFpsRanges.setRelativeToLiveWindow(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setClipRelativeToDefaultPosition(boolean z) {
            this.getHighSpeedVideoFpsRanges.setRelativeToDefaultPosition(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setClipStartsAtKeyFrame(boolean z) {
            this.getHighSpeedVideoFpsRanges.setStartsAtKeyFrame(z);
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setDrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
            this.getHighSpeedVideoSizes = drmConfiguration != null ? drmConfiguration.buildUpon() : new androidx.media3.common.MediaItem.DrmConfiguration.Builder((byte) 0);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmLicenseUri(android.net.Uri uri) {
            this.getHighSpeedVideoSizes.setLicenseUri(uri);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmLicenseUri(java.lang.String str) {
            this.getHighSpeedVideoSizes.setLicenseUri(str);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.getHighSpeedVideoSizes;
            if (map == null) {
                map = com.google.common.collect.ImmutableMap.of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmUuid(java.util.UUID uuid) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, uuid);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmMultiSession(boolean z) {
            this.getHighSpeedVideoSizes.setMultiSession(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.getHighSpeedVideoSizes.setForceDefaultLicenseUri(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.getHighSpeedVideoSizes.setPlayClearContentWithoutKey(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmSessionForClearPeriods(boolean z) {
            this.getHighSpeedVideoSizes.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmSessionForClearTypes(java.util.List<java.lang.Integer> list) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.getHighSpeedVideoSizes;
            if (list == null) {
                list = com.google.common.collect.ImmutableList.of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setDrmKeySetId(byte[] bArr) {
            this.getHighSpeedVideoSizes.setKeySetId(bArr);
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
            java.util.List<androidx.media3.common.StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            } else {
                emptyList = java.util.Collections.emptyList();
            }
            this.getOutputSizeshNQ4ISI = emptyList;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setCustomCacheKey(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setSubtitles(java.util.List<androidx.media3.common.MediaItem.Subtitle> list) {
            this.getOutputStallDurationlomOqCM = list != null ? com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list) : com.google.common.collect.ImmutableList.of();
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setSubtitleConfigurations(java.util.List<androidx.media3.common.MediaItem.SubtitleConfiguration> list) {
            this.getOutputStallDurationlomOqCM = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setAdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration) {
            this.getHighResolutionOutputSizeshNQ4ISI = adsConfiguration;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setAdTagUri(java.lang.String str) {
            return setAdTagUri(str != null ? android.net.Uri.parse(str) : null);
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri) {
            return setAdTagUri(uri, null);
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri, java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = uri != null ? new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
            this.getInputFormats = liveConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setLiveTargetOffsetMs(long j) {
            this.getInputFormats.setTargetOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setLiveMinOffsetMs(long j) {
            this.getInputFormats.setMinOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setLiveMaxOffsetMs(long j) {
            this.getInputFormats.setMaxOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setLiveMinPlaybackSpeed(float f) {
            this.getInputFormats.setMinPlaybackSpeed(f);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.media3.common.MediaItem.Builder setLiveMaxPlaybackSpeed(float f) {
            this.getInputFormats.setMaxPlaybackSpeed(f);
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setTag(java.lang.Object obj) {
            this.getOutputMinFrameDurationlomOqCM = obj;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setImageDurationMs(long j) {
            com.google.common.base.Preconditions.checkArgument(j > 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.getHighSpeedVideoFpsRangesFor = j;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.getInputSizeshNQ4ISI = mediaMetadata;
            return this;
        }

        public final androidx.media3.common.MediaItem.Builder setRequestMetadata(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
            this.getOutputMinFrameDuration = requestMetadata;
            return this;
        }

        public final androidx.media3.common.MediaItem build() {
            com.google.common.base.Preconditions.checkState(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap == null || this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null);
            android.net.Uri uri = this.getOutputSizes;
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = null;
            if (uri != null) {
                localConfiguration = new androidx.media3.common.MediaItem.LocalConfiguration(uri, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null ? this.getHighSpeedVideoSizes.build() : null, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputStallDurationlomOqCM, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
            }
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration2 = localConfiguration;
            java.lang.String str = this.getOutputFormats;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            androidx.media3.common.MediaItem.ClippingProperties buildClippingProperties = this.getHighSpeedVideoFpsRanges.buildClippingProperties();
            androidx.media3.common.MediaItem.LiveConfiguration build = this.getInputFormats.build();
            androidx.media3.common.MediaMetadata mediaMetadata = this.getInputSizeshNQ4ISI;
            if (mediaMetadata == null) {
                mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            }
            return new androidx.media3.common.MediaItem(str2, buildClippingProperties, localConfiguration2, build, mediaMetadata, this.getOutputMinFrameDuration, (byte) 0);
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;
        private final byte[] getOutputFormats;
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;
        public final android.net.Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> requestHeaders;
        public final java.util.UUID scheme;

        @java.lang.Deprecated
        public final com.google.common.collect.ImmutableList<java.lang.Integer> sessionForClearTypes;

        @java.lang.Deprecated
        public final java.util.UUID uuid;
        private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        /* synthetic */ DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private android.net.Uri Camera2StreamConfigurationMap;
            private com.google.common.collect.ImmutableList<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
            private com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
            private byte[] getHighSpeedVideoFpsRangesFor;
            private boolean getHighSpeedVideoSizes;
            private boolean getInputFormats;
            private java.util.UUID getInputSizeshNQ4ISI;
            private boolean getOutputFormats;

            /* synthetic */ Builder(byte b) {
                this();
            }

            /* synthetic */ Builder(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration, byte b) {
                this(drmConfiguration);
            }

            public Builder(java.util.UUID uuid) {
                this();
                this.getInputSizeshNQ4ISI = uuid;
            }

            @java.lang.Deprecated
            private Builder() {
                this.getHighSpeedVideoFpsRanges = com.google.common.collect.ImmutableMap.of();
                this.getOutputFormats = true;
                this.getHighResolutionOutputSizeshNQ4ISI = com.google.common.collect.ImmutableList.of();
            }

            private Builder(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
                this.getInputSizeshNQ4ISI = drmConfiguration.scheme;
                this.Camera2StreamConfigurationMap = drmConfiguration.licenseUri;
                this.getHighSpeedVideoFpsRanges = drmConfiguration.licenseRequestHeaders;
                this.getInputFormats = drmConfiguration.multiSession;
                this.getOutputFormats = drmConfiguration.playClearContentWithoutKey;
                this.getHighSpeedVideoSizes = drmConfiguration.forceDefaultLicenseUri;
                this.getHighResolutionOutputSizeshNQ4ISI = drmConfiguration.forcedSessionTrackTypes;
                this.getHighSpeedVideoFpsRangesFor = drmConfiguration.getOutputFormats;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setScheme(java.util.UUID uuid) {
                this.getInputSizeshNQ4ISI = uuid;
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(android.net.Uri uri) {
                this.Camera2StreamConfigurationMap = uri;
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(java.lang.String str) {
                this.Camera2StreamConfigurationMap = str == null ? null : android.net.Uri.parse(str);
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
                this.getHighSpeedVideoFpsRanges = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setMultiSession(boolean z) {
                this.getInputFormats = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceDefaultLicenseUri(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setPlayClearContentWithoutKey(boolean z) {
                this.getOutputFormats = z;
                return this;
            }

            @java.lang.Deprecated
            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                com.google.common.collect.ImmutableList of;
                if (z) {
                    of = com.google.common.collect.ImmutableList.of(2, 1);
                } else {
                    of = com.google.common.collect.ImmutableList.of();
                }
                setForcedSessionTrackTypes(of);
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setForcedSessionTrackTypes(java.util.List<java.lang.Integer> list) {
                this.getHighResolutionOutputSizeshNQ4ISI = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration.Builder setKeySetId(byte[] bArr) {
                this.getHighSpeedVideoFpsRangesFor = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public final androidx.media3.common.MediaItem.DrmConfiguration build() {
                return new androidx.media3.common.MediaItem.DrmConfiguration(this, (byte) 0);
            }

            static /* synthetic */ androidx.media3.common.MediaItem.DrmConfiguration.Builder getHighResolutionOutputSizeshNQ4ISI(androidx.media3.common.MediaItem.DrmConfiguration.Builder builder, java.util.UUID uuid) {
                builder.getInputSizeshNQ4ISI = uuid;
                return builder;
            }
        }

        private DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder builder) {
            com.google.common.base.Preconditions.checkState((builder.getHighSpeedVideoSizes && builder.Camera2StreamConfigurationMap == null) ? false : true);
            java.util.UUID uuid = (java.util.UUID) com.google.common.base.Preconditions.checkNotNull(builder.getInputSizeshNQ4ISI);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.Camera2StreamConfigurationMap;
            this.requestHeaders = builder.getHighSpeedVideoFpsRanges;
            this.licenseRequestHeaders = builder.getHighSpeedVideoFpsRanges;
            this.multiSession = builder.getInputFormats;
            this.forceDefaultLicenseUri = builder.getHighSpeedVideoSizes;
            this.playClearContentWithoutKey = builder.getOutputFormats;
            this.sessionForClearTypes = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.forcedSessionTrackTypes = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputFormats = builder.getHighSpeedVideoFpsRangesFor != null ? java.util.Arrays.copyOf(builder.getHighSpeedVideoFpsRangesFor, builder.getHighSpeedVideoFpsRangesFor.length) : null;
        }

        public final byte[] getKeySetId() {
            byte[] bArr = this.getOutputFormats;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final androidx.media3.common.MediaItem.DrmConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(this, (byte) 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.DrmConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = (androidx.media3.common.MediaItem.DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && java.util.Objects.equals(this.licenseUri, drmConfiguration.licenseUri) && java.util.Objects.equals(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && java.util.Arrays.equals(this.getOutputFormats, drmConfiguration.getOutputFormats);
        }

        public final int hashCode() {
            int hashCode = this.scheme.hashCode();
            android.net.Uri uri = this.licenseUri;
            int hashCode2 = uri != null ? uri.hashCode() : 0;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + java.util.Arrays.hashCode(this.getOutputFormats);
        }

        public static androidx.media3.common.MediaItem.DrmConfiguration fromBundle(android.os.Bundle bundle) {
            java.util.UUID fromString = java.util.UUID.fromString((java.lang.String) com.google.common.base.Preconditions.checkNotNull(bundle.getString(getInputSizeshNQ4ISI)));
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(getOutputMinFrameDuration);
            com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> bundleToStringImmutableMap = androidx.media3.common.util.BundleCollectionUtil.bundleToStringImmutableMap(androidx.media3.common.util.BundleCollectionUtil.getBundleWithDefault(bundle, getHighResolutionOutputSizeshNQ4ISI, android.os.Bundle.EMPTY));
            boolean z = bundle.getBoolean(getInputFormats, false);
            boolean z2 = bundle.getBoolean(getHighSpeedVideoFpsRangesFor, false);
            boolean z3 = bundle.getBoolean(getHighSpeedVideoFpsRanges, false);
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) androidx.media3.common.util.BundleCollectionUtil.getIntegerArrayListWithDefault(bundle, getHighSpeedVideoSizes, new java.util.ArrayList()));
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(fromString).setLicenseUri(uri).setLicenseRequestHeaders(bundleToStringImmutableMap).setMultiSession(z).setForceDefaultLicenseUri(z3).setPlayClearContentWithoutKey(z2).setForcedSessionTrackTypes(copyOf).setKeySetId(bundle.getByteArray(Camera2StreamConfigurationMap)).build();
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(getInputSizeshNQ4ISI, this.scheme.toString());
            android.net.Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(getOutputMinFrameDuration, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(getHighResolutionOutputSizeshNQ4ISI, androidx.media3.common.util.BundleCollectionUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z = this.multiSession;
            if (z) {
                bundle.putBoolean(getInputFormats, z);
            }
            boolean z2 = this.playClearContentWithoutKey;
            if (z2) {
                bundle.putBoolean(getHighSpeedVideoFpsRangesFor, z2);
            }
            boolean z3 = this.forceDefaultLicenseUri;
            if (z3) {
                bundle.putBoolean(getHighSpeedVideoFpsRanges, z3);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(getHighSpeedVideoSizes, new java.util.ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.getOutputFormats;
            if (bArr != null) {
                bundle.putByteArray(Camera2StreamConfigurationMap, bArr);
            }
            return bundle;
        }
    }

    public static final class AdsConfiguration {
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        public final android.net.Uri adTagUri;
        public final java.lang.Object adsId;

        /* synthetic */ AdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private android.net.Uri Camera2StreamConfigurationMap;
            private java.lang.Object getHighSpeedVideoFpsRanges;

            public Builder(android.net.Uri uri) {
                this.Camera2StreamConfigurationMap = uri;
            }

            public final androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdTagUri(android.net.Uri uri) {
                this.Camera2StreamConfigurationMap = uri;
                return this;
            }

            public final androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdsId(java.lang.Object obj) {
                this.getHighSpeedVideoFpsRanges = obj;
                return this;
            }

            public final androidx.media3.common.MediaItem.AdsConfiguration build() {
                return new androidx.media3.common.MediaItem.AdsConfiguration(this, (byte) 0);
            }
        }

        private AdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration.Builder builder) {
            this.adTagUri = builder.Camera2StreamConfigurationMap;
            this.adsId = builder.getHighSpeedVideoFpsRanges;
        }

        public final androidx.media3.common.MediaItem.AdsConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.AdsConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = (androidx.media3.common.MediaItem.AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && java.util.Objects.equals(this.adsId, adsConfiguration.adsId);
        }

        public final int hashCode() {
            int hashCode = this.adTagUri.hashCode();
            java.lang.Object obj = this.adsId;
            return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public static androidx.media3.common.MediaItem.AdsConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(getHighSpeedVideoFpsRanges);
            com.google.common.base.Preconditions.checkNotNull(uri);
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).build();
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(getHighSpeedVideoFpsRanges, this.adTagUri);
            return bundle;
        }
    }

    public static final class LocalConfiguration {
        public final androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration;
        public final java.lang.String customCacheKey;
        public final androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration;
        public final long imageDurationMs;
        public final java.lang.String mimeType;
        public final java.util.List<androidx.media3.common.StreamKey> streamKeys;
        public final com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> subtitleConfigurations;

        @java.lang.Deprecated
        public final java.util.List<androidx.media3.common.MediaItem.Subtitle> subtitles;
        public final java.lang.Object tag;
        public final android.net.Uri uri;
        private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        /* synthetic */ LocalConfiguration(android.net.Uri uri, java.lang.String str, androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration, androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration, java.util.List list, java.lang.String str2, com.google.common.collect.ImmutableList immutableList, java.lang.Object obj, long j, byte b) {
            this(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj, j);
        }

        private LocalConfiguration(android.net.Uri uri, java.lang.String str, androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration, androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration, java.util.List<androidx.media3.common.StreamKey> list, java.lang.String str2, com.google.common.collect.ImmutableList<androidx.media3.common.MediaItem.SubtitleConfiguration> immutableList, java.lang.Object obj, long j) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((com.google.common.collect.ImmutableList.Builder) androidx.media3.common.MediaItem.SubtitleConfiguration.Builder.getHighSpeedVideoFpsRangesFor(immutableList.get(i).buildUpon()));
            }
            this.subtitles = builder.build();
            this.tag = obj;
            this.imageDurationMs = j;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LocalConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = (androidx.media3.common.MediaItem.LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && java.util.Objects.equals(this.mimeType, localConfiguration.mimeType) && java.util.Objects.equals(this.drmConfiguration, localConfiguration.drmConfiguration) && java.util.Objects.equals(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && java.util.Objects.equals(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && java.util.Objects.equals(this.tag, localConfiguration.tag) && this.imageDurationMs == localConfiguration.imageDurationMs;
        }

        public final int hashCode() {
            int hashCode = this.uri.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            int hashCode3 = drmConfiguration == null ? 0 : drmConfiguration.hashCode();
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            int hashCode4 = adsConfiguration == null ? 0 : adsConfiguration.hashCode();
            int hashCode5 = this.streamKeys.hashCode();
            java.lang.String str2 = this.customCacheKey;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            int hashCode7 = this.subtitleConfigurations.hashCode();
            return (int) ((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (this.tag != null ? r8.hashCode() : 0)) * 31) + this.imageDurationMs);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(getOutputFormats, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(getHighSpeedVideoFpsRanges, str);
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(getHighSpeedVideoSizes, drmConfiguration.toBundle());
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(getHighResolutionOutputSizeshNQ4ISI, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(getOutputMinFrameDuration, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.streamKeys, new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda0
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.common.StreamKey) obj).toBundle();
                    }
                }));
            }
            java.lang.String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(getHighSpeedVideoFpsRangesFor, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(getInputFormats, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.subtitleConfigurations, new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda1
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ((androidx.media3.common.MediaItem.SubtitleConfiguration) obj).toBundle();
                    }
                }));
            }
            long j = this.imageDurationMs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(Camera2StreamConfigurationMap, j);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.LocalConfiguration fromBundle(android.os.Bundle bundle) {
            com.google.common.collect.ImmutableList fromBundleList;
            com.google.common.collect.ImmutableList fromBundleList2;
            android.os.Bundle bundle2 = bundle.getBundle(getHighSpeedVideoSizes);
            androidx.media3.common.MediaItem.DrmConfiguration fromBundle = bundle2 == null ? null : androidx.media3.common.MediaItem.DrmConfiguration.fromBundle(bundle2);
            android.os.Bundle bundle3 = bundle.getBundle(getHighResolutionOutputSizeshNQ4ISI);
            androidx.media3.common.MediaItem.AdsConfiguration fromBundle2 = bundle3 != null ? androidx.media3.common.MediaItem.AdsConfiguration.fromBundle(bundle3) : null;
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getOutputMinFrameDuration);
            if (parcelableArrayList == null) {
                fromBundleList = com.google.common.collect.ImmutableList.of();
            } else {
                fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda2
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.StreamKey.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            com.google.common.collect.ImmutableList immutableList = fromBundleList;
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(getInputFormats);
            if (parcelableArrayList2 == null) {
                fromBundleList2 = com.google.common.collect.ImmutableList.of();
            } else {
                fromBundleList2 = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new com.google.common.base.Function() { // from class: androidx.media3.common.MediaItem$LocalConfiguration$$ExternalSyntheticLambda3
                    @Override // com.google.common.base.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return androidx.media3.common.MediaItem.SubtitleConfiguration.fromBundle((android.os.Bundle) obj);
                    }
                }, parcelableArrayList2);
            }
            return new androidx.media3.common.MediaItem.LocalConfiguration((android.net.Uri) com.google.common.base.Preconditions.checkNotNull((android.net.Uri) bundle.getParcelable(getOutputFormats)), bundle.getString(getHighSpeedVideoFpsRanges), fromBundle, fromBundle2, immutableList, bundle.getString(getHighSpeedVideoFpsRangesFor), fromBundleList2, null, bundle.getLong(Camera2StreamConfigurationMap, androidx.media3.common.C.TIME_UNSET));
        }
    }

    public static final class LiveConfiguration {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final androidx.media3.common.MediaItem.LiveConfiguration UNSET = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().build();
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        /* synthetic */ LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private long Camera2StreamConfigurationMap;
            private float getHighResolutionOutputSizeshNQ4ISI;
            private float getHighSpeedVideoFpsRanges;
            private long getHighSpeedVideoFpsRangesFor;
            private long getHighSpeedVideoSizes;

            /* synthetic */ Builder(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, byte b) {
                this(liveConfiguration);
            }

            public Builder() {
                this.Camera2StreamConfigurationMap = androidx.media3.common.C.TIME_UNSET;
                this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.C.TIME_UNSET;
                this.getHighSpeedVideoSizes = androidx.media3.common.C.TIME_UNSET;
                this.getHighResolutionOutputSizeshNQ4ISI = -3.4028235E38f;
                this.getHighSpeedVideoFpsRanges = -3.4028235E38f;
            }

            private Builder(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
                this.Camera2StreamConfigurationMap = liveConfiguration.targetOffsetMs;
                this.getHighSpeedVideoFpsRangesFor = liveConfiguration.minOffsetMs;
                this.getHighSpeedVideoSizes = liveConfiguration.maxOffsetMs;
                this.getHighResolutionOutputSizeshNQ4ISI = liveConfiguration.minPlaybackSpeed;
                this.getHighSpeedVideoFpsRanges = liveConfiguration.maxPlaybackSpeed;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration.Builder setTargetOffsetMs(long j) {
                this.Camera2StreamConfigurationMap = j;
                return this;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinOffsetMs(long j) {
                this.getHighSpeedVideoFpsRangesFor = j;
                return this;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxOffsetMs(long j) {
                this.getHighSpeedVideoSizes = j;
                return this;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinPlaybackSpeed(float f) {
                this.getHighResolutionOutputSizeshNQ4ISI = f;
                return this;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxPlaybackSpeed(float f) {
                this.getHighSpeedVideoFpsRanges = f;
                return this;
            }

            public final androidx.media3.common.MediaItem.LiveConfiguration build() {
                return new androidx.media3.common.MediaItem.LiveConfiguration(this, (byte) 0);
            }
        }

        private LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder builder) {
            this(builder.Camera2StreamConfigurationMap, builder.getHighSpeedVideoFpsRangesFor, builder.getHighSpeedVideoSizes, builder.getHighResolutionOutputSizeshNQ4ISI, builder.getHighSpeedVideoFpsRanges);
        }

        @java.lang.Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public final androidx.media3.common.MediaItem.LiveConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.LiveConfiguration.Builder(this, (byte) 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LiveConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = (androidx.media3.common.MediaItem.LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public final int hashCode() {
            long j = this.targetOffsetMs;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.minOffsetMs;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.maxOffsetMs;
            int i3 = (int) ((j3 >>> 32) ^ j3);
            float f = this.minPlaybackSpeed;
            int floatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
            float f2 = this.maxPlaybackSpeed;
            return (((((((i * 31) + i2) * 31) + i3) * 31) + floatToIntBits) * 31) + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.targetOffsetMs;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(getHighResolutionOutputSizeshNQ4ISI, j);
            }
            long j2 = this.minOffsetMs;
            if (j2 != liveConfiguration.minOffsetMs) {
                bundle.putLong(getHighSpeedVideoFpsRangesFor, j2);
            }
            long j3 = this.maxOffsetMs;
            if (j3 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(getHighSpeedVideoFpsRanges, j3);
            }
            float f = this.minPlaybackSpeed;
            if (f != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(getHighSpeedVideoSizes, f);
            }
            float f2 = this.maxPlaybackSpeed;
            if (f2 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(Camera2StreamConfigurationMap, f2);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.LiveConfiguration fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.LiveConfiguration.Builder builder = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            return builder.setTargetOffsetMs(bundle.getLong(str, liveConfiguration.targetOffsetMs)).setMinOffsetMs(bundle.getLong(getHighSpeedVideoFpsRangesFor, liveConfiguration.minOffsetMs)).setMaxOffsetMs(bundle.getLong(getHighSpeedVideoFpsRanges, liveConfiguration.maxOffsetMs)).setMinPlaybackSpeed(bundle.getFloat(getHighSpeedVideoSizes, liveConfiguration.minPlaybackSpeed)).setMaxPlaybackSpeed(bundle.getFloat(Camera2StreamConfigurationMap, liveConfiguration.maxPlaybackSpeed)).build();
        }
    }

    public static class SubtitleConfiguration {
        public final java.lang.String id;
        public final java.lang.String label;
        public final java.lang.String language;
        public final java.lang.String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final android.net.Uri uri;
        private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(6);

        /* synthetic */ SubtitleConfiguration(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
            this(uri, str, str2, i, i2, str3, null);
        }

        /* synthetic */ SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private java.lang.String Camera2StreamConfigurationMap;
            private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
            private java.lang.String getHighSpeedVideoFpsRanges;
            private java.lang.String getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private int getHighSpeedVideoSizesFor;
            private android.net.Uri getInputFormats;

            /* synthetic */ Builder(androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration, byte b) {
                this(subtitleConfiguration);
            }

            public Builder(android.net.Uri uri) {
                this.getInputFormats = uri;
            }

            private Builder(androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration) {
                this.getInputFormats = subtitleConfiguration.uri;
                this.getHighSpeedVideoFpsRangesFor = subtitleConfiguration.mimeType;
                this.getHighSpeedVideoFpsRanges = subtitleConfiguration.language;
                this.getHighSpeedVideoSizesFor = subtitleConfiguration.selectionFlags;
                this.getHighSpeedVideoSizes = subtitleConfiguration.roleFlags;
                this.getHighResolutionOutputSizeshNQ4ISI = subtitleConfiguration.label;
                this.Camera2StreamConfigurationMap = subtitleConfiguration.id;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setUri(android.net.Uri uri) {
                this.getInputFormats = uri;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setMimeType(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = androidx.media3.common.MimeTypes.normalizeMimeType(str);
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLanguage(java.lang.String str) {
                this.getHighSpeedVideoFpsRanges = str;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setSelectionFlags(int i) {
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setRoleFlags(int i) {
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLabel(java.lang.String str) {
                this.getHighResolutionOutputSizeshNQ4ISI = str;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setId(java.lang.String str) {
                this.Camera2StreamConfigurationMap = str;
                return this;
            }

            public final androidx.media3.common.MediaItem.SubtitleConfiguration build() {
                return new androidx.media3.common.MediaItem.SubtitleConfiguration(this, (byte) 0);
            }

            static /* synthetic */ androidx.media3.common.MediaItem.Subtitle getHighSpeedVideoFpsRangesFor(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
                return new androidx.media3.common.MediaItem.Subtitle(builder, (byte) 0);
            }
        }

        private SubtitleConfiguration(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.id = null;
        }

        private SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            this.uri = builder.getInputFormats;
            this.mimeType = builder.getHighSpeedVideoFpsRangesFor;
            this.language = builder.getHighSpeedVideoFpsRanges;
            this.selectionFlags = builder.getHighSpeedVideoSizesFor;
            this.roleFlags = builder.getHighSpeedVideoSizes;
            this.label = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.id = builder.Camera2StreamConfigurationMap;
        }

        public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(this, (byte) 0);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.SubtitleConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration = (androidx.media3.common.MediaItem.SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && java.util.Objects.equals(this.mimeType, subtitleConfiguration.mimeType) && java.util.Objects.equals(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && java.util.Objects.equals(this.label, subtitleConfiguration.label) && java.util.Objects.equals(this.id, subtitleConfiguration.id);
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode();
            java.lang.String str = this.mimeType;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.language;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            int i = this.selectionFlags;
            int i2 = this.roleFlags;
            java.lang.String str3 = this.label;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.id;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + i2) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public static androidx.media3.common.MediaItem.SubtitleConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) com.google.common.base.Preconditions.checkNotNull((android.net.Uri) bundle.getParcelable(getOutputFormats));
            java.lang.String string = bundle.getString(getHighSpeedVideoFpsRangesFor);
            java.lang.String string2 = bundle.getString(getHighSpeedVideoSizes);
            int i = bundle.getInt(getInputSizeshNQ4ISI, 0);
            int i2 = bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, 0);
            java.lang.String string3 = bundle.getString(Camera2StreamConfigurationMap);
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i).setRoleFlags(i2).setLabel(string3).setId(bundle.getString(getHighSpeedVideoFpsRanges)).build();
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(getOutputFormats, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(getHighSpeedVideoFpsRangesFor, str);
            }
            java.lang.String str2 = this.language;
            if (str2 != null) {
                bundle.putString(getHighSpeedVideoSizes, str2);
            }
            int i = this.selectionFlags;
            if (i != 0) {
                bundle.putInt(getInputSizeshNQ4ISI, i);
            }
            int i2 = this.roleFlags;
            if (i2 != 0) {
                bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, i2);
            }
            java.lang.String str3 = this.label;
            if (str3 != null) {
                bundle.putString(Camera2StreamConfigurationMap, str3);
            }
            java.lang.String str4 = this.id;
            if (str4 != null) {
                bundle.putString(getHighSpeedVideoFpsRanges, str4);
            }
            return bundle;
        }
    }

    @java.lang.Deprecated
    public static final class Subtitle extends androidx.media3.common.MediaItem.SubtitleConfiguration {
        /* synthetic */ Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder, byte b) {
            this(builder);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            this(uri, str, str2, 0);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i) {
            this(uri, str, str2, i, 0, null);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3) {
            super(uri, str, str2, i, i2, str3);
        }

        private Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            super(builder, (byte) 0);
        }
    }

    public static class ClippingConfiguration {
        public final boolean allowUnseekableMedia;
        public final long endPositionMs;
        public final long endPositionUs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final long startPositionUs;
        public final boolean startsAtKeyFrame;
        public static final androidx.media3.common.MediaItem.ClippingConfiguration UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().build();
        private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        /* synthetic */ ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private boolean Camera2StreamConfigurationMap;
            private long getHighResolutionOutputSizeshNQ4ISI;
            private boolean getHighSpeedVideoFpsRanges;
            private long getHighSpeedVideoFpsRangesFor;
            private boolean getHighSpeedVideoSizes;
            private boolean getOutputFormats;

            /* synthetic */ Builder(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration, byte b) {
                this(clippingConfiguration);
            }

            public Builder() {
                this.getHighSpeedVideoFpsRangesFor = Long.MIN_VALUE;
            }

            private Builder(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
                this.getHighResolutionOutputSizeshNQ4ISI = clippingConfiguration.startPositionUs;
                this.getHighSpeedVideoFpsRangesFor = clippingConfiguration.endPositionUs;
                this.Camera2StreamConfigurationMap = clippingConfiguration.relativeToLiveWindow;
                this.getHighSpeedVideoSizes = clippingConfiguration.relativeToDefaultPosition;
                this.getOutputFormats = clippingConfiguration.startsAtKeyFrame;
                this.getHighSpeedVideoFpsRanges = clippingConfiguration.allowUnseekableMedia;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionMs(long j) {
                return setStartPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j >= 0);
                this.getHighResolutionOutputSizeshNQ4ISI = j;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionMs(long j) {
                return setEndPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionUs(long j) {
                com.google.common.base.Preconditions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.getHighSpeedVideoFpsRangesFor = j;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToLiveWindow(boolean z) {
                this.Camera2StreamConfigurationMap = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToDefaultPosition(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartsAtKeyFrame(boolean z) {
                this.getOutputFormats = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration.Builder setAllowUnseekableMedia(boolean z) {
                this.getHighSpeedVideoFpsRanges = z;
                return this;
            }

            public final androidx.media3.common.MediaItem.ClippingConfiguration build() {
                return new androidx.media3.common.MediaItem.ClippingConfiguration(this, (byte) 0);
            }

            @java.lang.Deprecated
            public final androidx.media3.common.MediaItem.ClippingProperties buildClippingProperties() {
                return new androidx.media3.common.MediaItem.ClippingProperties(this, (byte) 0);
            }
        }

        private ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            this.startPositionMs = androidx.media3.common.util.Util.usToMs(builder.getHighResolutionOutputSizeshNQ4ISI);
            this.endPositionMs = androidx.media3.common.util.Util.usToMs(builder.getHighSpeedVideoFpsRangesFor);
            this.startPositionUs = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.endPositionUs = builder.getHighSpeedVideoFpsRangesFor;
            this.relativeToLiveWindow = builder.Camera2StreamConfigurationMap;
            this.relativeToDefaultPosition = builder.getHighSpeedVideoSizes;
            this.startsAtKeyFrame = builder.getOutputFormats;
            this.allowUnseekableMedia = builder.getHighSpeedVideoFpsRanges;
        }

        public androidx.media3.common.MediaItem.ClippingConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.ClippingConfiguration.Builder(this, (byte) 0);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.ClippingConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = (androidx.media3.common.MediaItem.ClippingConfiguration) obj;
            return this.startPositionUs == clippingConfiguration.startPositionUs && this.endPositionUs == clippingConfiguration.endPositionUs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame && this.allowUnseekableMedia == clippingConfiguration.allowUnseekableMedia;
        }

        public int hashCode() {
            long j = this.startPositionUs;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.endPositionUs;
            return (((((((((i * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0)) * 31) + (this.allowUnseekableMedia ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.startPositionMs;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(getInputFormats, j);
            }
            long j2 = this.endPositionMs;
            if (j2 != clippingConfiguration.endPositionMs) {
                bundle.putLong(getHighSpeedVideoFpsRangesFor, j2);
            }
            long j3 = this.startPositionUs;
            if (j3 != clippingConfiguration.startPositionUs) {
                bundle.putLong(getHighSpeedVideoSizes, j3);
            }
            long j4 = this.endPositionUs;
            if (j4 != clippingConfiguration.endPositionUs) {
                bundle.putLong(getHighSpeedVideoFpsRanges, j4);
            }
            boolean z = this.relativeToLiveWindow;
            if (z != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(getInputSizeshNQ4ISI, z);
            }
            boolean z2 = this.relativeToDefaultPosition;
            if (z2 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(getHighResolutionOutputSizeshNQ4ISI, z2);
            }
            boolean z3 = this.startsAtKeyFrame;
            if (z3 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(getOutputFormats, z3);
            }
            boolean z4 = this.allowUnseekableMedia;
            if (z4 != clippingConfiguration.allowUnseekableMedia) {
                bundle.putBoolean(Camera2StreamConfigurationMap, z4);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.ClippingProperties fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            java.lang.String str = getInputFormats;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder allowUnseekableMedia = builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(getHighSpeedVideoFpsRangesFor, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(getInputSizeshNQ4ISI, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(getHighResolutionOutputSizeshNQ4ISI, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(getOutputFormats, clippingConfiguration.startsAtKeyFrame)).setAllowUnseekableMedia(bundle.getBoolean(Camera2StreamConfigurationMap, clippingConfiguration.allowUnseekableMedia));
            long j = bundle.getLong(getHighSpeedVideoSizes, clippingConfiguration.startPositionUs);
            if (j != clippingConfiguration.startPositionUs) {
                allowUnseekableMedia.setStartPositionUs(j);
            }
            long j2 = bundle.getLong(getHighSpeedVideoFpsRanges, clippingConfiguration.endPositionUs);
            if (j2 != clippingConfiguration.endPositionUs) {
                allowUnseekableMedia.setEndPositionUs(j2);
            }
            return allowUnseekableMedia.buildClippingProperties();
        }
    }

    @java.lang.Deprecated
    public static final class ClippingProperties extends androidx.media3.common.MediaItem.ClippingConfiguration {
        public static final androidx.media3.common.MediaItem.ClippingProperties UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().buildClippingProperties();

        /* synthetic */ ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder, byte b) {
            this(builder);
        }

        private ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            super(builder, (byte) 0);
        }
    }

    public static final class RequestMetadata {
        public final android.os.Bundle extras;
        public final android.net.Uri mediaUri;
        public final java.lang.String searchQuery;
        public static final androidx.media3.common.MediaItem.RequestMetadata EMPTY = new androidx.media3.common.MediaItem.RequestMetadata.Builder().build();
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(2);

        /* synthetic */ RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder builder, byte b) {
            this(builder);
        }

        public static final class Builder {
            private android.net.Uri Camera2StreamConfigurationMap;
            private android.os.Bundle getHighResolutionOutputSizeshNQ4ISI;
            private java.lang.String getHighSpeedVideoFpsRangesFor;

            /* synthetic */ Builder(androidx.media3.common.MediaItem.RequestMetadata requestMetadata, byte b) {
                this(requestMetadata);
            }

            public Builder() {
            }

            private Builder(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
                this.Camera2StreamConfigurationMap = requestMetadata.mediaUri;
                this.getHighSpeedVideoFpsRangesFor = requestMetadata.searchQuery;
                this.getHighResolutionOutputSizeshNQ4ISI = requestMetadata.extras;
            }

            public final androidx.media3.common.MediaItem.RequestMetadata.Builder setMediaUri(android.net.Uri uri) {
                this.Camera2StreamConfigurationMap = uri;
                return this;
            }

            public final androidx.media3.common.MediaItem.RequestMetadata.Builder setSearchQuery(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
                return this;
            }

            public final androidx.media3.common.MediaItem.RequestMetadata.Builder setExtras(android.os.Bundle bundle) {
                this.getHighResolutionOutputSizeshNQ4ISI = bundle;
                return this;
            }

            public final androidx.media3.common.MediaItem.RequestMetadata build() {
                return new androidx.media3.common.MediaItem.RequestMetadata(this, (byte) 0);
            }
        }

        private RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder builder) {
            this.mediaUri = builder.Camera2StreamConfigurationMap;
            this.searchQuery = builder.getHighSpeedVideoFpsRangesFor;
            this.extras = builder.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.media3.common.MediaItem.RequestMetadata.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder(this, (byte) 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.RequestMetadata)) {
                return false;
            }
            androidx.media3.common.MediaItem.RequestMetadata requestMetadata = (androidx.media3.common.MediaItem.RequestMetadata) obj;
            if (java.util.Objects.equals(this.mediaUri, requestMetadata.mediaUri) && java.util.Objects.equals(this.searchQuery, requestMetadata.searchQuery)) {
                if ((this.extras == null) == (requestMetadata.extras == null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            android.net.Uri uri = this.mediaUri;
            int hashCode = uri == null ? 0 : uri.hashCode();
            java.lang.String str = this.searchQuery;
            return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.extras != null ? 1 : 0);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            android.net.Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(getHighSpeedVideoSizes, uri);
            }
            java.lang.String str = this.searchQuery;
            if (str != null) {
                bundle.putString(getHighResolutionOutputSizeshNQ4ISI, str);
            }
            android.os.Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(getHighSpeedVideoFpsRanges, bundle2);
            }
            return bundle;
        }

        public static androidx.media3.common.MediaItem.RequestMetadata fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri((android.net.Uri) bundle.getParcelable(getHighSpeedVideoSizes)).setSearchQuery(bundle.getString(getHighResolutionOutputSizeshNQ4ISI)).setExtras(bundle.getBundle(getHighSpeedVideoFpsRanges)).build();
        }
    }

    private MediaItem(java.lang.String str, androidx.media3.common.MediaItem.ClippingProperties clippingProperties, androidx.media3.common.MediaItem.LocalConfiguration localConfiguration, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public final androidx.media3.common.MediaItem.Builder buildUpon() {
        return new androidx.media3.common.MediaItem.Builder(this, (byte) 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.MediaItem)) {
            return false;
        }
        androidx.media3.common.MediaItem mediaItem = (androidx.media3.common.MediaItem) obj;
        return java.util.Objects.equals(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && java.util.Objects.equals(this.localConfiguration, mediaItem.localConfiguration) && java.util.Objects.equals(this.liveConfiguration, mediaItem.liveConfiguration) && java.util.Objects.equals(this.mediaMetadata, mediaItem.mediaMetadata) && java.util.Objects.equals(this.requestMetadata, mediaItem.requestMetadata);
    }

    public final int hashCode() {
        int hashCode = this.mediaId.hashCode();
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = this.localConfiguration;
        int hashCode2 = localConfiguration != null ? localConfiguration.hashCode() : 0;
        return (((((((((hashCode * 31) + hashCode2) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    private android.os.Bundle getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(getHighSpeedVideoSizes, this.mediaId);
        }
        if (!this.liveConfiguration.equals(androidx.media3.common.MediaItem.LiveConfiguration.UNSET)) {
            bundle.putBundle(getHighSpeedVideoFpsRanges, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(androidx.media3.common.MediaMetadata.EMPTY)) {
            bundle.putBundle(Camera2StreamConfigurationMap, this.mediaMetadata.toBundle());
        }
        if (!this.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET)) {
            bundle.putBundle(getHighResolutionOutputSizeshNQ4ISI, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(androidx.media3.common.MediaItem.RequestMetadata.EMPTY)) {
            bundle.putBundle(getOutputFormats, this.requestMetadata.toBundle());
        }
        if (z && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(getHighSpeedVideoFpsRangesFor, localConfiguration.toBundle());
        }
        return bundle;
    }

    public final android.os.Bundle toBundle() {
        return getHighResolutionOutputSizeshNQ4ISI(false);
    }

    public final android.os.Bundle toBundleIncludeLocalConfiguration() {
        return getHighResolutionOutputSizeshNQ4ISI(true);
    }

    public static androidx.media3.common.MediaItem fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.MediaItem.LiveConfiguration fromBundle;
        androidx.media3.common.MediaMetadata fromBundle2;
        androidx.media3.common.MediaItem.ClippingProperties fromBundle3;
        androidx.media3.common.MediaItem.RequestMetadata fromBundle4;
        java.lang.String str = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(bundle.getString(getHighSpeedVideoSizes, ""));
        android.os.Bundle bundle2 = bundle.getBundle(getHighSpeedVideoFpsRanges);
        if (bundle2 == null) {
            fromBundle = androidx.media3.common.MediaItem.LiveConfiguration.UNSET;
        } else {
            fromBundle = androidx.media3.common.MediaItem.LiveConfiguration.fromBundle(bundle2);
        }
        androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = fromBundle;
        android.os.Bundle bundle3 = bundle.getBundle(Camera2StreamConfigurationMap);
        if (bundle3 == null) {
            fromBundle2 = androidx.media3.common.MediaMetadata.EMPTY;
        } else {
            fromBundle2 = androidx.media3.common.MediaMetadata.fromBundle(bundle3);
        }
        androidx.media3.common.MediaMetadata mediaMetadata = fromBundle2;
        android.os.Bundle bundle4 = bundle.getBundle(getHighResolutionOutputSizeshNQ4ISI);
        if (bundle4 == null) {
            fromBundle3 = androidx.media3.common.MediaItem.ClippingProperties.UNSET;
        } else {
            fromBundle3 = androidx.media3.common.MediaItem.ClippingConfiguration.fromBundle(bundle4);
        }
        androidx.media3.common.MediaItem.ClippingProperties clippingProperties = fromBundle3;
        android.os.Bundle bundle5 = bundle.getBundle(getOutputFormats);
        if (bundle5 == null) {
            fromBundle4 = androidx.media3.common.MediaItem.RequestMetadata.EMPTY;
        } else {
            fromBundle4 = androidx.media3.common.MediaItem.RequestMetadata.fromBundle(bundle5);
        }
        androidx.media3.common.MediaItem.RequestMetadata requestMetadata = fromBundle4;
        android.os.Bundle bundle6 = bundle.getBundle(getHighSpeedVideoFpsRangesFor);
        return new androidx.media3.common.MediaItem(str, clippingProperties, bundle6 == null ? null : androidx.media3.common.MediaItem.LocalConfiguration.fromBundle(bundle6), liveConfiguration, mediaMetadata, requestMetadata);
    }
}
