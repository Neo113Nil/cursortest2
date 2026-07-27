package com.onesignal.user.internal.subscriptions.impl;

import com.onesignal.user.internal.PushSubscription;
import com.onesignal.user.subscriptions.IPushSubscriptionObserver;
import com.onesignal.user.subscriptions.ISubscription;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class SubscriptionManager$onModelUpdated$1 extends j implements InterfaceC1441l {
    final /* synthetic */ ISubscription $subscription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionManager$onModelUpdated$1(ISubscription iSubscription) {
        super(1);
        this.$subscription = iSubscription;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IPushSubscriptionObserver) obj);
        return v.f5689a;
    }

    public final void invoke(IPushSubscriptionObserver it) {
        i.e(it, "it");
        it.onPushSubscriptionChange(new PushSubscriptionChangedState(((PushSubscription) this.$subscription).getSavedState(), ((PushSubscription) this.$subscription).refreshState()));
    }
}
