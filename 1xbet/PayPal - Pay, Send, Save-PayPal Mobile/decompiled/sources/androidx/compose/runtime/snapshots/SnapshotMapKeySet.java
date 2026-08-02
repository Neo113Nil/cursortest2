package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "p0", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "", "getHighSpeedVideoSizes", "()Ljava/lang/Void;", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SnapshotMapKeySet<K, V> extends androidx.compose.runtime.snapshots.SnapshotMapSet<K, V, K> {
    public SnapshotMapKeySet(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        return ((java.lang.Boolean) getHighSpeedVideoSizes()).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* synthetic */ boolean addAll(java.util.Collection collection) {
        return ((java.lang.Boolean) getHighSpeedVideoFpsRanges()).booleanValue();
    }

    private static java.lang.Void getHighSpeedVideoSizes() {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    private static java.lang.Void getHighSpeedVideoFpsRanges() {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.snapshots.StateMapMutableKeysIterator<K, V> iterator() {
        return new androidx.compose.runtime.snapshots.StateMapMutableKeysIterator<>(getHighSpeedVideoFpsRangesFor(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) getHighSpeedVideoFpsRangesFor().getReadable$runtime().getMap$runtime().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object p0) {
        return getHighSpeedVideoFpsRangesFor().remove(p0) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> p0) {
        boolean z;
        java.util.Iterator<T> it = p0.iterator();
        while (true) {
            while (it.hasNext()) {
                z = getHighSpeedVideoFpsRangesFor().remove(it.next()) != null || z;
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> p0) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime;
        int modification;
        androidx.compose.runtime.snapshots.Snapshot current;
        boolean access$attemptUpdate;
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(p0);
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        boolean z = false;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.getHighSpeedVideoSizes;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = highSpeedVideoFpsRangesFor.getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime = stateMapStateRecord.getMap$runtime();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = map$runtime.builder2();
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = builder2;
            for (java.util.Map.Entry<K, V> entry : highSpeedVideoFpsRangesFor.entrySet()) {
                if (!set.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build2 = builder2.build2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build2, map$runtime)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = highSpeedVideoFpsRangesFor.getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap = highSpeedVideoFpsRangesFor;
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                access$attemptUpdate = androidx.compose.runtime.snapshots.SnapshotStateMap.access$attemptUpdate(highSpeedVideoFpsRangesFor, (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, snapshotStateMap, current), modification, build2);
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, snapshotStateMap);
        } while (!access$attemptUpdate);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object p0) {
        return getHighSpeedVideoFpsRangesFor().containsKey(p0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> p0) {
        java.util.Collection<?> collection = p0;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!getHighSpeedVideoFpsRangesFor().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }
}
