package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.betup.model.remote.entity.matches.details.MatchDetailsBetGroupModel;

/* loaded from: classes2.dex */
public class GrabbedBetModel {

    @SerializedName("is_available")
    private boolean available;

    @SerializedName("bet_type_group")
    private MatchDetailsBetGroupModel betTypeGroup;

    @SerializedName("grabbed_bet_id")
    private long grabbedBetId;

    @SerializedName("grabbed_coeficient")
    private double grabbedCoefficient;

    @SerializedName("sport_match")
    private SubMatchModel subMatch;

    public SubMatchModel getSubMatch() {
        return this.subMatch;
    }

    public void setSubMatch(SubMatchModel subMatch) {
        this.subMatch = subMatch;
    }

    public MatchDetailsBetGroupModel getBetTypeGroup() {
        return this.betTypeGroup;
    }

    public void setBetTypeGroup(MatchDetailsBetGroupModel betTypeGroup) {
        this.betTypeGroup = betTypeGroup;
    }

    public long getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(long grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public double getGrabbedCoefficient() {
        return this.grabbedCoefficient;
    }

    public void setGrabbedCoefficient(double grabbedCoefficient) {
        this.grabbedCoefficient = grabbedCoefficient;
    }

    public boolean isAvailable() {
        MatchDetailsBetGroupModel matchDetailsBetGroupModel;
        return this.available && ((matchDetailsBetGroupModel = this.betTypeGroup) == null || matchDetailsBetGroupModel.isAvailable());
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
