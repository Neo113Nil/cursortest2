package S3;

import A.C0003c;
import P.C0302l;
import P.C0315s;
import P.InterfaceC0289e0;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import i4.InterfaceC2015a;
import java.util.List;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f5412l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.e f5413m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5414n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(List list, i4.e eVar, InterfaceC0289e0 interfaceC0289e0) {
        super(4);
        this.f5412l = list;
        this.f5413m = eVar;
        this.f5414n = interfaceC0289e0;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) this.f5412l.get(intValue);
            c0315s.X(2145175639);
            AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
            if (compe_par_tition != null) {
                int code_arg = compe_par_tition.getCode_arg();
                Integer num = (Integer) this.f5414n.getValue();
                boolean z3 = num != null && num.intValue() == code_arg;
                int i5 = intValue + 1;
                c0315s.X(2147423456);
                boolean g5 = c0315s.g(z3) | c0315s.f(this.f5413m) | c0315s.d(code_arg) | c0315s.h(aquaCompetitionBundle);
                Object M5 = c0315s.M();
                if (g5 || M5 == C0302l.f4480a) {
                    T t5 = new T(z3, this.f5413m, code_arg, aquaCompetitionBundle, this.f5414n);
                    c0315s.i0(t5);
                    M5 = t5;
                }
                c0315s.q(false);
                AbstractC2036a.X(aquaCompetitionBundle, i5, z3, (InterfaceC2015a) M5, c0315s, 0);
                c0315s.q(false);
            } else {
                c0315s.q(false);
            }
        }
        return W3.o.f6046a;
    }
}
