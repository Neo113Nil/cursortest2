package rx.internal.util;

/* loaded from: classes18.dex */
public final class SubscriptionList implements rx.Subscription {
    private java.util.List<rx.Subscription> Camera2StreamConfigurationMap;
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;

    public SubscriptionList() {
    }

    public SubscriptionList(rx.Subscription... subscriptionArr) {
        this.Camera2StreamConfigurationMap = new java.util.LinkedList(java.util.Arrays.asList(subscriptionArr));
    }

    public SubscriptionList(rx.Subscription subscription) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.Camera2StreamConfigurationMap = linkedList;
        linkedList.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void add(rx.Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            synchronized (this) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    java.util.List list = this.Camera2StreamConfigurationMap;
                    if (list == null) {
                        list = new java.util.LinkedList();
                        this.Camera2StreamConfigurationMap = list;
                    }
                    list.add(subscription);
                    return;
                }
            }
        }
        subscription.unsubscribe();
    }

    public final void remove(rx.Subscription subscription) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        synchronized (this) {
            java.util.List<rx.Subscription> list = this.Camera2StreamConfigurationMap;
            if (this.getHighResolutionOutputSizeshNQ4ISI || list == null) {
                return;
            }
            boolean remove = list.remove(subscription);
            if (remove) {
                subscription.unsubscribe();
            }
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            java.util.List<rx.Subscription> list = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            getHighSpeedVideoFpsRanges(list);
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.util.Collection<rx.Subscription> collection) {
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

    public final void clear() {
        java.util.List<rx.Subscription> list;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        synchronized (this) {
            list = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
        }
        getHighSpeedVideoFpsRanges(list);
    }

    public final boolean hasSubscriptions() {
        java.util.List<rx.Subscription> list;
        boolean z = false;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return false;
        }
        synchronized (this) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI && (list = this.Camera2StreamConfigurationMap) != null) {
                if (!list.isEmpty()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
