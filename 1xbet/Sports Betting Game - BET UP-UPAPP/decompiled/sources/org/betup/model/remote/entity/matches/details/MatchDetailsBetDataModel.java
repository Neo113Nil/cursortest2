package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.bets.SubMatchModel;

/* loaded from: classes2.dex */
public class MatchDetailsBetDataModel {

    @SerializedName("bet_type_group")
    @Expose
    private MatchDetailsBetGroupModel betGroup;

    @SerializedName("bet_name")
    @Expose
    private String betName;

    @SerializedName("bet_type_id")
    @Expose
    private Integer betTypeId;

    @SerializedName("grabbed_bet_id")
    @Expose
    private Long grabbedBetId;

    @SerializedName("grabbed_coeficient")
    @Expose
    private double grabbedCoeficient;

    @SerializedName("is_available")
    @Expose
    private Boolean isAvailable;
    private SubMatchModel subMatch;

    public MatchDetailsBetGroupModel getBetGroup() {
        return this.betGroup;
    }

    public void setBetGroup(MatchDetailsBetGroupModel betGroup) {
        this.betGroup = betGroup;
    }

    public SubMatchModel getSubMatch() {
        return this.subMatch;
    }

    public void setSubMatch(SubMatchModel subMatch) {
        this.subMatch = subMatch;
    }

    public String getBetName() {
        return this.betName;
    }

    public void setBetName(String betName) {
        this.betName = betName;
    }

    public Long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(Long grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public double getGrabbedCoeficient() {
        return this.grabbedCoeficient;
    }

    public void setGrabbedCoeficient(double grabbedCoeficient) {
        this.grabbedCoeficient = grabbedCoeficient;
    }

    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Integer getBetTypeId() {
        return this.betTypeId;
    }

    public void setBetTypeId(Integer betTypeId) {
        this.betTypeId = betTypeId;
    }
}
