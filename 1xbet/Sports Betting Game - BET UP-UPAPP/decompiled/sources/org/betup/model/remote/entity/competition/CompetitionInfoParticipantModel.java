package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.CompetitionState;

/* loaded from: classes2.dex */
public class CompetitionInfoParticipantModel implements Serializable {

    @SerializedName("id")
    private int competitionId;

    @SerializedName("date")
    private String date;

    @SerializedName("enter_fee")
    private int enterFee;

    @SerializedName("players")
    private int playersAmount;

    @SerializedName("slots")
    private int slots;

    @SerializedName("state")
    private CompetitionState state;

    public int getPlayersAmount() {
        return this.playersAmount;
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    public int getCompetitionId() {
        return this.competitionId;
    }

    public void setCompetitionId(int competitionId) {
        this.competitionId = competitionId;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CompetitionState getState() {
        return this.state;
    }

    public void setState(CompetitionState state) {
        this.state = state;
    }

    public int getSlots() {
        return this.slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public int getEnterFee() {
        return this.enterFee;
    }

    public void setEnterFee(int enterFee) {
        this.enterFee = enterFee;
    }
}
