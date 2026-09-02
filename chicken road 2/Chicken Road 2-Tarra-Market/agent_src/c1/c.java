package c1;

import M0.i;
import android.os.Handler;
import android.os.Looper;
import b1.AbstractC0028p;
import b1.AbstractC0035x;
import b1.C0029q;
import b1.InterfaceC0033v;
import b1.J;
import g1.o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class c extends AbstractC0028p implements InterfaceC0033v {
    private volatile c _immediate;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f701c;

    /* renamed from: d, reason: collision with root package name */
    public final String f702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f703e;

    /* renamed from: f, reason: collision with root package name */
    public final c f704f;

    public c(Handler handler, String str, boolean z2) {
        this.f701c = handler;
        this.f702d = str;
        this.f703e = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f704f = cVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f701c == this.f701c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f701c);
    }

    @Override // b1.AbstractC0028p
    public final void l(i iVar, Runnable runnable) {
        if (this.f701c.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        J j2 = (J) iVar.i(C0029q.f679b);
        if (j2 != null) {
            j2.a(cancellationException);
        }
        AbstractC0035x.f694b.l(iVar, runnable);
    }

    @Override // b1.AbstractC0028p
    public final boolean m() {
        return (this.f703e && j.a(Looper.myLooper(), this.f701c.getLooper())) ? false : true;
    }

    @Override // b1.AbstractC0028p
    public final String toString() {
        c cVar;
        String str;
        h1.d dVar = AbstractC0035x.f693a;
        c cVar2 = o.f1172a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f704f;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f702d;
        if (str2 == null) {
            str2 = this.f701c.toString();
        }
        if (!this.f703e) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
