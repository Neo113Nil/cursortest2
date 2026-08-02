package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1", f = "PayAndGetPaidScreen.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect> effects$business_pay_and_get_paid_prodRelease = this.getHighSpeedVideoFpsRangesFor.getEffects$business_pay_and_get_paid_prodRelease();
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (effects$business_pay_and_get_paid_prodRelease.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect payAndGetPaidEffect = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect) obj2;
                    if (payAndGetPaidEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination) {
                        function1.invoke(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination) payAndGetPaidEffect).getDestination());
                    } else {
                        if (!(payAndGetPaidEffect instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        function12.invoke(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet) payAndGetPaidEffect).getFeatureName());
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
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidViewModel payAndGetPaidViewModel, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidScreenKt$PayAndGetPaidScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = payAndGetPaidViewModel;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function12;
    }
}
