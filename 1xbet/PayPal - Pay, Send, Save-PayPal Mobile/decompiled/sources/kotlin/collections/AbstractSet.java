package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u0000 \u000e*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractSet<E> extends kotlin.collections.AbstractCollection<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.collections.AbstractSet.Companion INSTANCE = new kotlin.collections.AbstractSet.Companion(null);

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof java.util.Set) {
            return INSTANCE.setEquals$kotlin_stdlib(this, (java.util.Set) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return INSTANCE.unorderedHashCode$kotlin_stdlib(this);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lkotlin/collections/AbstractSet$Companion;", "", "<init>", "()V", "", "c", "", "unorderedHashCode$kotlin_stdlib", "(Ljava/util/Collection;)I", "", "other", "", "setEquals$kotlin_stdlib", "(Ljava/util/Set;Ljava/util/Set;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int unorderedHashCode$kotlin_stdlib(java.util.Collection<?> c) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
            java.util.Iterator<?> it = c.iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        public final boolean setEquals$kotlin_stdlib(java.util.Set<?> c, java.util.Set<?> other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
            if (c.size() != other.size()) {
                return false;
            }
            return c.containsAll(other);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
