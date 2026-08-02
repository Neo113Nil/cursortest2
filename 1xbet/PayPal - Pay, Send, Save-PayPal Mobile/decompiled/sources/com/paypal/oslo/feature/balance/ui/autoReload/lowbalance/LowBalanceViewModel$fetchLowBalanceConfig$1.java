package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$fetchLowBalanceConfig$1", f = "LowBalanceViewModel.kt", i = {2, 2, 2, 2, 3, 3, 3, 3}, l = {101, 102, 104, 105}, m = "invokeSuspend", n = {"this_$iv", "config", "$i$f$fold", "$i$a$-fold-LowBalanceViewModel$fetchLowBalanceConfig$1$2", "this_$iv", "config", "$i$f$fold", "$i$a$-fold-LowBalanceViewModel$fetchLowBalanceConfig$1$3"}, nl = {102, 236, 238, 239}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class LowBalanceViewModel$fetchLowBalanceConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel getInputFormats;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r9 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r9 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel;
        com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase;
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lowBalanceViewModel = this.getInputFormats;
            getAccountTypeUseCase = lowBalanceViewModel.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = lowBalanceViewModel;
            this.getInputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(getAccountTypeUseCase.invoke(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        function12 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12.invoke(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoSizesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel2 = this.getInputFormats;
                if (ior instanceof arrow.core.Ior.Left) {
                    input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataError.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) ((arrow.core.Ior.Right) ior).getValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalance = autoReloadConfig.getLowBalance();
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig);
                    this.getHighSpeedVideoSizesFor = eventDispatcher;
                    this.Camera2StreamConfigurationMap = 0;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getInputSizeshNQ4ISI = 3;
                    obj = com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.access$createLoadedEvent(lowBalanceViewModel2, lowBalance, this);
                    if (obj != coroutine_suspended) {
                        function12 = eventDispatcher;
                        function12.invoke(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) both.getRightValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent, kotlin.Unit> eventDispatcher2 = input.getEventDispatcher();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalance2 = autoReloadConfig2.getLowBalance();
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig2);
                    this.getHighSpeedVideoSizesFor = eventDispatcher2;
                    this.Camera2StreamConfigurationMap = 0;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getInputSizeshNQ4ISI = 4;
                    obj = com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel.access$createLoadedEvent(lowBalanceViewModel2, lowBalance2, this);
                    if (obj != coroutine_suspended) {
                        function1 = eventDispatcher2;
                        function1.invoke(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            lowBalanceViewModel = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lowBalanceViewModel.isConsumerAccountType = ((java.lang.Boolean) obj).booleanValue();
        getAutoReloadInitialConfigUseCase = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputSizeshNQ4ISI = 2;
        obj = com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase.invoke$default(getAutoReloadInitialConfigUseCase, false, this, 1, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$fetchLowBalanceConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$fetchLowBalanceConfig$1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowBalanceViewModel$fetchLowBalanceConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceStateStore, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel$fetchLowBalanceConfig$1> continuation) {
        super(2, continuation);
        this.getInputFormats = lowBalanceViewModel;
        this.getHighSpeedVideoFpsRanges = input;
    }
}
