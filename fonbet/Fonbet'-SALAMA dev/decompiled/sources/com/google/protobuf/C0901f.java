package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0901f extends AbstractC0903g {

    /* renamed from: a, reason: collision with root package name */
    public int f12182a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f12183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0911k f12184c;

    public C0901f(AbstractC0911k abstractC0911k) {
        this.f12184c = abstractC0911k;
        this.f12183b = abstractC0911k.size();
    }

    @Override // com.google.protobuf.AbstractC0903g
    public final byte a() {
        int i7 = this.f12182a;
        if (i7 >= this.f12183b) {
            throw new NoSuchElementException();
        }
        this.f12182a = i7 + 1;
        return this.f12184c.D(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12182a < this.f12183b;
    }
}
