package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1", f = "TtpEopWebViewScreen.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction> action = this.getHighSpeedVideoFpsRangesFor.getAction();
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (action.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction eopWebViewAction = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(eopWebViewAction, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction.NavigateToSuccessScreen.INSTANCE)) {
                        function0.invoke();
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(eopWebViewAction, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.EopWebViewAction.NavigateBack.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function02.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewViewModel ttpEopWebViewViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpEopWebViewScreenKt$TtpEopWebViewScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = ttpEopWebViewViewModel;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = function02;
    }
}
