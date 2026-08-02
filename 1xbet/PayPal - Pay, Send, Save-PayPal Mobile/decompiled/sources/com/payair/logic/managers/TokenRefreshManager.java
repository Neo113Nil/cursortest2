package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/logic/managers/TokenRefreshManager;", "", "", "Lcom/payair/model/NetworkTokenReference;", "networkTokenReferences", "", "refreshTokens", "(Ljava/util/Set;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TokenRefreshManager {
    boolean refreshTokens(java.util.Set<com.payair.model.NetworkTokenReference> networkTokenReferences);
}
