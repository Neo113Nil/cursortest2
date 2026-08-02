package O3;

import P.AbstractC0317t;
import P.AbstractC0329z;
import P.C0308o;
import P.C0315s;
import P.C0326x0;
import P.H0;
import P.InterfaceC0298j;
import P.P0;
import Q2.C0;
import S3.K;
import S3.Z;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import i4.InterfaceC2015a;
import r0.AbstractC2346c;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4087k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4089m;

    public /* synthetic */ o(int i, int i5, Object obj, Object obj2) {
        this.f4087k = i5;
        this.f4088l = obj;
        this.f4089m = obj2;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4087k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(49);
                ((s) this.f4088l).a((String) this.f4089m, (C0315s) obj, B5);
                break;
            case 1:
                int intValue = ((Integer) obj).intValue();
                boolean z3 = obj2 instanceof InterfaceC0298j;
                C0 c02 = (C0) this.f4088l;
                if (z3) {
                    ((R.e) c02.f).c((InterfaceC0298j) obj2);
                } else {
                    boolean z5 = obj2 instanceof H0;
                    P0 p02 = (P0) this.f4089m;
                    if (z5) {
                        H0 h02 = (H0) obj2;
                        if (!(h02.f4319a instanceof C0308o)) {
                            AbstractC0317t.g(p02, intValue, obj2);
                            c02.d(h02);
                        }
                    } else if (obj2 instanceof C0326x0) {
                        AbstractC0317t.g(p02, intValue, obj2);
                        ((C0326x0) obj2).d();
                    }
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(49);
                X.d dVar = (X.d) this.f4089m;
                R3.j.d((b0.p) this.f4088l, dVar, (C0315s) obj, B6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int B7 = AbstractC0329z.B(1);
                N4.b.s((InterfaceC2015a) this.f4088l, (InterfaceC2015a) this.f4089m, (C0315s) obj, B7);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int B8 = AbstractC0329z.B(1);
                K.b((AquaMatchTicket) this.f4088l, (InterfaceC2015a) this.f4089m, (C0315s) obj, B8);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int B9 = AbstractC0329z.B(1);
                Z.a((AquaPlayerSheet) this.f4088l, (InterfaceC2015a) this.f4089m, (C0315s) obj, B9);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int B10 = AbstractC0329z.B(1);
                AbstractC2346c.I((AquaCompetitionBundle) this.f4088l, (InterfaceC2015a) this.f4089m, (C0315s) obj, B10);
                break;
            default:
                ((Integer) obj2).getClass();
                int B11 = AbstractC0329z.B(7);
                AbstractC2349a.N((b0.p) this.f4088l, (i4.c) this.f4089m, (C0315s) obj, B11);
                break;
        }
        return W3.o.f6046a;
    }

    public /* synthetic */ o(C0 c02, P0 p02) {
        this.f4087k = 1;
        this.f4088l = c02;
        this.f4089m = p02;
    }
}
