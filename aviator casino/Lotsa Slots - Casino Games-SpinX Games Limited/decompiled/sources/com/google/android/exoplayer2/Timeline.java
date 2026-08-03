package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public abstract class Timeline implements com.google.android.exoplayer2.Bundleable {
    private static final int FIELD_PERIODS = 1;
    private static final int FIELD_SHUFFLED_WINDOW_INDICES = 2;
    private static final int FIELD_WINDOWS = 0;
    public static final com.google.android.exoplayer2.Timeline EMPTY = new com.google.android.exoplayer2.Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    };
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Timeline$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.Timeline fromBundle;
            fromBundle = com.google.android.exoplayer2.Timeline.fromBundle(bundle);
            return fromBundle;
        }
    };

    public abstract int getIndexOfPeriod(java.lang.Object obj);

    public abstract com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z);

    public abstract int getPeriodCount();

    public abstract java.lang.Object getUidOfPeriod(int i);

    public abstract com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j);

    public abstract int getWindowCount();

    public static final class Window implements com.google.android.exoplayer2.Bundleable {
        private static final int FIELD_DEFAULT_POSITION_US = 9;
        private static final int FIELD_DURATION_US = 10;
        private static final int FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = 4;
        private static final int FIELD_FIRST_PERIOD_INDEX = 11;
        private static final int FIELD_IS_DYNAMIC = 6;
        private static final int FIELD_IS_PLACEHOLDER = 8;
        private static final int FIELD_IS_SEEKABLE = 5;
        private static final int FIELD_LAST_PERIOD_INDEX = 12;
        private static final int FIELD_LIVE_CONFIGURATION = 7;
        private static final int FIELD_MEDIA_ITEM = 1;
        private static final int FIELD_POSITION_IN_FIRST_PERIOD_US = 13;
        private static final int FIELD_PRESENTATION_START_TIME_MS = 2;
        private static final int FIELD_WINDOW_START_TIME_MS = 3;
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @java.lang.Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
        public java.lang.Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @java.lang.Deprecated
        public java.lang.Object tag;
        public long windowStartTimeMs;
        public static final java.lang.Object SINGLE_WINDOW_UID = new java.lang.Object();
        private static final java.lang.Object FAKE_WINDOW_UID = new java.lang.Object();
        private static final com.google.android.exoplayer2.MediaItem EMPTY_MEDIA_ITEM = new com.google.android.exoplayer2.MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(android.net.Uri.EMPTY).build();
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline.Window> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Timeline$Window$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.Timeline.Window fromBundle;
                fromBundle = com.google.android.exoplayer2.Timeline.Window.fromBundle(bundle);
                return fromBundle;
            }
        };
        public java.lang.Object uid = SINGLE_WINDOW_UID;
        public com.google.android.exoplayer2.MediaItem mediaItem = EMPTY_MEDIA_ITEM;

        public com.google.android.exoplayer2.Timeline.Window set(java.lang.Object obj, com.google.android.exoplayer2.MediaItem mediaItem, java.lang.Object obj2, long j, long j2, long j3, boolean z, boolean z2, com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : EMPTY_MEDIA_ITEM;
            this.tag = (mediaItem == null || mediaItem.localConfiguration == null) ? null : mediaItem.localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j4;
            this.durationUs = j5;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j6;
            this.isPlaceholder = false;
            return this;
        }

        public long getDefaultPositionMs() {
            return com.google.android.exoplayer2.util.Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return com.google.android.exoplayer2.util.Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return com.google.android.exoplayer2.util.Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public long getCurrentUnixTimeMs() {
            return com.google.android.exoplayer2.util.Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public boolean isLive() {
            com.google.android.exoplayer2.util.Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            com.google.android.exoplayer2.Timeline.Window window = (com.google.android.exoplayer2.Timeline.Window) obj;
            return com.google.android.exoplayer2.util.Util.areEqual(this.uid, window.uid) && com.google.android.exoplayer2.util.Util.areEqual(this.mediaItem, window.mediaItem) && com.google.android.exoplayer2.util.Util.areEqual(this.manifest, window.manifest) && com.google.android.exoplayer2.util.Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int hashCode = (((com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            java.lang.Object obj = this.manifest;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode3 = (hashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j = this.presentationStartTimeMs;
            int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j4 = this.defaultPositionUs;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.durationUs;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j6 = this.positionInFirstPeriodUs;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.os.Bundle toBundle(boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBundle(keyForField(1), (z ? com.google.android.exoplayer2.MediaItem.EMPTY : this.mediaItem).toBundle());
            bundle.putLong(keyForField(2), this.presentationStartTimeMs);
            bundle.putLong(keyForField(3), this.windowStartTimeMs);
            bundle.putLong(keyForField(4), this.elapsedRealtimeEpochOffsetMs);
            bundle.putBoolean(keyForField(5), this.isSeekable);
            bundle.putBoolean(keyForField(6), this.isDynamic);
            com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(keyForField(7), liveConfiguration.toBundle());
            }
            bundle.putBoolean(keyForField(8), this.isPlaceholder);
            bundle.putLong(keyForField(9), this.defaultPositionUs);
            bundle.putLong(keyForField(10), this.durationUs);
            bundle.putInt(keyForField(11), this.firstPeriodIndex);
            bundle.putInt(keyForField(12), this.lastPeriodIndex);
            bundle.putLong(keyForField(13), this.positionInFirstPeriodUs);
            return bundle;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            return toBundle(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.exoplayer2.Timeline.Window fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(keyForField(1));
            com.google.android.exoplayer2.MediaItem fromBundle = bundle2 != null ? com.google.android.exoplayer2.MediaItem.CREATOR.fromBundle(bundle2) : null;
            long j = bundle.getLong(keyForField(2), -9223372036854775807L);
            long j2 = bundle.getLong(keyForField(3), -9223372036854775807L);
            long j3 = bundle.getLong(keyForField(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(keyForField(5), false);
            boolean z2 = bundle.getBoolean(keyForField(6), false);
            android.os.Bundle bundle3 = bundle.getBundle(keyForField(7));
            com.google.android.exoplayer2.MediaItem.LiveConfiguration fromBundle2 = bundle3 != null ? com.google.android.exoplayer2.MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(keyForField(8), false);
            long j4 = bundle.getLong(keyForField(9), 0L);
            long j5 = bundle.getLong(keyForField(10), -9223372036854775807L);
            int i = bundle.getInt(keyForField(11), 0);
            int i2 = bundle.getInt(keyForField(12), 0);
            long j6 = bundle.getLong(keyForField(13), 0L);
            com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
            window.set(FAKE_WINDOW_UID, fromBundle, null, j, j2, j3, z, z2, fromBundle2, j4, j5, i, i2, j6);
            window.isPlaceholder = z3;
            return window;
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    public static final class Period implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Timeline.Period> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.Timeline$Period$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.Timeline.Period fromBundle;
                fromBundle = com.google.android.exoplayer2.Timeline.Period.fromBundle(bundle);
                return fromBundle;
            }
        };
        private static final int FIELD_AD_PLAYBACK_STATE = 4;
        private static final int FIELD_DURATION_US = 1;
        private static final int FIELD_PLACEHOLDER = 3;
        private static final int FIELD_POSITION_IN_WINDOW_US = 2;
        private static final int FIELD_WINDOW_INDEX = 0;
        private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE;
        public long durationUs;
        public java.lang.Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public java.lang.Object uid;
        public int windowIndex;

        public com.google.android.exoplayer2.Timeline.Period set(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE, false);
        }

        public com.google.android.exoplayer2.Timeline.Period set(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState, boolean z) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z;
            return this;
        }

        public long getDurationMs() {
            return com.google.android.exoplayer2.util.Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInWindowMs() {
            return com.google.android.exoplayer2.util.Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public java.lang.Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public long getAdGroupTimeUs(int i) {
            return this.adPlaybackState.getAdGroup(i).timeUs;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.adPlaybackState.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.adPlaybackState.getAdGroup(i).hasUnplayedAds();
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public int getAdCountInAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).count;
        }

        public long getAdDurationUs(int i, int i2) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.durationsUs[i2];
            }
            return -9223372036854775807L;
        }

        public int getAdState(int i, int i2) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.states[i2];
            }
            return 0;
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public boolean isServerSideInsertedAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).isServerSideInserted;
        }

        public long getContentResumeOffsetUs(int i) {
            return this.adPlaybackState.getAdGroup(i).contentResumeOffsetUs;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            com.google.android.exoplayer2.Timeline.Period period = (com.google.android.exoplayer2.Timeline.Period) obj;
            return com.google.android.exoplayer2.util.Util.areEqual(this.id, period.id) && com.google.android.exoplayer2.util.Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && com.google.android.exoplayer2.util.Util.areEqual(this.adPlaybackState, period.adPlaybackState);
        }

        public int hashCode() {
            java.lang.Object obj = this.id;
            int hashCode = (com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            java.lang.Object obj2 = this.uid;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.positionInWindowUs;
            return ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.adPlaybackState.hashCode();
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(keyForField(0), this.windowIndex);
            bundle.putLong(keyForField(1), this.durationUs);
            bundle.putLong(keyForField(2), this.positionInWindowUs);
            bundle.putBoolean(keyForField(3), this.isPlaceholder);
            bundle.putBundle(keyForField(4), this.adPlaybackState.toBundle());
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.exoplayer2.Timeline.Period fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
            int i = bundle.getInt(keyForField(0), 0);
            long j = bundle.getLong(keyForField(1), -9223372036854775807L);
            long j2 = bundle.getLong(keyForField(2), 0L);
            boolean z = bundle.getBoolean(keyForField(3));
            android.os.Bundle bundle2 = bundle.getBundle(keyForField(4));
            if (bundle2 != null) {
                adPlaybackState = com.google.android.exoplayer2.source.ads.AdPlaybackState.CREATOR.fromBundle(bundle2);
            } else {
                adPlaybackState = com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE;
            }
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState2 = adPlaybackState;
            com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
            period.set(null, null, i, j, j2, adPlaybackState2, z);
            return period;
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    protected Timeline() {
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getLastWindowIndex(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getLastWindowIndex(z) ? getFirstWindowIndex(z) : i + 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getFirstWindowIndex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getFirstWindowIndex(z) ? getLastWindowIndex(z) : i - 1;
        }
        throw new java.lang.IllegalStateException();
    }

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public final com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window) {
        return getWindow(i, window, 0L);
    }

    public final int getNextPeriodIndex(int i, com.google.android.exoplayer2.Timeline.Period period, com.google.android.exoplayer2.Timeline.Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period).windowIndex;
        if (getWindow(i3, window).lastPeriodIndex != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public final boolean isLastPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, com.google.android.exoplayer2.Timeline.Window window, int i2, boolean z) {
        return getNextPeriodIndex(i, period, window, i2, z) == -1;
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period, int i, long j) {
        return getPeriodPositionUs(window, period, i, j);
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period, int i, long j, long j2) {
        return getPeriodPositionUs(window, period, i, j, j2);
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period, int i, long j) {
        return (android.util.Pair) com.google.android.exoplayer2.util.Assertions.checkNotNull(getPeriodPositionUs(window, period, i, j, 0L));
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period, int i, long j, long j2) {
        com.google.android.exoplayer2.util.Assertions.checkIndex(i, 0, getWindowCount());
        getWindow(i, window, j2);
        if (j == -9223372036854775807L) {
            j = window.getDefaultPositionUs();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        getPeriod(i2, period);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, period).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, period, true);
        long j3 = j - period.positionInWindowUs;
        if (period.durationUs != -9223372036854775807L) {
            j3 = java.lang.Math.min(j3, period.durationUs - 1);
        }
        return android.util.Pair.create(com.google.android.exoplayer2.util.Assertions.checkNotNull(period.uid), java.lang.Long.valueOf(java.lang.Math.max(0L, j3)));
    }

    public com.google.android.exoplayer2.Timeline.Period getPeriodByUid(java.lang.Object obj, com.google.android.exoplayer2.Timeline.Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public final com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period) {
        return getPeriod(i, period, false);
    }

    public boolean equals(java.lang.Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.exoplayer2.Timeline)) {
            return false;
        }
        com.google.android.exoplayer2.Timeline timeline = (com.google.android.exoplayer2.Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        com.google.android.exoplayer2.Timeline.Window window2 = new com.google.android.exoplayer2.Timeline.Window();
        com.google.android.exoplayer2.Timeline.Period period2 = new com.google.android.exoplayer2.Timeline.Period();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, window).equals(timeline.getWindow(i, window2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != timeline.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != timeline.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int hashCode() {
        com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        int windowCount = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final android.os.Bundle toBundle(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int windowCount = getWindowCount();
        com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, window, 0L).toBundle(z));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int periodCount = getPeriodCount();
        com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.exoplayer2.util.BundleUtil.putBinder(bundle, keyForField(0), new com.google.android.exoplayer2.BundleListRetriever(arrayList));
        com.google.android.exoplayer2.util.BundleUtil.putBinder(bundle, keyForField(1), new com.google.android.exoplayer2.BundleListRetriever(arrayList2));
        bundle.putIntArray(keyForField(2), iArr);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final android.os.Bundle toBundle() {
        return toBundle(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.Timeline fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleListRetriever = fromBundleListRetriever(com.google.android.exoplayer2.Timeline.Window.CREATOR, com.google.android.exoplayer2.util.BundleUtil.getBinder(bundle, keyForField(0)));
        com.google.common.collect.ImmutableList fromBundleListRetriever2 = fromBundleListRetriever(com.google.android.exoplayer2.Timeline.Period.CREATOR, com.google.android.exoplayer2.util.BundleUtil.getBinder(bundle, keyForField(1)));
        int[] intArray = bundle.getIntArray(keyForField(2));
        if (intArray == null) {
            intArray = generateUnshuffledIndices(fromBundleListRetriever.size());
        }
        return new com.google.android.exoplayer2.Timeline.RemotableTimeline(fromBundleListRetriever, fromBundleListRetriever2, intArray);
    }

    private static <T extends com.google.android.exoplayer2.Bundleable> com.google.common.collect.ImmutableList<T> fromBundleListRetriever(com.google.android.exoplayer2.Bundleable.Creator<T> creator, android.os.IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList<android.os.Bundle> list = com.google.android.exoplayer2.BundleListRetriever.getList(iBinder);
        for (int i = 0; i < list.size(); i++) {
            builder.add((com.google.common.collect.ImmutableList.Builder) creator.fromBundle(list.get(i)));
        }
        return builder.build();
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static int[] generateUnshuffledIndices(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public static final class RemotableTimeline extends com.google.android.exoplayer2.Timeline {
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Window> windows;

        public RemotableTimeline(com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Window> immutableList, com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Timeline.Period> immutableList2, int[] iArr) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(immutableList.size() == iArr.length);
            this.windows = immutableList;
            this.periods = immutableList2;
            this.shuffledWindowIndices = iArr;
            this.windowIndicesInShuffled = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.windowIndicesInShuffled[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.windows.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            com.google.android.exoplayer2.Timeline.Window window2 = this.windows.get(i);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getLastWindowIndex(z)) {
                return z ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return getFirstWindowIndex(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getFirstWindowIndex(z)) {
                return z ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return getLastWindowIndex(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.shuffledWindowIndices[getWindowCount() - 1];
            }
            return getWindowCount() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.shuffledWindowIndices[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.periods.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            com.google.android.exoplayer2.Timeline.Period period2 = this.periods.get(i);
            period.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
