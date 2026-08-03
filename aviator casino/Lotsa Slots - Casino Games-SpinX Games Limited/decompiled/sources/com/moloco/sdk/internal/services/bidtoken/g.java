package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class g {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7223a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    public g(java.lang.String language, java.lang.String osVersion, java.lang.String make, java.lang.String model, java.lang.String hardwareVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(make, "make");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.f7223a = language;
        this.b = osVersion;
        this.c = make;
        this.d = model;
        this.e = hardwareVersion;
    }

    public final java.lang.String a() {
        return this.f7223a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.g)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.g gVar = (com.moloco.sdk.internal.services.bidtoken.g) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7223a, gVar.f7223a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, gVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, gVar.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, gVar.e);
    }

    public final java.lang.String f() {
        return this.e;
    }

    public final java.lang.String g() {
        return this.f7223a;
    }

    public final java.lang.String h() {
        return this.c;
    }

    public int hashCode() {
        return (((((((this.f7223a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String i() {
        return this.d;
    }

    public final java.lang.String j() {
        return this.b;
    }

    public java.lang.String toString() {
        return "BidTokenDeviceRequestInfo(language=" + this.f7223a + ", osVersion=" + this.b + ", make=" + this.c + ", model=" + this.d + ", hardwareVersion=" + this.e + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.g a(java.lang.String language, java.lang.String osVersion, java.lang.String make, java.lang.String model, java.lang.String hardwareVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(make, "make");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        return new com.moloco.sdk.internal.services.bidtoken.g(language, osVersion, make, model, hardwareVersion);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.g a(com.moloco.sdk.internal.services.bidtoken.g gVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f7223a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.b;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = gVar.c;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = gVar.d;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = gVar.e;
        }
        return gVar.a(str, str6, str7, str8, str5);
    }
}
