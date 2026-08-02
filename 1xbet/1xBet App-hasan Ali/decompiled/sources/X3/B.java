package X3;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l4.C2062d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class B extends e {

    /* renamed from: k, reason: collision with root package name */
    public final List f6073k;

    public B(List list) {
        kotlin.jvm.internal.l.f("delegate", list);
        this.f6073k = list;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f6073k.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= n.N(this)) {
            return this.f6073k.get(n.N(this) - i);
        }
        StringBuilder v4 = AbstractC2107A.v(i, "Element index ", " must be in range [");
        v4.append(new C2062d(0, n.N(this), 1));
        v4.append("].");
        throw new IndexOutOfBoundsException(v4.toString());
    }

    @Override // X3.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new A(this, 0);
    }

    @Override // X3.e, java.util.List
    public final ListIterator listIterator() {
        return new A(this, 0);
    }

    @Override // X3.e, java.util.List
    public final ListIterator listIterator(int i) {
        return new A(this, i);
    }
}
