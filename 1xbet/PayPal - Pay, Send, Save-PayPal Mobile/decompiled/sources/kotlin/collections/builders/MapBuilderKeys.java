package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u001d\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001e\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lkotlin/collections/builders/MapBuilderKeys;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "", "clear", "()V", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "elements", "addAll", "(Ljava/util/Collection;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "removeAll", "retainAll", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/builders/MapBuilder;", "getHighSpeedVideoSizes", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MapBuilderKeys<E> extends kotlin.collections.AbstractMutableSet<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.collections.builders.MapBuilder<E, ?> getHighSpeedVideoSizes;

    public MapBuilderKeys(kotlin.collections.builders.MapBuilder<E, ?> mapBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
        this.getHighSpeedVideoSizes = mapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object element) {
        return this.getHighSpeedVideoSizes.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object element) {
        return this.getHighSpeedVideoSizes.removeKey$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return this.getHighSpeedVideoSizes.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        this.getHighSpeedVideoSizes.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        this.getHighSpeedVideoSizes.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
