package game.betting133.sports1xbet.aqua_viewmodels;

import U3.g;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import p4.AbstractC2282w;
import s4.C;
import s4.K;
import s4.M;
import s4.v;
import s4.x;

/* loaded from: classes.dex */
public final class AquaSpotlightLeagueViewModel extends S {
    public static final int $stable = 8;
    private final K fr_par_ame;
    private final g highligh_par_tArchive;
    private final v highligh_par_tChannel;

    /* JADX WARN: Multi-variable type inference failed */
    public AquaSpotlightLeagueViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void querySpotlmeansightLeagues() {
        M m5 = (M) this.highligh_par_tChannel;
        m5.i(AquaSpotlightLeagueUiState.copy$default((AquaSpotlightLeagueUiState) m5.getValue(), true, null, null, 4, null));
        AbstractC2282w.p(L.j(this), null, new AquaSpotlightLeagueViewModel$querySpotlmeansightLeagues$1(this, null), 3);
    }

    public final K getFr_par_ame() {
        return this.fr_par_ame;
    }

    public final void reloadSpotlmeansightLeagues() {
        new AquaSpotlightLeagueViewModel$reloadSpotlmeansightLeagues$reload_par_Action$1(this).invoke();
    }

    public /* synthetic */ AquaSpotlightLeagueViewModel(g gVar, int i, f fVar) {
        this((i & 1) != 0 ? new g() : gVar);
    }

    public AquaSpotlightLeagueViewModel(g gVar) {
        l.f("highligh_par_tArchive", gVar);
        this.highligh_par_tArchive = gVar;
        M b3 = C.b(new AquaSpotlightLeagueUiState(false, null, null, 7, null));
        this.highligh_par_tChannel = b3;
        this.fr_par_ame = new x(b3);
        querySpotlmeansightLeagues();
    }
}
