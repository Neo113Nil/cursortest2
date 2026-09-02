package X0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f512a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f514c;

    /* renamed from: d, reason: collision with root package name */
    public int f515d;

    public b(int i2, int i3, int i4) {
        this.f512a = i4;
        this.f513b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f514c = z2;
        this.f515d = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f515d;
        if (i2 != this.f513b) {
            this.f515d = this.f512a + i2;
        } else {
            if (!this.f514c) {
                throw new NoSuchElementException();
            }
            this.f514c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f514c;
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
