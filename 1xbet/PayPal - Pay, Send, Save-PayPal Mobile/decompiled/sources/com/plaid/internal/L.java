package com.plaid.internal;

/* loaded from: classes16.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5828a;
    public final com.plaid.internal.J b;

    public L(android.content.Context context, com.plaid.internal.J j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j, "");
        this.f5828a = context;
        this.b = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.plaid.internal.M m) {
        java.lang.Object orThrow;
        java.lang.Object invoke;
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(m));
        java.lang.Object systemService = this.f5828a.getSystemService("connectivity");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethod, "");
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(connectivityManager, null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        if (invoke == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        if (((java.lang.Boolean) invoke).booleanValue()) {
            connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new com.plaid.internal.K(this, str, safeContinuation, connectivityManager));
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(m);
            }
            return orThrow;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(com.plaid.internal.AbstractC0678w7.a.f6611a)));
        orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        return orThrow;
    }
}
