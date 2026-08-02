package com.paypal.oslo.feature.paymentreadylite.data.db.dao;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/paymentreadylite/data/db/dao/PaymentReadyApiStatusDao;", "", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;", "getLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;", "status", "getLatestByStatus", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/model/PaymentRecommendationApiStatusEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "save", "(Lcom/paypal/oslo/feature/paymentreadylite/data/db/entity/PaymentReadyApiStatusEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PaymentReadyApiStatusDao {
    java.lang.Object deleteAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getLatest(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity> continuation);

    java.lang.Object getLatestByStatus(com.paypal.oslo.feature.paymentreadylite.data.db.model.PaymentRecommendationApiStatusEnum paymentRecommendationApiStatusEnum, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity> continuation);

    java.lang.Object save(com.paypal.oslo.feature.paymentreadylite.data.db.entity.PaymentReadyApiStatusEntity paymentReadyApiStatusEntity, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
