package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
abstract class zbbf extends com.google.android.gms.internal.p000authapi.zbbm {
    private final int zba;
    private int zbb;

    protected zbbf(int i, int i2) {
        com.google.android.gms.internal.p000authapi.zbbd.zbb(i2, i, "index");
        this.zba = i;
        this.zbb = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zbb;
        this.zbb = i + 1;
        return zba(i);
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zbb - 1;
        this.zbb = i;
        return zba(i);
    }

    protected abstract java.lang.Object zba(int i);

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zbb - 1;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zbb;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zbb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zbb < this.zba;
    }
}
