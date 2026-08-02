package androidx.compose.runtime.external.kotlinx.collections.immutable;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0016J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000b\u0010\u000fJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "element", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PersistentCollection<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<E> {

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder<E> extends java.util.Collection<E>, kotlin.jvm.internal.markers.KMutableCollection {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> add(E element);

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> addAll(java.util.Collection<? extends E> elements);

    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder<E> builder();

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> clear();

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> remove(E element);

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> removeAll(java.util.Collection<? extends E> elements);

    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> removeAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate);

    @Override // java.util.Collection
    androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection<E> retainAll(java.util.Collection<? extends E> elements);
}
