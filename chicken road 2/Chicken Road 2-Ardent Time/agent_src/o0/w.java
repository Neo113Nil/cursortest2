package o0;

/* loaded from: classes.dex */
public final class w extends o0.r {

    /* renamed from: b, reason: collision with root package name */
    public final K.a f8197b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.d f8198c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.L f8199d;

    public w(int i2, K.a aVar, D0.d dVar, f1.L l2) {
        super(i2);
        this.f8198c = dVar;
        this.f8197b = aVar;
        this.f8199d = l2;
        if (i2 == 2 && aVar.f940c) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // o0.r
    public final boolean a(o0.m mVar) {
        return this.f8197b.f940c;
    }

    @Override // o0.r
    public final m0.d[] b(o0.m mVar) {
        return (m0.d[]) this.f8197b.f941d;
    }

    @Override // o0.r
    public final void c(com.google.android.gms.common.api.Status status) {
        this.f8199d.getClass();
        this.f8198c.a(status.f2596c != null ? new n0.j(status) : new n0.d(status));
    }

    @Override // o0.r
    public final void d(java.lang.RuntimeException runtimeException) {
        this.f8198c.a(runtimeException);
    }

    @Override // o0.r
    public final void e(o0.m mVar) {
        D0.d dVar = this.f8198c;
        try {
            K.a aVar = this.f8197b;
            ((o0.h) ((K.a) aVar.f942e).f941d).c(mVar.f8154b, dVar);
        } catch (android.os.DeadObjectException e2) {
            throw e2;
        } catch (android.os.RemoteException e3) {
            c(o0.r.g(e3));
        } catch (java.lang.RuntimeException e4) {
            dVar.a(e4);
        }
    }

    @Override // o0.r
    public final void f(o0.i iVar, boolean z2) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z2);
        java.util.Map map = (java.util.Map) iVar.f8149c;
        D0.d dVar = this.f8198c;
        map.put(dVar, valueOf);
        o0.i iVar2 = new o0.i(0, iVar, dVar);
        D0.m mVar = dVar.f194a;
        mVar.getClass();
        mVar.f214b.c(new D0.g(D0.e.f195a, iVar2));
        mVar.h();
    }
}
