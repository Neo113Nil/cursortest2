package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class ChallengePaginableResponseModel {

    @SerializedName("challenges")
    private List<ChallengeDataModel> challenges;

    @SerializedName("continuationToken")
    private String continuationToken;

    public List<ChallengeDataModel> getChallenges() {
        return this.challenges;
    }

    public void setChallenges(List<ChallengeDataModel> challenges) {
        this.challenges = challenges;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }
}
