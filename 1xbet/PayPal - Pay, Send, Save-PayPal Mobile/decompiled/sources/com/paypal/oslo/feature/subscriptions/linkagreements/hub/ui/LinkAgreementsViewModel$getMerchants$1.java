package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$getMerchants$1", f = "LinkAgreementsViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {}, nl = {181}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsViewModel$getMerchants$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.getHighSpeedVideoFpsRanges.getState().getValue() instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Loading) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Link agreements is already fetching...", null, null, 6, null);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Loading link agreements", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementType", this.getHighSpeedVideoFpsRanges.getAgreementType().toString())), null, 4, null);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Loading.INSTANCE);
            getAvailableMerchantsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase.invoke$default(getAvailableMerchantsUseCase, this.getHighSpeedVideoFpsRanges.getAgreementType(), null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel linkAgreementsViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Available merchants loaded successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()))), null, 4, null);
            mutableStateFlow3 = linkAgreementsViewModel.getHighSpeedVideoSizes;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Success(list));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow2 = linkAgreementsViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsState.Error(subscriptionsError.toErrorContext()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$getMerchants$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$getMerchants$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsViewModel$getMerchants$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel linkAgreementsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel$getMerchants$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = linkAgreementsViewModel;
    }
}
