package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleWalletFILinked$1", f = "PersonalInfoViewModel.kt", i = {0}, l = {314}, m = "invokeSuspend", n = {"sessionId"}, nl = {315}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$handleWalletFILinked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase getWalletFundingInstrumentsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError fiLinkError;
        com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument fundingInstrument;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                camera2StreamConfigurationMap = "";
            }
            getWalletFundingInstrumentsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getWalletFundingInstrumentsUseCase.invoke2(camera2StreamConfigurationMap, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked walletFILinked = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            try {
                java.util.List list = data instanceof java.util.List ? (java.util.List) data : null;
                if (list == null) {
                    list = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List list2 = list;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                for (java.lang.Object obj2 : list2) {
                    linkedHashMap.put(((com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) obj2).getId(), obj2);
                }
                java.util.List<java.lang.String> ids = walletFILinked.getIds();
                int i2 = 0;
                if (!(ids instanceof java.util.Collection) || !ids.isEmpty()) {
                    java.util.Iterator<T> it = ids.iterator();
                    while (it.hasNext()) {
                        if (linkedHashMap.containsKey((java.lang.String) it.next()) && (i2 = i2 + 1) < 0) {
                            kotlin.collections.CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i2 == 0) {
                    fiLinkError = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError.NONE_FOUND;
                } else {
                    fiLinkError = i2 < walletFILinked.getIds().size() ? com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.FiLinkError.PARTIALLY_LINKED : null;
                }
                if (i2 > 0) {
                    java.util.Iterator<T> it2 = walletFILinked.getIds().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            fundingInstrument = null;
                            break;
                        }
                        fundingInstrument = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) linkedHashMap.get((java.lang.String) it2.next());
                        if (fundingInstrument != null) {
                            break;
                        }
                    }
                } else {
                    fundingInstrument = (com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument) kotlin.collections.CollectionsKt.firstOrNull(list);
                }
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoaded(list, fundingInstrument, fiLinkError));
            } catch (java.lang.Exception unused) {
                personalInfoUiMapper2 = personalInfoViewModel.getOutputFormats;
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError(personalInfoUiMapper2.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            personalInfoUiMapper = personalInfoViewModel2.getOutputFormats;
            personalInfoViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FundingInstrumentsLoadError(personalInfoUiMapper.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleWalletFILinked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleWalletFILinked$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$handleWalletFILinked$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.WalletFILinked walletFILinked, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleWalletFILinked$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = personalInfoViewModel;
        this.getHighSpeedVideoSizes = walletFILinked;
    }
}
