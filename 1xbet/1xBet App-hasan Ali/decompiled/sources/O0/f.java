package O0;

import A0.J0;
import G.v;
import a.AbstractC0444a;
import android.graphics.Typeface;
import p4.AbstractC2282w;
import p4.i0;
import q4.C2313c;
import r.r;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final j3.i f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4018b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4019c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4020d;

    /* renamed from: e, reason: collision with root package name */
    public final J0 f4021e;

    public f(j3.i iVar, a aVar) {
        v vVar = g.f4022a;
        v vVar2 = g.f4022a;
        a4.i iVar2 = a4.i.f6649k;
        i iVar3 = new i();
        C2313c c2313c = S0.i.f5278a;
        h hVar = i.f4023a;
        hVar.getClass();
        AbstractC2282w.a(G4.l.H(hVar, c2313c).m(iVar2).m(new i0(null)));
        J0 j02 = new J0(9);
        this.f4017a = iVar;
        this.f4018b = aVar;
        this.f4019c = vVar;
        this.f4020d = iVar3;
        this.f4021e = j02;
        new e(0, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[Catch: Exception -> 0x0091, TRY_ENTER, TryCatch #2 {Exception -> 0x0091, blocks: (B:15:0x0028, B:17:0x003e, B:20:0x0043, B:22:0x0047, B:23:0x0060, B:39:0x0089, B:40:0x0090, B:43:0x0050, B:44:0x0052, B:45:0x0055, B:46:0x005b), top: B:14:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a(p pVar) {
        Typeface m5;
        q qVar;
        v vVar = this.f4019c;
        synchronized (((Q1.j) vVar.f1749l)) {
            q qVar2 = (q) ((r) vVar.f1750m).b(pVar);
            if (qVar2 != null) {
                if (qVar2.f4043l) {
                    return qVar2;
                }
            }
            try {
                this.f4020d.getClass();
                J0 j02 = this.f4021e;
                j02.getClass();
                o oVar = pVar.f4037a;
                j3.i iVar = (j3.i) j02.f304k;
                int i = pVar.f4039c;
                l lVar = pVar.f4038b;
                if (oVar != null && !(oVar instanceof b)) {
                    if (oVar instanceof n) {
                        m5 = iVar.o((n) oVar, lVar, i);
                        qVar = new q(m5);
                        if (qVar == null) {
                            throw new IllegalStateException("Could not load font");
                        }
                        synchronized (((Q1.j) vVar.f1749l)) {
                            if (((r) vVar.f1750m).b(pVar) == null && qVar.f4043l) {
                                ((r) vVar.f1750m).c(pVar, qVar);
                            }
                        }
                        return qVar;
                    }
                    qVar = null;
                    if (qVar == null) {
                    }
                }
                switch (iVar.f17520k) {
                    case 25:
                        m5 = j3.i.m(null, lVar, i);
                        break;
                    default:
                        m5 = j3.i.n(null, lVar, i);
                        break;
                }
                qVar = new q(m5);
                if (qVar == null) {
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Could not load font", e3);
            }
        }
    }

    public final q b(o oVar, l lVar, int i, int i5) {
        a aVar = this.f4018b;
        aVar.getClass();
        int i6 = aVar.f4014a;
        l lVar2 = (i6 == 0 || i6 == Integer.MAX_VALUE) ? lVar : new l(AbstractC0444a.t(lVar.f4033k + i6, 1, 1000));
        this.f4017a.getClass();
        return a(new p(oVar, lVar2, i, i5, null));
    }
}
