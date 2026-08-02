package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 **\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001*B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0016H\u0016¢\u0006\u0004\b\u0015\u0010\u0018J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "E", "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)V", "element", "", "contains", "(Ljava/lang/Object;)Z", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "remove", "removeAll", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "retainAll", "containsAll", "(Ljava/util/Collection;)Z", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "iterator", "()Ljava/util/Iterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentHashSet<E> extends kotlin.collections.AbstractSet<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> {
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> node;
    private final int size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet getHighSpeedVideoFpsRanges = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.INSTANCE.getEMPTY$runtime(), 0);

    public PersistentHashSet(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection add(java.lang.Object obj) {
        return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet<E>) obj);
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> getNode$runtime() {
        return this.node;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection remove(java.lang.Object obj) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet<E>) obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object element) {
        return this.node.contains(element != null ? element.hashCode() : 0, element, 0);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> add(E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> add = this.node.add(element != null ? element.hashCode() : 0, element, 0);
        return this.node == add ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet(add, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> addAll(java.util.Collection<? extends E> elements) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> remove(E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> remove = this.node.remove(element != null ? element.hashCode() : 0, element, 0);
        return this.node == remove ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet(remove, size() - 1);
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

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection<?> elements) {
        if (elements instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet) {
            return this.node.containsAll(((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet) elements).node, 0);
        }
        if (elements instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) {
            return this.node.containsAll(((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder) elements).getNode$runtime(), 0);
        }
        return super.containsAll(elements);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> clear() {
        return INSTANCE.emptyOf$runtime();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator(this.node);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder<E> builder() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet$Companion;", "", "<init>", "()V", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "emptyOf$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSet;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <E> androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet<E> emptyOf$runtime() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet.getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
