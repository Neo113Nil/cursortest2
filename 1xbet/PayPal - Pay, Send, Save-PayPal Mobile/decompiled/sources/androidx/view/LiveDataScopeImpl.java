package androidx.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00018\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", "T", "Landroidx/lifecycle/LiveDataScope;", "Landroidx/lifecycle/CoroutineLiveData;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/DisposableHandle;", "emitSource", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/CoroutineLiveData;", "getTarget$lifecycle_livedata", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata", "(Landroidx/lifecycle/CoroutineLiveData;)V", "getLatestValue", "()Ljava/lang/Object;", "latestValue", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LiveDataScopeImpl<T> implements androidx.view.LiveDataScope<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;
    private androidx.view.CoroutineLiveData<T> target;

    public LiveDataScopeImpl(androidx.view.CoroutineLiveData<T> coroutineLiveData, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.target = coroutineLiveData;
        this.getHighSpeedVideoFpsRangesFor = coroutineContext.plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate());
    }

    public final androidx.view.CoroutineLiveData<T> getTarget$lifecycle_livedata() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata(androidx.view.CoroutineLiveData<T> coroutineLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineLiveData, "");
        this.target = coroutineLiveData;
    }

    @Override // androidx.view.LiveDataScope
    public final T getLatestValue() {
        return this.target.getValue();
    }

    @Override // androidx.view.LiveDataScope
    public final java.lang.Object emitSource(androidx.view.LiveData<T> liveData, kotlin.coroutines.Continuation<? super kotlinx.coroutines.DisposableHandle> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new androidx.view.LiveDataScopeImpl$emitSource$2(this, liveData, null), continuation);
    }

    @Override // androidx.view.LiveDataScope
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new androidx.view.LiveDataScopeImpl$emit$2(this, t, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
