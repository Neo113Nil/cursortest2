package org.betup.bus;

/* loaded from: classes2.dex */
public class SubscriptionUpdatedMessage {
    private boolean isSubscriber;

    public SubscriptionUpdatedMessage(boolean isSubscriber) {
        this.isSubscriber = isSubscriber;
    }

    public boolean isSubscriber() {
        return this.isSubscriber;
    }

    public void setSubscriber(boolean subscriber) {
        this.isSubscriber = subscriber;
    }
}
