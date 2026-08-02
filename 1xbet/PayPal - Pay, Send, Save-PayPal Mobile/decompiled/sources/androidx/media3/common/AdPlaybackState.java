package androidx.media3.common;

/* loaded from: classes7.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    public final long adResumePositionUs;
    public final java.lang.Object adsId;
    public final long contentDurationUs;
    private final androidx.media3.common.AdPlaybackState.AdGroup[] getOutputFormats;
    public final int removedAdGroupCount;
    public static final androidx.media3.common.AdPlaybackState NONE = new androidx.media3.common.AdPlaybackState(null, new androidx.media3.common.AdPlaybackState.AdGroup[0], 0, androidx.media3.common.C.TIME_UNSET, 0);
    private static final androidx.media3.common.AdPlaybackState.AdGroup Camera2StreamConfigurationMap = new androidx.media3.common.AdPlaybackState.AdGroup(0).withAdCount(0);
    private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(4);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AdState {
    }

    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final java.lang.String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final androidx.media3.common.MediaItem[] mediaItems;
        public final int originalCount;
        public final androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @java.lang.Deprecated
        public final android.net.Uri[] uris;
        private static final java.lang.String getOutputMinFrameDurationlomOqCM = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getOutputSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String getHighSpeedVideoSizesFor = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String getOutputMinFrameDuration = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String getInputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String getOutputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        private static final java.lang.String getInputFormats = androidx.media3.common.util.Util.intToStringMaxRadix(11);

        /* synthetic */ AdGroup(long j, int i, int i2, int[] iArr, androidx.media3.common.MediaItem[] mediaItemArr, long[] jArr, long j2, boolean z, java.lang.String[] strArr, androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr, boolean z2, byte b) {
            this(j, i, i2, iArr, mediaItemArr, jArr, j2, z, strArr, skipInfoArr, z2);
        }

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new androidx.media3.common.MediaItem[0], new long[0], 0L, false, new java.lang.String[0], new androidx.media3.common.AdPlaybackState.SkipInfo[0], false);
        }

        private AdGroup(long j, int i, int i2, int[] iArr, androidx.media3.common.MediaItem[] mediaItemArr, long[] jArr, long j2, boolean z, java.lang.String[] strArr, androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr, boolean z2) {
            int i3 = 0;
            com.google.common.base.Preconditions.checkArgument(iArr.length == mediaItemArr.length);
            com.google.common.base.Preconditions.checkArgument(iArr.length == skipInfoArr.length);
            this.timeUs = j;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j2;
            this.isServerSideInserted = z;
            this.uris = new android.net.Uri[mediaItemArr.length];
            while (true) {
                android.net.Uri[] uriArr = this.uris;
                if (i3 < uriArr.length) {
                    androidx.media3.common.MediaItem mediaItem = mediaItemArr[i3];
                    uriArr[i3] = mediaItem == null ? null : ((androidx.media3.common.MediaItem.LocalConfiguration) com.google.common.base.Preconditions.checkNotNull(mediaItem.localConfiguration)).uri;
                    i3++;
                } else {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    this.isPlaceholder = z2;
                    return;
                }
            }
        }

        public final int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public final int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || this.isServerSideInserted || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public final boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i = 0; i < this.count; i++) {
                int i2 = this.states[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isLivePostrollPlaceholder(boolean z) {
            return this.isServerSideInserted == z && isLivePostrollPlaceholder();
        }

        public final boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = (androidx.media3.common.AdPlaybackState.AdGroup) obj;
            return this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && java.util.Arrays.equals(this.mediaItems, adGroup.mediaItems) && java.util.Arrays.equals(this.states, adGroup.states) && java.util.Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && java.util.Arrays.equals(this.ids, adGroup.ids) && java.util.Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder;
        }

        public final int hashCode() {
            int i = this.count;
            int i2 = this.originalCount;
            long j = this.timeUs;
            int i3 = (int) (j ^ (j >>> 32));
            int hashCode = java.util.Arrays.hashCode(this.mediaItems);
            int hashCode2 = java.util.Arrays.hashCode(this.states);
            int hashCode3 = java.util.Arrays.hashCode(this.durationsUs);
            long j2 = this.contentResumeOffsetUs;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            boolean z = this.isServerSideInserted;
            int hashCode4 = java.util.Arrays.hashCode(this.ids);
            return (((((((((((((((((((i * 31) + i2) * 31) + i3) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i4) * 31) + (z ? 1 : 0)) * 31) + hashCode4) * 31) + java.util.Arrays.hashCode(this.skipInfos)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withTimeUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdCount(int i) {
            int[] iArr = this.states;
            int length = iArr.length;
            int max = java.lang.Math.max(i, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.durationsUs;
            int length2 = jArr.length;
            int max2 = java.lang.Math.max(i, length2);
            long[] copyOf2 = java.util.Arrays.copyOf(jArr, max2);
            java.util.Arrays.fill(copyOf2, length2, max2, androidx.media3.common.C.TIME_UNSET);
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, i);
            java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(this.ids, i);
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, i, this.originalCount, copyOf, mediaItemArr, copyOf2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, java.lang.Math.max(i, skipInfoArr.length)), this.isPlaceholder);
        }

        @java.lang.Deprecated
        public final androidx.media3.common.AdPlaybackState.AdGroup withAdUri(android.net.Uri uri, int i) {
            return withAdMediaItem(androidx.media3.common.MediaItem.fromUri(uri), i);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdMediaItem(androidx.media3.common.MediaItem mediaItem, int i) {
            int[] iArr = this.states;
            int length = iArr.length;
            int max = java.lang.Math.max(i + 1, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyOf.length) {
                int length2 = copyOf.length;
                int length3 = jArr.length;
                int max2 = java.lang.Math.max(length2, length3);
                jArr = java.util.Arrays.copyOf(jArr, max2);
                java.util.Arrays.fill(jArr, length3, max2, androidx.media3.common.C.TIME_UNSET);
            }
            long[] jArr2 = jArr;
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, copyOf.length);
            mediaItemArr[i] = mediaItem;
            copyOf[i] = 1;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != copyOf.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, copyOf.length);
            }
            java.lang.String[] strArr2 = strArr;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            if (skipInfoArr.length != copyOf.length) {
                skipInfoArr = (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, java.lang.Math.max(copyOf.length, skipInfoArr.length));
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyOf, mediaItemArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdState(int i, int i2) {
            int i3 = this.count;
            com.google.common.base.Preconditions.checkArgument(i3 == -1 || i2 < i3);
            int[] iArr = this.states;
            int length = iArr.length;
            int max = java.lang.Math.max(i2 + 1, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            int i4 = copyOf[i2];
            com.google.common.base.Preconditions.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyOf.length) {
                int length2 = copyOf.length;
                int length3 = jArr.length;
                int max2 = java.lang.Math.max(length2, length3);
                jArr = java.util.Arrays.copyOf(jArr, max2);
                java.util.Arrays.fill(jArr, length3, max2, androidx.media3.common.C.TIME_UNSET);
            }
            long[] jArr2 = jArr;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyOf.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, copyOf.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != copyOf.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, copyOf.length);
            }
            java.lang.String[] strArr2 = strArr;
            copyOf[i2] = i;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            if (skipInfoArr.length != copyOf.length) {
                skipInfoArr = (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, java.lang.Math.max(copyOf.length, skipInfoArr.length));
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyOf, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                int length2 = mediaItemArr.length;
                int length3 = jArr.length;
                int max = java.lang.Math.max(length2, length3);
                jArr = java.util.Arrays.copyOf(jArr, max);
                java.util.Arrays.fill(jArr, length3, max, androidx.media3.common.C.TIME_UNSET);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = java.util.Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdId(java.lang.String str, int i) {
            int[] iArr = this.states;
            int length = iArr.length;
            int max = java.lang.Math.max(i + 1, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyOf.length) {
                int length2 = copyOf.length;
                int length3 = jArr.length;
                int max2 = java.lang.Math.max(length2, length3);
                jArr = java.util.Arrays.copyOf(jArr, max2);
                java.util.Arrays.fill(jArr, length3, max2, androidx.media3.common.C.TIME_UNSET);
            }
            long[] jArr2 = jArr;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyOf.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, copyOf.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = (java.lang.String[]) java.util.Arrays.copyOf(this.ids, copyOf.length);
            strArr[i] = str;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyOf, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAdSkipInfo(androidx.media3.common.AdPlaybackState.SkipInfo skipInfo, int i) {
            int[] iArr = this.states;
            int length = iArr.length;
            int max = java.lang.Math.max(i + 1, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyOf.length) {
                int length2 = copyOf.length;
                int length3 = jArr.length;
                int max2 = java.lang.Math.max(length2, length3);
                jArr = java.util.Arrays.copyOf(jArr, max2);
                java.util.Arrays.fill(jArr, length3, max2, androidx.media3.common.C.TIME_UNSET);
            }
            long[] jArr2 = jArr;
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyOf.length) {
                mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, copyOf.length);
            }
            androidx.media3.common.MediaItem[] mediaItemArr2 = mediaItemArr;
            java.lang.String[] strArr = this.ids;
            if (strArr.length != copyOf.length) {
                strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, copyOf.length);
            }
            java.lang.String[] strArr2 = strArr;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr2 = (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, java.lang.Math.max(copyOf.length, skipInfoArr.length));
            skipInfoArr2[i] = skipInfo;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyOf, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, skipInfoArr2, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withContentResumeOffsetUs(long j) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withIsServerSideInserted(boolean z) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withOriginalAdCount(int i) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, this.count, i, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = java.util.Arrays.copyOf(iArr, length);
            androidx.media3.common.MediaItem[] mediaItemArr = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(this.mediaItems, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = java.util.Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, mediaItemArr, jArr2, androidx.media3.common.util.Util.sum(jArr2), this.isServerSideInserted, (java.lang.String[]) java.util.Arrays.copyOf(this.ids, length), (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(this.skipInfos, length), this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, 0, this.originalCount, new int[0], new androidx.media3.common.MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 1 || i2 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    copyOf[i] = this.mediaItems[i] == null ? 0 : 1;
                }
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.skipInfos, this.isPlaceholder);
        }

        public final int getIndexOfAdId(java.lang.String str) {
            int i = 0;
            while (true) {
                java.lang.String[] strArr = this.ids;
                if (i >= strArr.length) {
                    return -1;
                }
                if (java.util.Objects.equals(strArr[i], str)) {
                    return i;
                }
                i++;
            }
        }

        public final androidx.media3.common.AdPlaybackState.AdGroup copy() {
            long j = this.timeUs;
            int i = this.count;
            int i2 = this.originalCount;
            int[] iArr = this.states;
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            androidx.media3.common.MediaItem[] mediaItemArr2 = (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = this.durationsUs;
            long[] copyOf2 = java.util.Arrays.copyOf(jArr, jArr.length);
            long j2 = this.contentResumeOffsetUs;
            boolean z = this.isServerSideInserted;
            java.lang.String[] strArr = this.ids;
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, i, i2, copyOf, mediaItemArr2, copyOf2, j2, z, strArr2, (androidx.media3.common.AdPlaybackState.SkipInfo[]) java.util.Arrays.copyOf(skipInfoArr, skipInfoArr.length), this.isPlaceholder);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(getOutputMinFrameDurationlomOqCM, this.timeUs);
            bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, this.count);
            bundle.putInt(getOutputFormats, this.originalCount);
            bundle.putParcelableArrayList(getOutputSizes, new java.util.ArrayList<>(java.util.Arrays.asList(this.uris)));
            java.lang.String str = Camera2StreamConfigurationMap;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
            androidx.media3.common.MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            int i = 0;
            while (true) {
                android.os.Bundle bundle2 = null;
                if (i >= length) {
                    break;
                }
                androidx.media3.common.MediaItem mediaItem = mediaItemArr[i];
                if (mediaItem != null) {
                    bundle2 = mediaItem.toBundleIncludeLocalConfiguration();
                }
                arrayList.add(bundle2);
                i++;
            }
            bundle.putParcelableArrayList(str, arrayList);
            bundle.putIntArray(getHighSpeedVideoSizesFor, this.states);
            bundle.putLongArray(getOutputMinFrameDuration, this.durationsUs);
            bundle.putLong(getHighSpeedVideoFpsRanges, this.contentResumeOffsetUs);
            bundle.putBoolean(getInputSizeshNQ4ISI, this.isServerSideInserted);
            bundle.putStringArrayList(getHighSpeedVideoSizes, new java.util.ArrayList<>(java.util.Arrays.asList(this.ids)));
            java.lang.String str2 = getInputFormats;
            java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr = this.skipInfos;
            int length2 = skipInfoArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                androidx.media3.common.AdPlaybackState.SkipInfo skipInfo = skipInfoArr[i2];
                arrayList2.add(skipInfo == null ? null : skipInfo.toBundle());
            }
            bundle.putParcelableArrayList(str2, arrayList2);
            bundle.putBoolean(getHighSpeedVideoFpsRangesFor, this.isPlaceholder);
            return bundle;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static androidx.media3.common.AdPlaybackState.AdGroup fromBundle(android.os.Bundle bundle) {
            int i;
            androidx.media3.common.MediaItem[] mediaItemArr;
            androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr;
            long j = bundle.getLong(getOutputMinFrameDurationlomOqCM);
            int i2 = bundle.getInt(getHighResolutionOutputSizeshNQ4ISI);
            int i3 = bundle.getInt(getOutputFormats);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getOutputSizes);
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Camera2StreamConfigurationMap);
            int[] intArray = bundle.getIntArray(getHighSpeedVideoSizesFor);
            long[] longArray = bundle.getLongArray(getOutputMinFrameDuration);
            long j2 = bundle.getLong(getHighSpeedVideoFpsRanges);
            boolean z = bundle.getBoolean(getInputSizeshNQ4ISI);
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(getHighSpeedVideoSizes);
            java.util.ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(getInputFormats);
            boolean z2 = bundle.getBoolean(getHighSpeedVideoFpsRangesFor);
            if (intArray == null) {
                intArray = new int[0];
            }
            if (parcelableArrayList2 != null) {
                mediaItemArr = new androidx.media3.common.MediaItem[parcelableArrayList2.size()];
                for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                    android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList2.get(i4);
                    mediaItemArr[i4] = bundle2 == null ? null : androidx.media3.common.MediaItem.fromBundle(bundle2);
                }
            } else if (parcelableArrayList != null) {
                androidx.media3.common.MediaItem[] mediaItemArr2 = new androidx.media3.common.MediaItem[parcelableArrayList.size()];
                for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                    android.net.Uri uri = (android.net.Uri) parcelableArrayList.get(i5);
                    mediaItemArr2[i5] = uri == null ? null : androidx.media3.common.MediaItem.fromUri(uri);
                }
                mediaItemArr = mediaItemArr2;
            } else {
                i = 0;
                mediaItemArr = new androidx.media3.common.MediaItem[0];
                long[] jArr = longArray != null ? new long[i] : longArray;
                java.lang.String[] strArr = new java.lang.String[i];
                if (stringArrayList != null) {
                    strArr = (java.lang.String[]) stringArrayList.toArray(strArr);
                }
                java.lang.String[] strArr2 = strArr;
                if (parcelableArrayList3 != null) {
                    skipInfoArr = new androidx.media3.common.AdPlaybackState.SkipInfo[i];
                } else {
                    androidx.media3.common.AdPlaybackState.SkipInfo[] skipInfoArr2 = new androidx.media3.common.AdPlaybackState.SkipInfo[parcelableArrayList3.size()];
                    while (i < parcelableArrayList3.size()) {
                        android.os.Bundle bundle3 = (android.os.Bundle) parcelableArrayList3.get(i);
                        skipInfoArr2[i] = bundle3 == null ? null : androidx.media3.common.AdPlaybackState.SkipInfo.fromBundle(bundle3);
                        i++;
                    }
                    skipInfoArr = skipInfoArr2;
                }
                return new androidx.media3.common.AdPlaybackState.AdGroup(j, i2, i3, intArray, mediaItemArr, jArr, j2, z, strArr2, skipInfoArr, z2);
            }
            i = 0;
            if (longArray != null) {
            }
            java.lang.String[] strArr3 = new java.lang.String[i];
            if (stringArrayList != null) {
            }
            java.lang.String[] strArr22 = strArr3;
            if (parcelableArrayList3 != null) {
            }
            return new androidx.media3.common.AdPlaybackState.AdGroup(j, i2, i3, intArray, mediaItemArr, jArr, j2, z, strArr22, skipInfoArr, z2);
        }

        static /* synthetic */ androidx.media3.common.AdPlaybackState.AdGroup getHighSpeedVideoFpsRanges(androidx.media3.common.AdPlaybackState.AdGroup adGroup, boolean z, boolean z2) {
            return new androidx.media3.common.AdPlaybackState.AdGroup(adGroup.timeUs, adGroup.count, adGroup.originalCount, adGroup.states, adGroup.mediaItems, adGroup.durationsUs, adGroup.contentResumeOffsetUs, z2, adGroup.ids, adGroup.skipInfos, true);
        }
    }

    public static final class SkipInfo {
        private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String getHighSpeedVideoSizes = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        public final java.lang.String labelId;
        public final long skipDurationUs;
        public final long skipOffsetUs;

        public SkipInfo(long j, long j2, java.lang.String str) {
            com.google.common.base.Preconditions.checkArgument((j == androidx.media3.common.C.TIME_UNSET && j2 == androidx.media3.common.C.TIME_UNSET && str == null) ? false : true);
            this.skipOffsetUs = j == androidx.media3.common.C.TIME_UNSET ? 0L : j;
            this.skipDurationUs = j2;
            this.labelId = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.common.AdPlaybackState.SkipInfo skipInfo = (androidx.media3.common.AdPlaybackState.SkipInfo) obj;
            return this.skipOffsetUs == skipInfo.skipOffsetUs && this.skipDurationUs == skipInfo.skipDurationUs && java.util.Objects.equals(this.labelId, skipInfo.labelId);
        }

        public final int hashCode() {
            long j = this.skipOffsetUs;
            long j2 = this.skipDurationUs;
            return java.util.Objects.hash(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), this.labelId);
        }

        public final android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(getHighSpeedVideoFpsRanges, this.skipOffsetUs);
            bundle.putLong(getHighSpeedVideoFpsRangesFor, this.skipDurationUs);
            bundle.putString(getHighSpeedVideoSizes, this.labelId);
            return bundle;
        }

        public static androidx.media3.common.AdPlaybackState.SkipInfo fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.common.AdPlaybackState.SkipInfo(bundle.getLong(getHighSpeedVideoFpsRanges), bundle.getLong(getHighSpeedVideoFpsRangesFor), bundle.getString(getHighSpeedVideoSizes));
        }
    }

    public AdPlaybackState(java.lang.Object obj, long... jArr) {
        this(obj, Camera2StreamConfigurationMap(jArr), 0L, androidx.media3.common.C.TIME_UNSET, 0);
    }

    private AdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr, long j, long j2, int i) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
        this.adGroupCount = adGroupArr.length + i;
        this.getOutputFormats = adGroupArr;
        this.removedAdGroupCount = i;
    }

    public final androidx.media3.common.AdPlaybackState.AdGroup getAdGroup(int i) {
        int i2 = this.removedAdGroupCount;
        if (i < i2) {
            return Camera2StreamConfigurationMap;
        }
        return this.getOutputFormats[i - i2];
    }

    public final int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.adGroupCount - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i2);
            long j3 = adGroup.timeUs;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != androidx.media3.common.C.TIME_UNSET && !adGroup.isLivePostrollPlaceholder() && j >= j2) {
                    break;
                }
                i2--;
            }
        }
        if (i2 < 0 || !getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public final int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != androidx.media3.common.C.TIME_UNSET && j >= j2) {
            return -1;
        }
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i >= this.adGroupCount) {
            return -1;
        }
        if (j2 == androidx.media3.common.C.TIME_UNSET || getAdGroup(i).timeUs <= j2) {
            return i;
        }
        return -1;
    }

    public final boolean isAdInErrorState(int i, int i2) {
        if (i >= this.adGroupCount) {
            return false;
        }
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i);
        return adGroup.count != -1 && i2 < adGroup.count && adGroup.states[i2] == 4;
    }

    public final androidx.media3.common.AdPlaybackState withAdGroupTimeUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.getOutputFormats[i2].withTimeUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withNewAdGroup(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup adGroup = new androidx.media3.common.AdPlaybackState.AdGroup(j);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayAppend(this.getOutputFormats, adGroup);
        java.lang.System.arraycopy(adGroupArr, i2, adGroupArr, i2 + 1, this.getOutputFormats.length - i2);
        adGroupArr[i2] = adGroup;
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdCount(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i2 > 0);
        int i3 = i - this.removedAdGroupCount;
        if (this.getOutputFormats[i3].count == i2) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = this.getOutputFormats[i3].withAdCount(i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState copy() {
        int length = this.getOutputFormats.length;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = this.getOutputFormats[i].copy();
        }
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public final androidx.media3.common.AdPlaybackState withAvailableAdUri(int i, int i2, android.net.Uri uri) {
        return withAvailableAdMediaItem(i, i2, androidx.media3.common.MediaItem.fromUri(uri));
    }

    public final androidx.media3.common.AdPlaybackState withAvailableAdMediaItem(int i, int i2, androidx.media3.common.MediaItem mediaItem) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        com.google.common.base.Preconditions.checkState(adGroupArr2[i3].isServerSideInserted || !(mediaItem.localConfiguration == null || mediaItem.localConfiguration.uri.equals(android.net.Uri.EMPTY)));
        adGroupArr2[i3] = adGroupArr2[i3].withAdMediaItem(mediaItem, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdsId(java.lang.Object obj) {
        return new androidx.media3.common.AdPlaybackState(obj, this.getOutputFormats, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAvailableAd(int i, int i2) {
        return withAvailableAdMediaItem(i, i2, androidx.media3.common.MediaItem.fromUri(android.net.Uri.EMPTY));
    }

    public final androidx.media3.common.AdPlaybackState withPlayedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(3, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withSkippedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(2, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withLastAdRemoved(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withLastAdRemoved();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdLoadError(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(4, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdId(int i, int i2, java.lang.String str) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdId(str, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdSkipInfo(int i, int i2, androidx.media3.common.AdPlaybackState.SkipInfo skipInfo) {
        int i3 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdSkipInfo(skipInfo, i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withSkippedAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i = 0;
        com.google.common.base.Preconditions.checkArgument(jArr.length == this.adGroupCount);
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i2 = this.adGroupCount;
            int i3 = this.removedAdGroupCount;
            if (i < i2 - i3) {
                adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i3 + i]);
                i++;
            } else {
                return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i3);
            }
        }
    }

    public final androidx.media3.common.AdPlaybackState withAdDurationsUs(int i, long... jArr) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.getOutputFormats, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new androidx.media3.common.AdPlaybackState(this.adsId, this.getOutputFormats, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withRemovedAdGroupCount(int i) {
        int i2 = this.removedAdGroupCount;
        if (i2 == i) {
            return this;
        }
        com.google.common.base.Preconditions.checkArgument(i > i2);
        int i3 = this.adGroupCount - i;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i3];
        java.lang.System.arraycopy(this.getOutputFormats, i - this.removedAdGroupCount, adGroupArr, 0, i3);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i);
    }

    public final androidx.media3.common.AdPlaybackState withRemovedAdGroupCountBefore(long j) {
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = getAdGroup(i);
            if (j <= adGroup.timeUs || adGroup.timeUs == Long.MIN_VALUE) {
                break;
            }
            i++;
        }
        return withRemovedAdGroupCount(i);
    }

    public final androidx.media3.common.AdPlaybackState withContentResumeOffsetUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        if (this.getOutputFormats[i2].contentResumeOffsetUs == j) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withContentResumeOffsetUs(j);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withOriginalAdCount(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        if (this.getOutputFormats[i3].originalCount == i2) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withOriginalAdCount(i2);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withIsServerSideInserted(int i, boolean z) {
        int i2 = i - this.removedAdGroupCount;
        if (this.getOutputFormats[i2].isServerSideInserted == z) {
            return this;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsServerSideInserted(z);
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public final androidx.media3.common.AdPlaybackState withResetAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = this.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsReset();
        return new androidx.media3.common.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @java.lang.Deprecated
    public final androidx.media3.common.AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    public final androidx.media3.common.AdPlaybackState withLivePostrollPlaceholderAppended(boolean z) {
        androidx.media3.common.AdPlaybackState withNewAdGroup = withNewAdGroup(this.adGroupCount, Long.MIN_VALUE);
        int i = this.adGroupCount - withNewAdGroup.removedAdGroupCount;
        if (withNewAdGroup.getOutputFormats[i].isPlaceholder && withNewAdGroup.getOutputFormats[i].isServerSideInserted == z) {
            return withNewAdGroup;
        }
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = withNewAdGroup.getOutputFormats;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = (androidx.media3.common.AdPlaybackState.AdGroup[]) androidx.media3.common.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i] = androidx.media3.common.AdPlaybackState.AdGroup.getHighSpeedVideoFpsRanges(adGroupArr2[i], true, z);
        return new androidx.media3.common.AdPlaybackState(withNewAdGroup.adsId, adGroupArr2, withNewAdGroup.adResumePositionUs, withNewAdGroup.contentDurationUs, withNewAdGroup.removedAdGroupCount);
    }

    public final boolean endsWithLivePostrollPlaceHolder() {
        int i = this.adGroupCount - 1;
        return i >= 0 && isLivePostrollPlaceholder(i);
    }

    public final boolean endsWithLivePostrollPlaceHolder(boolean z) {
        int i = this.adGroupCount - 1;
        return i >= 0 && isLivePostrollPlaceholder(i, z);
    }

    public final boolean isLivePostrollPlaceholder(int i) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    public final boolean isLivePostrollPlaceholder(int i, boolean z) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder(z);
    }

    public final int getAdIndexOfAdId(int i, java.lang.String str) {
        return getAdGroup(i).getIndexOfAdId(str);
    }

    public static androidx.media3.common.AdPlaybackState fromAdPlaybackState(java.lang.Object obj, androidx.media3.common.AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[i];
        int i2 = 0;
        while (i2 < i) {
            androidx.media3.common.AdPlaybackState.AdGroup adGroup = adPlaybackState.getOutputFormats[i2];
            adGroupArr[i2] = new androidx.media3.common.AdPlaybackState.AdGroup(adGroup.timeUs, adGroup.count, adGroup.originalCount, java.util.Arrays.copyOf(adGroup.states, adGroup.states.length), (androidx.media3.common.MediaItem[]) java.util.Arrays.copyOf(adGroup.mediaItems, adGroup.mediaItems.length), java.util.Arrays.copyOf(adGroup.durationsUs, adGroup.durationsUs.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.skipInfos, adGroup.isPlaceholder, (byte) 0);
            i2++;
            i = i;
        }
        return new androidx.media3.common.AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.AdPlaybackState adPlaybackState = (androidx.media3.common.AdPlaybackState) obj;
        return java.util.Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && java.util.Arrays.equals(this.getOutputFormats, adPlaybackState.getOutputFormats);
    }

    public final int hashCode() {
        int i = this.adGroupCount;
        java.lang.Object obj = this.adsId;
        int hashCode = obj == null ? 0 : obj.hashCode();
        return (((((((((i * 31) + hashCode) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + java.util.Arrays.hashCode(this.getOutputFormats);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.getOutputFormats.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.getOutputFormats[i].timeUs);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.getOutputFormats[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.getOutputFormats[i].states[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 == 4) {
                    sb.append('!');
                } else {
                    sb.append('?');
                }
                sb.append(", durationUs=");
                sb.append(this.getOutputFormats[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < this.getOutputFormats[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.getOutputFormats.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        for (androidx.media3.common.AdPlaybackState.AdGroup adGroup : this.getOutputFormats) {
            arrayList.add(adGroup.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(getHighSpeedVideoSizes, arrayList);
        }
        long j = this.adResumePositionUs;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        if (j != adPlaybackState.adResumePositionUs) {
            bundle.putLong(getHighSpeedVideoFpsRanges, j);
        }
        long j2 = this.contentDurationUs;
        if (j2 != adPlaybackState.contentDurationUs) {
            bundle.putLong(getHighResolutionOutputSizeshNQ4ISI, j2);
        }
        int i = this.removedAdGroupCount;
        if (i != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(getHighSpeedVideoFpsRangesFor, i);
        }
        return bundle;
    }

    public static androidx.media3.common.AdPlaybackState fromBundle(android.os.Bundle bundle) {
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(getHighSpeedVideoSizes);
        if (parcelableArrayList == null) {
            adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[0];
        } else {
            androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr2 = new androidx.media3.common.AdPlaybackState.AdGroup[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                adGroupArr2[i] = androidx.media3.common.AdPlaybackState.AdGroup.fromBundle((android.os.Bundle) parcelableArrayList.get(i));
            }
            adGroupArr = adGroupArr2;
        }
        java.lang.String str = getHighSpeedVideoFpsRanges;
        androidx.media3.common.AdPlaybackState adPlaybackState = NONE;
        return new androidx.media3.common.AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(getHighResolutionOutputSizeshNQ4ISI, adPlaybackState.contentDurationUs), bundle.getInt(getHighSpeedVideoFpsRangesFor, adPlaybackState.removedAdGroupCount));
    }

    private static androidx.media3.common.AdPlaybackState.AdGroup[] Camera2StreamConfigurationMap(long[] jArr) {
        int length = jArr.length;
        androidx.media3.common.AdPlaybackState.AdGroup[] adGroupArr = new androidx.media3.common.AdPlaybackState.AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = new androidx.media3.common.AdPlaybackState.AdGroup(jArr[i]);
        }
        return adGroupArr;
    }
}
