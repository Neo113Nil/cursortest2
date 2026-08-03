package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class f {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7222a;

    public f(boolean z) {
        this.f7222a = z;
    }

    public final boolean a() {
        return this.f7222a;
    }

    public final boolean b() {
        return this.f7222a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.services.bidtoken.f) && this.f7222a == ((com.moloco.sdk.internal.services.bidtoken.f) obj).f7222a;
    }

    public int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7222a);
    }

    public java.lang.String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.f7222a + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.f a(boolean z) {
        return new com.moloco.sdk.internal.services.bidtoken.f(z);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.f a(com.moloco.sdk.internal.services.bidtoken.f fVar, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = fVar.f7222a;
        }
        return fVar.a(z);
    }
}
