package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lkotlin/collections/builders/AbstractMapBuilderEntrySet;", "", "E", "K", "V", "Lkotlin/collections/AbstractMutableSet;", "<init>", "()V", "element", "", "contains", "(Ljava/util/Map$Entry;)Z", "containsEntry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractMapBuilderEntrySet<E extends java.util.Map.Entry<? extends K, ? extends V>, K, V> extends kotlin.collections.AbstractMutableSet<E> {
    public abstract boolean containsEntry(java.util.Map.Entry<? extends K, ? extends V> element);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return contains((kotlin.collections.builders.AbstractMapBuilderEntrySet<E, K, V>) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return remove((java.util.Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(java.util.Map.Entry<?, ?> entry) {
        return super.remove((java.lang.Object) entry);
    }

    public final boolean contains(E element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return containsEntry(element);
    }
}
