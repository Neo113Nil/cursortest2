package E6;

import D6.B;
import D6.C0130m;
import D6.E0;
import D6.InterfaceC0118e0;
import D6.J;
import D6.M;
import D6.O;
import D6.t0;
import D6.v0;
import D6.y0;
import I6.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p031e1.k;
import p065i6.i;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends t0 implements J {
    private volatile e _immediate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f2421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f2424f;

    public e(Handler handler, String str, boolean z4) {
        this.f2421c = handler;
        this.f2422d = str;
        this.f2423e = z4;
        this._immediate = z4 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f2424f = eVar;
    }

    @Override // D6.J
    public final O a(long j, final E0 e7, i iVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2421c.postDelayed(e7, j)) {
            return new O() { // from class: E6.c
                @Override // D6.O
                public final void dispose() {
                    this.f2416a.f2421c.removeCallbacks(e7);
                }
            };
        }
        f(iVar, e7);
        return v0.f1883a;
    }

    @Override // D6.J
    public final void c(long j, C0130m c0130m) {
        y0 y0Var = new y0(2, c0130m, this, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f2421c.postDelayed(y0Var, j)) {
            c0130m.u(new d(0, this, y0Var));
        } else {
            f(c0130m.f1858e, y0Var);
        }
    }

    @Override // D6.A
    public final void d(i iVar, Runnable runnable) {
        if (this.f2421c.post(runnable)) {
            return;
        }
        f(iVar, runnable);
    }

    @Override // D6.A
    public final boolean e() {
        return (this.f2423e && h.a(Looper.myLooper(), this.f2421c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f2421c == this.f2421c;
    }

    public final void f(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) iVar.get(B.f1775b);
        if (interfaceC0118e0 != null) {
            interfaceC0118e0.cancel(cancellationException);
        }
        M.f1797b.d(iVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2421c);
    }

    @Override // D6.A
    public final String toString() {
        e eVar;
        String str;
        K6.d dVar = M.f1796a;
        t0 t0Var = o.f3752a;
        if (this == t0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = ((e) t0Var).f2424f;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f2422d;
        if (string == null) {
            string = this.f2421c.toString();
        }
        return this.f2423e ? k.e(string, ".immediate") : string;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
