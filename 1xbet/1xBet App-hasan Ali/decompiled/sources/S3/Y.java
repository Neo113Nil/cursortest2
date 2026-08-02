package S3;

import A.C0003c;
import P.C0302l;
import P.C0315s;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaPlayerSheet;
import i4.InterfaceC2015a;
import java.util.List;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5426l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f5427m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.e f5428n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(List list, i4.e eVar, int i) {
        super(4);
        this.f5426l = i;
        this.f5427m = list;
        this.f5428n = eVar;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i5;
        switch (this.f5426l) {
            case 0:
                C0003c c0003c = (C0003c) obj;
                int intValue = ((Number) obj2).intValue();
                C0315s c0315s = (C0315s) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c0315s.f(c0003c) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c0315s.d(intValue) ? 32 : 16;
                }
                if ((i & 147) == 146 && c0315s.B()) {
                    c0315s.S();
                } else {
                    AquaPlayerSheet aquaPlayerSheet = (AquaPlayerSheet) this.f5427m.get(intValue);
                    c0315s.X(155409009);
                    c0315s.X(282108788);
                    boolean h3 = c0315s.h(aquaPlayerSheet);
                    i4.e eVar = this.f5428n;
                    boolean f = h3 | c0315s.f(eVar);
                    Object M5 = c0315s.M();
                    if (f || M5 == C0302l.f4480a) {
                        M5 = new F4.k(aquaPlayerSheet, eVar, 2);
                        c0315s.i0(M5);
                    }
                    c0315s.q(false);
                    Z.a(aquaPlayerSheet, (InterfaceC2015a) M5, c0315s, 0);
                    c0315s.q(false);
                }
                break;
            default:
                C0003c c0003c2 = (C0003c) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0315s c0315s2 = (C0315s) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i5 = (c0315s2.f(c0003c2) ? 4 : 2) | intValue4;
                } else {
                    i5 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i5 |= c0315s2.d(intValue3) ? 32 : 16;
                }
                if ((i5 & 147) == 146 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) this.f5427m.get(intValue3);
                    c0315s2.X(367100235);
                    c0315s2.X(1120221871);
                    boolean h4 = c0315s2.h(aquaCompetitionBundle);
                    i4.e eVar2 = this.f5428n;
                    boolean f5 = h4 | c0315s2.f(eVar2);
                    Object M6 = c0315s2.M();
                    if (f5 || M6 == C0302l.f4480a) {
                        M6 = new F4.k(aquaCompetitionBundle, eVar2, 3);
                        c0315s2.i0(M6);
                    }
                    c0315s2.q(false);
                    AbstractC2346c.I(aquaCompetitionBundle, (InterfaceC2015a) M6, c0315s2, 0);
                    c0315s2.q(false);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
