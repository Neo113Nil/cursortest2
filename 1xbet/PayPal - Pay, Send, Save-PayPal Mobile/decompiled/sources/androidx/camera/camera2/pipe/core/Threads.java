package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b)\u0010#R\u001a\u0010\f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b*\u0010&R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010-R\u0011\u0010\u000f\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b2\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/core/Threads;", "", "Lkotlinx/coroutines/CoroutineScope;", "cameraPipeScope", "cameraPipeDispatchScope", "Ljava/util/concurrent/Executor;", "blockingExecutor", "Lkotlinx/coroutines/CoroutineDispatcher;", "blockingDispatcher", "backgroundExecutor", "backgroundDispatcher", "lightweightExecutor", "lightweightDispatcher", "Lkotlin/Function0;", "Landroid/os/Handler;", "camera2Handler", "camera2Executor", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Ljava/util/concurrent/Executor;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "T", "", "timeoutMs", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "runBlockingChecked", "(JLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "runBlockingCheckedOrNull", "Lkotlinx/coroutines/CoroutineScope;", "getCameraPipeScope", "()Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "getBlockingExecutor", "()Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getBlockingDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getBackgroundExecutor", "getBackgroundDispatcher", "getLightweightExecutor", "getLightweightDispatcher", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getCamera2Handler", "()Landroid/os/Handler;", "getCamera2Executor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Threads {
    private final kotlinx.coroutines.CoroutineDispatcher backgroundDispatcher;
    private final java.util.concurrent.Executor backgroundExecutor;
    private final kotlinx.coroutines.CoroutineDispatcher blockingDispatcher;
    private final java.util.concurrent.Executor blockingExecutor;
    private final kotlinx.coroutines.CoroutineScope cameraPipeScope;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final kotlin.Lazy<java.util.concurrent.Executor> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy<android.os.Handler> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineDispatcher lightweightDispatcher;
    private final java.util.concurrent.Executor lightweightExecutor;

    public Threads(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineScope coroutineScope2, java.util.concurrent.Executor executor, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.util.concurrent.Executor executor2, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2, java.util.concurrent.Executor executor3, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher3, final kotlin.jvm.functions.Function0<? extends android.os.Handler> function0, final kotlin.jvm.functions.Function0<? extends java.util.concurrent.Executor> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.cameraPipeScope = coroutineScope;
        this.Camera2StreamConfigurationMap = coroutineScope2;
        this.blockingExecutor = executor;
        this.blockingDispatcher = coroutineDispatcher;
        this.backgroundExecutor = executor2;
        this.backgroundDispatcher = coroutineDispatcher2;
        this.lightweightExecutor = executor3;
        this.lightweightDispatcher = coroutineDispatcher3;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.pipe.core.Threads.$r8$lambda$TFK4hE4yNW5J9VReSnUURt1j2uc(kotlin.jvm.functions.Function0.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.pipe.core.Threads.m886$r8$lambda$z326WYWokXVYn48jwdvxyCWiTE(kotlin.jvm.functions.Function0.this);
            }
        });
    }

    public final kotlinx.coroutines.CoroutineScope getCameraPipeScope() {
        return this.cameraPipeScope;
    }

    public final java.util.concurrent.Executor getBlockingExecutor() {
        return this.blockingExecutor;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getBlockingDispatcher() {
        return this.blockingDispatcher;
    }

    public final java.util.concurrent.Executor getBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getBackgroundDispatcher() {
        return this.backgroundDispatcher;
    }

    public final java.util.concurrent.Executor getLightweightExecutor() {
        return this.lightweightExecutor;
    }

    public final kotlinx.coroutines.CoroutineDispatcher getLightweightDispatcher() {
        return this.lightweightDispatcher;
    }

    public final android.os.Handler getCamera2Handler() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public final java.util.concurrent.Executor getCamera2Executor() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public final <T> T runBlockingChecked(long timeoutMs, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        return (T) kotlinx.coroutines.BuildersKt.runBlocking(this.blockingDispatcher, new androidx.camera.camera2.pipe.core.Threads$runBlockingChecked$1(this, block, timeoutMs, null));
    }

    public final <T> T runBlockingCheckedOrNull(long timeoutMs, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        try {
            return (T) kotlinx.coroutines.BuildersKt.runBlocking(this.blockingDispatcher, new androidx.camera.camera2.pipe.core.Threads$runBlockingCheckedOrNull$1(this, block, timeoutMs, null));
        } catch (java.lang.InterruptedException e) {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE();
            return null;
        }
    }

    public static /* synthetic */ android.os.Handler $r8$lambda$TFK4hE4yNW5J9VReSnUURt1j2uc(kotlin.jvm.functions.Function0 function0) {
        return (android.os.Handler) function0.invoke();
    }

    /* renamed from: $r8$lambda$z326WYWokXVYn48jwdvxyCW-iTE, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.Executor m886$r8$lambda$z326WYWokXVYn48jwdvxyCWiTE(kotlin.jvm.functions.Function0 function0) {
        return (java.util.concurrent.Executor) function0.invoke();
    }

    public static final /* synthetic */ kotlinx.coroutines.Deferred access$runAsyncSupervised(androidx.camera.camera2.pipe.core.Threads threads, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function1 function1) {
        kotlinx.coroutines.Deferred async$default;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(threads.Camera2StreamConfigurationMap, coroutineDispatcher, null, new androidx.camera.camera2.pipe.core.Threads$runAsyncSupervised$1(function1, null), 2, null);
        return async$default;
    }
}
