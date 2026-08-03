package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class PlaylistTimeline extends com.google.android.exoplayer2.AbstractConcatenatedTimeline {
    private final java.util.HashMap<java.lang.Object, java.lang.Integer> childIndexByUid;
    private final int[] firstPeriodInChildIndices;
    private final int[] firstWindowInChildIndices;
    private final int periodCount;
    private final com.google.android.exoplayer2.Timeline[] timelines;
    private final java.lang.Object[] uids;
    private final int windowCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistTimeline(java.util.Collection<? extends com.google.android.exoplayer2.MediaSourceInfoHolder> collection, com.google.android.exoplayer2.source.ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i = 0;
        int size = collection.size();
        this.firstPeriodInChildIndices = new int[size];
        this.firstWindowInChildIndices = new int[size];
        this.timelines = new com.google.android.exoplayer2.Timeline[size];
        this.uids = new java.lang.Object[size];
        this.childIndexByUid = new java.util.HashMap<>();
        int i2 = 0;
        int i3 = 0;
        for (com.google.android.exoplayer2.MediaSourceInfoHolder mediaSourceInfoHolder : collection) {
            this.timelines[i3] = mediaSourceInfoHolder.getTimeline();
            this.firstWindowInChildIndices[i3] = i;
            this.firstPeriodInChildIndices[i3] = i2;
            i += this.timelines[i3].getWindowCount();
            i2 += this.timelines[i3].getPeriodCount();
            this.uids[i3] = mediaSourceInfoHolder.getUid();
            this.childIndexByUid.put(this.uids[i3], java.lang.Integer.valueOf(i3));
            i3++;
        }
        this.windowCount = i;
        this.periodCount = i2;
    }

    java.util.List<com.google.android.exoplayer2.Timeline> getChildTimelines() {
        return java.util.Arrays.asList(this.timelines);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByPeriodIndex(int i) {
        return com.google.android.exoplayer2.util.Util.binarySearchFloor(this.firstPeriodInChildIndices, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByWindowIndex(int i) {
        return com.google.android.exoplayer2.util.Util.binarySearchFloor(this.firstWindowInChildIndices, i + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getChildIndexByChildUid(java.lang.Object obj) {
        java.lang.Integer num = this.childIndexByUid.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected com.google.android.exoplayer2.Timeline getTimelineByChildIndex(int i) {
        return this.timelines[i];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstPeriodIndexByChildIndex(int i) {
        return this.firstPeriodInChildIndices[i];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected int getFirstWindowIndexByChildIndex(int i) {
        return this.firstWindowInChildIndices[i];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    protected java.lang.Object getChildUidByChildIndex(int i) {
        return this.uids[i];
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.windowCount;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.periodCount;
    }
}
