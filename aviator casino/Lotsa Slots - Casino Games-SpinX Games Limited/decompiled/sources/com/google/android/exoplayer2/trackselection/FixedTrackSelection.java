package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class FixedTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
    private final java.lang.Object data;
    private final int reason;

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0);
    }

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int i, int i2) {
        this(trackGroup, i, i2, 0, null);
    }

    public FixedTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int i, int i2, int i3, java.lang.Object obj) {
        super(trackGroup, new int[]{i}, i2);
        this.reason = i3;
        this.data = obj;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return this.data;
    }
}
