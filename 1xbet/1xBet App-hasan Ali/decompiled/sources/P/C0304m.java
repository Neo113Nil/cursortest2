package P;

import Q.C0336a;
import Q.C0337b;
import a.AbstractC0444a;
import a0.C0445a;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueUiState;
import i4.InterfaceC2015a;
import java.util.Iterator;
import java.util.List;
import r.C2343v;
import r0.AbstractC2346c;

/* renamed from: P.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0304m implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4481k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4482l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4483m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4484n;

    public /* synthetic */ C0304m(C0315s c0315s, C0336a c0336a, L0 l02, AbstractC0287d0 abstractC0287d0) {
        this.f4481k = 0;
        this.f4482l = c0315s;
        this.f4483m = c0336a;
        this.f4484n = l02;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        Integer num;
        Object obj;
        switch (this.f4481k) {
            case 0:
                C0336a c0336a = (C0336a) this.f4483m;
                L0 l02 = (L0) this.f4484n;
                C0315s c0315s = (C0315s) this.f4482l;
                C0337b c0337b = c0315s.f4524M;
                C0336a c0336a2 = c0337b.f4815b;
                try {
                    c0337b.f4815b = c0336a;
                    L0 l03 = c0315s.f4520G;
                    int[] iArr = c0315s.f4545o;
                    C2343v c2343v = c0315s.f4552v;
                    c0315s.f4545o = null;
                    c0315s.f4552v = null;
                    try {
                        c0315s.f4520G = l02;
                        boolean z3 = c0337b.f4818e;
                        try {
                            c0337b.f4818e = false;
                            throw null;
                        } finally {
                        }
                    } catch (Throwable th) {
                        c0315s.f4520G = l03;
                        c0315s.f4545o = iArr;
                        c0315s.f4552v = c2343v;
                        throw th;
                    }
                } catch (Throwable th2) {
                    c0337b.f4815b = c0336a2;
                    throw th2;
                }
            case 1:
                P0 p02 = (P0) this.f4483m;
                C0280a c0280a = (C0280a) this.f4482l;
                if (c0280a != null) {
                    p02.a(p02.c(c0280a) - p02.f4383t);
                }
                List i = AbstractC0444a.i(p02, null, p02.f4383t, null);
                C0445a c0445a = (C0445a) X3.m.f0(i);
                Integer num2 = c0445a != null ? c0445a.f6362a : null;
                List e3 = ((Q.J) this.f4484n).e(num2);
                if (num2 != null && !e3.isEmpty()) {
                    C0445a c0445a2 = (C0445a) X3.m.Y(e3);
                    List W4 = X3.m.W(e3);
                    c0445a2.getClass();
                    e3 = X3.m.i0(AbstractC2346c.A(new C0445a(null, num2)), W4);
                }
                return X3.m.i0(i, e3);
            default:
                Iterator<T> it = ((AquaSpotlightLeagueUiState) ((InterfaceC0289e0) this.f4484n).getValue()).getLeagu_par_eRows().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    num = (Integer) this.f4483m;
                    if (hasNext) {
                        Object next = it.next();
                        AquaCompetitionCard compe_par_tition = ((AquaCompetitionBundle) next).getCompe_par_tition();
                        if (kotlin.jvm.internal.l.a(compe_par_tition != null ? Integer.valueOf(compe_par_tition.getCode_arg()) : null, num)) {
                            obj = next;
                        }
                    }
                }
                AquaCompetitionBundle aquaCompetitionBundle = (AquaCompetitionBundle) obj;
                if (aquaCompetitionBundle != null) {
                    ((i4.e) this.f4482l).invoke(num, Integer.valueOf(AquaDisplayFormattersKt.selectNewesmeanstSeasonYear(aquaCompetitionBundle.getCamp_par_aigns())));
                }
                return W3.o.f6046a;
        }
    }

    public /* synthetic */ C0304m(Object obj, Object obj2, Object obj3, int i) {
        this.f4481k = i;
        this.f4482l = obj;
        this.f4483m = obj2;
        this.f4484n = obj3;
    }
}
