package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/MLKitImageQrScanner;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageQrScanner;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "controller", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "imageProvider", "Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;", "scannerFactory", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/qrc/di/QrScannerController;Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;)V", "Landroid/net/Uri;", "uri", "Lkotlin/Function1;", "", "", "onSuccess", "onFailure", "scanImage", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MLKitImageQrScanner implements com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.di.QrScannerController Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MLKitImageQrScanner(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.qrc.di.QrScannerController qrScannerController, com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider imageProvider, com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory barcodeScannerFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrScannerController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcodeScannerFactory, "");
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = qrScannerController;
        this.getHighSpeedVideoFpsRangesFor = imageProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = barcodeScannerFactory;
    }

    public /* synthetic */ MLKitImageQrScanner(android.content.Context context, com.paypal.oslo.feature.qrc.di.QrScannerController qrScannerController, com.paypal.oslo.feature.qrc.data.scanner.AndroidImageProvider androidImageProvider, com.paypal.oslo.feature.qrc.data.scanner.MLKitBarcodeScannerFactory mLKitBarcodeScannerFactory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, qrScannerController, (i & 4) != 0 ? new com.paypal.oslo.feature.qrc.data.scanner.AndroidImageProvider() : androidImageProvider, (i & 8) != 0 ? new com.paypal.oslo.feature.qrc.data.scanner.MLKitBarcodeScannerFactory() : mLKitBarcodeScannerFactory);
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner
    public final void scanImage(android.net.Uri uri, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSuccess, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSuccess, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        try {
            com.google.mlkit.vision.common.InputImage fromUri = this.getHighSpeedVideoFpsRangesFor.fromUri(this.getHighSpeedVideoSizes, uri);
            final com.google.mlkit.vision.barcode.BarcodeScanner createScanner = this.getHighResolutionOutputSizeshNQ4ISI.createScanner();
            com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.common.Barcode>> process = createScanner.process(fromUri);
            final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner.$r8$lambda$P_u9SzeaAMG2QKTl7JFwH9gsZI8(com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner.this, onSuccess, onFailure, createScanner, (java.util.List) obj);
                }
            };
            kotlin.jvm.internal.Intrinsics.checkNotNull(process.addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(java.lang.Object obj) {
                    kotlin.jvm.functions.Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(java.lang.Exception exc) {
                    com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner.$r8$lambda$dA14SLzpB0O6QTZxhophK4AKkhE(kotlin.jvm.functions.Function1.this, this, createScanner, exc);
                }
            }));
        } catch (java.io.IOException e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Error preparing image for scanning", e);
            java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_invalid_image);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            onFailure.invoke(string);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P_u9SzeaAMG2QKTl7JFwH9gsZI8(com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner mLKitImageQrScanner, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        com.paypal.oslo.feature.qrc.di.QrScanResult onBarcodeDetected = mLKitImageQrScanner.Camera2StreamConfigurationMap.onBarcodeDetected((com.google.mlkit.vision.barcode.common.Barcode) kotlin.collections.CollectionsKt.firstOrNull(list), true);
        if (onBarcodeDetected instanceof com.paypal.oslo.feature.qrc.di.QrScanResult.Success) {
            com.paypal.oslo.feature.qrc.di.QrScanResult.Success success = (com.paypal.oslo.feature.qrc.di.QrScanResult.Success) onBarcodeDetected;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.qrc.LoggerKt.log, "QR Code detected from gallery", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("qrCode", success.getCode())), null, 4, null);
            function1.invoke(success.getCode());
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(onBarcodeDetected, com.paypal.oslo.feature.qrc.di.QrScanResult.NoCodeDetected.INSTANCE)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.qrc.LoggerKt.log, "No QR code found in selected image", null, null, 6, null);
            java.lang.String string = mLKitImageQrScanner.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_invalid_image);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            function12.invoke(string);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(onBarcodeDetected, com.paypal.oslo.feature.qrc.di.QrScanResult.ScanningPaused.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String string2 = mLKitImageQrScanner.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_invalid_image);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            function12.invoke(string2);
        }
        try {
            barcodeScanner.close();
        } catch (java.io.IOException e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Error closing barcode scanner", e);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$dA14SLzpB0O6QTZxhophK4AKkhE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner mLKitImageQrScanner, com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        com.paypal.oslo.feature.qrc.LoggerKt.log.e("Error scanning QR code from image", exc);
        java.lang.String string = mLKitImageQrScanner.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_invalid_image);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        function1.invoke(string);
        try {
            barcodeScanner.close();
        } catch (java.io.IOException e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Error closing barcode scanner", e);
        }
    }
}
