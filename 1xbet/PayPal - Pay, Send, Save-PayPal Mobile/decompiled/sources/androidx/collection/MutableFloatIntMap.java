package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0086\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001bH\u0086\n¢\u0006\u0004\b\u0019\u0010\u001cJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u0019\u0010\u001dJ\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u001eH\u0086\n¢\u0006\u0004\b\u0019\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J%\u0010$\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b$\u0010'J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b(\u0010\"J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u001dJ\u001d\u0010)\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b)\u0010+J-\u0010.\u001a\u00020\u00062\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0,H\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0002H\u0000¢\u0006\u0004\b1\u0010\u0005J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u0010\u0005J \u00104\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b4\u0010%J\r\u00105\u001a\u00020\u0002¢\u0006\u0004\b5\u00106R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableFloatIntMap;", "Landroidx/collection/FloatIntMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "clear", "dropDeletes$collection", "p0", "getHighSpeedVideoFpsRangesFor", "(I)I", "", "getHighSpeedVideoSizes", "(F)I", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLkotlin/jvm/functions/Function0;)I", "Camera2StreamConfigurationMap", "Landroidx/collection/FloatList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "minusAssign", "(Landroidx/collection/FloatList;)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "(F)V", "", "([F)V", "from", "plusAssign", "(Landroidx/collection/FloatIntMap;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(FI)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(FII)I", "putAll", "remove", "", "(FI)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "newCapacity", "resizeStorage$collection", "set", "trim", "()I", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableFloatIntMap extends androidx.collection.FloatIntMap {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    public MutableFloatIntMap(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        getHighSpeedVideoSizes(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    public /* synthetic */ MutableFloatIntMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void getHighSpeedVideoSizes(int p0) {
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        Camera2StreamConfigurationMap(max);
        this.keys = new float[max];
        this.values = new int[max];
    }

    private final void Camera2StreamConfigurationMap(int p0) {
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
        this.Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final int getOrPut(float key, kotlin.jvm.functions.Function0<java.lang.Integer> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            int intValue = defaultValue.invoke().intValue();
            put(key, intValue);
            return intValue;
        }
        return this.values[findKeyIndex];
    }

    public final void set(float key, int value) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(key);
        if (highSpeedVideoSizes < 0) {
            highSpeedVideoSizes = ~highSpeedVideoSizes;
        }
        this.keys[highSpeedVideoSizes] = key;
        this.values[highSpeedVideoSizes] = value;
    }

    public final void put(float key, int value) {
        set(key, value);
    }

    public final int put(float key, int value, int r5) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(key);
        if (highSpeedVideoSizes < 0) {
            highSpeedVideoSizes = ~highSpeedVideoSizes;
        } else {
            r5 = this.values[highSpeedVideoSizes];
        }
        this.keys[highSpeedVideoSizes] = key;
        this.values[highSpeedVideoSizes] = value;
        return r5;
    }

    public final void plusAssign(androidx.collection.FloatIntMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void remove(float key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final boolean remove(float key, int value) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != value) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Integer, java.lang.Boolean> predicate) {
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
                        if (predicate.invoke(java.lang.Float.valueOf(this.keys[i4]), java.lang.Integer.valueOf(this.values[i4])).booleanValue()) {
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

    public final void minusAssign(float key) {
        remove(key);
    }

    public final void minusAssign(float[] keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        for (float f : keys) {
            remove(f);
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
        this.Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final int getHighSpeedVideoFpsRangesFor(int p0) {
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
        float[] fArr = this.keys;
        int[] iArr = this.values;
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
                int hashCode = java.lang.Float.hashCode(fArr[i5]) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i8);
                int i9 = i8 & i2;
                if (((highSpeedVideoFpsRangesFor - i9) & i2) / 8 == ((i5 - i9) & i2) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i10 = highSpeedVideoFpsRangesFor >> 3;
                    long j4 = jArr[i10];
                    int i11 = (highSpeedVideoFpsRangesFor & 7) << 3;
                    if (((j4 >> i11) & 255) == 128) {
                        int i12 = i5;
                        jArr[i10] = ((~(255 << i11)) & j4) | ((r8 & 127) << i11);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        fArr[highSpeedVideoFpsRangesFor] = fArr[i12];
                        fArr[i12] = 0.0f;
                        iArr[highSpeedVideoFpsRangesFor] = iArr[i12];
                        iArr[i12] = 0;
                        i = i12;
                    } else {
                        int i13 = i5;
                        jArr[i10] = ((r8 & 127) << i11) | ((~(255 << i11)) & j4);
                        float f = fArr[highSpeedVideoFpsRangesFor];
                        fArr[highSpeedVideoFpsRangesFor] = fArr[i13];
                        fArr[i13] = f;
                        int i14 = iArr[highSpeedVideoFpsRangesFor];
                        iArr[highSpeedVideoFpsRangesFor] = iArr[i13];
                        iArr[i13] = i14;
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
        this.Camera2StreamConfigurationMap = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        androidx.collection.MutableFloatIntMap mutableFloatIntMap = this;
        long[] jArr2 = mutableFloatIntMap.metadata;
        float[] fArr = mutableFloatIntMap.keys;
        int[] iArr = mutableFloatIntMap.values;
        int i = mutableFloatIntMap._capacity;
        getHighSpeedVideoSizes(newCapacity);
        long[] jArr3 = mutableFloatIntMap.metadata;
        float[] fArr2 = mutableFloatIntMap.keys;
        int[] iArr2 = mutableFloatIntMap.values;
        int i2 = mutableFloatIntMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int hashCode = java.lang.Float.hashCode(f) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int highSpeedVideoFpsRangesFor = mutableFloatIntMap.getHighSpeedVideoFpsRangesFor(i4 >>> 7);
                long j = i4 & 127;
                int i5 = highSpeedVideoFpsRangesFor >> 3;
                int i6 = (highSpeedVideoFpsRangesFor & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                jArr3[i5] = j2;
                jArr3[(((highSpeedVideoFpsRangesFor - 7) & i2) + (i2 & 7)) >> 3] = j2;
                fArr2[highSpeedVideoFpsRangesFor] = f;
                iArr2[highSpeedVideoFpsRangesFor] = iArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableFloatIntMap = this;
            jArr2 = jArr;
        }
    }

    public final void putAll(androidx.collection.FloatIntMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        float[] fArr = from.keys;
        int[] iArr = from.values;
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
                        set(fArr[i4], iArr[i4]);
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

    public final void minusAssign(androidx.collection.FloatSet keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        float[] fArr = keys.elements;
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
                        remove(fArr[(i << 3) + i3]);
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

    public final void minusAssign(androidx.collection.FloatList keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        float[] fArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(fArr[i2]);
        }
    }

    private final int getHighSpeedVideoSizes(float p0) {
        int hashCode = java.lang.Float.hashCode(p0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2);
                if (this.Camera2StreamConfigurationMap == 0 && ((this.metadata[highSpeedVideoFpsRangesFor >> 3] >> ((highSpeedVideoFpsRangesFor & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2);
                }
                this._size++;
                int i9 = highSpeedVideoFpsRangesFor >> 3;
                int i10 = (highSpeedVideoFpsRangesFor & 7) << 3;
                this.Camera2StreamConfigurationMap -= ((this.metadata[i9] >> i10) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.metadata;
                int i11 = this._capacity;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((highSpeedVideoFpsRangesFor - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return ~highSpeedVideoFpsRangesFor;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public MutableFloatIntMap() {
        this(0, 1, null);
    }
}
