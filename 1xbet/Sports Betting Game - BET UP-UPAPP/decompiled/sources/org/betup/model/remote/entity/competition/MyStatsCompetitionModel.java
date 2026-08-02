package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.CompetitionState;

/* loaded from: classes2.dex */
public class MyStatsCompetitionModel implements Serializable {

    @SerializedName("date")
    private String date;

    @SerializedName("enter_fee")
    private int entryFee;

    @SerializedName("id")
    private int id;

    @SerializedName("players")
    private int playersAmount;

    @SerializedName("state")
    private CompetitionState state;

    public int getPlayersAmount() {
        return this.playersAmount;
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEntryFee() {
        return this.entryFee;
    }

    public void setEntryFee(int entryFee) {
        this.entryFee = entryFee;
    }
}
