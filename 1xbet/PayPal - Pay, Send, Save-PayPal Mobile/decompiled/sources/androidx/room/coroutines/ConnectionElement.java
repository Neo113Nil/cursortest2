package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\u000f"}, d2 = {"Landroidx/room/coroutines/ConnectionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "p0", "Landroidx/room/coroutines/PooledConnectionImpl;", "p1", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;Landroidx/room/coroutines/PooledConnectionImpl;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/room/coroutines/PooledConnectionImpl;", "()Landroidx/room/coroutines/PooledConnectionImpl;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ConnectionElement implements kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext.Key<androidx.room.coroutines.ConnectionElement> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.coroutines.PooledConnectionImpl getHighSpeedVideoSizes;

    public ConnectionElement(kotlin.coroutines.CoroutineContext.Key<androidx.room.coroutines.ConnectionElement> key, androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pooledConnectionImpl, "");
        this.Camera2StreamConfigurationMap = key;
        this.getHighSpeedVideoSizes = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<androidx.room.coroutines.ConnectionElement> getKey() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
    public final androidx.room.coroutines.PooledConnectionImpl getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }
}
