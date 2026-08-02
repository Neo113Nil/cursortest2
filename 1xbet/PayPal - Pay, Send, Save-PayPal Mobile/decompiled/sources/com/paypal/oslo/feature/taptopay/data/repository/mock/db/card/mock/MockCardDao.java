package com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\nH¦@¢\u0006\u0004\b\u001b\u0010\rJ\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\nH¦@¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\nH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004H¦@¢\u0006\u0004\b \u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/MockCardDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/DigitizedMockCard;", "digitizedMockCard", "", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AddCardMutation.OPERATION_NAME, "(Lcom/paypal/oslo/feature/taptopay/data/repository/mock/db/card/mock/DigitizedMockCard;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardId", "getCard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "status", "resumeCard", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCard", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "getDefaultCard", "", "isDefault", "setDefaultCard", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "resetOtherDefault", "digitizedCardId", "isDefaultCard", "getCardById", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard;", "clear"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MockCardDao {
    java.lang.Object addCard(com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard digitizedMockCard, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteCard(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getCard(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard> continuation);

    com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard getCardById(java.lang.String id);

    java.lang.Object getCards(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.repository.mock.db.card.mock.DigitizedMockCard>> continuation);

    java.lang.Object getDefaultCard(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard> continuation);

    java.lang.Object isDefaultCard(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object resetOtherDefault(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object resumeCard(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object setDefaultCard(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object suspendCard(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
