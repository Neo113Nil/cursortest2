package androidx.compose.runtime.snapshots;

/* compiled from: Snapshot.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0002\b\u0013J4\u0010\u0014\u001a\u00020\u00012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016J\u001e\u0010\u0019\u001a\u00020\u000e2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalSnapshot extends androidx.compose.runtime.snapshots.MutableSnapshot {
    public static final int $stable = 0;

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot(final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver) {
        androidx.compose.runtime.snapshots.Snapshot takeNewSnapshot;
        takeNewSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot(new kotlin.jvm.functions.Function1<androidx.compose.runtime.snapshots.SnapshotIdSet, androidx.compose.runtime.snapshots.ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.snapshots.ReadonlySnapshot invoke(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
                int i;
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    i = androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId;
                    androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId = i + 1;
                }
                return new androidx.compose.runtime.snapshots.ReadonlySnapshot(i, snapshotIdSet, readObserver);
            }
        });
        return takeNewSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public androidx.compose.runtime.snapshots.MutableSnapshot takeNestedMutableSnapshot(final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver, final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver) {
        androidx.compose.runtime.snapshots.Snapshot takeNewSnapshot;
        takeNewSnapshot = androidx.compose.runtime.snapshots.SnapshotKt.takeNewSnapshot(new kotlin.jvm.functions.Function1<androidx.compose.runtime.snapshots.SnapshotIdSet, androidx.compose.runtime.snapshots.MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.snapshots.MutableSnapshot invoke(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
                int i;
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    i = androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId;
                    androidx.compose.runtime.snapshots.SnapshotKt.nextSnapshotId = i + 1;
                }
                return new androidx.compose.runtime.snapshots.MutableSnapshot(i, snapshotIdSet, readObserver, writeObserver);
            }
        });
        return (androidx.compose.runtime.snapshots.MutableSnapshot) takeNewSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public java.lang.Void mo1731nestedDeactivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public java.lang.Void mo1730nestedActivated$runtime_release(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GlobalSnapshot(int i, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
        super(i, snapshotIdSet, null, r2);
        final java.util.List list;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            list = androidx.compose.runtime.snapshots.SnapshotKt.globalWriteObservers;
            function1 = (kotlin.jvm.functions.Function1) kotlin.collections.CollectionsKt.singleOrNull(list);
            function1 = function1 == null ? new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                    invoke2(obj);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Object obj) {
                    java.util.List<kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>> list2 = list;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list2.get(i2).invoke(obj);
                    }
                }
            } : function1;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
