package rx.schedulers;

/* loaded from: classes18.dex */
public class TestScheduler extends rx.Scheduler {
    static long getHighSpeedVideoSizes;
    final java.util.Queue<rx.schedulers.TestScheduler.TimedAction> Camera2StreamConfigurationMap = new java.util.PriorityQueue(11, new rx.schedulers.TestScheduler.CompareActionsByTime());
    long getHighSpeedVideoFpsRanges;

    static final class TimedAction {
        final long Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Action0 getHighSpeedVideoFpsRangesFor;
        final rx.Scheduler.Worker getHighSpeedVideoSizes;

        TimedAction(rx.Scheduler.Worker worker, long j, rx.functions.Action0 action0) {
            long j2 = rx.schedulers.TestScheduler.getHighSpeedVideoSizes;
            rx.schedulers.TestScheduler.getHighSpeedVideoSizes = 1 + j2;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = action0;
            this.getHighSpeedVideoSizes = worker;
        }

        public final java.lang.String toString() {
            long j = this.Camera2StreamConfigurationMap;
            return java.lang.String.format("TimedAction(time = %d, action = %s)", java.lang.Long.valueOf(j), this.getHighSpeedVideoFpsRangesFor.toString());
        }
    }

    static final class CompareActionsByTime implements java.util.Comparator<rx.schedulers.TestScheduler.TimedAction> {
        CompareActionsByTime() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(rx.schedulers.TestScheduler.TimedAction timedAction, rx.schedulers.TestScheduler.TimedAction timedAction2) {
            rx.schedulers.TestScheduler.TimedAction timedAction3 = timedAction;
            rx.schedulers.TestScheduler.TimedAction timedAction4 = timedAction2;
            if (timedAction3.Camera2StreamConfigurationMap == timedAction4.Camera2StreamConfigurationMap) {
                if (timedAction3.getHighResolutionOutputSizeshNQ4ISI < timedAction4.getHighResolutionOutputSizeshNQ4ISI) {
                    return -1;
                }
                return timedAction3.getHighResolutionOutputSizeshNQ4ISI > timedAction4.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0;
            }
            if (timedAction3.Camera2StreamConfigurationMap < timedAction4.Camera2StreamConfigurationMap) {
                return -1;
            }
            return timedAction3.Camera2StreamConfigurationMap > timedAction4.Camera2StreamConfigurationMap ? 1 : 0;
        }
    }

    @Override // rx.Scheduler
    public long now() {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(this.getHighSpeedVideoFpsRanges);
    }

    public void advanceTimeBy(long j, java.util.concurrent.TimeUnit timeUnit) {
        advanceTimeTo(this.getHighSpeedVideoFpsRanges + timeUnit.toNanos(j), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, java.util.concurrent.TimeUnit timeUnit) {
        getHighSpeedVideoSizes(timeUnit.toNanos(j));
    }

    public void triggerActions() {
        getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
    }

    private void getHighSpeedVideoSizes(long j) {
        while (!this.Camera2StreamConfigurationMap.isEmpty()) {
            rx.schedulers.TestScheduler.TimedAction peek = this.Camera2StreamConfigurationMap.peek();
            if (peek.Camera2StreamConfigurationMap > j) {
                break;
            }
            this.getHighSpeedVideoFpsRanges = peek.Camera2StreamConfigurationMap == 0 ? this.getHighSpeedVideoFpsRanges : peek.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap.remove();
            if (!peek.getHighSpeedVideoSizes.isUnsubscribed()) {
                peek.getHighSpeedVideoFpsRangesFor.call();
            }
        }
        this.getHighSpeedVideoFpsRanges = j;
    }

    @Override // rx.Scheduler
    public rx.Scheduler.Worker createWorker() {
        return new rx.schedulers.TestScheduler.InnerTestScheduler();
    }

    final class InnerTestScheduler extends rx.Scheduler.Worker implements rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier {
        private final rx.subscriptions.BooleanSubscription getHighSpeedVideoFpsRanges = new rx.subscriptions.BooleanSubscription();

        InnerTestScheduler() {
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.getHighSpeedVideoFpsRanges.unsubscribe();
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0, long j, java.util.concurrent.TimeUnit timeUnit) {
            final rx.schedulers.TestScheduler.TimedAction timedAction = new rx.schedulers.TestScheduler.TimedAction(this, rx.schedulers.TestScheduler.this.getHighSpeedVideoFpsRanges + timeUnit.toNanos(j), action0);
            rx.schedulers.TestScheduler.this.Camera2StreamConfigurationMap.add(timedAction);
            return rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.1
                @Override // rx.functions.Action0
                public void call() {
                    rx.schedulers.TestScheduler.this.Camera2StreamConfigurationMap.remove(timedAction);
                }
            });
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedule(rx.functions.Action0 action0) {
            final rx.schedulers.TestScheduler.TimedAction timedAction = new rx.schedulers.TestScheduler.TimedAction(this, 0L, action0);
            rx.schedulers.TestScheduler.this.Camera2StreamConfigurationMap.add(timedAction);
            return rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.schedulers.TestScheduler.InnerTestScheduler.2
                @Override // rx.functions.Action0
                public void call() {
                    rx.schedulers.TestScheduler.this.Camera2StreamConfigurationMap.remove(timedAction);
                }
            });
        }

        @Override // rx.Scheduler.Worker
        public final rx.Subscription schedulePeriodically(rx.functions.Action0 action0, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            return rx.internal.schedulers.SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, this);
        }

        @Override // rx.Scheduler.Worker
        public final long now() {
            return rx.schedulers.TestScheduler.this.now();
        }

        @Override // rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier
        public final long nowNanos() {
            return rx.schedulers.TestScheduler.this.getHighSpeedVideoFpsRanges;
        }
    }
}
