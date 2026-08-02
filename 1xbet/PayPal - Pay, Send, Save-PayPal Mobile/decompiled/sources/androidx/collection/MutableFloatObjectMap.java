package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001dH\u0086\n¢\u0006\u0004\b\u001b\u0010\u001eJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\fH\u0086\n¢\u0006\u0004\b\u001b\u0010\u001fJ\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020 H\u0086\n¢\u0006\u0004\b\u001b\u0010!J\u001e\u0010#\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\n¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b(\u0010$J\u0017\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u0000¢\u0006\u0004\b)\u0010,J-\u0010/\u001a\u00020\u00072\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0-H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u00018\u00002\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0003H\u0000¢\u0006\u0004\b5\u0010\u0006J \u00106\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010%\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0003¢\u0006\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableFloatObjectMap;", "V", "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "<init>", "(I)V", "", "adjustStorage$collection", "()V", "clear", "dropDeletes$collection", "", "p0", "Camera2StreamConfigurationMap", "(F)I", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "key", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Landroidx/collection/FloatList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "minusAssign", "(Landroidx/collection/FloatList;)V", "Landroidx/collection/FloatSet;", "(Landroidx/collection/FloatSet;)V", "(F)V", "", "([F)V", "from", "plusAssign", "(Landroidx/collection/FloatObjectMap;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(FLjava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(F)Ljava/lang/Object;", "", "(FLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "index", "removeValueAt", "(I)Ljava/lang/Object;", "newCapacity", "resizeStorage$collection", "set", "(FLjava/lang/Object;)V", "trim", "()I", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableFloatObjectMap<V> extends androidx.collection.FloatObjectMap<V> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ MutableFloatObjectMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableFloatObjectMap(int i) {
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
        this.keys = new float[max];
        this.values = new java.lang.Object[max];
    }

    private final void getHighSpeedVideoSizes(int p0) {
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

    public final V getOrPut(float key, kotlin.jvm.functions.Function0<? extends V> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        V v = get(key);
        if (v != null) {
            return v;
        }
        V invoke = defaultValue.invoke();
        set(key, invoke);
        return invoke;
    }

    public final void set(float key, V value) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(key);
        this.keys[Camera2StreamConfigurationMap] = key;
        this.values[Camera2StreamConfigurationMap] = value;
    }

    public final V put(float key, V value) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(key);
        V v = (V) this.values[Camera2StreamConfigurationMap];
        this.keys[Camera2StreamConfigurationMap] = key;
        this.values[Camera2StreamConfigurationMap] = value;
        return v;
    }

    public final void plusAssign(androidx.collection.FloatObjectMap<V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(float key) {
        int i;
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        int hashCode = java.lang.Float.hashCode(key) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = mutableFloatObjectMap._capacity;
        int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = mutableFloatObjectMap.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (mutableFloatObjectMap.keys[i] == key) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
        if (i >= 0) {
            return removeValueAt(i);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(float key, V value) {
        int i;
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        int hashCode = java.lang.Float.hashCode(key) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = mutableFloatObjectMap._capacity;
        int i3 = ((hashCode ^ (hashCode << 16)) >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = mutableFloatObjectMap.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = ((r2 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            int i7 = i4;
            long j3 = (~j2) & (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (mutableFloatObjectMap.keys[i] == key) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            int i8 = i7 + 8;
            i3 = (i3 + i8) & i2;
            i4 = i8;
        }
        if (i < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.values[i], value)) {
            return false;
        }
        removeValueAt(i);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, java.lang.Boolean> predicate) {
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
                        if (predicate.invoke(java.lang.Float.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
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

    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
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
        this.getHighSpeedVideoFpsRangesFor = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
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
        char c;
        int i;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        float[] fArr = this.keys;
        java.lang.Object[] objArr = this.values;
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
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i8);
                int i9 = i8 & i2;
                if (((highResolutionOutputSizeshNQ4ISI - i9) & i2) / 8 == ((i5 - i9) & i2) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (jArr[c2] & j2) | Long.MIN_VALUE;
                    i5++;
                } else {
                    int i10 = highResolutionOutputSizeshNQ4ISI >> 3;
                    long j4 = jArr[i10];
                    int i11 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                    if (((j4 >> i11) & 255) == 128) {
                        int i12 = i5;
                        jArr[i10] = ((~(255 << i11)) & j4) | ((r8 & 127) << i11);
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        fArr[highResolutionOutputSizeshNQ4ISI] = fArr[i12];
                        fArr[i12] = 0.0f;
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i12];
                        objArr[i12] = null;
                        i = i12;
                    } else {
                        int i13 = i5;
                        jArr[i10] = ((r8 & 127) << i11) | ((~(255 << i11)) & j4);
                        float f = fArr[highResolutionOutputSizeshNQ4ISI];
                        fArr[highResolutionOutputSizeshNQ4ISI] = fArr[i13];
                        fArr[i13] = f;
                        java.lang.Object obj = objArr[highResolutionOutputSizeshNQ4ISI];
                        objArr[highResolutionOutputSizeshNQ4ISI] = objArr[i13];
                        objArr[i13] = obj;
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
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        long[] jArr2 = mutableFloatObjectMap.metadata;
        float[] fArr = mutableFloatObjectMap.keys;
        java.lang.Object[] objArr = mutableFloatObjectMap.values;
        int i = mutableFloatObjectMap._capacity;
        getHighSpeedVideoFpsRanges(newCapacity);
        long[] jArr3 = mutableFloatObjectMap.metadata;
        float[] fArr2 = mutableFloatObjectMap.keys;
        java.lang.Object[] objArr2 = mutableFloatObjectMap.values;
        int i2 = mutableFloatObjectMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                float f = fArr[i3];
                int hashCode = java.lang.Float.hashCode(f) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int highResolutionOutputSizeshNQ4ISI = mutableFloatObjectMap.getHighResolutionOutputSizeshNQ4ISI(i4 >>> 7);
                long j = i4 & 127;
                int i5 = highResolutionOutputSizeshNQ4ISI >> 3;
                int i6 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                jArr3[i5] = j2;
                jArr3[(((highResolutionOutputSizeshNQ4ISI - 7) & i2) + (i2 & 7)) >> 3] = j2;
                fArr2[highResolutionOutputSizeshNQ4ISI] = f;
                objArr2[highResolutionOutputSizeshNQ4ISI] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableFloatObjectMap = this;
            jArr2 = jArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(androidx.collection.FloatObjectMap<V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        float[] fArr = from.keys;
        java.lang.Object[] objArr = from.values;
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
                        set(fArr[i4], objArr[i4]);
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

    private final int Camera2StreamConfigurationMap(float p0) {
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
                int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                if (this.getHighSpeedVideoFpsRangesFor == 0 && ((this.metadata[highResolutionOutputSizeshNQ4ISI >> 3] >> ((highResolutionOutputSizeshNQ4ISI & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i2);
                }
                this._size++;
                int i9 = highResolutionOutputSizeshNQ4ISI >> 3;
                int i10 = (highResolutionOutputSizeshNQ4ISI & 7) << 3;
                this.getHighSpeedVideoFpsRangesFor -= ((this.metadata[i9] >> i10) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.metadata;
                int i11 = this._capacity;
                long j5 = ((~(255 << i10)) & jArr2[i9]) | (j2 << i10);
                jArr2[i9] = j5;
                jArr2[(((highResolutionOutputSizeshNQ4ISI - 7) & i11) + (i11 & 7)) >> 3] = j5;
                return highResolutionOutputSizeshNQ4ISI;
            }
            i5 = i8 + 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }
}
