package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 /*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0018H\u0016¢\u0006\u0004\b\u0017\u0010\u001aJ#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b'\u0010&R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "firstElement", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "getLastElement$runtime", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentOrderedSet<E> extends kotlin.collections.AbstractSet<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> {
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet getHighSpeedVideoSizes;
    private final java.lang.Object firstElement;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> hashMap;
    private final java.lang.Object lastElement;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.Companion(null);
    public static final int $stable = 8;

    public PersistentOrderedSet(java.lang.Object obj, java.lang.Object obj2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection add(java.lang.Object obj) {
        return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<E>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection remove(java.lang.Object obj) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet<E>) obj);
    }

    /* renamed from: getFirstElement$runtime, reason: from getter */
    public final java.lang.Object getFirstElement() {
        return this.firstElement;
    }

    /* renamed from: getLastElement$runtime, reason: from getter */
    public final java.lang.Object getLastElement() {
        return this.lastElement;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links> getHashMap$runtime() {
        return this.hashMap;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(element, element, this.hashMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links>) element, (E) new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links()));
        }
        java.lang.Object obj = this.lastElement;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links = this.hashMap.get(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNull(links);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(this.firstElement, element, this.hashMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links>) obj, (java.lang.Object) links.withNext(element)).put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) element, (E) new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links(obj)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> addAll(java.util.Collection<? extends E> elements) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> remove(E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links links = this.hashMap.get(element);
        if (links == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap remove = this.hashMap.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<E, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links>) element);
        if (links.getHasPrevious()) {
            V v = remove.get(links.getPrevious());
            kotlin.jvm.internal.Intrinsics.checkNotNull(v);
            remove = remove.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) links.getPrevious(), (java.lang.Object) ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links) v).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            V v2 = remove.get(links.getNext());
            kotlin.jvm.internal.Intrinsics.checkNotNull(v2);
            remove = remove.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) links.getNext(), (java.lang.Object) ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links) v2).withPrevious(links.getPrevious()));
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, remove);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> removeAll(java.util.Collection<? extends E> elements) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder = builder();
        builder.removeAll(elements);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> removeAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder = builder();
        kotlin.collections.CollectionsKt.removeAll(builder, predicate);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> retainAll(java.util.Collection<? extends E> elements) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder = builder();
        builder.retainAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> clear() {
        return INSTANCE.emptyOf$runtime();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "<init>", "()V", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> emptyOf$runtime() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain endOfChain = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
        getHighSpeedVideoSizes = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(endOfChain, endOfChain, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.INSTANCE.emptyOf$runtime());
    }
}
