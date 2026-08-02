package org.betup.model.remote.entity.competition;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import org.betup.model.remote.entity.CompetitionState;

/* loaded from: classes2.dex */
public class BaseCompetitionModel implements Serializable {

    @SerializedName(alternate = {"date"}, value = "close_time")
    private String date;

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
}
