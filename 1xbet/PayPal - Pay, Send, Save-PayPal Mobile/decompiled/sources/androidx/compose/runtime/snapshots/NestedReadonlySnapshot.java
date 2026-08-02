package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001e\u0010\u001dR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0014\u0010(\u001a\u00020\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$R\u001c\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010)8QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\"\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "notifyObjectsInitialized$runtime", "()V", "", "hasPendingChanges", "()Z", "dispose", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "recordModified$runtime", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "snapshot", "nestedDeactivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated$runtime", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/Snapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getReadOnly", "readOnly", "getRoot", "root", "Landroidx/collection/MutableScatterSet;", "getModified$runtime", "()Landroidx/collection/MutableScatterSet;", "modified", "getWriteObserver$runtime", "writeObserver"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedReadonlySnapshot extends androidx.compose.runtime.snapshots.Snapshot {
    public static final int $stable = 8;
    private final androidx.compose.runtime.snapshots.Snapshot parent;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final androidx.collection.MutableScatterSet<androidx.compose.runtime.snapshots.StateObject> getModified$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getWriteObserver$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void notifyObjectsInitialized$runtime() {
    }

    public NestedReadonlySnapshot(long j, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, androidx.compose.runtime.snapshots.Snapshot snapshot) {
        super(j, snapshotIdSet, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.readObserver = function1;
        this.parent = snapshot;
        snapshot.mo5471nestedActivated$runtime(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot(kotlin.jvm.functions.Function1 function1) {
        return takeNestedSnapshot((kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>) function1);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime, reason: merged with bridge method [inline-methods] */
    public final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getReadObserver() {
        return this.readObserver;
    }

    public final androidx.compose.runtime.snapshots.Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final androidx.compose.runtime.snapshots.Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final androidx.compose.runtime.snapshots.NestedReadonlySnapshot takeNestedSnapshot(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver) {
        java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers> map;
        androidx.compose.runtime.snapshots.NestedReadonlySnapshot nestedReadonlySnapshot = this;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList persistentList = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.getHighSpeedVideoFpsRangesFor;
        if (persistentList != null) {
            kotlin.Pair<androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers, java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers>> mergeObservers = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers(persistentList, nestedReadonlySnapshot, true, readObserver, null);
            androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers first = mergeObservers.getFirst();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver2 = first.getReadObserver();
            first.getWriteObserver();
            map = mergeObservers.getSecond();
            readObserver = readObserver2;
        } else {
            map = null;
        }
        androidx.compose.runtime.snapshots.NestedReadonlySnapshot nestedReadonlySnapshot2 = new androidx.compose.runtime.snapshots.NestedReadonlySnapshot(getSnapshotId(), getInvalid(), androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver(), false, 4, null), getParent());
        if (persistentList != null) {
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchCreatedObservers(persistentList, nestedReadonlySnapshot, nestedReadonlySnapshot2, map);
        }
        return nestedReadonlySnapshot2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        if (getDisposed()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime();
        }
        androidx.compose.runtime.snapshots.NestedReadonlySnapshot nestedReadonlySnapshot = this;
        this.parent.mo5472nestedDeactivated$runtime(nestedReadonlySnapshot);
        super.dispose();
        androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchObserverOnPreDispose(nestedReadonlySnapshot);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo5473recordModified$runtime(androidx.compose.runtime.snapshots.StateObject state) {
        androidx.compose.runtime.snapshots.SnapshotKt.Camera2StreamConfigurationMap();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo5472nestedDeactivated$runtime(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo5471nestedActivated$runtime(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }
}
