package androidx.camera.mlkit.vision;

/* loaded from: classes6.dex */
public class MlKitAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
    private static final android.util.Size getHighSpeedVideoSizes = new android.util.Size(androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, 360);
    private final java.util.concurrent.Executor Camera2StreamConfigurationMap;
    private final java.util.List<com.google.mlkit.vision.interfaces.Detector<?>> getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.view.transform.ImageProxyTransformFactory getHighSpeedVideoFpsRanges;
    final androidx.core.util.Consumer<androidx.camera.mlkit.vision.MlKitAnalyzer.Result> getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizesFor;
    private android.graphics.Matrix getInputFormats;

    public MlKitAnalyzer(java.util.List<com.google.mlkit.vision.interfaces.Detector<?>> list, int i, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.mlkit.vision.MlKitAnalyzer.Result> consumer) {
        if (i != 0) {
            java.util.Iterator<com.google.mlkit.vision.interfaces.Detector<?>> it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.common.internal.Preconditions.checkArgument(it.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(list);
        this.getHighSpeedVideoSizesFor = i;
        this.getHighSpeedVideoFpsRangesFor = consumer;
        this.Camera2StreamConfigurationMap = executor;
        androidx.camera.view.transform.ImageProxyTransformFactory imageProxyTransformFactory = new androidx.camera.view.transform.ImageProxyTransformFactory();
        this.getHighSpeedVideoFpsRanges = imageProxyTransformFactory;
        imageProxyTransformFactory.setUsingRotationDegrees(true);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(androidx.camera.core.ImageProxy imageProxy) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        int i = this.getHighSpeedVideoSizesFor;
        if (i != 0) {
            android.graphics.Matrix matrix2 = this.getInputFormats;
            if (i != 2 && matrix2 == null) {
                androidx.camera.core.Logger.d("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                imageProxy.close();
                return;
            }
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(imageProxy.getImageInfo().getSensorToBufferTransformMatrix());
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, imageProxy.getWidth(), imageProxy.getHeight());
            matrix3.postConcat(androidx.camera.core.impl.utils.TransformUtils.getRectToRect(rectF, androidx.camera.core.impl.utils.TransformUtils.rotateRect(rectF, imageProxy.getImageInfo().getRotationDegrees()), imageProxy.getImageInfo().getRotationDegrees()));
            matrix3.invert(matrix);
            if (this.getHighSpeedVideoSizesFor != 2) {
                matrix.postConcat(matrix2);
            }
        }
        getHighSpeedVideoSizes(imageProxy, 0, matrix, new java.util.HashMap(), new java.util.HashMap());
    }

    final void getHighSpeedVideoSizes(final androidx.camera.core.ImageProxy imageProxy, int i, final android.graphics.Matrix matrix, final java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Object> map, final java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Throwable> map2) {
        final int i2 = i;
        while (true) {
            android.media.Image image = imageProxy.getImage();
            if (image == null) {
                androidx.camera.core.Logger.e("MlKitAnalyzer", "Image is null.");
                imageProxy.close();
                return;
            } else {
                if (i2 > this.getHighResolutionOutputSizeshNQ4ISI.size() - 1) {
                    imageProxy.close();
                    this.Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.camera.mlkit.vision.MlKitAnalyzer$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.mlkit.vision.MlKitAnalyzer mlKitAnalyzer = androidx.camera.mlkit.vision.MlKitAnalyzer.this;
                            java.util.Map map3 = map;
                            androidx.camera.core.ImageProxy imageProxy2 = imageProxy;
                            mlKitAnalyzer.getHighSpeedVideoFpsRangesFor.accept(new androidx.camera.mlkit.vision.MlKitAnalyzer.Result(map3, imageProxy2.getImageInfo().getTimestamp(), map2));
                        }
                    });
                    return;
                }
                final com.google.mlkit.vision.interfaces.Detector<?> detector = this.getHighResolutionOutputSizeshNQ4ISI.get(i2);
                try {
                    detector.process(image, imageProxy.getImageInfo().getRotationDegrees(), matrix).addOnCompleteListener(this.Camera2StreamConfigurationMap, new com.google.android.gms.tasks.OnCompleteListener() { // from class: androidx.camera.mlkit.vision.MlKitAnalyzer$$ExternalSyntheticLambda1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(com.google.android.gms.tasks.Task task) {
                            androidx.camera.mlkit.vision.MlKitAnalyzer mlKitAnalyzer = androidx.camera.mlkit.vision.MlKitAnalyzer.this;
                            java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Throwable> map3 = map2;
                            com.google.mlkit.vision.interfaces.Detector<?> detector2 = detector;
                            java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Object> map4 = map;
                            androidx.camera.core.ImageProxy imageProxy2 = imageProxy;
                            int i3 = i2;
                            android.graphics.Matrix matrix2 = matrix;
                            if (task.isCanceled()) {
                                map3.put(detector2, new java.util.concurrent.CancellationException("The task is canceled."));
                            } else if (task.isSuccessful()) {
                                map4.put(detector2, task.getResult());
                            } else {
                                map3.put(detector2, task.getException());
                            }
                            mlKitAnalyzer.getHighSpeedVideoSizes(imageProxy2, i3 + 1, matrix2, map4, map3);
                        }
                    });
                    return;
                } catch (java.lang.Exception e) {
                    map2.put(detector, new java.lang.RuntimeException("Failed to process the image.", e));
                    i2++;
                }
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final android.util.Size getDefaultTargetResolution() {
        android.util.Size size;
        android.util.Size size2 = getHighSpeedVideoSizes;
        java.util.Iterator<com.google.mlkit.vision.interfaces.Detector<?>> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            int detectorType = it.next().getDetectorType();
            if (detectorType == 1 || detectorType == 4) {
                size = new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);
            } else {
                size = getHighSpeedVideoSizes;
            }
            if (size.getHeight() * size.getWidth() > size2.getWidth() * size2.getHeight()) {
                size2 = size;
            }
        }
        return size2;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final int getTargetCoordinateSystem() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void updateTransform(android.graphics.Matrix matrix) {
        if (matrix == null) {
            this.getInputFormats = null;
        } else {
            this.getInputFormats = new android.graphics.Matrix(matrix);
        }
    }

    public static final class Result {
        private final java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Throwable> Camera2StreamConfigurationMap;
        private final java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        private final long getHighSpeedVideoSizes;

        public Result(java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Object> map, long j, java.util.Map<com.google.mlkit.vision.interfaces.Detector<?>, java.lang.Throwable> map2) {
            this.getHighResolutionOutputSizeshNQ4ISI = map;
            this.Camera2StreamConfigurationMap = map2;
            this.getHighSpeedVideoSizes = j;
        }

        public final <T> T getValue(com.google.mlkit.vision.interfaces.Detector<T> detector) {
            getHighSpeedVideoFpsRangesFor(detector);
            return (T) this.getHighResolutionOutputSizeshNQ4ISI.get(detector);
        }

        public final java.lang.Throwable getThrowable(com.google.mlkit.vision.interfaces.Detector<?> detector) {
            getHighSpeedVideoFpsRangesFor(detector);
            return this.Camera2StreamConfigurationMap.get(detector);
        }

        public final long getTimestamp() {
            return this.getHighSpeedVideoSizes;
        }

        private void getHighSpeedVideoFpsRangesFor(com.google.mlkit.vision.interfaces.Detector<?> detector) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.getHighResolutionOutputSizeshNQ4ISI.containsKey(detector) || this.Camera2StreamConfigurationMap.containsKey(detector), "The detector does not exist");
        }
    }
}
