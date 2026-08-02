package rx.internal.schedulers;

/* loaded from: classes18.dex */
public class SchedulerWhen extends rx.Scheduler implements rx.Subscription {
    private final rx.Subscription Camera2StreamConfigurationMap;
    private final rx.Observer<rx.Observable<rx.Completable>> getHighSpeedVideoFpsRanges;
    private final rx.Scheduler getHighSpeedVideoSizes;
    static final rx.Subscription getHighSpeedVideoFpsRangesFor = new rx.Subscription() { // from class: rx.internal.schedulers.SchedulerWhen.3
        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return false;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
        }
    };
    static final rx.Subscription getHighResolutionOutputSizeshNQ4ISI = rx.subscriptions.Subscriptions.unsubscribed();

    public SchedulerWhen(rx.functions.Func1<rx.Observable<rx.Observable<rx.Completable>>, rx.Completable> func1, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = scheduler;
        rx.subjects.PublishSubject create = rx.subjects.PublishSubject.create();
        this.getHighSpeedVideoFpsRanges = new rx.observers.SerializedObserver(create);
        this.Camera2StreamConfigurationMap = func1.call(create.onBackpressureBuffer()).subscribe();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.Camera2StreamConfigurationMap.unsubscribe();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.Camera2StreamConfigurationMap.isUnsubscribed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rx.Scheduler
    public rx.Scheduler.Worker createWorker() {
        final rx.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        rx.internal.operators.BufferUntilSubscriber create = rx.internal.operators.BufferUntilSubscriber.create();
        final rx.observers.SerializedObserver serializedObserver = new rx.observers.SerializedObserver(create);
        java.lang.Object map = create.map(new rx.functions.Func1<rx.internal.schedulers.SchedulerWhen.ScheduledAction, rx.Completable>() { // from class: rx.internal.schedulers.SchedulerWhen.1
            @Override // rx.functions.Func1
            public /* synthetic */ rx.Completable call(rx.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction) {
                final rx.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction2 = scheduledAction;
                return rx.Completable.create(new rx.Completable.OnSubscribe() { // from class: rx.internal.schedulers.SchedulerWhen.1.1
                    @Override // rx.functions.Action1
                    public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                        rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                        completableSubscriber2.onSubscribe(scheduledAction2);
                        rx.internal.schedulers.SchedulerWhen.ScheduledAction.getHighSpeedVideoFpsRanges(scheduledAction2, createWorker, completableSubscriber2);
                    }
                });
            }
        });
        rx.Scheduler.Worker worker = new rx.Scheduler.Worker() { // from class: rx.internal.schedulers.SchedulerWhen.2
            private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();

            @Override // rx.Subscription
            public void unsubscribe() {
                if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                    createWorker.unsubscribe();
                    serializedObserver.onCompleted();
                }
            }

            @Override // rx.Subscription
            public boolean isUnsubscribed() {
                return this.getHighSpeedVideoFpsRanges.get();
            }

            @Override // rx.Scheduler.Worker
            public rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
                rx.internal.schedulers.SchedulerWhen.DelayedAction delayedAction = new rx.internal.schedulers.SchedulerWhen.DelayedAction(action0, j, timeUnit);
                serializedObserver.onNext(delayedAction);
                return delayedAction;
            }

            @Override // rx.Scheduler.Worker
            public rx.Subscription schedule(rx.functions.Action0 action0) {
                rx.internal.schedulers.SchedulerWhen.ImmediateAction immediateAction = new rx.internal.schedulers.SchedulerWhen.ImmediateAction(action0);
                serializedObserver.onNext(immediateAction);
                return immediateAction;
            }
        };
        this.getHighSpeedVideoFpsRanges.onNext(map);
        return worker;
    }

    static abstract class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<rx.Subscription> implements rx.Subscription {
        protected abstract rx.Subscription getHighResolutionOutputSizeshNQ4ISI(rx.Scheduler.Worker worker, rx.CompletableSubscriber completableSubscriber);

        public ScheduledAction() {
            super(rx.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            rx.Subscription subscription;
            rx.Subscription subscription2 = rx.internal.schedulers.SchedulerWhen.getHighResolutionOutputSizeshNQ4ISI;
            do {
                subscription = get();
                if (subscription == rx.internal.schedulers.SchedulerWhen.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
            } while (!compareAndSet(subscription, subscription2));
            if (subscription != rx.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor) {
                subscription.unsubscribe();
            }
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(rx.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction, rx.Scheduler.Worker worker, rx.CompletableSubscriber completableSubscriber) {
            rx.Subscription subscription = scheduledAction.get();
            if (subscription == rx.internal.schedulers.SchedulerWhen.getHighResolutionOutputSizeshNQ4ISI || subscription != rx.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            rx.Subscription highResolutionOutputSizeshNQ4ISI = scheduledAction.getHighResolutionOutputSizeshNQ4ISI(worker, completableSubscriber);
            if (scheduledAction.compareAndSet(rx.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI)) {
                return;
            }
            highResolutionOutputSizeshNQ4ISI.unsubscribe();
        }
    }

    static class ImmediateAction extends rx.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final rx.functions.Action0 Camera2StreamConfigurationMap;

        public ImmediateAction(rx.functions.Action0 action0) {
            this.Camera2StreamConfigurationMap = action0;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        protected final rx.Subscription getHighResolutionOutputSizeshNQ4ISI(rx.Scheduler.Worker worker, rx.CompletableSubscriber completableSubscriber) {
            return worker.schedule(new rx.internal.schedulers.SchedulerWhen.OnCompletedAction(this.Camera2StreamConfigurationMap, completableSubscriber));
        }
    }

    static class DelayedAction extends rx.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final rx.functions.Action0 getHighSpeedVideoFpsRangesFor;

        public DelayedAction(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.getHighSpeedVideoFpsRangesFor = action0;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = timeUnit;
        }

        @Override // rx.internal.schedulers.SchedulerWhen.ScheduledAction
        protected final rx.Subscription getHighResolutionOutputSizeshNQ4ISI(rx.Scheduler.Worker worker, rx.CompletableSubscriber completableSubscriber) {
            return worker.schedule(new rx.internal.schedulers.SchedulerWhen.OnCompletedAction(this.getHighSpeedVideoFpsRangesFor, completableSubscriber), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    static class OnCompletedAction implements rx.functions.Action0 {
        private rx.functions.Action0 Camera2StreamConfigurationMap;
        private rx.CompletableSubscriber getHighResolutionOutputSizeshNQ4ISI;

        public OnCompletedAction(rx.functions.Action0 action0, rx.CompletableSubscriber completableSubscriber) {
            this.Camera2StreamConfigurationMap = action0;
            this.getHighResolutionOutputSizeshNQ4ISI = completableSubscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.Camera2StreamConfigurationMap.call();
            } finally {
                this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
            }
        }
    }
}
