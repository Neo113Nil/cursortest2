package com.onesignal.user.internal;

import com.onesignal.common.PIIHasher;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.subscriptions.IEmailSubscription;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class EmailSubscription extends Subscription implements IEmailSubscription {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSubscription(SubscriptionModel model) {
        super(model);
        i.e(model, "model");
    }

    @Override // com.onesignal.user.subscriptions.IEmailSubscription
    public String getEmail() {
        String address = getModel().getAddress();
        return PIIHasher.INSTANCE.isHashed(address) ? "" : address;
    }
}
