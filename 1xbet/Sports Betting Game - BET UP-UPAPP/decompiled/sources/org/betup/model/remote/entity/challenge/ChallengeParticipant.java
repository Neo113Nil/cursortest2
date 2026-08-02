package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import io.sentry.SentryBaseEvent;
import java.util.List;
import org.betup.model.remote.api.rest.user.bets.models.BetsPlaceModel;
import org.betup.model.remote.entity.user.details.UserDetailsDataModel;

/* loaded from: classes2.dex */
public class ChallengeParticipant {

    @SerializedName("bets")
    private List<BetsPlaceModel> bets;

    @SerializedName("final_coefficient")
    private float finalCoefficient;

    @SerializedName("is_creator")
    private boolean isCreator;

    @SerializedName("money_returned")
    private long moneyReturned;

    @SerializedName("state")
    private ChallengeUserState state;

    @SerializedName(SentryBaseEvent.JsonKeys.USER)
    private UserDetailsDataModel user;

    public UserDetailsDataModel getUser() {
        return this.user;
    }

    public void setUser(UserDetailsDataModel user) {
        this.user = user;
    }

    public boolean isCreator() {
        return this.isCreator;
    }

    public void setCreator(boolean creator) {
        this.isCreator = creator;
    }

    public ChallengeUserState getState() {
        return this.state;
    }

    public void setState(ChallengeUserState state) {
        this.state = state;
    }

    public long getMoneyReturned() {
        return this.moneyReturned;
    }

    public void setMoneyReturned(long moneyReturned) {
        this.moneyReturned = moneyReturned;
    }

    public float getFinalCoefficient() {
        return this.finalCoefficient;
    }

    public void setFinalCoefficient(float finalCoefficient) {
        this.finalCoefficient = finalCoefficient;
    }

    public List<BetsPlaceModel> getBets() {
        return this.bets;
    }

    public void setBets(List<BetsPlaceModel> bets) {
        this.bets = bets;
    }
}
