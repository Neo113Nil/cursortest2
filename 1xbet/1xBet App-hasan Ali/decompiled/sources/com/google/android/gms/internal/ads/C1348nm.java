package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1348nm extends AbstractC1483qm {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14707q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f14708r;

    /* renamed from: s, reason: collision with root package name */
    public final Qw f14709s;

    public C1348nm(Context context, Qw qw, int i) {
        this.f14707q = i;
        switch (i) {
            case 1:
                this.f14708r = context;
                this.f14709s = qw;
                this.f15173p = new C1414p6(context, P2.o.f4767B.f4785s.n(), (AbstractC1483qm) this, (AbstractC1483qm) this);
                break;
            default:
                this.f14708r = context;
                this.f14709s = qw;
                this.f15173p = new C1414p6(context, P2.o.f4767B.f4785s.n(), (AbstractC1483qm) this, (AbstractC1483qm) this);
                break;
        }
    }

    private final void c() {
        synchronized (this.f15169l) {
            try {
                if (!this.f15171n) {
                    this.f15171n = true;
                    try {
                        ((InterfaceC1115ic) this.f15173p.t()).E2(this.f15172o, ((Boolean) Q2.r.f5053d.f5056c.a(F7.xc)).booleanValue() ? new BinderC1438pm(this.f15168k, this.f15172o) : new BinderC1393om(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f15168k.c(new C1797xm(1));
                    } catch (Throwable th) {
                        P2.o.f4767B.f4774g.i("RemoteAdRequestClientTask.onConnected", th);
                        this.f15168k.c(new C1797xm(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m3.InterfaceC2092b
    public final void N() {
        switch (this.f14707q) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f15169l) {
                    try {
                        if (!this.f15171n) {
                            this.f15171n = true;
                            try {
                                ((InterfaceC1115ic) this.f15173p.t()).r3(this.f15172o, ((Boolean) Q2.r.f5053d.f5056c.a(F7.xc)).booleanValue() ? new BinderC1438pm(this.f15168k, this.f15172o) : new BinderC1393om(this));
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f15168k.c(new C1797xm(1));
                            } catch (Throwable th) {
                                P2.o.f4767B.f4774g.i("RemoteSignalsClientTask.onConnected", th);
                                this.f15168k.c(new C1797xm(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1483qm, m3.InterfaceC2093c
    public void Y(j3.b bVar) {
        switch (this.f14707q) {
            case 0:
                U2.j.d("Cannot connect to remote service, fallback to local instance.");
                this.f15168k.c(new C1797xm(1));
                break;
            default:
                super.Y(bVar);
                break;
        }
    }

    public E3.a d(C1428pc c1428pc) {
        synchronized (this.f15169l) {
            try {
                if (this.f15170m) {
                    return this.f15168k;
                }
                this.f15170m = true;
                this.f15172o = c1428pc;
                this.f15173p.n();
                C0634Ld c0634Ld = this.f15168k;
                c0634Ld.f10334k.a(new RunnableC1303mm(1, this), AbstractC0613Id.f9544g);
                AbstractC1483qm.b(this.f14708r, this.f15168k, this.f14709s);
                return this.f15168k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
