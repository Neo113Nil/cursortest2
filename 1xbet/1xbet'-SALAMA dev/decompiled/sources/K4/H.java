package K4;

import A1.C0043s0;
import G4.C0279l;
import G4.C0282o;
import U5.c0;
import Y4.L0;
import Y4.M0;
import Y4.O0;
import Y4.P0;
import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C0865j;
import com.google.protobuf.C0884t;
import com.google.protobuf.z0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC0315b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0865j f3985u = AbstractC0867k.f12212b;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final P2 f3986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0867k f3988t;

    /* JADX WARN: Illegal instructions before constructor call */
    public H(r rVar, L4.f fVar, P2 p5, w wVar) {
        H2.r rVarD = Y4.D.f7692d;
        if (rVarD == null) {
            synchronized (Y4.D.class) {
                try {
                    rVarD = Y4.D.f7692d;
                    if (rVarD == null) {
                        C0282o c0282oC = H2.r.c();
                        c0282oC.f3012d = c0.f6471c;
                        c0282oC.f3013e = H2.r.b("google.firestore.v1.Firestore", "Write");
                        c0282oC.f3009a = true;
                        O0 o0Y = O0.y();
                        C0884t c0884t = p016b6.c.f10155a;
                        c0282oC.f3010b = new p016b6.b(o0Y);
                        c0282oC.f3011c = new p016b6.b(P0.w());
                        rVarD = c0282oC.d();
                        Y4.D.f7692d = rVarD;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(rVar, rVarD, fVar, L4.e.f4353d, L4.e.f4352c, wVar);
        this.f3987s = false;
        this.f3988t = f3985u;
        this.f3986r = p5;
    }

    @Override // K4.AbstractC0315b
    public final void e(AbstractC0847a abstractC0847a) {
        this.f3988t = ((P0) abstractC0847a).x();
        this.f3987s = true;
        C0043s0 c0043s0 = ((w) this.f4006l).f4071a;
        H h6 = (H) c0043s0.j;
        AbstractC0867k abstractC0867k = h6.f3988t;
        C0279l c0279l = (C0279l) c0043s0.f555e;
        c0279l.f2991a.H(new A0.f(14, c0279l, abstractC0867k), "Set stream token");
        Iterator it = ((ArrayDeque) c0043s0.f561l).iterator();
        while (it.hasNext()) {
            h6.j(((I4.i) it.next()).f3676d);
        }
    }

    @Override // K4.AbstractC0315b
    public final void f(AbstractC0847a abstractC0847a) {
        P0 p5 = (P0) abstractC0847a;
        this.f3988t = p5.x();
        this.f4005k.f4384f = 0L;
        z0 z0VarV = p5.v();
        this.f3986r.getClass();
        H4.n nVarN = P2.n(z0VarV);
        int iZ = p5.z();
        ArrayList arrayList = new ArrayList(iZ);
        for (int i7 = 0; i7 < iZ; i7++) {
            arrayList.add(P2.l(p5.y(i7), nVarN));
        }
        C0043s0 c0043s0 = ((w) this.f4006l).f4071a;
        I4.i iVar = (I4.i) ((ArrayDeque) c0043s0.f561l).poll();
        AbstractC0867k abstractC0867k = ((H) c0043s0.j).f3988t;
        boolean z4 = iVar.f3676d.size() == arrayList.size();
        List list = iVar.f3676d;
        p113p3.f.O("Mutations sent %d must equal results received %d", z4, Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        p075k4.c cVarD = H4.g.f3315a;
        for (int i8 = 0; i8 < list.size(); i8++) {
            cVarD = cVarD.D(((I4.h) list.get(i8)).f3670a, ((I4.k) arrayList.get(i8)).f3683a);
        }
        I4.j jVar = new I4.j(iVar, nVarN, arrayList, abstractC0867k, cVarD);
        E4.H hE = ((E4.z) ((p033e3.h) c0043s0.f554d).f12673a).e();
        hE.a("handleSuccessfulWrite");
        I4.i iVar2 = (I4.i) jVar.f3678b;
        hE.f(iVar2.f3673a, null);
        hE.j(iVar2.f3673a);
        C0279l c0279l = hE.f2111a;
        hE.b((p075k4.c) c0279l.f2991a.G("Acknowledge batch", new B1.c(3, c0279l, jVar)), null);
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
        p113p3.f.O("Writing mutations requires an opened stream", c(), new Object[0]);
        p113p3.f.O("Handshake must be complete before writing mutations", this.f3987s, new Object[0]);
        M0 m0Z = O0.z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L0 l0V = this.f3986r.v((I4.h) it.next());
            m0Z.d();
            O0.x((O0) m0Z.f12096b, l0V);
        }
        AbstractC0867k abstractC0867k = this.f3988t;
        m0Z.d();
        O0.w((O0) m0Z.f12096b, abstractC0867k);
        i((O0) m0Z.b());
    }
}
