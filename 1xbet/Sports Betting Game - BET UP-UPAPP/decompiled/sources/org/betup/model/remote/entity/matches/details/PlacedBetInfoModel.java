package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.betslip.GrabbedBetModel;

/* loaded from: classes2.dex */
public class PlacedBetInfoModel {

    @SerializedName("placedBet")
    private BetsPlaceModel bet;

    @SerializedName("grabbedBet")
    private GrabbedBetModel grabbedBet;

    public BetsPlaceModel getBet() {
        return this.bet;
    }

    public void setBet(BetsPlaceModel bet) {
        this.bet = bet;
    }

    public GrabbedBetModel getGrabbedBet() {
        return this.grabbedBet;
    }

    public void setGrabbedBet(GrabbedBetModel grabbedBet) {
        this.grabbedBet = grabbedBet;
    }
}
