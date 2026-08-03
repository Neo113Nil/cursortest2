package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253bd {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5576a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5577b;

    public C0253bd(java.lang.String str, boolean z2) {
        this.f5576a = str;
        this.f5577b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0253bd)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0253bd c0253bd = (io.appmetrica.analytics.impl.C0253bd) obj;
        return kotlin.jvm.internal.i.a(this.f5576a, c0253bd.f5576a) && this.f5577b == c0253bd.f5577b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f5576a.hashCode() * 31;
        boolean z2 = this.f5577b;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final java.lang.String toString() {
        return "ModuleStatus(moduleName=" + this.f5576a + ", loaded=" + this.f5577b + ')';
    }
}
