package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1", f = "ScannerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$LocationPermissionContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighSpeedVideoSizes;
    int getOutputFormats;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1$1", f = "ScannerScreen.kt", i = {}, l = {692}, m = "invokeSuspend", n = {}, nl = {699}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
        int getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputFormats;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController = this.Camera2StreamConfigurationMap;
                android.content.Context context = this.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function1<android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> function1 = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getInputFormats = 1;
                if (com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.handleLocationPermissionRequest(permissionController, context, function1, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.components.BottomSheetController.this);
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

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.pds.components.BottomSheetController bottomSheetController) {
            bottomSheetController.showSheet();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> function12, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = permissionController;
            this.getHighSpeedVideoSizes = context;
            this.getHighSpeedVideoFpsRanges = function1;
            this.getHighSpeedVideoFpsRangesFor = function12;
            this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getOutputMinFrameDuration, null, null, new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScannerScreenKt$LocationPermissionContent$4$1(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Pair<java.lang.Double, java.lang.Double>> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerEvent, kotlin.Unit> function12, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$LocationPermissionContent$4$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = coroutineScope;
        this.getHighSpeedVideoSizes = permissionController;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = function12;
        this.getHighSpeedVideoFpsRanges = bottomSheetController;
    }
}
