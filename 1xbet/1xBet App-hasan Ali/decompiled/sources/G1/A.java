package G1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import r.AbstractC2339q;
import r.S;

/* loaded from: classes.dex */
public final class A implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public int f1812k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f1814m;

    public A(B b3) {
        this.f1814m = b3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1812k + 1 < this.f1814m.f1816t.j();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1813l = true;
        S s2 = this.f1814m.f1816t;
        int i = this.f1812k + 1;
        this.f1812k = i;
        return (y) s2.k(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1813l) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        B b3 = this.f1814m;
        int i = this.f1812k;
        S s2 = b3.f1816t;
        ((y) s2.k(i)).f1965l = null;
        int i5 = this.f1812k;
        Object[] objArr = s2.f18964m;
        Object obj = objArr[i5];
        Object obj2 = AbstractC2339q.f19035c;
        if (obj != obj2) {
            objArr[i5] = obj2;
            s2.f18962k = true;
        }
        this.f1812k = i5 - 1;
        this.f1813l = false;
    }
}
