package q4;

import O3.f;
import a4.h;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;
import p4.AbstractC2277q;
import p4.C2268h;
import p4.D;
import p4.InterfaceC2259A;
import p4.U;
import p4.r;
import u4.m;
import w4.e;

/* renamed from: q4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313c extends AbstractC2277q implements InterfaceC2259A {

    /* renamed from: m, reason: collision with root package name */
    public final Handler f18894m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18895n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18896o;

    /* renamed from: p, reason: collision with root package name */
    public final C2313c f18897p;

    public C2313c(Handler handler, String str, boolean z3) {
        this.f18894m = handler;
        this.f18895n = str;
        this.f18896o = z3;
        this.f18897p = z3 ? this : new C2313c(handler, str, true);
    }

    @Override // p4.AbstractC2277q
    public final void E(h hVar, Runnable runnable) {
        if (this.f18894m.post(runnable)) {
            return;
        }
        H(hVar, runnable);
    }

    @Override // p4.AbstractC2277q
    public final boolean F(h hVar) {
        return (this.f18896o && l.a(Looper.myLooper(), this.f18894m.getLooper())) ? false : true;
    }

    public final void H(h hVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        U u5 = (U) hVar.l(r.f18819l);
        if (u5 != null) {
            u5.d(cancellationException);
        }
        e eVar = D.f18743a;
        w4.d.f20559m.E(hVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2313c)) {
            return false;
        }
        C2313c c2313c = (C2313c) obj;
        return c2313c.f18894m == this.f18894m && c2313c.f18896o == this.f18896o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f18894m) ^ (this.f18896o ? 1231 : 1237);
    }

    @Override // p4.InterfaceC2259A
    public final void i(long j5, C2268h c2268h) {
        D3.h hVar = new D3.h(25, c2268h, this, false);
        if (j5 > 4611686018427387903L) {
            j5 = 4611686018427387903L;
        }
        if (this.f18894m.postDelayed(hVar, j5)) {
            c2268h.t(new f(10, this, hVar));
        } else {
            H(c2268h.f18796o, hVar);
        }
    }

    @Override // p4.AbstractC2277q
    public final String toString() {
        C2313c c2313c;
        String str;
        e eVar = D.f18743a;
        C2313c c2313c2 = m.f20109a;
        if (this == c2313c2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c2313c = c2313c2.f18897p;
            } catch (UnsupportedOperationException unused) {
                c2313c = null;
            }
            str = this == c2313c ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f18895n;
        if (str2 == null) {
            str2 = this.f18894m.toString();
        }
        if (!this.f18896o) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public C2313c(Handler handler) {
        this(handler, null, false);
    }
}
