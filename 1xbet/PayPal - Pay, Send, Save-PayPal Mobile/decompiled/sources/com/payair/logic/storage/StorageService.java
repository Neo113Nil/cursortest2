package com.payair.logic.storage;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H&¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/payair/logic/storage/StorageService;", "", "", "clear", "()V", "", "networkTokenReference", "deleteTokenAlias", "(Ljava/lang/String;)V", "", "Lcom/payair/model/NetworkTokenReference;", "getNetworkTokenReferencesPendingHandle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenAlias", "(Ljava/lang/String;)Ljava/lang/String;", "", "isRegistrationComplete", "()Z", "networkTokenReferences", "setNetworkTokenReferences", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "setRegistrationComplete", "(Z)V", "alias", "setTokenAlias", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StorageService {
    void clear();

    void deleteTokenAlias(java.lang.String networkTokenReference);

    java.lang.Object getNetworkTokenReferencesPendingHandle(kotlin.coroutines.Continuation<? super java.util.Set<com.payair.model.NetworkTokenReference>> continuation);

    java.lang.String getTokenAlias(java.lang.String networkTokenReference);

    boolean isRegistrationComplete();

    java.lang.Object setNetworkTokenReferences(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void setRegistrationComplete(boolean complete);

    void setTokenAlias(java.lang.String networkTokenReference, java.lang.String alias);
}
