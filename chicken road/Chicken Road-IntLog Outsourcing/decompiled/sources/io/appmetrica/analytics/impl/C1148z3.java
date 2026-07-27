package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148z3 implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9617a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7 f9618b;

    public C1148z3(Map<String, String> map, Y7 y7) {
        this.f9617a = map;
        this.f9618b = y7;
    }

    public final C1148z3 a(Map<String, String> map, Y7 y7) {
        return new C1148z3(map, y7);
    }

    public final Map<String, String> b() {
        return this.f9617a;
    }

    public final Y7 c() {
        return this.f9618b;
    }

    public final Map<String, String> d() {
        return this.f9617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148z3)) {
            return false;
        }
        C1148z3 c1148z3 = (C1148z3) obj;
        return kotlin.jvm.internal.i.a(this.f9617a, c1148z3.f9617a) && this.f9618b == c1148z3.f9618b;
    }

    public final int hashCode() {
        Map map = this.f9617a;
        return this.f9618b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    public final String toString() {
        return "Candidate(clids=" + this.f9617a + ", source=" + this.f9618b + ')';
    }

    public static C1148z3 a(C1148z3 c1148z3, Map map, Y7 y7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = c1148z3.f9617a;
        }
        if ((i2 & 2) != 0) {
            y7 = c1148z3.f9618b;
        }
        c1148z3.getClass();
        return new C1148z3(map, y7);
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f9618b;
    }
}
