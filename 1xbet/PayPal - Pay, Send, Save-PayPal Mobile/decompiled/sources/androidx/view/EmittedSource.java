package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014"}, d2 = {"Landroidx/lifecycle/EmittedSource;", "Lkotlinx/coroutines/DisposableHandle;", "Landroidx/lifecycle/LiveData;", "source", "Landroidx/lifecycle/MediatorLiveData;", "mediator", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/MediatorLiveData;)V", "", "disposeNow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispose", "()V", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/LiveData;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/MediatorLiveData;", "getHighSpeedVideoSizes", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmittedSource implements kotlinx.coroutines.DisposableHandle {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.MediatorLiveData<?> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.LiveData<?> getHighResolutionOutputSizeshNQ4ISI;

    public EmittedSource(androidx.view.LiveData<?> liveData, androidx.view.MediatorLiveData<?> mediatorLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediatorLiveData, "");
        this.getHighResolutionOutputSizeshNQ4ISI = liveData;
        this.getHighSpeedVideoSizes = mediatorLiveData;
    }

    public final java.lang.Object disposeNow(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.view.EmittedSource$disposeNow$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain().getImmediate()), null, null, new androidx.view.EmittedSource$dispose$1(this, null), 3, null);
    }

    public static final /* synthetic */ void access$removeSource(androidx.view.EmittedSource emittedSource) {
        if (emittedSource.Camera2StreamConfigurationMap) {
            return;
        }
        emittedSource.getHighSpeedVideoSizes.removeSource(emittedSource.getHighResolutionOutputSizeshNQ4ISI);
        emittedSource.Camera2StreamConfigurationMap = true;
    }
}
