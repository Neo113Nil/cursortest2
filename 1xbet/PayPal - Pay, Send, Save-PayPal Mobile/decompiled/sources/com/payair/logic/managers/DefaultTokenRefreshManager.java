package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/managers/DefaultTokenRefreshManager;", "Lcom/payair/logic/managers/TokenRefreshManager;", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "<init>", "(Lcom/payair/logic/managers/TokenManager;)V", "", "Lcom/payair/model/NetworkTokenReference;", "networkTokenReferences", "", "refreshTokens", "(Ljava/util/Set;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultTokenRefreshManager implements com.payair.logic.managers.TokenRefreshManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.managers.TokenManager f4445a;

    public DefaultTokenRefreshManager(com.payair.logic.managers.TokenManager tokenManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        this.f4445a = tokenManager;
    }

    @Override // com.payair.logic.managers.TokenRefreshManager
    public final boolean refreshTokens(java.util.Set<com.payair.model.NetworkTokenReference> networkTokenReferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReferences, "");
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.payair.csdk.m0(booleanRef, this, networkTokenReferences, null), 1, null);
        return booleanRef.element;
    }
}
