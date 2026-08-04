package W5;

import U5.AbstractC0438e;
import U5.AbstractC0439f;
import U5.C0437d;
import U5.C0450q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends AbstractC0438e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6884e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q0 f6886g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f6883d = new AtomicReference(Q0.f6928m0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K0 f6885f = new K0(this);

    public N0(Q0 q1, String str) {
        this.f6886g = q1;
        p113p3.f.k(str, "authority");
        this.f6884e = str;
    }

    @Override // U5.AbstractC0438e
    public final AbstractC0439f n(H2.r rVar, C0437d c0437d) {
        AtomicReference atomicReference = this.f6883d;
        Object obj = atomicReference.get();
        B0 b7 = Q0.f6928m0;
        if (obj != b7) {
            return s(rVar, c0437d);
        }
        Q0 q1 = this.f6886g;
        q1.f6972p.execute(new L0(this, 2));
        if (atomicReference.get() != b7) {
            return s(rVar, c0437d);
        }
        if (q1.f6939J.get()) {
            return new G(2);
        }
        M0 m7 = new M0(this, C0450q.b(), rVar, c0437d);
        q1.f6972p.execute(new E(this, m7));
        return m7;
    }

    public final AbstractC0439f s(H2.r rVar, C0437d c0437d) {
        U5.D d7 = (U5.D) this.f6883d.get();
        K0 k7 = this.f6885f;
        if (d7 == null) {
            return k7.n(rVar, c0437d);
        }
        if (!(d7 instanceof V0)) {
            return new G0(d7, k7, this.f6886g.f6967k, rVar, c0437d);
        }
        W0 w7 = ((V0) d7).f7074b;
        w7.getClass();
        U0 u4 = (U0) w7.f7080b.get((String) rVar.f3291b);
        if (u4 == null) {
            u4 = (U0) w7.f7081c.get((String) rVar.f3292c);
        }
        if (u4 == null) {
            u4 = w7.f7079a;
        }
        if (u4 != null) {
            c0437d = c0437d.c(U0.f7061g, u4);
        }
        return k7.n(rVar, c0437d);
    }

    public final void t(U5.D d7) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f6883d;
        U5.D d8 = (U5.D) atomicReference.get();
        atomicReference.set(d7);
        if (d8 != Q0.f6928m0 || (linkedHashSet = this.f6886g.f6934E) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((M0) it.next()).i();
        }
    }
}
