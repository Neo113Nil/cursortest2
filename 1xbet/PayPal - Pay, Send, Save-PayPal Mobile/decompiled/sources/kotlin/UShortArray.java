package kotlin;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102\u0088\u0001\u0004\u0092\u0001\u00020\u0003"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", "", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "constructor-impl", "([S)[S", "", io.ktor.http.ContentDisposition.Parameters.Size, "(I)[S", "index", "get-Mh2AYeg", "([SI)S", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set-01HTLdE", "([SIS)V", "set", "", "iterator-impl", "([S)Ljava/util/Iterator;", "iterator", "element", "", "contains-xj2QHRw", "([SS)Z", "contains", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "containsAll", "isEmpty-impl", "([S)Z", "isEmpty", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "[S", "getStorage$annotations", "()V", "getHighSpeedVideoFpsRanges", "getSize-impl", "([S)I", "Iterator"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UShortArray implements java.util.Collection<kotlin.UShort>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final short[] getHighSpeedVideoFpsRanges;

    public static /* synthetic */ void getStorage$annotations() {
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UShort) {
            return m23539containsxj2QHRw(((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI());
        }
        return false;
    }

    private /* synthetic */ UShortArray(short[] sArr) {
        this.getHighSpeedVideoFpsRanges = sArr;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m23525constructorimpl(int i) {
        return m23526constructorimpl(new short[i]);
    }

    /* renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m23531getMh2AYeg(short[] sArr, int i) {
        return kotlin.UShort.m23518constructorimpl(sArr[i]);
    }

    /* renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m23536set01HTLdE(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m23532getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return m23532getSizeimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<kotlin.UShort> m23535iteratorimpl(short[] sArr) {
        return new kotlin.UShortArray.Iterator(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<kotlin.UShort> iterator() {
        return m23535iteratorimpl(this.getHighSpeedVideoFpsRanges);
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000e"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "", "p0", "<init>", "([S)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "[S", "getHighSpeedVideoFpsRanges", "", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Iterator implements java.util.Iterator<kotlin.UShort>, kotlin.jvm.internal.markers.KMappedMarker {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final short[] getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRangesFor;

        public Iterator(short[] sArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
            this.getHighSpeedVideoFpsRanges = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoFpsRangesFor < this.getHighSpeedVideoFpsRanges.length;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ kotlin.UShort next() {
            int i = this.getHighSpeedVideoFpsRangesFor;
            short[] sArr = this.getHighSpeedVideoFpsRanges;
            if (i < sArr.length) {
                this.getHighSpeedVideoFpsRangesFor = i + 1;
                return kotlin.UShort.m23517boximpl(kotlin.UShort.m23518constructorimpl(sArr[i]));
            }
            throw new java.util.NoSuchElementException(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public final boolean m23539containsxj2QHRw(short s) {
        return m23527containsxj2QHRw(this.getHighSpeedVideoFpsRanges, s);
    }

    /* renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m23527containsxj2QHRw(short[] sArr, short s) {
        return kotlin.collections.ArraysKt.contains(sArr, s);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return m23528containsAllimpl(this.getHighSpeedVideoFpsRanges, collection);
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m23528containsAllimpl(short[] sArr, java.util.Collection<kotlin.UShort> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<kotlin.UShort> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection2) {
            if (!(obj instanceof kotlin.UShort) || !kotlin.collections.ArraysKt.contains(sArr, ((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m23534isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return m23534isEmptyimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short[] getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m23537toStringimpl(this.getHighSpeedVideoFpsRanges);
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
        return m23533hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return m23529equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends kotlin.UShort> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add-xj2QHRw, reason: not valid java name */
    public final boolean m23538addxj2QHRw(short s) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(kotlin.UShort uShort) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23537toStringimpl(short[] sArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UShortArray(storage=");
        sb.append(java.util.Arrays.toString(sArr));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23533hashCodeimpl(short[] sArr) {
        return java.util.Arrays.hashCode(sArr);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23530equalsimpl0(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(sArr, sArr2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23529equalsimpl(short[] sArr, java.lang.Object obj) {
        return (obj instanceof kotlin.UShortArray) && kotlin.jvm.internal.Intrinsics.areEqual(sArr, ((kotlin.UShortArray) obj).getGetHighSpeedVideoFpsRanges());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short[] m23526constructorimpl(short[] sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        return sArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShortArray m23524boximpl(short[] sArr) {
        return new kotlin.UShortArray(sArr);
    }
}
