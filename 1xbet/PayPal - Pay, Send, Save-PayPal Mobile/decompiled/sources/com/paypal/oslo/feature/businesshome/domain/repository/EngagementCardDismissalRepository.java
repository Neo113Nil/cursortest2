package com.paypal.oslo.feature.businesshome.domain.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\fH¦@¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/repository/EngagementCardDismissalRepository;", "", "", "cardId", "", "dismissedAtMillis", "", "dismissCard", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesshome/domain/model/CardDismissalInfo;", "getDismissalInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAllDismissals", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface EngagementCardDismissalRepository {
    java.lang.Object dismissCard(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getAllDismissals(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo>> continuation);

    java.lang.Object getDismissalInfo(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.model.CardDismissalInfo> continuation);
}
