package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ChallengeInfoModel implements Serializable {

    @SerializedName("available_count_challenges")
    private int availableChallenges;

    @SerializedName("available_count_invites")
    private int availableInvites;

    @SerializedName("available_count_matches")
    private int availableMatches;

    @SerializedName("challenge_fee")
    private float challengeFee;

    @SerializedName("max_money_placed")
    private long maxMoneyPlaced;

    @SerializedName("min_money_placed")
    private long minMoneyPlaced;

    public float getChallengeFee() {
        return this.challengeFee;
    }

    public void setChallengeFee(float challengeFee) {
        this.challengeFee = challengeFee;
    }

    public long getMinMoneyPlaced() {
        return this.minMoneyPlaced;
    }

    public void setMinMoneyPlaced(long minMoneyPlaced) {
        this.minMoneyPlaced = minMoneyPlaced;
    }

    public int getAvailableChallenges() {
        return this.availableChallenges;
    }

    public void setAvailableChallenges(int availableChallenges) {
        this.availableChallenges = availableChallenges;
    }

    public int getAvailableMatches() {
        return this.availableMatches;
    }

    public void setAvailableMatches(int availableMatches) {
        this.availableMatches = availableMatches;
    }

    public int getAvailableInvites() {
        return this.availableInvites;
    }

    public void setAvailableInvites(int availableInvites) {
        this.availableInvites = availableInvites;
    }

    public long getMaxMoneyPlaced() {
        return this.maxMoneyPlaced;
    }

    public void setMaxMoneyPlaced(long maxMoneyPlaced) {
        this.maxMoneyPlaced = maxMoneyPlaced;
    }
}
