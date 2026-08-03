package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class k {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7227a;
    public final java.lang.String b;
    public final com.moloco.sdk.internal.services.bidtoken.f c;

    public k(java.lang.String bidToken, java.lang.String publicKey, com.moloco.sdk.internal.services.bidtoken.f bidTokenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        this.f7227a = bidToken;
        this.b = publicKey;
        this.c = bidTokenConfig;
    }

    public final java.lang.String a() {
        return this.f7227a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final com.moloco.sdk.internal.services.bidtoken.f c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.f7227a;
    }

    public final com.moloco.sdk.internal.services.bidtoken.f e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.k)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.k kVar = (com.moloco.sdk.internal.services.bidtoken.k) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7227a, kVar.f7227a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, kVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, kVar.c);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.f7227a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "BidTokenResponseComponents(bidToken=" + this.f7227a + ", publicKey=" + this.b + ", bidTokenConfig=" + this.c + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.k a(java.lang.String bidToken, java.lang.String publicKey, com.moloco.sdk.internal.services.bidtoken.f bidTokenConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenConfig, "bidTokenConfig");
        return new com.moloco.sdk.internal.services.bidtoken.k(bidToken, publicKey, bidTokenConfig);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.k a(com.moloco.sdk.internal.services.bidtoken.k kVar, java.lang.String str, java.lang.String str2, com.moloco.sdk.internal.services.bidtoken.f fVar, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = kVar.f7227a;
        }
        if ((i & 2) != 0) {
            str2 = kVar.b;
        }
        if ((i & 4) != 0) {
            fVar = kVar.c;
        }
        return kVar.a(str, str2, fVar);
    }
}
