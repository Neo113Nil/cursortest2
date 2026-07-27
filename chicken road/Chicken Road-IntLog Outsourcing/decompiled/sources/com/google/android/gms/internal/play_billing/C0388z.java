package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388z extends AbstractC0321c0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f5293a;

    /* renamed from: b, reason: collision with root package name */
    public int f5294b;

    /* renamed from: c, reason: collision with root package name */
    public final C f5295c;

    public C0388z(C c2, int i2) {
        int size = c2.size();
        AbstractC0325d1.u(i2, size);
        this.f5293a = size;
        this.f5294b = i2;
        this.f5295c = c2;
    }

    public final Object a(int i2) {
        return this.f5295c.get(i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5294b < this.f5293a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5294b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f5294b;
        this.f5294b = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5294b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f5294b - 1;
        this.f5294b = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5294b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
