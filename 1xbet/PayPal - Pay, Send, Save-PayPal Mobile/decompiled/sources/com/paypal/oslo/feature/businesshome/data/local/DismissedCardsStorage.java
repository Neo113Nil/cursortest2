package com.paypal.oslo.feature.businesshome.data.local;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bH¦@¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/local/DismissedCardsStorage;", "", "", "cardId", "", "dismissedAtMillis", "", "setDismissedCard", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDismissedAtMillis", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAllDismissedCards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DismissedCardsStorage {
    java.lang.Object getAllDismissedCards(kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, java.lang.Long>> continuation);

    java.lang.Object getDismissedAtMillis(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Long> continuation);

    java.lang.Object setDismissedCard(java.lang.String str, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
