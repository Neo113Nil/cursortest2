package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0012\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u001d\u0010\u0019\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/collection/MutableKeys;", "K", "V", "", "Landroidx/collection/MutableScatterMap;", "p0", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableScatterMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableKeys<K, V> implements java.util.Set<K>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<K, V> getHighSpeedVideoSizes;

    public MutableKeys(androidx.collection.MutableScatterMap<K, V> mutableScatterMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableScatterMap, "");
        this.getHighSpeedVideoSizes = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<K> iterator() {
        return new androidx.collection.MutableKeys$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends K> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(K p0) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        long[] jArr = this.getHighSpeedVideoSizes.metadata;
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
                        if (!kotlin.collections.CollectionsKt.contains(p0, this.getHighSpeedVideoSizes.keys[i4])) {
                            this.getHighSpeedVideoSizes.removeValueAt(i4);
                            z = true;
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
        long[] jArr = this.getHighSpeedVideoSizes.metadata;
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
                        if (kotlin.collections.CollectionsKt.contains(p0, this.getHighSpeedVideoSizes.keys[i4])) {
                            this.getHighSpeedVideoSizes.removeValueAt(i4);
                            z = true;
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(java.lang.Object p0) {
        int i;
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap = this.getHighSpeedVideoSizes;
        int hashCode = (p0 != null ? p0.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = mutableScatterMap._capacity;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = mutableScatterMap.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((i2 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            int i8 = i2;
            long j3 = (~j2) & (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableScatterMap.keys[i], p0)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
            i2 = i8;
        }
        if (i < 0) {
            return false;
        }
        this.getHighSpeedVideoSizes.removeValueAt(i);
        return true;
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
            if (!this.getHighSpeedVideoSizes.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.containsKey(p0);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.getHighSpeedVideoSizes._size;
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
