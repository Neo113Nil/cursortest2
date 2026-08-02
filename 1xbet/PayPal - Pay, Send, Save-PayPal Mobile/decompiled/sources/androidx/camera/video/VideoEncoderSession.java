package androidx.camera.video;

/* loaded from: classes6.dex */
final class VideoEncoderSession {
    private final java.util.concurrent.Executor getOutputFormats;
    final java.util.concurrent.Executor getOutputMinFrameDuration;
    private final androidx.camera.video.internal.encoder.EncoderFactory getOutputSizes;
    androidx.camera.video.internal.encoder.Encoder getHighSpeedVideoSizesFor = null;
    android.view.Surface Camera2StreamConfigurationMap = null;
    androidx.camera.core.SurfaceRequest getInputSizeshNQ4ISI = null;
    androidx.camera.video.VideoEncoderSession.VideoEncoderState getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.NOT_INITIALIZED;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Cannot close the encoder before configuring."));
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoSizes = null;
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.video.internal.encoder.Encoder> getHighSpeedVideoFpsRangesFor = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Cannot close the encoder before configuring."));
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<androidx.camera.video.internal.encoder.Encoder> getHighSpeedVideoFpsRanges = null;

    enum VideoEncoderState {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    VideoEncoderSession(androidx.camera.video.internal.encoder.EncoderFactory encoderFactory, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.getOutputFormats = executor2;
        this.getOutputMinFrameDuration = executor;
        this.getOutputSizes = encoderFactory;
    }

    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.video.internal.encoder.VideoEncoderConfig videoEncoderConfig, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        try {
            androidx.camera.video.internal.encoder.Encoder createEncoder = this.getOutputSizes.createEncoder(this.getOutputFormats, videoEncoderConfig, surfaceRequest.getSessionType());
            this.getHighSpeedVideoSizesFor = createEncoder;
            if (!(createEncoder.getInput() instanceof androidx.camera.video.internal.encoder.Encoder.SurfaceInput)) {
                completer.setException(new java.lang.AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                android.view.Surface surface = ((androidx.camera.video.internal.encoder.Encoder.SurfaceInput) this.getHighSpeedVideoSizesFor.getInput()).getSurface();
                this.Camera2StreamConfigurationMap = surface;
                androidx.camera.core.Logger.d("VideoEncoderSession", "provide surface: ".concat(java.lang.String.valueOf(surface)));
                surfaceRequest.provideSurface(surface, this.getOutputMinFrameDuration, new androidx.core.util.Consumer() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.video.VideoEncoderSession videoEncoderSession = androidx.camera.video.VideoEncoderSession.this;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Surface can be closed: ");
                        sb.append(((androidx.camera.core.SurfaceRequest.Result) obj).getSurface());
                        androidx.camera.core.Logger.d("VideoEncoderSession", sb.toString());
                        videoEncoderSession.Camera2StreamConfigurationMap = null;
                        videoEncoderSession.getHighSpeedVideoFpsRanges.set(videoEncoderSession.getHighSpeedVideoSizesFor);
                        videoEncoderSession.getHighSpeedVideoSizes();
                    }
                });
                this.getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.READY;
                completer.set(this.getHighSpeedVideoSizesFor);
            }
        } catch (androidx.camera.video.internal.encoder.InvalidConfigException e) {
            androidx.camera.core.Logger.e("VideoEncoderSession", "Unable to initialize video encoder.", e);
            completer.setException(e);
        }
        return "ConfigureVideoEncoderFuture ".concat(java.lang.String.valueOf(this));
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        int ordinal = this.getInputFormats.ordinal();
        if (ordinal == 0) {
            this.getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED;
            return;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            if (ordinal == 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("terminateNow in ");
                sb.append(this.getInputFormats);
                sb.append(", No-op");
                androidx.camera.core.Logger.d("VideoEncoderSession", sb.toString());
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("State ");
            sb2.append(this.getInputFormats);
            sb2.append(" is not handled");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        this.getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.RELEASED;
        this.getHighSpeedVideoFpsRanges.set(this.getHighSpeedVideoSizesFor);
        this.getInputSizeshNQ4ISI = null;
        if (this.getHighSpeedVideoSizesFor != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("VideoEncoder is releasing: ");
            sb3.append(this.getHighSpeedVideoSizesFor);
            androidx.camera.core.Logger.d("VideoEncoderSession", sb3.toString());
            this.getHighSpeedVideoSizesFor.release();
            this.getHighSpeedVideoSizesFor.getReleasedFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.video.VideoEncoderSession.this.getHighSpeedVideoSizes.set(null);
                }
            }, this.getOutputMinFrameDuration);
            this.getHighSpeedVideoSizesFor = null;
            return;
        }
        androidx.camera.core.Logger.w("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
        this.getHighSpeedVideoSizes.set(null);
    }

    final void getHighSpeedVideoSizes() {
        int ordinal = this.getInputFormats.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        if (ordinal == 2 || ordinal == 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("closeInternal in ");
            sb.append(this.getInputFormats);
            sb.append(" state");
            androidx.camera.core.Logger.d("VideoEncoderSession", sb.toString());
            this.getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.PENDING_RELEASE;
            return;
        }
        if (ordinal == 4) {
            androidx.camera.core.Logger.d("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("State ");
        sb2.append(this.getInputFormats);
        sb2.append(" is not handled");
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoEncoderSession@");
        sb.append(hashCode());
        sb.append(" for ");
        sb.append(java.util.Objects.toString(this.getInputSizeshNQ4ISI, "SURFACE_REQUEST_NOT_CONFIGURED"));
        return sb.toString();
    }
}
