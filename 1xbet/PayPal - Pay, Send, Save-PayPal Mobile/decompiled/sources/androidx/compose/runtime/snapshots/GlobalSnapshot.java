package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0011\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "Lkotlin/Function1;", "", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "notifyObjectsInitialized$runtime", "()V", "snapshot", "", "nestedDeactivated$runtime", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated$runtime", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobalSnapshot extends androidx.compose.runtime.snapshots.MutableSnapshot {
    public static final int $stable = 8;

    public GlobalSnapshot(long j, androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
        super(j, snapshotIdSet, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.GlobalSnapshot.getHighSpeedVideoFpsRanges(obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void notifyObjectsInitialized$runtime() {
        androidx.compose.runtime.snapshots.SnapshotKt.getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo5472nestedDeactivated$runtime(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo5471nestedActivated$runtime(androidx.compose.runtime.snapshots.Snapshot snapshot) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final androidx.compose.runtime.snapshots.Snapshot takeNestedSnapshot(final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver) {
        java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers> map;
        androidx.compose.runtime.snapshots.Snapshot highResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList persistentList = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.getHighSpeedVideoFpsRangesFor;
        if (persistentList != null) {
            kotlin.Pair<androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers, java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers>> mergeObservers = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers(persistentList, null, true, readObserver, null);
            androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers first = mergeObservers.getFirst();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver2 = first.getReadObserver();
            first.getWriteObserver();
            map = mergeObservers.getSecond();
            readObserver = readObserver2;
        } else {
            map = null;
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.snapshots.SnapshotKt.getHighResolutionOutputSizeshNQ4ISI(new kotlin.jvm.functions.Function1<androidx.compose.runtime.snapshots.SnapshotIdSet, androidx.compose.runtime.snapshots.ReadonlySnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public androidx.compose.runtime.snapshots.ReadonlySnapshot invoke(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
                long j;
                long j2;
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    j = androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats;
                    j2 = androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats;
                    androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats = j2 + 1;
                }
                return new androidx.compose.runtime.snapshots.ReadonlySnapshot(j, snapshotIdSet, readObserver);
            }
        });
        androidx.compose.runtime.snapshots.ReadonlySnapshot readonlySnapshot = (androidx.compose.runtime.snapshots.ReadonlySnapshot) highResolutionOutputSizeshNQ4ISI;
        if (persistentList != null) {
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final androidx.compose.runtime.snapshots.MutableSnapshot takeNestedMutableSnapshot(final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver) {
        final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers> map;
        androidx.compose.runtime.snapshots.Snapshot highResolutionOutputSizeshNQ4ISI;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList persistentList = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.getHighSpeedVideoFpsRangesFor;
        if (persistentList != null) {
            kotlin.Pair<androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers, java.util.Map<androidx.compose.runtime.snapshots.tooling.SnapshotObserver, androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers>> mergeObservers = androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.mergeObservers(persistentList, null, false, readObserver, writeObserver);
            androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers first = mergeObservers.getFirst();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver2 = first.getReadObserver();
            kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> writeObserver2 = first.getWriteObserver();
            map = mergeObservers.getSecond();
            readObserver = readObserver2;
            function1 = writeObserver2;
        } else {
            function1 = writeObserver;
            map = null;
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.snapshots.SnapshotKt.getHighResolutionOutputSizeshNQ4ISI(new kotlin.jvm.functions.Function1<androidx.compose.runtime.snapshots.SnapshotIdSet, androidx.compose.runtime.snapshots.MutableSnapshot>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public androidx.compose.runtime.snapshots.MutableSnapshot invoke(androidx.compose.runtime.snapshots.SnapshotIdSet snapshotIdSet) {
                long j;
                long j2;
                synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                    j = androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats;
                    j2 = androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats;
                    androidx.compose.runtime.snapshots.SnapshotKt.getInputFormats = j2 + 1;
                }
                return new androidx.compose.runtime.snapshots.MutableSnapshot(j, snapshotIdSet, readObserver, function1);
            }
        });
        androidx.compose.runtime.snapshots.MutableSnapshot mutableSnapshot = (androidx.compose.runtime.snapshots.MutableSnapshot) highResolutionOutputSizeshNQ4ISI;
        if (persistentList != null) {
            androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void dispose() {
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        java.util.List list;
        synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
            list = androidx.compose.runtime.snapshots.SnapshotKt.getOutputMinFrameDuration;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((kotlin.jvm.functions.Function1) list.get(i)).invoke(obj);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }
}
