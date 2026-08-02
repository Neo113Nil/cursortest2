package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$2$1", f = "CardScanScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardScanScreenKt$CardScanScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel getInputFormats;
    final /* synthetic */ androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt.access$CardScanScreen$lambda$0(this.getHighSpeedVideoSizes) == com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState.NOT_REQUESTED) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.core.permission.domain.model.PermissionType.Camera.INSTANCE.getPermission()) == 0) {
                this.getInputFormats.updateCameraPermissionState(com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState.GRANTED);
            } else {
                android.content.Context context = this.getHighSpeedVideoFpsRanges;
                booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
                if (com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt.access$wasPreviouslyDenied(context, booleanValue)) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        this.getInputFormats.navigateBackWithPermissionDenied();
                    } else {
                        this.getInputFormats.updateCameraPermissionState(com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState.DENIED);
                    }
                } else {
                    this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(true));
                    this.getInputSizeshNQ4ISI.launch(com.paypal.oslo.core.permission.domain.model.PermissionType.Camera.INSTANCE.getPermission());
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CardScanScreenKt$CardScanScreen$2$1(android.content.Context context, com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel cardScanViewModel, boolean z, androidx.view.compose.ManagedActivityResultLauncher<java.lang.String, java.lang.Boolean> managedActivityResultLauncher, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.wallet.cards.ui.scan.CameraPermissionState> state, androidx.compose.runtime.State<java.lang.Boolean> state2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = context;
        this.getInputFormats = cardScanViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getInputSizeshNQ4ISI = managedActivityResultLauncher;
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRangesFor = state2;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
