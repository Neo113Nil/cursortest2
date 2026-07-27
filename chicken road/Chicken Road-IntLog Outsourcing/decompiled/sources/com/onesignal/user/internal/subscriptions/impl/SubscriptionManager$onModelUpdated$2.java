package com.onesignal.user.internal.subscriptions.impl;

import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.subscriptions.ISubscription;
import f4.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class SubscriptionManager$onModelUpdated$2 extends j implements InterfaceC1441l {
    final /* synthetic */ ModelChangedArgs $args;
    final /* synthetic */ ISubscription $subscription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionManager$onModelUpdated$2(ISubscription iSubscription, ModelChangedArgs modelChangedArgs) {
        super(1);
        this.$subscription = iSubscription;
        this.$args = modelChangedArgs;
    }

    @Override // t4.InterfaceC1441l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ISubscriptionChangedHandler) obj);
        return v.f5689a;
    }

    public final void invoke(ISubscriptionChangedHandler it) {
        i.e(it, "it");
        it.onSubscriptionChanged(this.$subscription, this.$args);
    }
}
