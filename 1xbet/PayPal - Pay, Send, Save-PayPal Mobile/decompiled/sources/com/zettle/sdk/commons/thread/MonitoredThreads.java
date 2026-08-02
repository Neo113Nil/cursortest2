package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/commons/thread/MonitoredThreads;", "", "Ljava/lang/Thread$UncaughtExceptionHandler;", "handler", "", "addExceptionHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "", "name", "Lkotlin/Function1;", "Landroid/os/Looper;", "looperReadyCallback", "Landroid/os/HandlerThread;", "handlerThread", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroid/os/HandlerThread;", "", "isDaemon", "Lkotlin/Function0;", "block", "Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Thread;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface MonitoredThreads {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.commons.thread.MonitoredThreads.Companion INSTANCE = com.zettle.sdk.commons.thread.MonitoredThreads.Companion.getHighSpeedVideoSizes;

    void addExceptionHandler(java.lang.Thread.UncaughtExceptionHandler handler);

    android.os.HandlerThread handlerThread(java.lang.String name2, kotlin.jvm.functions.Function1<? super android.os.Looper, kotlin.Unit> looperReadyCallback);

    java.lang.Thread thread(java.lang.String name2, boolean isDaemon, kotlin.jvm.functions.Function0<kotlin.Unit> block);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.os.HandlerThread handlerThread$default(com.zettle.sdk.commons.thread.MonitoredThreads monitoredThreads, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlerThread");
            }
            if ((i & 2) != 0) {
                function1 = new kotlin.jvm.functions.Function1<android.os.Looper, kotlin.Unit>() { // from class: com.zettle.sdk.commons.thread.MonitoredThreads$handlerThread$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(android.os.Looper looper) {
                        getHighSpeedVideoSizes(looper);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(android.os.Looper looper) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
                    }
                };
            }
            return monitoredThreads.handlerThread(str, function1);
        }

        public static /* synthetic */ java.lang.Thread thread$default(com.zettle.sdk.commons.thread.MonitoredThreads monitoredThreads, java.lang.String str, boolean z, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: thread");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return monitoredThreads.thread(str, z, function0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0001J'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\fH\u0096\u0001J)\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0096\u0001¨\u0006\u0014"}, d2 = {"Lcom/zettle/sdk/commons/thread/MonitoredThreads$Companion;", "Lcom/zettle/sdk/commons/thread/MonitoredThreads;", "()V", "addExceptionHandler", "", "handler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "handlerThread", "Landroid/os/HandlerThread;", "name", "", "looperReadyCallback", "Lkotlin/Function1;", "Landroid/os/Looper;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "Ljava/lang/Thread;", "isDaemon", "", "block", "Lkotlin/Function0;", "core_publicRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements com.zettle.sdk.commons.thread.MonitoredThreads {
        static final /* synthetic */ com.zettle.sdk.commons.thread.MonitoredThreads.Companion getHighSpeedVideoSizes = new com.zettle.sdk.commons.thread.MonitoredThreads.Companion();
        private final /* synthetic */ com.zettle.sdk.commons.thread.MonitoredThreadsImpl getHighSpeedVideoFpsRanges;

        private Companion() {
            com.zettle.sdk.commons.thread.ChainedUncaughtExceptionHandler chainedUncaughtExceptionHandler;
            chainedUncaughtExceptionHandler = com.zettle.sdk.commons.thread.MonitoredThreadsKt.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = new com.zettle.sdk.commons.thread.MonitoredThreadsImpl(chainedUncaughtExceptionHandler);
        }

        @Override // com.zettle.sdk.commons.thread.MonitoredThreads
        public final java.lang.Thread thread(java.lang.String name2, boolean isDaemon, kotlin.jvm.functions.Function0<kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return this.getHighSpeedVideoFpsRanges.thread(name2, isDaemon, block);
        }

        @Override // com.zettle.sdk.commons.thread.MonitoredThreads
        public final android.os.HandlerThread handlerThread(java.lang.String name2, kotlin.jvm.functions.Function1<? super android.os.Looper, kotlin.Unit> looperReadyCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looperReadyCallback, "");
            return this.getHighSpeedVideoFpsRanges.handlerThread(name2, looperReadyCallback);
        }

        @Override // com.zettle.sdk.commons.thread.MonitoredThreads
        public final void addExceptionHandler(java.lang.Thread.UncaughtExceptionHandler handler) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            this.getHighSpeedVideoFpsRanges.addExceptionHandler(handler);
        }
    }
}
