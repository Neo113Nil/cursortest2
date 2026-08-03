package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class t1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4314a;

    public t1(com.fyber.inneractive.sdk.util.v1 v1Var) {
        super(android.os.Looper.getMainLooper());
        this.f4314a = new java.lang.ref.WeakReference(v1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        com.fyber.inneractive.sdk.util.v1 v1Var = (com.fyber.inneractive.sdk.util.v1) this.f4314a.get();
        if (v1Var == null || message.what != 1932593528 || v1Var.d) {
            return;
        }
        v1Var.a(message.getWhen());
    }
}
