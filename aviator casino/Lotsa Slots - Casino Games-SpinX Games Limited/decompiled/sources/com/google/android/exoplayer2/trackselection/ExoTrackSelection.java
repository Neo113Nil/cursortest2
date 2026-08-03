package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public interface ExoTrackSelection extends com.google.android.exoplayer2.trackselection.TrackSelection {

    /* renamed from: com.google.android.exoplayer2.trackselection.ExoTrackSelection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onDiscontinuity(com.google.android.exoplayer2.trackselection.ExoTrackSelection _this) {
        }

        public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.trackselection.ExoTrackSelection _this, boolean z) {
        }

        public static void $default$onRebuffer(com.google.android.exoplayer2.trackselection.ExoTrackSelection _this) {
        }

        public static boolean $default$shouldCancelChunkLoad(com.google.android.exoplayer2.trackselection.ExoTrackSelection _this, long j, com.google.android.exoplayer2.source.chunk.Chunk chunk, java.util.List list) {
            return false;
        }
    }

    public interface Factory {
        com.google.android.exoplayer2.trackselection.ExoTrackSelection[] createTrackSelections(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition[] definitionArr, com.google.android.exoplayer2.upstream.BandwidthMeter bandwidthMeter, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.Timeline timeline);
    }

    boolean blacklist(int i, long j);

    void disable();

    void enable();

    int evaluateQueueSize(long j, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list);

    com.google.android.exoplayer2.Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    java.lang.Object getSelectionData();

    int getSelectionReason();

    boolean isBlacklisted(int i, long j);

    void onDiscontinuity();

    void onPlayWhenReadyChanged(boolean z);

    void onPlaybackSpeed(float f);

    void onRebuffer();

    boolean shouldCancelChunkLoad(long j, com.google.android.exoplayer2.source.chunk.Chunk chunk, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list);

    void updateSelectedTrack(long j, long j2, long j3, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> list, com.google.android.exoplayer2.source.chunk.MediaChunkIterator[] mediaChunkIteratorArr);

    public static final class Definition {
        private static final java.lang.String TAG = "ETSDefinition";
        public final com.google.android.exoplayer2.source.TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(com.google.android.exoplayer2.source.TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }

        public Definition(com.google.android.exoplayer2.source.TrackGroup trackGroup, int[] iArr, int i) {
            if (iArr.length == 0) {
                com.google.android.exoplayer2.util.Log.e(TAG, "Empty tracks are not allowed", new java.lang.IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i;
        }
    }
}
