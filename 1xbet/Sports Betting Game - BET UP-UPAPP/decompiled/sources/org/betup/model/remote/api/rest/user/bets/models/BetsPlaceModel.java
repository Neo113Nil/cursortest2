package org.betup.model.remote.api.rest.user.bets.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.bets.BetGroupModel;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class BetsPlaceModel {

    @SerializedName("bet_type_group")
    private BetGroupModel betGroup;

    @SerializedName("bet_name")
    @Expose
    private String betName;

    @SerializedName("bet_type_id")
    private Integer betTypeId;

    @SerializedName("betlist")
    private BetsListModel betlist;

    @SerializedName("bets_game_type")
    @Expose
    private String betsGameType;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("placed_coeficient")
    @Expose
    private Double placedCoeficient;

    @SerializedName("set_on_live")
    @Expose
    private boolean setOnLive;

    @SerializedName("sport_match")
    @Expose
    private MatchDetailsDataModel sportMatch;

    @SerializedName("state")
    @Expose
    private BetState state;
    private boolean wasAnimated;

    public Integer getBetTypeId() {
        return this.betTypeId;
    }

    public void setBetTypeId(Integer betTypeId) {
        this.betTypeId = betTypeId;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public BetsListModel getBetlist() {
        return this.betlist;
    }

    public void setBetlist(BetsListModel betlist) {
        this.betlist = betlist;
    }

    public BetGroupModel getBetGroup() {
        return this.betGroup;
    }

    public void setBetGroup(BetGroupModel betGroup) {
        this.betGroup = betGroup;
    }

    public String getBetsGameType() {
        return this.betsGameType;
    }

    public void setBetsGameType(String betsGameType) {
        this.betsGameType = betsGameType;
    }

    public boolean isSetOnLive() {
        return this.setOnLive;
    }

    public void setSetOnLive(boolean setOnLive) {
        this.setOnLive = setOnLive;
    }

    public boolean isWasAnimated() {
        return this.wasAnimated;
    }

    public void setWasAnimated(boolean wasAnimated) {
        this.wasAnimated = wasAnimated;
    }

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

    public BetState getState() {
        return this.state;
    }

    public void setState(BetState state) {
        this.state = state;
    }

    public MatchDetailsDataModel getSportMatch() {
        return this.sportMatch;
    }

    public void setSportMatch(MatchDetailsDataModel sportMatch) {
        this.sportMatch = sportMatch;
    }
}
