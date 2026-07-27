package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final int f6002a;

    public Gm(int i3) {
        this.f6002a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gm) && this.f6002a == ((Gm) obj).f6002a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6002a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.f6002a + ')';
    }
}
