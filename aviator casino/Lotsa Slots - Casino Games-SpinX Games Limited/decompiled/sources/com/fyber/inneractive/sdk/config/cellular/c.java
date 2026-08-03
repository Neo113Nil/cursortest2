package com.fyber.inneractive.sdk.config.cellular;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.config.cellular.d {
    public final com.fyber.inneractive.sdk.config.cellular.b d;

    public c(android.content.Context context) {
        super(context);
        this.d = new com.fyber.inneractive.sdk.config.cellular.b(this.f3590a, this);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(com.fyber.inneractive.sdk.config.cellular.a aVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.add(aVar);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to add networkUpdateListener", th, new java.lang.Object[0]);
            }
        }
        this.d.b();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a(com.fyber.inneractive.sdk.config.cellular.h hVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            try {
                copyOnWriteArrayList.remove(hVar);
            } catch (java.lang.Throwable th) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to remove networkUpdateListener", th, new java.lang.Object[0]);
            }
        }
        this.d.c();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.d
    public final void a() {
        this.d.a();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.c = null;
        }
    }
}
