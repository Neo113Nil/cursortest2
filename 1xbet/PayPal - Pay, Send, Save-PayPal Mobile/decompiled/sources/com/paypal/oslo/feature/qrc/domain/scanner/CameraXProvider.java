package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJP\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J3\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010%\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010(\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010."}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraXProvider;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeScanner", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactory;", "cameraProviderFactory", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraComponentsFactory;", "componentsFactory", "<init>", "(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactory;Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraComponentsFactory;)V", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/camera/core/SurfaceRequest;", "", "onSurfaceRequest", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "onBarcodeAnalyzed", "initialize", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbindAll", "()V", "", "enabled", "enableFlash", "(Z)V", "pauseAnalysis", "resumeAnalysis", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactory;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraComponentsFactory;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getInputSizeshNQ4ISI", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "Landroidx/camera/core/Camera;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/Camera;", "Landroidx/camera/core/ImageAnalysis;", "Landroidx/camera/core/ImageAnalysis;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraXProvider implements com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.google.mlkit.vision.barcode.BarcodeScanner getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactory getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactory Camera2StreamConfigurationMap;
    private androidx.camera.core.Camera getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.camera.core.ImageAnalysis getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.camera.lifecycle.ProcessCameraProvider getHighSpeedVideoFpsRanges;

    public CameraXProvider(com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner, com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactory cameraProviderFactory, com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactory cameraComponentsFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcodeScanner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProviderFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraComponentsFactory, "");
        this.getHighResolutionOutputSizeshNQ4ISI = barcodeScanner;
        this.getHighSpeedVideoSizes = cameraProviderFactory;
        this.Camera2StreamConfigurationMap = cameraComponentsFactory;
    }

    public /* synthetic */ CameraXProvider(com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner, com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactoryImpl cameraProviderFactoryImpl, com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactoryImpl cameraComponentsFactoryImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeScanner, (i & 2) != 0 ? new com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactoryImpl() : cameraProviderFactoryImpl, (i & 4) != 0 ? new com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactoryImpl() : cameraComponentsFactoryImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initialize(android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function1<? super androidx.camera.core.SurfaceRequest, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$initialize$1 cameraXProvider$initialize$1;
        int i;
        android.content.Context context2;
        com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider cameraXProvider;
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider;
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider2;
        androidx.camera.core.Camera camera;
        if (continuation instanceof com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$initialize$1) {
            cameraXProvider$initialize$1 = (com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$initialize$1) continuation;
            if ((cameraXProvider$initialize$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cameraXProvider$initialize$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cameraXProvider$initialize$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cameraXProvider$initialize$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactory cameraProviderFactory = this.getHighSpeedVideoSizes;
                    cameraXProvider$initialize$1.getHighSpeedVideoSizes = context;
                    cameraXProvider$initialize$1.Camera2StreamConfigurationMap = lifecycleOwner;
                    cameraXProvider$initialize$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    cameraXProvider$initialize$1.getHighSpeedVideoFpsRanges = function12;
                    cameraXProvider$initialize$1.getHighSpeedVideoFpsRangesFor = this;
                    cameraXProvider$initialize$1.getInputSizeshNQ4ISI = 1;
                    obj = cameraProviderFactory.getProcessCameraProvider(context, cameraXProvider$initialize$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    context2 = context;
                    cameraXProvider = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cameraXProvider = (com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider) cameraXProvider$initialize$1.getHighSpeedVideoFpsRangesFor;
                    function12 = (kotlin.jvm.functions.Function1) cameraXProvider$initialize$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) cameraXProvider$initialize$1.getHighResolutionOutputSizeshNQ4ISI;
                    lifecycleOwner = (androidx.view.LifecycleOwner) cameraXProvider$initialize$1.Camera2StreamConfigurationMap;
                    context2 = (android.content.Context) cameraXProvider$initialize$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                cameraXProvider.getHighSpeedVideoFpsRanges = (androidx.camera.lifecycle.ProcessCameraProvider) obj;
                androidx.camera.core.Preview createPreview = this.Camera2StreamConfigurationMap.createPreview();
                createPreview.setSurfaceProvider(new androidx.camera.core.Preview.SurfaceProvider() { // from class: com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$$ExternalSyntheticLambda1
                    @Override // androidx.camera.core.Preview.SurfaceProvider
                    public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest) {
                        com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider.m17774$r8$lambda$9Wc2b5rNdUgN95jJeY8u5pRfi4(kotlin.jvm.functions.Function1.this, surfaceRequest);
                    }
                });
                androidx.camera.core.ImageAnalysis createImageAnalysis = this.Camera2StreamConfigurationMap.createImageAnalysis();
                createImageAnalysis.setAnalyzer(androidx.core.content.ContextCompat.getMainExecutor(context2), new androidx.camera.mlkit.vision.MlKitAnalyzer(kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI), 0, androidx.core.content.ContextCompat.getMainExecutor(context2), new androidx.core.util.Consumer() { // from class: com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$$ExternalSyntheticLambda2
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj2) {
                        kotlin.jvm.functions.Function1.this.invoke(((androidx.camera.mlkit.vision.MlKitAnalyzer.Result) obj2).getValue(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                }));
                this.getInputSizeshNQ4ISI = createImageAnalysis;
                processCameraProvider = this.getHighSpeedVideoFpsRanges;
                if (processCameraProvider != null) {
                    processCameraProvider.unbindAll();
                }
                processCameraProvider2 = this.getHighSpeedVideoFpsRanges;
                if (processCameraProvider2 == null) {
                    androidx.camera.core.CameraSelector cameraSelector = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
                    camera = processCameraProvider2.bindToLifecycle(lifecycleOwner, cameraSelector, createPreview, createImageAnalysis);
                } else {
                    camera = null;
                }
                this.getHighSpeedVideoFpsRangesFor = camera;
                return kotlin.Unit.INSTANCE;
            }
        }
        cameraXProvider$initialize$1 = new com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$initialize$1(this, continuation);
        java.lang.Object obj2 = cameraXProvider$initialize$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cameraXProvider$initialize$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        cameraXProvider.getHighSpeedVideoFpsRanges = (androidx.camera.lifecycle.ProcessCameraProvider) obj2;
        androidx.camera.core.Preview createPreview2 = this.Camera2StreamConfigurationMap.createPreview();
        createPreview2.setSurfaceProvider(new androidx.camera.core.Preview.SurfaceProvider() { // from class: com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.Preview.SurfaceProvider
            public final void onSurfaceRequested(androidx.camera.core.SurfaceRequest surfaceRequest) {
                com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider.m17774$r8$lambda$9Wc2b5rNdUgN95jJeY8u5pRfi4(kotlin.jvm.functions.Function1.this, surfaceRequest);
            }
        });
        androidx.camera.core.ImageAnalysis createImageAnalysis2 = this.Camera2StreamConfigurationMap.createImageAnalysis();
        createImageAnalysis2.setAnalyzer(androidx.core.content.ContextCompat.getMainExecutor(context2), new androidx.camera.mlkit.vision.MlKitAnalyzer(kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI), 0, androidx.core.content.ContextCompat.getMainExecutor(context2), new androidx.core.util.Consumer() { // from class: com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj22) {
                kotlin.jvm.functions.Function1.this.invoke(((androidx.camera.mlkit.vision.MlKitAnalyzer.Result) obj22).getValue(this.getHighResolutionOutputSizeshNQ4ISI));
            }
        }));
        this.getInputSizeshNQ4ISI = createImageAnalysis2;
        processCameraProvider = this.getHighSpeedVideoFpsRanges;
        if (processCameraProvider != null) {
        }
        processCameraProvider2 = this.getHighSpeedVideoFpsRanges;
        if (processCameraProvider2 == null) {
        }
        this.getHighSpeedVideoFpsRangesFor = camera;
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider
    public final void unbindAll() {
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = this.getHighSpeedVideoFpsRanges;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider
    public final void enableFlash(boolean enabled) {
        androidx.camera.core.CameraControl cameraControl;
        androidx.camera.core.Camera camera = this.getHighSpeedVideoFpsRangesFor;
        if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        cameraControl.enableTorch(enabled);
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider
    public final void pauseAnalysis() {
        androidx.camera.core.ImageAnalysis imageAnalysis = this.getInputSizeshNQ4ISI;
        if (imageAnalysis != null) {
            imageAnalysis.clearAnalyzer();
        }
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider
    public final void resumeAnalysis(android.content.Context context, final kotlin.jvm.functions.Function1<? super java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>, kotlin.Unit> onBarcodeAnalyzed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBarcodeAnalyzed, "");
        androidx.camera.core.ImageAnalysis imageAnalysis = this.getInputSizeshNQ4ISI;
        if (imageAnalysis != null) {
            imageAnalysis.setAnalyzer(androidx.core.content.ContextCompat.getMainExecutor(context), new androidx.camera.mlkit.vision.MlKitAnalyzer(kotlin.collections.CollectionsKt.listOf(this.getHighResolutionOutputSizeshNQ4ISI), 0, androidx.core.content.ContextCompat.getMainExecutor(context), new androidx.core.util.Consumer() { // from class: com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(((androidx.camera.mlkit.vision.MlKitAnalyzer.Result) obj).getValue(this.getHighResolutionOutputSizeshNQ4ISI));
                }
            }));
        }
    }

    /* renamed from: $r8$lambda$9-Wc2b5rNdUgN95jJeY8u5pRfi4, reason: not valid java name */
    public static /* synthetic */ void m17774$r8$lambda$9Wc2b5rNdUgN95jJeY8u5pRfi4(kotlin.jvm.functions.Function1 function1, androidx.camera.core.SurfaceRequest surfaceRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceRequest, "");
        function1.invoke(surfaceRequest);
    }
}
