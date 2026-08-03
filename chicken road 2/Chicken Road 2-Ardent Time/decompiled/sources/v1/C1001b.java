package v1;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001b implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f8390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8391b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8392c;

    /* renamed from: d, reason: collision with root package name */
    public int f8393d;

    public C1001b(int i2, int i3, int i4) {
        this.f8390a = i4;
        this.f8391b = i3;
        boolean z2 = false;
        if (i4 <= 0 ? i2 >= i3 : i2 <= i3) {
            z2 = true;
        }
        this.f8392c = z2;
        this.f8393d = z2 ? i2 : i3;
    }

    public final int a() {
        int i2 = this.f8393d;
        if (i2 != this.f8391b) {
            this.f8393d = this.f8390a + i2;
        } else {
            if (!this.f8392c) {
                throw new java.util.NoSuchElementException();
            }
            this.f8392c = false;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8392c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
