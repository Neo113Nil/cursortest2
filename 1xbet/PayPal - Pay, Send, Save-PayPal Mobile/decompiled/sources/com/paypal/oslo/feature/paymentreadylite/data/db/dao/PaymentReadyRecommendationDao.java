package com.paypal.oslo.feature.paymentreadylite.data.db.dao;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyRecommendationDao;", "", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;", "entity", "", "save", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyRecommendationEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestRecommendation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentReadyRecommendationDao {
    java.lang.Object deleteAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getLatestRecommendation(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity> continuation);

    java.lang.Object save(com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyRecommendationEntity paymentReadyRecommendationEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
