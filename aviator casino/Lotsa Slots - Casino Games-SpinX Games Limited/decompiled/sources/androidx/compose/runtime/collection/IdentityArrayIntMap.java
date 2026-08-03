package androidx.compose.runtime.collection;

/* compiled from: IdentityArrayIntMap.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\tJ#\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bJ\u0012\u0010\u0018\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\tH\u0002J#\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bJ\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0001J#\u0010!\u001a\u00020\u001d2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bR0\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "()V", "<set-?>", "", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "getKeys", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "", "size", "getSize", "()I", "", "values", "getValues", "()[I", "add", com.ironsource.X3.i.W, "value", "any", "", "predicate", "Lkotlin/Function2;", "find", "findExactIndex", "midIndex", "valueHash", "forEach", "", "block", "get", "remove", "removeValueIf", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {
    public static final int $stable = 8;
    private int size;
    private java.lang.Object[] keys = new java.lang.Object[4];
    private int[] values = new int[4];

    public final int getSize() {
        return this.size;
    }

    public final java.lang.Object[] getKeys() {
        return this.keys;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final int get(java.lang.Object key) {
        int find = find(key);
        if (find >= 0) {
            return this.values[find];
        }
        throw new java.lang.IllegalStateException("Key not found".toString());
    }

    public final int add(java.lang.Object key, int value) {
        int i;
        int i2;
        int[] iArr = this.values;
        if (this.size > 0) {
            i = find(key);
            if (i >= 0) {
                int i3 = iArr[i];
                iArr[i] = value;
                return i3;
            }
        } else {
            i = -1;
        }
        int i4 = -(i + 1);
        java.lang.Object[] objArr = this.keys;
        int i5 = this.size;
        if (i5 == objArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i6 = i4 + 1;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr2, i6, i4, i5);
            kotlin.collections.ArraysKt.copyInto(iArr, iArr2, i6, i4, i5);
            i2 = i4;
            kotlin.collections.ArraysKt.copyInto$default(objArr, objArr2, 0, 0, i2, 6, (java.lang.Object) null);
            kotlin.collections.ArraysKt.copyInto$default(iArr, iArr2, 0, 0, i4, 6, (java.lang.Object) null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            i2 = i4;
            int i7 = i2 + 1;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, i7, i2, i5);
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, i7, i2, i5);
        }
        this.keys[i2] = key;
        this.values[i2] = value;
        this.size++;
        return -1;
    }

    public final boolean remove(java.lang.Object key) {
        int find = find(key);
        java.lang.Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i = this.size;
        if (find < 0) {
            return false;
        }
        int i2 = i - 1;
        if (find < i2) {
            int i3 = find + 1;
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, find, i3, i);
            kotlin.collections.ArraysKt.copyInto(iArr, iArr, find, i3, i);
        }
        objArr[i2] = null;
        this.size = i2;
        return true;
    }

    public final void removeValueIf(kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, java.lang.Boolean> predicate) {
        java.lang.Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = keys[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            int i3 = values[i2];
            if (!predicate.invoke(obj, java.lang.Integer.valueOf(i3)).booleanValue()) {
                if (i != i2) {
                    keys[i] = obj;
                    values[i] = i3;
                }
                i++;
            }
        }
        for (int i4 = i; i4 < size; i4++) {
            keys[i4] = null;
        }
        this.size = i;
    }

    public final boolean any(kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, java.lang.Boolean> predicate) {
        java.lang.Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = keys[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            if (predicate.invoke(obj, java.lang.Integer.valueOf(values[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(kotlin.jvm.functions.Function2<java.lang.Object, ? super java.lang.Integer, kotlin.Unit> block) {
        java.lang.Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = keys[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, java.lang.Integer.valueOf(values[i]));
        }
    }

    private final int find(java.lang.Object key) {
        int i = this.size - 1;
        int identityHashCode = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(key);
        java.lang.Object[] objArr = this.keys;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            java.lang.Object obj = objArr[i3];
            int identityHashCode2 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(obj);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    return obj == key ? i3 : findExactIndex(i3, key, identityHashCode);
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int midIndex, java.lang.Object value, int valueHash) {
        java.lang.Object obj;
        java.lang.Object[] objArr = this.keys;
        int i = this.size;
        for (int i2 = midIndex - 1; -1 < i2; i2--) {
            java.lang.Object obj2 = objArr[i2];
            if (obj2 == value) {
                return i2;
            }
            if (androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(obj2) != valueHash) {
                break;
            }
        }
        do {
            midIndex++;
            if (midIndex >= i) {
                return -(i + 1);
            }
            obj = objArr[midIndex];
            if (obj == value) {
                return midIndex;
            }
        } while (androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(obj) == valueHash);
        return -(midIndex + 1);
    }
}
