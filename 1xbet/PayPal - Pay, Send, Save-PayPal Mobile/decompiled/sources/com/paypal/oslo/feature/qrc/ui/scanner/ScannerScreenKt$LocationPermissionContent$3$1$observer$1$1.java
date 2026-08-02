package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1", f = "ScannerScreen.kt", i = {}, l = {673}, m = "invokeSuspend", n = {}, nl = {680}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.components.BottomSheetController Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController = this.getHighSpeedVideoFpsRanges;
            android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> function1 = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.Camera2StreamConfigurationMap;
            this.getInputFormats = 1;
            if (com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.handleLocationPermissionRequest(permissionController, context, function1, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1.getHighSpeedVideoFpsRanges(com.paypal.pds.components.BottomSheetController.this);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> function12, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$3$1$observer$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = permissionController;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.Camera2StreamConfigurationMap = bottomSheetController;
    }
}
