package u2;

import java.util.Arrays;
import n.AbstractC2107A;
import t2.C2421i;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final E2.i f20023a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20024b;

    /* renamed from: c, reason: collision with root package name */
    public final C2421i f20025c;

    public o(E2.i iVar, u uVar, C2421i c2421i) {
        this.f20023a = iVar;
        this.f20024b = uVar;
        this.f20025c = c2421i;
    }

    public final boolean equals(Object obj) {
        boolean a5;
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                E2.i iVar = oVar.f20023a;
                this.f20024b.getClass();
                E2.i iVar2 = this.f20023a;
                if (iVar2 != iVar) {
                    if (!AbstractC2107A.A(iVar2) || !AbstractC2107A.A(iVar)) {
                        a5 = kotlin.jvm.internal.l.a(iVar2, iVar);
                    } else if (!kotlin.jvm.internal.l.a(iVar2.f1437a, iVar.f1437a) || !iVar2.f1438b.equals(iVar.f1438b) || iVar2.f1440d != iVar.f1440d || !kotlin.jvm.internal.l.a(iVar2.f, iVar.f) || !kotlin.jvm.internal.l.a(iVar2.f1443h, iVar.f1443h) || iVar2.f1444j != iVar.f1444j || iVar2.f1445k != iVar.f1445k || iVar2.f1446l != iVar.f1446l || iVar2.f1447m != iVar.f1447m || iVar2.f1448n != iVar.f1448n || iVar2.f1449o != iVar.f1449o || iVar2.f1450p != iVar.f1450p || !iVar2.f1456v.equals(iVar.f1456v) || iVar2.f1457w != iVar.f1457w || iVar2.f1441e != iVar.f1441e || !iVar2.f1458x.equals(iVar.f1458x)) {
                        a5 = false;
                    }
                    if (a5 || !this.f20025c.equals(oVar.f20025c)) {
                    }
                }
                a5 = true;
                if (a5) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        this.f20024b.getClass();
        E2.i iVar = this.f20023a;
        if (AbstractC2107A.A(iVar)) {
            int hashCode2 = (iVar.f1440d.hashCode() + ((iVar.f1438b.hashCode() + (iVar.f1437a.hashCode() * 31)) * 923521)) * 961;
            iVar.f.getClass();
            hashCode = iVar.f1458x.f1476k.hashCode() + ((iVar.f1441e.hashCode() + ((iVar.f1457w.hashCode() + ((iVar.f1456v.hashCode() + ((iVar.f1450p.hashCode() + ((iVar.f1449o.hashCode() + ((iVar.f1448n.hashCode() + ((((((((((((1 + hashCode2) * 31) + Arrays.hashCode(iVar.f1443h.f21360k)) * 31) + (iVar.f1444j ? 1231 : 1237)) * 31) + (iVar.f1445k ? 1231 : 1237)) * 31) + (iVar.f1446l ? 1231 : 1237)) * 31) + (iVar.f1447m ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        } else {
            hashCode = iVar != null ? iVar.hashCode() : 0;
        }
        return this.f20025c.hashCode() + (hashCode * 31);
    }
}
