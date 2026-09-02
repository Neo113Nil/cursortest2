package g1;

import b1.AbstractC0028p;
import b1.AbstractC0030s;
import b1.AbstractC0034w;
import b1.C;
import b1.C0023k;
import b1.C0024l;
import b1.Z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends AbstractC0034w implements O0.c, M0.d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1149h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0028p f1150d;

    /* renamed from: e, reason: collision with root package name */
    public final O0.b f1151e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1152f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1153g;

    public h(AbstractC0028p abstractC0028p, O0.b bVar) {
        super(-1);
        this.f1150d = abstractC0028p;
        this.f1151e = bVar;
        this.f1152f = a.f1138c;
        M0.i iVar = bVar.f277b;
        kotlin.jvm.internal.j.b(iVar);
        this.f1153g = a.l(iVar);
    }

    @Override // b1.AbstractC0034w
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0024l) {
            ((C0024l) obj).f670b.invoke(cancellationException);
        }
    }

    @Override // O0.c
    public final O0.c c() {
        O0.b bVar = this.f1151e;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // M0.d
    public final void f(Object obj) {
        O0.b bVar = this.f1151e;
        M0.i iVar = bVar.f277b;
        kotlin.jvm.internal.j.b(iVar);
        Throwable a2 = K0.f.a(obj);
        Object c0023k = a2 == null ? obj : new C0023k(a2, false);
        AbstractC0028p abstractC0028p = this.f1150d;
        if (abstractC0028p.m()) {
            this.f1152f = c0023k;
            this.f692c = 0;
            abstractC0028p.l(iVar, this);
            return;
        }
        C a3 = Z.a();
        if (a3.f623c >= 4294967296L) {
            this.f1152f = c0023k;
            this.f692c = 0;
            L0.b bVar2 = a3.f625e;
            if (bVar2 == null) {
                bVar2 = new L0.b();
                a3.f625e = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        a3.p(true);
        try {
            M0.i iVar2 = bVar.f277b;
            kotlin.jvm.internal.j.b(iVar2);
            Object m2 = a.m(iVar2, this.f1153g);
            try {
                bVar.f(obj);
                while (a3.q()) {
                }
            } finally {
                a.h(iVar2, m2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // M0.d
    public final M0.i getContext() {
        M0.i iVar = this.f1151e.f277b;
        kotlin.jvm.internal.j.b(iVar);
        return iVar;
    }

    @Override // b1.AbstractC0034w
    public final Object i() {
        Object obj = this.f1152f;
        this.f1152f = a.f1138c;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1150d + ", " + AbstractC0030s.h(this.f1151e) + ']';
    }

    @Override // b1.AbstractC0034w
    public final M0.d d() {
        return this;
    }
}
