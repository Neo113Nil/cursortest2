package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0011\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupDao;", "", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;", "cardIdGroupEntity", "", "addCardIdGroupEntity", "(Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardIdGroupEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getCardIdGroupEntityByPayPalCardId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardIdGroupEntityByDigitizedCardId", "getCardIdGroupEntityByDeviceWalletServiceCardId", "", "getCardIdGroupsEntity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceWalletServiceCardId", "deleteCardIdGroupEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CardIdGroupDao {
    java.lang.Object addCardIdGroupEntity(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity cardIdGroupEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteCardIdGroupEntity(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getCardIdGroupEntityByDeviceWalletServiceCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation);

    java.lang.Object getCardIdGroupEntityByDigitizedCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation);

    java.lang.Object getCardIdGroupEntityByPayPalCardId(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity> continuation);

    java.lang.Object getCardIdGroupsEntity(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardIdGroupEntity>> continuation);
}
