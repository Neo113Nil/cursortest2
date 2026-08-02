package org.betup.model.remote.entity.subscription;

import com.google.gson.annotations.SerializedName;
import org.betup.model.remote.entity.matches.details.MatchDetailsDataModel;

/* loaded from: classes2.dex */
public class MatchSubscriptionModel {

    @SerializedName("match")
    private MatchDetailsDataModel match;

    @SerializedName("subscription")
    private SubscriptionModel subscription;

    public MatchDetailsDataModel getMatch() {
        return this.match;
    }

    public void setMatch(MatchDetailsDataModel match) {
        this.match = match;
    }

    public SubscriptionModel getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SubscriptionModel subscription) {
        this.subscription = subscription;
    }
}
