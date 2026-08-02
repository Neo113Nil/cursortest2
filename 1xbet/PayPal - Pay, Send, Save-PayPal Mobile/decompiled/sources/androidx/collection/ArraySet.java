package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001IB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bB\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0014\u0010\u0006J\u001d\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u001d\u0010\u001a\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u0012J\u001d\u0010+\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000¢\u0006\u0004\b+\u0010,J\u001d\u0010+\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b+\u0010\u0016J\u0015\u0010.\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b0\u0010\u0016J\u0015\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\t¢\u0006\u0004\b1\u00102J'\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u001032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b1\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\f¢\u0006\u0004\b8\u0010/R\"\u00109\u001a\u00020\f8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010!\"\u0004\b<\u0010\u000eR*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010=\u001a\u0004\b>\u00102\"\u0004\b?\u0010\u000bR\"\u0010A\u001a\u00020@8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010!"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "set", "<init>", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "", "array", "([Ljava/lang/Object;)V", "", "capacity", "(I)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "addAll", "elements", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "minimumCapacity", "ensureCapacity", "", "other", "equals", "hashCode", "()I", "key", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "(Landroidx/collection/ArraySet;)Z", "index", "removeAt", "(I)Ljava/lang/Object;", "retainAll", "toArray", "()[Ljava/lang/Object;", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "valueAt", "_size", com.visa.cbp.getEncExpo.warmup, "get_size$collection", "set_size$collection", "[Ljava/lang/Object;", "getArray$collection", "setArray$collection", "", "hashes", "[I", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "ElementIterator"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E>, kotlin.jvm.internal.markers.KMutableCollection, kotlin.jvm.internal.markers.KMutableSet {
    private int _size;
    private java.lang.Object[] array;
    private int[] hashes;

    public ArraySet(int i) {
        this.hashes = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS;
        this.array = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        if (i > 0) {
            androidx.collection.ArraySetKt.allocArrays(this, i);
        }
    }

    public /* synthetic */ ArraySet(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return get_size();
    }

    /* renamed from: getHashes$collection, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final void setHashes$collection(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.hashes = iArr;
    }

    /* renamed from: getArray$collection, reason: from getter */
    public final java.lang.Object[] getArray() {
        return this.array;
    }

    public final void setArray$collection(java.lang.Object[] objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        this.array = objArr;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public ArraySet(androidx.collection.ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((androidx.collection.ArraySet) arraySet);
        }
    }

    public ArraySet(java.util.Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(E[] eArr) {
        this(0);
        if (eArr != null) {
            java.util.Iterator it = kotlin.jvm.internal.ArrayIteratorKt.iterator(eArr);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return kotlin.collections.ArraysKt.copyOfRange(this.array, 0, this._size);
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        T[] tArr = (T[]) androidx.collection.ArraySetJvmUtil.getHighSpeedVideoFpsRanges(array, this._size);
        kotlin.collections.ArraysKt.copyInto(this.array, tArr, 0, 0, this._size);
        kotlin.jvm.internal.Intrinsics.checkNotNull(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return new androidx.collection.ArraySet.ElementIterator();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "<init>", "(Landroidx/collection/ArraySet;)V", "", "p0", "elementAt", "(I)Ljava/lang/Object;", "", "removeAt", "(I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    final class ElementIterator extends androidx.collection.IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(androidx.collection.ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final E elementAt(int p0) {
            return androidx.collection.ArraySet.this.valueAt(p0);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected final void removeAt(int p0) {
            androidx.collection.ArraySet.this.removeAt(p0);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int minimumCapacity) {
        int i = get_size$collection();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            java.lang.Object[] array = getArray();
            androidx.collection.ArraySetKt.allocArrays(this, minimumCapacity);
            if (get_size$collection() > 0) {
                kotlin.collections.ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, get_size$collection(), 6, (java.lang.Object) null);
                kotlin.collections.ArraysKt.copyInto$default(array, getArray(), 0, 0, get_size$collection(), 6, (java.lang.Object) null);
            }
        }
        if (get_size$collection() != i) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object element) {
        return indexOf(element) >= 0;
    }

    public final int indexOf(java.lang.Object key) {
        return key == null ? androidx.collection.ArraySetKt.indexOfNull(this) : androidx.collection.ArraySetKt.indexOf(this, key, key.hashCode());
    }

    public final E valueAt(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E element) {
        int i;
        int indexOf;
        int i2 = get_size$collection();
        if (element == null) {
            indexOf = androidx.collection.ArraySetKt.indexOfNull(this);
            i = 0;
        } else {
            int hashCode = element.hashCode();
            i = hashCode;
            indexOf = androidx.collection.ArraySetKt.indexOf(this, element, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i3 = ~indexOf;
        if (i2 >= getHashes().length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            int[] hashes = getHashes();
            java.lang.Object[] array = getArray();
            androidx.collection.ArraySetKt.allocArrays(this, i4);
            if (i2 != get_size$collection()) {
                throw new java.util.ConcurrentModificationException();
            }
            if (getHashes().length != 0) {
                kotlin.collections.ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, hashes.length, 6, (java.lang.Object) null);
                kotlin.collections.ArraysKt.copyInto$default(array, getArray(), 0, 0, array.length, 6, (java.lang.Object) null);
            }
        }
        if (i3 < i2) {
            int i5 = i3 + 1;
            kotlin.collections.ArraysKt.copyInto(getHashes(), getHashes(), i5, i3, i2);
            kotlin.collections.ArraysKt.copyInto(getArray(), getArray(), i5, i3, i2);
        }
        if (i2 != get_size$collection() || i3 >= getHashes().length) {
            throw new java.util.ConcurrentModificationException();
        }
        getHashes()[i3] = i;
        getArray()[i3] = element;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(androidx.collection.ArraySet<? extends E> array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        int i = array.get_size$collection();
        ensureCapacity(get_size$collection() + i);
        if (get_size$collection() != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(array.valueAt(i2));
            }
            return;
        }
        if (i > 0) {
            kotlin.collections.ArraysKt.copyInto$default(array.getHashes(), getHashes(), 0, 0, i, 6, (java.lang.Object) null);
            kotlin.collections.ArraysKt.copyInto$default(array.getArray(), getArray(), 0, 0, i, 6, (java.lang.Object) null);
            if (get_size$collection() != 0) {
                throw new java.util.ConcurrentModificationException();
            }
            set_size$collection(i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final E removeAt(int index) {
        int i = get_size$collection();
        E e = (E) getArray()[index];
        if (i <= 1) {
            clear();
            return e;
        }
        int i2 = i - 1;
        if (getHashes().length > 8 && get_size$collection() < getHashes().length / 3) {
            int i3 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes = getHashes();
            java.lang.Object[] array = getArray();
            androidx.collection.ArraySetKt.allocArrays(this, i3);
            if (index > 0) {
                kotlin.collections.ArraysKt.copyInto$default(hashes, getHashes(), 0, 0, index, 6, (java.lang.Object) null);
                kotlin.collections.ArraysKt.copyInto$default(array, getArray(), 0, 0, index, 6, (java.lang.Object) null);
            }
            if (index < i2) {
                int i4 = index + 1;
                kotlin.collections.ArraysKt.copyInto(hashes, getHashes(), index, i4, i);
                kotlin.collections.ArraysKt.copyInto(array, getArray(), index, i4, i);
            }
        } else {
            if (index < i2) {
                int i5 = index + 1;
                kotlin.collections.ArraysKt.copyInto(getHashes(), getHashes(), index, i5, i);
                kotlin.collections.ArraysKt.copyInto(getArray(), getArray(), index, i5, i);
            }
            getArray()[i2] = null;
        }
        if (i != get_size$collection()) {
            throw new java.util.ConcurrentModificationException();
        }
        set_size$collection(i2);
        return e;
    }

    public final boolean removeAll(androidx.collection.ArraySet<? extends E> array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        int i = array.get_size$collection();
        int i2 = get_size$collection();
        for (int i3 = 0; i3 < i; i3++) {
            remove(array.valueAt(i3));
        }
        return i2 != get_size$collection();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof java.util.Set) || size() != ((java.util.Set) other).size()) {
            return false;
        }
        try {
            int i = get_size$collection();
            for (int i2 = 0; i2 < i; i2++) {
                if (!((java.util.Set) other).contains(valueAt(i2))) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] hashes = getHashes();
        int i = get_size$collection();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += hashes[i3];
        }
        return i2;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(get_size$collection() * 14);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        int i = get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E valueAt = valueAt(i2);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends java.lang.Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        ensureCapacity(get_size$collection() + elements.size());
        java.util.Iterator<? extends E> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends java.lang.Object> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        boolean z = false;
        for (int i = get_size$collection() - 1; i >= 0; i--) {
            if (!kotlin.collections.CollectionsKt.contains(elements, getArray()[i])) {
                removeAt(i);
                z = true;
            }
        }
        return z;
    }

    public ArraySet() {
        this(0, 1, null);
    }
}
