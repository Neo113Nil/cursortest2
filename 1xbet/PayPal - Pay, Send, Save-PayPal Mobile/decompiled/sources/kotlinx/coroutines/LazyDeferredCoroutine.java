package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/coroutines/LazyDeferredCoroutine;", "T", "Lkotlinx/coroutines/DeferredCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "p0", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "", "onStart", "()V", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LazyDeferredCoroutine<T> extends kotlinx.coroutines.DeferredCoroutine<T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    public LazyDeferredCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        super(coroutineContext, false);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final void onStart() {
        kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }
}
