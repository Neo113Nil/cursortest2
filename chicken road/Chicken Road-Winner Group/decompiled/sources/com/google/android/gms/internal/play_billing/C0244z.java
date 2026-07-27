package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244z extends AbstractC0174b0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f2856a;

    /* renamed from: b, reason: collision with root package name */
    public int f2857b;

    /* renamed from: c, reason: collision with root package name */
    public final C f2858c;

    public C0244z(C c3, int i3) {
        int size = c3.size();
        AbstractC0181d1.q(i3, size);
        this.f2856a = size;
        this.f2857b = i3;
        this.f2858c = c3;
    }

    public final Object a(int i3) {
        return this.f2858c.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2857b < this.f2856a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2857b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2857b;
        this.f2857b = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2857b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2857b - 1;
        this.f2857b = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2857b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
