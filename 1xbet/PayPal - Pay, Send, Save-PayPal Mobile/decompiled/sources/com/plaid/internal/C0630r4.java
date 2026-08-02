package com.plaid.internal;

/* renamed from: com.plaid.internal.r4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0630r4 implements com.plaid.internal.y8, com.plaid.internal.InterfaceC0686x6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f6556a;

    public C0630r4(com.plaid.internal.T3 t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        this.f6556a = t3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.InterfaceC0686x6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.C0622q4 c0622q4;
        int i;
        com.plaid.internal.C0630r4 c0630r4;
        if (continuationImpl instanceof com.plaid.internal.C0622q4) {
            c0622q4 = (com.plaid.internal.C0622q4) continuationImpl;
            int i2 = c0622q4.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0622q4.d = i2 - 2147483648;
                java.lang.Object obj = c0622q4.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0622q4.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.T3 t3 = this.f6556a;
                    c0622q4.f6545a = this;
                    c0622q4.d = 1;
                    obj = t3.a("oauth_pane_state", "received_redirect_uri", c0622q4);
                    if (obj != coroutine_suspended) {
                        c0630r4 = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str = (java.lang.String) c0622q4.f6545a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return str;
                }
                c0630r4 = (com.plaid.internal.C0630r4) c0622q4.f6545a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str2 = (java.lang.String) obj;
                com.plaid.internal.T3 t32 = c0630r4.f6556a;
                c0622q4.f6545a = str2;
                c0622q4.d = 2;
                return t32.a("oauth_pane_state", c0622q4) != coroutine_suspended ? coroutine_suspended : str2;
            }
        }
        c0622q4 = new com.plaid.internal.C0622q4(this, continuationImpl);
        java.lang.Object obj2 = c0622q4.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0622q4.d;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        com.plaid.internal.T3 t322 = c0630r4.f6556a;
        c0622q4.f6545a = str22;
        c0622q4.d = 2;
        if (t322.a("oauth_pane_state", c0622q4) != coroutine_suspended2) {
        }
    }

    @Override // com.plaid.internal.y8
    public final java.lang.Object a(java.lang.String str, com.plaid.internal.C0620q2 c0620q2) {
        java.lang.Object a2 = this.f6556a.a("oauth_pane_state", "received_redirect_uri", str, c0620q2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    @Override // com.plaid.internal.y8
    public final java.lang.Object a(com.plaid.internal.X2 x2) {
        java.lang.Object a2 = this.f6556a.a("oauth_pane_state", x2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
