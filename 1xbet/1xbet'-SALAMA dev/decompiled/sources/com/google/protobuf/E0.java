package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f12105a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12105a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f12105a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
