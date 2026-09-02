package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public final int f498b;

    /* renamed from: c, reason: collision with root package name */
    public int f499c;

    /* renamed from: d, reason: collision with root package name */
    public int f500d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f501e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C.e f502f;

    public C0027c(C.e eVar, int i2) {
        this.f502f = eVar;
        this.f498b = i2;
        this.f499c = ((C0025a) eVar.f11d).f494d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f500d < this.f499c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object b2 = this.f502f.b(this.f500d, this.f498b);
        this.f500d++;
        this.f501e = true;
        return b2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f501e) {
            throw new IllegalStateException();
        }
        int i2 = this.f500d - 1;
        this.f500d = i2;
        this.f499c--;
        this.f501e = false;
        this.f502f.c(i2);
    }
}
