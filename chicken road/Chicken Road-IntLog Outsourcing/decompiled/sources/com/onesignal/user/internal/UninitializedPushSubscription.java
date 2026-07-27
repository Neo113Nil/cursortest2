package com.onesignal.user.internal;

import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class UninitializedPushSubscription extends PushSubscription {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SubscriptionModel createFakePushSub() {
            SubscriptionModel subscriptionModel = new SubscriptionModel();
            subscriptionModel.setId("");
            subscriptionModel.setType(SubscriptionType.PUSH);
            subscriptionModel.setOptedIn(false);
            subscriptionModel.setAddress("");
            return subscriptionModel;
        }

        private Companion() {
        }
    }

    public UninitializedPushSubscription() {
        super(Companion.createFakePushSub());
    }
}
