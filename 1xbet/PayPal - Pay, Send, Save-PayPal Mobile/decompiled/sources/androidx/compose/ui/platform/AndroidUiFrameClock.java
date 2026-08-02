package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidUiFrameClock implements androidx.compose.runtime.MonotonicFrameClock {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.AndroidUiDispatcher getHighSpeedVideoFpsRanges;
    private final android.view.Choreographer choreographer;

    public AndroidUiFrameClock(android.view.Choreographer choreographer, androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.getHighSpeedVideoFpsRanges = androidUiDispatcher;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final android.view.Choreographer getChoreographer() {
        return this.choreographer;
    }

    public AndroidUiFrameClock(android.view.Choreographer choreographer) {
        this(choreographer, null);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final <R> java.lang.Object withFrameNanos(final kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        final androidx.compose.ui.platform.AndroidUiDispatcher androidUiDispatcher = this.getHighSpeedVideoFpsRanges;
        if (androidUiDispatcher == null) {
            kotlin.coroutines.CoroutineContext.Element element = continuation.getGetHighSpeedVideoSizes().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
            androidUiDispatcher = element instanceof androidx.compose.ui.platform.AndroidUiDispatcher ? (androidx.compose.ui.platform.AndroidUiDispatcher) element : null;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final android.view.Choreographer.FrameCallback frameCallback = new android.view.Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                java.lang.Object m23436constructorimpl;
                kotlin.coroutines.Continuation continuation2 = cancellableContinuationImpl2;
                kotlin.jvm.functions.Function1<java.lang.Long, R> function12 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(function12.invoke(java.lang.Long.valueOf(j)));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                continuation2.resumeWith(m23436constructorimpl);
            }
        };
        if (androidUiDispatcher != null && kotlin.jvm.internal.Intrinsics.areEqual(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui(frameCallback);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
                public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
                    androidx.compose.ui.platform.AndroidUiDispatcher.this.removeFrameCallback$ui(frameCallback);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighResolutionOutputSizeshNQ4ISI(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
                public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
                    androidx.compose.ui.platform.AndroidUiFrameClock.this.getChoreographer().removeFrameCallback(frameCallback);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    getHighSpeedVideoFpsRanges(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
