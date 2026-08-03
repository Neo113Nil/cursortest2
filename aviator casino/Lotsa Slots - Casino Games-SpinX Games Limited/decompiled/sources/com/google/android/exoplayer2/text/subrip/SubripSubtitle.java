package com.google.android.exoplayer2.text.subrip;

/* loaded from: classes3.dex */
final class SubripSubtitle implements com.google.android.exoplayer2.text.Subtitle {
    private final long[] cueTimesUs;
    private final com.google.android.exoplayer2.text.Cue[] cues;

    public SubripSubtitle(com.google.android.exoplayer2.text.Cue[] cueArr, long[] jArr) {
        this.cues = cueArr;
        this.cueTimesUs = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = com.google.android.exoplayer2.util.Util.binarySearchCeil(this.cueTimesUs, j, false, false);
        if (binarySearchCeil < this.cueTimesUs.length) {
            return binarySearchCeil;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i >= 0);
        com.google.android.exoplayer2.util.Assertions.checkArgument(i < this.cueTimesUs.length);
        return this.cueTimesUs[i];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public java.util.List<com.google.android.exoplayer2.text.Cue> getCues(long j) {
        int binarySearchFloor = com.google.android.exoplayer2.util.Util.binarySearchFloor(this.cueTimesUs, j, true, false);
        if (binarySearchFloor == -1 || this.cues[binarySearchFloor] == com.google.android.exoplayer2.text.Cue.EMPTY) {
            return java.util.Collections.emptyList();
        }
        return java.util.Collections.singletonList(this.cues[binarySearchFloor]);
    }
}
