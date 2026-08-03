package com.google.android.exoplayer2.source.ads;

/* loaded from: classes3.dex */
public final class AdPlaybackState implements com.google.android.exoplayer2.Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    private static final int FIELD_AD_GROUPS = 1;
    private static final int FIELD_AD_RESUME_POSITION_US = 2;
    private static final int FIELD_CONTENT_DURATION_US = 3;
    private static final int FIELD_REMOVED_AD_GROUP_COUNT = 4;
    public final int adGroupCount;
    private final com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final java.lang.Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final com.google.android.exoplayer2.source.ads.AdPlaybackState NONE = new com.google.android.exoplayer2.source.ads.AdPlaybackState(null, new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[0], 0, -9223372036854775807L, 0);
    private static final com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup REMOVED_AD_GROUP = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(0).withAdCount(0);
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.AdPlaybackState$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState fromBundle;
            fromBundle = com.google.android.exoplayer2.source.ads.AdPlaybackState.fromBundle(bundle);
            return fromBundle;
        }
    };

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public static final class AdGroup implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
                com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup fromBundle;
                fromBundle = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.fromBundle(bundle);
                return fromBundle;
            }
        };
        private static final int FIELD_CONTENT_RESUME_OFFSET_US = 5;
        private static final int FIELD_COUNT = 1;
        private static final int FIELD_DURATIONS_US = 4;
        private static final int FIELD_IS_SERVER_SIDE_INSERTED = 6;
        private static final int FIELD_ORIGINAL_COUNT = 7;
        private static final int FIELD_STATES = 3;
        private static final int FIELD_TIME_US = 0;
        private static final int FIELD_URIS = 2;
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;
        public final android.net.Uri[] uris;

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new android.net.Uri[0], new long[0], 0L, false);
        }

        private AdGroup(long j, int i, int i2, int[] iArr, android.net.Uri[] uriArr, long[] jArr, long j2, boolean z) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(iArr.length == uriArr.length);
            this.timeUs = j;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j2;
            this.isServerSideInserted = z;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i) {
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

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public boolean hasUnplayedAds() {
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

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup) obj;
            return this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && java.util.Arrays.equals(this.uris, adGroup.uris) && java.util.Arrays.equals(this.states, adGroup.states) && java.util.Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted;
        }

        public int hashCode() {
            int i = ((this.count * 31) + this.originalCount) * 31;
            long j = this.timeUs;
            int hashCode = (((((((i + ((int) (j ^ (j >>> 32)))) * 31) + java.util.Arrays.hashCode(this.uris)) * 31) + java.util.Arrays.hashCode(this.states)) * 31) + java.util.Arrays.hashCode(this.durationsUs)) * 31;
            long j2 = this.contentResumeOffsetUs;
            return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withTimeUs(long j) {
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(j, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdCount(int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i);
            long[] copyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i);
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, i, this.originalCount, copyStatesWithSpaceForAdCount, (android.net.Uri[]) java.util.Arrays.copyOf(this.uris, i), copyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdUri(android.net.Uri uri, int i) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            android.net.Uri[] uriArr = (android.net.Uri[]) java.util.Arrays.copyOf(this.uris, copyStatesWithSpaceForAdCount.length);
            uriArr[i] = uri;
            copyStatesWithSpaceForAdCount[i] = 1;
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, uriArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdState(int i, int i2) {
            int i3 = this.count;
            com.google.android.exoplayer2.util.Assertions.checkArgument(i3 == -1 || i2 < i3);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i2 + 1);
            int i4 = copyStatesWithSpaceForAdCount[i2];
            com.google.android.exoplayer2.util.Assertions.checkArgument(i4 == 0 || i4 == 1 || i4 == i);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            android.net.Uri[] uriArr = this.uris;
            if (uriArr.length != copyStatesWithSpaceForAdCount.length) {
                uriArr = (android.net.Uri[]) java.util.Arrays.copyOf(uriArr, copyStatesWithSpaceForAdCount.length);
            }
            copyStatesWithSpaceForAdCount[i2] = i;
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, uriArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            android.net.Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            } else if (this.count != -1 && jArr.length > uriArr.length) {
                jArr = java.util.Arrays.copyOf(jArr, uriArr.length);
            }
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withContentResumeOffsetUs(long j) {
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, j, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withIsServerSideInserted(boolean z) {
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, z);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withOriginalAdCount(int i) {
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, this.count, i, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = java.util.Arrays.copyOf(iArr, length);
            android.net.Uri[] uriArr = (android.net.Uri[]) java.util.Arrays.copyOf(this.uris, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = java.util.Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, uriArr, jArr2, com.google.android.exoplayer2.util.Util.sum(jArr2), this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, 0, this.originalCount, new int[0], new android.net.Uri[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted);
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
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = java.util.Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 3 || i2 == 2 || i2 == 4) {
                    copyOf[i] = this.uris[i] == null ? 0 : 1;
                }
            }
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int max = java.lang.Math.max(i, length);
            int[] copyOf = java.util.Arrays.copyOf(iArr, max);
            java.util.Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int max = java.lang.Math.max(i, length);
            long[] copyOf = java.util.Arrays.copyOf(jArr, max);
            java.util.Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong(keyForField(0), this.timeUs);
            bundle.putInt(keyForField(1), this.count);
            bundle.putInt(keyForField(7), this.originalCount);
            bundle.putParcelableArrayList(keyForField(2), new java.util.ArrayList<>(java.util.Arrays.asList(this.uris)));
            bundle.putIntArray(keyForField(3), this.states);
            bundle.putLongArray(keyForField(4), this.durationsUs);
            bundle.putLong(keyForField(5), this.contentResumeOffsetUs);
            bundle.putBoolean(keyForField(6), this.isServerSideInserted);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup fromBundle(android.os.Bundle bundle) {
            long j = bundle.getLong(keyForField(0));
            int i = bundle.getInt(keyForField(1), -1);
            int i2 = bundle.getInt(keyForField(7), -1);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(2));
            int[] intArray = bundle.getIntArray(keyForField(3));
            long[] longArray = bundle.getLongArray(keyForField(4));
            long j2 = bundle.getLong(keyForField(5));
            boolean z = bundle.getBoolean(keyForField(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(j, i, i2, intArray, parcelableArrayList == null ? new android.net.Uri[0] : (android.net.Uri[]) parcelableArrayList.toArray(new android.net.Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        private static java.lang.String keyForField(int i) {
            return java.lang.Integer.toString(i, 36);
        }
    }

    public AdPlaybackState(java.lang.Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, -9223372036854775807L, 0);
    }

    private AdPlaybackState(java.lang.Object obj, com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr, long j, long j2, int i) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
        this.adGroupCount = adGroupArr.length + i;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i;
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup getAdGroup(int i) {
        int i2 = this.removedAdGroupCount;
        if (i < i2) {
            return REMOVED_AD_GROUP;
        }
        return this.adGroups[i - i2];
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.adGroupCount - 1;
        while (i >= 0 && isPositionBeforeAdGroup(j, j2, i)) {
            i--;
        }
        if (i < 0 || !getAdGroup(i).hasUnplayedAds()) {
            return -1;
        }
        return i;
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i < this.adGroupCount) {
            return i;
        }
        return -1;
    }

    public boolean isAdInErrorState(int i, int i2) {
        if (i >= this.adGroupCount) {
            return false;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = getAdGroup(i);
        return adGroup.count != -1 && i2 < adGroup.count && adGroup.states[i2] == 4;
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdGroupTimeUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.adGroups[i2].withTimeUs(j);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withNewAdGroup(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(j);
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayAppend(this.adGroups, adGroup);
        java.lang.System.arraycopy(adGroupArr, i2, adGroupArr, i2 + 1, this.adGroups.length - i2);
        adGroupArr[i2] = adGroup;
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdCount(int i, int i2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i2 > 0);
        int i3 = i - this.removedAdGroupCount;
        if (this.adGroups[i3].count == i2) {
            return this;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = this.adGroups[i3].withAdCount(i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAvailableAdUri(int i, int i2, android.net.Uri uri) {
        int i3 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        com.google.android.exoplayer2.util.Assertions.checkState(!android.net.Uri.EMPTY.equals(uri) || adGroupArr2[i3].isServerSideInserted);
        adGroupArr2[i3] = adGroupArr2[i3].withAdUri(uri, i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAvailableAd(int i, int i2) {
        return withAvailableAdUri(i, i2, android.net.Uri.EMPTY);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withPlayedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(3, i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withSkippedAd(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(2, i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withLastAdRemoved(int i) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withLastAdRemoved();
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdLoadError(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(4, i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withSkippedAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdDurationsUs(long[][] jArr) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.removedAdGroupCount == 0);
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i = 0; i < this.adGroupCount; i++) {
            adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i]);
        }
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdDurationsUs(int i, long... jArr) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withAdResumePositionUs(long j) {
        return this.adResumePositionUs == j ? this : new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, this.adGroups, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withContentDurationUs(long j) {
        return this.contentDurationUs == j ? this : new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withRemovedAdGroupCount(int i) {
        int i2 = this.removedAdGroupCount;
        if (i2 == i) {
            return this;
        }
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > i2);
        int i3 = this.adGroupCount - i;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[i3];
        java.lang.System.arraycopy(this.adGroups, i - this.removedAdGroupCount, adGroupArr, 0, i3);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withContentResumeOffsetUs(int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        if (this.adGroups[i2].contentResumeOffsetUs == j) {
            return this;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withContentResumeOffsetUs(j);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withOriginalAdCount(int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        if (this.adGroups[i3].originalCount == i2) {
            return this;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withOriginalAdCount(i2);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withIsServerSideInserted(int i, boolean z) {
        int i2 = i - this.removedAdGroupCount;
        if (this.adGroups[i2].isServerSideInserted == z) {
            return this;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsServerSideInserted(z);
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public com.google.android.exoplayer2.source.ads.AdPlaybackState withResetAdGroup(int i) {
        int i2 = i - this.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = this.adGroups;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsReset();
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public static com.google.android.exoplayer2.source.ads.AdPlaybackState fromAdPlaybackState(java.lang.Object obj, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[i];
        for (int i2 = 0; i2 < i; i2++) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = adPlaybackState.adGroups[i2];
            adGroupArr[i2] = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(adGroup.timeUs, adGroup.count, adGroup.originalCount, java.util.Arrays.copyOf(adGroup.states, adGroup.states.length), (android.net.Uri[]) java.util.Arrays.copyOf(adGroup.uris, adGroup.uris.length), java.util.Arrays.copyOf(adGroup.durationsUs, adGroup.durationsUs.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted);
        }
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = (com.google.android.exoplayer2.source.ads.AdPlaybackState) obj;
        return com.google.android.exoplayer2.util.Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && java.util.Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public int hashCode() {
        int i = this.adGroupCount * 31;
        java.lang.Object obj = this.adsId;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + java.util.Arrays.hashCode(this.adGroups);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.adGroups.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i].timeUs);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.adGroups[i].states.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.adGroups[i].states[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
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
                sb.append(this.adGroups[i].durationsUs[i2]);
                sb.append(')');
                if (i2 < this.adGroups[i].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    private boolean isPositionBeforeAdGroup(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = getAdGroup(i).timeUs;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        for (com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle());
        }
        bundle.putParcelableArrayList(keyForField(1), arrayList);
        bundle.putLong(keyForField(2), this.adResumePositionUs);
        bundle.putLong(keyForField(3), this.contentDurationUs);
        bundle.putInt(keyForField(4), this.removedAdGroupCount);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.ads.AdPlaybackState fromBundle(android.os.Bundle bundle) {
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr;
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(1));
        if (parcelableArrayList == null) {
            adGroupArr = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[0];
        } else {
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr2 = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                adGroupArr2[i] = com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup.CREATOR.fromBundle((android.os.Bundle) parcelableArrayList.get(i));
            }
            adGroupArr = adGroupArr2;
        }
        return new com.google.android.exoplayer2.source.ads.AdPlaybackState(null, adGroupArr, bundle.getLong(keyForField(2), 0L), bundle.getLong(keyForField(3), -9223372036854775807L), bundle.getInt(keyForField(4)));
    }

    private static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[] adGroupArr = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = new com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup(jArr[i]);
        }
        return adGroupArr;
    }
}
