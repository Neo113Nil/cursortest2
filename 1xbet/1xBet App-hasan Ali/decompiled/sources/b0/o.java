package b0;

import A0.C0060u;
import A0.F;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import p4.U;
import p4.W;
import v.J;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.InterfaceC2755l;
import z0.e0;
import z0.j0;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC2755l {

    /* renamed from: l, reason: collision with root package name */
    public u4.c f7163l;

    /* renamed from: m, reason: collision with root package name */
    public int f7164m;

    /* renamed from: o, reason: collision with root package name */
    public o f7166o;

    /* renamed from: p, reason: collision with root package name */
    public o f7167p;

    /* renamed from: q, reason: collision with root package name */
    public j0 f7168q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f7169r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7170s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7171t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7172u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7173v;

    /* renamed from: w, reason: collision with root package name */
    public C0060u f7174w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7175x;

    /* renamed from: k, reason: collision with root package name */
    public o f7162k = this;

    /* renamed from: n, reason: collision with root package name */
    public int f7165n = -1;

    public final InterfaceC2280u k0() {
        u4.c cVar = this.f7163l;
        if (cVar != null) {
            return cVar;
        }
        u4.c a5 = AbstractC2282w.a(((F) AbstractC2749f.w(this)).getCoroutineContext().m(new W((U) ((F) AbstractC2749f.w(this)).getCoroutineContext().l(p4.r.f18819l))));
        this.f7163l = a5;
        return a5;
    }

    public boolean l0() {
        return !(this instanceof J);
    }

    public void m0() {
        if (this.f7175x) {
            AbstractC2540a.b("node attached multiple times");
        }
        if (this.f7169r == null) {
            AbstractC2540a.b("attach invoked on a node without a coordinator");
        }
        this.f7175x = true;
        this.f7172u = true;
    }

    public void n0() {
        if (!this.f7175x) {
            AbstractC2540a.b("Cannot detach a node that is not attached");
        }
        if (this.f7172u) {
            AbstractC2540a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f7173v) {
            AbstractC2540a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f7175x = false;
        u4.c cVar = this.f7163l;
        if (cVar != null) {
            AbstractC2282w.d(cVar, new q("The Modifier.Node was detached", 1));
            this.f7163l = null;
        }
    }

    public /* synthetic */ void p0() {
    }

    public /* synthetic */ void r0() {
    }

    public void t0() {
        if (!this.f7175x) {
            AbstractC2540a.b("reset() called on an unattached node");
        }
        s0();
    }

    public void u0() {
        if (!this.f7175x) {
            AbstractC2540a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f7172u) {
            AbstractC2540a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f7172u = false;
        o0();
        this.f7173v = true;
    }

    public void v0() {
        if (!this.f7175x) {
            AbstractC2540a.b("node detached multiple times");
        }
        if (this.f7169r == null) {
            AbstractC2540a.b("detach invoked on a node without a coordinator");
        }
        if (!this.f7173v) {
            AbstractC2540a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f7173v = false;
        C0060u c0060u = this.f7174w;
        if (c0060u != null) {
            c0060u.invoke();
        }
        q0();
    }

    public void w0(o oVar) {
        this.f7162k = oVar;
    }

    public void x0(e0 e0Var) {
        this.f7169r = e0Var;
    }

    public void o0() {
    }

    public void q0() {
    }

    public void s0() {
    }
}
