package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Qb extends Sb {

    /* renamed from: a, reason: collision with root package name */
    public final int f6800a;

    public Qb(int i) {
        this.f6800a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qb) && this.f6800a == ((Qb) obj).f6800a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6800a);
    }

    public final String toString() {
        return "InValid(errorCode=" + this.f6800a + ")";
    }
}
