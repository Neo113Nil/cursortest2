package rx.subscriptions;

/* loaded from: classes18.dex */
public final class CompositeSubscription implements rx.Subscription {
    private volatile boolean getHighSpeedVideoFpsRanges;
    private java.util.Set<rx.Subscription> getHighSpeedVideoSizes;

    public CompositeSubscription() {
    }

    public CompositeSubscription(rx.Subscription... subscriptionArr) {
        this.getHighSpeedVideoSizes = new java.util.HashSet(java.util.Arrays.asList(subscriptionArr));
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void add(rx.Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.getHighSpeedVideoFpsRanges) {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoSizes == null) {
                        this.getHighSpeedVideoSizes = new java.util.HashSet(4);
                    }
                    this.getHighSpeedVideoSizes.add(subscription);
                    return;
                }
            }
        }
        subscription.unsubscribe();
    }

    public final void addAll(rx.Subscription... subscriptionArr) {
        int i = 0;
        if (!this.getHighSpeedVideoFpsRanges) {
            synchronized (this) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoSizes == null) {
                        this.getHighSpeedVideoSizes = new java.util.HashSet(subscriptionArr.length);
                    }
                    int length = subscriptionArr.length;
                    while (i < length) {
                        rx.Subscription subscription = subscriptionArr[i];
                        if (!subscription.isUnsubscribed()) {
                            this.getHighSpeedVideoSizes.add(subscription);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i < length2) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    public final void remove(rx.Subscription subscription) {
        java.util.Set<rx.Subscription> set;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges || (set = this.getHighSpeedVideoSizes) == null) {
                return;
            }
            boolean remove = set.remove(subscription);
            if (remove) {
                subscription.unsubscribe();
            }
        }
    }

    public final void clear() {
        java.util.Set<rx.Subscription> set;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges || (set = this.getHighSpeedVideoSizes) == null) {
                return;
            }
            this.getHighSpeedVideoSizes = null;
            getHighResolutionOutputSizeshNQ4ISI(set);
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            java.util.Set<rx.Subscription> set = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = null;
            getHighResolutionOutputSizeshNQ4ISI(set);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.Collection<rx.Subscription> collection) {
        if (collection == null) {
            return;
        }
        java.util.Iterator<rx.Subscription> it = collection.iterator();
        java.util.ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().unsubscribe();
            } catch (java.lang.Throwable th) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(th);
            }
        }
        rx.exceptions.Exceptions.throwIfAny(arrayList);
    }

    public final boolean hasSubscriptions() {
        java.util.Set<rx.Subscription> set;
        boolean z = false;
        if (this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        synchronized (this) {
            if (!this.getHighSpeedVideoFpsRanges && (set = this.getHighSpeedVideoSizes) != null) {
                if (!set.isEmpty()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
