package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Sl extends Ul {

    /* renamed from: a, reason: collision with root package name */
    public final int f6856a;

    public Sl(int i) {
        this.f6856a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Sl) && this.f6856a == ((Sl) obj).f6856a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6856a);
    }

    public final String toString() {
        return "Failure(reasonCode=" + this.f6856a + ")";
    }
}
