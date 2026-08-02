package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572sm extends AbstractC1483qm {

    /* renamed from: q, reason: collision with root package name */
    public String f15598q;

    /* renamed from: r, reason: collision with root package name */
    public int f15599r;

    @Override // m3.InterfaceC2092b
    public final void N() {
        synchronized (this.f15169l) {
            try {
                if (!this.f15171n) {
                    this.f15171n = true;
                    try {
                        try {
                            int i = this.f15599r;
                            if (i == 2) {
                                ((InterfaceC1115ic) this.f15173p.t()).Q0(this.f15172o, ((Boolean) Q2.r.f5053d.f5056c.a(F7.xc)).booleanValue() ? new BinderC1438pm(this.f15168k, this.f15172o) : new BinderC1393om(this));
                            } else if (i == 3) {
                                ((InterfaceC1115ic) this.f15173p.t()).r0(this.f15598q, ((Boolean) Q2.r.f5053d.f5056c.a(F7.xc)).booleanValue() ? new BinderC1438pm(this.f15168k, this.f15172o) : new BinderC1393om(this));
                            } else {
                                this.f15168k.c(new C1797xm(1));
                            }
                        } catch (Throwable th) {
                            P2.o.f4767B.f4774g.i("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                            this.f15168k.c(new C1797xm(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f15168k.c(new C1797xm(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1483qm, m3.InterfaceC2093c
    public final void Y(j3.b bVar) {
        U2.j.d("Cannot connect to remote service, fallback to local instance.");
        this.f15168k.c(new C1797xm(1));
    }
}
