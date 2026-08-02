package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002/.B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\tR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u000e\u001a\u0006*\u00020'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\"\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010\u001d\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010-"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PriorityPrefetchScheduler;", "Landroid/view/View$OnAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "run", "()V", "", "getHighSpeedVideoFpsRanges", "()Z", "", "frameTimeNanos", "doFrame", "(J)V", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "prefetchRequest", "scheduleLowPriorityPrefetch", "(Landroidx/compose/foundation/lazy/layout/PrefetchRequest;)V", "scheduleHighPriorityPrefetch", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "getHighSpeedVideoSizesFor", "Landroid/view/View;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/PriorityQueue;", "Landroidx/compose/foundation/lazy/layout/PriorityTask;", "Camera2StreamConfigurationMap", "Ljava/util/PriorityQueue;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Z", "Landroid/view/Choreographer;", "Landroid/view/Choreographer;", "Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "getOutputFormats", "Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "getInputSizeshNQ4ISI", "J", "Companion", "PrefetchRequestScopeImpl"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPrefetchScheduler implements androidx.compose.foundation.lazy.layout.PrefetchScheduler, androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {
    private static long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final android.view.View getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion INSTANCE = new androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion(null);
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.PriorityQueue<androidx.compose.foundation.lazy.layout.PriorityTask> getHighResolutionOutputSizeshNQ4ISI = new java.util.PriorityQueue<>(11, new java.util.Comparator() { // from class: androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            int highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.getHighSpeedVideoFpsRanges((androidx.compose.foundation.lazy.layout.PriorityTask) obj, (androidx.compose.foundation.lazy.layout.PriorityTask) obj2);
            return highSpeedVideoFpsRanges;
        }
    });

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.view.Choreographer getHighSpeedVideoFpsRanges = android.view.Choreographer.getInstance();

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.PrefetchRequestScopeImpl Camera2StreamConfigurationMap = new androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.PrefetchRequestScopeImpl();

    public AndroidPrefetchScheduler(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor = view;
        androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion companion = INSTANCE;
        androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.Companion.getHighSpeedVideoFpsRanges(view);
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRanges(androidx.compose.foundation.lazy.layout.PriorityTask priorityTask, androidx.compose.foundation.lazy.layout.PriorityTask priorityTask2) {
        return kotlin.jvm.internal.Intrinsics.compare(priorityTask2.getPriority(), priorityTask.getPriority());
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() || !this.getHighSpeedVideoSizes || !this.getInputSizeshNQ4ISI || this.getHighSpeedVideoFpsRangesFor.getWindowVisibility() != 0) {
            this.getHighSpeedVideoSizes = false;
            return;
        }
        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(this.getHighSpeedVideoFpsRangesFor.getDrawingTime());
        this.Camera2StreamConfigurationMap.setFrameIdle(java.lang.System.nanoTime() > (getHighResolutionOutputSizeshNQ4ISI * 2) + nanos);
        this.Camera2StreamConfigurationMap.setNextFrameTimeNs(java.lang.Math.max(this.getHighSpeedVideoSizesFor, nanos) + getHighResolutionOutputSizeshNQ4ISI);
        boolean z = false;
        while (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && !z) {
            if (!this.Camera2StreamConfigurationMap.getIsFrameIdle()) {
                z = getHighSpeedVideoFpsRanges();
            } else {
                android.os.Trace.beginSection("compose:lazy:prefetch:idle_frame");
                try {
                    z = getHighSpeedVideoFpsRanges();
                } finally {
                    android.os.Trace.endSection();
                }
            }
        }
        if (z) {
            this.getHighSpeedVideoFpsRanges.postFrameCallback(this);
        } else {
            this.getHighSpeedVideoSizes = false;
        }
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", 0L);
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        long availableTimeNanos = this.Camera2StreamConfigurationMap.availableTimeNanos();
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", availableTimeNanos);
        boolean z = true;
        if (availableTimeNanos > 0) {
            androidx.compose.foundation.lazy.layout.PriorityTask peek = this.getHighResolutionOutputSizeshNQ4ISI.peek();
            kotlin.jvm.internal.Intrinsics.checkNotNull(peek);
            if (!peek.getRequest().execute(this.Camera2StreamConfigurationMap)) {
                this.getHighResolutionOutputSizeshNQ4ISI.poll();
                z = false;
            }
            this.Camera2StreamConfigurationMap.setFrameIdle(false);
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long frameTimeNanos) {
        if (this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizesFor = frameTimeNanos;
            this.getHighSpeedVideoFpsRangesFor.post(this);
        }
    }

    private final void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        this.getHighSpeedVideoFpsRangesFor.post(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public final void scheduleLowPriorityPrefetch(androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.compose.foundation.lazy.layout.PriorityTask(androidx.compose.foundation.lazy.layout.PriorityTask.INSTANCE.getLow(), prefetchRequest));
        getHighSpeedVideoSizes();
    }

    @Override // androidx.compose.foundation.lazy.layout.PriorityPrefetchScheduler
    public final void scheduleHighPriorityPrefetch(androidx.compose.foundation.lazy.layout.PrefetchRequest prefetchRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(new androidx.compose.foundation.lazy.layout.PriorityTask(androidx.compose.foundation.lazy.layout.PriorityTask.INSTANCE.getHigh(), prefetchRequest));
        getHighSpeedVideoSizes();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View v) {
        this.getInputSizeshNQ4ISI = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View v) {
        this.getInputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRangesFor.removeCallbacks(this);
        this.getHighSpeedVideoFpsRanges.removeFrameCallback(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "<init>", "()V", "", "availableTimeNanos", "()J", "", "isFrameIdle", "Z", "()Z", "setFrameIdle", "(Z)V", "nextFrameTimeNs", "J", "getNextFrameTimeNs", "setNextFrameTimeNs", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrefetchRequestScopeImpl implements androidx.compose.foundation.lazy.layout.PrefetchRequestScope {
        public static final int $stable = 8;
        private boolean isFrameIdle;
        private long nextFrameTimeNs;

        /* renamed from: isFrameIdle, reason: from getter */
        public final boolean getIsFrameIdle() {
            return this.isFrameIdle;
        }

        public final void setFrameIdle(boolean z) {
            this.isFrameIdle = z;
        }

        public final long getNextFrameTimeNs() {
            return this.nextFrameTimeNs;
        }

        public final void setNextFrameTimeNs(long j) {
            this.nextFrameTimeNs = j;
        }

        @Override // androidx.compose.foundation.lazy.layout.PrefetchRequestScope
        public final long availableTimeNanos() {
            if (this.isFrameIdle) {
                return Long.MAX_VALUE;
            }
            return java.lang.Math.max(0L, this.nextFrameTimeNs - java.lang.System.nanoTime());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0007\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$Companion;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/view/View;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r4 < 30.0f) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void getHighSpeedVideoFpsRanges(android.view.View p0) {
            float f;
            if (androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.getHighResolutionOutputSizeshNQ4ISI == 0) {
                android.view.Display display = p0.getDisplay();
                if (!p0.isInEditMode() && display != null) {
                    f = display.getRefreshRate();
                }
                f = 60.0f;
                androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler.getHighResolutionOutputSizeshNQ4ISI = (long) (1.0E9f / f);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
