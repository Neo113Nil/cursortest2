package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
abstract class an extends com.google.android.play.integrity.internal.aw {

    /* renamed from: a, reason: collision with root package name */
    private final int f3844a;
    private int b;

    protected an(int i, int i2) {
        com.google.android.play.integrity.internal.al.b(i2, i, "index");
        this.f3844a = i;
        this.b = i2;
    }

    protected abstract java.lang.Object a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.f3844a;
    }
}
