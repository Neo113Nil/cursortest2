package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class SurfaceEdge {
    int Camera2StreamConfigurationMap;
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;
    private androidx.camera.core.SurfaceRequest getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private final boolean getOutputMinFrameDuration;
    private final android.graphics.Matrix getOutputSizes;
    private final androidx.camera.core.impl.StreamSpec getOutputSizeshNQ4ISI;
    private final int getOutputStallDuration;
    private androidx.camera.core.processing.SurfaceEdge.SettableSurface getOutputStallDurationlomOqCM;
    private boolean getHighSpeedVideoSizesFor = false;
    private final java.util.Set<java.lang.Runnable> getOutputFormats = new java.util.HashSet();
    boolean getHighSpeedVideoFpsRangesFor = false;
    private final java.util.List<androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.TransformationInfo>> getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();

    public SurfaceEdge(int i, int i2, androidx.camera.core.impl.StreamSpec streamSpec, android.graphics.Matrix matrix, boolean z, android.graphics.Rect rect, int i3, int i4, boolean z2) {
        this.getOutputStallDuration = i;
        this.getHighSpeedVideoSizes = i2;
        this.getOutputSizeshNQ4ISI = streamSpec;
        this.getOutputSizes = matrix;
        this.getInputSizeshNQ4ISI = z;
        this.getHighResolutionOutputSizeshNQ4ISI = rect;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRanges = i4;
        this.getOutputMinFrameDuration = z2;
        this.getOutputStallDurationlomOqCM = new androidx.camera.core.processing.SurfaceEdge.SettableSurface(streamSpec.getResolution(), i2);
    }

    public void addOnInvalidatedListener(java.lang.Runnable runnable) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        this.getOutputFormats.add(runnable);
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoSizesFor, "Consumer can only be linked once.");
        this.getHighSpeedVideoSizesFor = true;
        return this.getOutputStallDurationlomOqCM;
    }

    public void setProvider(androidx.camera.core.impl.DeferrableSurface deferrableSurface) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.getOutputStallDurationlomOqCM;
        java.util.Objects.requireNonNull(settableSurface);
        settableSurface.getHighSpeedVideoFpsRanges(deferrableSurface, new androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda2(settableSurface));
    }

    public androidx.camera.core.SurfaceRequest createSurfaceRequest(androidx.camera.core.impl.CameraInternal cameraInternal) {
        return createSurfaceRequest(cameraInternal, true);
    }

    public androidx.camera.core.SurfaceRequest createSurfaceRequest(androidx.camera.core.impl.CameraInternal cameraInternal, boolean z) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        androidx.camera.core.SurfaceRequest surfaceRequest = new androidx.camera.core.SurfaceRequest(this.getOutputSizeshNQ4ISI.getResolution(), cameraInternal, z, this.getOutputSizeshNQ4ISI.getDynamicRange(), this.getOutputSizeshNQ4ISI.getSessionType(), this.getOutputSizeshNQ4ISI.getExpectedFrameRateRange(), new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.camera.core.processing.SurfaceEdge surfaceEdge = androidx.camera.core.processing.SurfaceEdge.this;
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.processing.SurfaceEdge surfaceEdge2 = androidx.camera.core.processing.SurfaceEdge.this;
                        if (surfaceEdge2.getHighSpeedVideoFpsRangesFor) {
                            return;
                        }
                        surfaceEdge2.invalidate();
                    }
                });
            }
        });
        try {
            final androidx.camera.core.impl.DeferrableSurface deferrableSurface = surfaceRequest.getDeferrableSurface();
            androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.getOutputStallDurationlomOqCM;
            java.util.Objects.requireNonNull(settableSurface);
            if (settableSurface.getHighSpeedVideoFpsRanges(deferrableSurface, new androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda2(settableSurface))) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> terminationFuture = settableSurface.getTerminationFuture();
                java.util.Objects.requireNonNull(deferrableSurface);
                terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.DeferrableSurface.this.close();
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
            this.getInputFormats = surfaceRequest;
            Camera2StreamConfigurationMap();
            return surfaceRequest;
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
            throw new java.lang.AssertionError("Surface is somehow already closed", e);
        } catch (java.lang.RuntimeException e2) {
            surfaceRequest.willNotProvideSurface();
            throw e2;
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceOutput> createSurfaceOutputFuture(final int i, final androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, final androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoSizesFor, "Consumer can only be linked once.");
        this.getHighSpeedVideoSizesFor = true;
        final androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.getOutputStallDurationlomOqCM;
        return androidx.camera.core.impl.utils.futures.Futures.transformAsync(settableSurface.getSurface(), new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return androidx.camera.core.processing.SurfaceEdge.this.getHighResolutionOutputSizeshNQ4ISI(settableSurface, i, cameraInputInfo, cameraInputInfo2, (android.view.Surface) obj);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture getHighResolutionOutputSizeshNQ4ISI(final androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface, int i, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2, android.view.Surface surface) throws java.lang.Exception {
        androidx.core.util.Preconditions.checkNotNull(surface);
        try {
            settableSurface.incrementUseCount();
            androidx.camera.core.processing.SurfaceOutputImpl surfaceOutputImpl = new androidx.camera.core.processing.SurfaceOutputImpl(surface, getTargets(), i, this.getOutputSizeshNQ4ISI.getResolution(), cameraInputInfo, cameraInputInfo2, this.getOutputSizes);
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = surfaceOutputImpl.getHighSpeedVideoFpsRangesFor;
            java.util.Objects.requireNonNull(settableSurface);
            listenableFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceEdge.SettableSurface.this.decrementUseCount();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            androidx.core.util.Preconditions.checkState(settableSurface.getHighSpeedVideoSizesFor == null, "Consumer can only be linked once.");
            settableSurface.getHighSpeedVideoSizesFor = surfaceOutputImpl;
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(surfaceOutputImpl);
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e);
        }
    }

    public void invalidate() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = this.getOutputStallDurationlomOqCM;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (settableSurface.getInputFormats != null || settableSurface.isClosed()) {
            this.getHighSpeedVideoSizesFor = false;
            this.getOutputStallDurationlomOqCM.close();
            this.getOutputStallDurationlomOqCM = new androidx.camera.core.processing.SurfaceEdge.SettableSurface(this.getOutputSizeshNQ4ISI.getResolution(), this.getHighSpeedVideoSizes);
            java.util.Iterator<java.lang.Runnable> it = this.getOutputFormats.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }
    }

    public final void close() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputStallDurationlomOqCM.close();
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputMinFrameDurationlomOqCM.clear();
        this.getOutputFormats.clear();
    }

    public final void disconnect() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRangesFor, "Edge is already closed.");
        this.getOutputStallDurationlomOqCM.close();
    }

    public int getTargets() {
        return this.getOutputStallDuration;
    }

    public int getFormat() {
        return this.getHighSpeedVideoSizes;
    }

    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.getOutputSizes;
    }

    public boolean hasCameraTransform() {
        return this.getInputSizeshNQ4ISI;
    }

    public android.graphics.Rect getCropRect() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getRotationDegrees() {
        return this.Camera2StreamConfigurationMap;
    }

    public void updateTransformation(int i) {
        updateTransformation(i, -1);
    }

    public void updateTransformation(final int i, final int i2) {
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                androidx.camera.core.processing.SurfaceEdge surfaceEdge = androidx.camera.core.processing.SurfaceEdge.this;
                int i3 = i;
                int i4 = i2;
                if (surfaceEdge.Camera2StreamConfigurationMap != i3) {
                    surfaceEdge.Camera2StreamConfigurationMap = i3;
                    z = true;
                } else {
                    z = false;
                }
                if (surfaceEdge.getHighSpeedVideoFpsRanges != i4) {
                    surfaceEdge.getHighSpeedVideoFpsRanges = i4;
                } else if (!z) {
                    return;
                }
                surfaceEdge.Camera2StreamConfigurationMap();
            }
        });
    }

    public void addTransformationUpdateListener(androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.TransformationInfo> consumer) {
        androidx.core.util.Preconditions.checkNotNull(consumer);
        this.getOutputMinFrameDurationlomOqCM.add(consumer);
    }

    public void removeTransformationUpdateListener(androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.TransformationInfo> consumer) {
        androidx.core.util.Preconditions.checkNotNull(consumer);
        this.getOutputMinFrameDurationlomOqCM.remove(consumer);
    }

    final void Camera2StreamConfigurationMap() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.SurfaceRequest.TransformationInfo of = androidx.camera.core.SurfaceRequest.TransformationInfo.of(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, hasCameraTransform(), this.getOutputSizes, this.getOutputMinFrameDuration);
        androidx.camera.core.SurfaceRequest surfaceRequest = this.getInputFormats;
        if (surfaceRequest != null) {
            surfaceRequest.updateTransformationInfo(of);
        }
        java.util.Iterator<androidx.core.util.Consumer<androidx.camera.core.SurfaceRequest.TransformationInfo>> it = this.getOutputMinFrameDurationlomOqCM.iterator();
        while (it.hasNext()) {
            it.next().accept(of);
        }
    }

    public boolean isMirroring() {
        return this.getOutputMinFrameDuration;
    }

    public androidx.camera.core.impl.StreamSpec getStreamSpec() {
        return this.getOutputSizeshNQ4ISI;
    }

    public androidx.camera.core.impl.DeferrableSurface getDeferrableSurfaceForTesting() {
        return this.getOutputStallDurationlomOqCM;
    }

    public boolean isClosed() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean hasProvider() {
        return this.getOutputStallDurationlomOqCM.getInputFormats != null;
    }

    static class SettableSurface extends androidx.camera.core.impl.DeferrableSurface {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<android.view.Surface> getHighSpeedVideoFpsRanges;
        androidx.camera.core.processing.SurfaceOutputImpl getHighSpeedVideoSizesFor;
        androidx.camera.core.impl.DeferrableSurface getInputFormats;
        final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> getOutputStallDuration;

        SettableSurface(android.util.Size size, int i) {
            super(size, i);
            this.getOutputStallDuration = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$ExternalSyntheticLambda2
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = androidx.camera.core.processing.SurfaceEdge.SettableSurface.this;
                    settableSurface.getHighSpeedVideoFpsRanges = completer;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("SettableFuture hashCode: ");
                    sb.append(settableSurface.hashCode());
                    return sb.toString();
                }
            });
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface() {
            return this.getOutputStallDuration;
        }

        public final boolean getHighSpeedVideoFpsRanges(final androidx.camera.core.impl.DeferrableSurface deferrableSurface, java.lang.Runnable runnable) throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            androidx.core.util.Preconditions.checkNotNull(deferrableSurface);
            androidx.camera.core.impl.DeferrableSurface deferrableSurface2 = this.getInputFormats;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            androidx.core.util.Preconditions.checkState(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            androidx.core.util.Preconditions.checkArgument(getPrescribedSize().equals(deferrableSurface.getPrescribedSize()), java.lang.String.format("The provider's size(%s) must match the parent(%s)", getPrescribedSize(), deferrableSurface.getPrescribedSize()));
            androidx.core.util.Preconditions.checkArgument(getPrescribedStreamFormat() == deferrableSurface.getPrescribedStreamFormat(), java.lang.String.format("The provider's format(%s) must match the parent(%s)", java.lang.Integer.valueOf(getPrescribedStreamFormat()), java.lang.Integer.valueOf(deferrableSurface.getPrescribedStreamFormat())));
            androidx.core.util.Preconditions.checkState(!isClosed(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.getInputFormats = deferrableSurface;
            androidx.camera.core.impl.utils.futures.Futures.propagate(deferrableSurface.getSurface(), this.getHighSpeedVideoFpsRanges);
            deferrableSurface.incrementUseCount();
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> terminationFuture = getTerminationFuture();
            java.util.Objects.requireNonNull(deferrableSurface);
            terminationFuture.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.DeferrableSurface.this.decrementUseCount();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            deferrableSurface.getCloseFuture().addListener(runnable, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
            return true;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public void close() {
            super.close();
            androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceEdge$SettableSurface$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceEdge.SettableSurface settableSurface = androidx.camera.core.processing.SurfaceEdge.SettableSurface.this;
                    androidx.camera.core.processing.SurfaceOutputImpl surfaceOutputImpl = settableSurface.getHighSpeedVideoSizesFor;
                    if (surfaceOutputImpl != null) {
                        surfaceOutputImpl.getHighSpeedVideoFpsRanges();
                    }
                    if (settableSurface.getInputFormats == null) {
                        settableSurface.getHighSpeedVideoFpsRanges.setCancelled();
                    }
                    settableSurface.getInputFormats = null;
                }
            });
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceEdge{targets=");
        sb.append(this.getOutputStallDuration);
        sb.append(", format=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", resolution=");
        sb.append(this.getOutputSizeshNQ4ISI.getResolution());
        sb.append(", cropRect=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", rotationDegrees=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", mirroring=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", sensorToBufferTransform= ");
        sb.append(this.getOutputSizes);
        sb.append(", rotationInTransform= ");
        sb.append(androidx.camera.core.impl.utils.TransformUtils.getRotationDegrees(this.getOutputSizes));
        sb.append(", isMirrorInTransform= ");
        sb.append(androidx.camera.core.impl.utils.TransformUtils.isMirrored(this.getOutputSizes));
        sb.append(", isClosed=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
