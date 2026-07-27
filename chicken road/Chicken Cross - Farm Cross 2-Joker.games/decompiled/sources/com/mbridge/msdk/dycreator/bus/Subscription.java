package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes6.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f9225a;
    final SubscriberMethod b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f9225a = obj;
        this.b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f9225a == subscription.f9225a && this.b.equals(subscription.b);
    }

    public int hashCode() {
        return this.f9225a.hashCode() + this.b.d.hashCode();
    }
}
