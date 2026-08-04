package p098n4;

import Y4.D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import v4.c;
import v4.f;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v4.r f15478a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f15479b = null;

    public final void a(C0934g c0934g, M m7) {
        v4.r rVar = this.f15478a;
        if (rVar != null) {
            C0940m c0940m = (C0940m) m7.f15391c;
            v4.r rVarI = c0940m.f15465n.i(c0934g, new ArrayList());
            ((ArrayList) m7.f15390b).addAll(c0940m.f15465n.g(c0934g, D.Q(rVar, new L(rVarI), (HashMap) m7.f15389a)));
            c0940m.p(c0940m.a(c0934g, -9));
            return;
        }
        HashMap map = this.f15479b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((r) entry.getValue()).a(c0934g.t((c) entry.getKey()), m7);
            }
        }
    }

    public final boolean b(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            this.f15478a = null;
            this.f15479b = null;
            return true;
        }
        v4.r rVar = this.f15478a;
        if (rVar != null) {
            if (rVar.r()) {
                return false;
            }
            f fVar = (f) this.f15478a;
            this.f15478a = null;
            fVar.m(new q(this, c0934g), false);
            return b(c0934g);
        }
        if (this.f15479b == null) {
            return true;
        }
        c cVarB = c0934g.B();
        C0934g c0934gE = c0934g.E();
        if (this.f15479b.containsKey(cVarB) && ((r) this.f15479b.get(cVarB)).b(c0934gE)) {
            this.f15479b.remove(cVarB);
        }
        if (!this.f15479b.isEmpty()) {
            return false;
        }
        this.f15479b = null;
        return true;
    }

    public final void c(C0934g c0934g, v4.r rVar) {
        if (c0934g.isEmpty()) {
            this.f15478a = rVar;
            this.f15479b = null;
            return;
        }
        v4.r rVar2 = this.f15478a;
        if (rVar2 != null) {
            this.f15478a = rVar2.q(c0934g, rVar);
            return;
        }
        if (this.f15479b == null) {
            this.f15479b = new HashMap();
        }
        c cVarB = c0934g.B();
        if (!this.f15479b.containsKey(cVarB)) {
            this.f15479b.put(cVarB, new r());
        }
        ((r) this.f15479b.get(cVarB)).c(c0934g.E(), rVar);
    }
}
