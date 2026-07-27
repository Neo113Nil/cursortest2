package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class A3 implements W7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0999z3 f5668a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5669b;

    public A3(C0999z3 c0999z3, List<C0999z3> list) {
        this.f5668a = c0999z3;
        this.f5669b = list;
    }

    public final A3 a(C0999z3 c0999z3, List<C0999z3> list) {
        return new A3(c0999z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final Object b() {
        return this.f5668a;
    }

    public final C0999z3 c() {
        return this.f5668a;
    }

    public final List<C0999z3> d() {
        return this.f5669b;
    }

    public final C0999z3 e() {
        return this.f5668a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A3)) {
            return false;
        }
        A3 a3 = (A3) obj;
        return kotlin.jvm.internal.j.a(this.f5668a, a3.f5668a) && kotlin.jvm.internal.j.a(this.f5669b, a3.f5669b);
    }

    public final int hashCode() {
        return this.f5669b.hashCode() + (this.f5668a.hashCode() * 31);
    }

    public final String toString() {
        return "ClidsInfo(chosen=" + this.f5668a + ", candidates=" + this.f5669b + ')';
    }

    public static A3 a(A3 a3, C0999z3 c0999z3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            c0999z3 = a3.f5668a;
        }
        if ((i3 & 2) != 0) {
            list = a3.f5669b;
        }
        a3.getClass();
        return new A3(c0999z3, list);
    }

    @Override // io.appmetrica.analytics.impl.W7
    public final List<C0999z3> a() {
        return this.f5669b;
    }
}
