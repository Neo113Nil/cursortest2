package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
public class DualSurfaceProcessorNode implements androidx.camera.core.processing.Node<androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In, androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out> {
    final androidx.camera.core.processing.SurfaceProcessorInternal Camera2StreamConfigurationMap;
    final androidx.camera.core.impl.CameraInternal getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.impl.CameraInternal getHighSpeedVideoFpsRanges;
    androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In getHighSpeedVideoSizesFor;

    public static class Out extends java.util.HashMap<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> {
    }

    public DualSurfaceProcessorNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.processing.SurfaceProcessorInternal surfaceProcessorInternal, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = cameraInternal;
        this.getHighSpeedVideoFpsRanges = cameraInternal2;
        this.Camera2StreamConfigurationMap = surfaceProcessorInternal;
        this.getHighSpeedVideoSizes = str;
    }

    @Override // androidx.camera.core.processing.Node
    public androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out transform(androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In in) {
        java.lang.String obj;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getHighSpeedVideoSizes == null) {
            obj = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("] ");
            obj = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append("DualSurfaceProcessorNode Transform Processor = ");
        sb2.append(this.Camera2StreamConfigurationMap);
        sb2.append("\n   primary input = ");
        sb2.append(in.getPrimarySurfaceEdge());
        sb2.append("\n   secondary input = ");
        sb2.append(in.getSecondarySurfaceEdge());
        androidx.camera.core.Logger.d("DualSurfaceProcessorNode", sb2.toString());
        java.util.Iterator<androidx.camera.core.processing.concurrent.DualOutConfig> it = in.getOutConfigs().iterator();
        while (it.hasNext()) {
            androidx.camera.core.Logger.d("SurfaceProcessorNode", "   outputConfig = ".concat(java.lang.String.valueOf(it.next())));
        }
        this.getHighSpeedVideoSizesFor = in;
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out();
        final androidx.camera.core.processing.SurfaceEdge primarySurfaceEdge = this.getHighSpeedVideoSizesFor.getPrimarySurfaceEdge();
        final androidx.camera.core.processing.SurfaceEdge secondarySurfaceEdge = this.getHighSpeedVideoSizesFor.getSecondarySurfaceEdge();
        for (androidx.camera.core.processing.concurrent.DualOutConfig dualOutConfig : this.getHighSpeedVideoSizesFor.getOutConfigs()) {
            androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out out = this.getHighSpeedVideoFpsRangesFor;
            androidx.camera.core.processing.util.OutConfig primaryOutConfig = dualOutConfig.getPrimaryOutConfig();
            android.graphics.Rect cropRect = primaryOutConfig.getCropRect();
            int rotationDegrees = primaryOutConfig.getRotationDegrees();
            boolean isMirroring = primaryOutConfig.isMirroring();
            android.graphics.Matrix matrix = new android.graphics.Matrix(primarySurfaceEdge.getSensorToBufferTransform());
            matrix.postConcat(androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(cropRect), androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(primaryOutConfig.getSize()), rotationDegrees, isMirroring));
            androidx.core.util.Preconditions.checkArgument(androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(cropRect, rotationDegrees), primaryOutConfig.getSize()));
            android.graphics.Rect sizeToRect = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(primaryOutConfig.getSize());
            androidx.camera.core.impl.StreamSpec build = primarySurfaceEdge.getStreamSpec().toBuilder().setResolution(primaryOutConfig.getSize()).build();
            out.put(dualOutConfig, new androidx.camera.core.processing.SurfaceEdge(primaryOutConfig.getTargets(), primaryOutConfig.getFormat(), build, matrix, false, sizeToRect, primarySurfaceEdge.getRotationDegrees() - rotationDegrees, -1, primarySurfaceEdge.isMirroring() != isMirroring));
        }
        try {
            this.Camera2StreamConfigurationMap.onInputSurface(primarySurfaceEdge.createSurfaceRequest(this.getHighResolutionOutputSizeshNQ4ISI, true));
        } catch (androidx.camera.core.ProcessingException e) {
            androidx.camera.core.Logger.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            this.Camera2StreamConfigurationMap.onInputSurface(secondarySurfaceEdge.createSurfaceRequest(this.getHighSpeedVideoFpsRanges, false));
        } catch (androidx.camera.core.ProcessingException e2) {
            androidx.camera.core.Logger.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        final androidx.camera.core.impl.CameraInternal cameraInternal = this.getHighResolutionOutputSizeshNQ4ISI;
        final androidx.camera.core.impl.CameraInternal cameraInternal2 = this.getHighSpeedVideoFpsRanges;
        for (final java.util.Map.Entry<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> entry : this.getHighSpeedVideoFpsRangesFor.entrySet()) {
            getHighResolutionOutputSizeshNQ4ISI(cameraInternal, cameraInternal2, primarySurfaceEdge, secondarySurfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.getHighResolutionOutputSizeshNQ4ISI(cameraInternal, cameraInternal2, primarySurfaceEdge, secondarySurfaceEdge, entry);
                }
            });
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.CameraInternal cameraInternal2, androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.Map.Entry<androidx.camera.core.processing.concurrent.DualOutConfig, androidx.camera.core.processing.SurfaceEdge> entry) {
        final androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
        androidx.camera.core.Logger.d("DualSurfaceProcessorNode", "     -> outputEdge = ".concat(java.lang.String.valueOf(value)));
        android.util.Size resolution = surfaceEdge.getStreamSpec().getResolution();
        android.graphics.Rect cropRect = entry.getKey().getPrimaryOutConfig().getCropRect();
        if (!surfaceEdge.hasCameraTransform()) {
            cameraInternal = null;
        }
        androidx.camera.core.SurfaceOutput.CameraInputInfo of = androidx.camera.core.SurfaceOutput.CameraInputInfo.of(resolution, cropRect, cameraInternal, entry.getKey().getPrimaryOutConfig().getRotationDegrees(), entry.getKey().getPrimaryOutConfig().isMirroring());
        android.util.Size resolution2 = surfaceEdge2.getStreamSpec().getResolution();
        android.graphics.Rect cropRect2 = entry.getKey().getSecondaryOutConfig().getCropRect();
        if (!surfaceEdge2.hasCameraTransform()) {
            cameraInternal2 = null;
        }
        androidx.camera.core.impl.utils.futures.Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getPrimaryOutConfig().getFormat(), of, androidx.camera.core.SurfaceOutput.CameraInputInfo.of(resolution2, cropRect2, cameraInternal2, entry.getKey().getSecondaryOutConfig().getRotationDegrees(), entry.getKey().getSecondaryOutConfig().isMirroring())), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.SurfaceOutput>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(androidx.camera.core.SurfaceOutput surfaceOutput) {
                androidx.camera.core.SurfaceOutput surfaceOutput2 = surfaceOutput;
                androidx.core.util.Preconditions.checkNotNull(surfaceOutput2);
                try {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.Camera2StreamConfigurationMap.onOutputSurface(surfaceOutput2);
                } catch (androidx.camera.core.ProcessingException e) {
                    androidx.camera.core.Logger.e("DualSurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (value.getTargets() == 2 && (th instanceof java.util.concurrent.CancellationException)) {
                    androidx.camera.core.Logger.d("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Downstream node failed to provide Surface. Target: ");
                sb.append(androidx.camera.core.processing.TargetUtils.getHumanReadableName(value.getTargets()));
                androidx.camera.core.Logger.w("DualSurfaceProcessorNode", sb.toString(), th);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.Camera2StreamConfigurationMap.release();
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.Out out = androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.this.getHighSpeedVideoFpsRangesFor;
                if (out != null) {
                    java.util.Iterator<androidx.camera.core.processing.SurfaceEdge> it = out.values().iterator();
                    while (it.hasNext()) {
                        it.next().close();
                    }
                }
            }
        });
    }

    public static abstract class In {
        public abstract java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> getOutConfigs();

        public abstract androidx.camera.core.processing.SurfaceEdge getPrimarySurfaceEdge();

        public abstract androidx.camera.core.processing.SurfaceEdge getSecondarySurfaceEdge();

        public static androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In of(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> list) {
            return new androidx.camera.core.processing.concurrent.AutoValue_DualSurfaceProcessorNode_In(surfaceEdge, surfaceEdge2, list);
        }
    }
}
