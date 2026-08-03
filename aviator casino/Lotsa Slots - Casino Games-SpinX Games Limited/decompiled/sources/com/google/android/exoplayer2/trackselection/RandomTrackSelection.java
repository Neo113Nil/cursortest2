package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class RandomTrackSelection extends com.google.android.exoplayer2.trackselection.BaseTrackSelection {
    private final java.util.Random random;
    private int selectedIndex;

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public java.lang.Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    public static final class Factory implements com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory {
        private final java.util.Random random;

        public Factory() {
            this.random = new java.util.Random();
        }

        public Factory(int i) {
            this.random = new java.util.Random(i);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline) {
            return com.google.android.exoplayer2.trackselection.TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: com.google.android.exoplayer2.trackselection.RandomTrackSelection$Factory$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final com.google.android.exoplayer2.trackselection.ExoTrackSelection createAdaptiveTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition) {
                    return com.google.android.exoplayer2.trackselection.RandomTrackSelection.Factory.this.m5443x1ff1e6e5(definition);
                }
            });
        }

        /* renamed from: lambda$createTrackSelections$0$com-google-android-exoplayer2-trackselection-RandomTrackSelection$Factory, reason: not valid java name */
        /* synthetic */ com.google.android.exoplayer2.trackselection.ExoTrackSelection m5443x1ff1e6e5(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition definition) {
            return new com.google.android.exoplayer2.trackselection.RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }
    }

    public RandomTrackSelection(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, int i, java.util.Random random) {
        super(trackGroup, iArr, i);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (!isBlacklisted(i2, elapsedRealtime)) {
                i++;
            }
        }
        this.selectedIndex = this.random.nextInt(i);
        if (i != this.length) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.length; i4++) {
                if (!isBlacklisted(i4, elapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.selectedIndex == i3) {
                        this.selectedIndex = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }
}
