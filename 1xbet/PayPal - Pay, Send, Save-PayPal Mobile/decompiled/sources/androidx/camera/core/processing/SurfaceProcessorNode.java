package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class SurfaceProcessorNode implements androidx.camera.core.processing.Node<androidx.camera.core.processing.SurfaceProcessorNode.In, androidx.camera.core.processing.SurfaceProcessorNode.Out> {
    private final java.lang.String Camera2StreamConfigurationMap;
    private androidx.camera.core.processing.SurfaceProcessorNode.In getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.processing.SurfaceProcessorNode.Out getHighSpeedVideoFpsRanges;
    final androidx.camera.core.processing.SurfaceProcessorInternal getHighSpeedVideoFpsRangesFor;
    final androidx.camera.core.impl.CameraInternal getHighSpeedVideoSizes;

    public static class Out extends java.util.HashMap<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> {
    }

    public SurfaceProcessorNode(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.processing.SurfaceProcessorInternal surfaceProcessorInternal, java.lang.String str) {
        this.getHighSpeedVideoSizes = cameraInternal;
        this.getHighSpeedVideoFpsRangesFor = surfaceProcessorInternal;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // androidx.camera.core.processing.Node
    public androidx.camera.core.processing.SurfaceProcessorNode.Out transform(androidx.camera.core.processing.SurfaceProcessorNode.In in) {
        java.lang.String obj;
        android.graphics.Rect sizeToRect;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.Camera2StreamConfigurationMap == null) {
            obj = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append("] ");
            obj = sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append("SurfaceProcessorNode Transform (Processor=");
        sb2.append(this.getHighSpeedVideoFpsRangesFor);
        sb2.append("\n   inputEdge = ");
        sb2.append(in.getSurfaceEdge());
        androidx.camera.core.Logger.d("SurfaceProcessorNode", sb2.toString());
        java.util.Iterator<androidx.camera.core.processing.util.OutConfig> it = in.getOutConfigs().iterator();
        while (it.hasNext()) {
            androidx.camera.core.Logger.d("SurfaceProcessorNode", "   outputConfig = ".concat(java.lang.String.valueOf(it.next())));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = in;
        this.getHighSpeedVideoFpsRanges = new androidx.camera.core.processing.SurfaceProcessorNode.Out();
        final androidx.camera.core.processing.SurfaceEdge surfaceEdge = in.getSurfaceEdge();
        for (androidx.camera.core.processing.util.OutConfig outConfig : in.getOutConfigs()) {
            androidx.camera.core.processing.SurfaceProcessorNode.Out out = this.getHighSpeedVideoFpsRanges;
            android.graphics.Rect cropRect = outConfig.getCropRect();
            int rotationDegrees = outConfig.getRotationDegrees();
            boolean isMirroring = outConfig.isMirroring();
            android.graphics.Matrix matrix = new android.graphics.Matrix(surfaceEdge.getSensorToBufferTransform());
            android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(new android.graphics.RectF(cropRect), androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(outConfig.getSize()), rotationDegrees, isMirroring);
            matrix.postConcat(rectToRect);
            androidx.core.util.Preconditions.checkArgument(androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(androidx.camera.core.impl.utils.TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
            if (outConfig.shouldRespectInputCropRect()) {
                androidx.core.util.Preconditions.checkArgument(outConfig.getCropRect().contains(surfaceEdge.getCropRect()), java.lang.String.format("Output crop rect %s must contain input crop rect %s", outConfig.getCropRect(), surfaceEdge.getCropRect()));
                sizeToRect = new android.graphics.Rect();
                android.graphics.RectF rectF = new android.graphics.RectF(surfaceEdge.getCropRect());
                rectToRect.mapRect(rectF);
                rectF.round(sizeToRect);
            } else {
                sizeToRect = androidx.camera.core.impl.utils.TransformUtils.sizeToRect(outConfig.getSize());
            }
            android.graphics.Rect rect = sizeToRect;
            androidx.camera.core.impl.StreamSpec build = surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build();
            out.put(outConfig, new androidx.camera.core.processing.SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), build, matrix, false, rect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != isMirroring));
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.onInputSurface(surfaceEdge.createSurfaceRequest(this.getHighSpeedVideoSizes));
        } catch (androidx.camera.core.ProcessingException e) {
            androidx.camera.core.Logger.e("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (final java.util.Map.Entry<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> entry : this.getHighSpeedVideoFpsRanges.entrySet()) {
            getHighSpeedVideoFpsRangesFor(surfaceEdge, entry);
            entry.getValue().addOnInvalidatedListener(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceProcessorNode.this.getHighSpeedVideoFpsRangesFor(surfaceEdge, entry);
                }
            });
        }
        final androidx.camera.core.processing.SurfaceProcessorNode.Out out2 = this.getHighSpeedVideoFpsRanges;
        surfaceEdge.addTransformationUpdateListener(new androidx.core.util.Consumer() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj2) {
                androidx.camera.core.processing.SurfaceProcessorNode.Camera2StreamConfigurationMap(out2, (androidx.camera.core.SurfaceRequest.TransformationInfo) obj2);
            }
        });
        return this.getHighSpeedVideoFpsRanges;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.Map.Entry<androidx.camera.core.processing.util.OutConfig, androidx.camera.core.processing.SurfaceEdge> entry) {
        final androidx.camera.core.processing.SurfaceEdge value = entry.getValue();
        androidx.camera.core.Logger.d("SurfaceProcessorNode", "     -> outputEdge = ".concat(java.lang.String.valueOf(value)));
        androidx.camera.core.impl.utils.futures.Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getFormat(), androidx.camera.core.SurfaceOutput.CameraInputInfo.of(surfaceEdge.getStreamSpec().getResolution(), entry.getKey().getCropRect(), surfaceEdge.hasCameraTransform() ? this.getHighSpeedVideoSizes : null, entry.getKey().getRotationDegrees(), entry.getKey().isMirroring()), null), new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.SurfaceOutput>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(androidx.camera.core.SurfaceOutput surfaceOutput) {
                androidx.camera.core.SurfaceOutput surfaceOutput2 = surfaceOutput;
                androidx.core.util.Preconditions.checkNotNull(surfaceOutput2);
                try {
                    androidx.camera.core.processing.SurfaceProcessorNode.this.getHighSpeedVideoFpsRangesFor.onOutputSurface(surfaceOutput2);
                } catch (androidx.camera.core.ProcessingException e) {
                    androidx.camera.core.Logger.e("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (value.getTargets() == 2 && (th instanceof java.util.concurrent.CancellationException)) {
                    androidx.camera.core.Logger.d("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Downstream node failed to provide Surface. Target: ");
                sb.append(androidx.camera.core.processing.TargetUtils.getHumanReadableName(value.getTargets()));
                androidx.camera.core.Logger.w("SurfaceProcessorNode", sb.toString(), th);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(java.util.Map map, androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            int rotationDegrees = transformationInfo.getRotationDegrees() - ((androidx.camera.core.processing.util.OutConfig) entry.getKey()).getRotationDegrees();
            if (((androidx.camera.core.processing.util.OutConfig) entry.getKey()).isMirroring()) {
                rotationDegrees = -rotationDegrees;
            }
            ((androidx.camera.core.processing.SurfaceEdge) entry.getValue()).updateTransformation(androidx.camera.core.impl.utils.TransformUtils.within360(rotationDegrees), -1);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.getHighSpeedVideoFpsRangesFor.release();
        androidx.camera.core.impl.utils.Threads.runOnMain(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.SurfaceProcessorNode.Out out = androidx.camera.core.processing.SurfaceProcessorNode.this.getHighSpeedVideoFpsRanges;
                if (out != null) {
                    java.util.Iterator<androidx.camera.core.processing.SurfaceEdge> it = out.values().iterator();
                    while (it.hasNext()) {
                        it.next().close();
                    }
                }
            }
        });
    }

    public androidx.camera.core.processing.SurfaceProcessorInternal getSurfaceProcessor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static abstract class In {
        public abstract java.util.List<androidx.camera.core.processing.util.OutConfig> getOutConfigs();

        public abstract androidx.camera.core.processing.SurfaceEdge getSurfaceEdge();

        public static androidx.camera.core.processing.SurfaceProcessorNode.In of(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.List<androidx.camera.core.processing.util.OutConfig> list) {
            return new androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In(surfaceEdge, list);
        }
    }
}
