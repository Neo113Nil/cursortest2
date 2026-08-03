package androidx.collection;

/* compiled from: LongSparseArray.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010&\u001a\u00020\u00102\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001f\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ%\u0010,\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\u001d\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0002\u00105R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u00066"}, d2 = {"Landroidx/collection/LongSparseArray;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "initialCapacity", "", "(I)V", "garbage", "", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", com.ironsource.X3.i.W, "", "value", "(JLjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "put", "putAll", "other", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", "toString", "", "valueAt", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class LongSparseArray<E> implements java.lang.Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ java.lang.Object[] values;

    public LongSparseArray() {
        this(0, 1, null);
    }

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
    public androidx.collection.LongSparseArray<E> m34clone() {
        java.lang.Object clone = super.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        androidx.collection.LongSparseArray<E> longSparseArray = (androidx.collection.LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (java.lang.Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public E get(long key, E defaultValue) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        return (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.DELETED) ? defaultValue : (E) this.values[binarySearch];
    }

    @kotlin.Deprecated(message = "Alias for `remove(key)`.", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[binarySearch] = androidx.collection.LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void remove(long key) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch < 0 || this.values[binarySearch] == androidx.collection.LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[binarySearch] = androidx.collection.LongSparseArrayKt.DELETED;
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
        if (this.values[index] != androidx.collection.LongSparseArrayKt.DELETED) {
            this.values[index] = androidx.collection.LongSparseArrayKt.DELETED;
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
        if (i < this.size && this.values[i] == androidx.collection.LongSparseArrayKt.DELETED) {
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
                    if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
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
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
        int i;
        if (index < 0 || index >= (i = this.size)) {
            throw new java.lang.IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
        int i;
        if (index < 0 || index >= (i = this.size)) {
            throw new java.lang.IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
        int i;
        if (index < 0 || index >= (i = this.size)) {
            throw new java.lang.IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            java.lang.Object[] objArr = this.values;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object obj = objArr[i3];
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
                if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
                    if (obj != androidx.collection.LongSparseArrayKt.DELETED) {
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
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealLongArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
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
            sb.append(com.ironsource.B5.U);
            E valueAt = valueAt(i2);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
