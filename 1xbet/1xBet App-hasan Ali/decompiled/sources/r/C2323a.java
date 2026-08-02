package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2323a implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public int f18980k;

    /* renamed from: l, reason: collision with root package name */
    public int f18981l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f18983n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f18984o;

    public C2323a(int i) {
        this.f18980k = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18981l < this.f18980k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f18981l;
        switch (this.f18983n) {
            case 0:
                f = ((C2327e) this.f18984o).f(i);
                break;
            case 1:
                f = ((C2327e) this.f18984o).i(i);
                break;
            default:
                f = ((C2328f) this.f18984o).f18995l[i];
                break;
        }
        this.f18981l++;
        this.f18982m = true;
        return f;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f18982m) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f18981l - 1;
        this.f18981l = i;
        switch (this.f18983n) {
            case 0:
                ((C2327e) this.f18984o).g(i);
                break;
            case 1:
                ((C2327e) this.f18984o).g(i);
                break;
            default:
                ((C2328f) this.f18984o).c(i);
                break;
        }
        this.f18980k--;
        this.f18982m = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2323a(C2328f c2328f) {
        this(c2328f.f18996m);
        this.f18983n = 2;
        this.f18984o = c2328f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2323a(C2327e c2327e, int i) {
        this(c2327e.f18961m);
        this.f18983n = i;
        switch (i) {
            case 1:
                this.f18984o = c2327e;
                this(c2327e.f18961m);
                break;
            default:
                this.f18984o = c2327e;
                break;
        }
    }
}
