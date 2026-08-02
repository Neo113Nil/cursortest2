package game.betting133.sports1xbet.aqua_viewmodels;

import L1.a;
import game.betting133.sports1xbet.aqua_network.AquaCompetitionBundle;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaTournamentCatalogUiState {
    public static final int $stable = 8;
    private final List<AquaCompetitionBundle> all_par_Rows;
    private final boolean busy_arg;
    private final String faul_par_tText;
    private final List<AquaCompetitionBundle> filter_par_edRows;
    private final int pageN_par_umber;
    private final int page_par_Count;
    private final String searc_par_hText;
    private final List<AquaCompetitionBundle> visib_par_leRows;

    public AquaTournamentCatalogUiState() {
        this(false, null, null, null, null, null, 0, 0, 255, null);
    }

    public static /* synthetic */ AquaTournamentCatalogUiState copy$default(AquaTournamentCatalogUiState aquaTournamentCatalogUiState, boolean z3, String str, String str2, List list, List list2, List list3, int i, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z3 = aquaTournamentCatalogUiState.busy_arg;
        }
        if ((i6 & 2) != 0) {
            str = aquaTournamentCatalogUiState.faul_par_tText;
        }
        if ((i6 & 4) != 0) {
            str2 = aquaTournamentCatalogUiState.searc_par_hText;
        }
        if ((i6 & 8) != 0) {
            list = aquaTournamentCatalogUiState.all_par_Rows;
        }
        if ((i6 & 16) != 0) {
            list2 = aquaTournamentCatalogUiState.filter_par_edRows;
        }
        if ((i6 & 32) != 0) {
            list3 = aquaTournamentCatalogUiState.visib_par_leRows;
        }
        if ((i6 & 64) != 0) {
            i = aquaTournamentCatalogUiState.pageN_par_umber;
        }
        if ((i6 & 128) != 0) {
            i5 = aquaTournamentCatalogUiState.page_par_Count;
        }
        int i7 = i;
        int i8 = i5;
        List list4 = list2;
        List list5 = list3;
        return aquaTournamentCatalogUiState.copy(z3, str, str2, list, list4, list5, i7, i8);
    }

    public final boolean component1() {
        return this.busy_arg;
    }

    public final String component2() {
        return this.faul_par_tText;
    }

    public final String component3() {
        return this.searc_par_hText;
    }

    public final List<AquaCompetitionBundle> component4() {
        return this.all_par_Rows;
    }

    public final List<AquaCompetitionBundle> component5() {
        return this.filter_par_edRows;
    }

    public final List<AquaCompetitionBundle> component6() {
        return this.visib_par_leRows;
    }

    public final int component7() {
        return this.pageN_par_umber;
    }

    public final int component8() {
        return this.page_par_Count;
    }

    public final AquaTournamentCatalogUiState copy(boolean z3, String str, String str2, List<AquaCompetitionBundle> list, List<AquaCompetitionBundle> list2, List<AquaCompetitionBundle> list3, int i, int i5) {
        l.f("searc_par_hText", str2);
        l.f("all_par_Rows", list);
        l.f("filter_par_edRows", list2);
        l.f("visib_par_leRows", list3);
        return new AquaTournamentCatalogUiState(z3, str, str2, list, list2, list3, i, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaTournamentCatalogUiState)) {
            return false;
        }
        AquaTournamentCatalogUiState aquaTournamentCatalogUiState = (AquaTournamentCatalogUiState) obj;
        return this.busy_arg == aquaTournamentCatalogUiState.busy_arg && l.a(this.faul_par_tText, aquaTournamentCatalogUiState.faul_par_tText) && l.a(this.searc_par_hText, aquaTournamentCatalogUiState.searc_par_hText) && l.a(this.all_par_Rows, aquaTournamentCatalogUiState.all_par_Rows) && l.a(this.filter_par_edRows, aquaTournamentCatalogUiState.filter_par_edRows) && l.a(this.visib_par_leRows, aquaTournamentCatalogUiState.visib_par_leRows) && this.pageN_par_umber == aquaTournamentCatalogUiState.pageN_par_umber && this.page_par_Count == aquaTournamentCatalogUiState.page_par_Count;
    }

    public final List<AquaCompetitionBundle> getAll_par_Rows() {
        return this.all_par_Rows;
    }

    public final boolean getBusy_arg() {
        return this.busy_arg;
    }

    public final String getFaul_par_tText() {
        return this.faul_par_tText;
    }

    public final List<AquaCompetitionBundle> getFilter_par_edRows() {
        return this.filter_par_edRows;
    }

    public final int getPageN_par_umber() {
        return this.pageN_par_umber;
    }

    public final int getPage_par_Count() {
        return this.page_par_Count;
    }

    public final String getSearc_par_hText() {
        return this.searc_par_hText;
    }

    public final List<AquaCompetitionBundle> getVisib_par_leRows() {
        return this.visib_par_leRows;
    }

    public int hashCode() {
        int i = (this.busy_arg ? 1231 : 1237) * 31;
        String str = this.faul_par_tText;
        return ((((this.visib_par_leRows.hashCode() + ((this.filter_par_edRows.hashCode() + ((this.all_par_Rows.hashCode() + a.i((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.searc_par_hText)) * 31)) * 31)) * 31) + this.pageN_par_umber) * 31) + this.page_par_Count;
    }

    public String toString() {
        return "AquaTournamentCatalogUiState(busy_arg=" + this.busy_arg + ", faul_par_tText=" + this.faul_par_tText + ", searc_par_hText=" + this.searc_par_hText + ", all_par_Rows=" + this.all_par_Rows + ", filter_par_edRows=" + this.filter_par_edRows + ", visib_par_leRows=" + this.visib_par_leRows + ", pageN_par_umber=" + this.pageN_par_umber + ", page_par_Count=" + this.page_par_Count + ")";
    }

    public AquaTournamentCatalogUiState(boolean z3, String str, String str2, List<AquaCompetitionBundle> list, List<AquaCompetitionBundle> list2, List<AquaCompetitionBundle> list3, int i, int i5) {
        l.f("searc_par_hText", str2);
        l.f("all_par_Rows", list);
        l.f("filter_par_edRows", list2);
        l.f("visib_par_leRows", list3);
        this.busy_arg = z3;
        this.faul_par_tText = str;
        this.searc_par_hText = str2;
        this.all_par_Rows = list;
        this.filter_par_edRows = list2;
        this.visib_par_leRows = list3;
        this.pageN_par_umber = i;
        this.page_par_Count = i5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AquaTournamentCatalogUiState(boolean r2, java.lang.String r3, java.lang.String r4, java.util.List r5, java.util.List r6, java.util.List r7, int r8, int r9, int r10, kotlin.jvm.internal.f r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L5
            r2 = 0
        L5:
            r11 = r10 & 2
            if (r11 == 0) goto La
            r3 = 0
        La:
            r11 = r10 & 4
            if (r11 == 0) goto L10
            java.lang.String r4 = ""
        L10:
            r11 = r10 & 8
            X3.v r0 = X3.v.f6090k
            if (r11 == 0) goto L17
            r5 = r0
        L17:
            r11 = r10 & 16
            if (r11 == 0) goto L1c
            r6 = r0
        L1c:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            r7 = r0
        L21:
            r11 = r10 & 64
            r0 = 1
            if (r11 == 0) goto L27
            r8 = r0
        L27:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L35
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3e
        L35:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogUiState.<init>(boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, int, int, int, kotlin.jvm.internal.f):void");
    }
}
