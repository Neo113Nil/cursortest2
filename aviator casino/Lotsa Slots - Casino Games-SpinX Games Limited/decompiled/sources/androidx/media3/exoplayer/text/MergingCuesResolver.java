package androidx.media3.exoplayer.text;

/* loaded from: classes2.dex */
final class MergingCuesResolver implements androidx.media3.exoplayer.text.CuesResolver {
    private static final com.google.common.collect.Ordering<androidx.media3.extractor.text.CuesWithTiming> CUES_DISPLAY_PRIORITY_COMPARATOR = com.google.common.collect.Ordering.natural().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            java.lang.Long valueOf;
            valueOf = java.lang.Long.valueOf(((androidx.media3.extractor.text.CuesWithTiming) obj).startTimeUs);
            return valueOf;
        }
    }).compound(com.google.common.collect.Ordering.natural().reverse().onResultOf(new com.google.common.base.Function() { // from class: androidx.media3.exoplayer.text.MergingCuesResolver$$ExternalSyntheticLambda1
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            java.lang.Long valueOf;
            valueOf = java.lang.Long.valueOf(((androidx.media3.extractor.text.CuesWithTiming) obj).durationUs);
            return valueOf;
        }
    }));
    private final java.util.List<androidx.media3.extractor.text.CuesWithTiming> cuesWithTimingList = new java.util.ArrayList();

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming cuesWithTiming, long j) {
        androidx.media3.common.util.Assertions.checkArgument(cuesWithTiming.startTimeUs != -9223372036854775807L);
        androidx.media3.common.util.Assertions.checkArgument(cuesWithTiming.durationUs != -9223372036854775807L);
        boolean z = cuesWithTiming.startTimeUs <= j && j < cuesWithTiming.endTimeUs;
        for (int size = this.cuesWithTimingList.size() - 1; size >= 0; size--) {
            if (cuesWithTiming.startTimeUs >= this.cuesWithTimingList.get(size).startTimeUs) {
                this.cuesWithTimingList.add(size + 1, cuesWithTiming);
                return z;
            }
        }
        this.cuesWithTimingList.add(0, cuesWithTiming);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    public com.google.common.collect.ImmutableList<androidx.media3.common.text.Cue> getCuesAtTimeUs(long j) {
        if (!this.cuesWithTimingList.isEmpty()) {
            if (j >= this.cuesWithTimingList.get(0).startTimeUs) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
                    androidx.media3.extractor.text.CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
                    if (j >= cuesWithTiming.startTimeUs && j < cuesWithTiming.endTimeUs) {
                        arrayList.add(cuesWithTiming);
                    }
                    if (j < cuesWithTiming.startTimeUs) {
                        break;
                    }
                }
                com.google.common.collect.ImmutableList sortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(CUES_DISPLAY_PRIORITY_COMPARATOR, arrayList);
                com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
                for (int i2 = 0; i2 < sortedCopyOf.size(); i2++) {
                    builder.addAll((java.lang.Iterable) ((androidx.media3.extractor.text.CuesWithTiming) sortedCopyOf.get(i2)).cues);
                }
                return builder.build();
            }
        }
        return com.google.common.collect.ImmutableList.of();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int i = 0;
        while (i < this.cuesWithTimingList.size()) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            if (j > j2 && j > this.cuesWithTimingList.get(i).endTimeUs) {
                this.cuesWithTimingList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        long j2 = this.cuesWithTimingList.get(0).startTimeUs;
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            long j3 = this.cuesWithTimingList.get(i).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j4 <= j) {
                j2 = java.lang.Math.max(j2, j4);
            } else {
                if (j3 > j) {
                    break;
                }
                j2 = java.lang.Math.max(j2, j3);
            }
        }
        return j2;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            if (i >= this.cuesWithTimingList.size()) {
                break;
            }
            long j3 = this.cuesWithTimingList.get(i).startTimeUs;
            long j4 = this.cuesWithTimingList.get(i).endTimeUs;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : java.lang.Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : java.lang.Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }
}
