package com.paypal.oslo.feature.identity.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "", "", "unbindDevice", "", "logout", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IdentitySession {
    java.lang.Object hasRememberedUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object logout(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object logout$default(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return identitySession.logout(z, continuation);
    }
}
