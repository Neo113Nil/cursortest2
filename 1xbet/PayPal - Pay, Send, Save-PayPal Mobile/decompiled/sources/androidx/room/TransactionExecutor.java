package androidx.room;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "scheduleNext", "()V", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/Executor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "Camera2StreamConfigurationMap", "Ljava/lang/Runnable;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/lang/Object;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionExecutor implements java.util.concurrent.Executor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Runnable getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.ArrayDeque<java.lang.Runnable> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    public TransactionExecutor(java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
        this.Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();
        this.getHighSpeedVideoSizes = new java.lang.Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final java.lang.Runnable command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "");
        synchronized (this.getHighSpeedVideoSizes) {
            this.Camera2StreamConfigurationMap.offer(new java.lang.Runnable() { // from class: androidx.room.TransactionExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.room.TransactionExecutor.m9277$r8$lambda$FZWr2PGmP3sgXLCiriDCcePXSs(command, this);
                }
            });
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                scheduleNext();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void scheduleNext() {
        synchronized (this.getHighSpeedVideoSizes) {
            java.lang.Runnable poll = this.Camera2StreamConfigurationMap.poll();
            java.lang.Runnable runnable = poll;
            this.getHighSpeedVideoFpsRangesFor = runnable;
            if (poll != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.execute(runnable);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* renamed from: $r8$lambda$FZWr2PGmP3sgXLCiri-DCcePXSs, reason: not valid java name */
    public static /* synthetic */ void m9277$r8$lambda$FZWr2PGmP3sgXLCiriDCcePXSs(java.lang.Runnable runnable, androidx.room.TransactionExecutor transactionExecutor) {
        try {
            runnable.run();
        } finally {
            transactionExecutor.scheduleNext();
        }
    }
}
