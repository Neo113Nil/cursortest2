package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\n\u001a\u00028\u0002\"\u0004\b\u0002\u0010\u00062\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/paging/AccessorStateHolder;", "", "Key", "Value", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Landroidx/paging/AccessorState;", "p0", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/paging/internal/SynchronizedLock;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/paging/internal/SynchronizedLock;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/LoadStates;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/paging/AccessorState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AccessorStateHolder<Key, Value> {
    private final androidx.paging.internal.SynchronizedLock getHighResolutionOutputSizeshNQ4ISI = new androidx.paging.internal.SynchronizedLock();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.LoadStates> getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(androidx.paging.LoadStates.INSTANCE.getIDLE());

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.paging.AccessorState<Key, Value> getHighSpeedVideoSizes = new androidx.paging.AccessorState<>();

    public final <R> R Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super androidx.paging.AccessorState<Key, Value>, ? extends R> p0) {
        R invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            invoke = p0.invoke(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRanges.setValue(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap());
        }
        return invoke;
    }
}
