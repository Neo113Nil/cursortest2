package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0016¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0016¢\u0006\u0004\b\u0017\u0010\fR \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/collection/MutableEntries;", "K", "V", "", "", "Landroidx/collection/MutableScatterMap;", "p0", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "", "", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterMap;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableEntries<K, V> implements java.util.Set<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<K, V> Camera2StreamConfigurationMap;

    public MutableEntries(androidx.collection.MutableScatterMap<K, V> mutableScatterMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableScatterMap, "");
        this.Camera2StreamConfigurationMap = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.util.Map.Entry) obj, "");
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(entry.getKey()), entry.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r15 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(java.lang.Object obj) {
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap;
        int i;
        if (!kotlin.jvm.internal.TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap2 = this.Camera2StreamConfigurationMap;
        java.lang.Object key = entry.getKey();
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = mutableScatterMap2._capacity;
        int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap2.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = (((-i6) >> 63) & (jArr[i5 + 1] << (64 - i6))) | (jArr[i5] >>> i6);
            long j2 = ((r5 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            androidx.collection.MutableScatterMap<K, V> mutableScatterMap3 = mutableScatterMap2;
            long j3 = (~j2) & (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                androidx.collection.MutableScatterMap<K, V> mutableScatterMap4 = mutableScatterMap3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableScatterMap4.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
                mutableScatterMap3 = mutableScatterMap4;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
            mutableScatterMap2 = mutableScatterMap;
        }
        if (i < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.values[i], entry.getValue())) {
            return false;
        }
        this.Camera2StreamConfigurationMap.removeValueAt(i);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new androidx.collection.MutableEntries$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Collection<? extends java.lang.Object> collection = p0;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.Camera2StreamConfigurationMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.util.Iterator<? extends java.lang.Object> it = p0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), this.Camera2StreamConfigurationMap.keys[i4]) || !kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), this.Camera2StreamConfigurationMap.values[i4])) {
                                }
                            } else {
                                this.Camera2StreamConfigurationMap.removeValueAt(i4);
                                z = true;
                                break;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.Camera2StreamConfigurationMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.util.Iterator<? extends java.lang.Object> it = p0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), this.Camera2StreamConfigurationMap.keys[i4]) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), this.Camera2StreamConfigurationMap.values[i4])) {
                                    this.Camera2StreamConfigurationMap.removeValueAt(i4);
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.Camera2StreamConfigurationMap._size;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }
}
