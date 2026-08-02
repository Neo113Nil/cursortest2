package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0017J\b\u0010\u001f\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0005\u001a\u00020\u0006X\u0082\u0004R%\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcoil3/compose/internal/DeferredDispatchCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "_unconfined", "Lkotlinx/atomicfu/AtomicBoolean;", "<set-?>", "", "unconfined", "getUnconfined", "()Z", "setUnconfined", "(Z)V", "currentDispatcher", "getCurrentDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "isDispatchNeeded", "context", "Lkotlin/coroutines/CoroutineContext;", "limitedParallelism", "parallelism", "", "name", "", "dispatch", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "toString", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DeferredDispatchCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(coil3.compose.internal.DeferredDispatchCoroutineDispatcher.class, "Camera2StreamConfigurationMap");
    private volatile /* synthetic */ int Camera2StreamConfigurationMap = 1;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    public DeferredDispatchCoroutineDispatcher(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    public final void getHighSpeedVideoFpsRanges() {
        this.Camera2StreamConfigurationMap = 0;
    }

    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI() {
        return getHighResolutionOutputSizeshNQ4ISI.get(this) == 1 ? kotlinx.coroutines.Dispatchers.getUnconfined() : this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext context) {
        return getHighResolutionOutputSizeshNQ4ISI().isDispatchNeeded(context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        return getHighResolutionOutputSizeshNQ4ISI().limitedParallelism(parallelism, name2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        getHighResolutionOutputSizeshNQ4ISI().dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        getHighResolutionOutputSizeshNQ4ISI().dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighSpeedVideoFpsRangesFor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeferredDispatchCoroutineDispatcher(delegate=");
        sb.append(coroutineDispatcher);
        sb.append(")");
        return sb.toString();
    }
}
