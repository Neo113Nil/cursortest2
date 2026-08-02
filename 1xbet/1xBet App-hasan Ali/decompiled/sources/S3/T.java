package S3;

import P.InterfaceC0289e0;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_viewmodels.AquaDisplayFormattersKt;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final class T implements InterfaceC2015a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5407k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.e f5408l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AquaCompetitionBundle f5410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f5411o;

    public T(boolean z3, i4.e eVar, int i, AquaCompetitionBundle aquaCompetitionBundle, InterfaceC0289e0 interfaceC0289e0) {
        this.f5407k = z3;
        this.f5408l = eVar;
        this.f5409m = i;
        this.f5410n = aquaCompetitionBundle;
        this.f5411o = interfaceC0289e0;
    }

    @Override // i4.InterfaceC2015a
    public final Object invoke() {
        Integer valueOf;
        boolean z3 = this.f5407k;
        int i = this.f5409m;
        if (z3) {
            this.f5408l.invoke(Integer.valueOf(i), Integer.valueOf(AquaDisplayFormattersKt.selectNewesmeanstSeasonYear(this.f5410n.getCamp_par_aigns())));
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        this.f5411o.setValue(valueOf);
        return W3.o.f6046a;
    }
}
