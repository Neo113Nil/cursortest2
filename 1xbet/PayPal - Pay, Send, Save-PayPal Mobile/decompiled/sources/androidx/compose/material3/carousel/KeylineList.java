package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b!\b\u0000\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u0017\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000eH\u0096\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b(\u0010\bJ\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0096\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b,\u0010'J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010#\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b.\u00100J&\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b3\u00104R\u0017\u00105\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001bR\u0011\u0010:\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010\u001bR\u0011\u0010>\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b=\u00109R\u001a\u0010?\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b@\u0010\u001bR\u0011\u0010B\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bA\u00109R\u001a\u0010C\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u0010\u001bR\u0011\u0010F\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bE\u00109R\u001a\u0010G\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00106\u001a\u0004\bH\u0010\u001bR\u0011\u0010J\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bI\u00109R\u001a\u0010K\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\bL\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000e8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010\u001b"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "", "Landroidx/compose/material3/carousel/Keyline;", "keylines", "<init>", "(Ljava/util/List;)V", "", "isFirstFocalItemAtStartOfContainer", "()Z", "", "carouselMainAxisSize", "isLastFocalItemAtEndOfContainer", "(F)Z", io.ktor.http.ContentDisposition.Parameters.Size, "", "firstIndexAfterFocalRangeWithSize", "(F)I", "lastIndexBeforeFocalRangeWithSize", "unadjustedOffset", "getKeylineBefore", "(F)Landroidx/compose/material3/carousel/Keyline;", "getKeylineAfter", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "element", "contains", "(Landroidx/compose/material3/carousel/Keyline;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Landroidx/compose/material3/carousel/Keyline;", "indexOf", "(Landroidx/compose/material3/carousel/Keyline;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "pivotIndex", com.visa.cbp.getEncExpo.warmup, "getPivotIndex", "getPivot", "()Landroidx/compose/material3/carousel/Keyline;", "pivot", "firstNonAnchorIndex", "getFirstNonAnchorIndex", "getFirstNonAnchor", "firstNonAnchor", "lastNonAnchorIndex", "getLastNonAnchorIndex", "getLastNonAnchor", "lastNonAnchor", "firstFocalIndex", "getFirstFocalIndex", "getFirstFocal", "firstFocal", "lastFocalIndex", "getLastFocalIndex", "getLastFocal", "lastFocal", "focalCount", "getFocalCount", "getSize", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylineList implements java.util.List<androidx.compose.material3.carousel.Keyline>, kotlin.jvm.internal.markers.KMappedMarker {
    private final int firstFocalIndex;
    private final int firstNonAnchorIndex;
    private final int focalCount;
    private final /* synthetic */ java.util.List<androidx.compose.material3.carousel.Keyline> getHighSpeedVideoSizes;
    private final int lastFocalIndex;
    private final int lastNonAnchorIndex;
    private final int pivotIndex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.KeylineList.Companion INSTANCE = new androidx.compose.material3.carousel.KeylineList.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.material3.carousel.KeylineList Empty = new androidx.compose.material3.carousel.KeylineList(kotlin.collections.CollectionsKt.emptyList());

    public KeylineList(java.util.List<androidx.compose.material3.carousel.Keyline> list) {
        int i;
        int i2;
        this.getHighSpeedVideoSizes = list;
        androidx.compose.material3.carousel.KeylineList keylineList = this;
        java.util.Iterator<androidx.compose.material3.carousel.Keyline> it = keylineList.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (it.next().isPivot()) {
                break;
            } else {
                i4++;
            }
        }
        this.pivotIndex = i4;
        java.util.Iterator<androidx.compose.material3.carousel.Keyline> it2 = keylineList.iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i5 = -1;
                break;
            } else if (!it2.next().isAnchor()) {
                break;
            } else {
                i5++;
            }
        }
        this.firstNonAnchorIndex = i5;
        java.util.ListIterator<androidx.compose.material3.carousel.Keyline> listIterator = keylineList.listIterator(keylineList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            } else if (!listIterator.previous().isAnchor()) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        this.lastNonAnchorIndex = i2;
        java.util.Iterator<androidx.compose.material3.carousel.Keyline> it3 = keylineList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            } else if (it3.next().isFocal()) {
                break;
            } else {
                i3++;
            }
        }
        this.firstFocalIndex = i3;
        java.util.ListIterator<androidx.compose.material3.carousel.Keyline> listIterator2 = keylineList.listIterator(keylineList.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            } else if (listIterator2.previous().isFocal()) {
                i = listIterator2.nextIndex();
                break;
            }
        }
        this.lastFocalIndex = i;
        this.focalCount = (i - this.firstFocalIndex) + 1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.compose.material3.carousel.Keyline) {
            return contains((androidx.compose.material3.carousel.Keyline) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.material3.carousel.Keyline) {
            return indexOf((androidx.compose.material3.carousel.Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.material3.carousel.Keyline) {
            return lastIndexOf((androidx.compose.material3.carousel.Keyline) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final int getPivotIndex() {
        return this.pivotIndex;
    }

    public final androidx.compose.material3.carousel.Keyline getPivot() {
        return get(this.pivotIndex);
    }

    public final int getFirstNonAnchorIndex() {
        return this.firstNonAnchorIndex;
    }

    public final androidx.compose.material3.carousel.Keyline getFirstNonAnchor() {
        return get(this.firstNonAnchorIndex);
    }

    public final int getLastNonAnchorIndex() {
        return this.lastNonAnchorIndex;
    }

    public final androidx.compose.material3.carousel.Keyline getLastNonAnchor() {
        return get(this.lastNonAnchorIndex);
    }

    public final int getFirstFocalIndex() {
        return this.firstFocalIndex;
    }

    public final androidx.compose.material3.carousel.Keyline getFirstFocal() {
        androidx.compose.material3.carousel.Keyline keyline = (androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.getOrNull(this, this.firstFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new java.util.NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getLastFocalIndex() {
        return this.lastFocalIndex;
    }

    public final androidx.compose.material3.carousel.Keyline getLastFocal() {
        androidx.compose.material3.carousel.Keyline keyline = (androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.getOrNull(this, this.lastFocalIndex);
        if (keyline != null) {
            return keyline;
        }
        throw new java.util.NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final int getFocalCount() {
        return this.focalCount;
    }

    public final boolean isFirstFocalItemAtStartOfContainer() {
        return getFirstFocal().getOffset() - (getFirstFocal().getSize() / 2.0f) >= 0.0f && kotlin.jvm.internal.Intrinsics.areEqual(getFirstFocal(), getFirstNonAnchor());
    }

    public final boolean isLastFocalItemAtEndOfContainer(float carouselMainAxisSize) {
        return getLastFocal().getOffset() + (getLastFocal().getSize() / 2.0f) <= carouselMainAxisSize && kotlin.jvm.internal.Intrinsics.areEqual(getLastFocal(), getLastNonAnchor());
    }

    public final int firstIndexAfterFocalRangeWithSize(float size) {
        java.lang.Integer num;
        androidx.compose.material3.carousel.KeylineList keylineList = this;
        java.util.Iterator<java.lang.Integer> it = new kotlin.ranges.IntRange(this.lastFocalIndex, kotlin.collections.CollectionsKt.getLastIndex(keylineList)).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (get(num.intValue()).getSize() == size) {
                break;
            }
        }
        java.lang.Integer num2 = num;
        return num2 != null ? num2.intValue() : kotlin.collections.CollectionsKt.getLastIndex(keylineList);
    }

    public final int lastIndexBeforeFocalRangeWithSize(float size) {
        java.lang.Integer num;
        java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.downTo(this.firstFocalIndex - 1, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (get(num.intValue()).getSize() == size) {
                break;
            }
        }
        java.lang.Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final androidx.compose.material3.carousel.Keyline getKeylineBefore(float unadjustedOffset) {
        int size = size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                androidx.compose.material3.carousel.Keyline keyline = get(size);
                if (keyline.getUnadjustedOffset() >= unadjustedOffset) {
                    if (i < 0) {
                        break;
                    }
                    size = i;
                } else {
                    return keyline;
                }
            }
        }
        return (androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.first((java.util.List) this);
    }

    public final androidx.compose.material3.carousel.Keyline getKeylineAfter(float unadjustedOffset) {
        androidx.compose.material3.carousel.Keyline keyline;
        androidx.compose.material3.carousel.KeylineList keylineList = this;
        int size = keylineList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                keyline = null;
                break;
            }
            keyline = keylineList.get(i);
            if (keyline.getUnadjustedOffset() >= unadjustedOffset) {
                break;
            }
            i++;
        }
        androidx.compose.material3.carousel.Keyline keyline2 = keyline;
        return keyline2 == null ? (androidx.compose.material3.carousel.Keyline) kotlin.collections.CollectionsKt.last((java.util.List) keylineList) : keyline2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.carousel.KeylineList)) {
            return false;
        }
        androidx.compose.material3.carousel.KeylineList keylineList = (androidx.compose.material3.carousel.KeylineList) other;
        if (size() != keylineList.size()) {
            return false;
        }
        androidx.compose.material3.carousel.KeylineList keylineList2 = this;
        int size = keylineList2.size();
        for (int i = 0; i < size; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(keylineList2.get(i), keylineList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        androidx.compose.material3.carousel.KeylineList keylineList = this;
        int size = keylineList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += keylineList.get(i2).hashCode() * 31;
        }
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/KeylineList;", "Empty", "Landroidx/compose/material3/carousel/KeylineList;", "getEmpty", "()Landroidx/compose/material3/carousel/KeylineList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.material3.carousel.KeylineList getEmpty() {
            return androidx.compose.material3.carousel.KeylineList.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final java.util.List<androidx.compose.material3.carousel.Keyline> subList(int fromIndex, int toIndex) {
        return this.getHighSpeedVideoSizes.subList(fromIndex, toIndex);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super androidx.compose.material3.carousel.Keyline> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ androidx.compose.material3.carousel.Keyline set(int i, androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public final androidx.compose.material3.carousel.Keyline set2(int i, androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<androidx.compose.material3.carousel.Keyline> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m4263removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.material3.carousel.Keyline removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m4262removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.material3.carousel.Keyline removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ androidx.compose.material3.carousel.Keyline remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final androidx.compose.material3.carousel.Keyline remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.material3.carousel.Keyline> listIterator(int index) {
        return this.getHighSpeedVideoSizes.listIterator(index);
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.material3.carousel.Keyline> listIterator() {
        return this.getHighSpeedVideoSizes.listIterator();
    }

    public final int lastIndexOf(androidx.compose.material3.carousel.Keyline element) {
        return this.getHighSpeedVideoSizes.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<androidx.compose.material3.carousel.Keyline> iterator() {
        return this.getHighSpeedVideoSizes.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    public final int indexOf(androidx.compose.material3.carousel.Keyline element) {
        return this.getHighSpeedVideoSizes.indexOf(element);
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final androidx.compose.material3.carousel.Keyline get(int index) {
        return this.getHighSpeedVideoSizes.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        return this.getHighSpeedVideoSizes.containsAll(elements);
    }

    public final boolean contains(androidx.compose.material3.carousel.Keyline element) {
        return this.getHighSpeedVideoSizes.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends androidx.compose.material3.carousel.Keyline> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends androidx.compose.material3.carousel.Keyline> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, androidx.compose.material3.carousel.Keyline keyline) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
