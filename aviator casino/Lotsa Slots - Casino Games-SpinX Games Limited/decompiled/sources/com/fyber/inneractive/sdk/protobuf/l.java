package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class l implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f4202a = 0;
    public final int b;
    public final /* synthetic */ com.fyber.inneractive.sdk.protobuf.s c;

    public l(com.fyber.inneractive.sdk.protobuf.s sVar) {
        this.c = sVar;
        this.b = sVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4202a < this.b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.f4202a;
        if (i >= this.b) {
            throw new java.util.NoSuchElementException();
        }
        this.f4202a = i + 1;
        return java.lang.Byte.valueOf(this.c.d(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
