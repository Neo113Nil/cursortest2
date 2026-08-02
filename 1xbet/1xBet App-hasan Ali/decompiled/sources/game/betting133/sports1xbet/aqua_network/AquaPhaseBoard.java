package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaPhaseBoard {
    public static final int $stable = 0;

    @b("extratime")
    private final AquaGoalBoard ex_par_tra;

    @b("halftime")
    private final AquaGoalBoard interm_par_ission;

    @b("fulltime")
    private final AquaGoalBoard regul_par_ation;

    @b("penalty")
    private final AquaGoalBoard shoo_par_tout;

    public AquaPhaseBoard() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AquaPhaseBoard copy$default(AquaPhaseBoard aquaPhaseBoard, AquaGoalBoard aquaGoalBoard, AquaGoalBoard aquaGoalBoard2, AquaGoalBoard aquaGoalBoard3, AquaGoalBoard aquaGoalBoard4, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaGoalBoard = aquaPhaseBoard.interm_par_ission;
        }
        if ((i & 2) != 0) {
            aquaGoalBoard2 = aquaPhaseBoard.regul_par_ation;
        }
        if ((i & 4) != 0) {
            aquaGoalBoard3 = aquaPhaseBoard.ex_par_tra;
        }
        if ((i & 8) != 0) {
            aquaGoalBoard4 = aquaPhaseBoard.shoo_par_tout;
        }
        return aquaPhaseBoard.copy(aquaGoalBoard, aquaGoalBoard2, aquaGoalBoard3, aquaGoalBoard4);
    }

    public final AquaGoalBoard component1() {
        return this.interm_par_ission;
    }

    public final AquaGoalBoard component2() {
        return this.regul_par_ation;
    }

    public final AquaGoalBoard component3() {
        return this.ex_par_tra;
    }

    public final AquaGoalBoard component4() {
        return this.shoo_par_tout;
    }

    public final AquaPhaseBoard copy(AquaGoalBoard aquaGoalBoard, AquaGoalBoard aquaGoalBoard2, AquaGoalBoard aquaGoalBoard3, AquaGoalBoard aquaGoalBoard4) {
        return new AquaPhaseBoard(aquaGoalBoard, aquaGoalBoard2, aquaGoalBoard3, aquaGoalBoard4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaPhaseBoard)) {
            return false;
        }
        AquaPhaseBoard aquaPhaseBoard = (AquaPhaseBoard) obj;
        return l.a(this.interm_par_ission, aquaPhaseBoard.interm_par_ission) && l.a(this.regul_par_ation, aquaPhaseBoard.regul_par_ation) && l.a(this.ex_par_tra, aquaPhaseBoard.ex_par_tra) && l.a(this.shoo_par_tout, aquaPhaseBoard.shoo_par_tout);
    }

    public final AquaGoalBoard getEx_par_tra() {
        return this.ex_par_tra;
    }

    public final AquaGoalBoard getInterm_par_ission() {
        return this.interm_par_ission;
    }

    public final AquaGoalBoard getRegul_par_ation() {
        return this.regul_par_ation;
    }

    public final AquaGoalBoard getShoo_par_tout() {
        return this.shoo_par_tout;
    }

    public int hashCode() {
        AquaGoalBoard aquaGoalBoard = this.interm_par_ission;
        int hashCode = (aquaGoalBoard == null ? 0 : aquaGoalBoard.hashCode()) * 31;
        AquaGoalBoard aquaGoalBoard2 = this.regul_par_ation;
        int hashCode2 = (hashCode + (aquaGoalBoard2 == null ? 0 : aquaGoalBoard2.hashCode())) * 31;
        AquaGoalBoard aquaGoalBoard3 = this.ex_par_tra;
        int hashCode3 = (hashCode2 + (aquaGoalBoard3 == null ? 0 : aquaGoalBoard3.hashCode())) * 31;
        AquaGoalBoard aquaGoalBoard4 = this.shoo_par_tout;
        return hashCode3 + (aquaGoalBoard4 != null ? aquaGoalBoard4.hashCode() : 0);
    }

    public String toString() {
        return "AquaPhaseBoard(interm_par_ission=" + this.interm_par_ission + ", regul_par_ation=" + this.regul_par_ation + ", ex_par_tra=" + this.ex_par_tra + ", shoo_par_tout=" + this.shoo_par_tout + ")";
    }

    public AquaPhaseBoard(AquaGoalBoard aquaGoalBoard, AquaGoalBoard aquaGoalBoard2, AquaGoalBoard aquaGoalBoard3, AquaGoalBoard aquaGoalBoard4) {
        this.interm_par_ission = aquaGoalBoard;
        this.regul_par_ation = aquaGoalBoard2;
        this.ex_par_tra = aquaGoalBoard3;
        this.shoo_par_tout = aquaGoalBoard4;
    }

    public /* synthetic */ AquaPhaseBoard(AquaGoalBoard aquaGoalBoard, AquaGoalBoard aquaGoalBoard2, AquaGoalBoard aquaGoalBoard3, AquaGoalBoard aquaGoalBoard4, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaGoalBoard, (i & 2) != 0 ? null : aquaGoalBoard2, (i & 4) != 0 ? null : aquaGoalBoard3, (i & 8) != 0 ? null : aquaGoalBoard4);
    }
}
