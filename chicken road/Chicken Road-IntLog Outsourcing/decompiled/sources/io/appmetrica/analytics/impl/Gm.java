package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final int f6847a;

    public Gm(int i2) {
        this.f6847a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gm) && this.f6847a == ((Gm) obj).f6847a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6847a);
    }

    public final String toString() {
        return B0.o.k(new StringBuilder("StartupUpdateConfig(intervalSeconds="), this.f6847a, ')');
    }
}
