package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1", f = "LegalViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class LegalViewModel$loadLegalItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase getLegalScreenItemsUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getLegalScreenItemsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> mapToUiData = com.paypal.oslo.feature.settings.legal.ui.mapper.LegalItemUiMapper.INSTANCE.mapToUiData(getLegalScreenItemsUseCase.invoke());
            mviStateStore = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            mviStateStore.onEvent(new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent.DataEvent.LegalItemsLoaded(mapToUiData, kotlin.jvm.internal.Intrinsics.areEqual(java.util.Locale.getDefault().getCountry(), java.util.Locale.US.getCountry())));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalViewModel$loadLegalItems$1(com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = legalViewModel;
    }
}
