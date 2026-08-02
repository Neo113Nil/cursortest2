package W5;

import U5.AbstractC0438e;
import U5.C0434a;
import U5.C0435b;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Q1 extends AbstractC0438e {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0438e f6983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R1 f6984e;

    public Q1(R1 r12, AbstractC0438e abstractC0438e) {
        this.f6984e = r12;
        this.f6983d = abstractC0438e;
    }

    @Override // U5.AbstractC0438e
    public final void o(U5.l0 l0Var) {
        this.f6983d.o(l0Var);
        this.f6984e.f7018c.execute(new A1.K0(this, 18));
    }

    @Override // U5.AbstractC0438e
    public final void p(U5.f0 f0Var) {
        C0434a c0434a = R1.f7015d;
        C0435b c0435b = f0Var.f6495b;
        if (c0435b.f6455a.get(c0434a) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        Collections.emptyList();
        C0435b c0435b2 = C0435b.f6454b;
        c0435b.getClass();
        P1 p12 = new P1(this.f6984e);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, p12);
        for (Map.Entry entry : c0435b.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        this.f6983d.p(new U5.f0(f0Var.f6494a, new C0435b(identityHashMap), f0Var.f6496c));
    }
}
