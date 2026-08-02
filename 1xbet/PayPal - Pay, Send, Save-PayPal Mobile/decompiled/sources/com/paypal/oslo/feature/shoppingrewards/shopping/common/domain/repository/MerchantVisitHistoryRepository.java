package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "", "", "merchantId", "", "isMerchantSeen", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "markMerchantAsSeen"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MerchantVisitHistoryRepository {
    java.lang.Object isMerchantSeen(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object markMerchantAsSeen(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
