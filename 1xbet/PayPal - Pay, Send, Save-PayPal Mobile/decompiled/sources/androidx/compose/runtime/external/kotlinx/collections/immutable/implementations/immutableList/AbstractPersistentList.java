package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001a2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "<init>", "()V", "", "fromIndex", "toIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "subList", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "element", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "(Ljava/util/Collection;)Z", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AbstractPersistentList<E> extends kotlin.collections.AbstractList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection remove(java.lang.Object obj) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList<E>) obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> subList(int fromIndex, int toIndex) {
        return super.subList(fromIndex, toIndex);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> addAll(java.util.Collection<? extends E> elements) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> addAll(int index, java.util.Collection<? extends E> c) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> builder = builder();
        builder.addAll(index, c);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> remove(E element) {
        int indexOf = indexOf(element);
        if (indexOf != -1) {
            return removeAt(indexOf);
        }
        return this;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAll(final java.util.Collection<? extends E> elements) {
        return removeAll((kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean contains;
                contains = elements.contains(obj);
                return java.lang.Boolean.valueOf(contains);
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> retainAll(final java.util.Collection<? extends E> elements) {
        return removeAll((kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList.$r8$lambda$U7ZMT6VTlaC9jhqU6kzXVO_yVKs(elements, obj));
            }
        });
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> clear() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.persistentVectorOf();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object element) {
        return indexOf(element) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(java.util.Collection<?> elements) {
        java.util.Collection<?> collection = elements;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public static /* synthetic */ boolean $r8$lambda$U7ZMT6VTlaC9jhqU6kzXVO_yVKs(java.util.Collection collection, java.lang.Object obj) {
        return !collection.contains(obj);
    }
}
