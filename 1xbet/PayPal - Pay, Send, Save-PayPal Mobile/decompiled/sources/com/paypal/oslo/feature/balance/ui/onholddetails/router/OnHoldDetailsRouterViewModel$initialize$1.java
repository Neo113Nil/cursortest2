package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$initialize$1", f = "OnHoldDetailsRouterViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {145, 150, 151}, m = "invokeSuspend", n = {"this_$iv", "balance", "$i$f$fold", "$i$a$-fold-OnHoldDetailsRouterViewModel$initialize$1$2", "this_$iv", "balance", "$i$f$fold", "$i$a$-fold-OnHoldDetailsRouterViewModel$initialize$1$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 200, 201}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class OnHoldDetailsRouterViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.access$onBalanceSuccess(r1, r2, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        if (com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel.access$onBalanceSuccess(r1, r3, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r10 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase getBalanceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.getInputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Loading.INSTANCE);
            getBalanceUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = getBalanceUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel = this.getHighSpeedVideoSizesFor;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.balance.LoggerKt.log, "Failed to fetch balance for on-hold router", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue())), null, null, 12, null);
            mutableStateFlow2 = onHoldDetailsRouterViewModel.getInputSizeshNQ4ISI;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.balance.domain.model.Balance balance = (com.paypal.oslo.feature.balance.domain.model.Balance) ((arrow.core.Ior.Right) ior).getValue();
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.balance.domain.model.Balance balance2 = (com.paypal.oslo.feature.balance.domain.model.Balance) both.getRightValue();
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balance2);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$initialize$1(this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnHoldDetailsRouterViewModel$initialize$1(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = onHoldDetailsRouterViewModel;
    }
}
