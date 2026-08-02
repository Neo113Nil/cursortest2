package com.paypal.android.taptopay.domain.repository.card;

@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0007J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u001c0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u0014J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001e0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010\u0014J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\"\u0010\u0014J\u001e\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020#0\u0010H¦@¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010'J$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b*\u0010\u0014J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0004H&¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0004H&¢\u0006\u0004\b.\u0010-J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020/0\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b0\u0010\u0014J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b2\u0010\u0014J$\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002030\u00102\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b4\u0010\u0014J\u0010\u00105\u001a\u00020\u0011H¦@¢\u0006\u0004\b5\u0010%"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/card/CardRepository;", "", "", "digitizedCardId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/android/taptopay/domain/model/card/AddCardState;", "activateCard", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "", "encryptedCardInfo", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "cardScheme", "consumerEntryMode", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "([BLcom/paypal/android/taptopay/domain/model/CardScheme;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "continueAddCard", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/DeleteCardError;", "deleteCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "waitForRefresh", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "getAllCards", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardError;", "getCard", "Lcom/paypal/android/taptopay/domain/model/card/GetCardArtError;", "getCardArt", "Lcom/paypal/android/taptopay/domain/model/card/CardMetadata;", "Lcom/paypal/android/taptopay/domain/model/card/GetCardMetaDataError;", "getCardMetaData", "Lcom/paypal/android/taptopay/domain/model/card/GetDefaultCardError;", "getDefaultCard", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWalletID", "()Ljava/lang/String;", "getWalletPartner", "Lcom/paypal/android/taptopay/domain/model/card/IsDefaultCardError;", "isDefaultCard", "Lcom/paypal/android/taptopay/domain/model/card/CardStateChange;", "observeCardState", "()Lkotlinx/coroutines/flow/Flow;", "observeCards", "Lcom/paypal/android/taptopay/domain/model/card/ResumeCardError;", "resumeCard", "Lcom/paypal/android/taptopay/domain/model/card/SetDefaultCardError;", "setDefaultCard", "Lcom/paypal/android/taptopay/domain/model/card/SuspendCardError;", "suspendCard", "wipeAllTokens"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CardRepository {
    kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> activateCard(java.lang.String digitizedCardId);

    kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> addCard(byte[] encryptedCardInfo, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String consumerEntryMode);

    kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.AddCardState> continueAddCard(java.lang.String digitizedCardId);

    java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.DeleteCardError>> continuation);

    java.lang.Object getAllCards(boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>, com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation);

    java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetCardError>> continuation);

    java.lang.Object getCardArt(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<byte[], com.paypal.android.taptopay.domain.model.card.GetCardArtError>> continuation);

    java.lang.Object getCardMetaData(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.CardMetadata, com.paypal.android.taptopay.domain.model.card.GetCardMetaDataError>> continuation);

    java.lang.Object getDefaultCard(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<com.paypal.android.taptopay.domain.model.card.DigitizedCard, com.paypal.android.taptopay.domain.model.card.GetDefaultCardError>> continuation);

    java.lang.String getWalletID();

    java.lang.String getWalletPartner();

    java.lang.Object isDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<java.lang.Boolean, com.paypal.android.taptopay.domain.model.card.IsDefaultCardError>> continuation);

    kotlinx.coroutines.flow.Flow<com.paypal.android.taptopay.domain.model.card.CardStateChange> observeCardState();

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>> observeCards();

    java.lang.Object resumeCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.ResumeCardError>> continuation);

    java.lang.Object setDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SetDefaultCardError>> continuation);

    java.lang.Object suspendCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.card.SuspendCardError>> continuation);

    java.lang.Object wipeAllTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ kotlinx.coroutines.flow.Flow addCard$default(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, byte[] bArr, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCard");
            }
            if ((i & 2) != 0) {
                cardScheme = null;
            }
            if ((i & 4) != 0) {
                str = "UNKNOWN";
            }
            return cardRepository.addCard(bArr, cardScheme, str);
        }

        public static /* synthetic */ java.lang.Object getAllCards$default(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllCards");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return cardRepository.getAllCards(z, continuation);
        }
    }
}
