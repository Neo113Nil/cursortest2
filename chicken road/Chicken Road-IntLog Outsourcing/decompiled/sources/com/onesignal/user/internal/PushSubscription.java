package com.onesignal.user.internal;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.modeling.Model;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.subscriptions.IPushSubscription;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.PushSubscriptionState;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public class PushSubscription extends Subscription implements IPushSubscription {
    private final EventProducer<IPushSubscriptionObserver> changeHandlersNotifier;
    private PushSubscriptionState savedState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSubscription(SubscriptionModel model) {
        super(model);
        i.e(model, "model");
        this.changeHandlersNotifier = new EventProducer<>();
        this.savedState = fetchState();
    }

    private final PushSubscriptionState fetchState() {
        return new PushSubscriptionState(getId(), getToken(), getOptedIn());
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void addObserver(IPushSubscriptionObserver observer) {
        i.e(observer, "observer");
        this.changeHandlersNotifier.subscribe(observer);
    }

    public final EventProducer<IPushSubscriptionObserver> getChangeHandlersNotifier() {
        return this.changeHandlersNotifier;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public boolean getOptedIn() {
        return getModel().getOptedIn() && getModel().getStatus() != SubscriptionStatus.NO_PERMISSION;
    }

    public final PushSubscriptionState getSavedState() {
        return this.savedState;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public String getToken() {
        return getModel().getAddress();
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void optIn() {
        Model.setBooleanProperty$default(getModel(), "optedIn", true, null, true, 4, null);
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void optOut() {
        getModel().setOptedIn(false);
    }

    public final PushSubscriptionState refreshState() {
        PushSubscriptionState fetchState = fetchState();
        this.savedState = fetchState;
        return fetchState;
    }

    @Override // com.onesignal.user.subscriptions.IPushSubscription
    public void removeObserver(IPushSubscriptionObserver observer) {
        i.e(observer, "observer");
        this.changeHandlersNotifier.unsubscribe(observer);
    }
}
