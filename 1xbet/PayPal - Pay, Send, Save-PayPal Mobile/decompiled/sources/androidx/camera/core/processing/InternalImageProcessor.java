package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class InternalImageProcessor {
    final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.ImageProcessor getHighSpeedVideoFpsRanges;
    final androidx.core.util.Consumer<java.lang.Throwable> getHighSpeedVideoSizes;

    public InternalImageProcessor(androidx.camera.core.CameraEffect cameraEffect) {
        androidx.core.util.Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.getHighResolutionOutputSizeshNQ4ISI = cameraEffect.getExecutor();
        this.getHighSpeedVideoFpsRanges = (androidx.camera.core.ImageProcessor) java.util.Objects.requireNonNull(cameraEffect.getImageProcessor());
        this.getHighSpeedVideoSizes = cameraEffect.getErrorListener();
    }

    public androidx.camera.core.ImageProcessor.Response safeProcess(final androidx.camera.core.ImageProcessor.Request request) throws androidx.camera.core.ImageCaptureException {
        try {
            return (androidx.camera.core.ImageProcessor.Response) androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.InternalImageProcessor$$ExternalSyntheticLambda1
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.core.processing.InternalImageProcessor internalImageProcessor = androidx.camera.core.processing.InternalImageProcessor.this;
                    final androidx.camera.core.ImageProcessor.Request request2 = request;
                    internalImageProcessor.getHighResolutionOutputSizeshNQ4ISI.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.InternalImageProcessor$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.processing.InternalImageProcessor internalImageProcessor2 = androidx.camera.core.processing.InternalImageProcessor.this;
                            androidx.camera.core.ImageProcessor.Request request3 = request2;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                            try {
                                completer2.set(internalImageProcessor2.getHighSpeedVideoFpsRanges.process(request3));
                            } catch (androidx.camera.core.ProcessingException e) {
                                internalImageProcessor2.getHighSpeedVideoSizes.accept(e);
                                completer2.setException(e);
                            }
                        }
                    });
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("InternalImageProcessor#process ");
                    sb.append(request2.hashCode());
                    return sb.toString();
                }
            }).get();
        } catch (java.lang.Exception e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new androidx.camera.core.ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
