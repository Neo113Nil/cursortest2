package Qf;

import Of.k;
import Pf.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* loaded from: classes10.dex */
public class i<T extends Pf.n> extends ArrayList<T> {
    public T a(int i11) {
        T t2 = (T) super.remove(i11);
        t2.F();
        return t2;
    }

    public T b(int i11, T t2) {
        Nf.b.d(t2);
        T t11 = (T) super.set(i11, t2);
        t11.H(t2);
        return t11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<T> it = ((c) this).iterator();
        while (it.hasNext()) {
            ((Pf.n) it.next()).F();
        }
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = super.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        a(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= remove(it.next());
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate<? super T> predicate) {
        Iterator<T> it = iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (predicate.test((Pf.n) it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        for (int i11 = 0; i11 < size(); i11++) {
            b(i11, (Pf.n) unaryOperator.apply((Pf.n) get(i11)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        Iterator<T> it = iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (!collection.contains((Pf.n) it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Stream map = stream().map(new h());
        int i11 = Of.k.f20362f;
        final String str = "\n";
        return (String) map.collect(Collector.of(new Supplier() { // from class: Of.g
            @Override // java.util.function.Supplier
            public final Object get() {
                return new k.a(str);
            }
        }, new Of.h(), new Of.i(), new Of.j(), new Collector.Characteristics[0]));
    }
}
