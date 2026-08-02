package S3;

import A.C0003c;
import M.p0;
import P.C0315s;
import game.betting133.sports1xbet.aqua_network.AquaClubBadge;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionPocket;
import game.betting133.sports1xbet.aqua_network.AquaMatchCard;
import game.betting133.sports1xbet.aqua_network.AquaMatchTicket;
import v.AbstractC2527w;

/* renamed from: S3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410m implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AquaCompetitionPocket f5520k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.e f5521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AquaMatchCard f5522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AquaClubBadge f5523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.c f5524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AquaClubBadge f5525p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AquaMatchTicket f5526q;

    public C0410m(AquaCompetitionPocket aquaCompetitionPocket, i4.e eVar, AquaMatchCard aquaMatchCard, AquaClubBadge aquaClubBadge, i4.c cVar, AquaClubBadge aquaClubBadge2, AquaMatchTicket aquaMatchTicket) {
        this.f5520k = aquaCompetitionPocket;
        this.f5521l = eVar;
        this.f5522m = aquaMatchCard;
        this.f5523n = aquaClubBadge;
        this.f5524o = cVar;
        this.f5525p = aquaClubBadge2;
        this.f5526q = aquaMatchTicket;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C0315s c0315s = (C0315s) obj2;
        int intValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("$this$item", (C0003c) obj);
        if ((intValue & 17) == 16 && c0315s.B()) {
            c0315s.S();
        } else {
            p0.a(androidx.compose.foundation.layout.c.b(b0.m.f7161k, 1.0f), R3.j.f5218a, V3.a.f5962A, 4, 10, AbstractC2527w.a(1, i0.p.b(0.45f, V3.a.f5995z)), X.e.d(1098535786, new C0409l(this.f5520k, this.f5521l, this.f5522m, this.f5523n, this.f5524o, this.f5525p, this.f5526q), c0315s), c0315s, 14377398, 8);
        }
        return W3.o.f6046a;
    }
}
