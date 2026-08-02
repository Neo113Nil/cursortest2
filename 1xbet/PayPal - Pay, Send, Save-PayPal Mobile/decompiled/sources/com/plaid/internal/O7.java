package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O7 implements com.plaid.internal.C8, com.plaid.internal.C6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.T3 f5873a;

    public O7(com.plaid.internal.T3 t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        this.f5873a = t3;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.plaid.internal.C6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.N7 n7;
        int i;
        com.plaid.internal.O7 o7;
        if (continuationImpl instanceof com.plaid.internal.N7) {
            n7 = (com.plaid.internal.N7) continuationImpl;
            int i2 = n7.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n7.d = i2 - 2147483648;
                java.lang.Object obj = n7.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = n7.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.plaid.internal.T3 t3 = this.f5873a;
                    n7.f5865a = this;
                    n7.d = 1;
                    obj = t3.a("webview_fallback_state", "webview_fallback_initial_uri", n7);
                    if (obj != coroutine_suspended) {
                        o7 = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str = (java.lang.String) n7.f5865a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return str;
                }
                o7 = (com.plaid.internal.O7) n7.f5865a;
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str2 = (java.lang.String) obj;
                com.plaid.internal.T3 t32 = o7.f5873a;
                n7.f5865a = str2;
                n7.d = 2;
                return t32.a("webview_fallback_state", n7) != coroutine_suspended ? coroutine_suspended : str2;
            }
        }
        n7 = new com.plaid.internal.N7(this, continuationImpl);
        java.lang.Object obj2 = n7.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = n7.d;
        if (i != 0) {
        }
        java.lang.String str22 = (java.lang.String) obj2;
        com.plaid.internal.T3 t322 = o7.f5873a;
        n7.f5865a = str22;
        n7.d = 2;
        if (t322.a("webview_fallback_state", n7) != coroutine_suspended2) {
        }
    }

    @Override // com.plaid.internal.C8
    public final java.lang.Object a(java.lang.String str, com.plaid.internal.C0637s2 c0637s2) {
        java.lang.Object a2 = this.f5873a.a("webview_fallback_state", "webview_fallback_initial_uri", str, c0637s2);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }
}
