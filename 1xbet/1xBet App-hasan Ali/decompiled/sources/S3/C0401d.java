package S3;

import P.C0315s;
import a.AbstractC0444a;
import game.betting133.sports1xbet.aqua_network.AquaPlayerCard;
import x0.C2623i;

/* renamed from: S3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401d implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5470k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AquaPlayerCard f5471l;

    public /* synthetic */ C0401d(AquaPlayerCard aquaPlayerCard, int i) {
        this.f5470k = i;
        this.f5471l = aquaPlayerCard;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5470k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    AquaPlayerCard aquaPlayerCard = this.f5471l;
                    R3.l.a(aquaPlayerCard != null ? aquaPlayerCard.getPort_par_rait() : null, AbstractC0444a.n(androidx.compose.foundation.layout.b.f(androidx.compose.foundation.layout.c.f6868c, 4), D.e.a(6)), C2623i.f21000a, null, c0315s, 3120);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    AquaPlayerCard aquaPlayerCard2 = this.f5471l;
                    R3.l.a(aquaPlayerCard2 != null ? aquaPlayerCard2.getPort_par_rait() : null, androidx.compose.foundation.a.b(AbstractC0444a.n(androidx.compose.foundation.layout.b.f(b0.m.f7161k, 3).c(androidx.compose.foundation.layout.c.f6868c), D.e.f920a), V3.a.f, i0.F.f17222a), C2623i.f21000a, null, c0315s2, 3120);
                }
                break;
        }
        return W3.o.f6046a;
    }
}
