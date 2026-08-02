package A0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import p4.AbstractC2277q;

/* renamed from: A0.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055r0 extends AbstractC2277q {

    /* renamed from: w, reason: collision with root package name */
    public static final W3.m f554w = G4.d.E(C0010a0.f452r);

    /* renamed from: x, reason: collision with root package name */
    public static final C0052p0 f555x = new C0052p0(0);

    /* renamed from: m, reason: collision with root package name */
    public final Choreographer f556m;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f557n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f562s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f563t;

    /* renamed from: v, reason: collision with root package name */
    public final C0059t0 f565v;

    /* renamed from: o, reason: collision with root package name */
    public final Object f558o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final X3.k f559p = new X3.k();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f560q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f561r = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0054q0 f564u = new ChoreographerFrameCallbackC0054q0(this);

    public C0055r0(Choreographer choreographer, Handler handler) {
        this.f556m = choreographer;
        this.f557n = handler;
        this.f565v = new C0059t0(choreographer, this);
    }

    public static final void H(C0055r0 c0055r0) {
        boolean z3;
        do {
            Runnable I5 = c0055r0.I();
            while (I5 != null) {
                I5.run();
                I5 = c0055r0.I();
            }
            synchronized (c0055r0.f558o) {
                if (c0055r0.f559p.isEmpty()) {
                    z3 = false;
                    c0055r0.f562s = false;
                } else {
                    z3 = true;
                }
            }
        } while (z3);
    }

    @Override // p4.AbstractC2277q
    public final void E(a4.h hVar, Runnable runnable) {
        synchronized (this.f558o) {
            this.f559p.addLast(runnable);
            if (!this.f562s) {
                this.f562s = true;
                this.f557n.post(this.f564u);
                if (!this.f563t) {
                    this.f563t = true;
                    this.f556m.postFrameCallback(this.f564u);
                }
            }
        }
    }

    public final Runnable I() {
        Runnable runnable;
        synchronized (this.f558o) {
            X3.k kVar = this.f559p;
            runnable = (Runnable) (kVar.isEmpty() ? null : kVar.removeFirst());
        }
        return runnable;
    }
}
