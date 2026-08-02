package kotlin;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "constructor-impl", "([B)[B", "", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[B", "index", "get-w2LRezQ", "([BI)B", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set-VurrAj0", "([BIB)V", "set", "", "iterator-impl", "([B)Ljava/util/Iterator;", "iterator", "element", "", "contains-7apg3OU", "([BB)Z", "contains", "elements", "containsAll-impl", "([BLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([B)Z", "isEmpty", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "[B", "getStorage$annotations", "()V", "getHighSpeedVideoFpsRanges", "getSize-impl", "([B)I", "Iterator"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UByteArray implements java.util.Collection<kotlin.UByte>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final byte[] getHighSpeedVideoFpsRanges;

    public static /* synthetic */ void getStorage$annotations() {
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UByte) {
            return m23467contains7apg3OU(((kotlin.UByte) obj).getGetHighSpeedVideoFpsRangesFor());
        }
        return false;
    }

    private /* synthetic */ UByteArray(byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = bArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m23453constructorimpl(int i) {
        return m23454constructorimpl(new byte[i]);
    }

    /* renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m23459getw2LRezQ(byte[] bArr, int i) {
        return kotlin.UByte.m23446constructorimpl(bArr[i]);
    }

    /* renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m23464setVurrAj0(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m23460getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return m23460getSizeimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<kotlin.UByte> m23463iteratorimpl(byte[] bArr) {
        return new kotlin.UByteArray.Iterator(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<kotlin.UByte> iterator() {
        return m23463iteratorimpl(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/UByteArray$Iterator;", "", "Lkotlin/UByte;", "", "p0", "<init>", "([B)V", "", "hasNext", "()Z", "getHighSpeedVideoFpsRanges", "[B", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Iterator implements java.util.Iterator<kotlin.UByte>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final byte[] getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private int getHighResolutionOutputSizeshNQ4ISI;

        public Iterator(byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.getHighSpeedVideoSizes = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoSizes.length;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ kotlin.UByte next() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i < bArr.length) {
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                return kotlin.UByte.m23445boximpl(kotlin.UByte.m23446constructorimpl(bArr[i]));
            }
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public final boolean m23467contains7apg3OU(byte b) {
        return m23455contains7apg3OU(this.getHighSpeedVideoFpsRanges, b);
    }

    /* renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m23455contains7apg3OU(byte[] bArr, byte b) {
        return kotlin.collections.ArraysKt.contains(bArr, b);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return m23456containsAllimpl(this.getHighSpeedVideoFpsRanges, collection);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m23456containsAllimpl(byte[] bArr, java.util.Collection<kotlin.UByte> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<kotlin.UByte> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof kotlin.UByte) || !kotlin.collections.ArraysKt.contains(bArr, ((kotlin.UByte) obj).getGetHighSpeedVideoFpsRangesFor())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m23462isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return m23462isEmptyimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m23465toStringimpl(this.getHighSpeedVideoFpsRanges);
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
        return m23461hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return m23457equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends kotlin.UByte> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-7apg3OU, reason: not valid java name */
    public final boolean m23466add7apg3OU(byte b) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(kotlin.UByte uByte) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23465toStringimpl(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UByteArray(storage=");
        sb.append(java.util.Arrays.toString(bArr));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23461hashCodeimpl(byte[] bArr) {
        return java.util.Arrays.hashCode(bArr);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23458equalsimpl0(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(bArr, bArr2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23457equalsimpl(byte[] bArr, java.lang.Object obj) {
        return (obj instanceof kotlin.UByteArray) && kotlin.jvm.internal.Intrinsics.areEqual(bArr, ((kotlin.UByteArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m23454constructorimpl(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return bArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByteArray m23452boximpl(byte[] bArr) {
        return new kotlin.UByteArray(bArr);
    }
}
