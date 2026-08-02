package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$performSearch$1", f = "LinkAgreementsSearchViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsSearchViewModel$performSearch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading loading;
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.access$isPopularSearchType(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes) && com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.access$checkPopularCache(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes)) {
                return kotlin.Unit.INSTANCE;
            }
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState linkAgreementsSearchScreenState = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState) mutableStateFlow2.getValue();
            if (this.Camera2StreamConfigurationMap) {
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                loading = ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState) mutableStateFlow3.getValue()).getContent();
            } else {
                loading = com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.MerchantSearchContent.Loading.INSTANCE;
            }
            mutableStateFlow.setValue(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenState.copy$default(linkAgreementsSearchScreenState, this.getHighSpeedVideoSizes, null, loading, 2, null));
            getAvailableMerchantsUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getAvailableMerchantsUseCase.invoke(this.getHighSpeedVideoFpsRangesFor.getAgreementType(), this.getHighSpeedVideoSizes, this);
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
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.access$handleSuccessOnSuggestedMerchants(linkAgreementsSearchViewModel, str, (java.util.List) ((arrow.core.Either.Right) either).getValue());
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.access$handleErrorOnSuggestedMerchants(linkAgreementsSearchViewModel, str, (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Either.Left) either).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$performSearch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$performSearch$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsSearchViewModel$performSearch$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$performSearch$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = linkAgreementsSearchViewModel;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = z;
    }
}
