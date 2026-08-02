package I6;

import D6.A;
import D6.C0;
import D6.C0138v;
import D6.C0139w;
import D6.E;
import D6.L;
import D6.X;
import f6.C1113f;
import g6.C1157f;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC1356c;
import k6.InterfaceC1357d;

/* loaded from: classes2.dex */
public final class h extends L implements InterfaceC1357d, InterfaceC1287d {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3729y = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final A f3730d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1356c f3731e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3732f;

    /* renamed from: x, reason: collision with root package name */
    public final Object f3733x;

    public h(A a2, AbstractC1356c abstractC1356c) {
        super(-1);
        this.f3730d = a2;
        this.f3731e = abstractC1356c;
        this.f3732f = a.f3718c;
        this.f3733x = a.l(abstractC1356c.getContext());
    }

    @Override // D6.L
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0139w) {
            ((C0139w) obj).f1885b.invoke(cancellationException);
        }
    }

    @Override // k6.InterfaceC1357d
    public final InterfaceC1357d getCallerFrame() {
        AbstractC1356c abstractC1356c = this.f3731e;
        if (abstractC1356c != null) {
            return abstractC1356c;
        }
        return null;
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return this.f3731e.getContext();
    }

    @Override // D6.L
    public final Object j() {
        Object obj = this.f3732f;
        this.f3732f = a.f3718c;
        return obj;
    }

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        AbstractC1356c abstractC1356c = this.f3731e;
        InterfaceC1292i context = abstractC1356c.getContext();
        Throwable a2 = C1113f.a(obj);
        Object c0138v = a2 == null ? obj : new C0138v(false, a2);
        A a4 = this.f3730d;
        if (a4.e()) {
            this.f3732f = c0138v;
            this.f1795c = 0;
            a4.d(context, this);
            return;
        }
        X a7 = C0.a();
        if (a7.f1812c >= 4294967296L) {
            this.f3732f = c0138v;
            this.f1795c = 0;
            C1157f c1157f = a7.f1814e;
            if (c1157f == null) {
                c1157f = new C1157f();
                a7.f1814e = c1157f;
            }
            c1157f.addLast(this);
            return;
        }
        a7.h(true);
        try {
            InterfaceC1292i context2 = abstractC1356c.getContext();
            Object m7 = a.m(context2, this.f3733x);
            try {
                abstractC1356c.resumeWith(obj);
                while (a7.j()) {
                }
            } finally {
                a.g(context2, m7);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f3730d + ", " + E.u(this.f3731e) + ']';
    }

    @Override // D6.L
    public final InterfaceC1287d e() {
        return this;
    }
}
