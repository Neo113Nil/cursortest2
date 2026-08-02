package K4;

import A1.C0043s0;
import G4.C0279l;
import G4.C0282o;
import U5.c0;
import Y4.L0;
import Y4.M0;
import Y4.O0;
import Y4.P0;
import b6.AbstractC0791c;
import b6.C0790b;
import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.C0909j;
import com.google.protobuf.C0928t;
import com.google.protobuf.z0;
import e3.C1023h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k4.AbstractC1341c;
import w1.P2;

/* loaded from: classes2.dex */
public final class H extends AbstractC0315b {

    /* renamed from: u, reason: collision with root package name */
    public static final C0909j f3985u = AbstractC0911k.f12212b;

    /* renamed from: r, reason: collision with root package name */
    public final P2 f3986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3987s;

    /* renamed from: t, reason: collision with root package name */
    public AbstractC0911k f3988t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public H(r rVar, L4.f fVar, P2 p22, w wVar) {
        super(rVar, r0, fVar, L4.e.f4353d, L4.e.f4352c, wVar);
        H2.r rVar2 = Y4.D.f7692d;
        if (rVar2 == null) {
            synchronized (Y4.D.class) {
                try {
                    rVar2 = Y4.D.f7692d;
                    if (rVar2 == null) {
                        C0282o c3 = H2.r.c();
                        c3.f3012d = c0.f6471c;
                        c3.f3013e = H2.r.b("google.firestore.v1.Firestore", "Write");
                        c3.f3009a = true;
                        O0 y4 = O0.y();
                        C0928t c0928t = AbstractC0791c.f10155a;
                        c3.f3010b = new C0790b(y4);
                        c3.f3011c = new C0790b(P0.w());
                        rVar2 = c3.d();
                        Y4.D.f7692d = rVar2;
                    }
                } finally {
                }
            }
        }
        this.f3987s = false;
        this.f3988t = f3985u;
        this.f3986r = p22;
    }

    @Override // K4.AbstractC0315b
    public final void e(AbstractC0891a abstractC0891a) {
        this.f3988t = ((P0) abstractC0891a).x();
        this.f3987s = true;
        C0043s0 c0043s0 = ((w) this.f4006l).f4071a;
        H h6 = (H) c0043s0.j;
        AbstractC0911k abstractC0911k = h6.f3988t;
        C0279l c0279l = (C0279l) c0043s0.f555e;
        c0279l.f2991a.H(new A0.f(14, c0279l, abstractC0911k), "Set stream token");
        Iterator it = ((ArrayDeque) c0043s0.f561l).iterator();
        while (it.hasNext()) {
            h6.j(((I4.i) it.next()).f3676d);
        }
    }

    @Override // K4.AbstractC0315b
    public final void f(AbstractC0891a abstractC0891a) {
        P0 p02 = (P0) abstractC0891a;
        this.f3988t = p02.x();
        this.f4005k.f4384f = 0L;
        z0 v6 = p02.v();
        this.f3986r.getClass();
        H4.n n2 = P2.n(v6);
        int z4 = p02.z();
        ArrayList arrayList = new ArrayList(z4);
        for (int i7 = 0; i7 < z4; i7++) {
            arrayList.add(P2.l(p02.y(i7), n2));
        }
        C0043s0 c0043s0 = ((w) this.f4006l).f4071a;
        I4.i iVar = (I4.i) ((ArrayDeque) c0043s0.f561l).poll();
        AbstractC0911k abstractC0911k = ((H) c0043s0.j).f3988t;
        boolean z7 = iVar.f3676d.size() == arrayList.size();
        List list = iVar.f3676d;
        p3.f.O("Mutations sent %d must equal results received %d", z7, Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        AbstractC1341c abstractC1341c = H4.g.f3315a;
        for (int i8 = 0; i8 < list.size(); i8++) {
            abstractC1341c = abstractC1341c.D(((I4.h) list.get(i8)).f3670a, ((I4.k) arrayList.get(i8)).f3683a);
        }
        I4.j jVar = new I4.j(iVar, n2, arrayList, abstractC0911k, abstractC1341c);
        E4.H e7 = ((E4.z) ((C1023h) c0043s0.f554d).f12667a).e();
        e7.a("handleSuccessfulWrite");
        I4.i iVar2 = (I4.i) jVar.f3678b;
        e7.f(iVar2.f3673a, null);
        e7.j(iVar2.f3673a);
        C0279l c0279l = e7.f2111a;
        e7.b((AbstractC1341c) c0279l.f2991a.G("Acknowledge batch", new B1.c(3, c0279l, jVar)), null);
        c0043s0.f();
    }

    @Override // K4.AbstractC0315b
    public final void g() {
        this.f3987s = false;
        super.g();
    }

    @Override // K4.AbstractC0315b
    public final void h() {
        if (this.f3987s) {
            j(Collections.emptyList());
        }
    }

    public final void j(List list) {
        p3.f.O("Writing mutations requires an opened stream", c(), new Object[0]);
        p3.f.O("Handshake must be complete before writing mutations", this.f3987s, new Object[0]);
        M0 z4 = O0.z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L0 v6 = this.f3986r.v((I4.h) it.next());
            z4.d();
            O0.x((O0) z4.f12096b, v6);
        }
        AbstractC0911k abstractC0911k = this.f3988t;
        z4.d();
        O0.w((O0) z4.f12096b, abstractC0911k);
        i((O0) z4.b());
    }
}
