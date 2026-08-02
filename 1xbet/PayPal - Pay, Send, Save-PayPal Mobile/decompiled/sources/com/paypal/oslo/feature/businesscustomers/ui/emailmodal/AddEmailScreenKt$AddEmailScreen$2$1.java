package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1", f = "AddEmailScreen.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AddEmailScreenKt$AddEmailScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect> uiEffects = this.getHighSpeedVideoFpsRanges.getUiEffects();
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (uiEffects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect addEmailModalUiEffect = (com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect) obj2;
                    if (!(addEmailModalUiEffect instanceof com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalUiEffect.NavigateBack) addEmailModalUiEffect).getCustomer());
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
        return ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddEmailScreenKt$AddEmailScreen$2$1(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = addEmailViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
