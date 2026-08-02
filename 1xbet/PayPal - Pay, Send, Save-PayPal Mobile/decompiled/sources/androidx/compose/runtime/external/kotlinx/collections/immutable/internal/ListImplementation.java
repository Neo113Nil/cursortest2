package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\tJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00042\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "<init>", "()V", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "", "checkElementIndex$runtime", "(II)V", "checkPositionIndex$runtime", "fromIndex", "toIndex", "checkRangeIndexes$runtime", "(III)V", "", "c", "orderedHashCode$runtime", "(Ljava/util/Collection;)I", "other", "", "orderedEquals$runtime", "(Ljava/util/Collection;Ljava/util/Collection;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListImplementation {
    public static final int $stable = 0;
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation();

    private ListImplementation() {
    }

    @kotlin.jvm.JvmStatic
    public static final void checkElementIndex$runtime(int index, int size) {
        if (index < 0 || index >= size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("index: ");
            sb.append(index);
            sb.append(", size: ");
            sb.append(size);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void checkPositionIndex$runtime(int index, int size) {
        if (index < 0 || index > size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("index: ");
            sb.append(index);
            sb.append(", size: ");
            sb.append(size);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void checkRangeIndexes$runtime(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0 || toIndex > size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex: ");
            sb.append(fromIndex);
            sb.append(", toIndex: ");
            sb.append(toIndex);
            sb.append(", size: ");
            sb.append(size);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (fromIndex <= toIndex) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fromIndex: ");
        sb2.append(fromIndex);
        sb2.append(" > toIndex: ");
        sb2.append(toIndex);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @kotlin.jvm.JvmStatic
    public static final int orderedHashCode$runtime(java.util.Collection<?> c) {
        java.util.Iterator<?> it = c.iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean orderedEquals$runtime(java.util.Collection<?> c, java.util.Collection<?> other) {
        if (c.size() != other.size()) {
            return false;
        }
        java.util.Iterator<?> it = other.iterator();
        java.util.Iterator<?> it2 = c.iterator();
        while (it2.hasNext()) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }
}
