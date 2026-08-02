package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements java.lang.Runnable, rx.Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    final rx.internal.util.SubscriptionList Camera2StreamConfigurationMap;
    final rx.functions.Action0 getHighSpeedVideoFpsRanges;

    public ScheduledAction(rx.functions.Action0 action0) {
        this.getHighSpeedVideoFpsRanges = action0;
        this.Camera2StreamConfigurationMap = new rx.internal.util.SubscriptionList();
    }

    public ScheduledAction(rx.functions.Action0 action0, rx.subscriptions.CompositeSubscription compositeSubscription) {
        this.getHighSpeedVideoFpsRanges = action0;
        this.Camera2StreamConfigurationMap = new rx.internal.util.SubscriptionList(new rx.internal.schedulers.ScheduledAction.Remover(this, compositeSubscription));
    }

    public ScheduledAction(rx.functions.Action0 action0, rx.internal.util.SubscriptionList subscriptionList) {
        this.getHighSpeedVideoFpsRanges = action0;
        this.Camera2StreamConfigurationMap = new rx.internal.util.SubscriptionList(new rx.internal.schedulers.ScheduledAction.Remover2(this, subscriptionList));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                lazySet(java.lang.Thread.currentThread());
                this.getHighSpeedVideoFpsRanges.call();
            } finally {
                unsubscribe();
            }
        } catch (rx.exceptions.OnErrorNotImplementedException e) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e);
            rx.plugins.RxJavaHooks.onError(illegalStateException);
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        } catch (java.lang.Throwable th) {
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
            rx.plugins.RxJavaHooks.onError(illegalStateException2);
            java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, illegalStateException2);
        }
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.Camera2StreamConfigurationMap.isUnsubscribed();
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        if (this.Camera2StreamConfigurationMap.isUnsubscribed()) {
            return;
        }
        this.Camera2StreamConfigurationMap.unsubscribe();
    }

    public final void add(rx.Subscription subscription) {
        this.Camera2StreamConfigurationMap.add(subscription);
    }

    public final void add(java.util.concurrent.Future<?> future) {
        this.Camera2StreamConfigurationMap.add(new rx.internal.schedulers.ScheduledAction.FutureCompleter(future));
    }

    public final void addParent(rx.subscriptions.CompositeSubscription compositeSubscription) {
        this.Camera2StreamConfigurationMap.add(new rx.internal.schedulers.ScheduledAction.Remover(this, compositeSubscription));
    }

    public final void addParent(rx.internal.util.SubscriptionList subscriptionList) {
        this.Camera2StreamConfigurationMap.add(new rx.internal.schedulers.ScheduledAction.Remover2(this, subscriptionList));
    }

    final class FutureCompleter implements rx.Subscription {
        private final java.util.concurrent.Future<?> getHighResolutionOutputSizeshNQ4ISI;

        FutureCompleter(java.util.concurrent.Future<?> future) {
            this.getHighResolutionOutputSizeshNQ4ISI = future;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (rx.internal.schedulers.ScheduledAction.this.get() != java.lang.Thread.currentThread()) {
                this.getHighResolutionOutputSizeshNQ4ISI.cancel(true);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.cancel(false);
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isCancelled();
        }
    }

    static final class Remover extends java.util.concurrent.atomic.AtomicBoolean implements rx.Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final rx.subscriptions.CompositeSubscription getHighSpeedVideoFpsRanges;
        final rx.internal.schedulers.ScheduledAction getHighSpeedVideoSizes;

        public Remover(rx.internal.schedulers.ScheduledAction scheduledAction, rx.subscriptions.CompositeSubscription compositeSubscription) {
            this.getHighSpeedVideoSizes = scheduledAction;
            this.getHighSpeedVideoFpsRanges = compositeSubscription;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoSizes.isUnsubscribed();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRanges.remove(this.getHighSpeedVideoSizes);
            }
        }
    }

    static final class Remover2 extends java.util.concurrent.atomic.AtomicBoolean implements rx.Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        final rx.internal.schedulers.ScheduledAction getHighResolutionOutputSizeshNQ4ISI;
        final rx.internal.util.SubscriptionList getHighSpeedVideoFpsRangesFor;

        public Remover2(rx.internal.schedulers.ScheduledAction scheduledAction, rx.internal.util.SubscriptionList subscriptionList) {
            this.getHighResolutionOutputSizeshNQ4ISI = scheduledAction;
            this.getHighSpeedVideoFpsRangesFor = subscriptionList;
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRangesFor.remove(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }
}
