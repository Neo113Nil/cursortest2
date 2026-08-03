package androidx.compose.ui.platform;

/* compiled from: AndroidUiDispatcher.android.kt */
@kotlin.Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b*\u0001\n\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0017H\u0000¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "choreographer", "Landroid/view/Choreographer;", "handler", "Landroid/os/Handler;", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "getChoreographer", "()Landroid/view/Choreographer;", "dispatchCallback", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "lock", "", "scheduledFrameDispatch", "", "scheduledTrampolineDispatch", "spareToRunOnFrame", "", "Landroid/view/Choreographer$FrameCallback;", "toRunOnFrame", "toRunTrampolined", "Lkotlin/collections/ArrayDeque;", "Ljava/lang/Runnable;", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "nextTask", "performFrameDispatch", "frameTimeNanos", "", "performTrampolineDispatch", "postFrameCallback", "callback", "postFrameCallback$ui_release", "removeFrameCallback", "removeFrameCallback$ui_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    private final android.view.Choreographer choreographer;
    private final androidx.compose.ui.platform.AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final androidx.compose.runtime.MonotonicFrameClock frameClock;
    private final android.os.Handler handler;
    private final java.lang.Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private java.util.List<android.view.Choreographer.FrameCallback> spareToRunOnFrame;
    private java.util.List<android.view.Choreographer.FrameCallback> toRunOnFrame;
    private final kotlin.collections.ArrayDeque<java.lang.Runnable> toRunTrampolined;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.AndroidUiDispatcher.Companion INSTANCE = new androidx.compose.ui.platform.AndroidUiDispatcher.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlin.coroutines.CoroutineContext> Main$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.coroutines.CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // kotlin.jvm.functions.Function0
        public final kotlin.coroutines.CoroutineContext invoke() {
            boolean isMainThread;
            isMainThread = androidx.compose.ui.platform.AndroidUiDispatcher_androidKt.isMainThread();
            androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher = new androidx.compose.ui.platform.AndroidUiDispatcher(isMainThread ? android.view.Choreographer.getInstance() : (android.view.Choreographer) kotlinx.coroutines.BuildersKt.runBlocking(kotlinx.coroutines.Dispatchers.getMain(), new androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper()), null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });
    private static final java.lang.ThreadLocal<kotlin.coroutines.CoroutineContext> currentThread = new java.lang.ThreadLocal<kotlin.coroutines.CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public kotlin.coroutines.CoroutineContext initialValue() {
            android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null) {
                androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher = new androidx.compose.ui.platform.AndroidUiDispatcher(choreographer, androidx.core.os.HandlerCompat.createAsync(myLooper), null);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            throw new java.lang.IllegalStateException("no Looper on this thread".toString());
        }
    };

    public /* synthetic */ AndroidUiDispatcher(android.view.Choreographer choreographer, android.os.Handler handler, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    public final android.view.Choreographer getChoreographer() {
        return this.choreographer;
    }

    private AndroidUiDispatcher(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new java.lang.Object();
        this.toRunTrampolined = new kotlin.collections.ArrayDeque<>();
        this.toRunOnFrame = new java.util.ArrayList();
        this.spareToRunOnFrame = new java.util.ArrayList();
        this.dispatchCallback = new androidx.compose.ui.platform.AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new androidx.compose.ui.platform.AndroidUiFrameClock(choreographer, this);
    }

    private final java.lang.Runnable nextTask() {
        java.lang.Runnable removeFirstOrNull;
        synchronized (this.lock) {
            removeFirstOrNull = this.toRunTrampolined.removeFirstOrNull();
        }
        return removeFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            java.lang.Runnable nextTask = nextTask();
            while (nextTask != null) {
                nextTask.run();
                nextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                java.util.List<android.view.Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    public final void postFrameCallback$ui_release(android.view.Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(callback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeFrameCallback$ui_release(android.view.Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    public final androidx.compose.runtime.MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo12370dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(block);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "()V", "CurrentThread", "Lkotlin/coroutines/CoroutineContext;", "getCurrentThread", "()Lkotlin/coroutines/CoroutineContext;", "Main", "getMain", "Main$delegate", "Lkotlin/Lazy;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlin.coroutines.CoroutineContext getMain() {
            return (kotlin.coroutines.CoroutineContext) androidx.compose.ui.platform.AndroidUiDispatcher.Main$delegate.getValue();
        }

        public final kotlin.coroutines.CoroutineContext getCurrentThread() {
            boolean isMainThread;
            isMainThread = androidx.compose.ui.platform.AndroidUiDispatcher_androidKt.isMainThread();
            if (isMainThread) {
                return getMain();
            }
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) androidx.compose.ui.platform.AndroidUiDispatcher.currentThread.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new java.lang.IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }
    }
}
