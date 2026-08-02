package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1", f = "BusinessHomeViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessHomeViewModel$observeUserState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.UserStore userStore;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            userStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
            final com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (userState.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.channels.Channel channel;
                    if (com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.access$isBusiness(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.this, (com.paypal.oslo.core.userstore.model.UserState) obj2)) {
                        channel = com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel.this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object send = channel.send(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeEffect.NavigateToBusinessExperienceDisabled.INSTANCE, continuation);
                        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
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
        return ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessHomeViewModel$observeUserState$1(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$observeUserState$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = businessHomeViewModel;
    }
}
