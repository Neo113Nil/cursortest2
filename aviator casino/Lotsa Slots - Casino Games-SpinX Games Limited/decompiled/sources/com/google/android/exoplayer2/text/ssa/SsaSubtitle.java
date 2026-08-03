package com.google.android.exoplayer2.text.ssa;

/* loaded from: classes3.dex */
final class SsaSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final java.util.List<java.lang.Long> cueTimesUs;
    private final java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> cues;

    public SsaSubtitle(java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> list, java.util.List<java.lang.Long> list2) {
        this.cues = list;
        this.cueTimesUs = list2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = com.google.android.exoplayer2.util.Util.binarySearchCeil((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) this.cueTimesUs, java.lang.Long.valueOf(j), false, false);
        if (binarySearchCeil < this.cueTimesUs.size()) {
            return binarySearchCeil;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0);
        com.google.android.exoplayer2.util.Assertions.checkArgument(i < this.cueTimesUs.size());
        return this.cueTimesUs.get(i).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long j) {
        int binarySearchFloor = com.google.android.exoplayer2.util.Util.binarySearchFloor((java.util.List<? extends java.lang.Comparable<? super java.lang.Long>>) this.cueTimesUs, java.lang.Long.valueOf(j), true, false);
        if (binarySearchFloor == -1) {
            return java.util.Collections.emptyList();
        }
        return this.cues.get(binarySearchFloor);
    }
}
