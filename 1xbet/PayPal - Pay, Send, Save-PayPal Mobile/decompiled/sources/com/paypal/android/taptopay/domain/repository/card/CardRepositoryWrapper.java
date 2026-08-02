package com.paypal.android.taptopay.domain.repository.card;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b \u0010!J&\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\"0\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b#\u0010\u001aJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$0\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b%\u0010\u001aJ$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010\u001aJ\u001e\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020)0\u0016H\u0096@¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010-J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020/0\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b0\u0010\u001aJ\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002010\nH\u0016¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\nH\u0016¢\u0006\u0004\b4\u00103J$\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002050\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b6\u0010\u001aJ$\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002070\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b8\u0010\u001aJ$\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002090\u00162\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b:\u0010\u001aJ\u0010\u0010;\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b;\u0010+R\u0014\u0010>\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010<\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010BR\u0014\u0010C\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010@"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/card/CardRepositoryWrapper;", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "thalesRepository", "payairRepository", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "implementationSelector", "<init>", "(Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;)V", "", "digitizedCardId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "activateCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "encryptedCardInfo", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "cardScheme", "consumerEntryMode", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "([BLcom/paypal/android/taptopay/domain/model/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "continueAddCard", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/DeleteCardError;", "deleteCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "waitForRefresh", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "getAllCards", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "getCard", "Lcom/paypal/android/taptopay/domain/model/card/GetCardArtError;", "getCardArt", "Lcom/paypal/android/taptopay/domain/model/card/CardMetadata;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardMetaDataError;", "getCardMetaData", "Lcom/paypal/android/taptopay/domain/model/card/GetDefaultCardError;", "getDefaultCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletID", "()Ljava/lang/String;", "getWalletPartner", "Lcom/paypal/android/taptopay/domain/model/card/IsDefaultCardError;", "isDefaultCard", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;", "observeCardState", "()Lkotlinx/coroutines/flow/Flow;", "observeCards", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "resumeCard", "Lcom/paypal/android/taptopay/domain/model/card/SetDefaultCardError;", "setDefaultCard", "Lcom/paypal/android/taptopay/domain/model/card/SuspendCardError;", "suspendCard", "wipeAllTokens", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "Camera2StreamConfigurationMap", "()Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardRepositoryWrapper implements com.paypal.android.taptopay.domain.repository.card.CardRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.di.ImplementationSelector getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.domain.repository.card.CardRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CardRepositoryWrapper(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardRepository2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(implementationSelector, "");
        this.getHighSpeedVideoFpsRangesFor = cardRepository;
        this.Camera2StreamConfigurationMap = cardRepository2;
        this.getHighSpeedVideoSizes = implementationSelector;
    }

    private final com.paypal.android.taptopay.domain.repository.card.CardRepository getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.String selectedVendor = this.getHighSpeedVideoSizes.getSelectedVendor();
        return kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "payair") ? this.Camera2StreamConfigurationMap : kotlin.jvm.internal.Intrinsics.areEqual(selectedVendor, "thales") ? this.getHighSpeedVideoFpsRangesFor : this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> addCard(byte[] encryptedCardInfo, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedCardInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        return getHighResolutionOutputSizeshNQ4ISI().addCard(encryptedCardInfo, cardScheme, consumerEntryMode);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> activateCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        return getHighResolutionOutputSizeshNQ4ISI().activateCard(digitizedCardId);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> continueAddCard(java.lang.String digitizedCardId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardId, "");
        return getHighResolutionOutputSizeshNQ4ISI().continueAddCard(digitizedCardId);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getAllCards(boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>, com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().getAllCards(z, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().getCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().deleteCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object resumeCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.ResumeCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().resumeCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object suspendCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SuspendCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().suspendCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getDefaultCard(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().getDefaultCard(continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object setDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().setDefaultCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object isDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().isDefaultCard(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getCardArt(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<byte[], com.paypal.android.taptopay.domain.model.card.GetCardArtError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().getCardArt(str, continuation);
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.CardStateChange> observeCardState() {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighSpeedVideoSizes.getVendorFlow(), new com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCardState$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> observeCards() {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(this.getHighSpeedVideoSizes.getVendorFlow(), new com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper$observeCards$$inlined$flatMapLatest$1(null, this));
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletPartner() {
        return getHighResolutionOutputSizeshNQ4ISI().getWalletPartner();
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.String getWalletID() {
        return getHighResolutionOutputSizeshNQ4ISI().getWalletID();
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object wipeAllTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object wipeAllTokens = getHighResolutionOutputSizeshNQ4ISI().wipeAllTokens(continuation);
        return wipeAllTokens == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wipeAllTokens : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.android.taptopay.domain.repository.card.CardRepository
    public final java.lang.Object getCardMetaData(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.CardMetadata, com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError>> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI().getCardMetaData(str, continuation);
    }
}
