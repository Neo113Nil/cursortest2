package com.datadog.trace.api.profiling;

/* loaded from: classes3.dex */
public interface Timer {

    /* loaded from: classes8.dex */
    public enum TimerType {
        QUEUEING
    }

    com.datadog.trace.api.profiling.Timing start(com.datadog.trace.api.profiling.Timer.TimerType timerType);

    public static final class NoOp implements com.datadog.trace.api.profiling.Timer {
        public static final com.datadog.trace.api.profiling.Timer INSTANCE = new com.datadog.trace.api.profiling.Timer.NoOp();

        @Override // com.datadog.trace.api.profiling.Timer
        public final com.datadog.trace.api.profiling.Timing start(com.datadog.trace.api.profiling.Timer.TimerType timerType) {
            return com.datadog.trace.api.profiling.Timing.NoOp.INSTANCE;
        }
    }
}
