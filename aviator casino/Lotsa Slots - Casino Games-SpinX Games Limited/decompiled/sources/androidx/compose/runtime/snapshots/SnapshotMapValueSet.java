package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateMap.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0096\u0002J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0015\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "(Ljava/lang/Object;)Ljava/lang/Void;", "addAll", "elements", "", "contains", "", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnapshotMapValueSet<K, V> extends androidx.compose.runtime.snapshots.SnapshotMapSet<K, V, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return ((java.lang.Boolean) add((androidx.compose.runtime.snapshots.SnapshotMapValueSet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(java.util.Collection collection) {
        return ((java.lang.Boolean) addAll(collection)).booleanValue();
    }

    public SnapshotMapValueSet(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Void add(V element) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Void addAll(java.util.Collection<? extends V> elements) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public androidx.compose.runtime.snapshots.StateMapMutableValuesIterator<K, V> iterator() {
        return new androidx.compose.runtime.snapshots.StateMapMutableValuesIterator<>(getMap(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object element) {
        return getMap().removeValue$runtime_release(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(elements);
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> map = getMap();
        boolean z2 = false;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = map.getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = map$runtime_release.builder2();
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = builder2;
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry<K, V> next = it.next();
                if (set.contains(next.getValue())) {
                    builder.remove(next.getKey());
                    z2 = true;
                }
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build2 = builder2.build2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build2, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = map.getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(build2);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, map);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(elements);
        androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> map = getMap();
        boolean z2 = false;
        do {
            obj = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
            synchronized (obj) {
                androidx.compose.runtime.snapshots.StateRecord firstStateRecord = map.getFirstStateRecord();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.current((androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(map$runtime_release);
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = map$runtime_release.builder2();
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder = builder2;
            java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry<K, V> next = it.next();
                if (!set.contains(next.getValue())) {
                    builder.remove(next.getKey());
                    z2 = true;
                }
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build2 = builder2.build2();
            if (kotlin.jvm.internal.Intrinsics.areEqual(build2, map$runtime_release)) {
                break;
            }
            androidx.compose.runtime.snapshots.StateRecord firstStateRecord2 = map.getFirstStateRecord();
            kotlin.jvm.internal.Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer();
            synchronized (androidx.compose.runtime.snapshots.SnapshotKt.getLock()) {
                current = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.getCurrent();
                androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord) androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(stateMapStateRecord2, map, current);
                obj2 = androidx.compose.runtime.snapshots.SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(build2);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(current, map);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object element) {
        return getMap().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.util.Collection<? extends java.lang.Object> collection = elements;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }
}
