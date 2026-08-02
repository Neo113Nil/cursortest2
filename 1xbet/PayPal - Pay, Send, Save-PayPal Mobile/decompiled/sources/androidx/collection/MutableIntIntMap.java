package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001aH\u0086\n¢\u0006\u0004\b\u0018\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0018\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u001cH\u0086\n¢\u0006\u0004\b\u0018\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J%\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b&\u0010 J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0005J\u001d\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b'\u0010)J-\u0010,\u001a\u00020\u00062\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0*H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u0010\u0005J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u0010\u0005J \u00102\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b2\u0010#J\r\u00103\u001a\u00020\u0002¢\u0006\u0004\b3\u00104R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00105\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableIntIntMap;", "Landroidx/collection/IntIntMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "clear", "dropDeletes$collection", "p0", "getHighSpeedVideoSizes", "(I)I", "getHighSpeedVideoFpsRangesFor", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(ILkotlin/jvm/functions/Function0;)I", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/collection/IntList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "minusAssign", "(Landroidx/collection/IntList;)V", "Landroidx/collection/IntSet;", "(Landroidx/collection/IntSet;)V", "", "([I)V", "from", "plusAssign", "(Landroidx/collection/IntIntMap;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(II)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(III)I", "putAll", "remove", "", "(II)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "newCapacity", "resizeStorage$collection", "set", "trim", "()I", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableIntIntMap extends androidx.collection.IntIntMap {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    public MutableIntIntMap(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        Camera2StreamConfigurationMap(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    public /* synthetic */ MutableIntIntMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        getHighResolutionOutputSizeshNQ4ISI(max);
        this.keys = new int[max];
        this.values = new int[max];
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0) {
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
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final int getOrPut(int key, kotlin.jvm.functions.Function0<java.lang.Integer> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            int intValue = defaultValue.invoke().intValue();
            put(key, intValue);
            return intValue;
        }
        return this.values[findKeyIndex];
    }

    public final void set(int key, int value) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(key);
        if (highSpeedVideoFpsRangesFor < 0) {
            highSpeedVideoFpsRangesFor = ~highSpeedVideoFpsRangesFor;
        }
        this.keys[highSpeedVideoFpsRangesFor] = key;
        this.values[highSpeedVideoFpsRangesFor] = value;
    }

    public final void put(int key, int value) {
        set(key, value);
    }

    public final int put(int key, int value, int r5) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(key);
        if (highSpeedVideoFpsRangesFor < 0) {
            highSpeedVideoFpsRangesFor = ~highSpeedVideoFpsRangesFor;
        } else {
            r5 = this.values[highSpeedVideoFpsRangesFor];
        }
        this.keys[highSpeedVideoFpsRangesFor] = key;
        this.values[highSpeedVideoFpsRangesFor] = value;
        return r5;
    }

    public final void plusAssign(androidx.collection.IntIntMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void remove(int key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final boolean remove(int key, int value) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != value) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, java.lang.Boolean> predicate) {
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
                        if (predicate.invoke(java.lang.Integer.valueOf(this.keys[i4]), java.lang.Integer.valueOf(this.values[i4])).booleanValue()) {
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

    public final void minusAssign(int key) {
        remove(key);
    }

    public final void minusAssign(int[] keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        for (int i : keys) {
            remove(i);
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
        getHighSpeedVideoFpsRangesFor();
    }

    private final int getHighSpeedVideoSizes(int p0) {
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
        char c;
        int i;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        char c2 = 0;
        for (int i3 = 0; i3 < ((i2 + 7) >> 3); i3++) {
            long j = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(jArr);
        int i4 = lastIndex - 1;
        long j2 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i5 = 0;
        while (i5 != i2) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j3 = (jArr[i6] >> i7) & 255;
            if (j3 != 128 && j3 == 254) {
                int hashCode = java.lang.Integer.hashCode(iArr[i5]) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highSpeedVideoSizes = getHighSpeedVideoSizes(i8);
                int i9 = i8 & i2;
                if (((highSpeedVideoSizes - i9) & i2) / 8 == ((i5 - i9) & i2) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i10 = highSpeedVideoSizes >> 3;
                    long j4 = jArr[i10];
                    int i11 = (highSpeedVideoSizes & 7) << 3;
                    if (((j4 >> i11) & 255) == 128) {
                        int i12 = i5;
                        jArr[i10] = ((~(255 << i11)) & j4) | ((r8 & 127) << i11);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        iArr[highSpeedVideoSizes] = iArr[i12];
                        iArr[i12] = 0;
                        iArr2[highSpeedVideoSizes] = iArr2[i12];
                        iArr2[i12] = 0;
                        i = i12;
                    } else {
                        int i13 = i5;
                        jArr[i10] = ((r8 & 127) << i11) | ((~(255 << i11)) & j4);
                        int i14 = iArr[highSpeedVideoSizes];
                        iArr[highSpeedVideoSizes] = iArr[i13];
                        iArr[i13] = i14;
                        int i15 = iArr2[highSpeedVideoSizes];
                        iArr2[highSpeedVideoSizes] = iArr2[i13];
                        iArr2[i13] = i15;
                        i = i13 - 1;
                    }
                    c = 0;
                    j2 = 72057594037927935L;
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    i5 = i + 1;
                }
            } else {
                c = c2;
                i5++;
            }
            c2 = c;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        androidx.collection.MutableIntIntMap mutableIntIntMap = this;
        long[] jArr2 = mutableIntIntMap.metadata;
        int[] iArr = mutableIntIntMap.keys;
        int[] iArr2 = mutableIntIntMap.values;
        int i = mutableIntIntMap._capacity;
        Camera2StreamConfigurationMap(newCapacity);
        long[] jArr3 = mutableIntIntMap.metadata;
        int[] iArr3 = mutableIntIntMap.keys;
        int[] iArr4 = mutableIntIntMap.values;
        int i2 = mutableIntIntMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                int i4 = iArr[i3];
                int hashCode = java.lang.Integer.hashCode(i4) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i5 = hashCode ^ (hashCode << 16);
                int highSpeedVideoSizes = mutableIntIntMap.getHighSpeedVideoSizes(i5 >>> 7);
                long j = i5 & 127;
                int i6 = highSpeedVideoSizes >> 3;
                int i7 = (highSpeedVideoSizes & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i6] & (~(255 << i7))) | (j << i7);
                jArr3[i6] = j2;
                jArr3[(((highSpeedVideoSizes - 7) & i2) + (i2 & 7)) >> 3] = j2;
                iArr3[highSpeedVideoSizes] = i4;
                iArr4[highSpeedVideoSizes] = iArr2[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableIntIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void putAll(androidx.collection.IntIntMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        int[] iArr = from.keys;
        int[] iArr2 = from.values;
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
                        set(iArr[i4], iArr2[i4]);
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

    public final void minusAssign(androidx.collection.IntSet keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        int[] iArr = keys.elements;
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
                        remove(iArr[(i << 3) + i3]);
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

    public final void minusAssign(androidx.collection.IntList keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        int[] iArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(iArr[i2]);
        }
    }

    private final int getHighSpeedVideoFpsRangesFor(int p0) {
        int hashCode = java.lang.Integer.hashCode(p0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = this._capacity;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = i & 127;
            int i8 = i5;
            long j3 = j ^ (j2 * androidx.collection.ScatterMapKt.BitmaskLsb);
            for (long j4 = (j3 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.keys[numberOfTrailingZeros] == p0) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
                if (this.Camera2StreamConfigurationMap == 0 && ((this.metadata[highSpeedVideoSizes >> 3] >> ((highSpeedVideoSizes & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
                }
                this._size++;
                int i9 = highSpeedVideoSizes >> 3;
                int i10 = (highSpeedVideoSizes & 7) << 3;
                this.Camera2StreamConfigurationMap -= ((this.metadata[i9] >> i10) & 255) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i11 = this._capacity;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((highSpeedVideoSizes - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return ~highSpeedVideoSizes;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public MutableIntIntMap() {
        this(0, 1, null);
    }
}
