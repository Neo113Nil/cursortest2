package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/paging/SuspendingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)V", "create", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "()Landroidx/paging/PagingSource;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SuspendingPagingSourceFactory<Key, Value> implements kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<androidx.paging.PagingSource<Key, Value>> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPagingSourceFactory(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function0<? extends androidx.paging.PagingSource<Key, Value>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = coroutineDispatcher;
        this.Camera2StreamConfigurationMap = function0;
    }

    public final java.lang.Object create(kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizes, new androidx.paging.SuspendingPagingSourceFactory$create$2(this, null), continuation);
    }

    @Override // kotlin.jvm.functions.Function0
    public final androidx.paging.PagingSource<Key, Value> invoke() {
        return this.Camera2StreamConfigurationMap.invoke();
    }
}
