package com.datadog.trace.util;

/* loaded from: classes8.dex */
public class AgentTaskScheduler implements java.util.concurrent.Executor {
    private volatile boolean Camera2StreamConfigurationMap;
    private final java.util.concurrent.DelayQueue<com.datadog.trace.util.AgentTaskScheduler.PeriodicTask<?>> getHighSpeedVideoFpsRanges = new java.util.concurrent.DelayQueue<>();
    private final com.datadog.trace.util.AgentThreadFactory.AgentThread getHighSpeedVideoSizes;
    private volatile java.lang.Thread getOutputFormats;
    private static final com.datadog.trace.logger.Logger getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.util.AgentTaskScheduler.class);
    public static final com.datadog.trace.util.AgentTaskScheduler INSTANCE = new com.datadog.trace.util.AgentTaskScheduler(com.datadog.trace.util.AgentThreadFactory.AgentThread.TASK_SCHEDULER);
    private static final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger();

    public interface Target<T> {
        T get();
    }

    public interface Task<T> {
        void run(T t);
    }

    public static void initialize() {
    }

    public static final class RunnableTask implements com.datadog.trace.util.AgentTaskScheduler.Task<java.lang.Runnable> {
        public static final com.datadog.trace.util.AgentTaskScheduler.RunnableTask INSTANCE = new com.datadog.trace.util.AgentTaskScheduler.RunnableTask();

        @Override // com.datadog.trace.util.AgentTaskScheduler.Task
        public final void run(java.lang.Runnable runnable) {
            runnable.run();
        }
    }

    public static class Scheduled<T> implements com.datadog.trace.util.AgentTaskScheduler.Target<T> {
        private volatile T getHighSpeedVideoFpsRanges;

        private Scheduled(T t) {
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // com.datadog.trace.util.AgentTaskScheduler.Target
        public T get() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public void cancel() {
            this.getHighSpeedVideoFpsRanges = null;
        }

        /* synthetic */ Scheduled(java.lang.Object obj, byte b) {
            this(obj);
        }
    }

    static final class WeakTarget<T> extends java.lang.ref.WeakReference<T> implements com.datadog.trace.util.AgentTaskScheduler.Target<T> {
        private WeakTarget(T t) {
            super(t);
        }

        /* synthetic */ WeakTarget(java.lang.Object obj, byte b) {
            this(obj);
        }
    }

    public AgentTaskScheduler(com.datadog.trace.util.AgentThreadFactory.AgentThread agentThread) {
        this.getHighSpeedVideoSizes = agentThread;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        schedule(com.datadog.trace.util.AgentTaskScheduler.RunnableTask.INSTANCE, runnable, 0L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public <T> com.datadog.trace.util.AgentTaskScheduler.Scheduled<T> schedule(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, T t, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.datadog.trace.util.AgentTaskScheduler.Scheduled<T> scheduled = new com.datadog.trace.util.AgentTaskScheduler.Scheduled<>(t, (byte) 0);
        getHighSpeedVideoSizes(task, scheduled, j, 0L, timeUnit);
        return scheduled;
    }

    public com.datadog.trace.util.AgentTaskScheduler.Scheduled<java.lang.Runnable> schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(com.datadog.trace.util.AgentTaskScheduler.RunnableTask.INSTANCE, runnable, j, timeUnit);
    }

    public <T> com.datadog.trace.util.AgentTaskScheduler.Scheduled<T> scheduleWithJitter(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, T t, long j, java.util.concurrent.TimeUnit timeUnit) {
        return schedule(task, t, timeUnit.toMillis(j) + java.lang.Math.min((long) ((java.lang.Math.log(java.util.concurrent.ThreadLocalRandom.current().nextDouble()) * 1000.0d) / java.lang.Math.log(0.75d)), 10000L), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public com.datadog.trace.util.AgentTaskScheduler.Scheduled<java.lang.Runnable> scheduleWithJitter(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return scheduleWithJitter(com.datadog.trace.util.AgentTaskScheduler.RunnableTask.INSTANCE, runnable, j, timeUnit);
    }

    public <T> com.datadog.trace.util.AgentTaskScheduler.Scheduled<T> scheduleAtFixedRate(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, T t, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        com.datadog.trace.util.AgentTaskScheduler.Scheduled<T> scheduled = new com.datadog.trace.util.AgentTaskScheduler.Scheduled<>(t, (byte) 0);
        getHighSpeedVideoSizes(task, scheduled, j, j2, timeUnit);
        return scheduled;
    }

    public com.datadog.trace.util.AgentTaskScheduler.Scheduled<java.lang.Runnable> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return scheduleAtFixedRate(com.datadog.trace.util.AgentTaskScheduler.RunnableTask.INSTANCE, runnable, j, j2, timeUnit);
    }

    public <T> void weakScheduleAtFixedRate(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, T t, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        getHighSpeedVideoSizes(task, new com.datadog.trace.util.AgentTaskScheduler.WeakTarget(t, (byte) 0), j, j2, timeUnit);
    }

    public void weakScheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        weakScheduleAtFixedRate(com.datadog.trace.util.AgentTaskScheduler.RunnableTask.INSTANCE, runnable, j, j2, timeUnit);
    }

    private <T> void getHighSpeedVideoSizes(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, com.datadog.trace.util.AgentTaskScheduler.Target<T> target, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        if (target.get() != null) {
            if (!this.Camera2StreamConfigurationMap && this.getOutputFormats == null) {
                synchronized (this.getHighSpeedVideoFpsRanges) {
                    if (!this.Camera2StreamConfigurationMap && this.getOutputFormats == null) {
                        try {
                            this.getHighSpeedVideoFpsRanges.poll(1L, java.util.concurrent.TimeUnit.NANOSECONDS);
                        } catch (java.lang.InterruptedException unused) {
                        }
                        try {
                            this.getOutputFormats = com.datadog.trace.util.AgentThreadFactory.newAgentThread(this.getHighSpeedVideoSizes, new com.datadog.trace.util.AgentTaskScheduler.Worker(this, (byte) 0));
                            java.lang.Runtime.getRuntime().addShutdownHook(new com.datadog.trace.util.AgentTaskScheduler.ShutdownHook());
                            this.getOutputFormats.start();
                        } catch (java.lang.IllegalStateException unused2) {
                            this.Camera2StreamConfigurationMap = true;
                        }
                    }
                }
            }
            if (!this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.offer((java.util.concurrent.DelayQueue<com.datadog.trace.util.AgentTaskScheduler.PeriodicTask<?>>) new com.datadog.trace.util.AgentTaskScheduler.PeriodicTask<>(task, target, j, j2, timeUnit));
            } else {
                getHighResolutionOutputSizeshNQ4ISI.debug("Agent task scheduler is shutdown. Will not run {}", getHighResolutionOutputSizeshNQ4ISI(task, target));
            }
        }
    }

    public boolean isShutdown() {
        return this.Camera2StreamConfigurationMap;
    }

    public void shutdown(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.Camera2StreamConfigurationMap = true;
        java.lang.Thread thread = this.getOutputFormats;
        if (thread != null) {
            thread.interrupt();
            if (j > 0) {
                try {
                    thread.join(timeUnit.toMillis(j));
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, com.datadog.trace.util.AgentTaskScheduler.Target<T> target) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("periodic task ");
        sb.append(task.getClass().getSimpleName());
        sb.append(" with target ");
        sb.append(target.get());
        return sb.toString();
    }

    final class ShutdownHook extends java.lang.Thread {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ShutdownHook() {
            super(r0, r1.toString());
            java.lang.ThreadGroup threadGroup = com.datadog.trace.util.AgentThreadFactory.AGENT_THREAD_GROUP;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoSizes.threadName);
            sb.append("-shutdown-hook");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            com.datadog.trace.util.AgentTaskScheduler.this.shutdown(5L, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    final class Worker implements java.lang.Runnable {
        private Worker() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Object th;
            com.datadog.trace.util.AgentTaskScheduler.PeriodicTask periodicTask;
            while (!com.datadog.trace.util.AgentTaskScheduler.this.Camera2StreamConfigurationMap) {
                try {
                    periodicTask = (com.datadog.trace.util.AgentTaskScheduler.PeriodicTask) com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoFpsRanges.take();
                    try {
                        java.lang.Object obj = periodicTask.getHighSpeedVideoFpsRangesFor.get();
                        if (obj != null) {
                            periodicTask.getHighSpeedVideoSizes.run(obj);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (periodicTask != null) {
                            try {
                                com.datadog.trace.util.AgentTaskScheduler.getHighResolutionOutputSizeshNQ4ISI.debug("Uncaught exception from {}", periodicTask, th);
                            } catch (java.lang.Throwable th3) {
                                if (periodicTask != null && periodicTask.getHighResolutionOutputSizeshNQ4ISI()) {
                                    com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoFpsRanges.offer((java.util.concurrent.DelayQueue) periodicTask);
                                }
                                throw th3;
                            }
                        }
                        if (periodicTask != null && periodicTask.getHighResolutionOutputSizeshNQ4ISI()) {
                            com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoFpsRanges.offer((java.util.concurrent.DelayQueue) periodicTask);
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    periodicTask = null;
                }
                if (periodicTask != null && periodicTask.getHighResolutionOutputSizeshNQ4ISI()) {
                    com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoFpsRanges.offer((java.util.concurrent.DelayQueue) periodicTask);
                }
            }
            com.datadog.trace.util.AgentTaskScheduler.this.getHighSpeedVideoFpsRanges.clear();
            com.datadog.trace.util.AgentTaskScheduler.this.getOutputFormats = null;
        }

        /* synthetic */ Worker(com.datadog.trace.util.AgentTaskScheduler agentTaskScheduler, byte b) {
            this();
        }
    }

    static final class PeriodicTask<T> implements java.util.concurrent.Delayed {
        private final int Camera2StreamConfigurationMap = com.datadog.trace.util.AgentTaskScheduler.getHighSpeedVideoFpsRangesFor.getAndIncrement();
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private long getHighSpeedVideoFpsRanges;
        final com.datadog.trace.util.AgentTaskScheduler.Target<T> getHighSpeedVideoFpsRangesFor;
        final com.datadog.trace.util.AgentTaskScheduler.Task<T> getHighSpeedVideoSizes;

        public PeriodicTask(com.datadog.trace.util.AgentTaskScheduler.Task<T> task, com.datadog.trace.util.AgentTaskScheduler.Target<T> target, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            this.getHighSpeedVideoSizes = task;
            this.getHighSpeedVideoFpsRangesFor = target;
            this.getHighResolutionOutputSizeshNQ4ISI = timeUnit.toNanos(j2);
            this.getHighSpeedVideoFpsRanges = java.lang.System.nanoTime() + timeUnit.toNanos(j);
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighResolutionOutputSizeshNQ4ISI <= 0 || this.getHighSpeedVideoFpsRangesFor.get() == null) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges += this.getHighResolutionOutputSizeshNQ4ISI;
            return true;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
            return timeUnit.convert(this.getHighSpeedVideoFpsRanges - java.lang.System.nanoTime(), java.util.concurrent.TimeUnit.NANOSECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public int compareTo(java.util.concurrent.Delayed delayed) {
            long delay;
            if (this == delayed) {
                return 0;
            }
            if (delayed instanceof com.datadog.trace.util.AgentTaskScheduler.PeriodicTask) {
                com.datadog.trace.util.AgentTaskScheduler.PeriodicTask periodicTask = (com.datadog.trace.util.AgentTaskScheduler.PeriodicTask) delayed;
                delay = this.getHighSpeedVideoFpsRanges - periodicTask.getHighSpeedVideoFpsRanges;
                if (delay == 0) {
                    delay = this.Camera2StreamConfigurationMap - periodicTask.Camera2StreamConfigurationMap;
                }
            } else {
                delay = getDelay(java.util.concurrent.TimeUnit.NANOSECONDS) - delayed.getDelay(java.util.concurrent.TimeUnit.NANOSECONDS);
            }
            if (delay < 0) {
                return -1;
            }
            return delay > 0 ? 1 : 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return compareTo((java.util.concurrent.Delayed) obj) == 0;
            } catch (java.lang.ClassCastException unused) {
                return false;
            }
        }

        public final java.lang.String toString() {
            return com.datadog.trace.util.AgentTaskScheduler.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
