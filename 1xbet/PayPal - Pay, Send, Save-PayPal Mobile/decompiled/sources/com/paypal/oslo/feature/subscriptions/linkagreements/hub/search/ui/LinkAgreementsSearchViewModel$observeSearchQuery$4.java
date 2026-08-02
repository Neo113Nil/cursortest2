package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "searchQuery", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/SearchQuery;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4", f = "LinkAgreementsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsSearchViewModel$observeSearchQuery$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery searchQuery = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.access$performSearch(this.getHighSpeedVideoFpsRanges, searchQuery.getHighSpeedVideoFpsRanges, searchQuery.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.SearchQuery searchQuery, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4) create(searchQuery, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4 linkAgreementsSearchViewModel$observeSearchQuery$4 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4(this.getHighSpeedVideoFpsRanges, continuation);
        linkAgreementsSearchViewModel$observeSearchQuery$4.getHighResolutionOutputSizeshNQ4ISI = obj;
        return linkAgreementsSearchViewModel$observeSearchQuery$4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsSearchViewModel$observeSearchQuery$4(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel linkAgreementsSearchViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel$observeSearchQuery$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = linkAgreementsSearchViewModel;
    }
}
