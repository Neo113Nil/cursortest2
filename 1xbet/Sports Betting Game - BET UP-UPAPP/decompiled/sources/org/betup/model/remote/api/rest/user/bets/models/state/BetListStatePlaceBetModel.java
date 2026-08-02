package org.betup.model.remote.api.rest.user.bets.models.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BetListStatePlaceBetModel {

    @SerializedName("bet_name")
    @Expose
    private String betName;

    @SerializedName("placed_coeficient")
    @Expose
    private Double placedCoeficient;

    @SerializedName("state")
    @Expose
    private Integer state;

    public String getBetName() {
        return this.betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }

    public Double getPlacedCoeficient() {
        return this.placedCoeficient;
    }

    public void setPlacedCoeficient(Double placedCoeficient) {
        this.placedCoeficient = placedCoeficient;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
