package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1", f = "TtpActivationSuccessScreen.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.permission.ui.controller.PermissionController Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt.handlePermissions(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1(android.content.Context context, com.paypal.oslo.core.permission.ui.controller.PermissionController permissionController, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt$TtpActivationSuccessScreen$6$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = permissionController;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }
}
