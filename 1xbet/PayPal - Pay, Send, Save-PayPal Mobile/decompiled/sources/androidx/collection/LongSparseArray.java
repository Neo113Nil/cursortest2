package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\fJ\u001f\u0010'\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0017J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010\u0006J!\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010\u001bJ'\u0010-\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u00100J\u001f\u00101\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u00103\u001a\u00020\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b3\u0010?R\u001e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0@8\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bB\u0010C"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "", "initialCapacity", "<init>", "(I)V", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "append", "(JLjava/lang/Object;)V", "clear", "()V", "clone", "()Landroidx/collection/LongSparseArray;", "", "containsKey", "(J)Z", "containsValue", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(J)V", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "(J)I", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "index", "keyAt", "(I)J", "put", "other", "putAll", "(Landroidx/collection/LongSparseArray;)V", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", io.ktor.http.ContentDisposition.Parameters.Size, "()I", "", "toString", "()Ljava/lang/String;", "valueAt", "(I)Ljava/lang/Object;", "garbage", "Z", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "[J", com.visa.cbp.getEncExpo.warmup, "", "", "values", "[Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class LongSparseArray<E> implements java.lang.Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ java.lang.Object[] values;

    public LongSparseArray(int i) {
        if (i == 0) {
            this.keys = androidx.collection.internal.ContainerHelpersKt.EMPTY_LONGS;
            this.values = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(i);
            this.keys = new long[idealLongArraySize];
            this.values = new java.lang.Object[idealLongArraySize];
        }
    }

    public /* synthetic */ LongSparseArray(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.collection.LongSparseArray<E> m1091clone() {
        java.lang.Object clone = super.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "");
        androidx.collection.LongSparseArray<E> longSparseArray = (androidx.collection.LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (java.lang.Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public E get(long key, E defaultValue) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        return (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) ? defaultValue : (E) this.values[binarySearch];
    }

    @kotlin.Deprecated(message = "Alias for `remove(key)`.", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
            return;
        }
        this.values[binarySearch] = androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap;
        this.garbage = true;
    }

    public void remove(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
            return;
        }
        this.values[binarySearch] = androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap;
        this.garbage = true;
    }

    public boolean remove(long key, E value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(value, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAt(int index) {
        if (this.values[index] != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
            this.values[index] = androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap;
            this.garbage = true;
        }
    }

    public E replace(long key, E value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.values;
        E e = (E) objArr[indexOfKey];
        objArr[indexOfKey] = value;
        return e;
    }

    public boolean replace(long key, E oldValue, E newValue) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.values[indexOfKey], oldValue)) {
            return false;
        }
        this.values[indexOfKey] = newValue;
        return true;
    }

    public void put(long key, E value) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch >= 0) {
            this.values[binarySearch] = value;
            return;
        }
        int i = ~binarySearch;
        if (i < this.size && this.values[i] == androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage) {
            int i2 = this.size;
            long[] jArr = this.keys;
            if (i2 >= jArr.length) {
                java.lang.Object[] objArr = this.values;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    java.lang.Object obj = objArr[i4];
                    if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.garbage = false;
                this.size = i3;
                i = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, i3, key);
            }
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int idealLongArraySize = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(i5 + 1);
            long[] copyOf = java.util.Arrays.copyOf(this.keys, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.values = copyOf2;
        }
        int i6 = this.size;
        if (i6 - i != 0) {
            long[] jArr2 = this.keys;
            int i7 = i + 1;
            kotlin.collections.ArraysKt.copyInto(jArr2, jArr2, i7, i, i6);
            java.lang.Object[] objArr2 = this.values;
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, i7, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public void putAll(androidx.collection.LongSparseArray<? extends E> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            put(other.keyAt(i), other.valueAt(i));
        }
    }

    public E putIfAbsent(long key, E value) {
        E e = get(key);
        if (e == null) {
            put(key, value);
        }
        return e;
    }

    public int size() {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int index) {
        if (index < 0 || index >= this.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return this.keys[index];
    }

    public E valueAt(int index) {
        if (index < 0 || index >= this.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return (E) this.values[index];
    }

    public void setValueAt(int index, E value) {
        if (index < 0 || index >= this.size) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(java.lang.String.valueOf(index)));
        }
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        this.values[index] = value;
    }

    public int indexOfKey(long key) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        return androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    }

    public int indexOfValue(E value) {
        if (this.garbage) {
            int i = this.size;
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.garbage = false;
            this.size = i2;
        }
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.values[i5] == value) {
                return i5;
            }
        }
        return -1;
    }

    public boolean containsKey(long key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(E value) {
        return indexOfValue(value) >= 0;
    }

    public void clear() {
        int i = this.size;
        java.lang.Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(long key, E value) {
        int i = this.size;
        if (i != 0 && key <= this.keys[i - 1]) {
            put(key, value);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i >= jArr.length) {
                java.lang.Object[] objArr = this.values;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    java.lang.Object obj = objArr[i3];
                    if (obj != androidx.collection.LongSparseArrayKt.Camera2StreamConfigurationMap) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.garbage = false;
                this.size = i2;
            }
        }
        int i4 = this.size;
        if (i4 >= this.keys.length) {
            int idealLongArraySize = androidx.collection.internal.ContainerHelpersKt.idealLongArraySize(i4 + 1);
            long[] copyOf = java.util.Arrays.copyOf(this.keys, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.values = copyOf2;
        }
        this.keys[i4] = key;
        this.values[i4] = value;
        this.size = i4 + 1;
    }

    public java.lang.String toString() {
        if (size() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.size * 28);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E valueAt = valueAt(i2);
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

    public LongSparseArray() {
        this(0, 1, null);
    }
}
