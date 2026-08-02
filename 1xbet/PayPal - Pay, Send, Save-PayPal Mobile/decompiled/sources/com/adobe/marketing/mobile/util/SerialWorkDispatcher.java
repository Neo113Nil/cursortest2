package com.adobe.marketing.mobile.util;

import com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkProcessor;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 8*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000489:;B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010'R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001f\u00101\u001a\f00R\b\u0012\u0004\u0012\u00028\u00000\u00008CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00107"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;", "T", "", "", "name", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "workHandler", "<init>", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;)V", "", "canWork", "()Z", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$State;", "getState", "()Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$State;", "item", "offer", "(Ljava/lang/Object;)Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "resume", "Ljava/util/concurrent/ExecutorService;", "executorService", "", "setExecutorService", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/lang/Runnable;", "finalJob", "setFinalJob", "(Ljava/lang/Runnable;)V", "initialJob", "setInitialJob", "shutdown", "()V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Runnable;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getOutputFormats", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$State;", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkProcessor;", "getInputFormats", "Lkotlin/Lazy;", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future;", "getInputSizeshNQ4ISI", "Ljava/util/Queue;", "Ljava/util/Queue;", "Companion", "State", "WorkHandler", "WorkProcessor"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public class SerialWorkDispatcher<T> {
    private final java.lang.String Camera2StreamConfigurationMap;
    private java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.lang.Runnable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile java.lang.Runnable getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.util.concurrent.Future<?> getInputSizeshNQ4ISI;
    private final kotlin.Lazy getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Queue<T> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private volatile com.adobe.marketing.mobile.util.SerialWorkDispatcher.State getHighSpeedVideoSizesFor;
    private final com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<T> getOutputMinFrameDuration;
    private static final com.adobe.marketing.mobile.util.SerialWorkDispatcher.Companion Companion = new com.adobe.marketing.mobile.util.SerialWorkDispatcher.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$State;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_STARTED", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, "SHUTDOWN"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public enum State {
        NOT_STARTED,
        ACTIVE,
        PAUSED,
        SHUTDOWN
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkHandler;", "W", "", "item", "", "doWork", "(Ljava/lang/Object;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface WorkHandler<W> {
        boolean doWork(W item);
    }

    protected boolean canWork() {
        return true;
    }

    public SerialWorkDispatcher(java.lang.String str, com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkHandler<T> workHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workHandler, "");
        this.Camera2StreamConfigurationMap = str;
        this.getOutputMinFrameDuration = workHandler;
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = newSingleThreadExecutor;
        this.getOutputFormats = new java.util.concurrent.ConcurrentLinkedQueue();
        this.getInputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.adobe.marketing.mobile.util.SerialWorkDispatcher<T>.WorkProcessor>(this) { // from class: com.adobe.marketing.mobile.util.SerialWorkDispatcher$workProcessor$2
            final /* synthetic */ com.adobe.marketing.mobile.util.SerialWorkDispatcher<T> getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.adobe.marketing.mobile.util.SerialWorkDispatcher<T>.WorkProcessor invoke() {
                return this.getHighSpeedVideoSizes.new WorkProcessor();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.getHighSpeedVideoSizes = this;
            }
        });
        this.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.NOT_STARTED;
        this.getHighSpeedVideoSizes = new java.lang.Object();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void setInitialJob(java.lang.Runnable initialJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialJob, "");
        this.getHighSpeedVideoFpsRangesFor = initialJob;
    }

    public final void setFinalJob(java.lang.Runnable finalJob) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalJob, "");
        this.getHighSpeedVideoFpsRanges = finalJob;
    }

    public final boolean offer(T item) {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN) {
                return false;
            }
            this.getOutputFormats.offer(item);
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE) {
                resume();
            }
            return true;
        }
    }

    public final boolean start() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot start SerialWorkDispatcher (");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append("). Already shutdown.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.NOT_STARTED) {
                this.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE;
                java.lang.Runnable runnable = this.getHighSpeedVideoFpsRangesFor;
                if (runnable != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.submit(runnable);
                }
                resume();
                return true;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SerialWorkDispatcher-");
            sb2.append(this.Camera2StreamConfigurationMap);
            java.lang.String obj = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SerialWorkDispatcher (");
            sb3.append(this.Camera2StreamConfigurationMap);
            sb3.append(") has already started.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, obj, sb3.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean pause() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot pause SerialWorkDispatcher (");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append("). Already shutdown.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE) {
                this.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.PAUSED;
                return true;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SerialWorkDispatcher-");
            sb2.append(this.Camera2StreamConfigurationMap);
            java.lang.String obj = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SerialWorkDispatcher (");
            sb3.append(this.Camera2StreamConfigurationMap);
            sb3.append(") is not active.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, obj, sb3.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public final boolean resume() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot resume SerialWorkDispatcher (");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append("). Already shutdown.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (this.getHighSpeedVideoSizesFor != com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.NOT_STARTED) {
                this.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE;
                java.util.concurrent.Future<?> future = this.getInputSizeshNQ4ISI;
                if ((future != null && !future.isDone()) || !canWork()) {
                    return true;
                }
                this.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.submit((com.adobe.marketing.mobile.util.SerialWorkDispatcher.WorkProcessor) this.getInputFormats.getValue());
                return true;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SerialWorkDispatcher-");
            sb2.append(this.Camera2StreamConfigurationMap);
            java.lang.String obj = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("SerialWorkDispatcher (");
            sb3.append(this.Camera2StreamConfigurationMap);
            sb3.append(") has not started.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, obj, sb3.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public final void shutdown() {
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN) {
                return;
            }
            this.getHighSpeedVideoSizesFor = com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.SHUTDOWN;
            java.util.concurrent.Future<?> future = this.getInputSizeshNQ4ISI;
            if (future != null) {
                future.cancel(true);
            }
            this.getInputSizeshNQ4ISI = null;
            this.getOutputFormats.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Runnable runnable = this.getHighSpeedVideoFpsRanges;
            if (runnable != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.submit(runnable);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.shutdown();
        }
    }

    /* renamed from: getState, reason: from getter */
    public final com.adobe.marketing.mobile.util.SerialWorkDispatcher.State getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher$WorkProcessor;", "Ljava/lang/Runnable;", "<init>", "(Lcom/adobe/marketing/mobile/util/SerialWorkDispatcher;)V", "", "run", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public final class WorkProcessor implements java.lang.Runnable {
        public WorkProcessor() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            java.lang.Object access$peekWorkItem;
            while (!java.lang.Thread.interrupted() && ((com.adobe.marketing.mobile.util.SerialWorkDispatcher) com.adobe.marketing.mobile.util.SerialWorkDispatcher.this).getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE && com.adobe.marketing.mobile.util.SerialWorkDispatcher.this.canWork() && com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$hasWork(com.adobe.marketing.mobile.util.SerialWorkDispatcher.this)) {
                try {
                    access$peekWorkItem = com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$peekWorkItem(com.adobe.marketing.mobile.util.SerialWorkDispatcher.this);
                } catch (java.lang.Exception e) {
                    java.lang.Thread.currentThread().interrupt();
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$getTag(com.adobe.marketing.mobile.util.SerialWorkDispatcher.this), "Exception encountered while processing item. ".concat(java.lang.String.valueOf(e)), new java.lang.Object[0]);
                }
                if (access$peekWorkItem != null) {
                    if (!((com.adobe.marketing.mobile.util.SerialWorkDispatcher) com.adobe.marketing.mobile.util.SerialWorkDispatcher.this).getOutputMinFrameDuration.doWork(access$peekWorkItem)) {
                        z = false;
                        break;
                    }
                    com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$removeWorkItem(com.adobe.marketing.mobile.util.SerialWorkDispatcher.this);
                } else {
                    return;
                }
            }
            z = true;
            java.lang.Object obj = ((com.adobe.marketing.mobile.util.SerialWorkDispatcher) com.adobe.marketing.mobile.util.SerialWorkDispatcher.this).getHighSpeedVideoSizes;
            com.adobe.marketing.mobile.util.SerialWorkDispatcher<T> serialWorkDispatcher = com.adobe.marketing.mobile.util.SerialWorkDispatcher.this;
            synchronized (obj) {
                ((com.adobe.marketing.mobile.util.SerialWorkDispatcher) serialWorkDispatcher).getInputSizeshNQ4ISI = null;
                if (z && ((com.adobe.marketing.mobile.util.SerialWorkDispatcher) serialWorkDispatcher).getHighSpeedVideoSizesFor == com.adobe.marketing.mobile.util.SerialWorkDispatcher.State.ACTIVE && com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$hasWork(serialWorkDispatcher)) {
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, com.adobe.marketing.mobile.util.SerialWorkDispatcher.access$getTag(serialWorkDispatcher), "Auto resuming work processor.", new java.lang.Object[0]);
                    serialWorkDispatcher.resume();
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    public final void setExecutorService(java.util.concurrent.ExecutorService executorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        this.getHighResolutionOutputSizeshNQ4ISI = executorService;
    }

    public static final /* synthetic */ java.lang.String access$getTag(com.adobe.marketing.mobile.util.SerialWorkDispatcher serialWorkDispatcher) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SerialWorkDispatcher-");
        sb.append(serialWorkDispatcher.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    public static final /* synthetic */ boolean access$hasWork(com.adobe.marketing.mobile.util.SerialWorkDispatcher serialWorkDispatcher) {
        return serialWorkDispatcher.getOutputFormats.peek() != null;
    }

    public static final /* synthetic */ java.lang.Object access$peekWorkItem(com.adobe.marketing.mobile.util.SerialWorkDispatcher serialWorkDispatcher) {
        return serialWorkDispatcher.getOutputFormats.peek();
    }

    public static final /* synthetic */ java.lang.Object access$removeWorkItem(com.adobe.marketing.mobile.util.SerialWorkDispatcher serialWorkDispatcher) {
        return serialWorkDispatcher.getOutputFormats.poll();
    }
}
