package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "<init>", "()V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "resume", "finish", "drainQueue", "", "canRun", "()Z", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "runnable", "dispatchAndEnqueue", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Runnable;)V", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Ljava/util/Queue;", "Ljava/util/Queue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DispatchQueue {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges = true;
    private final java.util.Queue<java.lang.Runnable> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque();

    public final void pause() {
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final void resume() {
        if (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.getHighSpeedVideoFpsRanges = false;
            drainQueue();
        }
    }

    public final void finish() {
        this.getHighSpeedVideoSizes = true;
        drainQueue();
    }

    public final void drainQueue() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            while (!this.getHighSpeedVideoFpsRangesFor.isEmpty() && canRun()) {
                java.lang.Runnable poll = this.getHighSpeedVideoFpsRangesFor.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    public final boolean canRun() {
        return this.getHighSpeedVideoSizes || !this.getHighSpeedVideoFpsRanges;
    }

    public final void dispatchAndEnqueue(kotlin.coroutines.CoroutineContext context, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        kotlinx.coroutines.MainCoroutineDispatcher immediate = kotlinx.coroutines.Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || canRun()) {
            immediate.dispatch(context, new java.lang.Runnable() { // from class: androidx.lifecycle.DispatchQueue$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.view.DispatchQueue.this.getHighSpeedVideoFpsRangesFor(runnable);
                }
            });
        } else {
            getHighSpeedVideoFpsRangesFor(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(java.lang.Runnable p0) {
        if (!this.getHighSpeedVideoFpsRangesFor.offer(p0)) {
            throw new java.lang.IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }
}
