package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0\"8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "set", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", "contains", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "remove", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "firstElement", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "setFirstElement$runtime", "(Ljava/lang/Object;)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentOrderedSetBuilder<E> extends kotlin.collections.AbstractMutableSet<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> {
    public static final int $stable = 8;
    private java.lang.Object firstElement;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoSizes;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<E> getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> hashMapBuilder;

    public PersistentOrderedSetBuilder(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<E> persistentOrderedSet) {
        this.getHighSpeedVideoFpsRangesFor = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement();
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getLastElement();
        this.hashMapBuilder = this.getHighSpeedVideoFpsRangesFor.getHashMap$runtime().builder2();
    }

    /* renamed from: getFirstElement$runtime, reason: from getter */
    public final java.lang.Object getFirstElement() {
        return this.firstElement;
    }

    public final void setFirstElement$runtime(java.lang.Object obj) {
        this.firstElement = obj;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> getHashMapBuilder$runtime() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> build() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<E> persistentOrderedSet;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> build2 = this.hashMapBuilder.build2();
        if (build2 == this.getHighSpeedVideoFpsRangesFor.getHashMap$runtime()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.firstElement == this.getHighSpeedVideoFpsRangesFor.getFirstElement());
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.getHighSpeedVideoSizes == this.getHighSpeedVideoFpsRangesFor.getLastElement());
            persistentOrderedSet = this.getHighSpeedVideoFpsRangesFor;
        } else {
            persistentOrderedSet = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<>(this.firstElement, this.getHighSpeedVideoSizes, build2);
        }
        this.getHighSpeedVideoFpsRangesFor = persistentOrderedSet;
        return persistentOrderedSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E element) {
        if (this.hashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.getHighSpeedVideoSizes = element;
            this.hashMapBuilder.put(element, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links());
            return true;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links = this.hashMapBuilder.get(this.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(links);
        this.hashMapBuilder.put(this.getHighSpeedVideoSizes, links.withNext(element));
        this.hashMapBuilder.put(element, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links(this.getHighSpeedVideoSizes));
        this.getHighSpeedVideoSizes = element;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links remove = this.hashMapBuilder.remove(element);
        if (remove == null) {
            return false;
        }
        if (remove.getHasPrevious()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links = this.hashMapBuilder.get(remove.getPrevious());
            kotlin.jvm.internal.Intrinsics.checkNotNull(links);
            this.hashMapBuilder.put(remove.getPrevious(), links.withNext(remove.getNext()));
        } else {
            this.firstElement = remove.getNext();
        }
        if (remove.getHasNext()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links2 = this.hashMapBuilder.get(remove.getNext());
            kotlin.jvm.internal.Intrinsics.checkNotNull(links2);
            this.hashMapBuilder.put(remove.getNext(), links2.withPrevious(remove.getPrevious()));
            return true;
        }
        this.getHighSpeedVideoSizes = remove.getPrevious();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.hashMapBuilder.clear();
        this.firstElement = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
        this.getHighSpeedVideoSizes = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetMutableIterator(this);
    }
}
