package com.moloco.sdk.internal.utils;

/* loaded from: classes5.dex */
public final class e {
    public static final com.moloco.sdk.internal.utils.e.a c = new com.moloco.sdk.internal.utils.e.a(null);
    public static final int d = 0;
    public static final int e = 100;

    /* renamed from: a, reason: collision with root package name */
    public final long f7336a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public e(long j, long j2) {
        this.f7336a = j;
        this.b = j2;
    }

    public final long a() {
        return this.f7336a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.f7336a;
    }

    public final long d() {
        return this.b;
    }

    public final java.lang.Integer e() {
        long j = this.b;
        if (j > 0) {
            return java.lang.Integer.valueOf((int) (((j - this.f7336a) * 100) / j));
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.utils.e)) {
            return false;
        }
        com.moloco.sdk.internal.utils.e eVar = (com.moloco.sdk.internal.utils.e) obj;
        return this.f7336a == eVar.f7336a && this.b == eVar.b;
    }

    public int hashCode() {
        return (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7336a) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b);
    }

    public java.lang.String toString() {
        return "StorageInfo(availableBytes=" + this.f7336a + ", totalBytes=" + this.b + ')';
    }

    public final com.moloco.sdk.internal.utils.e a(long j, long j2) {
        return new com.moloco.sdk.internal.utils.e(j, j2);
    }

    public static /* synthetic */ com.moloco.sdk.internal.utils.e a(com.moloco.sdk.internal.utils.e eVar, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = eVar.f7336a;
        }
        if ((i & 2) != 0) {
            j2 = eVar.b;
        }
        return eVar.a(j, j2);
    }
}
