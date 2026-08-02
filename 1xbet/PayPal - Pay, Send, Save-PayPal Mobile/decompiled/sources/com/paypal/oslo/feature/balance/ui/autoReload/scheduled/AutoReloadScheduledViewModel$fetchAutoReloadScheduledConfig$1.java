package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1", f = "AutoReloadScheduledViewModel.kt", i = {2, 2, 2, 2, 3, 3, 3, 3}, l = {106, 107, 109, 110}, m = "invokeSuspend", n = {"this_$iv", "config", "$i$f$fold", "$i$a$-fold-AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1$2", "this_$iv", "config", "$i$f$fold", "$i$a$-fold-AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1$3"}, nl = {107, 225, 227, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getOutputMinFrameDuration;

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
        com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel;
        com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase;
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            autoReloadScheduledViewModel = this.getOutputMinFrameDuration;
            getAccountTypeUseCase = autoReloadScheduledViewModel.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = autoReloadScheduledViewModel;
            this.getInputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(getAccountTypeUseCase.invoke(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        function12 = (kotlin.jvm.functions.Function1) this.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12.invoke(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) this.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> input = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel2 = this.getOutputMinFrameDuration;
                if (ior instanceof arrow.core.Ior.Left) {
                    input.getEventDispatcher().invoke(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent.OnDataError.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) ((arrow.core.Ior.Right) ior).getValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent, kotlin.Unit> eventDispatcher = input.getEventDispatcher();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduled = autoReloadConfig.getScheduled();
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig);
                    this.getOutputFormats = eventDispatcher;
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getInputSizeshNQ4ISI = 3;
                    obj = com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.access$createLoadedEvent(autoReloadScheduledViewModel2, scheduled, this);
                    if (obj != coroutine_suspended) {
                        function12 = eventDispatcher;
                        function12.invoke(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) both.getRightValue();
                    kotlin.jvm.functions.Function1<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent, kotlin.Unit> eventDispatcher2 = input.getEventDispatcher();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduled2 = autoReloadConfig2.getScheduled();
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig2);
                    this.getOutputFormats = eventDispatcher2;
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getInputSizeshNQ4ISI = 4;
                    obj = com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel.access$createLoadedEvent(autoReloadScheduledViewModel2, scheduled2, this);
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
            autoReloadScheduledViewModel = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        autoReloadScheduledViewModel.isConsumerAccountType = ((java.lang.Boolean) obj).booleanValue();
        getAutoReloadInitialConfigUseCase = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputSizeshNQ4ISI = 2;
        obj = com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase.invoke$default(getAutoReloadInitialConfigUseCase, false, this, 1, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel$fetchAutoReloadScheduledConfig$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = autoReloadScheduledViewModel;
        this.Camera2StreamConfigurationMap = input;
    }
}
