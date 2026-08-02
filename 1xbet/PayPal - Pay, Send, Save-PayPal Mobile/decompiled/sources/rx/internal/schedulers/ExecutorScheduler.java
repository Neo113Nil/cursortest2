package rx.internal.schedulers;

/* loaded from: classes18.dex */
public final class ExecutorScheduler extends rx.Scheduler {
    final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

    public ExecutorScheduler(java.util.concurrent.Executor executor) {
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
    }

    @Override // rx.Scheduler
    public final rx.Scheduler.Worker createWorker() {
        return new rx.internal.schedulers.ExecutorScheduler.ExecutorSchedulerWorker(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    static final class ExecutorSchedulerWorker extends rx.Scheduler.Worker implements java.lang.Runnable {
        final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.ConcurrentLinkedQueue<rx.internal.schedulers.ScheduledAction> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentLinkedQueue<>();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        final rx.subscriptions.CompositeSubscription Camera2StreamConfigurationMap = new rx.subscriptions.CompositeSubscription();
        final java.util.concurrent.ScheduledExecutorService getHighSpeedVideoFpsRanges = rx.internal.schedulers.GenericScheduledExecutorService.getInstance();

        public ExecutorSchedulerWorker(java.util.concurrent.Executor executor) {
            this.getHighSpeedVideoFpsRangesFor = executor;
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0) {
            if (isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            rx.internal.schedulers.ScheduledAction scheduledAction = new rx.internal.schedulers.ScheduledAction(rx.plugins.RxJavaHooks.onScheduledAction(action0), this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap.add(scheduledAction);
            this.getHighResolutionOutputSizeshNQ4ISI.offer(scheduledAction);
            if (this.getHighSpeedVideoSizes.getAndIncrement() != 0) {
                return scheduledAction;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.execute(this);
                return scheduledAction;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                this.Camera2StreamConfigurationMap.remove(scheduledAction);
                this.getHighSpeedVideoSizes.decrementAndGet();
                rx.plugins.RxJavaHooks.onError(e);
                throw e;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.Camera2StreamConfigurationMap.isUnsubscribed()) {
                rx.internal.schedulers.ScheduledAction poll = this.getHighResolutionOutputSizeshNQ4ISI.poll();
                if (poll == null) {
                    return;
                }
                if (!poll.isUnsubscribed()) {
                    if (!this.Camera2StreamConfigurationMap.isUnsubscribed()) {
                        poll.run();
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI.clear();
                        return;
                    }
                }
                if (this.getHighSpeedVideoSizes.decrementAndGet() == 0) {
                    return;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(action0);
            }
            if (isUnsubscribed()) {
                return rx.subscriptions.Subscriptions.unsubscribed();
            }
            final rx.functions.Action0 onScheduledAction = rx.plugins.RxJavaHooks.onScheduledAction(action0);
            rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription = new rx.subscriptions.MultipleAssignmentSubscription();
            final rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription2 = new rx.subscriptions.MultipleAssignmentSubscription();
            multipleAssignmentSubscription2.set(multipleAssignmentSubscription);
            this.Camera2StreamConfigurationMap.add(multipleAssignmentSubscription2);
            final rx.Subscription create = rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.schedulers.ExecutorScheduler.ExecutorSchedulerWorker.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.internal.schedulers.ExecutorScheduler.ExecutorSchedulerWorker.this.Camera2StreamConfigurationMap.remove(multipleAssignmentSubscription2);
                }
            });
            rx.internal.schedulers.ScheduledAction scheduledAction = new rx.internal.schedulers.ScheduledAction(new rx.functions.Action0() { // from class: rx.internal.schedulers.ExecutorScheduler.ExecutorSchedulerWorker.2
                @Override // rx.functions.Action0
                public void call() {
                    if (multipleAssignmentSubscription2.isUnsubscribed()) {
                        return;
                    }
                    rx.Subscription schedule = rx.internal.schedulers.ExecutorScheduler.ExecutorSchedulerWorker.this.schedule(onScheduledAction);
                    multipleAssignmentSubscription2.set(schedule);
                    if (schedule.getClass() == rx.internal.schedulers.ScheduledAction.class) {
                        ((rx.internal.schedulers.ScheduledAction) schedule).add(create);
                    }
                }
            });
            multipleAssignmentSubscription.set(scheduledAction);
            try {
                scheduledAction.add(this.getHighSpeedVideoFpsRanges.schedule(scheduledAction, j, timeUnit));
                return create;
            } catch (java.util.concurrent.RejectedExecutionException e) {
                rx.plugins.RxJavaHooks.onError(e);
                throw e;
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.Camera2StreamConfigurationMap.isUnsubscribed();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.Camera2StreamConfigurationMap.unsubscribe();
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
        }
    }
}
