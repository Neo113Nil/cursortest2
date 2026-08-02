package W0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h<T> extends a<T> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f<T> f33180c;

    /* renamed from: d, reason: collision with root package name */
    private int f33181d;

    /* renamed from: e, reason: collision with root package name */
    private k<? extends T> f33182e;

    /* renamed from: f, reason: collision with root package name */
    private int f33183f;

    public h(@NotNull f<T> fVar, int i11) {
        super(i11, fVar.getF26995b());
        this.f33180c = fVar;
        this.f33181d = fVar.i();
        this.f33183f = -1;
        k();
    }

    private final void i() {
        if (this.f33181d != this.f33180c.i()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        f<T> fVar = this.f33180c;
        Object[] l11 = fVar.l();
        if (l11 == null) {
            this.f33182e = null;
            return;
        }
        int f26995b = (fVar.getF26995b() - 1) & (-32);
        int b11 = b();
        if (b11 > f26995b) {
            b11 = f26995b;
        }
        int m11 = (fVar.m() / 5) + 1;
        k<? extends T> kVar = this.f33182e;
        if (kVar == null) {
            this.f33182e = new k<>(l11, b11, f26995b, m11);
        } else {
            kVar.m(l11, b11, f26995b, m11);
        }
    }

    @Override // W0.a, java.util.ListIterator
    public final void add(T t2) {
        i();
        int b11 = b();
        f<T> fVar = this.f33180c;
        fVar.add(b11, t2);
        e(b() + 1);
        h(fVar.getF26995b());
        this.f33181d = fVar.i();
        this.f33183f = -1;
        k();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        i();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33183f = b();
        k<? extends T> kVar = this.f33182e;
        f<T> fVar = this.f33180c;
        if (kVar == null) {
            Object[] n11 = fVar.n();
            int b11 = b();
            e(b11 + 1);
            return (T) n11[b11];
        }
        if (kVar.hasNext()) {
            e(b() + 1);
            return kVar.next();
        }
        Object[] n12 = fVar.n();
        int b12 = b();
        e(b12 + 1);
        return (T) n12[b12 - kVar.c()];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        i();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f33183f = b() - 1;
        k<? extends T> kVar = this.f33182e;
        f<T> fVar = this.f33180c;
        if (kVar == null) {
            Object[] n11 = fVar.n();
            e(b() - 1);
            return (T) n11[b()];
        }
        if (b() <= kVar.c()) {
            e(b() - 1);
            return kVar.previous();
        }
        Object[] n12 = fVar.n();
        e(b() - 1);
        return (T) n12[b() - kVar.c()];
    }

    @Override // W0.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        i();
        int i11 = this.f33183f;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        f<T> fVar = this.f33180c;
        fVar.b(i11);
        if (this.f33183f < b()) {
            e(this.f33183f);
        }
        h(fVar.getF26995b());
        this.f33181d = fVar.i();
        this.f33183f = -1;
        k();
    }

    @Override // W0.a, java.util.ListIterator
    public final void set(T t2) {
        i();
        int i11 = this.f33183f;
        if (i11 == -1) {
            throw new IllegalStateException();
        }
        f<T> fVar = this.f33180c;
        fVar.set(i11, t2);
        this.f33181d = fVar.i();
        k();
    }
}
