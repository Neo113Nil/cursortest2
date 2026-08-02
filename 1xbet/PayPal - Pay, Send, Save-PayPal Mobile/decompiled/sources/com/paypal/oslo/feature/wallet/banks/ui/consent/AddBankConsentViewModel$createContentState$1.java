package com.paypal.oslo.feature.wallet.banks.ui.consent;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel$createContentState$1", f = "AddBankConsentViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 241}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankConsentViewModel$createContentState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0057, code lost:
    
        if (r15 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007a, code lost:
    
        if (r15 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetInstantBankConfirmationAggregatorUseCase getInstantBankConfirmationAggregatorUseCase;
        com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase getOpenBankingAggregatorUseCase;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value3;
        com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Content content;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object value5;
        java.util.ArrayList emptyList;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        java.lang.Object value6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Loading.INSTANCE));
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAddBankConsentFlowContentId().getIsFabFlow()) {
                getOpenBankingAggregatorUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase.invoke$default(getOpenBankingAggregatorUseCase, null, null, this, 3, null);
            } else if (this.getHighResolutionOutputSizeshNQ4ISI.getInstantBankConfirmationAggregatorParams() != null) {
                getInstantBankConfirmationAggregatorUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 2;
                obj = getInstantBankConfirmationAggregatorUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI.getInstantBankConfirmationAggregatorParams(), this);
            } else {
                throw new java.lang.IllegalArgumentException("Instant Bank Confirmation Aggregator Params cannot be null for non FAB flow.".toString());
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            bankAggregator = (com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator) obj;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult instantBankConfirmationAggregatorResult = (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorResult) obj;
            mutableStateFlow6 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            do {
                value5 = mutableStateFlow6.getValue();
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> institutions = instantBankConfirmationAggregatorResult.getInstitutions();
                if (institutions == null) {
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> list = institutions;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) it.next());
                    }
                    emptyList = arrayList;
                }
            } while (!mutableStateFlow6.compareAndSet(value5, emptyList));
            java.lang.String bankName = instantBankConfirmationAggregatorResult.getBankName();
            java.lang.String str = bankName == null ? "" : bankName;
            java.lang.String inlineLogoUrl = instantBankConfirmationAggregatorResult.getInlineLogoUrl();
            java.lang.String primaryLogoUrl = instantBankConfirmationAggregatorResult.getPrimaryLogoUrl();
            java.lang.String externalBankId = instantBankConfirmationAggregatorResult.getExternalBankId();
            com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails = new com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails(str, inlineLogoUrl, primaryLogoUrl, externalBankId == null ? "" : externalBankId, instantBankConfirmationAggregatorResult.getInternalInstitutionId(), "", "", null, instantBankConfirmationAggregatorResult.getIntegrationType());
            if (instantBankConfirmationAggregatorResult.getInstitutions() != null) {
                java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails> institutions2 = instantBankConfirmationAggregatorResult.getInstitutions();
                if (!(institutions2 instanceof java.util.Collection) || !institutions2.isEmpty()) {
                    java.util.Iterator<T> it2 = institutions2.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) it2.next()).getExternalBankId(), instantBankConfirmationBankDetails.getExternalBankId())) {
                            break;
                        }
                    }
                }
            }
            mutableStateFlow7 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            do {
                value6 = mutableStateFlow7.getValue();
            } while (!mutableStateFlow7.compareAndSet(value6, kotlin.collections.CollectionsKt.plus((java.util.Collection) value6, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(instantBankConfirmationBankDetails))));
            bankAggregator = instantBankConfirmationAggregatorResult.getAggregator();
        }
        if (bankAggregator == null || bankAggregator == com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator.UNKNOWN) {
            mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Error(0, 0, 0, 7, null)));
        } else {
            com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            addBankConsentViewModel.getHighSpeedVideoSizesFor = new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.Content(bankAggregator, new com.paypal.oslo.feature.wallet.banks.ui.consent.model.ConsentData(addBankConsentViewModel.getAddBankConsentFlowContentId().getTitleRes(), this.getHighResolutionOutputSizeshNQ4ISI.getAddBankConsentFlowContentId().getBodyRes(), this.getHighResolutionOutputSizeshNQ4ISI.getAddBankConsentFlowContentId().getDisclaimerText(bankAggregator), this.getHighResolutionOutputSizeshNQ4ISI.getAddBankConsentFlowContentId().getLegalDisclaimerLinks(), this.getHighResolutionOutputSizeshNQ4ISI.getAddBankConsentFlowContentId().getValueProps()));
            mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (((java.util.List) mutableStateFlow3.getValue()).size() > 1) {
                mutableStateFlow5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                do {
                    value4 = mutableStateFlow5.getValue();
                } while (!mutableStateFlow5.compareAndSet(value4, com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel.State.NeoBanks.INSTANCE));
            } else {
                mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow4.getValue();
                    content = addBankConsentViewModel2.getHighSpeedVideoSizesFor;
                } while (!mutableStateFlow4.compareAndSet(value3, content));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel$createContentState$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel$createContentState$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddBankConsentViewModel$createContentState$1(com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel addBankConsentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.consent.AddBankConsentViewModel$createContentState$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addBankConsentViewModel;
    }
}
