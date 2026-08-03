package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class MediaItem implements com.google.android.exoplayer2.Bundleable {
    public static final java.lang.String DEFAULT_MEDIA_ID = "";
    private static final int FIELD_CLIPPING_PROPERTIES = 3;
    private static final int FIELD_LIVE_CONFIGURATION = 1;
    private static final int FIELD_MEDIA_ID = 0;
    private static final int FIELD_MEDIA_METADATA = 2;
    private static final int FIELD_REQUEST_METADATA = 4;
    public final com.google.android.exoplayer2.MediaItem.ClippingConfiguration clippingConfiguration;

    @java.lang.Deprecated
    public final com.google.android.exoplayer2.MediaItem.ClippingProperties clippingProperties;
    public final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
    public final com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration;
    public final java.lang.String mediaId;
    public final com.google.android.exoplayer2.MediaMetadata mediaMetadata;

    @java.lang.Deprecated
    public final com.google.android.exoplayer2.MediaItem.PlaybackProperties playbackProperties;
    public final com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata;
    public static final com.google.android.exoplayer2.MediaItem EMPTY = new com.google.android.exoplayer2.MediaItem.Builder().build();
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.MediaItem$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.MediaItem fromBundle;
            fromBundle = com.google.android.exoplayer2.MediaItem.fromBundle(bundle);
            return fromBundle;
        }
    };

    public static com.google.android.exoplayer2.MediaItem fromUri(java.lang.String str) {
        return new com.google.android.exoplayer2.MediaItem.Builder().setUri(str).build();
    }

    public static com.google.android.exoplayer2.MediaItem fromUri(android.net.Uri uri) {
        return new com.google.android.exoplayer2.MediaItem.Builder().setUri(uri).build();
    }

    public static final class Builder {
        private com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration;
        private com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder clippingConfiguration;
        private java.lang.String customCacheKey;
        private com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder drmConfiguration;
        private com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder liveConfiguration;
        private java.lang.String mediaId;
        private com.google.android.exoplayer2.MediaMetadata mediaMetadata;
        private java.lang.String mimeType;
        private com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata;
        private java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
        private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> subtitleConfigurations;
        private java.lang.Object tag;
        private android.net.Uri uri;

        public Builder() {
            this.clippingConfiguration = new com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder();
            this.drmConfiguration = new com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder();
            this.streamKeys = java.util.Collections.emptyList();
            this.subtitleConfigurations = com.google.common.collect.ImmutableList.of();
            this.liveConfiguration = new com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder();
            this.requestMetadata = com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY;
        }

        private Builder(com.google.android.exoplayer2.MediaItem mediaItem) {
            this();
            com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder builder;
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                if (localConfiguration.drmConfiguration != null) {
                    builder = localConfiguration.drmConfiguration.buildUpon();
                } else {
                    builder = new com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
            }
        }

        public com.google.android.exoplayer2.MediaItem.Builder setMediaId(java.lang.String str) {
            this.mediaId = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(str);
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setUri(java.lang.String str) {
            return setUri(str == null ? null : android.net.Uri.parse(str));
        }

        public com.google.android.exoplayer2.MediaItem.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setMimeType(java.lang.String str) {
            this.mimeType = str;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setClippingConfiguration(com.google.android.exoplayer2.MediaItem.ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipStartPositionMs(long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipRelativeToLiveWindow(boolean z) {
            this.clippingConfiguration.setRelativeToLiveWindow(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipRelativeToDefaultPosition(boolean z) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setClipStartsAtKeyFrame(boolean z) {
            this.clippingConfiguration.setStartsAtKeyFrame(z);
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setDrmConfiguration(com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder();
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseUri(android.net.Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseUri(java.lang.String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = com.google.common.collect.ImmutableMap.of();
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmUuid(java.util.UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmMultiSession(boolean z) {
            this.drmConfiguration.setMultiSession(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmForceDefaultLicenseUri(boolean z) {
            this.drmConfiguration.setForceDefaultLicenseUri(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmPlayClearContentWithoutKey(boolean z) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmSessionForClearPeriods(boolean z) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmSessionForClearTypes(java.util.List<java.lang.Integer> list) {
            com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                list = com.google.common.collect.ImmutableList.of();
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setDrmKeySetId(byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setStreamKeys(java.util.List<com.google.android.exoplayer2.offline.StreamKey> list) {
            java.util.List<com.google.android.exoplayer2.offline.StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            } else {
                emptyList = java.util.Collections.emptyList();
            }
            this.streamKeys = emptyList;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setCustomCacheKey(java.lang.String str) {
            this.customCacheKey = str;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setSubtitles(java.util.List<com.google.android.exoplayer2.MediaItem.Subtitle> list) {
            this.subtitleConfigurations = list != null ? com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list) : com.google.common.collect.ImmutableList.of();
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setSubtitleConfigurations(java.util.List<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> list) {
            this.subtitleConfigurations = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setAdsConfiguration(com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(java.lang.String str) {
            return setAdTagUri(str != null ? android.net.Uri.parse(str) : null);
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(android.net.Uri uri) {
            return setAdTagUri(uri, null);
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setAdTagUri(android.net.Uri uri, java.lang.Object obj) {
            this.adsConfiguration = uri != null ? new com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setLiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMinPlaybackSpeed(float f) {
            this.liveConfiguration.setMinPlaybackSpeed(f);
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaItem.Builder setLiveMaxPlaybackSpeed(float f) {
            this.liveConfiguration.setMaxPlaybackSpeed(f);
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setMediaMetadata(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem.Builder setRequestMetadata(com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        public com.google.android.exoplayer2.MediaItem build() {
            com.google.android.exoplayer2.MediaItem.PlaybackProperties playbackProperties;
            com.google.android.exoplayer2.util.Assertions.checkState(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            android.net.Uri uri = this.uri;
            if (uri != null) {
                playbackProperties = new com.google.android.exoplayer2.MediaItem.PlaybackProperties(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag);
            } else {
                playbackProperties = null;
            }
            java.lang.String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            com.google.android.exoplayer2.MediaItem.ClippingProperties buildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            com.google.android.exoplayer2.MediaItem.LiveConfiguration build = this.liveConfiguration.build();
            com.google.android.exoplayer2.MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = com.google.android.exoplayer2.MediaMetadata.EMPTY;
            }
            return new com.google.android.exoplayer2.MediaItem(str2, buildClippingProperties, playbackProperties, build, mediaMetadata, this.requestMetadata);
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;
        private final byte[] keySetId;
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

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private com.google.common.collect.ImmutableList<java.lang.Integer> forcedSessionTrackTypes;
            private byte[] keySetId;
            private com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> licenseRequestHeaders;
            private android.net.Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private java.util.UUID scheme;

            public Builder(java.util.UUID uuid) {
                this.scheme = uuid;
                this.licenseRequestHeaders = com.google.common.collect.ImmutableMap.of();
                this.forcedSessionTrackTypes = com.google.common.collect.ImmutableList.of();
            }

            @java.lang.Deprecated
            private Builder() {
                this.licenseRequestHeaders = com.google.common.collect.ImmutableMap.of();
                this.forcedSessionTrackTypes = com.google.common.collect.ImmutableList.of();
            }

            private Builder(com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @java.lang.Deprecated
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setNullableScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseUri(android.net.Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseUri(java.lang.String str) {
                this.licenseUri = str == null ? null : android.net.Uri.parse(str);
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
                this.licenseRequestHeaders = com.google.common.collect.ImmutableMap.copyOf((java.util.Map) map);
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setMultiSession(boolean z) {
                this.multiSession = z;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForceDefaultLicenseUri(boolean z) {
                this.forceDefaultLicenseUri = z;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setPlayClearContentWithoutKey(boolean z) {
                this.playClearContentWithoutKey = z;
                return this;
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder forceSessionsForAudioAndVideoTracks(boolean z) {
                return setForceSessionsForAudioAndVideoTracks(z);
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForceSessionsForAudioAndVideoTracks(boolean z) {
                com.google.common.collect.ImmutableList of;
                if (z) {
                    of = com.google.common.collect.ImmutableList.of(2, 1);
                } else {
                    of = com.google.common.collect.ImmutableList.of();
                }
                setForcedSessionTrackTypes(of);
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setForcedSessionTrackTypes(java.util.List<java.lang.Integer> list) {
                this.forcedSessionTrackTypes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder setKeySetId(byte[] bArr) {
                this.keySetId = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.DrmConfiguration build() {
                return new com.google.android.exoplayer2.MediaItem.DrmConfiguration(this);
            }
        }

        private DrmConfiguration(com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder builder) {
            com.google.android.exoplayer2.util.Assertions.checkState((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            java.util.UUID uuid = (java.util.UUID) com.google.android.exoplayer2.util.Assertions.checkNotNull(builder.scheme);
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? java.util.Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.DrmConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.DrmConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration = (com.google.android.exoplayer2.MediaItem.DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && com.google.android.exoplayer2.util.Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && com.google.android.exoplayer2.util.Util.areEqual(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && java.util.Arrays.equals(this.keySetId, drmConfiguration.keySetId);
        }

        public int hashCode() {
            int hashCode = this.scheme.hashCode() * 31;
            android.net.Uri uri = this.licenseUri;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.licenseRequestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.forcedSessionTrackTypes.hashCode()) * 31) + java.util.Arrays.hashCode(this.keySetId);
        }
    }

    public static final class AdsConfiguration {
        public final android.net.Uri adTagUri;
        public final java.lang.Object adsId;

        public static final class Builder {
            private android.net.Uri adTagUri;
            private java.lang.Object adsId;

            public Builder(android.net.Uri uri) {
                this.adTagUri = uri;
            }

            public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder setAdTagUri(android.net.Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder setAdsId(java.lang.Object obj) {
                this.adsId = obj;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.AdsConfiguration build() {
                return new com.google.android.exoplayer2.MediaItem.AdsConfiguration(this);
            }
        }

        private AdsConfiguration(com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }

        public com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.AdsConfiguration.Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.AdsConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration = (com.google.android.exoplayer2.MediaItem.AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && com.google.android.exoplayer2.util.Util.areEqual(this.adsId, adsConfiguration.adsId);
        }

        public int hashCode() {
            int hashCode = this.adTagUri.hashCode() * 31;
            java.lang.Object obj = this.adsId;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class LocalConfiguration {
        public final com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration;
        public final java.lang.String customCacheKey;
        public final com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration;
        public final java.lang.String mimeType;
        public final java.util.List<com.google.android.exoplayer2.offline.StreamKey> streamKeys;
        public final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> subtitleConfigurations;

        @java.lang.Deprecated
        public final java.util.List<com.google.android.exoplayer2.MediaItem.Subtitle> subtitles;
        public final java.lang.Object tag;
        public final android.net.Uri uri;

        private LocalConfiguration(android.net.Uri uri, java.lang.String str, com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration, com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration, java.util.List<com.google.android.exoplayer2.offline.StreamKey> list, java.lang.String str2, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> immutableList, java.lang.Object obj) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = immutableList;
            com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((com.google.common.collect.ImmutableList.Builder) immutableList.get(i).buildUpon().buildSubtitle());
            }
            this.subtitles = builder.build();
            this.tag = obj;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.LocalConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration = (com.google.android.exoplayer2.MediaItem.LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && com.google.android.exoplayer2.util.Util.areEqual(this.mimeType, localConfiguration.mimeType) && com.google.android.exoplayer2.util.Util.areEqual(this.drmConfiguration, localConfiguration.drmConfiguration) && com.google.android.exoplayer2.util.Util.areEqual(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && com.google.android.exoplayer2.util.Util.areEqual(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && com.google.android.exoplayer2.util.Util.areEqual(this.tag, localConfiguration.tag);
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            int hashCode3 = (hashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            int hashCode4 = (((hashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            java.lang.String str2 = this.customCacheKey;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitleConfigurations.hashCode()) * 31;
            java.lang.Object obj = this.tag;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @java.lang.Deprecated
    public static final class PlaybackProperties extends com.google.android.exoplayer2.MediaItem.LocalConfiguration {
        private PlaybackProperties(android.net.Uri uri, java.lang.String str, com.google.android.exoplayer2.MediaItem.DrmConfiguration drmConfiguration, com.google.android.exoplayer2.MediaItem.AdsConfiguration adsConfiguration, java.util.List<com.google.android.exoplayer2.offline.StreamKey> list, java.lang.String str2, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.MediaItem.SubtitleConfiguration> immutableList, java.lang.Object obj) {
            super(uri, str, drmConfiguration, adsConfiguration, list, str2, immutableList, obj);
        }
    }

    public static final class LiveConfiguration implements com.google.android.exoplayer2.Bundleable {
        private static final int FIELD_MAX_OFFSET_MS = 2;
        private static final int FIELD_MAX_PLAYBACK_SPEED = 4;
        private static final int FIELD_MIN_OFFSET_MS = 1;
        private static final int FIELD_MIN_PLAYBACK_SPEED = 3;
        private static final int FIELD_TARGET_OFFSET_MS = 0;
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final com.google.android.exoplayer2.MediaItem.LiveConfiguration UNSET = new com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder().build();
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.LiveConfiguration> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.MediaItem$LiveConfiguration$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                return com.google.android.exoplayer2.MediaItem.LiveConfiguration.lambda$static$0(bundle);
            }
        };

        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public Builder() {
                this.targetOffsetMs = -9223372036854775807L;
                this.minOffsetMs = -9223372036854775807L;
                this.maxOffsetMs = -9223372036854775807L;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMinPlaybackSpeed(float f) {
                this.minPlaybackSpeed = f;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder setMaxPlaybackSpeed(float f) {
                this.maxPlaybackSpeed = f;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.LiveConfiguration build() {
                return new com.google.android.exoplayer2.MediaItem.LiveConfiguration(this);
            }
        }

        private LiveConfiguration(com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @java.lang.Deprecated
        public LiveConfiguration(long j, long j2, long j3, float f, float f2) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j2;
            this.maxOffsetMs = j3;
            this.minPlaybackSpeed = f;
            this.maxPlaybackSpeed = f2;
        }

        public com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.LiveConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.LiveConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration = (com.google.android.exoplayer2.MediaItem.LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j2 = this.minOffsetMs;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.maxOffsetMs;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            float f = this.minPlaybackSpeed;
            int floatToIntBits = (i2 + (f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.maxPlaybackSpeed;
            return floatToIntBits + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(keyForField(0), this.targetOffsetMs);
            bundle.putLong(keyForField(1), this.minOffsetMs);
            bundle.putLong(keyForField(2), this.maxOffsetMs);
            bundle.putFloat(keyForField(3), this.minPlaybackSpeed);
            bundle.putFloat(keyForField(4), this.maxPlaybackSpeed);
            return bundle;
        }

        static /* synthetic */ com.google.android.exoplayer2.MediaItem.LiveConfiguration lambda$static$0(android.os.Bundle bundle) {
            return new com.google.android.exoplayer2.MediaItem.LiveConfiguration(bundle.getLong(keyForField(0), -9223372036854775807L), bundle.getLong(keyForField(1), -9223372036854775807L), bundle.getLong(keyForField(2), -9223372036854775807L), bundle.getFloat(keyForField(3), -3.4028235E38f), bundle.getFloat(keyForField(4), -3.4028235E38f));
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
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

        public static final class Builder {
            private java.lang.String id;
            private java.lang.String label;
            private java.lang.String language;
            private java.lang.String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private android.net.Uri uri;

            public Builder(android.net.Uri uri) {
                this.uri = uri;
            }

            private Builder(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.id = subtitleConfiguration.id;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setUri(android.net.Uri uri) {
                this.uri = uri;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setMimeType(java.lang.String str) {
                this.mimeType = str;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setLanguage(java.lang.String str) {
                this.language = str;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setSelectionFlags(int i) {
                this.selectionFlags = i;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setRoleFlags(int i) {
                this.roleFlags = i;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setLabel(java.lang.String str) {
                this.label = str;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder setId(java.lang.String str) {
                this.id = str;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration build() {
                return new com.google.android.exoplayer2.MediaItem.SubtitleConfiguration(this);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public com.google.android.exoplayer2.MediaItem.Subtitle buildSubtitle() {
                return new com.google.android.exoplayer2.MediaItem.Subtitle(this);
            }
        }

        private SubtitleConfiguration(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, java.lang.String str4) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i;
            this.roleFlags = i2;
            this.label = str3;
            this.id = str4;
        }

        private SubtitleConfiguration(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.id = builder.id;
        }

        public com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.SubtitleConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.SubtitleConfiguration subtitleConfiguration = (com.google.android.exoplayer2.MediaItem.SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && com.google.android.exoplayer2.util.Util.areEqual(this.mimeType, subtitleConfiguration.mimeType) && com.google.android.exoplayer2.util.Util.areEqual(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && com.google.android.exoplayer2.util.Util.areEqual(this.label, subtitleConfiguration.label) && com.google.android.exoplayer2.util.Util.areEqual(this.id, subtitleConfiguration.id);
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.language;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            java.lang.String str3 = this.label;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.id;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @java.lang.Deprecated
    public static final class Subtitle extends com.google.android.exoplayer2.MediaItem.SubtitleConfiguration {
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
            super(uri, str, str2, i, i2, str3, null);
        }

        private Subtitle(com.google.android.exoplayer2.MediaItem.SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static class ClippingConfiguration implements com.google.android.exoplayer2.Bundleable {
        private static final int FIELD_END_POSITION_MS = 1;
        private static final int FIELD_RELATIVE_TO_DEFAULT_POSITION = 3;
        private static final int FIELD_RELATIVE_TO_LIVE_WINDOW = 2;
        private static final int FIELD_STARTS_AT_KEY_FRAME = 4;
        private static final int FIELD_START_POSITION_MS = 0;
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;
        public static final com.google.android.exoplayer2.MediaItem.ClippingConfiguration UNSET = new com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder().build();
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.ClippingProperties> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.MediaItem$ClippingConfiguration$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.MediaItem.ClippingProperties buildClippingProperties;
                buildClippingProperties = new com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder().setStartPositionMs(bundle.getLong(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.keyForField(0), 0L)).setEndPositionMs(bundle.getLong(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.keyForField(1), Long.MIN_VALUE)).setRelativeToLiveWindow(bundle.getBoolean(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.keyForField(2), false)).setRelativeToDefaultPosition(bundle.getBoolean(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.keyForField(3), false)).setStartsAtKeyFrame(bundle.getBoolean(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.keyForField(4), false)).buildClippingProperties();
                return buildClippingProperties;
            }
        };

        public static final class Builder {
            private long endPositionMs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionMs;
            private boolean startsAtKeyFrame;

            public Builder() {
                this.endPositionMs = Long.MIN_VALUE;
            }

            private Builder(com.google.android.exoplayer2.MediaItem.ClippingConfiguration clippingConfiguration) {
                this.startPositionMs = clippingConfiguration.startPositionMs;
                this.endPositionMs = clippingConfiguration.endPositionMs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setStartPositionMs(long j) {
                com.google.android.exoplayer2.util.Assertions.checkArgument(j >= 0);
                this.startPositionMs = j;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setEndPositionMs(long j) {
                com.google.android.exoplayer2.util.Assertions.checkArgument(j == Long.MIN_VALUE || j >= 0);
                this.endPositionMs = j;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setRelativeToLiveWindow(boolean z) {
                this.relativeToLiveWindow = z;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setRelativeToDefaultPosition(boolean z) {
                this.relativeToDefaultPosition = z;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder setStartsAtKeyFrame(boolean z) {
                this.startsAtKeyFrame = z;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.ClippingConfiguration build() {
                return buildClippingProperties();
            }

            @java.lang.Deprecated
            public com.google.android.exoplayer2.MediaItem.ClippingProperties buildClippingProperties() {
                return new com.google.android.exoplayer2.MediaItem.ClippingProperties(this);
            }
        }

        private ClippingConfiguration(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder builder) {
            this.startPositionMs = builder.startPositionMs;
            this.endPositionMs = builder.endPositionMs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
        }

        public com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.ClippingConfiguration)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.ClippingConfiguration clippingConfiguration = (com.google.android.exoplayer2.MediaItem.ClippingConfiguration) obj;
            return this.startPositionMs == clippingConfiguration.startPositionMs && this.endPositionMs == clippingConfiguration.endPositionMs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame;
        }

        public int hashCode() {
            long j = this.startPositionMs;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.endPositionMs;
            return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(keyForField(0), this.startPositionMs);
            bundle.putLong(keyForField(1), this.endPositionMs);
            bundle.putBoolean(keyForField(2), this.relativeToLiveWindow);
            bundle.putBoolean(keyForField(3), this.relativeToDefaultPosition);
            bundle.putBoolean(keyForField(4), this.startsAtKeyFrame);
            return bundle;
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    @java.lang.Deprecated
    public static final class ClippingProperties extends com.google.android.exoplayer2.MediaItem.ClippingConfiguration {
        public static final com.google.android.exoplayer2.MediaItem.ClippingProperties UNSET = new com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(com.google.android.exoplayer2.MediaItem.ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static final class RequestMetadata implements com.google.android.exoplayer2.Bundleable {
        private static final int FIELD_EXTRAS = 2;
        private static final int FIELD_MEDIA_URI = 0;
        private static final int FIELD_SEARCH_QUERY = 1;
        public final android.os.Bundle extras;
        public final android.net.Uri mediaUri;
        public final java.lang.String searchQuery;
        public static final com.google.android.exoplayer2.MediaItem.RequestMetadata EMPTY = new com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder().build();
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaItem.RequestMetadata> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.MediaItem$RequestMetadata$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.MediaItem.RequestMetadata build;
                build = new com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder().setMediaUri((android.net.Uri) bundle.getParcelable(com.google.android.exoplayer2.MediaItem.RequestMetadata.keyForField(0))).setSearchQuery(bundle.getString(com.google.android.exoplayer2.MediaItem.RequestMetadata.keyForField(1))).setExtras(bundle.getBundle(com.google.android.exoplayer2.MediaItem.RequestMetadata.keyForField(2))).build();
                return build;
            }
        };

        public static final class Builder {
            private android.os.Bundle extras;
            private android.net.Uri mediaUri;
            private java.lang.String searchQuery;

            public Builder() {
            }

            private Builder(com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }

            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setMediaUri(android.net.Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setSearchQuery(java.lang.String str) {
                this.searchQuery = str;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder setExtras(android.os.Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public com.google.android.exoplayer2.MediaItem.RequestMetadata build() {
                return new com.google.android.exoplayer2.MediaItem.RequestMetadata(this);
            }
        }

        private RequestMetadata(com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }

        public com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder buildUpon() {
            return new com.google.android.exoplayer2.MediaItem.RequestMetadata.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.android.exoplayer2.MediaItem.RequestMetadata)) {
                return false;
            }
            com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata = (com.google.android.exoplayer2.MediaItem.RequestMetadata) obj;
            return com.google.android.exoplayer2.util.Util.areEqual(this.mediaUri, requestMetadata.mediaUri) && com.google.android.exoplayer2.util.Util.areEqual(this.searchQuery, requestMetadata.searchQuery);
        }

        public int hashCode() {
            android.net.Uri uri = this.mediaUri;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            java.lang.String str = this.searchQuery;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            if (this.mediaUri != null) {
                bundle.putParcelable(keyForField(0), this.mediaUri);
            }
            if (this.searchQuery != null) {
                bundle.putString(keyForField(1), this.searchQuery);
            }
            if (this.extras != null) {
                bundle.putBundle(keyForField(2), this.extras);
            }
            return bundle;
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    private MediaItem(java.lang.String str, com.google.android.exoplayer2.MediaItem.ClippingProperties clippingProperties, com.google.android.exoplayer2.MediaItem.PlaybackProperties playbackProperties, com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration, com.google.android.exoplayer2.MediaMetadata mediaMetadata, com.google.android.exoplayer2.MediaItem.RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = playbackProperties;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public com.google.android.exoplayer2.MediaItem.Builder buildUpon() {
        return new com.google.android.exoplayer2.MediaItem.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.MediaItem)) {
            return false;
        }
        com.google.android.exoplayer2.MediaItem mediaItem = (com.google.android.exoplayer2.MediaItem) obj;
        return com.google.android.exoplayer2.util.Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && com.google.android.exoplayer2.util.Util.areEqual(this.localConfiguration, mediaItem.localConfiguration) && com.google.android.exoplayer2.util.Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && com.google.android.exoplayer2.util.Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata) && com.google.android.exoplayer2.util.Util.areEqual(this.requestMetadata, mediaItem.requestMetadata);
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        com.google.android.exoplayer2.MediaItem.LocalConfiguration localConfiguration = this.localConfiguration;
        return ((((((((hashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingConfiguration.hashCode()) * 31) + this.mediaMetadata.hashCode()) * 31) + this.requestMetadata.hashCode();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(keyForField(0), this.mediaId);
        bundle.putBundle(keyForField(1), this.liveConfiguration.toBundle());
        bundle.putBundle(keyForField(2), this.mediaMetadata.toBundle());
        bundle.putBundle(keyForField(3), this.clippingConfiguration.toBundle());
        bundle.putBundle(keyForField(4), this.requestMetadata.toBundle());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.MediaItem fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.MediaItem.LiveConfiguration fromBundle;
        com.google.android.exoplayer2.MediaMetadata fromBundle2;
        com.google.android.exoplayer2.MediaItem.ClippingProperties fromBundle3;
        com.google.android.exoplayer2.MediaItem.RequestMetadata fromBundle4;
        java.lang.String str = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(bundle.getString(keyForField(0), ""));
        android.os.Bundle bundle2 = bundle.getBundle(keyForField(1));
        if (bundle2 == null) {
            fromBundle = com.google.android.exoplayer2.MediaItem.LiveConfiguration.UNSET;
        } else {
            fromBundle = com.google.android.exoplayer2.MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle2);
        }
        com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration = fromBundle;
        android.os.Bundle bundle3 = bundle.getBundle(keyForField(2));
        if (bundle3 == null) {
            fromBundle2 = com.google.android.exoplayer2.MediaMetadata.EMPTY;
        } else {
            fromBundle2 = com.google.android.exoplayer2.MediaMetadata.CREATOR.fromBundle(bundle3);
        }
        com.google.android.exoplayer2.MediaMetadata mediaMetadata = fromBundle2;
        android.os.Bundle bundle4 = bundle.getBundle(keyForField(3));
        if (bundle4 == null) {
            fromBundle3 = com.google.android.exoplayer2.MediaItem.ClippingProperties.UNSET;
        } else {
            fromBundle3 = com.google.android.exoplayer2.MediaItem.ClippingConfiguration.CREATOR.fromBundle(bundle4);
        }
        com.google.android.exoplayer2.MediaItem.ClippingProperties clippingProperties = fromBundle3;
        android.os.Bundle bundle5 = bundle.getBundle(keyForField(4));
        if (bundle5 == null) {
            fromBundle4 = com.google.android.exoplayer2.MediaItem.RequestMetadata.EMPTY;
        } else {
            fromBundle4 = com.google.android.exoplayer2.MediaItem.RequestMetadata.CREATOR.fromBundle(bundle5);
        }
        return new com.google.android.exoplayer2.MediaItem(str, clippingProperties, null, liveConfiguration, mediaMetadata, fromBundle4);
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
