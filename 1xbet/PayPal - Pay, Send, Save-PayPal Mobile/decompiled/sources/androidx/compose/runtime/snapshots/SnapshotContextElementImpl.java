package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotContextElementImpl;", "Landroidx/compose/runtime/snapshots/SnapshotContextElement;", "Lkotlinx/coroutines/ThreadContextElement;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/snapshots/Snapshot;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/snapshots/Snapshot;)V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/snapshots/Snapshot;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapshotContextElementImpl implements androidx.compose.runtime.snapshots.SnapshotContextElement, kotlinx.coroutines.ThreadContextElement<androidx.compose.runtime.snapshots.Snapshot> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.Snapshot getHighSpeedVideoSizes;

    public SnapshotContextElementImpl(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        this.getHighSpeedVideoSizes = snapshot;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return androidx.compose.runtime.snapshots.SnapshotContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return androidx.compose.runtime.snapshots.SnapshotContextElement.INSTANCE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.ThreadContextElement
    public final androidx.compose.runtime.snapshots.Snapshot updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        return this.getHighSpeedVideoSizes.unsafeEnter();
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void restoreThreadContext(kotlin.coroutines.CoroutineContext context, androidx.compose.runtime.snapshots.Snapshot oldState) {
        this.getHighSpeedVideoSizes.unsafeLeave(oldState);
    }
}
