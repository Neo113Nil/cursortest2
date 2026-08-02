package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.bets.BetState;

/* loaded from: classes2.dex */
public class CompetitionBetModel implements Serializable {

    @SerializedName("bet_name")
    private String betName;

    @SerializedName("state")
    private BetState betState;

    @SerializedName("bet_type_id")
    private int betTypeId;

    @SerializedName("bets_game_type")
    private String betsGameType;

    @SerializedName("placed_coeficient")
    private float placedCoeficient;

    @SerializedName("sport_match")
    private CompetitionSportMatchModel sportMatchModel;

    public float getPlacedCoeficient() {
        return this.placedCoeficient;
    }

    public void setPlacedCoeficient(float placedCoeficient) {
        this.placedCoeficient = placedCoeficient;
    }

    public int getBetTypeId() {
        return this.betTypeId;
    }

    public void setBetTypeId(int betTypeId) {
        this.betTypeId = betTypeId;
    }

    public CompetitionSportMatchModel getSportMatchModel() {
        return this.sportMatchModel;
    }

    public void setSportMatchModel(CompetitionSportMatchModel sportMatchModel) {
        this.sportMatchModel = sportMatchModel;
    }

    public BetState getBetState() {
        return this.betState;
    }

    public void setBetState(BetState betState) {
        this.betState = betState;
    }

    public String getBetsGameType() {
        return this.betsGameType;
    }

    public void setBetsGameType(String betsGameType) {
        this.betsGameType = betsGameType;
    }

    public String getBetName() {
        return this.betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }
}
