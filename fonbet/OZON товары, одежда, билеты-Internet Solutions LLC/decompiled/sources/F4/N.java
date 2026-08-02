package F4;

import F4.M;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class N<Key, Value> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<M.b.C0187b<Key, Value>> f8834a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f8835b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final L f8836c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8837d;

    public N(@NotNull List<M.b.C0187b<Key, Value>> pages, Integer num, @NotNull L config, int i11) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f8834a = pages;
        this.f8835b = num;
        this.f8836c = config;
        this.f8837d = i11;
    }

    public final Value b(int i11) {
        List<M.b.C0187b<Key, Value>> list = this.f8834a;
        List<M.b.C0187b<Key, Value>> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!((M.b.C0187b) it.next()).b().isEmpty()) {
                int i12 = i11 - this.f8837d;
                int i13 = 0;
                while (i13 < C7714v.P(list) && i12 > C7714v.P(list.get(i13).b())) {
                    i12 -= list.get(i13).b().size();
                    i13++;
                }
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    M.b.C0187b c0187b = (M.b.C0187b) it2.next();
                    if (!c0187b.b().isEmpty()) {
                        ListIterator<M.b.C0187b<Key, Value>> listIterator = list.listIterator(list.size());
                        while (listIterator.hasPrevious()) {
                            M.b.C0187b<Key, Value> previous = listIterator.previous();
                            if (!previous.b().isEmpty()) {
                                return i12 < 0 ? (Value) C7714v.K(c0187b.b()) : (i13 != C7714v.P(list) || i12 <= C7714v.P(((M.b.C0187b) C7714v.X(list)).b())) ? list.get(i13).b().get(i12) : (Value) C7714v.X(previous.b());
                            }
                        }
                        throw new NoSuchElementException("List contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        return null;
    }

    public final M.b.C0187b<Key, Value> c(int i11) {
        List<M.b.C0187b<Key, Value>> list = this.f8834a;
        List<M.b.C0187b<Key, Value>> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!((M.b.C0187b) it.next()).b().isEmpty()) {
                int i12 = i11 - this.f8837d;
                int i13 = 0;
                while (i13 < C7714v.P(list) && i12 > C7714v.P(list.get(i13).b())) {
                    i12 -= list.get(i13).b().size();
                    i13++;
                }
                return i12 < 0 ? (M.b.C0187b) C7714v.K(list) : list.get(i13);
            }
        }
        return null;
    }

    public final Integer d() {
        return this.f8835b;
    }

    @NotNull
    public final List<M.b.C0187b<Key, Value>> e() {
        return this.f8834a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n11 = (N) obj;
        return Intrinsics.d(this.f8834a, n11.f8834a) && Intrinsics.d(this.f8835b, n11.f8835b) && Intrinsics.d(this.f8836c, n11.f8836c) && this.f8837d == n11.f8837d;
    }

    public final int hashCode() {
        int hashCode = this.f8834a.hashCode();
        Integer num = this.f8835b;
        return Integer.hashCode(this.f8837d) + this.f8836c.hashCode() + hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PagingState(pages=");
        sb2.append(this.f8834a);
        sb2.append(", anchorPosition=");
        sb2.append(this.f8835b);
        sb2.append(", config=");
        sb2.append(this.f8836c);
        sb2.append(", leadingPlaceholderCount=");
        return Ek.a.d(sb2, this.f8837d, ')');
    }
}
