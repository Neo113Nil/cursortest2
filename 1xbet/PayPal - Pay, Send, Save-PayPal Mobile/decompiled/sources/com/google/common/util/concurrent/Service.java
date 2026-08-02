package com.google.common.util.concurrent;

@com.google.errorprone.annotations.DoNotMock("Create an AbstractIdleService")
/* loaded from: classes9.dex */
public interface Service {

    public static abstract class Listener {
        public void failed(com.google.common.util.concurrent.Service.State state, java.lang.Throwable th) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(com.google.common.util.concurrent.Service.State state) {
        }

        public void terminated(com.google.common.util.concurrent.Service.State state) {
        }
    }

    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor);

    void awaitRunning();

    void awaitRunning(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException;

    java.lang.Throwable failureCause();

    boolean isRunning();

    com.google.common.util.concurrent.Service startAsync();

    com.google.common.util.concurrent.Service.State state();

    com.google.common.util.concurrent.Service stopAsync();
}
