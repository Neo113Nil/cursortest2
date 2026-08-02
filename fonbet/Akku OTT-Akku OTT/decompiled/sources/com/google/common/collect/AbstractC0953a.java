package com.google.common.collect;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0953a<E> extends y0<Object> implements ListIterator<Object> {
    public final int a;
    public int b;

    public AbstractC0953a(int i, int i2) {
        com.google.common.base.k.g(i2, i);
        this.a = i;
        this.b = i2;
    }

    public abstract E a(int i);

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
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
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
