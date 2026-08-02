package com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1", f = "PlaidViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PlaidViewModel$createPlaidHandler$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getPlaidTokenUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        android.app.Application application;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Loading(false, false, 3, null)));
            getPlaidTokenUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase.invoke$default(getPlaidTokenUseCase, this.getHighSpeedVideoFpsRanges.getFlow(), this.getHighSpeedVideoFpsRanges.getAction(), null, null, this.getHighSpeedVideoFpsRanges.getInstrumentId(), this, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Error.INSTANCE));
        } else {
            com.plaid.link.configuration.LinkTokenConfiguration build = new com.plaid.link.configuration.LinkTokenConfiguration.Builder().token(str).build();
            mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel = this.getHighSpeedVideoFpsRanges;
            do {
                value2 = mutableStateFlow2.getValue();
                application = plaidViewModel.Camera2StreamConfigurationMap;
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel.State.Success(com.plaid.link.Plaid.create(application, build))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaidViewModel$createPlaidHandler$1(com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel plaidViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.PlaidViewModel$createPlaidHandler$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = plaidViewModel;
    }
}
