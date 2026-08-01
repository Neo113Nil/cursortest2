package com.inmobi.media;

/* renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3561a7 extends AbstractC3646d7 {

    /* renamed from: a, reason: collision with root package name */
    public final short f7005a;

    public C3561a7(short s) {
        this.f7005a = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3561a7) && this.f7005a == ((C3561a7) obj).f7005a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f7005a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.f7005a) + ")";
    }
}
