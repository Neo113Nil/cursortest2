package s2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10348c;

    /* renamed from: d, reason: collision with root package name */
    public int f10349d;

    public b(int i3, int i4, int i5) {
        this.f10346a = i5;
        this.f10347b = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f10348c = z3;
        this.f10349d = z3 ? i3 : i4;
    }

    public final int a() {
        int i3 = this.f10349d;
        if (i3 != this.f10347b) {
            this.f10349d = this.f10346a + i3;
            return i3;
        }
        if (!this.f10348c) {
            throw new NoSuchElementException();
        }
        this.f10348c = false;
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10348c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
