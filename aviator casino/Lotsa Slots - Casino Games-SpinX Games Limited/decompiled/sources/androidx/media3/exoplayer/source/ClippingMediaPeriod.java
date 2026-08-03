package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public final class ClippingMediaPeriod implements androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.MediaPeriod.Callback {
    private androidx.media3.exoplayer.source.MediaPeriod.Callback callback;
    private androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException clippingError;
    long endUs;
    public final androidx.media3.exoplayer.source.MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream[] sampleStreams = new androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream[0];
    long startUs;

    public ClippingMediaPeriod(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, boolean z, long j, long j2) {
        this.mediaPeriod = mediaPeriod;
        this.pendingInitialDiscontinuityPositionUs = z ? j : -9223372036854775807L;
        this.startUs = j;
        this.endUs = j2;
    }

    public void updateClipping(long j, long j2) {
        this.startUs = j;
        this.endUs = j2;
    }

    public void setClippingError(androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(androidx.media3.exoplayer.source.MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() throws java.io.IOException {
        androidx.media3.exoplayer.source.ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public java.util.List<androidx.media3.common.StreamKey> getStreamKeys(java.util.List<androidx.media3.exoplayer.trackselection.ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public androidx.media3.exoplayer.source.TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.sampleStreams = new androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream[sampleStreamArr.length];
        androidx.media3.exoplayer.source.SampleStream[] sampleStreamArr2 = new androidx.media3.exoplayer.source.SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.source.SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream clippingSampleStream = (androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream) sampleStreamArr[i];
            clippingSampleStreamArr[i] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.childStream;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long selectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j);
        if (isPendingInitialDiscontinuity()) {
            long j3 = this.startUs;
            if (j == j3 && shouldKeepInitialDiscontinuity(j3, exoTrackSelectionArr)) {
                j2 = selectTracks;
                this.pendingInitialDiscontinuityPositionUs = j2;
                if (selectTracks != j) {
                    if (selectTracks >= this.startUs) {
                        long j4 = this.endUs;
                        if (j4 != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    androidx.media3.common.util.Assertions.checkState(z);
                    for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
                        if (sampleStreamArr2[i2] == null) {
                            this.sampleStreams[i2] = null;
                        } else {
                            androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream clippingSampleStream2 = this.sampleStreams[i2];
                            if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStreamArr2[i2]) {
                                this.sampleStreams[i2] = new androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream(sampleStreamArr2[i2]);
                            }
                        }
                        sampleStreamArr[i2] = this.sampleStreams[i2];
                    }
                    return selectTracks;
                }
                z = true;
                androidx.media3.common.util.Assertions.checkState(z);
                while (i2 < sampleStreamArr.length) {
                }
                return selectTracks;
            }
        }
        j2 = -9223372036854775807L;
        this.pendingInitialDiscontinuityPositionUs = j2;
        if (selectTracks != j) {
        }
        z = true;
        androidx.media3.common.util.Assertions.checkState(z);
        while (i2 < sampleStreamArr.length) {
        }
        return selectTracks;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            long j = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        androidx.media3.common.util.Assertions.checkState(readDiscontinuity2 >= this.startUs);
        long j2 = this.endUs;
        if (j2 != Long.MIN_VALUE && readDiscontinuity2 > j2) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkState(z);
        return readDiscontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long seekToUs(long j) {
        this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
        boolean z = false;
        for (androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        long seekToUs = this.mediaPeriod.seekToUs(j);
        if (seekToUs != j) {
            if (seekToUs >= this.startUs) {
                long j2 = this.endUs;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            androidx.media3.common.util.Assertions.checkState(z);
            return seekToUs;
        }
        z = true;
        androidx.media3.common.util.Assertions.checkState(z);
        return seekToUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        long j2 = this.startUs;
        if (j == j2) {
            return j2;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j, clipSeekParameters(j, seekParameters));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        ((androidx.media3.exoplayer.source.MediaPeriod.Callback) androidx.media3.common.util.Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != -9223372036854775807L;
    }

    private androidx.media3.exoplayer.SeekParameters clipSeekParameters(long j, androidx.media3.exoplayer.SeekParameters seekParameters) {
        long constrainValue = androidx.media3.common.util.Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j - this.startUs);
        long j2 = seekParameters.toleranceAfterUs;
        long j3 = this.endUs;
        long constrainValue2 = androidx.media3.common.util.Util.constrainValue(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (constrainValue == seekParameters.toleranceBeforeUs && constrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new androidx.media3.exoplayer.SeekParameters(constrainValue, constrainValue2);
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
        if (j != 0) {
            for (androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    androidx.media3.common.Format selectedFormat = exoTrackSelection.getSelectedFormat();
                    if (!androidx.media3.common.MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final class ClippingSampleStream implements androidx.media3.exoplayer.source.SampleStream {
        public final androidx.media3.exoplayer.source.SampleStream childStream;
        private boolean sentEos;

        public ClippingSampleStream(androidx.media3.exoplayer.source.SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !androidx.media3.exoplayer.source.ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            this.childStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            if (androidx.media3.exoplayer.source.ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = androidx.media3.exoplayer.source.ClippingMediaPeriod.this.getBufferedPositionUs();
            int readData = this.childStream.readData(formatHolder, decoderInputBuffer, i);
            if (readData == -5) {
                androidx.media3.common.Format format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format);
                if (format.encoderDelay != 0 || format.encoderPadding != 0) {
                    formatHolder.format = format.buildUpon().setEncoderDelay(androidx.media3.exoplayer.source.ClippingMediaPeriod.this.startUs != 0 ? 0 : format.encoderDelay).setEncoderPadding(androidx.media3.exoplayer.source.ClippingMediaPeriod.this.endUs == Long.MIN_VALUE ? format.encoderPadding : 0).build();
                }
                return -5;
            }
            if (androidx.media3.exoplayer.source.ClippingMediaPeriod.this.endUs == Long.MIN_VALUE || ((readData != -4 || decoderInputBuffer.timeUs < androidx.media3.exoplayer.source.ClippingMediaPeriod.this.endUs) && !(readData == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return readData;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            if (androidx.media3.exoplayer.source.ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j);
        }
    }
}
