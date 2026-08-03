package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cm {

    /* renamed from: a, reason: collision with root package name */
    public final int f4184a;

    public Cm(int i2) {
        this.f4184a = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io.appmetrica.analytics.impl.Cm) && this.f4184a == ((io.appmetrica.analytics.impl.Cm) obj).f4184a;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f4184a);
    }

    public final java.lang.String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f4184a + ')';
    }
}
