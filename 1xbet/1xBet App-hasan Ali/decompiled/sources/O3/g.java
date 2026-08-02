package O3;

import P.AbstractC0329z;
import P.C0315s;
import S3.AbstractC0412o;
import S3.K;
import S3.Z;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_viewmodels.AquaSpotlightLeagueViewModel;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import o0.C2201e;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4061k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4064n;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i, int i5) {
        this.f4061k = i5;
        this.f4063m = obj;
        this.f4064n = obj2;
        this.f4062l = obj3;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4061k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                G4.l.j((String) this.f4063m, (J2.i) this.f4064n, (b0.p) this.f4062l, c0315s, AbstractC0329z.B(385));
                break;
            case 1:
                int B5 = AbstractC0329z.B(1);
                AbstractC0412o.f((AquaClubBadge) this.f4063m, (i4.c) this.f4064n, (b0.p) this.f4062l, c0315s, B5);
                break;
            case 2:
                int B6 = AbstractC0329z.B(1);
                N4.b.K((String) this.f4063m, (String) this.f4064n, (String) this.f4062l, c0315s, B6);
                break;
            case 3:
                int B7 = AbstractC0329z.B(1);
                K.e((String) this.f4063m, (String) this.f4064n, (b0.p) this.f4062l, c0315s, B7);
                break;
            case 4:
                int B8 = AbstractC0329z.B(1);
                AbstractC2036a.W((i4.e) this.f4063m, (InterfaceC2015a) this.f4064n, (AquaSpotlightLeagueViewModel) this.f4062l, c0315s, B8);
                break;
            case 5:
                int B9 = AbstractC0329z.B(7);
                Z.d((String) this.f4063m, (Integer) this.f4064n, (C2201e) this.f4062l, c0315s, B9);
                break;
            default:
                int B10 = AbstractC0329z.B(1);
                AbstractC2346c.H((i4.e) this.f4063m, this.f4064n, (AquaTournamentCatalogViewModel) this.f4062l, c0315s, B10);
                break;
        }
        return W3.o.f6046a;
    }
}
