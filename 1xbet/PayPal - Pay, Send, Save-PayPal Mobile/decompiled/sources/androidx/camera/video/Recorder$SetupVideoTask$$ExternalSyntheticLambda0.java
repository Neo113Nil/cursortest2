package androidx.camera.video;

import androidx.camera.video.Recorder.SetupVideoTask.AnonymousClass1;

/* loaded from: classes6.dex */
public final /* synthetic */ class Recorder$SetupVideoTask$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.video.Recorder.SetupVideoTask f$0;
    public final /* synthetic */ androidx.camera.core.SurfaceRequest f$1;
    public final /* synthetic */ androidx.camera.core.impl.Timebase f$2;

    public /* synthetic */ Recorder$SetupVideoTask$$ExternalSyntheticLambda0(androidx.camera.video.Recorder.SetupVideoTask setupVideoTask, androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.core.impl.Timebase timebase) {
        this.f$0 = setupVideoTask;
        this.f$1 = surfaceRequest;
        this.f$2 = timebase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r2.getInputSizeshNQ4ISI() == false) goto L29;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.camera.video.internal.encoder.EncoderFactory encoderFactory;
        java.util.concurrent.Executor executor;
        androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy;
        boolean z;
        com.google.common.util.concurrent.ListenableFuture nonCancellationPropagating;
        androidx.camera.video.Recorder.SetupVideoTask setupVideoTask = this.f$0;
        final androidx.camera.core.SurfaceRequest surfaceRequest = this.f$1;
        androidx.camera.core.impl.Timebase timebase = this.f$2;
        if (!surfaceRequest.isServiced()) {
            androidx.camera.video.VideoEncoderSession videoEncoderSession = androidx.camera.video.Recorder.this.version;
            int ordinal = videoEncoderSession.getInputFormats.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("State ");
                                sb.append(videoEncoderSession.getInputFormats);
                                sb.append(" is not handled");
                                throw new java.lang.IllegalStateException(sb.toString());
                            }
                        }
                    }
                }
                if (videoEncoderSession.getInputSizeshNQ4ISI == surfaceRequest) {
                    androidx.camera.video.Recorder.RecordingRecord recordingRecord = androidx.camera.video.Recorder.this.CoroutineDebuggingKt;
                    if (recordingRecord != null) {
                    }
                }
            }
            encoderFactory = androidx.camera.video.Recorder.this.onExtraCallbackWithResult;
            java.util.concurrent.Executor executor2 = androidx.camera.video.Recorder.this.requestGoOnline;
            executor = androidx.camera.video.Recorder.this.TransactionOutcomeDecoderExternalSyntheticLambda5;
            final androidx.camera.video.VideoEncoderSession videoEncoderSession2 = new androidx.camera.video.VideoEncoderSession(encoderFactory, executor2, executor);
            androidx.camera.video.MediaSpec mediaSpec = (androidx.camera.video.MediaSpec) androidx.camera.video.Recorder.Camera2StreamConfigurationMap(androidx.camera.video.Recorder.this.f2676a);
            androidx.camera.core.DynamicRange dynamicRange = surfaceRequest.getDynamicRange();
            videoValidatedEncoderProfilesProxy = androidx.camera.video.Recorder.this.TransactionOutcomeDecoderExternalSyntheticLambda7;
            androidx.camera.video.internal.encoder.VideoEncoderConfig resolveVideoEncoderConfig = androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoEncoderConfig(androidx.camera.video.internal.config.VideoConfigUtil.resolveVideoMimeInfo(mediaSpec, dynamicRange, videoValidatedEncoderProfilesProxy), timebase, mediaSpec.getVideoSpec(), surfaceRequest.getResolution(), dynamicRange, surfaceRequest.getExpectedFrameRate());
            z = androidx.camera.video.Recorder.this.unwrapAs;
            final androidx.camera.video.internal.encoder.VideoEncoderConfig workaroundDataSpaceIfRequired = androidx.camera.video.internal.config.VideoConfigUtil.workaroundDataSpaceIfRequired(resolveVideoEncoderConfig, z);
            androidx.camera.video.Recorder.this.onExtraCallback = workaroundDataSpaceIfRequired;
            if (videoEncoderSession2.getInputFormats.ordinal() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("configure() shouldn't be called in ");
                sb2.append(videoEncoderSession2.getInputFormats);
                nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException(sb2.toString()));
            } else {
                videoEncoderSession2.getInputFormats = androidx.camera.video.VideoEncoderSession.VideoEncoderState.INITIALIZING;
                videoEncoderSession2.getInputSizeshNQ4ISI = surfaceRequest;
                androidx.camera.core.Logger.d("VideoEncoderSession", "Create VideoEncoderSession: ".concat(java.lang.String.valueOf(videoEncoderSession2)));
                videoEncoderSession2.getHighResolutionOutputSizeshNQ4ISI = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda2
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        androidx.camera.video.VideoEncoderSession videoEncoderSession3 = androidx.camera.video.VideoEncoderSession.this;
                        videoEncoderSession3.getHighSpeedVideoSizes = completer;
                        return "ReleasedFuture ".concat(java.lang.String.valueOf(videoEncoderSession3));
                    }
                });
                videoEncoderSession2.getHighSpeedVideoFpsRangesFor = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda3
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        androidx.camera.video.VideoEncoderSession videoEncoderSession3 = androidx.camera.video.VideoEncoderSession.this;
                        videoEncoderSession3.getHighSpeedVideoFpsRanges = completer;
                        return "ReadyToReleaseFuture ".concat(java.lang.String.valueOf(videoEncoderSession3));
                    }
                });
                com.google.common.util.concurrent.ListenableFuture future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.video.VideoEncoderSession$$ExternalSyntheticLambda4
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.video.VideoEncoderSession.this.getHighSpeedVideoFpsRanges(surfaceRequest, workaroundDataSpaceIfRequired, completer);
                    }
                });
                androidx.camera.core.impl.utils.futures.Futures.addCallback(future, new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.video.internal.encoder.Encoder>() { // from class: androidx.camera.video.VideoEncoderSession.1
                    AnonymousClass1() {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public /* bridge */ /* synthetic */ void onSuccess(androidx.camera.video.internal.encoder.Encoder encoder) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th) {
                        androidx.camera.core.Logger.w("VideoEncoderSession", "VideoEncoder configuration failed.", th);
                        androidx.camera.video.VideoEncoderSession.this.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }, videoEncoderSession2.getOutputMinFrameDuration);
                nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(future);
            }
            androidx.camera.video.Recorder.this.version = videoEncoderSession2;
            androidx.camera.core.impl.utils.futures.Futures.addCallback(nonCancellationPropagating, setupVideoTask.new AnonymousClass1(videoEncoderSession2), androidx.camera.video.Recorder.this.requestGoOnline);
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Ignore the SurfaceRequest ");
        sb3.append(surfaceRequest);
        sb3.append(" isServiced: ");
        sb3.append(surfaceRequest.isServiced());
        sb3.append(" VideoEncoderSession: ");
        sb3.append(androidx.camera.video.Recorder.this.version);
        sb3.append(" has been configured with a persistent in-progress recording.");
        androidx.camera.core.Logger.w("Recorder", sb3.toString());
    }
}
