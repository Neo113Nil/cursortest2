package com.helpshift.util;

/* loaded from: classes5.dex */
public abstract class ConsumeOnceListener<T> {
    private static final java.lang.String TAG = "ConsumeOnceListener";
    private final java.util.concurrent.atomic.AtomicBoolean isUpdateConsumed = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.helpshift.concurrency.HSThreadingService threadingService;

    public abstract void consume(T t);

    protected ConsumeOnceListener(com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.threadingService = hSThreadingService;
    }

    public void emit(final T t) {
        final int hashCode = hashCode();
        if (!this.isUpdateConsumed.get()) {
            this.isUpdateConsumed.set(true);
            this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.util.ConsumeOnceListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.util.ConsumeOnceListener.this.m5708lambda$emit$0$comhelpshiftutilConsumeOnceListener(hashCode, t);
                }
            });
        } else {
            com.helpshift.log.HSLogger.d(TAG, "Skipping consume of event in callback: " + hashCode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$emit$0$com-helpshift-util-ConsumeOnceListener, reason: not valid java name */
    /* synthetic */ void m5708lambda$emit$0$comhelpshiftutilConsumeOnceListener(int i, java.lang.Object obj) {
        com.helpshift.log.HSLogger.d(TAG, "Executing consume of event in callback: " + i);
        consume(obj);
    }
}
