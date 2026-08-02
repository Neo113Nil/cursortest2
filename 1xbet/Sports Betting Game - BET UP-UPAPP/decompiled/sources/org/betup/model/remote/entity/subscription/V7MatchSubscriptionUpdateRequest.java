package org.betup.model.remote.entity.subscription;

import com.android.billingclient.api.BillingClient;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class V7MatchSubscriptionUpdateRequest {

    @SerializedName(BillingClient.FeatureType.SUBSCRIPTIONS)
    private List<SubscriptionUpdate> subscriptions;

    public V7MatchSubscriptionUpdateRequest() {
    }

    public V7MatchSubscriptionUpdateRequest(List<SubscriptionUpdate> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<SubscriptionUpdate> getSubscriptions() {
        return this.subscriptions;
    }

    public void setSubscriptions(List<SubscriptionUpdate> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public static class SubscriptionUpdate implements Serializable {

        @SerializedName("action")
        private int action;

        @SerializedName("event")
        private String event;

        public SubscriptionUpdate() {
        }

        public SubscriptionUpdate(String event, int action) {
            this.event = event;
            this.action = action;
        }

        public String getEvent() {
            return this.event;
        }

        public void setEvent(String event) {
            this.event = event;
        }

        public int getAction() {
            return this.action;
        }

        public void setAction(int action) {
            this.action = action;
        }
    }
}
