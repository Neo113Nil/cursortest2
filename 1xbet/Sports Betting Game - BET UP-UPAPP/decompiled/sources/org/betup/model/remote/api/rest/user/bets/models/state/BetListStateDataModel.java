package org.betup.model.remote.api.rest.user.bets.models.state;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class BetListStateDataModel {

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("final_coeficient")
    @Expose
    private Double finalCoeficient;

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("money_placed")
    @Expose
    private Double moneyPlaced;

    @SerializedName("money_returned")
    @Expose
    private Double moneyReturned;

    @SerializedName("placed_bets")
    @Expose
    private List<BetListStatePlaceBetModel> placedBets = new ArrayList();

    @SerializedName("state")
    @Expose
    private Integer state;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFinalCoeficient() {
        return this.finalCoeficient;
    }

    public void setFinalCoeficient(Double finalCoeficient) {
        this.finalCoeficient = finalCoeficient;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public List<BetListStatePlaceBetModel> getPlacedBets() {
        return this.placedBets;
    }

    public void setPlacedBets(List<BetListStatePlaceBetModel> placedBets) {
        this.placedBets = placedBets;
    }

    public Double getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public void setMoneyPlaced(Double moneyPlaced) {
        this.moneyPlaced = moneyPlaced;
    }

    public Double getMoneyReturned() {
        return this.moneyReturned;
    }

    public void setMoneyReturned(Double moneyReturned) {
        this.moneyReturned = moneyReturned;
    }
}
