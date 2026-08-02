package game.betting133.sports1xbet.aqua_network;

import G3.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class AquaMatchTicket {
    public static final int $stable = 0;

    @b("goals")
    private final AquaGoalBoard bo_par_ard;

    @b("league")
    private final AquaCompetitionPocket compe_par_tition;

    @b("teams")
    private final AquaDuelCard duel_arg;

    @b("fixture")
    private final AquaMatchCard ma_par_tch;

    @b("score")
    private final AquaPhaseBoard pha_par_ses;

    public AquaMatchTicket() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AquaMatchTicket copy$default(AquaMatchTicket aquaMatchTicket, AquaMatchCard aquaMatchCard, AquaCompetitionPocket aquaCompetitionPocket, AquaDuelCard aquaDuelCard, AquaGoalBoard aquaGoalBoard, AquaPhaseBoard aquaPhaseBoard, int i, Object obj) {
        if ((i & 1) != 0) {
            aquaMatchCard = aquaMatchTicket.ma_par_tch;
        }
        if ((i & 2) != 0) {
            aquaCompetitionPocket = aquaMatchTicket.compe_par_tition;
        }
        if ((i & 4) != 0) {
            aquaDuelCard = aquaMatchTicket.duel_arg;
        }
        if ((i & 8) != 0) {
            aquaGoalBoard = aquaMatchTicket.bo_par_ard;
        }
        if ((i & 16) != 0) {
            aquaPhaseBoard = aquaMatchTicket.pha_par_ses;
        }
        AquaPhaseBoard aquaPhaseBoard2 = aquaPhaseBoard;
        AquaDuelCard aquaDuelCard2 = aquaDuelCard;
        return aquaMatchTicket.copy(aquaMatchCard, aquaCompetitionPocket, aquaDuelCard2, aquaGoalBoard, aquaPhaseBoard2);
    }

    public final AquaMatchCard component1() {
        return this.ma_par_tch;
    }

    public final AquaCompetitionPocket component2() {
        return this.compe_par_tition;
    }

    public final AquaDuelCard component3() {
        return this.duel_arg;
    }

    public final AquaGoalBoard component4() {
        return this.bo_par_ard;
    }

    public final AquaPhaseBoard component5() {
        return this.pha_par_ses;
    }

    public final AquaMatchTicket copy(AquaMatchCard aquaMatchCard, AquaCompetitionPocket aquaCompetitionPocket, AquaDuelCard aquaDuelCard, AquaGoalBoard aquaGoalBoard, AquaPhaseBoard aquaPhaseBoard) {
        return new AquaMatchTicket(aquaMatchCard, aquaCompetitionPocket, aquaDuelCard, aquaGoalBoard, aquaPhaseBoard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AquaMatchTicket)) {
            return false;
        }
        AquaMatchTicket aquaMatchTicket = (AquaMatchTicket) obj;
        return l.a(this.ma_par_tch, aquaMatchTicket.ma_par_tch) && l.a(this.compe_par_tition, aquaMatchTicket.compe_par_tition) && l.a(this.duel_arg, aquaMatchTicket.duel_arg) && l.a(this.bo_par_ard, aquaMatchTicket.bo_par_ard) && l.a(this.pha_par_ses, aquaMatchTicket.pha_par_ses);
    }

    public final AquaGoalBoard getBo_par_ard() {
        return this.bo_par_ard;
    }

    public final AquaCompetitionPocket getCompe_par_tition() {
        return this.compe_par_tition;
    }

    public final AquaDuelCard getDuel_arg() {
        return this.duel_arg;
    }

    public final AquaMatchCard getMa_par_tch() {
        return this.ma_par_tch;
    }

    public final AquaPhaseBoard getPha_par_ses() {
        return this.pha_par_ses;
    }

    public int hashCode() {
        AquaMatchCard aquaMatchCard = this.ma_par_tch;
        int hashCode = (aquaMatchCard == null ? 0 : aquaMatchCard.hashCode()) * 31;
        AquaCompetitionPocket aquaCompetitionPocket = this.compe_par_tition;
        int hashCode2 = (hashCode + (aquaCompetitionPocket == null ? 0 : aquaCompetitionPocket.hashCode())) * 31;
        AquaDuelCard aquaDuelCard = this.duel_arg;
        int hashCode3 = (hashCode2 + (aquaDuelCard == null ? 0 : aquaDuelCard.hashCode())) * 31;
        AquaGoalBoard aquaGoalBoard = this.bo_par_ard;
        int hashCode4 = (hashCode3 + (aquaGoalBoard == null ? 0 : aquaGoalBoard.hashCode())) * 31;
        AquaPhaseBoard aquaPhaseBoard = this.pha_par_ses;
        return hashCode4 + (aquaPhaseBoard != null ? aquaPhaseBoard.hashCode() : 0);
    }

    public String toString() {
        return "AquaMatchTicket(ma_par_tch=" + this.ma_par_tch + ", compe_par_tition=" + this.compe_par_tition + ", duel_arg=" + this.duel_arg + ", bo_par_ard=" + this.bo_par_ard + ", pha_par_ses=" + this.pha_par_ses + ")";
    }

    public AquaMatchTicket(AquaMatchCard aquaMatchCard, AquaCompetitionPocket aquaCompetitionPocket, AquaDuelCard aquaDuelCard, AquaGoalBoard aquaGoalBoard, AquaPhaseBoard aquaPhaseBoard) {
        this.ma_par_tch = aquaMatchCard;
        this.compe_par_tition = aquaCompetitionPocket;
        this.duel_arg = aquaDuelCard;
        this.bo_par_ard = aquaGoalBoard;
        this.pha_par_ses = aquaPhaseBoard;
    }

    public /* synthetic */ AquaMatchTicket(AquaMatchCard aquaMatchCard, AquaCompetitionPocket aquaCompetitionPocket, AquaDuelCard aquaDuelCard, AquaGoalBoard aquaGoalBoard, AquaPhaseBoard aquaPhaseBoard, int i, f fVar) {
        this((i & 1) != 0 ? null : aquaMatchCard, (i & 2) != 0 ? null : aquaCompetitionPocket, (i & 4) != 0 ? null : aquaDuelCard, (i & 8) != 0 ? null : aquaGoalBoard, (i & 16) != 0 ? null : aquaPhaseBoard);
    }
}
