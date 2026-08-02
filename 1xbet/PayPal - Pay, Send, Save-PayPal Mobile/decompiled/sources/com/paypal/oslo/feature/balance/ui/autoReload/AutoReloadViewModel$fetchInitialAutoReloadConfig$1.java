package com.paypal.oslo.feature.balance.ui.autoReload;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1", f = "AutoReloadViewModel.kt", i = {3, 3, 3, 3, 4, 4, 4, 4}, l = {129, 132, 135, 137, 138}, m = "invokeSuspend", n = {"this_$iv", "config", "$i$f$fold", "$i$a$-fold-AutoReloadViewModel$fetchInitialAutoReloadConfig$1$3", "this_$iv", "config", "$i$f$fold", "$i$a$-fold-AutoReloadViewModel$fetchInitialAutoReloadConfig$1$4"}, nl = {131, 193, 197, 199, 200}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadViewModel$fetchInitialAutoReloadConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010c, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.access$onFetchSuccess(r4, r1, r2, r10) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0144, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0138, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel.access$onFetchSuccess(r4, r1, r3, r10) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        if (r11 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005c, code lost:
    
        if (r11 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel;
        com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase;
        com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel2;
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase checkAutoTransferEnabledUseCase;
        com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase getAutoReloadInitialConfigUseCase;
        java.lang.Object rightValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            autoReloadViewModel = this.getHighSpeedVideoSizesFor;
            getAccountTypeUseCase = autoReloadViewModel.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = autoReloadViewModel;
            this.getInputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(getAccountTypeUseCase.invoke(), this);
        } else if (i == 1) {
            autoReloadViewModel = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Ior ior = (arrow.core.Ior) obj;
                com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> input = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel3 = this.getHighSpeedVideoSizesFor;
                if (ior instanceof arrow.core.Ior.Left) {
                    input.getEventDispatcher().invoke(new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent.LoadError((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) ((arrow.core.Ior.Right) ior).getValue();
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig);
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getInputSizeshNQ4ISI = 4;
                } else if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig autoReloadConfig2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadConfig) both.getRightValue();
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadConfig2);
                    this.getHighSpeedVideoSizes = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getInputSizeshNQ4ISI = 5;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            autoReloadViewModel2 = (com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Ior ior2 = (arrow.core.Ior) obj;
            if (ior2 instanceof arrow.core.Ior.Left) {
                rightValue = new com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer(false, null, 3, null);
            } else if (ior2 instanceof arrow.core.Ior.Right) {
                rightValue = ((arrow.core.Ior.Right) ior2).getValue();
            } else {
                if (!(ior2 instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                rightValue = ((arrow.core.Ior.Both) ior2).getRightValue();
            }
            autoReloadViewModel2.getInputSizeshNQ4ISI = (com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer) rightValue;
            getAutoReloadInitialConfigUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = null;
            this.getInputSizeshNQ4ISI = 3;
            obj = com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase.invoke$default(getAutoReloadInitialConfigUseCase, false, this, 1, null);
        }
        autoReloadViewModel.isConsumerAccountType = ((java.lang.Boolean) obj).booleanValue();
        if (!this.getHighSpeedVideoSizesFor.getIsConsumerAccountType()) {
            autoReloadViewModel2 = this.getHighSpeedVideoSizesFor;
            checkAutoTransferEnabledUseCase = autoReloadViewModel2.getInputFormats;
            this.getHighSpeedVideoFpsRanges = autoReloadViewModel2;
            this.getInputSizeshNQ4ISI = 2;
            obj = checkAutoTransferEnabledUseCase.invoke(this);
        }
        getAutoReloadInitialConfigUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputSizeshNQ4ISI = 3;
        obj = com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase.invoke$default(getAutoReloadInitialConfigUseCase, false, this, 1, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadViewModel$fetchInitialAutoReloadConfig$1(com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel autoReloadViewModel, com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadState, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadIntent> input, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadViewModel$fetchInitialAutoReloadConfig$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = autoReloadViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = input;
    }
}
