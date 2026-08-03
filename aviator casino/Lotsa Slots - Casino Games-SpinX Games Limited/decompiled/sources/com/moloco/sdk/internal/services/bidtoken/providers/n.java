package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class n {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.H f7241a;
    public final java.lang.String b;
    public final java.lang.String c;

    public n() {
        this(null, null, null, 7, null);
    }

    public final com.moloco.sdk.internal.services.H a() {
        return this.f7241a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final java.lang.String e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.n)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.n nVar = (com.moloco.sdk.internal.services.bidtoken.providers.n) obj;
        return this.f7241a == nVar.f7241a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, nVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, nVar.c);
    }

    public final com.moloco.sdk.internal.services.H f() {
        return this.f7241a;
    }

    public int hashCode() {
        com.moloco.sdk.internal.services.H h = this.f7241a;
        int hashCode = (h == null ? 0 : h.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DeviceSignalInfo(orientation=" + this.f7241a + ", locale=" + this.b + ", keyboardLocale=" + this.c + ')';
    }

    public n(com.moloco.sdk.internal.services.H h, java.lang.String str, java.lang.String str2) {
        this.f7241a = h;
        this.b = str;
        this.c = str2;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.n a(com.moloco.sdk.internal.services.H h, java.lang.String str, java.lang.String str2) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.n(h, str, str2);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.n a(com.moloco.sdk.internal.services.bidtoken.providers.n nVar, com.moloco.sdk.internal.services.H h, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            h = nVar.f7241a;
        }
        if ((i & 2) != 0) {
            str = nVar.b;
        }
        if ((i & 4) != 0) {
            str2 = nVar.c;
        }
        return nVar.a(h, str, str2);
    }

    public /* synthetic */ n(com.moloco.sdk.internal.services.H h, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : h, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
