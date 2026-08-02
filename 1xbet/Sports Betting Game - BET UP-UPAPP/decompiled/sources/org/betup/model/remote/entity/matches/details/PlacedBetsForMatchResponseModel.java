package org.betup.model.remote.entity.matches.details;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes2.dex */
public class PlacedBetsForMatchResponseModel {

    @SerializedName("bets")
    private List<PlacedBetInfoModel> bets;

    @SerializedName("continuationToken")
    private String continuationToken;

    public List<PlacedBetInfoModel> getBets() {
        return this.bets;
    }

    public void setBets(List<PlacedBetInfoModel> bets) {
        this.bets = bets;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }
}
