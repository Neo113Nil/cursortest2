package W0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC7696c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class b<E> extends AbstractC7696c<E> implements V0.c<E> {

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<E, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<E> f33162b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f33162b = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f33162b.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, V0.c
    @NotNull
    public V0.c<E> addAll(@NotNull Collection<? extends E> collection) {
        f d11 = d();
        d11.addAll(collection);
        return d11.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, V0.c
    @NotNull
    public final V0.c<E> remove(E e11) {
        int indexOf = indexOf(e11);
        return indexOf != -1 ? d1(indexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, V0.c
    @NotNull
    public final V0.c<E> removeAll(@NotNull Collection<? extends E> collection) {
        return s0(new a(collection));
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    public final List subList(int i11, int i12) {
        return super.subList(i11, i12);
    }
}
