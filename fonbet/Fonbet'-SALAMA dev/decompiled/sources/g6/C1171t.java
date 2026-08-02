package g6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g6.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1171t implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public int f13305a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13306b;

    /* renamed from: c, reason: collision with root package name */
    public int f13307c;

    /* renamed from: d, reason: collision with root package name */
    public int f13308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1172u f13309e;

    public C1171t(C1172u c1172u) {
        this.f13309e = c1172u;
        this.f13307c = c1172u.l();
        this.f13308d = c1172u.f13312c;
    }

    public final boolean a() {
        this.f13305a = 3;
        int i7 = this.f13307c;
        if (i7 == 0) {
            this.f13305a = 2;
        } else {
            C1172u c1172u = this.f13309e;
            Object[] objArr = c1172u.f13310a;
            int i8 = this.f13308d;
            this.f13306b = objArr[i8];
            this.f13305a = 1;
            this.f13308d = (i8 + 1) % c1172u.f13311b;
            this.f13307c = i7 - 1;
        }
        return this.f13305a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f13305a;
        if (i7 == 0) {
            return a();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f13305a;
        if (i7 == 1) {
            this.f13305a = 0;
            return this.f13306b;
        }
        if (i7 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f13305a = 0;
        return this.f13306b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
