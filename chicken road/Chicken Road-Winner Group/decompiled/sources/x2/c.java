package x2;

import B2.o;
import android.os.Handler;
import android.os.Looper;
import g2.h;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import w2.AbstractC1239s;
import w2.B;
import w2.C1240t;
import w2.InterfaceC1245y;
import w2.P;

/* loaded from: classes.dex */
public final class c extends AbstractC1239s implements InterfaceC1245y {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10566c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10567d;

    /* renamed from: e, reason: collision with root package name */
    public final c f10568e;

    public c(Handler handler, boolean z3) {
        this.f10566c = handler;
        this.f10567d = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, true);
            this._immediate = cVar;
        }
        this.f10568e = cVar;
    }

    @Override // w2.AbstractC1239s
    public final void c(h hVar, Runnable runnable) {
        if (this.f10566c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p3 = (P) hVar.k(C1240t.f10525b);
        if (p3 != null) {
            p3.b(cancellationException);
        }
        B.f10463b.c(hVar, runnable);
    }

    @Override // w2.AbstractC1239s
    public final boolean d() {
        return (this.f10567d && j.a(Looper.myLooper(), this.f10566c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f10566c == this.f10566c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10566c);
    }

    @Override // w2.AbstractC1239s
    public final String toString() {
        c cVar;
        String str;
        D2.d dVar = B.f10462a;
        c cVar2 = o.f177a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f10568e;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f10566c.toString();
        return this.f10567d ? B0.c.o(handler, ".immediate") : handler;
    }
}
