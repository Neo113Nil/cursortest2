package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\n¢\u0006\u0004\b\u0018\u0010\u001cJ \u0010\u0018\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001dH\u0086\n¢\u0006\u0004\b\u0018\u0010\u001eJ\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\n¢\u0006\u0004\b\u0018\u0010 J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\n¢\u0006\u0004\b\u0018\u0010\"J\u001e\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J%\u0010'\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0004\b'\u0010*J\u001b\u0010+\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b+\u0010%J\u0015\u0010,\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b,\u0010\u0019J\u001d\u0010,\u001a\u00020-2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b,\u0010.J-\u00101\u001a\u00020\u00072\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020-0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0003H\u0000¢\u0006\u0004\b4\u0010\u0006J\u0017\u00106\u001a\u00020\u00072\u0006\u00105\u001a\u00020\u0003H\u0000¢\u0006\u0004\b6\u0010\u0006J \u00107\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b7\u0010(J\r\u00108\u001a\u00020\u0003¢\u0006\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableObjectLongMap;", "K", "Landroidx/collection/ObjectLongMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "clear", "dropDeletes$collection", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/Object;)I", "key", "Lkotlin/Function0;", "", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)J", "getHighSpeedVideoSizes", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Landroidx/collection/ScatterSet;)V", "", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "from", "plusAssign", "(Landroidx/collection/ObjectLongMap;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;J)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(Ljava/lang/Object;JJ)J", "putAll", "remove", "", "(Ljava/lang/Object;J)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "newCapacity", "resizeStorage$collection", "set", "trim", "()I", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableObjectLongMap<K> extends androidx.collection.ObjectLongMap<K> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public /* synthetic */ MutableObjectLongMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableObjectLongMap(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        getHighSpeedVideoSizes(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    private final void getHighSpeedVideoSizes(int p0) {
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        getHighSpeedVideoFpsRangesFor(max);
        this.keys = new java.lang.Object[max];
        this.values = new long[max];
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = androidx.collection.ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            kotlin.collections.ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        this.getHighSpeedVideoFpsRanges = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final long getOrPut(K key, kotlin.jvm.functions.Function0<java.lang.Long> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        long longValue = defaultValue.invoke().longValue();
        set(key, longValue);
        return longValue;
    }

    public final void set(K key, long value) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.collection.MutableObjectLongMap<K>) key);
        if (highSpeedVideoFpsRangesFor < 0) {
            highSpeedVideoFpsRangesFor = ~highSpeedVideoFpsRangesFor;
        }
        this.keys[highSpeedVideoFpsRangesFor] = key;
        this.values[highSpeedVideoFpsRangesFor] = value;
    }

    public final void put(K key, long value) {
        set(key, value);
    }

    public final long put(K key, long value, long r7) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((androidx.collection.MutableObjectLongMap<K>) key);
        if (highSpeedVideoFpsRangesFor < 0) {
            highSpeedVideoFpsRangesFor = ~highSpeedVideoFpsRangesFor;
        } else {
            r7 = this.values[highSpeedVideoFpsRangesFor];
        }
        this.keys[highSpeedVideoFpsRangesFor] = key;
        this.values[highSpeedVideoFpsRangesFor] = value;
        return r7;
    }

    public final void plusAssign(androidx.collection.ObjectLongMap<K> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void remove(K key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final boolean remove(K key, long value) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != value) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, java.lang.Boolean> predicate) {
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
                        if (predicate.invoke(this.keys[i4], java.lang.Long.valueOf(this.values[i4])).booleanValue()) {
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

    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[index] = null;
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
        kotlin.collections.ArraysKt.fill(this.keys, (java.lang.Object) null, 0, this._capacity);
        this.getHighSpeedVideoFpsRanges = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
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
        int i2;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        java.lang.Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i4 = 0;
        for (int i5 = 0; i5 < ((i3 + 7) >> 3); i5++) {
            long j = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(jArr);
        int i6 = lastIndex - 1;
        long j2 = 72057594037927935L;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i7 = 0;
        while (i7 != i3) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                java.lang.Object obj = objArr[i7];
                int hashCode = (obj != null ? obj.hashCode() : i4) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i10 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i10);
                int i11 = i10 & i3;
                if (((highResolutionOutputSizeshNQ4ISI - i11) & i3) / 8 == ((i7 - i11) & i3) / 8) {
                    jArr[i8] = ((r8 & 127) << i9) | ((~(255 << i9)) & jArr[i8]);
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[i4] & j2) | Long.MIN_VALUE;
                    i7++;
                } else {
                    int i12 = highResolutionOutputSizeshNQ4ISI >> 3;
                    long j4 = jArr[i12];
                    int i13 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                    if (((j4 >> i13) & 255) == 128) {
                        int i14 = i7;
                        jArr[i12] = ((~(255 << i13)) & j4) | ((r8 & 127) << i13);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i14];
                        objArr[i14] = null;
                        jArr2[highResolutionOutputSizeshNQ4ISI] = jArr2[i14];
                        jArr2[i14] = 0;
                        i2 = i14;
                    } else {
                        int i15 = i7;
                        jArr[i12] = ((r8 & 127) << i13) | ((~(255 << i13)) & j4);
                        java.lang.Object obj2 = objArr[highResolutionOutputSizeshNQ4ISI];
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i15];
                        objArr[i15] = obj2;
                        long j5 = jArr2[highResolutionOutputSizeshNQ4ISI];
                        jArr2[highResolutionOutputSizeshNQ4ISI] = jArr2[i15];
                        jArr2[i15] = j5;
                        i2 = i15 - 1;
                    }
                    i = 0;
                    j2 = 72057594037927935L;
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i7 = i2 + 1;
                }
            } else {
                i = i4;
                i7++;
            }
            i4 = i;
        }
        this.getHighSpeedVideoFpsRanges = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void resizeStorage$collection(int newCapacity) {
        int i;
        long[] jArr = this.metadata;
        java.lang.Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i2 = this._capacity;
        getHighSpeedVideoSizes(newCapacity);
        long[] jArr3 = this.metadata;
        java.lang.Object[] objArr2 = this.keys;
        long[] jArr4 = this.values;
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
                long j2 = (j << i7) | (jArr3[i6] & (~(255 << i7)));
                jArr3[i6] = j2;
                jArr3[(((highResolutionOutputSizeshNQ4ISI - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr2[highResolutionOutputSizeshNQ4ISI] = obj;
                jArr4[highResolutionOutputSizeshNQ4ISI] = jArr2[i];
            } else {
                i = i4;
            }
            i4 = i + 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(androidx.collection.ObjectLongMap<K> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.Object[] objArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(objArr[i4], jArr[i4]);
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

    private final int getHighSpeedVideoFpsRangesFor(K p0) {
        int hashCode = (p0 != null ? p0.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], p0)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                if (this.getHighSpeedVideoFpsRanges == 0 && ((this.metadata[highResolutionOutputSizeshNQ4ISI >> 3] >> ((highResolutionOutputSizeshNQ4ISI & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                }
                this._size++;
                int i10 = highResolutionOutputSizeshNQ4ISI >> 3;
                int i11 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                this.getHighSpeedVideoFpsRanges -= ((this.metadata[i10] >> i11) & 255) == 128 ? 1 : 0;
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

    public MutableObjectLongMap() {
        this(0, 1, null);
    }
}
