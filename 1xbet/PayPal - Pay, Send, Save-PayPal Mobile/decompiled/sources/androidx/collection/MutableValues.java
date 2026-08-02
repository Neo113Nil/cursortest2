package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001d\u0010\u0012\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\nJ\u001d\u0010\u0019\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\rR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/collection/MutableValues;", "K", "V", "", "Landroidx/collection/MutableScatterMap;", "p0", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "getHighSpeedVideoSizes", "Landroidx/collection/MutableScatterMap;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableValues<K, V> implements java.util.Collection<V>, kotlin.jvm.internal.markers.KMutableCollection {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterMap<K, V> Camera2StreamConfigurationMap;

    public MutableValues(androidx.collection.MutableScatterMap<K, V> mutableScatterMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableScatterMap, "");
        this.Camera2StreamConfigurationMap = mutableScatterMap;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<V> iterator() {
        return new androidx.collection.MutableValues$iterator$1(this);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends V> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean add(V p0) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
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
                        if (!kotlin.collections.CollectionsKt.contains(p0, this.Camera2StreamConfigurationMap.values[i4])) {
                            this.Camera2StreamConfigurationMap.removeValueAt(i4);
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

    @Override // java.util.Collection
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
                        if (kotlin.collections.CollectionsKt.contains(p0, this.Camera2StreamConfigurationMap.values[i4])) {
                            this.Camera2StreamConfigurationMap.removeValueAt(i4);
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

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object p0) {
        long[] jArr = this.Camera2StreamConfigurationMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.values[i4], p0)) {
                                this.Camera2StreamConfigurationMap.removeValueAt(i4);
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.Collection<? extends java.lang.Object> collection = p0;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.Camera2StreamConfigurationMap.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object p0) {
        return this.Camera2StreamConfigurationMap.containsValue(p0);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.Camera2StreamConfigurationMap._size;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }
}
