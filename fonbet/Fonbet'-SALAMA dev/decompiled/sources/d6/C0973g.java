package d6;

import U5.AbstractC0457y;
import U5.C0434a;
import U5.C0435b;
import U5.M;
import U5.N;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: d6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0973g extends AbstractC0968b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f12426a;

    /* renamed from: b, reason: collision with root package name */
    public final M f12427b;

    public C0973g(AbstractC0457y abstractC0457y, M m7) {
        p3.f.k(abstractC0457y, "delegate");
        this.f12426a = abstractC0457y;
        p3.f.k(m7, "healthListener");
        this.f12427b = m7;
    }

    @Override // U5.AbstractC0457y
    public final C0435b c() {
        C0435b c3 = this.f12426a.c();
        c3.getClass();
        C0434a c0434a = N.f6435d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, bool);
        for (Map.Entry entry : c3.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        return new C0435b(identityHashMap);
    }

    @Override // U5.AbstractC0457y
    public final void o(M m7) {
        this.f12426a.o(new C0972f(this, m7, 0));
    }

    @Override // d6.AbstractC0968b
    public final AbstractC0457y q() {
        return this.f12426a;
    }
}
