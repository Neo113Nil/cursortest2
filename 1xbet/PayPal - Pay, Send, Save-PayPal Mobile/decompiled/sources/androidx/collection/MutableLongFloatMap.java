package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ)\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\n¢\u0006\u0004\b\u001a\u0010\u001dJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b\u001a\u0010\u001eJ\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001fH\u0086\n¢\u0006\u0004\b\u001a\u0010 J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J%\u0010%\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012¢\u0006\u0004\b%\u0010(J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0001¢\u0006\u0004\b)\u0010#J\u0015\u0010*\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b*\u0010\u001eJ\u001d\u0010*\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0012¢\u0006\u0004\b*\u0010,J-\u0010/\u001a\u00020\u00062\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020+0-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0002H\u0000¢\u0006\u0004\b2\u0010\u0005J\u0017\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u0010\u0005J \u00105\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b5\u0010&J\r\u00106\u001a\u00020\u0002¢\u0006\u0004\b6\u00107R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00108\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableLongFloatMap;", "Landroidx/collection/LongFloatMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "clear", "dropDeletes$collection", "p0", "getHighSpeedVideoSizes", "(I)I", "", "(J)I", "key", "Lkotlin/Function0;", "", "defaultValue", "getOrPut", "(JLkotlin/jvm/functions/Function0;)F", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/collection/LongList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "minusAssign", "(Landroidx/collection/LongList;)V", "Landroidx/collection/LongSet;", "(Landroidx/collection/LongSet;)V", "(J)V", "", "([J)V", "from", "plusAssign", "(Landroidx/collection/LongFloatMap;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(JF)V", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "(JFF)F", "putAll", "remove", "", "(JF)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "newCapacity", "resizeStorage$collection", "set", "trim", "()I", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableLongFloatMap extends androidx.collection.LongFloatMap {
    private int getHighSpeedVideoFpsRangesFor;

    public MutableLongFloatMap(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        getHighSpeedVideoFpsRanges(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    public /* synthetic */ MutableLongFloatMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final void getHighSpeedVideoFpsRanges(int p0) {
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        getHighSpeedVideoFpsRangesFor(max);
        this.keys = new long[max];
        this.values = new float[max];
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
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final float getOrPut(long key, kotlin.jvm.functions.Function0<java.lang.Float> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            float floatValue = defaultValue.invoke().floatValue();
            put(key, floatValue);
            return floatValue;
        }
        return this.values[findKeyIndex];
    }

    public final void set(long key, float value) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(key);
        if (highSpeedVideoSizes < 0) {
            highSpeedVideoSizes = ~highSpeedVideoSizes;
        }
        this.keys[highSpeedVideoSizes] = key;
        this.values[highSpeedVideoSizes] = value;
    }

    public final void put(long key, float value) {
        set(key, value);
    }

    public final float put(long key, float value, float r6) {
        int highSpeedVideoSizes = getHighSpeedVideoSizes(key);
        if (highSpeedVideoSizes < 0) {
            highSpeedVideoSizes = ~highSpeedVideoSizes;
        } else {
            r6 = this.values[highSpeedVideoSizes];
        }
        this.keys[highSpeedVideoSizes] = key;
        this.values[highSpeedVideoSizes] = value;
        return r6;
    }

    public final void plusAssign(androidx.collection.LongFloatMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void remove(long key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final boolean remove(long key, float value) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != value) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, java.lang.Boolean> predicate) {
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
                        if (predicate.invoke(java.lang.Long.valueOf(this.keys[i4]), java.lang.Float.valueOf(this.values[i4])).booleanValue()) {
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

    public final void minusAssign(long key) {
        remove(key);
    }

    public final void minusAssign(long[] keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        for (long j : keys) {
            remove(j);
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
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
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
        long[] jArr2 = this.keys;
        float[] fArr = this.values;
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
                int hashCode = java.lang.Long.hashCode(jArr2[i5]) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                        jArr2[highSpeedVideoSizes] = jArr2[i12];
                        jArr2[i12] = 0;
                        fArr[highSpeedVideoSizes] = fArr[i12];
                        fArr[i12] = 0.0f;
                        i = i12;
                    } else {
                        int i13 = i5;
                        jArr[i10] = ((r8 & 127) << i11) | ((~(255 << i11)) & j4);
                        long j5 = jArr2[highSpeedVideoSizes];
                        jArr2[highSpeedVideoSizes] = jArr2[i13];
                        jArr2[i13] = j5;
                        float f = fArr[highSpeedVideoSizes];
                        fArr[highSpeedVideoSizes] = fArr[i13];
                        fArr[i13] = f;
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
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        androidx.collection.MutableLongFloatMap mutableLongFloatMap = this;
        long[] jArr2 = mutableLongFloatMap.metadata;
        long[] jArr3 = mutableLongFloatMap.keys;
        float[] fArr = mutableLongFloatMap.values;
        int i = mutableLongFloatMap._capacity;
        getHighSpeedVideoFpsRanges(newCapacity);
        long[] jArr4 = mutableLongFloatMap.metadata;
        long[] jArr5 = mutableLongFloatMap.keys;
        float[] fArr2 = mutableLongFloatMap.values;
        int i2 = mutableLongFloatMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int hashCode = java.lang.Long.hashCode(j) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int highSpeedVideoSizes = mutableLongFloatMap.getHighSpeedVideoSizes(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = highSpeedVideoSizes >> 3;
                int i6 = (highSpeedVideoSizes & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i5] & (~(255 << i6))) | (j2 << i6);
                jArr4[i5] = j3;
                jArr4[(((highSpeedVideoSizes - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr5[highSpeedVideoSizes] = j;
                fArr2[highSpeedVideoSizes] = fArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableLongFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void putAll(androidx.collection.LongFloatMap from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        long[] jArr = from.keys;
        float[] fArr = from.values;
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
                        set(jArr[i4], fArr[i4]);
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

    public final void minusAssign(androidx.collection.LongSet keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
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
                        remove(jArr[(i << 3) + i3]);
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

    public final void minusAssign(androidx.collection.LongList keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        long[] jArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    private final int getHighSpeedVideoSizes(long p0) {
        int hashCode = java.lang.Long.hashCode(p0) * androidx.collection.ScatterMapKt.MurmurHashC1;
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
                if (this.getHighSpeedVideoFpsRangesFor == 0 && ((this.metadata[highSpeedVideoSizes >> 3] >> ((highSpeedVideoSizes & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
                }
                this._size++;
                int i9 = highSpeedVideoSizes >> 3;
                int i10 = (highSpeedVideoSizes & 7) << 3;
                this.getHighSpeedVideoFpsRangesFor -= ((this.metadata[i9] >> i10) & 255) == 128 ? 1 : 0;
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

    public MutableLongFloatMap() {
        this(0, 1, null);
    }
}
