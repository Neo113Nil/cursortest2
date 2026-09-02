package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f1020a;

    /* renamed from: b, reason: collision with root package name */
    public int f1021b;

    /* renamed from: c, reason: collision with root package name */
    public int f1022c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1023d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f1024e;

    public e(a aVar, int i2) {
        this.f1024e = aVar;
        this.f1020a = i2;
        this.f1021b = aVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1022c < this.f1021b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f1024e.b(this.f1022c, this.f1020a);
        this.f1022c++;
        this.f1023d = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f1023d) {
            throw new IllegalStateException();
        }
        int i2 = this.f1022c - 1;
        this.f1022c = i2;
        this.f1021b--;
        this.f1023d = false;
        this.f1024e.g(i2);
    }
}
