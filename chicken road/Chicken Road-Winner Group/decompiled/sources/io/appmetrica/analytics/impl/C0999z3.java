package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999z3 implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7 f8658b;

    public C0999z3(Map<String, String> map, Y7 y7) {
        this.f8657a = map;
        this.f8658b = y7;
    }

    public final C0999z3 a(Map<String, String> map, Y7 y7) {
        return new C0999z3(map, y7);
    }

    public final Map<String, String> b() {
        return this.f8657a;
    }

    public final Y7 c() {
        return this.f8658b;
    }

    public final Map<String, String> d() {
        return this.f8657a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0999z3)) {
            return false;
        }
        C0999z3 c0999z3 = (C0999z3) obj;
        return kotlin.jvm.internal.j.a(this.f8657a, c0999z3.f8657a) && this.f8658b == c0999z3.f8658b;
    }

    public final int hashCode() {
        Map map = this.f8657a;
        return this.f8658b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f8657a + ", source=" + this.f8658b + ')';
    }

    public static C0999z3 a(C0999z3 c0999z3, Map map, Y7 y7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = c0999z3.f8657a;
        }
        if ((i3 & 2) != 0) {
            y7 = c0999z3.f8658b;
        }
        c0999z3.getClass();
        return new C0999z3(map, y7);
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f8658b;
    }
}
