package n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public v4.r f15472a = null;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f15473b = null;

    public final void a(C1473g c1473g, M m7) {
        v4.r rVar = this.f15472a;
        if (rVar != null) {
            C1479m c1479m = (C1479m) m7.f15385c;
            v4.r i7 = c1479m.f15459n.i(c1473g, new ArrayList());
            ((ArrayList) m7.f15384b).addAll(c1479m.f15459n.g(c1473g, Y4.D.Q(rVar, new L(i7), (HashMap) m7.f15383a)));
            c1479m.p(c1479m.a(c1473g, -9));
            return;
        }
        HashMap hashMap = this.f15473b;
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((r) entry.getValue()).a(c1473g.t((v4.c) entry.getKey()), m7);
            }
        }
    }

    public final boolean b(C1473g c1473g) {
        if (c1473g.isEmpty()) {
            this.f15472a = null;
            this.f15473b = null;
            return true;
        }
        v4.r rVar = this.f15472a;
        if (rVar != null) {
            if (rVar.r()) {
                return false;
            }
            v4.f fVar = (v4.f) this.f15472a;
            this.f15472a = null;
            fVar.m(new q(this, c1473g), false);
            return b(c1473g);
        }
        if (this.f15473b == null) {
            return true;
        }
        v4.c B7 = c1473g.B();
        C1473g E7 = c1473g.E();
        if (this.f15473b.containsKey(B7) && ((r) this.f15473b.get(B7)).b(E7)) {
            this.f15473b.remove(B7);
        }
        if (!this.f15473b.isEmpty()) {
            return false;
        }
        this.f15473b = null;
        return true;
    }

    public final void c(C1473g c1473g, v4.r rVar) {
        if (c1473g.isEmpty()) {
            this.f15472a = rVar;
            this.f15473b = null;
            return;
        }
        v4.r rVar2 = this.f15472a;
        if (rVar2 != null) {
            this.f15472a = rVar2.q(c1473g, rVar);
            return;
        }
        if (this.f15473b == null) {
            this.f15473b = new HashMap();
        }
        v4.c B7 = c1473g.B();
        if (!this.f15473b.containsKey(B7)) {
            this.f15473b.put(B7, new r());
        }
        ((r) this.f15473b.get(B7)).c(c1473g.E(), rVar);
    }
}
