package u4;

import c4.AbstractC0542c;
import c4.InterfaceC0543d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.AbstractC2277q;
import p4.AbstractC2282w;
import p4.C;
import p4.C2275o;
import p4.K;
import p4.k0;

/* loaded from: classes.dex */
public final class f extends C implements InterfaceC0543d, a4.c {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20086r = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC2277q f20087n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0542c f20088o;

    /* renamed from: p, reason: collision with root package name */
    public Object f20089p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f20090q;

    public f(AbstractC2277q abstractC2277q, AbstractC0542c abstractC0542c) {
        super(-1);
        this.f20087n = abstractC2277q;
        this.f20088o = abstractC0542c;
        this.f20089p = a.f20076b;
        this.f20090q = a.k(abstractC0542c.getContext());
    }

    @Override // c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        return this.f20088o;
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f20088o.getContext();
    }

    @Override // p4.C
    public final Object i() {
        Object obj = this.f20089p;
        this.f20089p = a.f20076b;
        return obj;
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        Throwable a5 = W3.k.a(obj);
        Object c2275o = a5 == null ? obj : new C2275o(a5, false);
        AbstractC0542c abstractC0542c = this.f20088o;
        a4.h context = abstractC0542c.getContext();
        AbstractC2277q abstractC2277q = this.f20087n;
        if (abstractC2277q.F(context)) {
            this.f20089p = c2275o;
            this.f18742m = 0;
            abstractC2277q.E(abstractC0542c.getContext(), this);
            return;
        }
        K a6 = k0.a();
        if (a6.f18754m >= 4294967296L) {
            this.f20089p = c2275o;
            this.f18742m = 0;
            a6.I(this);
            return;
        }
        a6.K(true);
        try {
            a4.h context2 = abstractC0542c.getContext();
            Object l5 = a.l(context2, this.f20090q);
            try {
                abstractC0542c.resumeWith(obj);
                while (a6.M()) {
                }
            } finally {
                a.g(context2, l5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f20087n + ", " + AbstractC2282w.t(this.f20088o) + ']';
    }

    @Override // p4.C
    public final a4.c d() {
        return this;
    }
}
