package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0922p0 extends AbstractC0903g {

    /* renamed from: a, reason: collision with root package name */
    public final B4.b0 f12257a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0903g f12258b = b();

    public C0922p0(C0924q0 c0924q0) {
        this.f12257a = new B4.b0(c0924q0);
    }

    @Override // com.google.protobuf.AbstractC0903g
    public final byte a() {
        AbstractC0903g abstractC0903g = this.f12258b;
        if (abstractC0903g == null) {
            throw new NoSuchElementException();
        }
        byte a2 = abstractC0903g.a();
        if (!this.f12258b.hasNext()) {
            this.f12258b = b();
        }
        return a2;
    }

    public final C0901f b() {
        B4.b0 b0Var = this.f12257a;
        if (b0Var.hasNext()) {
            return new C0901f(b0Var.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12258b != null;
    }
}
