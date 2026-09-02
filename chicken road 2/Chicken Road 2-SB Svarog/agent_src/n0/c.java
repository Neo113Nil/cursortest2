package n0;

import Y.i;
import android.os.Handler;
import android.os.Looper;
import g0.h;
import java.util.concurrent.CancellationException;
import m0.AbstractC0059p;
import m0.AbstractC0067y;
import m0.C0060q;
import m0.InterfaceC0065w;
import m0.K;
import r0.p;

/* loaded from: classes.dex */
public final class c extends AbstractC0059p implements InterfaceC0065w {
    private volatile c _immediate;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1012d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1013e;

    /* renamed from: f, reason: collision with root package name */
    public final c f1014f;

    public c(Handler handler, boolean z2) {
        this.f1012d = handler;
        this.f1013e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, true);
            this._immediate = cVar;
        }
        this.f1014f = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1012d == this.f1012d;
    }

    @Override // m0.AbstractC0059p
    public final void f(i iVar, Runnable runnable) {
        if (this.f1012d.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        K k2 = (K) iVar.d(C0060q.f943c);
        if (k2 != null) {
            k2.a(cancellationException);
        }
        AbstractC0067y.f958b.f(iVar, runnable);
    }

    @Override // m0.AbstractC0059p
    public final boolean h() {
        return (this.f1013e && h.a(Looper.myLooper(), this.f1012d.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1012d);
    }

    @Override // m0.AbstractC0059p
    public final String toString() {
        c cVar;
        String str;
        s0.d dVar = AbstractC0067y.f957a;
        c cVar2 = p.f1193a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f1014f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f1012d.toString();
        if (!this.f1013e) {
            return handler;
        }
        return handler + ".immediate";
    }
}
