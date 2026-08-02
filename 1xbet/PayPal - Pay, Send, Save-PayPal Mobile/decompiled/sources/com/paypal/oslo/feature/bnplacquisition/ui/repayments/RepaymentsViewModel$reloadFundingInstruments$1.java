package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$reloadFundingInstruments$1", f = "RepaymentsViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {}, nl = {197}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class RepaymentsViewModel$reloadFundingInstruments$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getPaymentFundingInstrumentsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPaymentFundingInstrumentsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            sessionStorage = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                camera2StreamConfigurationMap = "";
            }
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getPaymentFundingInstrumentsUseCase.invoke2(camera2StreamConfigurationMap, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            java.util.ArrayList arrayList = null;
            java.util.List list = data instanceof java.util.List ? (java.util.List) data : null;
            if (list != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            repaymentsUiMapper = repaymentsViewModel.getHighSpeedVideoSizes;
            java.util.List list2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(repaymentsUiMapper.toUiFundingInstrument((com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) it.next()));
            }
            repaymentsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloaded(arrayList3, str));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel2 = this.getHighSpeedVideoFpsRanges;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to reload funding instruments", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getTag())), null, 4, null);
            repaymentsViewModel2.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.OnFundingInstrumentsReloadFailed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$reloadFundingInstruments$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$reloadFundingInstruments$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepaymentsViewModel$reloadFundingInstruments$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$reloadFundingInstruments$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = repaymentsViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
