package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f15989a;

    /* renamed from: b, reason: collision with root package name */
    public int f15990b;

    /* renamed from: c, reason: collision with root package name */
    public int f15991c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15992d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q3.d f15993e;

    public h(Q3.d dVar, int i7) {
        this.f15993e = dVar;
        this.f15989a = i7;
        this.f15990b = dVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15991c < this.f15990b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b7 = this.f15993e.b(this.f15991c, this.f15989a);
        this.f15991c++;
        this.f15992d = true;
        return b7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15992d) {
            throw new IllegalStateException();
        }
        int i7 = this.f15991c - 1;
        this.f15991c = i7;
        this.f15990b--;
        this.f15992d = false;
        this.f15993e.h(i7);
    }
}
