package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0015\u0010\u0006J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u000bJ\u001f\u0010$\u001a\u00020\t2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010\u0006J!\u0010'\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b'\u0010)J\u0017\u0010*\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010\u0006J\u001f\u0010,\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\u0019J'\u0010.\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010/\u001a\u00028\u00002\u0006\u00100\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u00101J\u001f\u00102\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010\u000bJ\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b7\u0010\u0017R\u0016\u00108\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0011\u0010\u001e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b:\u0010\u001fR\u0016\u0010<\u001a\u00020;8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010+\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010>R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0?8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Landroidx/collection/SparseArrayCompat;", "E", "", "", "initialCapacity", "<init>", "(I)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "append", "(ILjava/lang/Object;)V", "clear", "()V", "clone", "()Landroidx/collection/SparseArrayCompat;", "", "containsKey", "(I)Z", "containsValue", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "get", "(I)Ljava/lang/Object;", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "(I)I", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "index", "keyAt", "put", "other", "putAll", "(Landroidx/collection/SparseArrayCompat;)V", "putIfAbsent", "remove", "", "(ILjava/lang/Object;)Z", "removeAt", io.ktor.http.ContentDisposition.Parameters.Size, "removeAtRange", "(II)V", "replace", "oldValue", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "()I", "", "toString", "()Ljava/lang/String;", "valueAt", "garbage", "Z", "getIsEmpty", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "[I", com.visa.cbp.getEncExpo.warmup, "", "values", "[Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements java.lang.Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ java.lang.Object[] values;

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS;
            this.values = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i);
            this.keys = new int[idealIntArraySize];
            this.values = new java.lang.Object[idealIntArraySize];
        }
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public androidx.collection.SparseArrayCompat<E> m1092clone() {
        java.lang.Object clone = super.clone();
        kotlin.jvm.internal.Intrinsics.checkNotNull(clone, "");
        androidx.collection.SparseArrayCompat<E> sparseArrayCompat = (androidx.collection.SparseArrayCompat) clone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (java.lang.Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int key) {
        return (E) androidx.collection.SparseArrayCompatKt.commonGet(this, key);
    }

    public E get(int key, E defaultValue) {
        return (E) androidx.collection.SparseArrayCompatKt.commonGet(this, key, defaultValue);
    }

    @kotlin.Deprecated(message = "Alias for remove(int).", replaceWith = @kotlin.ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int key) {
        remove(key);
    }

    public void remove(int key) {
        androidx.collection.SparseArrayCompatKt.commonRemove(this, key);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public boolean remove(int key, java.lang.Object value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(value, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public void removeAt(int index) {
        if (this.values[index] != androidx.collection.SparseArrayCompatKt.getHighSpeedVideoFpsRangesFor) {
            this.values[index] = androidx.collection.SparseArrayCompatKt.getHighSpeedVideoFpsRangesFor;
            this.garbage = true;
        }
    }

    public void removeAtRange(int index, int size) {
        int min = java.lang.Math.min(size, index + size);
        while (index < min) {
            removeAt(index);
            index++;
        }
    }

    public E replace(int key, E value) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.values;
        E e = (E) objArr[indexOfKey];
        objArr[indexOfKey] = value;
        return e;
    }

    public boolean replace(int key, E oldValue, E newValue) {
        int indexOfKey = indexOfKey(key);
        if (indexOfKey < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.values[indexOfKey], oldValue)) {
            return false;
        }
        this.values[indexOfKey] = newValue;
        return true;
    }

    public void put(int key, E value) {
        int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (binarySearch >= 0) {
            this.values[binarySearch] = value;
            return;
        }
        int i = ~binarySearch;
        if (i < this.size && this.values[i] == androidx.collection.SparseArrayCompatKt.getHighSpeedVideoFpsRangesFor) {
            this.keys[i] = key;
            this.values[i] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
            i = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i2 + 1);
            int[] copyOf = java.util.Arrays.copyOf(this.keys, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.values = copyOf2;
        }
        int i3 = this.size;
        if (i3 - i != 0) {
            int[] iArr = this.keys;
            int i4 = i + 1;
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, i4, i, i3);
            java.lang.Object[] objArr = this.values;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, i4, i, this.size);
        }
        this.keys[i] = key;
        this.values[i] = value;
        this.size++;
    }

    public void putAll(androidx.collection.SparseArrayCompat<? extends E> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int keyAt = other.keyAt(i);
            E valueAt = other.valueAt(i);
            int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
            if (binarySearch >= 0) {
                this.values[binarySearch] = valueAt;
            } else {
                int i2 = ~binarySearch;
                if (i2 < this.size && this.values[i2] == androidx.collection.SparseArrayCompatKt.getHighSpeedVideoFpsRangesFor) {
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
                        i2 = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, keyAt);
                    }
                    int i3 = this.size;
                    if (i3 >= this.keys.length) {
                        int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] copyOf = java.util.Arrays.copyOf(this.keys, idealIntArraySize);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                        this.keys = copyOf;
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealIntArraySize);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                        this.values = copyOf2;
                    }
                    int i4 = this.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.keys;
                        int i5 = i2 + 1;
                        kotlin.collections.ArraysKt.copyInto(iArr, iArr, i5, i2, i4);
                        java.lang.Object[] objArr = this.values;
                        kotlin.collections.ArraysKt.copyInto(objArr, objArr, i5, i2, this.size);
                    }
                    this.keys[i2] = keyAt;
                    this.values[i2] = valueAt;
                    this.size++;
                }
            }
        }
    }

    public E putIfAbsent(int key, E value) {
        E e = (E) androidx.collection.SparseArrayCompatKt.commonGet(this, key);
        if (e == null) {
            int binarySearch = androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
            if (binarySearch >= 0) {
                this.values[binarySearch] = value;
                return e;
            }
            int i = ~binarySearch;
            if (i < this.size && this.values[i] == androidx.collection.SparseArrayCompatKt.getHighSpeedVideoFpsRangesFor) {
                this.keys[i] = key;
                this.values[i] = value;
                return e;
            }
            if (this.garbage && this.size >= this.keys.length) {
                androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
                i = ~androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
            }
            int i2 = this.size;
            if (i2 >= this.keys.length) {
                int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i2 + 1);
                int[] copyOf = java.util.Arrays.copyOf(this.keys, idealIntArraySize);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                this.keys = copyOf;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealIntArraySize);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                this.values = copyOf2;
            }
            int i3 = this.size;
            if (i3 - i != 0) {
                int[] iArr = this.keys;
                int i4 = i + 1;
                kotlin.collections.ArraysKt.copyInto(iArr, iArr, i4, i, i3);
                java.lang.Object[] objArr = this.values;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i4, i, this.size);
            }
            this.keys[i] = key;
            this.values[i] = value;
            this.size++;
        }
        return e;
    }

    public int size() {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int index) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        return this.keys[index];
    }

    public E valueAt(int index) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        java.lang.Object[] objArr = this.values;
        if (index >= objArr.length) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return (E) objArr[index];
    }

    public void setValueAt(int index, E value) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        this.values[index] = value;
    }

    public int indexOfKey(int key) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        return androidx.collection.internal.ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    }

    public int indexOfValue(E value) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public boolean containsKey(int key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(E value) {
        if (this.garbage) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        int i = this.size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (this.values[i2] != value) {
                i2++;
            } else if (i2 >= 0) {
                return true;
            }
        }
        return false;
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

    public void append(int key, E value) {
        int i = this.size;
        if (i != 0 && key <= this.keys[i - 1]) {
            put(key, value);
            return;
        }
        if (this.garbage && i >= this.keys.length) {
            androidx.collection.SparseArrayCompatKt.getHighSpeedVideoSizes(this);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int idealIntArraySize = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(i2 + 1);
            int[] copyOf = java.util.Arrays.copyOf(this.keys, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.keys = copyOf;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.values, idealIntArraySize);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            this.values = copyOf2;
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size = i2 + 1;
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
            if (valueAt != this) {
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

    public SparseArrayCompat() {
        this(0, 1, null);
    }
}
