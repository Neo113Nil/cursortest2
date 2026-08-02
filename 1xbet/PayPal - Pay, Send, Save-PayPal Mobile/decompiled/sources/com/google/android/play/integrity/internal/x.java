package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
final class x extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.integrity.internal.ae f3860a;

    x(com.google.android.play.integrity.internal.ae aeVar) {
        this.f3860a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        android.os.IInterface iInterface;
        com.google.android.play.integrity.internal.s sVar;
        android.content.Context context;
        android.content.ServiceConnection serviceConnection;
        java.util.concurrent.atomic.AtomicInteger atomicInteger2;
        com.google.android.play.integrity.internal.s sVar2;
        obj = this.f3860a.g;
        synchronized (obj) {
            atomicInteger = this.f3860a.m;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f3860a.m;
                if (atomicInteger2.decrementAndGet() > 0) {
                    sVar2 = this.f3860a.c;
                    sVar2.d("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                    return;
                }
            }
            com.google.android.play.integrity.internal.ae aeVar = this.f3860a;
            iInterface = aeVar.f3842o;
            if (iInterface != null) {
                sVar = aeVar.c;
                sVar.d("Unbind from service.", new java.lang.Object[0]);
                com.google.android.play.integrity.internal.ae aeVar2 = this.f3860a;
                context = aeVar2.b;
                serviceConnection = aeVar2.n;
                context.unbindService(serviceConnection);
                this.f3860a.h = false;
                this.f3860a.f3842o = null;
                this.f3860a.n = null;
            }
            this.f3860a.x();
        }
    }
}
