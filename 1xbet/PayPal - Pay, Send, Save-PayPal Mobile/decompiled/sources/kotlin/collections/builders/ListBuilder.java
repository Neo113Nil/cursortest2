package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003VWXB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\bH\u0017¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b6\u00107J)\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0001\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f09H\u0016¢\u0006\u0004\b;\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u0017\u0010G\u001a\u00020'2\u0006\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bG\u0010\u000bJ\u001f\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010IJ\u001f\u0010J\u001a\u00020'2\u0006\u0010F\u001a\u00020\b2\u0006\u0010H\u001a\u00028\u0000H\u0002¢\u0006\u0004\bJ\u0010(J-\u0010J\u001a\u00020'2\u0006\u0010F\u001a\u00020\b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010LJ\u0017\u0010M\u001a\u00028\u00002\u0006\u0010F\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010\u0017J\u001f\u0010G\u001a\u00020'2\u0006\u0010F\u001a\u00020\b2\u0006\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bG\u0010IJ5\u0010M\u001a\u00020\b2\u0006\u0010F\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010N\u001a\u00020\u0012H\u0002¢\u0006\u0004\bM\u0010OR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010PR\u0016\u0010M\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010QR\u0016\u0010R\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010A"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "initialCapacity", "<init>", "(I)V", "", "build", "()Ljava/util/List;", "", "writeReplace", "()Ljava/lang/Object;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "p0", "getHighSpeedVideoFpsRangesFor", "p1", "(II)V", "Camera2StreamConfigurationMap", "p2", "(ILjava/util/Collection;I)V", "getHighSpeedVideoFpsRanges", "p3", "(IILjava/util/Collection;Z)I", "[Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Z", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "Itr", "BuilderSubList"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ListBuilder<E> extends kotlin.collections.AbstractMutableList<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, kotlin.jvm.internal.markers.KMutableList {
    private static final kotlin.collections.builders.ListBuilder.Companion Companion = new kotlin.collections.builders.ListBuilder.Companion(null);
    private static final kotlin.collections.builders.ListBuilder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private E[] Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoSizes;

    public ListBuilder(int i) {
        this.Camera2StreamConfigurationMap = (E[]) kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(i);
    }

    public /* synthetic */ ListBuilder(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "<init>", "()V", "Lkotlin/collections/builders/ListBuilder;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/builders/ListBuilder;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlin.collections.builders.ListBuilder listBuilder = new kotlin.collections.builders.ListBuilder(0);
        listBuilder.getHighSpeedVideoSizes = true;
        getHighResolutionOutputSizeshNQ4ISI = listBuilder;
    }

    public final java.util.List<E> build() {
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighSpeedVideoSizes = true;
        return this.getHighSpeedVideoFpsRanges > 0 ? this : getHighResolutionOutputSizeshNQ4ISI;
    }

    private final java.lang.Object writeReplace() {
        if (this.getHighSpeedVideoSizes) {
            return new kotlin.collections.builders.SerializedCollection(this, 0);
        }
        throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        return this.Camera2StreamConfigurationMap[index];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int index, E element) {
        getHighResolutionOutputSizeshNQ4ISI();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        E[] eArr = this.Camera2StreamConfigurationMap;
        E e = eArr[index];
        eArr[index] = element;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object element) {
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object element) {
        for (int i = this.getHighSpeedVideoFpsRanges - 1; i >= 0; i--) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap[i], element)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        return new kotlin.collections.builders.ListBuilder.Itr(this, index);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E element) {
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int index, E element) {
        getHighResolutionOutputSizeshNQ4ISI();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        Camera2StreamConfigurationMap(index, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        getHighResolutionOutputSizeshNQ4ISI();
        int size = elements.size();
        Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int index, java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        getHighResolutionOutputSizeshNQ4ISI();
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        int size = elements.size();
        Camera2StreamConfigurationMap(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor(0, this.getHighSpeedVideoFpsRanges);
    }

    @Override // kotlin.collections.AbstractMutableList
    @kotlin.IgnorableReturnValue
    public final E removeAt(int index) {
        getHighResolutionOutputSizeshNQ4ISI();
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.getHighSpeedVideoFpsRanges);
        return getHighSpeedVideoFpsRanges(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object element) {
        getHighResolutionOutputSizeshNQ4ISI();
        int indexOf = indexOf(element);
        if (indexOf >= 0) {
            removeAt(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        getHighResolutionOutputSizeshNQ4ISI();
        return getHighSpeedVideoFpsRanges(0, this.getHighSpeedVideoFpsRanges, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        getHighResolutionOutputSizeshNQ4ISI();
        return getHighSpeedVideoFpsRanges(0, this.getHighSpeedVideoFpsRanges, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List<E> subList(int fromIndex, int toIndex) {
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.getHighSpeedVideoFpsRanges);
        return new kotlin.collections.builders.ListBuilder.BuilderSubList(this.Camera2StreamConfigurationMap, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        int length = array.length;
        int i = this.getHighSpeedVideoFpsRanges;
        if (length < i) {
            T[] tArr = (T[]) java.util.Arrays.copyOfRange(this.Camera2StreamConfigurationMap, 0, i, array.getClass());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tArr, "");
            return tArr;
        }
        kotlin.collections.ArraysKt.copyInto(this.Camera2StreamConfigurationMap, array, 0, 0, i);
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(this.getHighSpeedVideoFpsRanges, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return kotlin.collections.ArraysKt.copyOfRange(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof java.util.List) {
            if (kotlin.collections.builders.ListBuilderKt.access$subarrayContentEquals(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges, (java.util.List) other)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return kotlin.collections.builders.ListBuilderKt.access$subarrayContentHashCode(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return kotlin.collections.builders.ListBuilderKt.access$subarrayContentToString(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges, this);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        int i = this.getHighSpeedVideoFpsRanges + p0;
        if (i < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i > this.Camera2StreamConfigurationMap.length) {
            this.Camera2StreamConfigurationMap = (E[]) kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(this.Camera2StreamConfigurationMap, kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(this.Camera2StreamConfigurationMap.length, i));
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        getHighSpeedVideoFpsRangesFor(p1);
        E[] eArr = this.Camera2StreamConfigurationMap;
        kotlin.collections.ArraysKt.copyInto(eArr, eArr, p0 + p1, p0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges += p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getHighSpeedVideoFpsRanges(int p0, int p1, java.util.Collection<? extends E> p2, boolean p3) {
        int i = 0;
        int i2 = 0;
        while (i < p1) {
            int i3 = p0 + i;
            if (p2.contains(this.Camera2StreamConfigurationMap[i3]) == p3) {
                E[] eArr = this.Camera2StreamConfigurationMap;
                i++;
                eArr[i2 + p0] = eArr[i3];
                i2++;
            } else {
                i++;
            }
        }
        int i4 = p1 - i2;
        E[] eArr2 = this.Camera2StreamConfigurationMap;
        kotlin.collections.ArraysKt.copyInto(eArr2, eArr2, i2 + p0, p1 + p0, this.getHighSpeedVideoFpsRanges);
        E[] eArr3 = this.Camera2StreamConfigurationMap;
        int i5 = this.getHighSpeedVideoFpsRanges;
        kotlin.collections.builders.ListBuilderKt.resetRange(eArr3, i5 - i4, i5);
        if (i4 > 0) {
            this.modCount++;
        }
        this.getHighSpeedVideoFpsRanges -= i4;
        return i4;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "Lkotlin/collections/builders/ListBuilder;", "p0", "", "p1", "<init>", "(Lkotlin/collections/builders/ListBuilder;I)V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "", "set", "(Ljava/lang/Object;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "remove", "()V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/collections/builders/ListBuilder;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Itr<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMutableListIterator {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final kotlin.collections.builders.ListBuilder<E> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        public Itr(kotlin.collections.builders.ListBuilder<E> listBuilder, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listBuilder, "");
            this.getHighSpeedVideoSizes = listBuilder;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoFpsRanges = listBuilder.modCount;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.getHighSpeedVideoFpsRangesFor > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor < ((kotlin.collections.builders.ListBuilder) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.getHighSpeedVideoFpsRangesFor - 1;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.util.ListIterator
        public final void add(E p0) {
            if (this.getHighSpeedVideoSizes.modCount == this.getHighSpeedVideoFpsRanges) {
                kotlin.collections.builders.ListBuilder<E> listBuilder = this.getHighSpeedVideoSizes;
                int i = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = i + 1;
                listBuilder.add(i, p0);
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.modCount;
                return;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            if (this.getHighSpeedVideoSizes.modCount == this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoFpsRangesFor >= ((kotlin.collections.builders.ListBuilder) this.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges) {
                    throw new java.util.NoSuchElementException();
                }
                int i = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = i + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return (E) ((kotlin.collections.builders.ListBuilder) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI];
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (this.getHighSpeedVideoSizes.modCount == this.getHighSpeedVideoFpsRanges) {
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i <= 0) {
                    throw new java.util.NoSuchElementException();
                }
                int i2 = i - 1;
                this.getHighSpeedVideoFpsRangesFor = i2;
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                return (E) ((kotlin.collections.builders.ListBuilder) this.getHighSpeedVideoSizes).Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI];
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            if (this.getHighSpeedVideoSizes.modCount == this.getHighSpeedVideoFpsRanges) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.getHighSpeedVideoSizes.removeAt(i);
                this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = -1;
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.modCount;
                return;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.ListIterator
        public final void set(E p0) {
            if (this.getHighSpeedVideoSizes.modCount == this.getHighSpeedVideoFpsRanges) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.getHighSpeedVideoSizes.set(i, p0);
                return;
            }
            throw new java.util.ConcurrentModificationException();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001]BC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010&H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010,J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010-\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b-\u0010/J\u001d\u00102\u001a\u00020\u001a2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\b2\u00103J%\u00102\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\b2\u00104J\u000f\u00105\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b7\u0010\u001fJ\u0017\u00108\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b8\u0010.J\u001d\u00109\u001a\u00020\u001a2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\b9\u00103J\u001d\u0010:\u001a\u00020\u001a2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000100H\u0016¢\u0006\u0004\b:\u00103J%\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u0010?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\bH\u0016¢\u0006\u0004\bA\u0010CJ\u001a\u0010E\u001a\u00020\u001a2\b\u0010D\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\bE\u0010.J\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00028\u0001H\u0002¢\u0006\u0004\bM\u0010/J-\u0010O\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\n2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010N\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bQ\u0010\u001fJ\u001f\u0010M\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010RJ5\u0010O\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\n2\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u0001002\u0006\u0010S\u001a\u00020\u001aH\u0002¢\u0006\u0004\bO\u0010TR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010WR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010WR\u001c\u0010U\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010YR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010ZR\u0014\u0010\\\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010G"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "backing", "", "offset", "length", "parent", "Lkotlin/collections/builders/ListBuilder;", "root", "<init>", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", "removeAt", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "p2", "getHighSpeedVideoFpsRangesFor", "(ILjava/util/Collection;I)V", "Camera2StreamConfigurationMap", "(II)V", "p3", "(IILjava/util/Collection;Z)I", "getHighSpeedVideoSizes", "[Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "Lkotlin/collections/builders/ListBuilder;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Itr"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BuilderSubList<E> extends kotlin.collections.AbstractMutableList<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, kotlin.jvm.internal.markers.KMutableList {
        private int Camera2StreamConfigurationMap;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.collections.builders.ListBuilder<E> getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private E[] getHighSpeedVideoFpsRangesFor;

        public BuilderSubList(E[] eArr, int i, int i2, kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList, kotlin.collections.builders.ListBuilder<E> listBuilder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listBuilder, "");
            this.getHighSpeedVideoFpsRangesFor = eArr;
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = i2;
            this.getHighSpeedVideoSizes = builderSubList;
            this.getHighResolutionOutputSizeshNQ4ISI = listBuilder;
            this.modCount = listBuilder.modCount;
        }

        private final void readObject(java.io.ObjectInputStream input) {
            throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.List<E> subList(int fromIndex, int toIndex) {
            kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.Camera2StreamConfigurationMap);
            return new kotlin.collections.builders.ListBuilder.BuilderSubList(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges + fromIndex, toIndex - fromIndex, this, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        private final int getHighSpeedVideoFpsRangesFor(int p0, int p1, java.util.Collection<? extends E> p2, boolean p3) {
            int highSpeedVideoFpsRanges;
            kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighSpeedVideoSizes;
            if (builderSubList == null) {
                highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(p0, p1, p2, p3);
            } else {
                highSpeedVideoFpsRanges = builderSubList.getHighSpeedVideoFpsRangesFor(p0, p1, p2, p3);
            }
            if (highSpeedVideoFpsRanges > 0) {
                this.modCount++;
            }
            this.Camera2StreamConfigurationMap -= highSpeedVideoFpsRanges;
            return highSpeedVideoFpsRanges;
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", "E", "", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "p0", "", "p1", "<init>", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "", "set", "(Ljava/lang/Object;)V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "remove", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
        static final class Itr<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMutableListIterator {
            private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> getHighResolutionOutputSizeshNQ4ISI;
            private int getHighSpeedVideoFpsRanges;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private int getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private int getHighSpeedVideoFpsRangesFor;

            public Itr(kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList, int i) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderSubList, "");
                this.getHighResolutionOutputSizeshNQ4ISI = builderSubList;
                this.getHighSpeedVideoSizes = i;
                this.getHighSpeedVideoFpsRanges = -1;
                this.getHighSpeedVideoFpsRangesFor = builderSubList.modCount;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.getHighSpeedVideoSizes > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.getHighSpeedVideoSizes < ((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.getHighSpeedVideoSizes - 1;
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.getHighSpeedVideoSizes;
            }

            @Override // java.util.ListIterator
            public final void add(E p0) {
                if (((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI.modCount == this.getHighSpeedVideoFpsRangesFor) {
                    kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighResolutionOutputSizeshNQ4ISI;
                    int i = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i + 1;
                    builderSubList.add(i, p0);
                    this.getHighSpeedVideoFpsRanges = -1;
                    this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.modCount;
                    return;
                }
                throw new java.util.ConcurrentModificationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                if (((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI.modCount == this.getHighSpeedVideoFpsRangesFor) {
                    if (this.getHighSpeedVideoSizes >= ((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap) {
                        throw new java.util.NoSuchElementException();
                    }
                    int i = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoSizes = i + 1;
                    this.getHighSpeedVideoFpsRanges = i;
                    return (E) ((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor[((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges + this.getHighSpeedVideoFpsRanges];
                }
                throw new java.util.ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final E previous() {
                if (((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI.modCount == this.getHighSpeedVideoFpsRangesFor) {
                    int i = this.getHighSpeedVideoSizes;
                    if (i <= 0) {
                        throw new java.util.NoSuchElementException();
                    }
                    int i2 = i - 1;
                    this.getHighSpeedVideoSizes = i2;
                    this.getHighSpeedVideoFpsRanges = i2;
                    return (E) ((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor[((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges + this.getHighSpeedVideoFpsRanges];
                }
                throw new java.util.ConcurrentModificationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                if (((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI.modCount == this.getHighSpeedVideoFpsRangesFor) {
                    int i = this.getHighSpeedVideoFpsRanges;
                    if (i == -1) {
                        throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.removeAt(i);
                    this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = -1;
                    this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.modCount;
                    return;
                }
                throw new java.util.ConcurrentModificationException();
            }

            @Override // java.util.ListIterator
            public final void set(E p0) {
                if (((kotlin.collections.builders.ListBuilder.BuilderSubList) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI.modCount == this.getHighSpeedVideoFpsRangesFor) {
                    int i = this.getHighSpeedVideoFpsRanges;
                    if (i == -1) {
                        throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.set(i, p0);
                    return;
                }
                throw new java.util.ConcurrentModificationException();
            }
        }

        private final void getHighSpeedVideoFpsRangesFor(int p0, java.util.Collection<? extends E> p1, int p2) {
            this.modCount++;
            kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighSpeedVideoSizes;
            if (builderSubList == null) {
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(p0, p1, p2);
            } else {
                builderSubList.getHighSpeedVideoFpsRangesFor(p0, p1, p2);
            }
            this.getHighSpeedVideoFpsRangesFor = (E[]) ((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap += p2;
        }

        private final void getHighResolutionOutputSizeshNQ4ISI(int p0, E p1) {
            this.modCount++;
            kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighSpeedVideoSizes;
            if (builderSubList == null) {
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(p0, p1);
            } else {
                builderSubList.getHighResolutionOutputSizeshNQ4ISI(p0, (int) p1);
            }
            this.getHighSpeedVideoFpsRangesFor = (E[]) ((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap++;
        }

        private final E Camera2StreamConfigurationMap(int p0) {
            E e;
            this.modCount++;
            kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighSpeedVideoSizes;
            if (builderSubList == null) {
                e = (E) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(p0);
            } else {
                e = builderSubList.Camera2StreamConfigurationMap(p0);
            }
            this.Camera2StreamConfigurationMap--;
            return e;
        }

        private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
            if (p1 > 0) {
                this.modCount++;
            }
            kotlin.collections.builders.ListBuilder.BuilderSubList<E> builderSubList = this.getHighSpeedVideoSizes;
            if (builderSubList == null) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(p0, p1);
            } else {
                builderSubList.getHighResolutionOutputSizeshNQ4ISI(p0, p1);
            }
            this.Camera2StreamConfigurationMap -= p1;
        }

        private final java.lang.Object writeReplace() {
            if (((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                return new kotlin.collections.builders.SerializedCollection(this, 0);
            }
            throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public final void add(int index, E element) {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges + index, (int) element);
                    return;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E element) {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges + this.Camera2StreamConfigurationMap, (int) element);
                    return true;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int index, java.util.Collection<? extends E> elements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                    int size = elements.size();
                    getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges + index, elements, size);
                    return size > 0;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(java.util.Collection<? extends E> elements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    int size = elements.size();
                    getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges + this.Camera2StreamConfigurationMap, elements, size);
                    return size > 0;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
                    return;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(java.lang.Object other) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount != this.modCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (other == this) {
                return true;
            }
            if (other instanceof java.util.List) {
                return kotlin.collections.builders.ListBuilderKt.access$subarrayContentEquals(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, (java.util.List) other);
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int index) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                return this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges + index];
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // kotlin.collections.AbstractMutableList
        public final int getSize() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                return this.Camera2StreamConfigurationMap;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                return kotlin.collections.builders.ListBuilderKt.access$subarrayContentHashCode(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(java.lang.Object element) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                for (int i = 0; i < this.Camera2StreamConfigurationMap; i++) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges + i], element)) {
                        return i;
                    }
                }
                return -1;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                return this.Camera2StreamConfigurationMap == 0;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(java.lang.Object element) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                for (int i = this.Camera2StreamConfigurationMap - 1; i >= 0; i--) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges + i], element)) {
                        return i;
                    }
                }
                return -1;
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.ListIterator<E> listIterator(int index) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                return new kotlin.collections.builders.ListBuilder.BuilderSubList.Itr(this, index);
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(java.lang.Object element) {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    int indexOf = indexOf(element);
                    if (indexOf >= 0) {
                        removeAt(indexOf);
                    }
                    return indexOf >= 0;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(java.util.Collection<?> elements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, elements, false) > 0;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // kotlin.collections.AbstractMutableList
        @kotlin.IgnorableReturnValue
        public final E removeAt(int index) {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                    return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges + index);
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(java.util.Collection<?> elements) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    return getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, elements, true) > 0;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public final E set(int index, E element) {
            if (!((kotlin.collections.builders.ListBuilder) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                    kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.Camera2StreamConfigurationMap);
                    E[] eArr = this.getHighSpeedVideoFpsRangesFor;
                    int i = this.getHighSpeedVideoFpsRanges + index;
                    E e = eArr[i];
                    eArr[i] = element;
                    return e;
                }
                throw new java.util.ConcurrentModificationException();
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final java.lang.Object[] toArray() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                E[] eArr = this.getHighSpeedVideoFpsRangesFor;
                int i = this.getHighSpeedVideoFpsRanges;
                return kotlin.collections.ArraysKt.copyOfRange(eArr, i, this.Camera2StreamConfigurationMap + i);
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                int length = array.length;
                int i = this.Camera2StreamConfigurationMap;
                if (length < i) {
                    E[] eArr = this.getHighSpeedVideoFpsRangesFor;
                    int i2 = this.getHighSpeedVideoFpsRanges;
                    T[] tArr = (T[]) java.util.Arrays.copyOfRange(eArr, i2, i + i2, array.getClass());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tArr, "");
                    return tArr;
                }
                E[] eArr2 = this.getHighSpeedVideoFpsRangesFor;
                int i3 = this.getHighSpeedVideoFpsRanges;
                kotlin.collections.ArraysKt.copyInto(eArr2, array, 0, i3, i + i3);
                return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(this.Camera2StreamConfigurationMap, array);
            }
            throw new java.util.ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.modCount == this.modCount) {
                return kotlin.collections.builders.ListBuilderKt.access$subarrayContentToString(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this);
            }
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int p0, java.util.Collection<? extends E> p1, int p2) {
        this.modCount++;
        getHighResolutionOutputSizeshNQ4ISI(p0, p2);
        java.util.Iterator<? extends E> it = p1.iterator();
        for (int i = 0; i < p2; i++) {
            this.Camera2StreamConfigurationMap[p0 + i] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(int p0, E p1) {
        this.modCount++;
        getHighResolutionOutputSizeshNQ4ISI(p0, 1);
        this.Camera2StreamConfigurationMap[p0] = p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E getHighSpeedVideoFpsRanges(int p0) {
        this.modCount++;
        E[] eArr = this.Camera2StreamConfigurationMap;
        E e = eArr[p0];
        kotlin.collections.ArraysKt.copyInto(eArr, eArr, p0, p0 + 1, this.getHighSpeedVideoFpsRanges);
        kotlin.collections.builders.ListBuilderKt.resetAt(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges - 1);
        this.getHighSpeedVideoFpsRanges--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(int p0, int p1) {
        if (p1 > 0) {
            this.modCount++;
        }
        E[] eArr = this.Camera2StreamConfigurationMap;
        kotlin.collections.ArraysKt.copyInto(eArr, eArr, p0, p0 + p1, this.getHighSpeedVideoFpsRanges);
        E[] eArr2 = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRanges;
        kotlin.collections.builders.ListBuilderKt.resetRange(eArr2, i - p1, i);
        this.getHighSpeedVideoFpsRanges -= p1;
    }

    public ListBuilder() {
        this(0, 1, null);
    }
}
