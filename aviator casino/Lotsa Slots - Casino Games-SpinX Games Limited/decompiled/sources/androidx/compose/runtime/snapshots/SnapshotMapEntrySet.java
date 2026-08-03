package androidx.compose.runtime.snapshots;

/* compiled from: SnapshotStateMap.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000b\u001a\u00020\t2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001d\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0012H\u0096\u0002J\u001c\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u0014\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u000f2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapEntrySet;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "add", "", "element", "addAll", "elements", "", "contains", "", "containsAll", "iterator", "", "remove", "removeAll", "retainAll", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SnapshotMapEntrySet<K, V> extends androidx.compose.runtime.snapshots.SnapshotMapSet<K, V, java.util.Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return ((java.lang.Boolean) add((java.util.Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(java.util.Collection collection) {
        return ((java.lang.Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(obj)) {
            return contains((java.util.Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(obj)) {
            return remove((java.util.Map.Entry) obj);
        }
        return false;
    }

    public SnapshotMapEntrySet(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    public java.lang.Void add(java.util.Map.Entry<K, V> element) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Void addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> elements) {
        androidx.compose.runtime.snapshots.SnapshotStateMapKt.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator(getMap(), ((androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    public boolean remove(java.util.Map.Entry<K, V> element) {
        return getMap().remove(element.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        boolean z;
        java.util.Iterator<? extends java.lang.Object> it = elements.iterator();
        while (true) {
            while (it.hasNext()) {
                z = getMap().remove(((java.util.Map.Entry) it.next()).getKey()) != null || z;
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.lang.Object obj;
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> map$runtime_release;
        int modification;
        boolean z;
        androidx.compose.runtime.snapshots.Snapshot current;
        java.lang.Object obj2;
        java.util.Collection<? extends java.lang.Object> collection = elements;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10)), 16));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            kotlin.Pair pair = kotlin.TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
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
            java.util.Iterator<java.util.Map.Entry<K, V>> it2 = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                java.util.Map.Entry<K, V> next = it2.next();
                if (!linkedHashMap.containsKey(next.getKey()) || !kotlin.jvm.internal.Intrinsics.areEqual(linkedHashMap.get(next.getKey()), next.getValue())) {
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

    public boolean contains(java.util.Map.Entry<K, V> element) {
        return kotlin.jvm.internal.Intrinsics.areEqual(getMap().get(element.getKey()), element.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        java.util.Collection<? extends java.lang.Object> collection = elements;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
