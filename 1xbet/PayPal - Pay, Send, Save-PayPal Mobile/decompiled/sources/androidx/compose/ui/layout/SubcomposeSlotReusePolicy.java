package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "slotIds", "", "getSlotsToRetain", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;)V", "slotId", "reusableSlotId", "", "areCompatible", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "SlotIdsSet"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {
    boolean areCompatible(java.lang.Object slotId, java.lang.Object reusableSlotId);

    void getSlotsToRetain(androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet slotIds);

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0017\u0010\fJ#\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u0017\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00072\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u001b\u0010\fJ#\u0010\u001b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u0018¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u001c2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\u0004\b$\u0010%J&\u0010&\u001a\u00020\u001c2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u001c0\u0018H\u0086\b¢\u0006\u0004\b&\u0010%R(\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b*\u0010\u001e\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "", "", "Landroidx/collection/MutableOrderedScatterSet;", "set", "<init>", "(Landroidx/collection/MutableOrderedScatterSet;)V", "", "isEmpty", "()Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "slotId", "add$ui", "", "iterator", "()Ljava/util/Iterator;", "remove", "slotIds", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "retainAll", "", "clear", "()V", "", "maxSlotsToRetainForReuse", "trimToSize", "(I)V", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "fastForEach", "Landroidx/collection/MutableOrderedScatterSet;", "getSet", "()Landroidx/collection/MutableOrderedScatterSet;", "getSet$annotations", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SlotIdsSet implements java.util.Collection<java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {
        public static final int $stable = 8;
        private final androidx.collection.MutableOrderedScatterSet<java.lang.Object> set;

        public static /* synthetic */ void getSet$annotations() {
        }

        public SlotIdsSet(androidx.collection.MutableOrderedScatterSet<java.lang.Object> mutableOrderedScatterSet) {
            this.set = mutableOrderedScatterSet;
        }

        @Override // java.util.Collection
        public final int size() {
            return getSize();
        }

        public /* synthetic */ SlotIdsSet(androidx.collection.MutableOrderedScatterSet mutableOrderedScatterSet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.collection.OrderedScatterSetKt.mutableOrderedScatterSetOf() : mutableOrderedScatterSet);
        }

        public final androidx.collection.MutableOrderedScatterSet<java.lang.Object> getSet() {
            return this.set;
        }

        public final int getSize() {
            return this.set.get_size();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection
        public final boolean containsAll(java.util.Collection<?> elements) {
            java.util.Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!this.set.contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean contains(java.lang.Object element) {
            return this.set.contains(element);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui, reason: merged with bridge method [inline-methods] */
        public final boolean add(java.lang.Object slotId) {
            return this.set.add(slotId);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<java.lang.Object> iterator() {
            return this.set.asMutableSet().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(java.lang.Object slotId) {
            return this.set.remove(slotId);
        }

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection<?> slotIds) {
            return this.set.remove(slotIds);
        }

        public final boolean removeAll(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> predicate) {
            int i = this.set.get_size();
            androidx.collection.MutableOrderedScatterSet<java.lang.Object> mutableOrderedScatterSet = this.set;
            java.lang.Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (predicate.invoke(objArr[i5]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != this.set.get_size();
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection<?> slotIds) {
            return this.set.retainAll((java.util.Collection<? extends java.lang.Object>) slotIds);
        }

        public final boolean retainAll(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> predicate) {
            androidx.collection.MutableOrderedScatterSet<java.lang.Object> mutableOrderedScatterSet = this.set;
            java.lang.Object[] objArr = mutableOrderedScatterSet.elements;
            int i = mutableOrderedScatterSet.get_size();
            long[] jArr = mutableOrderedScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!predicate.invoke(objArr[i5]).booleanValue()) {
                                    mutableOrderedScatterSet.removeElementAt(i5);
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return i != mutableOrderedScatterSet.get_size();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        public final void trimToSize(int maxSlotsToRetainForReuse) {
            this.set.trimToSize(maxSlotsToRetainForReuse);
        }

        public final void forEach(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> block) {
            androidx.collection.MutableOrderedScatterSet<java.lang.Object> mutableOrderedScatterSet = this.set;
            java.lang.Object[] objArr = mutableOrderedScatterSet.elements;
            long[] jArr = mutableOrderedScatterSet.nodes;
            int i = mutableOrderedScatterSet.tail;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
                block.invoke(objArr[i]);
                i = i2;
            }
        }

        public final void fastForEach(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> block) {
            androidx.collection.MutableOrderedScatterSet<java.lang.Object> set = getSet();
            java.lang.Object[] objArr = set.elements;
            long[] jArr = set.nodes;
            int i = set.tail;
            while (i != Integer.MAX_VALUE) {
                int i2 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
                block.invoke(objArr[i]);
                i = i2;
            }
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
        }

        @Override // java.util.Collection
        public final java.lang.Object[] toArray() {
            return kotlin.jvm.internal.CollectionToArray.toArray(this);
        }

        @Override // java.util.Collection
        public final boolean removeIf(java.util.function.Predicate<? super java.lang.Object> predicate) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection<? extends java.lang.Object> collection) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlotIdsSet() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
