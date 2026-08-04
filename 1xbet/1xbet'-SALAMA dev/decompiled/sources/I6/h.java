package I6;

import D6.A;
import D6.C0;
import D6.C0138v;
import D6.C0139w;
import D6.E;
import D6.L;
import D6.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends L implements p077k6.d, p065i6.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3729y = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f3730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p077k6.c f3731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3732f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3733x;

    public h(A a2, p077k6.c cVar) {
        super(-1);
        this.f3730d = a2;
        this.f3731e = cVar;
        this.f3732f = a.f3718c;
        this.f3733x = a.l(cVar.getContext());
    }

    @Override // D6.L
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0139w) {
            ((C0139w) obj).f1885b.invoke(cancellationException);
        }
    }

    @Override // p077k6.d
    public final p077k6.d getCallerFrame() {
        p077k6.c cVar = this.f3731e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // p065i6.d
    public final p065i6.i getContext() {
        return this.f3731e.getContext();
    }

    @Override // D6.L
    public final Object j() {
        Object obj = this.f3732f;
        this.f3732f = a.f3718c;
        return obj;
    }

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        p077k6.c cVar = this.f3731e;
        p065i6.i context = cVar.getContext();
        Throwable thA = p044f6.f.a(obj);
        Object c0138v = thA == null ? obj : new C0138v(false, thA);
        A a2 = this.f3730d;
        if (a2.e()) {
            this.f3732f = c0138v;
            this.f1795c = 0;
            a2.d(context, this);
            return;
        }
        X xA = C0.a();
        if (xA.f1812c >= 4294967296L) {
            this.f3732f = c0138v;
            this.f1795c = 0;
            p050g6.f fVar = xA.f1814e;
            if (fVar == null) {
                fVar = new p050g6.f();
                xA.f1814e = fVar;
            }
            fVar.addLast(this);
            return;
        }
        xA.h(true);
        try {
            p065i6.i context2 = cVar.getContext();
            Object objM = a.m(context2, this.f3733x);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objM);
                while (xA.j()) {
                }
            } catch (Throwable th) {
                a.g(context2, objM);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2, null);
            } finally {
                xA.f(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3730d + ", " + E.u(this.f3731e) + ']';
    }

    @Override // D6.L
    public final p065i6.d e() {
        return this;
    }
}
