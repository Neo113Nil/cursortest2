package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class SinglePeriodTimeline extends com.google.android.exoplayer2.Timeline {
    private final long elapsedRealtimeEpochOffsetMs;
    private final boolean isDynamic;
    private final boolean isSeekable;
    private final com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration;
    private final java.lang.Object manifest;
    private final com.google.android.exoplayer2.MediaItem mediaItem;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;
    private final boolean suppressPositionProjection;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;
    private static final java.lang.Object UID = new java.lang.Object();
    private static final com.google.android.exoplayer2.MediaItem MEDIA_ITEM = new com.google.android.exoplayer2.MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(android.net.Uri.EMPTY).build();

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.google.android.exoplayer2.MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.google.android.exoplayer2.MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, mediaItem, z3 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, java.lang.Object obj2) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, r0.buildUpon().setTag(obj2).build(), z3 ? r0.liveConfiguration : null);
        com.google.android.exoplayer2.MediaItem mediaItem = MEDIA_ITEM;
    }

    @java.lang.Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, java.lang.Object obj, com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, java.lang.Object obj, com.google.android.exoplayer2.MediaItem mediaItem, com.google.android.exoplayer2.MediaItem.LiveConfiguration liveConfiguration) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.elapsedRealtimeEpochOffsetMs = j3;
        this.periodDurationUs = j4;
        this.windowDurationUs = j5;
        this.windowPositionInPeriodUs = j6;
        this.windowDefaultStartPositionUs = j7;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.suppressPositionProjection = z3;
        this.manifest = obj;
        this.mediaItem = (com.google.android.exoplayer2.MediaItem) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaItem);
        this.liveConfiguration = liveConfiguration;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
        long j2;
        com.google.android.exoplayer2.util.Assertions.checkIndex(i, 0, 1);
        long j3 = this.windowDefaultStartPositionUs;
        if (this.isDynamic && !this.suppressPositionProjection && j != 0) {
            long j4 = this.windowDurationUs;
            if (j4 != -9223372036854775807L) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            return window.set(com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, j2, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
        }
        j2 = j3;
        return window.set(com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, j2, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
        com.google.android.exoplayer2.util.Assertions.checkIndex(i, 0, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(java.lang.Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public java.lang.Object getUidOfPeriod(int i) {
        com.google.android.exoplayer2.util.Assertions.checkIndex(i, 0, 1);
        return UID;
    }
}
