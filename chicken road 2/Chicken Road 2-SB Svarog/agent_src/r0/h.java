package r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0055l;
import m0.AbstractC0059p;
import m0.AbstractC0062t;
import m0.AbstractC0066x;
import m0.C0054k;
import m0.D;
import m0.a0;

/* loaded from: classes.dex */
public final class h extends AbstractC0066x implements a0.c, Y.d {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1168i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0059p f1169e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.b f1170f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1171g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1172h;

    public h(AbstractC0059p abstractC0059p, a0.b bVar) {
        super(-1);
        this.f1169e = abstractC0059p;
        this.f1170f = bVar;
        this.f1171g = AbstractC0088a.f1157c;
        Y.i iVar = bVar.f419c;
        g0.h.b(iVar);
        this.f1172h = AbstractC0088a.j(iVar);
    }

    @Override // m0.AbstractC0066x
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0055l) {
            ((AbstractC0055l) obj).getClass();
            throw null;
        }
    }

    @Override // a0.c
    public final a0.c f() {
        a0.b bVar = this.f1170f;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // Y.d
    public final Y.i h() {
        Y.i iVar = this.f1170f.f419c;
        g0.h.b(iVar);
        return iVar;
    }

    @Override // m0.AbstractC0066x
    public final Object i() {
        Object obj = this.f1171g;
        this.f1171g = AbstractC0088a.f1157c;
        return obj;
    }

    @Override // Y.d
    public final void k(Object obj) {
        a0.b bVar = this.f1170f;
        Y.i iVar = bVar.f419c;
        g0.h.b(iVar);
        Throwable a2 = W.d.a(obj);
        Object c0054k = a2 == null ? obj : new C0054k(a2, false);
        AbstractC0059p abstractC0059p = this.f1169e;
        if (abstractC0059p.h()) {
            this.f1171g = c0054k;
            this.f956d = 0;
            abstractC0059p.f(iVar, this);
            return;
        }
        D a3 = a0.a();
        if (a3.f889d >= 4294967296L) {
            this.f1171g = c0054k;
            this.f956d = 0;
            X.c cVar = a3.f891f;
            if (cVar == null) {
                cVar = new X.c();
                a3.f891f = cVar;
            }
            cVar.addLast(this);
            return;
        }
        a3.k(true);
        try {
            Y.i iVar2 = bVar.f419c;
            g0.h.b(iVar2);
            Object k2 = AbstractC0088a.k(iVar2, this.f1172h);
            try {
                bVar.k(obj);
                while (a3.l()) {
                }
            } finally {
                AbstractC0088a.f(iVar2, k2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1169e + ", " + AbstractC0062t.g(this.f1170f) + ']';
    }

    @Override // m0.AbstractC0066x
    public final Y.d c() {
        return this;
    }
}
