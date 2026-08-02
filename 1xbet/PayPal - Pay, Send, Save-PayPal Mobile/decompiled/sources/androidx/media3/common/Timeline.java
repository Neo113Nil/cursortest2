package androidx.media3.common;

/* loaded from: classes7.dex */
public abstract class Timeline {
    public static final androidx.media3.common.Timeline EMPTY = new androidx.media3.common.Timeline() { // from class: androidx.media3.common.Timeline.1
        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            throw new java.lang.IndexOutOfBoundsException();
        }

        @Override // androidx.media3.common.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    };
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    public abstract int getIndexOfPeriod(java.lang.Object obj);

    public abstract androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z);

    public abstract int getPeriodCount();

    public abstract java.lang.Object getUidOfPeriod(int i);

    public abstract androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j);

    public abstract int getWindowCount();

    public static final class Window {
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        public androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
        public java.lang.Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @java.lang.Deprecated
        public java.lang.Object tag;
        public long windowStartTimeMs;
        public static final java.lang.Object SINGLE_WINDOW_UID = new java.lang.Object();
        private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        private static final androidx.media3.common.MediaItem getOutputStallDuration = new androidx.media3.common.MediaItem.Builder().setMediaId("androidx.media3.common.Timeline").setUri(android.net.Uri.EMPTY).build();
        private static final java.lang.String getOutputStallDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(11);
        private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(12);
        private static final java.lang.String getOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(13);
        public java.lang.Object uid = SINGLE_WINDOW_UID;
        public androidx.media3.common.MediaItem mediaItem = getOutputStallDuration;

        public final androidx.media3.common.Timeline.Window set(java.lang.Object obj, androidx.media3.common.MediaItem mediaItem, java.lang.Object obj2, long j, long j2, long j3, boolean z, boolean z2, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : getOutputStallDuration;
            this.tag = (mediaItem == null || mediaItem.localConfiguration == null) ? null : mediaItem.localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j4;
            this.durationUs = j5;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j6;
            this.isPlaceholder = false;
            return this;
        }

        public final long getDefaultPositionMs() {
            return androidx.media3.common.util.Util.usToMs(this.defaultPositionUs);
        }

        public final long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public final long getDurationMs() {
            return androidx.media3.common.util.Util.usToMs(this.durationUs);
        }

        public final long getDurationUs() {
            return this.durationUs;
        }

        public final long getPositionInFirstPeriodMs() {
            return androidx.media3.common.util.Util.usToMs(this.positionInFirstPeriodUs);
        }

        public final long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public final long getCurrentUnixTimeMs() {
            return androidx.media3.common.util.Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public final boolean isLive() {
            return this.liveConfiguration != null;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            androidx.media3.common.Timeline.Window window = (androidx.media3.common.Timeline.Window) obj;
            return java.util.Objects.equals(this.uid, window.uid) && java.util.Objects.equals(this.mediaItem, window.mediaItem) && java.util.Objects.equals(this.manifest, window.manifest) && java.util.Objects.equals(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public final int hashCode() {
            int hashCode = this.uid.hashCode();
            int hashCode2 = this.mediaItem.hashCode();
            java.lang.Object obj = this.manifest;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode4 = liveConfiguration != null ? liveConfiguration.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            int i = (int) (j ^ (j >>> 32));
            long j2 = this.windowStartTimeMs;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            boolean z = this.isSeekable;
            boolean z2 = this.isDynamic;
            boolean z3 = this.isPlaceholder;
            long j4 = this.defaultPositionUs;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            long j5 = this.durationUs;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            int i6 = this.firstPeriodIndex;
            int i7 = this.lastPeriodIndex;
            long j6 = this.positionInFirstPeriodUs;
            return ((((((((((((((((((((((((((((hashCode + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + i2) * 31) + i3) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + ((int) ((j6 >>> 32) ^ j6));
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            if (!androidx.media3.common.MediaItem.EMPTY.equals(this.mediaItem)) {
                bundle.putBundle(getOutputStallDurationlomOqCM, this.mediaItem.toBundle());
            }
            long j = this.presentationStartTimeMs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(getOutputMinFrameDurationlomOqCM, j);
            }
            long j2 = this.windowStartTimeMs;
            if (j2 != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(getOutputSizes, j2);
            }
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(Camera2StreamConfigurationMap, j3);
            }
            boolean z = this.isSeekable;
            if (z) {
                bundle.putBoolean(getInputSizeshNQ4ISI, z);
            }
            boolean z2 = this.isDynamic;
            if (z2) {
                bundle.putBoolean(getHighSpeedVideoSizesFor, z2);
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(getOutputFormats, liveConfiguration.toBundle());
            }
            boolean z3 = this.isPlaceholder;
            if (z3) {
                bundle.putBoolean(getOutputMinFrameDuration, z3);
            }
            long j4 = this.defaultPositionUs;
            if (j4 != 0) {
                bundle.putLong(getHighSpeedVideoSizes, j4);
            }
            long j5 = this.durationUs;
            if (j5 != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(getHighSpeedVideoFpsRanges, j5);
            }
            int i = this.firstPeriodIndex;
            if (i != 0) {
                bundle.putInt(getHighSpeedVideoFpsRangesFor, i);
            }
            int i2 = this.lastPeriodIndex;
            if (i2 != 0) {
                bundle.putInt(getInputFormats, i2);
            }
            long j6 = this.positionInFirstPeriodUs;
            if (j6 != 0) {
                bundle.putLong(getOutputSizeshNQ4ISI, j6);
            }
            return bundle;
        }

        public static androidx.media3.common.Timeline.Window fromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(getOutputStallDurationlomOqCM);
            androidx.media3.common.MediaItem fromBundle = bundle2 != null ? androidx.media3.common.MediaItem.fromBundle(bundle2) : androidx.media3.common.MediaItem.EMPTY;
            long j = bundle.getLong(getOutputMinFrameDurationlomOqCM, androidx.media3.common.C.TIME_UNSET);
            long j2 = bundle.getLong(getOutputSizes, androidx.media3.common.C.TIME_UNSET);
            long j3 = bundle.getLong(Camera2StreamConfigurationMap, androidx.media3.common.C.TIME_UNSET);
            boolean z = bundle.getBoolean(getInputSizeshNQ4ISI, false);
            boolean z2 = bundle.getBoolean(getHighSpeedVideoSizesFor, false);
            android.os.Bundle bundle3 = bundle.getBundle(getOutputFormats);
            androidx.media3.common.MediaItem.LiveConfiguration fromBundle2 = bundle3 != null ? androidx.media3.common.MediaItem.LiveConfiguration.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(getOutputMinFrameDuration, false);
            long j4 = bundle.getLong(getHighSpeedVideoSizes, 0L);
            long j5 = bundle.getLong(getHighSpeedVideoFpsRanges, androidx.media3.common.C.TIME_UNSET);
            int i = bundle.getInt(getHighSpeedVideoFpsRangesFor, 0);
            int i2 = bundle.getInt(getInputFormats, 0);
            long j6 = bundle.getLong(getOutputSizeshNQ4ISI, 0L);
            androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
            window.set(getHighResolutionOutputSizeshNQ4ISI, fromBundle, null, j, j2, j3, z, z2, fromBundle2, j4, j5, i, i2, j6);
            window.isPlaceholder = z3;
            return window;
        }
    }

    public static final class Period {
        public androidx.media3.common.AdPlaybackState adPlaybackState = androidx.media3.common.AdPlaybackState.NONE;
        public long durationUs;
        public java.lang.Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        public java.lang.Object uid;
        public int windowIndex;
        private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public final androidx.media3.common.Timeline.Period set(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, androidx.media3.common.AdPlaybackState.NONE, false);
        }

        public final androidx.media3.common.Timeline.Period set(java.lang.Object obj, java.lang.Object obj2, int i, long j, long j2, androidx.media3.common.AdPlaybackState adPlaybackState, boolean z) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z;
            return this;
        }

        public final long getDurationMs() {
            return androidx.media3.common.util.Util.usToMs(this.durationUs);
        }

        public final long getDurationUs() {
            return this.durationUs;
        }

        public final long getPositionInWindowMs() {
            return androidx.media3.common.util.Util.usToMs(this.positionInWindowUs);
        }

        public final long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public final java.lang.Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public final int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public final int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public final long getAdGroupTimeUs(int i) {
            return this.adPlaybackState.getAdGroup(i).timeUs;
        }

        public final int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public final int getNextAdIndexToPlay(int i, int i2) {
            return this.adPlaybackState.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public final boolean hasPlayedAdGroup(int i) {
            return !this.adPlaybackState.getAdGroup(i).hasUnplayedAds();
        }

        public final int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public final int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public final int getAdCountInAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).count;
        }

        public final long getAdDurationUs(int i, int i2) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            return adGroup.count != -1 ? adGroup.durationsUs[i2] : androidx.media3.common.C.TIME_UNSET;
        }

        public final int getAdState(int i, int i2) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.states[i2];
            }
            return 0;
        }

        public final boolean isLivePostrollPlaceholder(int i) {
            return i == getAdGroupCount() - 1 && this.adPlaybackState.isLivePostrollPlaceholder(i);
        }

        public final long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public final boolean isServerSideInsertedAdGroup(int i) {
            return this.adPlaybackState.getAdGroup(i).isServerSideInserted;
        }

        public final long getContentResumeOffsetUs(int i) {
            return this.adPlaybackState.getAdGroup(i).contentResumeOffsetUs;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            androidx.media3.common.Timeline.Period period = (androidx.media3.common.Timeline.Period) obj;
            return java.util.Objects.equals(this.id, period.id) && java.util.Objects.equals(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && java.util.Objects.equals(this.adPlaybackState, period.adPlaybackState);
        }

        public final int hashCode() {
            java.lang.Object obj = this.id;
            int hashCode = obj == null ? 0 : obj.hashCode();
            java.lang.Object obj2 = this.uid;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            int i = this.windowIndex;
            long j = this.durationUs;
            long j2 = this.positionInWindowUs;
            return ((((((((((((hashCode + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31) + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.adPlaybackState.hashCode();
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            int i = this.windowIndex;
            if (i != 0) {
                bundle.putInt(Camera2StreamConfigurationMap, i);
            }
            long j = this.durationUs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(getHighSpeedVideoFpsRanges, j);
            }
            long j2 = this.positionInWindowUs;
            if (j2 != 0) {
                bundle.putLong(getHighResolutionOutputSizeshNQ4ISI, j2);
            }
            boolean z = this.isPlaceholder;
            if (z) {
                bundle.putBoolean(getHighSpeedVideoSizes, z);
            }
            if (!this.adPlaybackState.equals(androidx.media3.common.AdPlaybackState.NONE)) {
                bundle.putBundle(getHighSpeedVideoFpsRangesFor, this.adPlaybackState.toBundle());
            }
            return bundle;
        }

        public static androidx.media3.common.Timeline.Period fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.AdPlaybackState adPlaybackState;
            int i = bundle.getInt(Camera2StreamConfigurationMap, 0);
            long j = bundle.getLong(getHighSpeedVideoFpsRanges, androidx.media3.common.C.TIME_UNSET);
            long j2 = bundle.getLong(getHighResolutionOutputSizeshNQ4ISI, 0L);
            boolean z = bundle.getBoolean(getHighSpeedVideoSizes, false);
            android.os.Bundle bundle2 = bundle.getBundle(getHighSpeedVideoFpsRangesFor);
            if (bundle2 != null) {
                adPlaybackState = androidx.media3.common.AdPlaybackState.fromBundle(bundle2);
            } else {
                adPlaybackState = androidx.media3.common.AdPlaybackState.NONE;
            }
            androidx.media3.common.AdPlaybackState adPlaybackState2 = adPlaybackState;
            androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
            period.set(null, null, i, j, j2, adPlaybackState2, z);
            return period;
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

    public final androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window) {
        return getWindow(i, window, 0L);
    }

    public final int getNextPeriodIndex(int i, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window, int i2, boolean z) {
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

    public final boolean isLastPeriod(int i, androidx.media3.common.Timeline.Period period, androidx.media3.common.Timeline.Window window, int i2, boolean z) {
        return getNextPeriodIndex(i, period, window, i2, z) == -1;
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, long j) {
        return getPeriodPositionUs(window, period, i, j);
    }

    @java.lang.Deprecated
    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPosition(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, long j, long j2) {
        return getPeriodPositionUs(window, period, i, j, j2);
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, long j) {
        return (android.util.Pair) com.google.common.base.Preconditions.checkNotNull(getPeriodPositionUs(window, period, i, j, 0L));
    }

    public final android.util.Pair<java.lang.Object, java.lang.Long> getPeriodPositionUs(androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period, int i, long j, long j2) {
        com.google.common.base.Preconditions.checkElementIndex(i, getWindowCount());
        getWindow(i, window, j2);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == androidx.media3.common.C.TIME_UNSET) {
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
        if (period.durationUs != androidx.media3.common.C.TIME_UNSET) {
            j3 = java.lang.Math.min(j3, period.durationUs - 1);
        }
        return android.util.Pair.create(com.google.common.base.Preconditions.checkNotNull(period.uid), java.lang.Long.valueOf(java.lang.Math.max(0L, j3)));
    }

    public androidx.media3.common.Timeline.Period getPeriodByUid(java.lang.Object obj, androidx.media3.common.Timeline.Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public final androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period) {
        return getPeriod(i, period, false);
    }

    public boolean equals(java.lang.Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.Timeline)) {
            return false;
        }
        androidx.media3.common.Timeline timeline = (androidx.media3.common.Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        androidx.media3.common.Timeline.Window window2 = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period2 = new androidx.media3.common.Timeline.Period();
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
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
        int windowCount = getWindowCount() + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE;
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

    public final android.os.Bundle toBundle() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int windowCount = getWindowCount();
        androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, window, 0L).toBundle());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int periodCount = getPeriodCount();
        androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
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
        bundle.putBinder(getHighResolutionOutputSizeshNQ4ISI, new androidx.media3.common.BundleListRetriever(arrayList));
        bundle.putBinder(Camera2StreamConfigurationMap, new androidx.media3.common.BundleListRetriever(arrayList2));
        bundle.putIntArray(getHighSpeedVideoFpsRangesFor, iArr);
        return bundle;
    }

    public final androidx.media3.common.Timeline copyWithSingleWindow(int i) {
        if (getWindowCount() == 1) {
            return this;
        }
        androidx.media3.common.Timeline.Window window = getWindow(i, new androidx.media3.common.Timeline.Window(), 0L);
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i2 = window.firstPeriodIndex; i2 <= window.lastPeriodIndex; i2++) {
            androidx.media3.common.Timeline.Period period = getPeriod(i2, new androidx.media3.common.Timeline.Period(), true);
            period.windowIndex = 0;
            builder.add((com.google.common.collect.ImmutableList.Builder) period);
        }
        window.lastPeriodIndex -= window.firstPeriodIndex;
        window.firstPeriodIndex = 0;
        return new androidx.media3.common.Timeline.RemotableTimeline(com.google.common.collect.ImmutableList.of(window), builder.build(), new int[]{0});
    }

    public static androidx.media3.common.Timeline fromBundle(android.os.Bundle bundle) {
        com.google.common.collect.ImmutableList fromBundleList;
        com.google.common.collect.ImmutableList fromBundleList2;
        com.google.common.base.Function function = new com.google.common.base.Function() { // from class: androidx.media3.common.Timeline$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.media3.common.Timeline.Window.fromBundle((android.os.Bundle) obj);
            }
        };
        android.os.IBinder binder = bundle.getBinder(getHighResolutionOutputSizeshNQ4ISI);
        if (binder == null) {
            fromBundleList = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(function, androidx.media3.common.BundleListRetriever.getList(binder));
        }
        com.google.common.base.Function function2 = new com.google.common.base.Function() { // from class: androidx.media3.common.Timeline$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return androidx.media3.common.Timeline.Period.fromBundle((android.os.Bundle) obj);
            }
        };
        android.os.IBinder binder2 = bundle.getBinder(Camera2StreamConfigurationMap);
        if (binder2 == null) {
            fromBundleList2 = com.google.common.collect.ImmutableList.of();
        } else {
            fromBundleList2 = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(function2, androidx.media3.common.BundleListRetriever.getList(binder2));
        }
        int[] intArray = bundle.getIntArray(getHighSpeedVideoFpsRangesFor);
        if (intArray == null) {
            int size = fromBundleList.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = i;
            }
            intArray = iArr;
        }
        return new androidx.media3.common.Timeline.RemotableTimeline(fromBundleList, fromBundleList2, intArray);
    }

    public static final class RemotableTimeline extends androidx.media3.common.Timeline {
        private final com.google.common.collect.ImmutableList<androidx.media3.common.Timeline.Window> Camera2StreamConfigurationMap;
        private final int[] getHighResolutionOutputSizeshNQ4ISI;
        private final int[] getHighSpeedVideoFpsRanges;
        private final com.google.common.collect.ImmutableList<androidx.media3.common.Timeline.Period> getHighSpeedVideoSizes;

        public RemotableTimeline(com.google.common.collect.ImmutableList<androidx.media3.common.Timeline.Window> immutableList, com.google.common.collect.ImmutableList<androidx.media3.common.Timeline.Period> immutableList2, int[] iArr) {
            com.google.common.base.Preconditions.checkArgument(immutableList.size() == iArr.length);
            this.Camera2StreamConfigurationMap = immutableList;
            this.getHighSpeedVideoSizes = immutableList2;
            this.getHighResolutionOutputSizeshNQ4ISI = iArr;
            this.getHighSpeedVideoFpsRanges = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.getHighSpeedVideoFpsRanges[iArr[i]] = i;
            }
        }

        @Override // androidx.media3.common.Timeline
        public final int getWindowCount() {
            return this.Camera2StreamConfigurationMap.size();
        }

        @Override // androidx.media3.common.Timeline
        public final androidx.media3.common.Timeline.Window getWindow(int i, androidx.media3.common.Timeline.Window window, long j) {
            androidx.media3.common.Timeline.Window window2 = this.Camera2StreamConfigurationMap.get(i);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public final int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getLastWindowIndex(z)) {
                return z ? this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoFpsRanges[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return getFirstWindowIndex(z);
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != getFirstWindowIndex(z)) {
                return z ? this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoFpsRanges[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return getLastWindowIndex(z);
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public final int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.getHighResolutionOutputSizeshNQ4ISI[getWindowCount() - 1];
            }
            return getWindowCount() - 1;
        }

        @Override // androidx.media3.common.Timeline
        public final int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.getHighResolutionOutputSizeshNQ4ISI[0];
            }
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final int getPeriodCount() {
            return this.getHighSpeedVideoSizes.size();
        }

        @Override // androidx.media3.common.Timeline
        public final androidx.media3.common.Timeline.Period getPeriod(int i, androidx.media3.common.Timeline.Period period, boolean z) {
            androidx.media3.common.Timeline.Period period2 = this.getHighSpeedVideoSizes.get(i);
            period.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public final int getIndexOfPeriod(java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.media3.common.Timeline
        public final java.lang.Object getUidOfPeriod(int i) {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
