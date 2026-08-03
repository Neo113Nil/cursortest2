package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public abstract class BaseTrackSelection implements com.google.android.exoplayer2.trackselection.ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final com.google.android.exoplayer2.Format[] formats;
    protected final com.google.android.exoplayer2.source.TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;
    private final int type;

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onDiscontinuity(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onPlayWhenReadyChanged(this, z);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$onRebuffer(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j, com.google.android.exoplayer2.source.chunk.Chunk chunk, java.util.List list) {
        return com.google.android.exoplayer2.trackselection.ExoTrackSelection.CC.$default$shouldCancelChunkLoad(this, j, chunk, list);
    }

    public BaseTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    public BaseTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, int i) {
        int i2 = 0;
        com.google.android.exoplayer2.util.Assertions.checkState(iArr.length > 0);
        this.type = i;
        this.group = (com.google.android.exoplayer2.source.TrackGroup) com.google.android.exoplayer2.util.Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new com.google.android.exoplayer2.Format[length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.formats[i3] = trackGroup.getFormat(iArr[i3]);
        }
        java.util.Arrays.sort(this.formats, new java.util.Comparator() { // from class: com.google.android.exoplayer2.trackselection.BaseTrackSelection$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.trackselection.BaseTrackSelection.lambda$new$0((com.google.android.exoplayer2.Format) obj, (com.google.android.exoplayer2.Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i4 = this.length;
            if (i2 < i4) {
                this.tracks[i2] = trackGroup.indexOf(this.formats[i2]);
                i2++;
            } else {
                this.excludeUntilTimes = new long[i4];
                return;
            }
        }
    }

    static /* synthetic */ int lambda$new$0(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final com.google.android.exoplayer2.source.TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final com.google.android.exoplayer2.Format getFormat(int i) {
        return this.formats[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(com.google.android.exoplayer2.Format format) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final com.google.android.exoplayer2.Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int i, long j) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean isBlacklisted = isBlacklisted(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.length && !isBlacklisted) {
            isBlacklisted = (i2 == i || isBlacklisted(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!isBlacklisted) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i] = java.lang.Math.max(jArr[i], com.google.android.exoplayer2.util.Util.addWithOverflowDefault(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int i, long j) {
        return this.excludeUntilTimes[i] > j;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (java.lang.System.identityHashCode(this.group) * 31) + java.util.Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.BaseTrackSelection baseTrackSelection = (com.google.android.exoplayer2.trackselection.BaseTrackSelection) obj;
        return this.group == baseTrackSelection.group && java.util.Arrays.equals(this.tracks, baseTrackSelection.tracks);
    }
}
