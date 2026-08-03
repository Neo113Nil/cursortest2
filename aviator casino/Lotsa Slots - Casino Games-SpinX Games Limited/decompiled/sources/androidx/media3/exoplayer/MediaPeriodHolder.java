package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
final class MediaPeriodHolder {
    private static final java.lang.String TAG = "MediaPeriodHolder";
    public boolean allRenderersInCorrectState;
    public boolean hasEnabledTracks;
    public androidx.media3.exoplayer.MediaPeriodInfo info;
    private final boolean[] mayRetainStreamFlags;
    public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private final androidx.media3.exoplayer.MediaSourceList mediaSourceList;
    private androidx.media3.exoplayer.MediaPeriodHolder next;
    public boolean prepared;
    private final androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilities;
    private long rendererPositionOffsetUs;
    public final androidx.media3.exoplayer.source.SampleStream[] sampleStreams;
    private androidx.media3.exoplayer.source.TrackGroupArray trackGroups = androidx.media3.exoplayer.source.TrackGroupArray.EMPTY;
    private final androidx.media3.exoplayer.trackselection.TrackSelector trackSelector;
    private androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult;
    public final java.lang.Object uid;

    interface Factory {
        androidx.media3.exoplayer.MediaPeriodHolder create(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, long j);
    }

    public MediaPeriodHolder(androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr, long j, androidx.media3.exoplayer.trackselection.TrackSelector trackSelector, androidx.media3.exoplayer.upstream.Allocator allocator, androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult) {
        this.rendererCapabilities = rendererCapabilitiesArr;
        this.rendererPositionOffsetUs = j;
        this.trackSelector = trackSelector;
        this.mediaSourceList = mediaSourceList;
        this.uid = mediaPeriodInfo.id.periodUid;
        this.info = mediaPeriodInfo;
        this.trackSelectorResult = trackSelectorResult;
        this.sampleStreams = new androidx.media3.exoplayer.source.SampleStream[rendererCapabilitiesArr.length];
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

    public void handlePrepared(float f, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException {
        this.prepared = true;
        this.trackGroups = this.mediaPeriod.getTrackGroups();
        androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks = selectTracks(f, timeline);
        long j = this.info.startPositionUs;
        if (this.info.durationUs != -9223372036854775807L && j >= this.info.durationUs) {
            j = java.lang.Math.max(0L, this.info.durationUs - 1);
        }
        long applyTrackSelection = applyTrackSelection(selectTracks, j, false);
        this.rendererPositionOffsetUs += this.info.startPositionUs - applyTrackSelection;
        this.info = this.info.copyWithStartPositionUs(applyTrackSelection);
    }

    public void reevaluateBuffer(long j) {
        androidx.media3.common.util.Assertions.checkState(isLoadingMediaPeriod());
        if (this.prepared) {
            this.mediaPeriod.reevaluateBuffer(toPeriodTime(j));
        }
    }

    public void continueLoading(long j, float f, long j2) {
        androidx.media3.common.util.Assertions.checkState(isLoadingMediaPeriod());
        this.mediaPeriod.continueLoading(new androidx.media3.exoplayer.LoadingInfo.Builder().setPlaybackPositionUs(toPeriodTime(j)).setPlaybackSpeed(f).setLastRebufferRealtimeMs(j2).build());
    }

    public androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks(float f, androidx.media3.common.Timeline timeline) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.trackselection.TrackSelectorResult selectTracks = this.trackSelector.selectTracks(this.rendererCapabilities, getTrackGroups(), this.info.id, timeline);
        for (int i = 0; i < selectTracks.length; i++) {
            if (selectTracks.isRendererEnabled(i)) {
                if (selectTracks.selections[i] == null && this.rendererCapabilities[i].getTrackType() != -2) {
                    r3 = false;
                }
                androidx.media3.common.util.Assertions.checkState(r3);
            } else {
                androidx.media3.common.util.Assertions.checkState(selectTracks.selections[i] == null);
            }
        }
        for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : selectTracks.selections) {
            if (exoTrackSelection != null) {
                exoTrackSelection.onPlaybackSpeed(f);
            }
        }
        return selectTracks;
    }

    public long applyTrackSelection(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z) {
        return applyTrackSelection(trackSelectorResult, j, z, new boolean[this.rendererCapabilities.length]);
    }

    public long applyTrackSelection(androidx.media3.exoplayer.trackselection.TrackSelectorResult trackSelectorResult, long j, boolean z, boolean[] zArr) {
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
            androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr = this.sampleStreams;
            if (i2 >= sampleStreamArr.length) {
                return selectTracks;
            }
            if (sampleStreamArr[i2] != null) {
                androidx.media3.common.util.Assertions.checkState(trackSelectorResult.isRendererEnabled(i2));
                if (this.rendererCapabilities[i2].getTrackType() != -2) {
                    this.hasEnabledTracks = true;
                }
            } else {
                androidx.media3.common.util.Assertions.checkState(trackSelectorResult.selections[i2] == null);
            }
            i2++;
        }
    }

    public void release() {
        disableTrackSelectionsInResult();
        releaseMediaPeriod(this.mediaSourceList, this.mediaPeriod);
    }

    public void setNext(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == this.next) {
            return;
        }
        disableTrackSelectionsInResult();
        this.next = mediaPeriodHolder;
        enableTrackSelectionsInResult();
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getNext() {
        return this.next;
    }

    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.trackGroups;
    }

    public androidx.media3.exoplayer.trackselection.TrackSelectorResult getTrackSelectorResult() {
        return this.trackSelectorResult;
    }

    public void updateClipping() {
        if (this.mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
            ((androidx.media3.exoplayer.source.ClippingMediaPeriod) this.mediaPeriod).updateClipping(0L, this.info.endPositionUs == -9223372036854775807L ? Long.MIN_VALUE : this.info.endPositionUs);
        }
    }

    public boolean hasLoadingError() {
        try {
            if (!this.prepared) {
                this.mediaPeriod.maybeThrowPrepareError();
            } else {
                for (androidx.media3.exoplayer.source.SampleStream sampleStream : this.sampleStreams) {
                    if (sampleStream != null) {
                        sampleStream.maybeThrowError();
                    }
                }
            }
            return false;
        } catch (java.io.IOException unused) {
            return true;
        }
    }

    private void enableTrackSelectionsInResult() {
        if (isLoadingMediaPeriod()) {
            for (int i = 0; i < this.trackSelectorResult.length; i++) {
                boolean isRendererEnabled = this.trackSelectorResult.isRendererEnabled(i);
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
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
                androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection = this.trackSelectorResult.selections[i];
                if (isRendererEnabled && exoTrackSelection != null) {
                    exoTrackSelection.disable();
                }
            }
        }
    }

    private void disassociateNoSampleRenderersWithEmptySampleStream(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2) {
                sampleStreamArr[i] = null;
            }
            i++;
        }
    }

    private void associateNoSampleRenderersWithEmptySampleStream(androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr) {
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = this.rendererCapabilities;
            if (i >= rendererCapabilitiesArr.length) {
                return;
            }
            if (rendererCapabilitiesArr[i].getTrackType() == -2 && this.trackSelectorResult.isRendererEnabled(i)) {
                sampleStreamArr[i] = new androidx.media3.exoplayer.source.EmptySampleStream();
            }
            i++;
        }
    }

    private boolean isLoadingMediaPeriod() {
        return this.next == null;
    }

    private static androidx.media3.exoplayer.source.MediaPeriod createMediaPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.upstream.Allocator allocator, long j, long j2) {
        androidx.media3.exoplayer.source.MediaPeriod createPeriod = mediaSourceList.createPeriod(mediaPeriodId, allocator, j);
        return j2 != -9223372036854775807L ? new androidx.media3.exoplayer.source.ClippingMediaPeriod(createPeriod, true, 0L, j2) : createPeriod;
    }

    private static void releaseMediaPeriod(androidx.media3.exoplayer.MediaSourceList mediaSourceList, androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        try {
            if (mediaPeriod instanceof androidx.media3.exoplayer.source.ClippingMediaPeriod) {
                mediaSourceList.releasePeriod(((androidx.media3.exoplayer.source.ClippingMediaPeriod) mediaPeriod).mediaPeriod);
            } else {
                mediaSourceList.releasePeriod(mediaPeriod);
            }
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.e(TAG, "Period release failed.", e);
        }
    }

    public boolean canBeUsedForMediaPeriodInfo(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        return androidx.media3.exoplayer.MediaPeriodQueue.areDurationsCompatible(this.info.durationUs, mediaPeriodInfo.durationUs) && this.info.startPositionUs == mediaPeriodInfo.startPositionUs && this.info.id.equals(mediaPeriodInfo.id);
    }
}
