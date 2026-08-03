package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class MaskingMediaSource extends com.google.android.exoplayer2.source.WrappingMediaSource {
    private boolean hasRealTimeline;
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final com.google.android.exoplayer2.Timeline.Period period;
    private com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline timeline;
    private com.google.android.exoplayer2.source.MaskingMediaPeriod unpreparedMaskingMediaPeriod;
    private final boolean useLazyPreparation;
    private final com.google.android.exoplayer2.Timeline.Window window;

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    public MaskingMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, boolean z) {
        super(mediaSource);
        this.useLazyPreparation = z && mediaSource.isSingleWindow();
        this.window = new com.google.android.exoplayer2.Timeline.Window();
        this.period = new com.google.android.exoplayer2.Timeline.Period();
        com.google.android.exoplayer2.Timeline initialTimeline = mediaSource.getInitialTimeline();
        if (initialTimeline != null) {
            this.timeline = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(initialTimeline, null, null);
            this.hasRealTimeline = true;
        } else {
            this.timeline = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithPlaceholderTimeline(mediaSource.getMediaItem());
        }
    }

    public com.google.android.exoplayer2.Timeline getTimeline() {
        return this.timeline;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    public void prepareSourceInternal() {
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource();
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MaskingMediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = new com.google.android.exoplayer2.source.MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.setMediaSource(this.mediaSource);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
        } else {
            this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
            if (!this.hasStartedPreparing) {
                this.hasStartedPreparing = true;
                prepareChildSource();
            }
        }
        return maskingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        ((com.google.android.exoplayer2.source.MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onChildSourceInfoRefreshed(com.google.android.exoplayer2.Timeline timeline) {
        long j;
        com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithRealTimeline;
        com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId copyWithPeriodUid;
        com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithRealTimeline2;
        if (this.isPrepared) {
            this.timeline = this.timeline.cloneWithUpdatedTimeline(timeline);
            com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod2 != null) {
                setPreparePositionOverrideToUnpreparedMaskingPeriod(maskingMediaPeriod2.getPreparePositionOverrideUs());
            }
        } else if (timeline.isEmpty()) {
            if (this.hasRealTimeline) {
                createWithRealTimeline2 = this.timeline.cloneWithUpdatedTimeline(timeline);
            } else {
                createWithRealTimeline2 = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(timeline, com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID, com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID);
            }
            this.timeline = createWithRealTimeline2;
        } else {
            timeline.getWindow(0, this.window);
            long defaultPositionUs = this.window.getDefaultPositionUs();
            java.lang.Object obj = this.window.uid;
            com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod3 = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod3 != null) {
                long preparePositionUs = maskingMediaPeriod3.getPreparePositionUs();
                this.timeline.getPeriodByUid(this.unpreparedMaskingMediaPeriod.id.periodUid, this.period);
                long positionInWindowUs = this.period.getPositionInWindowUs() + preparePositionUs;
                if (positionInWindowUs != this.timeline.getWindow(0, this.window).getDefaultPositionUs()) {
                    j = positionInWindowUs;
                    android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, 0, j);
                    java.lang.Object obj2 = periodPositionUs.first;
                    long longValue = ((java.lang.Long) periodPositionUs.second).longValue();
                    if (!this.hasRealTimeline) {
                        createWithRealTimeline = this.timeline.cloneWithUpdatedTimeline(timeline);
                    } else {
                        createWithRealTimeline = com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.createWithRealTimeline(timeline, obj, obj2);
                    }
                    this.timeline = createWithRealTimeline;
                    maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
                    if (maskingMediaPeriod != null) {
                        setPreparePositionOverrideToUnpreparedMaskingPeriod(longValue);
                        copyWithPeriodUid = maskingMediaPeriod.id.copyWithPeriodUid(getInternalPeriodUid(maskingMediaPeriod.id.periodUid));
                        this.hasRealTimeline = true;
                        this.isPrepared = true;
                        refreshSourceInfo(this.timeline);
                        if (copyWithPeriodUid == null) {
                            ((com.google.android.exoplayer2.source.MaskingMediaPeriod) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.unpreparedMaskingMediaPeriod)).createPeriod(copyWithPeriodUid);
                            return;
                        }
                        return;
                    }
                }
            }
            j = defaultPositionUs;
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs2 = timeline.getPeriodPositionUs(this.window, this.period, 0, j);
            java.lang.Object obj22 = periodPositionUs2.first;
            long longValue2 = ((java.lang.Long) periodPositionUs2.second).longValue();
            if (!this.hasRealTimeline) {
            }
            this.timeline = createWithRealTimeline;
            maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
            if (maskingMediaPeriod != null) {
            }
        }
        copyWithPeriodUid = null;
        this.hasRealTimeline = true;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
        if (copyWithPeriodUid == null) {
        }
    }

    @Override // com.google.android.exoplayer2.source.WrappingMediaSource
    protected com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    private java.lang.Object getInternalPeriodUid(java.lang.Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !obj.equals(com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID)) ? obj : this.timeline.replacedInternalPeriodUid;
    }

    private java.lang.Object getExternalPeriodUid(java.lang.Object obj) {
        return (this.timeline.replacedInternalPeriodUid == null || !this.timeline.replacedInternalPeriodUid.equals(obj)) ? obj : com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private void setPreparePositionOverrideToUnpreparedMaskingPeriod(long j) {
        com.google.android.exoplayer2.source.MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        int indexOfPeriod = this.timeline.getIndexOfPeriod(maskingMediaPeriod.id.periodUid);
        if (indexOfPeriod == -1) {
            return;
        }
        long j2 = this.timeline.getPeriod(indexOfPeriod, this.period).durationUs;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = java.lang.Math.max(0L, j2 - 1);
        }
        maskingMediaPeriod.overridePreparePositionUs(j);
    }

    private static final class MaskingTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        public static final java.lang.Object MASKING_EXTERNAL_PERIOD_UID = new java.lang.Object();
        private final java.lang.Object replacedInternalPeriodUid;
        private final java.lang.Object replacedInternalWindowUid;

        public static com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithPlaceholderTimeline(com.google.android.exoplayer2.MediaItem mediaItem) {
            return new com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline(new com.google.android.exoplayer2.source.MaskingMediaSource.PlaceholderTimeline(mediaItem), com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID, MASKING_EXTERNAL_PERIOD_UID);
        }

        public static com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline createWithRealTimeline(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, java.lang.Object obj2) {
            return new com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline(timeline, obj, obj2);
        }

        private MaskingTimeline(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, java.lang.Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline cloneWithUpdatedTimeline(com.google.android.exoplayer2.Timeline timeline) {
            return new com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            this.timeline.getWindow(i, window, j);
            if (com.google.android.exoplayer2.util.Util.areEqual(window.uid, this.replacedInternalWindowUid)) {
                window.uid = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            this.timeline.getPeriod(i, period, z);
            if (com.google.android.exoplayer2.util.Util.areEqual(period.uid, this.replacedInternalPeriodUid) && z) {
                period.uid = MASKING_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            java.lang.Object obj2;
            com.google.android.exoplayer2.Timeline timeline = this.timeline;
            if (MASKING_EXTERNAL_PERIOD_UID.equals(obj) && (obj2 = this.replacedInternalPeriodUid) != null) {
                obj = obj2;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            java.lang.Object uidOfPeriod = this.timeline.getUidOfPeriod(i);
            return com.google.android.exoplayer2.util.Util.areEqual(uidOfPeriod, this.replacedInternalPeriodUid) ? MASKING_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }
    }

    public static final class PlaceholderTimeline extends com.google.android.exoplayer2.Timeline {
        private final com.google.android.exoplayer2.MediaItem mediaItem;

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }

        public PlaceholderTimeline(com.google.android.exoplayer2.MediaItem mediaItem) {
            this.mediaItem = mediaItem;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            window.set(com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.isPlaceholder = true;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            period.set(z ? 0 : null, z ? com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID : null, 0, -9223372036854775807L, 0L, com.google.android.exoplayer2.source.ads.AdPlaybackState.NONE, true);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(java.lang.Object obj) {
            return obj == com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public java.lang.Object getUidOfPeriod(int i) {
            return com.google.android.exoplayer2.source.MaskingMediaSource.MaskingTimeline.MASKING_EXTERNAL_PERIOD_UID;
        }
    }
}
