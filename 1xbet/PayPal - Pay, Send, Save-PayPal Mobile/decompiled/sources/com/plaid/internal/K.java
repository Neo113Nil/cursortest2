package com.plaid.internal;

/* loaded from: classes16.dex */
public final class K extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plaid.internal.L f5821a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ kotlin.coroutines.SafeContinuation c;
    public final /* synthetic */ android.net.ConnectivityManager d;

    public K(com.plaid.internal.L l, java.lang.String str, kotlin.coroutines.SafeContinuation safeContinuation, android.net.ConnectivityManager connectivityManager) {
        this.f5821a = l;
        this.b = str;
        this.c = safeContinuation;
        this.d = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        try {
            try {
                com.plaid.internal.C0541h4 a2 = this.f5821a.b.a(this.b, network);
                kotlin.coroutines.SafeContinuation safeContinuation = this.c;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(a2));
            } catch (com.plaid.internal.AbstractC0678w7.c e) {
                kotlin.coroutines.SafeContinuation safeContinuation2 = this.c;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                safeContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e)));
            }
        } finally {
            this.d.unregisterNetworkCallback(this);
        }
    }
}
