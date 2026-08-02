package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class A implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final C f12095a;

    /* renamed from: b, reason: collision with root package name */
    public C f12096b;

    public A(C c3) {
        this.f12095a = c3;
        if (c3.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f12096b = c3.q();
    }

    public static void e(Object obj, Object obj2) {
        C0916m0 c0916m0 = C0916m0.f12232c;
        c0916m0.getClass();
        c0916m0.a(obj.getClass()).a(obj, obj2);
    }

    public final C b() {
        C c3 = c();
        c3.getClass();
        if (C.m(c3, true)) {
            return c3;
        }
        throw new A0();
    }

    public final C c() {
        if (!this.f12096b.n()) {
            return this.f12096b;
        }
        C c3 = this.f12096b;
        c3.getClass();
        C0916m0 c0916m0 = C0916m0.f12232c;
        c0916m0.getClass();
        c0916m0.a(c3.getClass()).b(c3);
        c3.o();
        return this.f12096b;
    }

    public final Object clone() {
        A a2 = (A) this.f12095a.j(5);
        a2.f12096b = c();
        return a2;
    }

    public final void d() {
        if (this.f12096b.n()) {
            return;
        }
        C q7 = this.f12095a.q();
        e(q7, this.f12096b);
        this.f12096b = q7;
    }
}
