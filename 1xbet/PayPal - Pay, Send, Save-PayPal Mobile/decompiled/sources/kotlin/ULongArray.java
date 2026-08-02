package kotlin;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Lkotlin/ULongArray;", "", "Lkotlin/ULong;", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "constructor-impl", "([J)[J", "", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[J", "index", "get-s-VKNKU", "([JI)J", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set-k8EXiF4", "([JIJ)V", "set", "", "iterator-impl", "([J)Ljava/util/Iterator;", "iterator", "element", "", "contains-VKZWuLQ", "([JJ)Z", "contains", "elements", "containsAll-impl", "([JLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([J)Z", "isEmpty", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "[J", "getStorage$annotations", "()V", "getHighSpeedVideoFpsRanges", "getSize-impl", "([J)I", "Iterator"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class ULongArray implements java.util.Collection<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long[] getHighSpeedVideoFpsRanges;

    public static /* synthetic */ void getStorage$annotations() {
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.ULong) {
            return m23515containsVKZWuLQ(((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges());
        }
        return false;
    }

    private /* synthetic */ ULongArray(long[] jArr) {
        this.getHighSpeedVideoFpsRanges = jArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m23501constructorimpl(int i) {
        return m23502constructorimpl(new long[i]);
    }

    /* renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m23507getsVKNKU(long[] jArr, int i) {
        return kotlin.ULong.m23494constructorimpl(jArr[i]);
    }

    /* renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m23512setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m23508getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return m23508getSizeimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<kotlin.ULong> m23511iteratorimpl(long[] jArr) {
        return new kotlin.ULongArray.Iterator(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<kotlin.ULong> iterator() {
        return m23511iteratorimpl(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/ULongArray$Iterator;", "", "Lkotlin/ULong;", "", "p0", "<init>", "([J)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "[J", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Iterator implements java.util.Iterator<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {
        private final long[] getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizes;

        public Iterator(long[] jArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
            this.getHighResolutionOutputSizeshNQ4ISI = jArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes < this.getHighResolutionOutputSizeshNQ4ISI.length;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ kotlin.ULong next() {
            int i = this.getHighSpeedVideoSizes;
            long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i < jArr.length) {
                this.getHighSpeedVideoSizes = i + 1;
                return kotlin.ULong.m23493boximpl(kotlin.ULong.m23494constructorimpl(jArr[i]));
            }
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.getHighSpeedVideoSizes));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public final boolean m23515containsVKZWuLQ(long j) {
        return m23503containsVKZWuLQ(this.getHighSpeedVideoFpsRanges, j);
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m23503containsVKZWuLQ(long[] jArr, long j) {
        return kotlin.collections.ArraysKt.contains(jArr, j);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return m23504containsAllimpl(this.getHighSpeedVideoFpsRanges, collection);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m23504containsAllimpl(long[] jArr, java.util.Collection<kotlin.ULong> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<kotlin.ULong> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof kotlin.ULong) || !kotlin.collections.ArraysKt.contains(jArr, ((kotlin.ULong) obj).getGetHighSpeedVideoFpsRanges())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m23510isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return m23510isEmptyimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m23513toStringimpl(this.getHighSpeedVideoFpsRanges);
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
        return m23509hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return m23505equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends kotlin.ULong> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-VKZWuLQ, reason: not valid java name */
    public final boolean m23514addVKZWuLQ(long j) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(kotlin.ULong uLong) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23513toStringimpl(long[] jArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ULongArray(storage=");
        sb.append(java.util.Arrays.toString(jArr));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23509hashCodeimpl(long[] jArr) {
        return java.util.Arrays.hashCode(jArr);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23506equalsimpl0(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(jArr, jArr2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23505equalsimpl(long[] jArr, java.lang.Object obj) {
        return (obj instanceof kotlin.ULongArray) && kotlin.jvm.internal.Intrinsics.areEqual(jArr, ((kotlin.ULongArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long[] m23502constructorimpl(long[] jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        return jArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULongArray m23500boximpl(long[] jArr) {
        return new kotlin.ULongArray(jArr);
    }
}
