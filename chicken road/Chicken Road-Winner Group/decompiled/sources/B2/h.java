package B2;

import d2.AbstractC0276f;
import e2.C0289d;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;
import i2.InterfaceC0344c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.A;
import w2.AbstractC1236o;
import w2.AbstractC1239s;
import w2.AbstractC1242v;
import w2.C1235n;
import w2.H;
import w2.h0;

/* loaded from: classes.dex */
public final class h extends A implements InterfaceC0344c, InterfaceC0319c {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f158h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1239s f159d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0343b f160e;
    public Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f161g;

    public h(AbstractC1239s abstractC1239s, AbstractC0343b abstractC0343b) {
        super(-1);
        this.f159d = abstractC1239s;
        this.f160e = abstractC0343b;
        this.f = a.f148c;
        this.f161g = a.k(abstractC0343b.getContext());
    }

    @Override // w2.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC1236o) {
            ((AbstractC1236o) obj).getClass();
            throw null;
        }
    }

    @Override // i2.InterfaceC0344c
    public final InterfaceC0344c c() {
        AbstractC0343b abstractC0343b = this.f160e;
        if (abstractC0343b != null) {
            return abstractC0343b;
        }
        return null;
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        AbstractC0343b abstractC0343b = this.f160e;
        g2.h context = abstractC0343b.getContext();
        Throwable a3 = AbstractC0276f.a(obj);
        Object c1235n = a3 == null ? obj : new C1235n(a3, false);
        AbstractC1239s abstractC1239s = this.f159d;
        if (abstractC1239s.d()) {
            this.f = c1235n;
            this.f10461c = 0;
            abstractC1239s.c(context, this);
            return;
        }
        H a4 = h0.a();
        if (a4.f10469c >= 4294967296L) {
            this.f = c1235n;
            this.f10461c = 0;
            C0289d c0289d = a4.f10471e;
            if (c0289d == null) {
                c0289d = new C0289d();
                a4.f10471e = c0289d;
            }
            c0289d.addLast(this);
            return;
        }
        a4.j(true);
        try {
            g2.h context2 = abstractC0343b.getContext();
            Object l3 = a.l(context2, this.f161g);
            try {
                abstractC0343b.e(obj);
                while (a4.m()) {
                }
            } finally {
                a.f(context2, l3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // g2.InterfaceC0319c
    public final g2.h getContext() {
        return this.f160e.getContext();
    }

    @Override // w2.A
    public final Object j() {
        Object obj = this.f;
        this.f = a.f148c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f159d + ", " + AbstractC1242v.k(this.f160e) + ']';
    }

    @Override // w2.A
    public final InterfaceC0319c d() {
        return this;
    }
}
