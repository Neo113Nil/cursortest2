package R0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import i1.C0335e;
import i1.C0341k;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: b, reason: collision with root package name */
    public final C0335e f1252b;

    public w(C0335e c0335e) {
        super(4);
        this.f1252b = c0335e;
    }

    @Override // R0.q
    public final boolean a(l lVar) {
        if (lVar.f1212h.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // R0.q
    public final P0.d[] b(l lVar) {
        if (lVar.f1212h.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // R0.q
    public final void c(Status status) {
        this.f1252b.a(new Q0.d(status));
    }

    @Override // R0.q
    public final void d(RuntimeException runtimeException) {
        this.f1252b.a(runtimeException);
    }

    @Override // R0.q
    public final void e(l lVar) {
        try {
            h(lVar);
        } catch (DeadObjectException e3) {
            c(q.g(e3));
            throw e3;
        } catch (RemoteException e4) {
            c(q.g(e4));
        } catch (RuntimeException e5) {
            this.f1252b.a(e5);
        }
    }

    public final void h(l lVar) {
        if (lVar.f1212h.remove(null) != null) {
            throw new ClassCastException();
        }
        C0335e c0335e = this.f1252b;
        Boolean bool = Boolean.FALSE;
        C0341k c0341k = c0335e.f5011a;
        synchronized (c0341k.f5022a) {
            try {
                if (c0341k.f5024c) {
                    return;
                }
                c0341k.f5024c = true;
                c0341k.f5026e = bool;
                c0341k.f5023b.e(c0341k);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R0.q
    public final /* bridge */ /* synthetic */ void f(a1.e eVar, boolean z3) {
    }
}
