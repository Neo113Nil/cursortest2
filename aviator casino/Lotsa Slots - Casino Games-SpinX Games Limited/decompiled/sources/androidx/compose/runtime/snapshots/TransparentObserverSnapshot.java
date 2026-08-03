package androidx.compose.runtime.snapshots;

/* compiled from: Snapshot.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0001\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\bH\u0016J\u0015\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0001H\u0010¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020/2\u0006\u00100\u001a\u00020\u0001H\u0010¢\u0006\u0002\b3J\r\u00104\u001a\u00020\u0006H\u0010¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001cH\u0010¢\u0006\u0002\b8J\u001e\u00109\u001a\u00020\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00158P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\"\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$¨\u0006:"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "specifiedReadObserver", "Lkotlin/Function1;", "", "", "mergeParentObservers", "", "ownsPreviousSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;ZZ)V", "currentSnapshot", "getCurrentSnapshot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "value", "", "id", "getId", "()I", "setId$runtime_release", "(I)V", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Landroidx/compose/runtime/collection/IdentityArraySet;", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "getModified$runtime_release", "()Landroidx/compose/runtime/collection/IdentityArraySet;", "setModified", "(Landroidx/compose/runtime/collection/IdentityArraySet;)V", "readObserver", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "()Z", "root", "getRoot", "writeObserver", "getWriteObserver$runtime_release", "dispose", "hasPendingChanges", "nestedActivated", "", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends androidx.compose.runtime.snapshots.Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final androidx.compose.runtime.snapshots.Snapshot previousSnapshot;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver;
    private final androidx.compose.runtime.snapshots.Snapshot root;
    private final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver;

    public TransparentObserverSnapshot(androidx.compose.runtime.snapshots.Snapshot snapshot, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, boolean z, boolean z2) {
        super(0, androidx.compose.runtime.snapshots.SnapshotIdSet.INSTANCE.getEMPTY(), null);
        java.util.concurrent.atomic.AtomicReference atomicReference;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver$runtime_release;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> mergedReadObserver;
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z;
        this.ownsPreviousSnapshot = z2;
        if (snapshot == null || (readObserver$runtime_release = snapshot.getReadObserver$runtime_release()) == null) {
            atomicReference = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot;
            readObserver$runtime_release = ((androidx.compose.runtime.snapshots.GlobalSnapshot) atomicReference.get()).getReadObserver$runtime_release();
        }
        mergedReadObserver = androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver(function1, readObserver$runtime_release, z);
        this.readObserver = mergedReadObserver;
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getReadObserver$runtime_release() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public androidx.compose.runtime.snapshots.Snapshot getRoot() {
        return this.root;
    }

    private final androidx.compose.runtime.snapshots.Snapshot getCurrentSnapshot() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        androidx.compose.runtime.snapshots.Snapshot snapshot = this.previousSnapshot;
        if (snapshot != null) {
            return snapshot;
        }
        atomicReference = androidx.compose.runtime.snapshots.SnapshotKt.currentGlobalSnapshot;
        return (androidx.compose.runtime.snapshots.Snapshot) atomicReference.get();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        androidx.compose.runtime.snapshots.Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getInvalid$runtime_release */
    public androidx.compose.runtime.snapshots.SnapshotIdSet getInvalid() {
        return getCurrentSnapshot().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.snapshots.StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    public void setModified(androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.snapshots.StateObject> identityArraySet) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo1732recordModified$runtime_release(androidx.compose.runtime.snapshots.StateObject state) {
        getCurrentSnapshot().mo1732recordModified$runtime_release(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver) {
        androidx.compose.runtime.snapshots.Snapshot createTransparentSnapshotWithNoParentReadObserver;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> mergedReadObserver$default = androidx.compose.runtime.snapshots.SnapshotKt.mergedReadObserver$default(readObserver, getReadObserver$runtime_release(), false, 4, null);
        if (!this.mergeParentObservers) {
            createTransparentSnapshotWithNoParentReadObserver = androidx.compose.runtime.snapshots.SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), mergedReadObserver$default, true);
            return createTransparentSnapshotWithNoParentReadObserver;
        }
        return getCurrentSnapshot().takeNestedSnapshot(mergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public java.lang.Void mo1730nestedActivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public java.lang.Void mo1731nestedDeactivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }
}
