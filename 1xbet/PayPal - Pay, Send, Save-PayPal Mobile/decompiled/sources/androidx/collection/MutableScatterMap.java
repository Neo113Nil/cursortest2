package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJA\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00002$\u0010\u0012\u001a \u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0011\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00028\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0007J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b!\u0010\"J\u001e\u0010!\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0086\n¢\u0006\u0004\b!\u0010%J\u001e\u0010!\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0086\n¢\u0006\u0004\b!\u0010'J \u0010!\u001a\u00020\b2\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000(H\u0086\n¢\u0006\u0004\b!\u0010)J\u001e\u0010!\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0086\n¢\u0006\u0004\b!\u0010+J\u001e\u0010!\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0086\n¢\u0006\u0004\b!\u0010-J$\u0010/\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\n¢\u0006\u0004\b/\u00100J,\u0010/\u001a\u00020\b2\u001a\u00102\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010(H\u0086\n¢\u0006\u0004\b/\u00103J$\u0010/\u001a\u00020\b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0086\n¢\u0006\u0004\b/\u00105J*\u0010/\u001a\u00020\b2\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010*H\u0086\n¢\u0006\u0004\b/\u0010+J$\u0010/\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0086\n¢\u0006\u0004\b/\u00107J*\u0010/\u001a\u00020\b2\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010,H\u0086\n¢\u0006\u0004\b/\u0010-J\u001f\u00109\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u0001¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b;\u00100J)\u0010;\u001a\u00020\b2\u001a\u00102\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010(¢\u0006\u0004\b;\u00103J'\u0010;\u001a\u00020\b2\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010*¢\u0006\u0004\b;\u0010+J!\u0010;\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106¢\u0006\u0004\b;\u00107J'\u0010;\u001a\u00020\b2\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001010,¢\u0006\u0004\b;\u0010-J\u0017\u0010<\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b<\u0010=J\u001d\u0010<\u001a\u00020>2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u0001¢\u0006\u0004\b<\u0010?J-\u0010A\u001a\u00020\b2\u0018\u0010@\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020>0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010C\u001a\u00020\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0004H\u0000¢\u0006\u0004\bG\u0010\u0007J \u0010H\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010L\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "", "asMutableMap", "()Ljava/util/Map;", "clear", "key", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "computeBlock", "compute", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "dropDeletes$collection", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "findInsertIndex", "(Ljava/lang/Object;)I", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ObjectList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Landroidx/collection/ObjectList;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "from", "plusAssign", "(Landroidx/collection/ScatterMap;)V", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)V", "pair", "(Lkotlin/Pair;)V", "", "(Ljava/util/Map;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "newCapacity", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "trim", "()I", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends androidx.collection.ScatterMap<K, V> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ MutableScatterMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableScatterMap(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        getHighSpeedVideoFpsRanges(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    private final void getHighSpeedVideoFpsRanges(int p0) {
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        getHighSpeedVideoSizes(max);
        this.keys = max == 0 ? androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS : new java.lang.Object[max];
        this.values = max == 0 ? androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS : new java.lang.Object[max];
    }

    private final void getHighSpeedVideoSizes(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = androidx.collection.ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((p0 + 15) & (-8)) >> 3];
            kotlin.collections.ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
            int i = p0 >> 3;
            long j = 255 << ((p0 & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.metadata = jArr;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final V getOrPut(K key, kotlin.jvm.functions.Function0<? extends V> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        V v = get(key);
        if (v != null) {
            return v;
        }
        V invoke = defaultValue.invoke();
        set(key, invoke);
        return invoke;
    }

    public final V compute(K key, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends V> computeBlock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(computeBlock, "");
        int findInsertIndex = findInsertIndex(key);
        boolean z = findInsertIndex < 0;
        V invoke = computeBlock.invoke(key, z ? null : this.values[findInsertIndex]);
        if (z) {
            int i = ~findInsertIndex;
            this.keys[i] = key;
            this.values[i] = invoke;
            return invoke;
        }
        this.values[findInsertIndex] = invoke;
        return invoke;
    }

    public final void set(K key, V value) {
        int findInsertIndex = findInsertIndex(key);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = key;
        this.values[findInsertIndex] = value;
    }

    public final V put(K key, V value) {
        int findInsertIndex = findInsertIndex(key);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        V v = (V) this.values[findInsertIndex];
        this.keys[findInsertIndex] = key;
        this.values[findInsertIndex] = value;
        return v;
    }

    public final void putAll(kotlin.Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void putAll(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void putAll(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void plusAssign(kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        set(pair.getFirst(), pair.getSecond());
    }

    public final void plusAssign(kotlin.Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(java.util.Map<K, ? extends V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void plusAssign(androidx.collection.ScatterMap<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(K key) {
        int i;
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap = this;
        int i2 = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i3 = mutableScatterMap._capacity;
        int i4 = (hashCode ^ (hashCode << 16)) >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = mutableScatterMap.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((r2 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableScatterMap.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i4 = i5 + i2;
        }
        if (i >= 0) {
            return removeValueAt(i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(K key, V value) {
        int i;
        androidx.collection.MutableScatterMap<K, V> mutableScatterMap = this;
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableScatterMap.keys[i], key)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
            i2 = i8;
        }
        if (i < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.values[i], value)) {
            return false;
        }
        removeValueAt(i);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (predicate.invoke(this.keys[i4], this.values[i4]).booleanValue()) {
                            removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void minusAssign(K[] keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        for (K k : keys) {
            remove(k);
        }
    }

    public final void minusAssign(java.lang.Iterable<? extends K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[index] = null;
        V v = (V) this.values[index];
        this.values[index] = null;
        return v;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != androidx.collection.ScatterMapKt.EmptyGroup) {
            kotlin.collections.ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
            long[] jArr = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        kotlin.collections.ArraysKt.fill(this.values, (java.lang.Object) null, 0, this._capacity);
        kotlin.collections.ArraysKt.fill(this.keys, (java.lang.Object) null, 0, this._capacity);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(int p0) {
        int i = this._capacity;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final int trim() {
        int i = this._capacity;
        int normalizeCapacity = androidx.collection.ScatterMapKt.normalizeCapacity(androidx.collection.ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i - this._capacity;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(this._size) * 32), kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(this._capacity) * 25)) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(androidx.collection.ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        int i;
        java.lang.Object[] objArr;
        int i2;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        java.lang.Object[] objArr2 = this.keys;
        java.lang.Object[] objArr3 = this.values;
        int i4 = 0;
        for (int i5 = 0; i5 < ((i3 + 7) >> 3); i5++) {
            long j = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(jArr);
        int i6 = lastIndex - 1;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i7 = 0;
        while (i7 != i3) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j2 = (jArr[i8] >> i9) & 255;
            if (j2 != 128 && j2 == 254) {
                java.lang.Object obj = objArr2[i7];
                int hashCode = (obj != null ? obj.hashCode() : i4) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i10 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i10);
                int i11 = i10 & i3;
                if (((highResolutionOutputSizeshNQ4ISI - i11) & i3) / 8 == ((i7 - i11) & i3) / 8) {
                    jArr[i8] = ((r8 & 127) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = jArr[i4];
                    i = i3;
                    objArr = objArr2;
                    i2 = i4;
                } else {
                    int i12 = highResolutionOutputSizeshNQ4ISI >> 3;
                    long j3 = jArr[i12];
                    int i13 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                    if (((j3 >> i13) & 255) == 128) {
                        int i14 = i7;
                        i = i3;
                        objArr = objArr2;
                        jArr[i12] = ((~(255 << i13)) & j3) | ((r8 & 127) << i13);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i14];
                        objArr[i14] = null;
                        objArr3[highResolutionOutputSizeshNQ4ISI] = objArr3[i14];
                        objArr3[i14] = null;
                        i7 = i14;
                    } else {
                        i = i3;
                        objArr = objArr2;
                        int i15 = i7;
                        jArr[i12] = ((r8 & 127) << i13) | ((~(255 << i13)) & j3);
                        java.lang.Object obj2 = objArr[highResolutionOutputSizeshNQ4ISI];
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i15];
                        objArr[i15] = obj2;
                        java.lang.Object obj3 = objArr3[highResolutionOutputSizeshNQ4ISI];
                        objArr3[highResolutionOutputSizeshNQ4ISI] = objArr3[i15];
                        objArr3[i15] = obj3;
                        i7 = i15 - 1;
                    }
                    i2 = 0;
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = jArr[0];
                }
                i7++;
            } else {
                i = i3;
                objArr = objArr2;
                i2 = i4;
                i7++;
            }
            i4 = i2;
            i3 = i;
            objArr2 = objArr;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        int i2 = this._capacity;
        getHighSpeedVideoFpsRanges(newCapacity);
        long[] jArr2 = this.metadata;
        java.lang.Object[] objArr3 = this.keys;
        java.lang.Object[] objArr4 = this.values;
        int i3 = this._capacity;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i5 = hashCode ^ (hashCode << 16);
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i5 >>> 7);
                i = i4;
                long j = i5 & 127;
                int i6 = highResolutionOutputSizeshNQ4ISI >> 3;
                int i7 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                long j2 = (j << i7) | (jArr2[i6] & (~(255 << i7)));
                jArr2[i6] = j2;
                jArr2[(((highResolutionOutputSizeshNQ4ISI - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr3[highResolutionOutputSizeshNQ4ISI] = obj;
                objArr4[highResolutionOutputSizeshNQ4ISI] = objArr2[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    public final java.util.Map<K, V> asMutableMap() {
        return new androidx.collection.MutableMapWrapper(this);
    }

    public final void putAll(java.util.Map<K, ? extends V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        for (java.util.Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(androidx.collection.ScatterMap<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.Object[] objArr = from.keys;
        java.lang.Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ScatterSet<K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.lang.Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ObjectList<K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.lang.Object[] objArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    public final int findInsertIndex(K key) {
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * androidx.collection.ScatterMapKt.BitmaskLsb);
            for (long j4 = (j3 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                if (this.getHighSpeedVideoFpsRangesFor == 0 && ((this.metadata[highResolutionOutputSizeshNQ4ISI >> 3] >> ((highResolutionOutputSizeshNQ4ISI & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                }
                this._size++;
                int i10 = highResolutionOutputSizeshNQ4ISI >> 3;
                int i11 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                this.getHighSpeedVideoFpsRangesFor -= ((this.metadata[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j5 = ((~(255 << i11)) & jArr2[i10]) | (j2 << i11);
                jArr2[i10] = j5;
                jArr2[(((highResolutionOutputSizeshNQ4ISI - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return ~highResolutionOutputSizeshNQ4ISI;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }
}
