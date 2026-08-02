package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDelay<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public OperatorDelay(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.Camera2StreamConfigurationMap.createWorker();
        subscriber.add(createWorker);
        return new rx.internal.operators.OperatorDelay.AnonymousClass1(subscriber, createWorker, subscriber);
    }

    /* renamed from: rx.internal.operators.OperatorDelay$1, reason: invalid class name */
    class AnonymousClass1 extends rx.Subscriber<T> {
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ rx.Subscriber getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ rx.Scheduler.Worker getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(rx.Subscriber subscriber, rx.Scheduler.Worker worker, rx.Subscriber subscriber2) {
            super(subscriber);
            this.getHighSpeedVideoSizes = worker;
            this.getHighSpeedVideoFpsRangesFor = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.getHighSpeedVideoSizes.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorDelay.1.1
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI = true;
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.onCompleted();
                }
            }, rx.internal.operators.OperatorDelay.this.getHighSpeedVideoSizes, rx.internal.operators.OperatorDelay.this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // rx.Observer
        public void onError(final java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorDelay.1.2
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI = true;
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.onError(th);
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighSpeedVideoSizes.unsubscribe();
                }
            });
        }

        @Override // rx.Observer
        public void onNext(final T t) {
            this.getHighSpeedVideoSizes.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorDelay.1.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // rx.functions.Action0
                public void call() {
                    if (rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI) {
                        return;
                    }
                    rx.internal.operators.OperatorDelay.AnonymousClass1.this.getHighSpeedVideoFpsRangesFor.onNext(t);
                }
            }, rx.internal.operators.OperatorDelay.this.getHighSpeedVideoSizes, rx.internal.operators.OperatorDelay.this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
