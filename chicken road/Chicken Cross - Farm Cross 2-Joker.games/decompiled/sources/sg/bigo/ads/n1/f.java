package sg.bigo.ads.n1;

import java.util.HashMap;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f13208a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();

    public f(n nVar) {
        this.f13208a = nVar;
    }

    public final void a(C5115b c5115b) {
        if (this.b.containsKey(c5115b.f12782a)) {
            AbstractC5446j.a((d) this.b.remove(c5115b.f12782a));
        }
        d dVar = new d(this, c5115b);
        this.b.put(c5115b.f12782a, dVar);
        AbstractC5446j.a(3, null, dVar, (c5115b.t != null ? r6.c : 0) * 1000);
    }
}
