package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571id {

    /* renamed from: a, reason: collision with root package name */
    public final String f7541a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7542b;

    public C0571id(String str, boolean z3) {
        this.f7541a = str;
        this.f7542b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0571id)) {
            return false;
        }
        C0571id c0571id = (C0571id) obj;
        return kotlin.jvm.internal.j.a(this.f7541a, c0571id.f7541a) && this.f7542b == c0571id.f7542b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f7541a.hashCode() * 31;
        boolean z3 = this.f7542b;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        return hashCode + i3;
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.f7541a + ", loaded=" + this.f7542b + ')';
    }
}
