package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.config.cellular.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.cellular.d f3588a;
    public final java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();
    public com.fyber.inneractive.sdk.util.a1 b = com.fyber.inneractive.sdk.util.a1.UNKNOWN;

    public a(android.content.Context context) {
        this.f3588a = com.fyber.inneractive.sdk.config.cellular.e.a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.a1 a1Var) {
        this.b = a1Var;
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.config.cellular.h hVar = (com.fyber.inneractive.sdk.config.cellular.h) it.next();
            if (hVar != null) {
                hVar.a(this.b);
            }
        }
    }
}
