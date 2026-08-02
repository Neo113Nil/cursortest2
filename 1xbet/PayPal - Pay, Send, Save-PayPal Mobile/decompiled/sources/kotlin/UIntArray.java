package kotlin;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Lkotlin/UIntArray;", "", "Lkotlin/UInt;", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "constructor-impl", "([I)[I", "", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[I", "index", "get-pVg5ArA", "([II)I", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set-VXSXFK8", "([III)V", "set", "", "iterator-impl", "([I)Ljava/util/Iterator;", "iterator", "element", "", "contains-WZ4Q5Ns", "([II)Z", "contains", "elements", "containsAll-impl", "([ILjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([I)Z", "isEmpty", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "[I", "getStorage$annotations", "()V", "getHighSpeedVideoFpsRanges", "getSize-impl", "([I)I", "Iterator"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UIntArray implements java.util.Collection<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoFpsRanges;

    public static /* synthetic */ void getStorage$annotations() {
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m23491containsWZ4Q5Ns(((kotlin.UInt) obj).getCamera2StreamConfigurationMap());
        }
        return false;
    }

    private /* synthetic */ UIntArray(int[] iArr) {
        this.getHighSpeedVideoFpsRanges = iArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m23477constructorimpl(int i) {
        return m23478constructorimpl(new int[i]);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m23483getpVg5ArA(int[] iArr, int i) {
        return kotlin.UInt.m23470constructorimpl(iArr[i]);
    }

    /* renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m23488setVXSXFK8(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m23484getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return m23484getSizeimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<kotlin.UInt> m23487iteratorimpl(int[] iArr) {
        return new kotlin.UIntArray.Iterator(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<kotlin.UInt> iterator() {
        return m23487iteratorimpl(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/UIntArray$Iterator;", "", "Lkotlin/UInt;", "", "p0", "<init>", "([I)V", "", "hasNext", "()Z", "Camera2StreamConfigurationMap", "[I", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Iterator implements java.util.Iterator<kotlin.UInt>, kotlin.jvm.internal.markers.KMappedMarker {
        private final int[] Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges;

        public Iterator(int[] iArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
            this.Camera2StreamConfigurationMap = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRanges < this.Camera2StreamConfigurationMap.length;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ kotlin.UInt next() {
            int i = this.getHighSpeedVideoFpsRanges;
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i < iArr.length) {
                this.getHighSpeedVideoFpsRanges = i + 1;
                return kotlin.UInt.m23469boximpl(kotlin.UInt.m23470constructorimpl(iArr[i]));
            }
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public final boolean m23491containsWZ4Q5Ns(int i) {
        return m23479containsWZ4Q5Ns(this.getHighSpeedVideoFpsRanges, i);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m23479containsWZ4Q5Ns(int[] iArr, int i) {
        return kotlin.collections.ArraysKt.contains(iArr, i);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return m23480containsAllimpl(this.getHighSpeedVideoFpsRanges, collection);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m23480containsAllimpl(int[] iArr, java.util.Collection<kotlin.UInt> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<kotlin.UInt> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof kotlin.UInt) || !kotlin.collections.ArraysKt.contains(iArr, ((kotlin.UInt) obj).getCamera2StreamConfigurationMap())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m23486isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return m23486isEmptyimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m23489toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return m23485hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return m23481equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends kotlin.UInt> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public final boolean m23490addWZ4Q5Ns(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(kotlin.UInt uInt) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23489toStringimpl(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UIntArray(storage=");
        sb.append(java.util.Arrays.toString(iArr));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23485hashCodeimpl(int[] iArr) {
        return java.util.Arrays.hashCode(iArr);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23482equalsimpl0(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23481equalsimpl(int[] iArr, java.lang.Object obj) {
        return (obj instanceof kotlin.UIntArray) && kotlin.jvm.internal.Intrinsics.areEqual(iArr, ((kotlin.UIntArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m23478constructorimpl(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UIntArray m23476boximpl(int[] iArr) {
        return new kotlin.UIntArray(iArr);
    }
}
