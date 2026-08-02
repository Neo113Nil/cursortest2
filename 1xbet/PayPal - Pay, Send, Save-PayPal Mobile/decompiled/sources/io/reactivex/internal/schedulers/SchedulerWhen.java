package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public class SchedulerWhen extends io.reactivex.Scheduler implements io.reactivex.disposables.Disposable {
    private io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
    private final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
    private final io.reactivex.processors.FlowableProcessor<io.reactivex.Flowable<io.reactivex.Completable>> getOutputFormats;
    static final io.reactivex.disposables.Disposable getHighSpeedVideoSizes = new io.reactivex.internal.schedulers.SchedulerWhen.SubscribedDisposable();
    static final io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor = io.reactivex.disposables.Disposables.disposed();

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(io.reactivex.functions.Function<io.reactivex.Flowable<io.reactivex.Flowable<io.reactivex.Completable>>, io.reactivex.Completable> function, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = scheduler;
        io.reactivex.processors.FlowableProcessor serialized = io.reactivex.processors.UnicastProcessor.create().toSerialized();
        this.getOutputFormats = serialized;
        try {
            this.Camera2StreamConfigurationMap = ((io.reactivex.Completable) function.apply(serialized)).subscribe();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.Camera2StreamConfigurationMap.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.Camera2StreamConfigurationMap.isDisposed();
    }

    @Override // io.reactivex.Scheduler
    public io.reactivex.Scheduler.Worker createWorker() {
        io.reactivex.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRanges.createWorker();
        io.reactivex.processors.FlowableProcessor<T> serialized = io.reactivex.processors.UnicastProcessor.create().toSerialized();
        io.reactivex.Flowable<io.reactivex.Completable> map = serialized.map(new io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction(createWorker));
        io.reactivex.internal.schedulers.SchedulerWhen.QueueWorker queueWorker = new io.reactivex.internal.schedulers.SchedulerWhen.QueueWorker(serialized, createWorker);
        this.getOutputFormats.onNext(map);
        return queueWorker;
    }

    static abstract class ScheduledAction extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable {
        protected abstract io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver);

        ScheduledAction() {
            super(io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoSizes);
        }

        final void getHighSpeedVideoFpsRangesFor(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor || disposable != io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoSizes) {
                return;
            }
            io.reactivex.disposables.Disposable highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(worker, completableObserver);
            if (compareAndSet(io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI)) {
                return;
            }
            highResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get().isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.disposables.Disposable disposable;
            io.reactivex.disposables.Disposable disposable2 = io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor;
            do {
                disposable = get();
                if (disposable == io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != io.reactivex.internal.schedulers.SchedulerWhen.getHighSpeedVideoSizes) {
                disposable.dispose();
            }
        }
    }

    static class ImmediateAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.lang.Runnable Camera2StreamConfigurationMap;

        ImmediateAction(java.lang.Runnable runnable) {
            this.Camera2StreamConfigurationMap = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected final io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            return worker.schedule(new io.reactivex.internal.schedulers.SchedulerWhen.OnCompletedAction(this.Camera2StreamConfigurationMap, completableObserver));
        }
    }

    static class DelayedAction extends io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction {
        private final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.Runnable getHighSpeedVideoFpsRanges;

        DelayedAction(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            this.getHighSpeedVideoFpsRanges = runnable;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction
        protected final io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI(io.reactivex.Scheduler.Worker worker, io.reactivex.CompletableObserver completableObserver) {
            return worker.schedule(new io.reactivex.internal.schedulers.SchedulerWhen.OnCompletedAction(this.getHighSpeedVideoFpsRanges, completableObserver), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    static class OnCompletedAction implements java.lang.Runnable {
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        final java.lang.Runnable getHighSpeedVideoFpsRangesFor;

        OnCompletedAction(java.lang.Runnable runnable, io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRangesFor = runnable;
            this.Camera2StreamConfigurationMap = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.getHighSpeedVideoFpsRangesFor.run();
            } finally {
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class CreateWorkerFunction implements io.reactivex.functions.Function<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction, io.reactivex.Completable> {
        final io.reactivex.Scheduler.Worker getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ io.reactivex.Completable apply(io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction) throws java.lang.Exception {
            return new io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction.WorkerCompletable(scheduledAction);
        }

        CreateWorkerFunction(io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoSizes = worker;
        }

        public final class WorkerCompletable extends io.reactivex.Completable {
            public static int Camera2StreamConfigurationMap;
            public static int getHighSpeedVideoFpsRanges;
            final io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction getHighSpeedVideoFpsRangesFor;

            WorkerCompletable(io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction scheduledAction) {
                this.getHighSpeedVideoFpsRangesFor = scheduledAction;
            }

            @Override // io.reactivex.Completable
            public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
                completableObserver.onSubscribe(this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(io.reactivex.internal.schedulers.SchedulerWhen.CreateWorkerFunction.this.getHighSpeedVideoSizes, completableObserver);
            }

            public static int Camera2StreamConfigurationMap() {
                int i = Camera2StreamConfigurationMap;
                int i2 = i % 7333486;
                Camera2StreamConfigurationMap = i + 1;
                if (i2 != 0) {
                    return getHighSpeedVideoFpsRanges;
                }
                int startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                getHighSpeedVideoFpsRanges = startElapsedRealtime;
                return startElapsedRealtime;
            }
        }
    }

    static final class QueueWorker extends io.reactivex.Scheduler.Worker {
        private final io.reactivex.Scheduler.Worker Camera2StreamConfigurationMap;
        private final io.reactivex.processors.FlowableProcessor<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction> getHighSpeedVideoFpsRangesFor;
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();

        QueueWorker(io.reactivex.processors.FlowableProcessor<io.reactivex.internal.schedulers.SchedulerWhen.ScheduledAction> flowableProcessor, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRangesFor = flowableProcessor;
            this.Camera2StreamConfigurationMap = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
                this.Camera2StreamConfigurationMap.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            io.reactivex.internal.schedulers.SchedulerWhen.DelayedAction delayedAction = new io.reactivex.internal.schedulers.SchedulerWhen.DelayedAction(runnable, j, timeUnit);
            this.getHighSpeedVideoFpsRangesFor.onNext(delayedAction);
            return delayedAction;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            io.reactivex.internal.schedulers.SchedulerWhen.ImmediateAction immediateAction = new io.reactivex.internal.schedulers.SchedulerWhen.ImmediateAction(runnable);
            this.getHighSpeedVideoFpsRangesFor.onNext(immediateAction);
            return immediateAction;
        }
    }

    static final class SubscribedDisposable implements io.reactivex.disposables.Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        SubscribedDisposable() {
        }
    }
}
