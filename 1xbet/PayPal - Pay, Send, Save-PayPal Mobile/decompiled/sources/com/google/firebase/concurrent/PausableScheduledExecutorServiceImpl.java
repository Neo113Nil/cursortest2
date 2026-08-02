package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
final class PausableScheduledExecutorServiceImpl extends com.google.firebase.concurrent.DelegatingScheduledExecutorService implements com.google.firebase.concurrent.PausableScheduledExecutorService {
    private final com.google.firebase.concurrent.PausableExecutorService delegate;

    PausableScheduledExecutorServiceImpl(com.google.firebase.concurrent.PausableExecutorService pausableExecutorService, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(pausableExecutorService, scheduledExecutorService);
        this.delegate = pausableExecutorService;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.delegate.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.delegate.resume();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.delegate.isPaused();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException();
    }
}
