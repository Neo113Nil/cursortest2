package U;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f5839k = n.f5834e.f5838d;

    /* renamed from: l, reason: collision with root package name */
    public int f5840l;

    /* renamed from: m, reason: collision with root package name */
    public int f5841m;

    public final void a(Object[] objArr, int i, int i5) {
        this.f5839k = objArr;
        this.f5840l = i;
        this.f5841m = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5841m < this.f5840l;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
