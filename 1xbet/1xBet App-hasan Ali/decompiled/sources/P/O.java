package P;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class O implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4360k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final M0 f4361l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4362m;

    /* renamed from: n, reason: collision with root package name */
    public int f4363n;

    /* renamed from: o, reason: collision with root package name */
    public int f4364o;

    public O(M0 m02, int i, int i5) {
        this.f4361l = m02;
        this.f4362m = i5;
        this.f4363n = i;
        this.f4364o = m02.f4350r;
        if (m02.f4349q) {
            O0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4360k) {
            case 0:
                return this.f4363n < this.f4362m;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4360k) {
            case 0:
                M0 m02 = this.f4361l;
                int i = m02.f4350r;
                int i5 = this.f4364o;
                if (i != i5) {
                    O0.f();
                }
                int i6 = this.f4363n;
                this.f4363n = O0.a(m02.f4343k, i6) + i6;
                return new N0(m02, i6, i5);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4360k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public O(M0 m02, int i, P p5, AbstractC0329z abstractC0329z) {
        this.f4361l = m02;
        this.f4362m = i;
        this.f4363n = m02.f4350r;
    }
}
