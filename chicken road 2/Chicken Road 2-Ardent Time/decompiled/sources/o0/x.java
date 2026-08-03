package o0;

/* loaded from: classes.dex */
public final class x extends o0.r {

    /* renamed from: b, reason: collision with root package name */
    public final D0.d f8200b;

    public x(D0.d dVar) {
        super(4);
        this.f8200b = dVar;
    }

    @Override // o0.r
    public final boolean a(o0.m mVar) {
        if (mVar.f8158f.get(null) == null) {
            return false;
        }
        throw new java.lang.ClassCastException();
    }

    @Override // o0.r
    public final m0.d[] b(o0.m mVar) {
        if (mVar.f8158f.get(null) == null) {
            return null;
        }
        throw new java.lang.ClassCastException();
    }

    @Override // o0.r
    public final void c(com.google.android.gms.common.api.Status status) {
        this.f8200b.a(new n0.d(status));
    }

    @Override // o0.r
    public final void d(java.lang.RuntimeException runtimeException) {
        this.f8200b.a(runtimeException);
    }

    @Override // o0.r
    public final void e(o0.m mVar) {
        try {
            h(mVar);
        } catch (android.os.DeadObjectException e2) {
            c(o0.r.g(e2));
            throw e2;
        } catch (android.os.RemoteException e3) {
            c(o0.r.g(e3));
        } catch (java.lang.RuntimeException e4) {
            this.f8200b.a(e4);
        }
    }

    public final void h(o0.m mVar) {
        if (mVar.f8158f.remove(null) != null) {
            throw new java.lang.ClassCastException();
        }
        D0.d dVar = this.f8200b;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        D0.m mVar2 = dVar.f194a;
        synchronized (mVar2.f213a) {
            try {
                if (mVar2.f215c) {
                    return;
                }
                mVar2.f215c = true;
                mVar2.f217e = bool;
                mVar2.f214b.d(mVar2);
            } finally {
            }
        }
    }

    @Override // o0.r
    public final /* bridge */ /* synthetic */ void f(o0.i iVar, boolean z2) {
    }
}
