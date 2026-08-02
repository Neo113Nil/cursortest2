package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1", f = "TtpPermissionsRationaleScreen.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, nl = {138}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt.handleAction(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt.access$TtpPermissionsRationaleScreen$lambda$2(this.Camera2StreamConfigurationMap).getAction(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1(com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleCallbacks ttpRationaleCallbacks, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpRationaleUIState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$5$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = permissionController;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizes = ttpRationaleCallbacks;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = state;
    }
}
