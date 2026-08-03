package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class MediaPeriodHolder {
    private static final java.lang.String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public com.google.android.exoplayer2.MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final com.google.android.exoplayer2.source.MediaPeriod mediaPeriod;
    private final com.google.android.exoplayer2.MediaSourceList mediaSourceList;
    private com.google.android.exoplayer2.MediaPeriodHolder next;
    public boolean prepared;
    private final com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final com.google.android.exoplayer2.source.SampleStream[] sampleStreams;
    private com.google.android.exoplayer2.source.TrackGroupArray trackGroups = com.google.android.exoplayer2.source.TrackGroupArray.EMPTY;
    private final com.google.android.exoplayer2.trackselection.TrackSelector trackSelector;
    private com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult;
    public final java.lang.Object uid;

    public MediaPeriodHolder(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr, long j, com.google.android.exoplayer2.trackselection.TrackSelector trackSelector, com.google.android.exoplayer2.upstream.Allocator allocator, com.google.android.exoplayer2.MediaSourceList mediaSourceList, com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        this.uid = mediaPeriodInfo.id.periodUid;
        this.info = mediaPeriodInfo;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new com.google.android.exoplayer2.source.SampleStream[rendererCapabilitiesArr.length];
        this.mayRetainStreamFlags = new boolean[rendererCapabilitiesArr.length];
        this.mediaPeriod = createMediaPeriod(mediaPeriodInfo.id, mediaSourceList, allocator, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.endPositionUs);
    }

    public long toRendererTime(long j) {
        return j + getRendererOffset();
    }

    public long toPeriodTime(long j) {
        return j - getRendererOffset();
    }

    public long getRendererOffset() {
        return this.rendererPositionOffsetUs;
    }

    public void setRendererOffset(long j) {
        this.rendererPositionOffsetUs = j;
    }

    public long getStartPositionRendererTime() {
        return this.info.startPositionUs + this.rendererPositionOffsetUs;
    }

    public boolean isFullyBuffered() {
        return this.prepared && (!this.hasEnabledTracks || this.mediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE);
    }

    public long getBufferedPositionUs() {
        if (!this.prepared) {
            return this.info.startPositionUs;
        }
        long bufferedPositionUs = this.hasEnabledTracks ? this.mediaPeriod.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.info.durationUs : bufferedPositionUs;
    }

    public long getNextLoadPositionUs() {
        if (this.prepared) {
            return this.mediaPeriod.getNextLoadPositionUs();
        }
        return 0L;
    }

    public void handlePrepared(float f, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks = selectTracks(f, timeline);
        long j = this.info.startPositionUs;
        if (this.info.durationUs != -9223372036854775807L && j >= this.info.durationUs) {
            j = java.lang.Math.max(0L, this.info.durationUs - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j, false);
        this.rendererPositionOffsetUs += this.info.startPositionUs - applyTrackSelection;
        this.info = this.info.copyWithStartPositionUs(applyTrackSelection);
    }

    public void reevaluateBuffer(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void continueLoading(long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(toPeriodTime(j));
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks(float f, com.google.android.exoplayer2.Timeline timeline) throws com.google.android.exoplayer2.ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.id, timeline);
        for (com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection : selectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return selectTracks;
    }

    public long applyTrackSelection(com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z) {
        return applyTrackSelection(trackSelectorResult, j, z, new boolean[this.rendererCapabilities.length]);
    }

    public long applyTrackSelection(com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= trackSelectorResult.length) {
                break;
            }
            boolean[] zArr2 = this.mayRetainStreamFlags;
            if (z || !trackSelectorResult.isEquivalent(this.trackSelectorResult, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        disassociateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        disableTrackSelectionsInResult();
        this.trackSelectorResult = trackSelectorResult;
        enableTrackSelectionsInResult();
        long selectTracks = this.mediaPeriod.selectTracks(trackSelectorResult.selections, this.mayRetainStreamFlags, this.sampleStreams, zArr, j);
        associateNoSampleRenderersWithEmptySampleStream(this.sampleStreams);
        this.hasEnabledTracks = false;
        int i2 = 0;
        while (true) {
            com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i2 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i2] != null) {
                com.google.android.exoplayer2.util.Assertions.checkState(trackSelectorResult.isRendererEnabled(i2));
                if (this.rendererCapabilities[i2].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                com.google.android.exoplayer2.util.Assertions.checkState(trackSelectorResult.selections[i2] == null);
            }
            i2++;
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public void setNext(com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public com.google.android.exoplayer2.MediaPeriodHolder getNext() {
        return this.next;
    }

    public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public com.google.android.exoplayer2.trackselection.TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void updateClipping() {
        if (this.mediaPeriod instanceof com.google.android.exoplayer2.source.ClippingMediaPeriod) {
            ((com.google.android.exoplayer2.source.ClippingMediaPeriod) this.mediaPeriod).updateClipping(0L, this.info.endPositionUs == -9223372036854775807L ? Long.MIN_VALUE : this.info.endPositionUs);
        }
    }

    private void enableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            for (int i = 0; i < this.trackSelectorResult.length; i++) {
                boolean isRendererEnabled = this.trackSelectorResult.isRendererEnabled(i);
                com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
                if (isRendererEnabled && exoTrackSelection != null) {
                    exoTrackSelection.enable();
                }
            }
        }
    }

    private void disableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            for (int i = 0; i < this.trackSelectorResult.length; i++) {
                boolean isRendererEnabled = this.trackSelectorResult.isRendererEnabled(i);
                com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
                if (isRendererEnabled && exoTrackSelection != null) {
                    exoTrackSelection.disable();
                }
            }
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2) {
                sampleStreamArr[i] = null;
            }
            i++;
        }
    }

    private void associateNoSampleRenderersWithEmptySampleStream(com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i)) {
                sampleStreamArr[i] = new com.google.android.exoplayer2.source.EmptySampleStream();
            }
            i++;
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static com.google.android.exoplayer2.source.MediaPeriod createMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.MediaSourceList mediaSourceList, com.google.android.exoplayer2.upstream.Allocator allocator, long j, long j2) {
        com.google.android.exoplayer2.source.MediaPeriod createPeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j);
        return j2 != -9223372036854775807L ? new com.google.android.exoplayer2.source.ClippingMediaPeriod(createPeriod, true, 0L, j2) : createPeriod;
    }

    private static void releaseMediaPeriod(com.google.android.exoplayer2.MediaSourceList mediaSourceList, com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof com.google.android.exoplayer2.source.ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((com.google.android.exoplayer2.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (java.lang.RuntimeException e) {
            com.google.android.exoplayer2.util.Log.e(TAG, "Period release failed.", e);
        }
    }
}
