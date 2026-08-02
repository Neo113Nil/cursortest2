package kotlin.collections;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004#$%\"B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001f"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "SubList", "IteratorImpl", "ListIteratorImpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractList<E> extends kotlin.collections.AbstractCollection<E> implements java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.collections.AbstractList.Companion INSTANCE = new kotlin.collections.AbstractList.Companion(null);

    public abstract E get(int index);

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public abstract int getGetHighSpeedVideoFpsRangesFor();

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return new kotlin.collections.AbstractList.IteratorImpl();
    }

    public int indexOf(java.lang.Object element) {
        java.util.Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(it.next(), element)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int lastIndexOf(java.lang.Object element) {
        kotlin.collections.AbstractList<E> abstractList = this;
        java.util.ListIterator<E> listIterator = abstractList.listIterator(abstractList.size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public java.util.ListIterator<E> listIterator() {
        return new kotlin.collections.AbstractList.ListIteratorImpl(0);
    }

    public java.util.ListIterator<E> listIterator(int index) {
        return new kotlin.collections.AbstractList.ListIteratorImpl(index);
    }

    public java.util.List<E> subList(int fromIndex, int toIndex) {
        return new kotlin.collections.AbstractList.SubList(this, fromIndex, toIndex);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "p0", "", "p1", "p2", "<init>", "(Lkotlin/collections/AbstractList;II)V", "get", "(I)Ljava/lang/Object;", "", "subList", "(II)Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/AbstractList;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getSize", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class SubList<E> extends kotlin.collections.AbstractList<E> implements java.util.RandomAccess {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;
        private final kotlin.collections.AbstractList<E> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(kotlin.collections.AbstractList<? extends E> abstractList, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractList, "");
            this.getHighResolutionOutputSizeshNQ4ISI = abstractList;
            this.getHighSpeedVideoSizes = i;
            kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, abstractList.size());
            this.getHighSpeedVideoFpsRangesFor = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final E get(int p0) {
            kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, this.getHighSpeedVideoFpsRangesFor);
            return this.getHighResolutionOutputSizeshNQ4ISI.get(this.getHighSpeedVideoSizes + p0);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* renamed from: getSize, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public final java.util.List<E> subList(int p0, int p1) {
            kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(p0, p1, this.getHighSpeedVideoFpsRangesFor);
            kotlin.collections.AbstractList<E> abstractList = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            return new kotlin.collections.AbstractList.SubList(abstractList, p0 + i, i + p1);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof java.util.List) {
            return INSTANCE.orderedEquals$kotlin_stdlib(this, (java.util.Collection) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return INSTANCE.orderedHashCode$kotlin_stdlib(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0005@\u0005X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "<init>", "(Lkotlin/collections/AbstractList;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "()I", "Camera2StreamConfigurationMap", "(I)V", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    class IteratorImpl implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        public IteratorImpl() {
        }

        protected final void Camera2StreamConfigurationMap(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        protected final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor < kotlin.collections.AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            kotlin.collections.AbstractList<E> abstractList = kotlin.collections.AbstractList.this;
            int i = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i + 1;
            return abstractList.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\f"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "", "p0", "<init>", "(Lkotlin/collections/AbstractList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    class ListIteratorImpl extends kotlin.collections.AbstractList<E>.IteratorImpl implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
        public ListIteratorImpl(int i) {
            super();
            kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(i, kotlin.collections.AbstractList.this.size());
            Camera2StreamConfigurationMap(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return getGetHighSpeedVideoFpsRangesFor() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return getGetHighSpeedVideoFpsRangesFor();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new java.util.NoSuchElementException();
            }
            kotlin.collections.AbstractList<E> abstractList = kotlin.collections.AbstractList.this;
            Camera2StreamConfigurationMap(getGetHighSpeedVideoFpsRangesFor() - 1);
            return abstractList.get(getGetHighSpeedVideoFpsRangesFor());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return getGetHighSpeedVideoFpsRangesFor() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0000¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "<init>", "()V", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "", "checkElementIndex$kotlin_stdlib", "(II)V", "checkPositionIndex$kotlin_stdlib", "fromIndex", "toIndex", "checkRangeIndexes$kotlin_stdlib", "(III)V", "startIndex", "endIndex", "checkBoundsIndexes$kotlin_stdlib", "oldCapacity", "minCapacity", "newCapacity$kotlin_stdlib", "(II)I", "", "c", "orderedHashCode$kotlin_stdlib", "(Ljava/util/Collection;)I", "other", "", "orderedEquals$kotlin_stdlib", "(Ljava/util/Collection;Ljava/util/Collection;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public final int newCapacity$kotlin_stdlib(int oldCapacity, int minCapacity) {
            int i = oldCapacity + (oldCapacity >> 1);
            if (i - minCapacity < 0) {
                i = minCapacity;
            }
            return i - 2147483639 > 0 ? minCapacity > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i;
        }

        private Companion() {
        }

        public final void checkElementIndex$kotlin_stdlib(int index, int size) {
            if (index < 0 || index >= size) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("index: ");
                sb.append(index);
                sb.append(", size: ");
                sb.append(size);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
        }

        public final void checkPositionIndex$kotlin_stdlib(int index, int size) {
            if (index < 0 || index > size) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("index: ");
                sb.append(index);
                sb.append(", size: ");
                sb.append(size);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
        }

        public final void checkRangeIndexes$kotlin_stdlib(int fromIndex, int toIndex, int size) {
            if (fromIndex < 0 || toIndex > size) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex: ");
                sb.append(fromIndex);
                sb.append(", toIndex: ");
                sb.append(toIndex);
                sb.append(", size: ");
                sb.append(size);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (fromIndex <= toIndex) {
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fromIndex: ");
            sb2.append(fromIndex);
            sb2.append(" > toIndex: ");
            sb2.append(toIndex);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }

        public final void checkBoundsIndexes$kotlin_stdlib(int startIndex, int endIndex, int size) {
            if (startIndex < 0 || endIndex > size) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("startIndex: ");
                sb.append(startIndex);
                sb.append(", endIndex: ");
                sb.append(endIndex);
                sb.append(", size: ");
                sb.append(size);
                throw new java.lang.IndexOutOfBoundsException(sb.toString());
            }
            if (startIndex <= endIndex) {
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("startIndex: ");
            sb2.append(startIndex);
            sb2.append(" > endIndex: ");
            sb2.append(endIndex);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }

        public final int orderedHashCode$kotlin_stdlib(java.util.Collection<?> c) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
            java.util.Iterator<?> it = c.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        public final boolean orderedEquals$kotlin_stdlib(java.util.Collection<?> c, java.util.Collection<?> other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
            if (c.size() != other.size()) {
                return false;
            }
            java.util.Iterator<?> it = other.iterator();
            java.util.Iterator<?> it2 = c.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
