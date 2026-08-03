package com.inmobi.media;

/* loaded from: classes5.dex */
public final class D6 extends com.inmobi.media.G6 {

    /* renamed from: a, reason: collision with root package name */
    public final short f4655a;

    public D6(short s) {
        this.f4655a = s;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.D6) && this.f4655a == ((com.inmobi.media.D6) obj).f4655a;
    }

    public final int hashCode() {
        return this.f4655a;
    }

    public final java.lang.String toString() {
        return "Failure(errorCode=" + ((int) this.f4655a) + ")";
    }
}
