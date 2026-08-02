package l3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    public final D3.f f17847b;

    public w(D3.f fVar) {
        super(4);
        this.f17847b = fVar;
    }

    @Override // l3.q
    public final boolean a(m mVar) {
        if (mVar.f17811p.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // l3.q
    public final j3.d[] b(m mVar) {
        if (mVar.f17811p.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // l3.q
    public final void c(Status status) {
        this.f17847b.a(new k3.d(status));
    }

    @Override // l3.q
    public final void d(RuntimeException runtimeException) {
        this.f17847b.a(runtimeException);
    }

    @Override // l3.q
    public final void e(m mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e3) {
            c(q.g(e3));
            throw e3;
        } catch (RemoteException e5) {
            c(q.g(e5));
        } catch (RuntimeException e6) {
            this.f17847b.a(e6);
        }
    }

    public final void h(m mVar) {
        if (mVar.f17811p.remove(null) != null) {
            throw new ClassCastException();
        }
        D3.f fVar = this.f17847b;
        Boolean bool = Boolean.FALSE;
        D3.o oVar = fVar.f946a;
        synchronized (oVar.f966a) {
            try {
                if (oVar.f968c) {
                    return;
                }
                oVar.f968c = true;
                oVar.f970e = bool;
                oVar.f967b.g(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l3.q
    public final /* bridge */ /* synthetic */ void f(v3.g gVar, boolean z3) {
    }
}
