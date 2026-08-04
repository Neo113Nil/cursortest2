package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0878p0 extends AbstractC0859g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4.b0 f12257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC0859g f12258b = b();

    public C0878p0(C0880q0 c0880q0) {
        this.f12257a = new B4.b0(c0880q0);
    }

    @Override // com.google.protobuf.AbstractC0859g
    public final byte a() {
        AbstractC0859g abstractC0859g = this.f12258b;
        if (abstractC0859g == null) {
            throw new NoSuchElementException();
        }
        byte bA = abstractC0859g.a();
        if (!this.f12258b.hasNext()) {
            this.f12258b = b();
        }
        return bA;
    }

    public final C0857f b() {
        B4.b0 b0Var = this.f12257a;
        if (b0Var.hasNext()) {
            return new C0857f(b0Var.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12258b != null;
    }
}
