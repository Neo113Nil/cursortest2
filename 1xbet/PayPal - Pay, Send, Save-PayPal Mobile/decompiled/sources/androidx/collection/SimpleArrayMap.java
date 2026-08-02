package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B#\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00028\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0001H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001bJ'\u0010,\u001a\u00020\n2\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b,\u0010\u0006J!\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010\u001bJ\u0019\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\u0018J\u001f\u0010.\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010*J!\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010\u001bJ'\u00101\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u00104J\u001f\u00105\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0007H\u0016¢\u0006\u0004\b7\u0010\u001dJ\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00028\u00012\u0006\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u0010*R\u001e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010@R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010B"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "map", "<init>", "(Landroidx/collection/SimpleArrayMap;)V", "", "capacity", "(I)V", "", "clear", "()V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "minimumCapacity", "ensureCapacity", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "()I", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "Camera2StreamConfigurationMap", "__restricted$indexOfValue", "isEmpty", "()Z", "index", "keyAt", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", io.ktor.http.ContentDisposition.Parameters.Size, "", "toString", "()Ljava/lang/String;", "valueAt", "", "[Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "[I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int[] getHighResolutionOutputSizeshNQ4ISI;

    public SimpleArrayMap(int i) {
        int[] iArr;
        java.lang.Object[] objArr;
        if (i == 0) {
            iArr = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i];
        }
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        if (i == 0) {
            objArr = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new java.lang.Object[i << 1];
        }
        this.getHighSpeedVideoSizes = objArr;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(androidx.collection.SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(K p0, int p1) {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            return -1;
        }
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.getHighResolutionOutputSizeshNQ4ISI, i, p1);
        if (binarySearch < 0 || kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoSizes[binarySearch << 1])) {
            return binarySearch;
        }
        int i2 = binarySearch + 1;
        while (i2 < i && this.getHighResolutionOutputSizeshNQ4ISI[i2] == p1) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoSizes[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearch - 1; i3 >= 0 && this.getHighResolutionOutputSizeshNQ4ISI[i3] == p1; i3--) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(p0, this.getHighSpeedVideoSizes[i3 << 1])) {
                return i3;
            }
        }
        return ~i2;
    }

    private final int Camera2StreamConfigurationMap() {
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            return -1;
        }
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.getHighResolutionOutputSizeshNQ4ISI, i, 0);
        if (binarySearch < 0 || this.getHighSpeedVideoSizes[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i2 = binarySearch + 1;
        while (i2 < i && this.getHighResolutionOutputSizeshNQ4ISI[i2] == 0) {
            if (this.getHighSpeedVideoSizes[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = binarySearch - 1; i3 >= 0 && this.getHighResolutionOutputSizeshNQ4ISI[i3] == 0; i3--) {
            if (this.getHighSpeedVideoSizes[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.Camera2StreamConfigurationMap > 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS;
            this.getHighSpeedVideoSizes = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
            this.Camera2StreamConfigurationMap = 0;
        }
        if (this.Camera2StreamConfigurationMap > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int minimumCapacity) {
        int i = this.Camera2StreamConfigurationMap;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iArr.length < minimumCapacity) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, minimumCapacity);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighResolutionOutputSizeshNQ4ISI = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, minimumCapacity * 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.getHighSpeedVideoSizes = copyOf2;
        }
        if (this.Camera2StreamConfigurationMap != i) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public int indexOfKey(K key) {
        if (key == null) {
            return Camera2StreamConfigurationMap();
        }
        return getHighSpeedVideoFpsRangesFor(key, key.hashCode());
    }

    public final int __restricted$indexOfValue(V value) {
        int i = this.Camera2StreamConfigurationMap * 2;
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        if (value == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V value) {
        return __restricted$indexOfValue(value) >= 0;
    }

    public K keyAt(int index) {
        if (index < 0 || index >= this.Camera2StreamConfigurationMap) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        return (K) this.getHighSpeedVideoSizes[index << 1];
    }

    public V valueAt(int index) {
        if (index < 0 || index >= this.Camera2StreamConfigurationMap) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        return (V) this.getHighSpeedVideoSizes[(index << 1) + 1];
    }

    public V setValueAt(int index, V value) {
        if (index < 0 || index >= this.Camera2StreamConfigurationMap) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        int i = (index << 1) + 1;
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        V v = (V) objArr[i];
        objArr[i] = value;
        return v;
    }

    public boolean isEmpty() {
        return this.Camera2StreamConfigurationMap <= 0;
    }

    public V put(K key, V value) {
        int i = this.Camera2StreamConfigurationMap;
        int hashCode = key != null ? key.hashCode() : 0;
        int highSpeedVideoFpsRangesFor = key != null ? getHighSpeedVideoFpsRangesFor(key, hashCode) : Camera2StreamConfigurationMap();
        if (highSpeedVideoFpsRangesFor >= 0) {
            int i2 = (highSpeedVideoFpsRangesFor << 1) + 1;
            java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
            V v = (V) objArr[i2];
            objArr[i2] = value;
            return v;
        }
        int i3 = ~highSpeedVideoFpsRangesFor;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] copyOf = java.util.Arrays.copyOf(iArr, i4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighResolutionOutputSizeshNQ4ISI = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, i4 << 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.getHighSpeedVideoSizes = copyOf2;
            if (i != this.Camera2StreamConfigurationMap) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i5 = i3 + 1;
            kotlin.collections.ArraysKt.copyInto(iArr2, iArr2, i5, i3, i);
            java.lang.Object[] objArr2 = this.getHighSpeedVideoSizes;
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.Camera2StreamConfigurationMap << 1);
        }
        int i6 = this.Camera2StreamConfigurationMap;
        if (i == i6) {
            int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                java.lang.Object[] objArr3 = this.getHighSpeedVideoSizes;
                int i7 = i3 << 1;
                objArr3[i7] = key;
                objArr3[i7 + 1] = value;
                this.Camera2StreamConfigurationMap = i6 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public void putAll(androidx.collection.SimpleArrayMap<? extends K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        int i = map.Camera2StreamConfigurationMap;
        ensureCapacity(this.Camera2StreamConfigurationMap + i);
        if (this.Camera2StreamConfigurationMap != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(map.keyAt(i2), map.valueAt(i2));
            }
        } else if (i > 0) {
            kotlin.collections.ArraysKt.copyInto(map.getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, 0, 0, i);
            kotlin.collections.ArraysKt.copyInto(map.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes, 0, 0, i << 1);
            this.Camera2StreamConfigurationMap = i;
        }
    }

    public V putIfAbsent(K key, V value) {
        V v = get(key);
        return v == null ? put(key, value) : v;
    }

    public V remove(K key) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public boolean remove(K key, V value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(value, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public V removeAt(int index) {
        if (index < 0 || index >= this.Camera2StreamConfigurationMap) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        int i = index << 1;
        V v = (V) objArr[i + 1];
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i3 = i2 - 1;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            int i4 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] copyOf = java.util.Arrays.copyOf(iArr, i4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighResolutionOutputSizeshNQ4ISI = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, i4 << 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.getHighSpeedVideoSizes = copyOf2;
            if (i2 != this.Camera2StreamConfigurationMap) {
                throw new java.util.ConcurrentModificationException();
            }
            if (index > 0) {
                kotlin.collections.ArraysKt.copyInto(iArr, this.getHighResolutionOutputSizeshNQ4ISI, 0, 0, index);
                kotlin.collections.ArraysKt.copyInto(objArr, this.getHighSpeedVideoSizes, 0, 0, i);
            }
            if (index < i3) {
                int i5 = index + 1;
                kotlin.collections.ArraysKt.copyInto(iArr, this.getHighResolutionOutputSizeshNQ4ISI, index, i5, i2);
                kotlin.collections.ArraysKt.copyInto(objArr, this.getHighSpeedVideoSizes, i, i5 << 1, i2 << 1);
            }
        } else {
            if (index < i3) {
                int i6 = index + 1;
                kotlin.collections.ArraysKt.copyInto(iArr, iArr, index, i6, i2);
                java.lang.Object[] objArr2 = this.getHighSpeedVideoSizes;
                kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, i, i6 << 1, i2 << 1);
            }
            java.lang.Object[] objArr3 = this.getHighSpeedVideoSizes;
            int i7 = i3 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        }
        if (i2 != this.Camera2StreamConfigurationMap) {
            throw new java.util.ConcurrentModificationException();
        }
        this.Camera2StreamConfigurationMap = i3;
        return v;
    }

    public V replace(K key, V value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, value);
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(oldValue, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, newValue);
        return true;
    }

    /* renamed from: size, reason: from getter */
    public int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof androidx.collection.SimpleArrayMap) {
                if (getCamera2StreamConfigurationMap() != ((androidx.collection.SimpleArrayMap) other).getCamera2StreamConfigurationMap()) {
                    return false;
                }
                androidx.collection.SimpleArrayMap simpleArrayMap = (androidx.collection.SimpleArrayMap) other;
                int i = this.Camera2StreamConfigurationMap;
                for (int i2 = 0; i2 < i; i2++) {
                    K keyAt = keyAt(i2);
                    V valueAt = valueAt(i2);
                    java.lang.Object obj = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.Intrinsics.areEqual(valueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof java.util.Map) || getCamera2StreamConfigurationMap() != ((java.util.Map) other).size()) {
                return false;
            }
            int i3 = this.Camera2StreamConfigurationMap;
            for (int i4 = 0; i4 < i3; i4++) {
                K keyAt2 = keyAt(i4);
                V valueAt2 = valueAt(i4);
                java.lang.Object obj2 = ((java.util.Map) other).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj2 != null || !((java.util.Map) other).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(valueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            java.lang.Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.Camera2StreamConfigurationMap * 28);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        int i = this.Camera2StreamConfigurationMap;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i2);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V valueAt = valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public V get(K key) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey >= 0) {
            return (V) this.getHighSpeedVideoSizes[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(java.lang.Object key, V defaultValue) {
        int indexOfKey = indexOfKey(key);
        return indexOfKey >= 0 ? (V) this.getHighSpeedVideoSizes[(indexOfKey << 1) + 1] : defaultValue;
    }

    public SimpleArrayMap() {
        this(0, 1, null);
    }
}
