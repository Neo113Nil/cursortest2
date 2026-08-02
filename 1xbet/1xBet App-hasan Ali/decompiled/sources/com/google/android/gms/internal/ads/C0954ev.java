package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.ev, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954ev extends Lv implements ListIterator {

    /* renamed from: l, reason: collision with root package name */
    public final int f13379l;

    /* renamed from: m, reason: collision with root package name */
    public int f13380m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1044gv f13381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0954ev(AbstractC1044gv abstractC1044gv, int i) {
        super(0);
        int size = abstractC1044gv.size();
        AbstractC1400ot.B(i, size);
        this.f13379l = size;
        this.f13380m = i;
        this.f13381n = abstractC1044gv;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object b(int i) {
        return this.f13381n.get(i);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13380m < this.f13379l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13380m > 0;
    }

    @Override // com.google.android.gms.internal.ads.Lv, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13380m;
        this.f13380m = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13380m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f13380m - 1;
        this.f13380m = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13380m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
