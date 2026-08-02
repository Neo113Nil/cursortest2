package androidx.camera.core;

/* loaded from: classes6.dex */
public final class SurfaceRequest {
    public static final android.util.Range<java.lang.Integer> FRAME_RATE_RANGE_UNSPECIFIED = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
    private final android.util.Range<java.lang.Integer> Camera2StreamConfigurationMap;
    private final androidx.camera.core.DynamicRange getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.DeferrableSurface getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.CameraInternal getHighSpeedVideoFpsRangesFor;
    final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> getHighSpeedVideoSizes;
    private final java.lang.Object getHighSpeedVideoSizesFor;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getInputFormats;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInputSizeshNQ4ISI;
    private final android.util.Size getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getOutputMinFrameDurationlomOqCM;
    private androidx.camera.core.SurfaceRequest.TransformationInfo getOutputSizes;
    private java.util.concurrent.Executor getOutputSizeshNQ4ISI;
    private final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.view.Surface> getOutputStallDuration;
    private final int getOutputStallDurationlomOqCM;
    private androidx.camera.core.SurfaceRequest.TransformationInfoListener toString;

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo);
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, java.lang.Runnable runnable) {
        this(size, cameraInternal, androidx.camera.core.DynamicRange.SDR, FRAME_RATE_RANGE_UNSPECIFIED, runnable);
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range, java.lang.Runnable runnable) {
        this(size, cameraInternal, true, dynamicRange, 0, range, runnable);
    }

    public SurfaceRequest(android.util.Size size, androidx.camera.core.impl.CameraInternal cameraInternal, boolean z, androidx.camera.core.DynamicRange dynamicRange, int i, android.util.Range<java.lang.Integer> range, final java.lang.Runnable runnable) {
        this.getHighSpeedVideoSizesFor = new java.lang.Object();
        this.getOutputFormats = size;
        this.getHighSpeedVideoFpsRangesFor = cameraInternal;
        this.getOutputMinFrameDuration = z;
        androidx.core.util.Preconditions.checkArgument(dynamicRange.isFullySpecified(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicRange;
        this.getOutputStallDurationlomOqCM = i;
        this.Camera2StreamConfigurationMap = range;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceRequest[size: ");
        sb.append(size);
        sb.append(", id: ");
        sb.append(hashCode());
        sb.append("]");
        final java.lang.String obj = sb.toString();
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(null);
        final com.google.common.util.concurrent.ListenableFuture future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda6
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.SurfaceRequest.getHighSpeedVideoFpsRanges(atomicReference, obj, completer);
            }
        });
        final androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference.get());
        this.getInputFormats = completer;
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference(null);
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda7
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2) {
                return androidx.camera.core.SurfaceRequest.getHighSpeedVideoSizes(atomicReference2, obj, completer2);
            }
        });
        this.getInputSizeshNQ4ISI = future2;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(future2, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.lang.Void r2) {
                androidx.core.util.Preconditions.checkState(completer.set(null));
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (th instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException) {
                    androidx.core.util.Preconditions.checkState(future.cancel(false));
                } else {
                    androidx.core.util.Preconditions.checkState(completer.set(null));
                }
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference2.get());
        final java.util.concurrent.atomic.AtomicReference atomicReference3 = new java.util.concurrent.atomic.AtomicReference(null);
        com.google.common.util.concurrent.ListenableFuture<android.view.Surface> future3 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda8
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3) {
                return androidx.camera.core.SurfaceRequest.getHighSpeedVideoFpsRangesFor(atomicReference3, obj, completer3);
            }
        });
        this.getHighSpeedVideoSizes = future3;
        this.getOutputStallDuration = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference3.get());
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = new androidx.camera.core.impl.DeferrableSurface(size) { // from class: androidx.camera.core.SurfaceRequest.2
            @Override // androidx.camera.core.impl.DeferrableSurface
            public com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
                return androidx.camera.core.SurfaceRequest.this.getHighSpeedVideoSizes;
            }
        };
        this.getHighSpeedVideoFpsRanges = deferrableSurface;
        final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> terminationFuture = deferrableSurface.getTerminationFuture();
        androidx.camera.core.impl.utils.futures.Futures.addCallback(future3, new androidx.camera.core.impl.utils.futures.FutureCallback<android.view.Surface>() { // from class: androidx.camera.core.SurfaceRequest.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(android.view.Surface surface) {
                androidx.camera.core.impl.utils.futures.Futures.propagate(terminationFuture, completer2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (th instanceof java.util.concurrent.CancellationException) {
                    androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3 = completer2;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(obj);
                    sb2.append(" cancelled.");
                    androidx.core.util.Preconditions.checkState(completer3.setException(new androidx.camera.core.SurfaceRequest.RequestCancelledException(sb2.toString(), th)));
                    return;
                }
                completer2.set(null);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SurfaceRequest.this.getHighSpeedVideoSizes.cancel(true);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        java.util.concurrent.Executor directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
        final java.util.concurrent.atomic.AtomicReference atomicReference4 = new java.util.concurrent.atomic.AtomicReference(null);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3) {
                androidx.camera.core.SurfaceRequest surfaceRequest = androidx.camera.core.SurfaceRequest.this;
                atomicReference4.set(completer3);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SurfaceRequest-surface-recreation(");
                sb2.append(surfaceRequest.hashCode());
                sb2.append(")");
                return sb2.toString();
            }
        }), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.5
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.lang.Void r1) {
                runnable.run();
            }
        }, directExecutor);
        this.getOutputMinFrameDurationlomOqCM = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) androidx.core.util.Preconditions.checkNotNull((androidx.concurrent.futures.CallbackToFutureAdapter.Completer) atomicReference4.get());
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-cancellation");
        return sb.toString();
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoSizes(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-status");
        return sb.toString();
    }

    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        atomicReference.set(completer);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("-Surface");
        return sb.toString();
    }

    public final androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isServiced() {
        return this.getHighSpeedVideoSizes.isDone();
    }

    public final android.util.Size getResolution() {
        return this.getOutputFormats;
    }

    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getSessionType() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final android.util.Range<java.lang.Integer> getExpectedFrameRate() {
        return this.Camera2StreamConfigurationMap;
    }

    public final androidx.camera.core.impl.CameraInternal getCamera() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isPrimary() {
        return this.getOutputMinFrameDuration;
    }

    public final void provideSurface(final android.view.Surface surface, java.util.concurrent.Executor executor, final androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.Result> consumer) {
        if (!surface.isValid()) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(androidx.camera.core.SurfaceRequest.Result.getHighSpeedVideoSizes(2, surface));
                }
            });
            return;
        }
        if (this.getOutputStallDuration.set(surface) || this.getHighSpeedVideoSizes.isCancelled()) {
            androidx.camera.core.impl.utils.futures.Futures.addCallback(this.getInputSizeshNQ4ISI, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.SurfaceRequest.4
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public /* synthetic */ void onSuccess(java.lang.Void r3) {
                    consumer.accept(androidx.camera.core.SurfaceRequest.Result.getHighSpeedVideoSizes(0, surface));
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th) {
                    androidx.core.util.Preconditions.checkState(th instanceof androidx.camera.core.SurfaceRequest.RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n".concat(java.lang.String.valueOf(th)));
                    consumer.accept(androidx.camera.core.SurfaceRequest.Result.getHighSpeedVideoSizes(1, surface));
                }
            }, executor);
            return;
        }
        androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoSizes.isDone());
        try {
            this.getHighSpeedVideoSizes.get();
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(androidx.camera.core.SurfaceRequest.Result.getHighSpeedVideoSizes(3, surface));
                }
            });
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(androidx.camera.core.SurfaceRequest.Result.getHighSpeedVideoSizes(4, surface));
                }
            });
        }
    }

    public final boolean willNotProvideSurface() {
        return this.getOutputStallDuration.setException(new androidx.camera.core.impl.DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public final boolean invalidate() {
        willNotProvideSurface();
        return this.getOutputMinFrameDurationlomOqCM.set(null);
    }

    public final void addRequestCancellationListener(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        this.getInputFormats.addCancellationListener(runnable, executor);
    }

    public final void updateTransformationInfo(final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        final androidx.camera.core.SurfaceRequest.TransformationInfoListener transformationInfoListener;
        java.util.concurrent.Executor executor;
        synchronized (this.getHighSpeedVideoSizesFor) {
            this.getOutputSizes = transformationInfo;
            transformationInfoListener = this.toString;
            executor = this.getOutputSizeshNQ4ISI;
        }
        if (transformationInfoListener == null || executor == null) {
            return;
        }
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
            }
        });
    }

    public final void setTransformationInfoListener(java.util.concurrent.Executor executor, final androidx.camera.core.SurfaceRequest.TransformationInfoListener transformationInfoListener) {
        final androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo;
        synchronized (this.getHighSpeedVideoSizesFor) {
            this.toString = transformationInfoListener;
            this.getOutputSizeshNQ4ISI = executor;
            transformationInfo = this.getOutputSizes;
        }
        if (transformationInfo != null) {
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.SurfaceRequest$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.SurfaceRequest.TransformationInfoListener.this.onTransformationInfoUpdate(transformationInfo);
                }
            });
        }
    }

    public final void clearTransformationInfoListener() {
        synchronized (this.getHighSpeedVideoSizesFor) {
            this.toString = null;
            this.getOutputSizeshNQ4ISI = null;
        }
    }

    static final class RequestCancelledException extends java.lang.RuntimeException {
        RequestCancelledException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }

    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface ResultCode {
        }

        public abstract int getResultCode();

        public abstract android.view.Surface getSurface();

        static androidx.camera.core.SurfaceRequest.Result getHighSpeedVideoSizes(int i, android.view.Surface surface) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_Result(i, surface);
        }

        Result() {
        }
    }

    public static abstract class TransformationInfo {
        public abstract android.graphics.Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract android.graphics.Matrix getSensorToBufferTransform();

        public abstract int getTargetRotation();

        public abstract boolean hasCameraTransform();

        public abstract boolean isMirroring();

        public static androidx.camera.core.SurfaceRequest.TransformationInfo of(android.graphics.Rect rect, int i, int i2, boolean z, android.graphics.Matrix matrix, boolean z2) {
            return new androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo(rect, i, i2, z, matrix, z2);
        }

        TransformationInfo() {
        }
    }
}
