package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel$provisionInstruments$2", f = "ProvisionInstrumentsViewModel.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, nl = {160}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ProvisionInstrumentsViewModel$provisionInstruments$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase provisionInstrumentsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            provisionInstrumentsUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = provisionInstrumentsUseCase.invoke(this);
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
        if (either instanceof arrow.core.Either.Left) {
            if (kotlin.jvm.internal.Intrinsics.areEqual((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError) ((arrow.core.Either.Left) either).getValue(), com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentsError.Business.InstrumentCountLimitReached.INSTANCE)) {
                mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                do {
                    value4 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value4, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.InstrumentCountLimitedExceeded.INSTANCE));
            } else {
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                do {
                    value3 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.TechnicalError.INSTANCE));
            }
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Either.Right right = (arrow.core.Either.Right) either;
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> cards = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getCards();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(cards, 10));
            java.util.Iterator<T> it = cards.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo$default((com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo) it.next(), (java.util.Map) null, 1, (java.lang.Object) null));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> bankAccounts = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getBankAccounts();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(bankAccounts, 10));
            java.util.Iterator<T> it2 = bankAccounts.iterator();
            while (it2.hasNext()) {
                arrayList3.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo$default((com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo) it2.next(), (java.util.Map) null, 1, (java.lang.Object) null));
            }
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList2, (java.lang.Iterable) arrayList3);
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> paymentTokens = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getPaymentTokens();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(paymentTokens, 10));
            java.util.Iterator<T> it3 = paymentTokens.iterator();
            while (it3.hasNext()) {
                arrayList4.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo$default((com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo) it3.next(), (java.util.Map) null, 1, (java.lang.Object) null));
            }
            java.util.List plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) plus, (java.lang.Iterable) arrayList4);
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> remainingCards = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getRemainingCards();
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingCards, 10));
            java.util.Iterator<T> it4 = remainingCards.iterator();
            while (it4.hasNext()) {
                arrayList5.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo((com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo) it4.next(), ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getCardsErrorMessage()));
            }
            java.util.ArrayList arrayList6 = arrayList5;
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> remainingBankAccounts = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getRemainingBankAccounts();
            java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingBankAccounts, 10));
            java.util.Iterator<T> it5 = remainingBankAccounts.iterator();
            while (it5.hasNext()) {
                arrayList7.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo((com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo) it5.next(), ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getBankAccountsErrorMessage()));
            }
            java.util.List plus3 = kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList6, (java.lang.Iterable) arrayList7);
            java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> remainingPaymentTokens = ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getRemainingPaymentTokens();
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(remainingPaymentTokens, 10));
            java.util.Iterator<T> it6 = remainingPaymentTokens.iterator();
            while (it6.hasNext()) {
                arrayList8.add(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModelKt.toInstrumentInfo((com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo) it6.next(), ((com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) right.getValue()).getPaymentTokenErrorMessage()));
            }
            java.util.List plus4 = kotlin.collections.CollectionsKt.plus((java.util.Collection) plus3, (java.lang.Iterable) arrayList8);
            if (plus2.isEmpty()) {
                mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Error.InstrumentLinkingError(plus4)));
            } else {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                java.lang.String str = this.getHighSpeedVideoSizes;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.UiState.Success(new com.paypal.oslo.feature.wallet.amexandp3.ui.LinkingResult(plus2, plus4, str))));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel$provisionInstruments$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel$provisionInstruments$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisionInstrumentsViewModel$provisionInstruments$2(com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel provisionInstrumentsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel$provisionInstruments$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = provisionInstrumentsViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
