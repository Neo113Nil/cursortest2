package kotlinx.coroutines.android;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\r\"\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroid/os/Handler;", "", "name", "Lkotlinx/coroutines/android/HandlerDispatcher;", "from", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;", "Landroid/os/Looper;", "", "async", "asHandler", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandlerDispatcherKt {
    public static final kotlinx.coroutines.android.HandlerDispatcher Main;
    private static volatile android.view.Choreographer choreographer;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
    }

    public static /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher from$default(android.os.Handler handler, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler handler, java.lang.String str) {
        return new kotlinx.coroutines.android.HandlerContext(handler, str);
    }

    public static final android.os.Handler asHandler(android.os.Looper looper, boolean z) {
        if (!z) {
            return new android.os.Handler(looper);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            return (android.os.Handler) invoke;
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Object m23436constructorimpl;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new kotlinx.coroutines.android.HandlerContext(asHandler(android.os.Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        Main = (kotlinx.coroutines.android.HandlerDispatcher) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public static final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return getHighSpeedVideoFpsRangesFor(continuation);
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        access$postFrameCallback(choreographer2, cancellableContinuationImpl);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            access$updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
        } else {
            kotlinx.coroutines.Dispatchers.getMain().dispatch(cancellableContinuationImpl2.getContext(), new java.lang.Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    kotlinx.coroutines.android.HandlerDispatcherKt.access$updateChoreographerAndPostFrameCallback(cancellableContinuationImpl2);
                }
            });
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ void access$postFrameCallback(android.view.Choreographer choreographer2, kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        choreographer2.postFrameCallback(new kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0(cancellableContinuation));
    }

    public static final /* synthetic */ void access$updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = android.view.Choreographer.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0(cancellableContinuation));
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler handler) {
        return from$default(handler, null, 1, null);
    }
}
