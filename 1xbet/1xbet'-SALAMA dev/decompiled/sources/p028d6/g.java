package p028d6;

import U5.AbstractC0457y;
import U5.C0434a;
import U5.C0435b;
import U5.M;
import U5.N;
import java.util.IdentityHashMap;
import java.util.Map;
import p113p3.f;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f12432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f12433b;

    public g(AbstractC0457y abstractC0457y, M m7) {
        f.k(abstractC0457y, "delegate");
        this.f12432a = abstractC0457y;
        f.k(m7, "healthListener");
        this.f12433b = m7;
    }

    @Override // U5.AbstractC0457y
    public final C0435b c() {
        C0435b c0435bC = this.f12432a.c();
        c0435bC.getClass();
        C0434a c0434a = N.f6435d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0434a, bool);
        for (Map.Entry entry : c0435bC.f6455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0434a) entry.getKey(), entry.getValue());
            }
        }
        return new C0435b(identityHashMap);
    }

    @Override // U5.AbstractC0457y
    public final void o(M m7) {
        this.f12432a.o(new f(this, m7, 0));
    }

    @Override // p028d6.b
    public final AbstractC0457y q() {
        return this.f12432a;
    }
}
