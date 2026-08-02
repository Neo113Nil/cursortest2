package T3;

import G1.E;
import W3.o;
import i4.InterfaceC2015a;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5766k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f5767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5768m;

    public /* synthetic */ c(E e3, int i, int i5) {
        this.f5766k = i5;
        this.f5767l = e3;
        this.f5768m = i;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        o oVar = o.f6046a;
        E e3 = this.f5767l;
        int i = this.f5768m;
        switch (this.f5766k) {
            case 0:
                W3.h hVar = new W3.h[]{new W3.h("matchKey", Integer.valueOf(i))}[0];
                E.l(e3, AbstractC2234l.v0("appR/navigator/match_overview/{matchKey}", "{" + hVar.f6036k + "}", String.valueOf(((Number) hVar.f6037l).intValue())), null, 6);
                break;
            case 1:
                W3.h hVar2 = new W3.h[]{new W3.h("matchKey", Integer.valueOf(i))}[0];
                E.l(e3, AbstractC2234l.v0("appR/navigator/match_timeline/{matchKey}", "{" + hVar2.f6036k + "}", String.valueOf(((Number) hVar2.f6037l).intValue())), null, 6);
                break;
            case 2:
                W3.h hVar3 = new W3.h[]{new W3.h("matchKey", Integer.valueOf(i))}[0];
                E.l(e3, AbstractC2234l.v0("appR/navigator/match_statistics/{matchKey}", "{" + hVar3.f6036k + "}", String.valueOf(((Number) hVar3.f6037l).intValue())), null, 6);
                break;
            case 3:
                W3.h hVar4 = new W3.h[]{new W3.h("teamKey", Integer.valueOf(i))}[0];
                E.l(e3, AbstractC2234l.v0("appR/navigator/team_roster/{teamKey}", "{" + hVar4.f6036k + "}", String.valueOf(((Number) hVar4.f6037l).intValue())), null, 6);
                break;
            default:
                W3.h hVar5 = new W3.h[]{new W3.h("leagueKey", Integer.valueOf(i))}[0];
                E.l(e3, AbstractC2234l.v0("appR/navigator/season_selector/{leagueKey}", "{" + hVar5.f6036k + "}", String.valueOf(((Number) hVar5.f6037l).intValue())), null, 6);
                break;
        }
        return oVar;
    }
}
