package androidx.media3.extractor.text;

/* loaded from: classes2.dex */
public final class CuesWithTimingSubtitle implements androidx.media3.extractor.text.Subtitle {
    private static final com.google.common.collect.Ordering<androidx.media3.extractor.text.CuesWithTiming> CUES_BY_START_TIME_ASCENDING = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.extractor.text.CuesWithTimingSubtitle$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            java.lang.Comparable valueOf;
            valueOf = java.lang.Long.valueOf(androidx.media3.extractor.text.CuesWithTimingSubtitle.normalizeUnsetStartTimeToZero(((androidx.media3.extractor.text.CuesWithTiming) obj).startTimeUs));
            return valueOf;
        }
    });
    private static final java.lang.String TAG = "CuesWithTimingSubtitle";
    private final com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue>> eventCues;
    private final long[] eventTimesUs;

    private static long normalizeUnsetStartTimeToZero(long j) {
        if (j == -9223372036854775807L) {
            return 0L;
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CuesWithTimingSubtitle(java.util.List<androidx.media3.extractor.text.CuesWithTiming> list) {
        if (list.size() == 1) {
            androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = (androidx.media3.extractor.text.CuesWithTiming) com.google.common.collect.Iterables.getOnlyElement(list);
            long normalizeUnsetStartTimeToZero = normalizeUnsetStartTimeToZero(cuesWithTiming.startTimeUs);
            if (cuesWithTiming.durationUs == -9223372036854775807L) {
                this.eventCues = com.google.common.collect.ImmutableList.of(cuesWithTiming.cues);
                this.eventTimesUs = new long[]{normalizeUnsetStartTimeToZero};
                return;
            } else {
                this.eventCues = com.google.common.collect.ImmutableList.of((com.google.common.collect.ImmutableList) cuesWithTiming.cues, com.google.common.collect.ImmutableList.of());
                this.eventTimesUs = new long[]{normalizeUnsetStartTimeToZero, cuesWithTiming.durationUs + normalizeUnsetStartTimeToZero};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        java.util.Arrays.fill(jArr, Long.MAX_VALUE);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.collect.ImmutableList sortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(CUES_BY_START_TIME_ASCENDING, list);
        int i = 0;
        for (int i2 = 0; i2 < sortedCopyOf.size(); i2++) {
            androidx.media3.extractor.text.CuesWithTiming cuesWithTiming2 = (androidx.media3.extractor.text.CuesWithTiming) sortedCopyOf.get(i2);
            long normalizeUnsetStartTimeToZero2 = normalizeUnsetStartTimeToZero(cuesWithTiming2.startTimeUs);
            long j = cuesWithTiming2.durationUs + normalizeUnsetStartTimeToZero2;
            if (i != 0) {
                int i3 = i - 1;
                long j2 = this.eventTimesUs[i3];
                if (j2 >= normalizeUnsetStartTimeToZero2) {
                    if (j2 == normalizeUnsetStartTimeToZero2 && ((com.google.common.collect.ImmutableList) arrayList.get(i3)).isEmpty()) {
                        arrayList.set(i3, cuesWithTiming2.cues);
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i3] = normalizeUnsetStartTimeToZero2;
                        arrayList.set(i3, cuesWithTiming2.cues);
                    }
                    if (cuesWithTiming2.durationUs == -9223372036854775807L) {
                        this.eventTimesUs[i] = j;
                        arrayList.add(com.google.common.collect.ImmutableList.of());
                        i++;
                    }
                }
            }
            this.eventTimesUs[i] = normalizeUnsetStartTimeToZero2;
            arrayList.add(cuesWithTiming2.cues);
            i++;
            if (cuesWithTiming2.durationUs == -9223372036854775807L) {
            }
        }
        this.eventCues = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.eventTimesUs, j, false, false);
        if (binarySearchCeil < this.eventCues.size()) {
            return binarySearchCeil;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventCues.size();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i < this.eventCues.size());
        return this.eventTimesUs[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCues(long j) {
        int binarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.eventTimesUs, j, true, false);
        return binarySearchFloor == -1 ? com.google.common.collect.ImmutableList.of() : this.eventCues.get(binarySearchFloor);
    }
}
