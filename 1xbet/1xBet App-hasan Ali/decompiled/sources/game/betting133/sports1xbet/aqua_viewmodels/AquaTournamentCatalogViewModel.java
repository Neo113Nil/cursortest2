package game.betting133.sports1xbet.aqua_viewmodels;

import U3.g;
import a.AbstractC0444a;
import a3.AbstractC0467k;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionCard;
import game.betting133.sports1xbet.aqua_network.AquaTerritoryCard;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;
import p4.AbstractC2282w;
import s4.C;
import s4.K;
import s4.M;
import s4.v;
import s4.x;

/* loaded from: classes.dex */
public final class AquaTournamentCatalogViewModel extends S {
    public static final int ROWS_P_par_ER_PAGE = 18;
    private final v catalog_par_Channel;
    private final K fr_par_ame;
    private final g league_par_Archive;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AquaTournamentCatalogViewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebuildVimeanssiblePage() {
        AquaTournamentCatalogUiState aquaTournamentCatalogUiState = (AquaTournamentCatalogUiState) ((M) this.catalog_par_Channel).getValue();
        String lowerCase = AbstractC2227e.Q0(aquaTournamentCatalogUiState.getSearc_par_hText()).toString().toLowerCase(Locale.ROOT);
        l.e("toLowerCase(...)", lowerCase);
        ArrayList arrayList = new ArrayList();
        for (AquaCompetitionBundle aquaCompetitionBundle : aquaTournamentCatalogUiState.getAll_par_Rows()) {
            AquaCompetitionCard compe_par_tition = aquaCompetitionBundle.getCompe_par_tition();
            String ti_par_tle = compe_par_tition != null ? compe_par_tition.getTi_par_tle() : null;
            if (ti_par_tle == null) {
                ti_par_tle = "";
            }
            AquaTerritoryCard terr_par_itory = aquaCompetitionBundle.getTerr_par_itory();
            String ti_par_tle2 = terr_par_itory != null ? terr_par_itory.getTi_par_tle() : null;
            String lowerCase2 = AbstractC0467k.v(ti_par_tle, " ", ti_par_tle2 != null ? ti_par_tle2 : "").toLowerCase(Locale.ROOT);
            l.e("toLowerCase(...)", lowerCase2);
            if (lowerCase.length() == 0 || AbstractC2227e.B0(lowerCase2, lowerCase)) {
                arrayList.add(aquaCompetitionBundle);
            }
        }
        int size = (arrayList.size() / 18) + (arrayList.size() % 18 == 0 ? 0 : 1);
        int i = size < 1 ? 1 : size;
        int t5 = AbstractC0444a.t(aquaTournamentCatalogUiState.getPageN_par_umber(), 1, i);
        int i5 = (t5 - 1) * 18;
        int min = Math.min(i5 + 18, arrayList.size());
        ((M) this.catalog_par_Channel).i(AquaTournamentCatalogUiState.copy$default(aquaTournamentCatalogUiState, false, null, null, null, arrayList, i5 < min ? arrayList.subList(i5, min) : X3.v.f6090k, t5, i, 15, null));
    }

    public final K getFr_par_ame() {
        return this.fr_par_ame;
    }

    public final void reloadTournmeansamentCatalog() {
        M m5 = (M) this.catalog_par_Channel;
        m5.i(AquaTournamentCatalogUiState.copy$default((AquaTournamentCatalogUiState) m5.getValue(), true, null, null, null, null, null, 0, 0, 252, null));
        AbstractC2282w.p(L.j(this), null, new AquaTournamentCatalogViewModel$reloadTournmeansamentCatalog$1(this, null), 3);
    }

    public final void reviseSemeansarchDraft(String str) {
        l.f("keywordDraft", str);
        AquaTournamentCatalogUiState aquaTournamentCatalogUiState = (AquaTournamentCatalogUiState) ((M) this.catalog_par_Channel).getValue();
        ((M) this.catalog_par_Channel).i(AquaTournamentCatalogUiState.copy$default(aquaTournamentCatalogUiState, false, null, str, null, null, null, 1, 0, 187, null));
        rebuildVimeanssiblePage();
    }

    public final void stepBameansckPage() {
        AquaTournamentCatalogUiState aquaTournamentCatalogUiState = (AquaTournamentCatalogUiState) ((M) this.catalog_par_Channel).getValue();
        int pageN_par_umber = aquaTournamentCatalogUiState.getPageN_par_umber() - 1;
        if (pageN_par_umber < 1) {
            return;
        }
        ((M) this.catalog_par_Channel).i(AquaTournamentCatalogUiState.copy$default(aquaTournamentCatalogUiState, false, null, null, null, null, null, pageN_par_umber, 0, 191, null));
        rebuildVimeanssiblePage();
    }

    public final void stepFormeanswardPage() {
        AquaTournamentCatalogUiState aquaTournamentCatalogUiState = (AquaTournamentCatalogUiState) ((M) this.catalog_par_Channel).getValue();
        int pageN_par_umber = aquaTournamentCatalogUiState.getPageN_par_umber() + 1;
        if (pageN_par_umber > aquaTournamentCatalogUiState.getPage_par_Count()) {
            return;
        }
        ((M) this.catalog_par_Channel).i(AquaTournamentCatalogUiState.copy$default(aquaTournamentCatalogUiState, false, null, null, null, null, null, pageN_par_umber, 0, 191, null));
        rebuildVimeanssiblePage();
    }

    public /* synthetic */ AquaTournamentCatalogViewModel(g gVar, int i, f fVar) {
        this((i & 1) != 0 ? new g() : gVar);
    }

    public AquaTournamentCatalogViewModel(g gVar) {
        l.f("league_par_Archive", gVar);
        this.league_par_Archive = gVar;
        M b3 = C.b(new AquaTournamentCatalogUiState(false, null, null, null, null, null, 0, 0, 255, null));
        this.catalog_par_Channel = b3;
        this.fr_par_ame = new x(b3);
        reloadTournmeansamentCatalog();
    }
}
