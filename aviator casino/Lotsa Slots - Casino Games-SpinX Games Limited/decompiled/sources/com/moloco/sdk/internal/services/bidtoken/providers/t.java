package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class t {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7244a;
    public final java.lang.Integer b;
    public final java.lang.Boolean c;
    public final com.moloco.sdk.internal.services.A d;

    public t() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.Integer a() {
        return this.f7244a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.Boolean c() {
        return this.c;
    }

    public final com.moloco.sdk.internal.services.A d() {
        return this.d;
    }

    public final java.lang.Integer e() {
        return this.f7244a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.t)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.t tVar = (com.moloco.sdk.internal.services.bidtoken.providers.t) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7244a, tVar.f7244a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, tVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, tVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, tVar.d);
    }

    public final java.lang.Integer f() {
        return this.b;
    }

    public final java.lang.Boolean g() {
        return this.c;
    }

    public final com.moloco.sdk.internal.services.A h() {
        return this.d;
    }

    public int hashCode() {
        java.lang.Integer num = this.f7244a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        com.moloco.sdk.internal.services.A a2 = this.d;
        return hashCode3 + (a2 != null ? a2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.f7244a + ", mobileNetworkCode=" + this.b + ", networkRestricted=" + this.c + ", networkType=" + this.d + ')';
    }

    public t(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, com.moloco.sdk.internal.services.A a2) {
        this.f7244a = num;
        this.b = num2;
        this.c = bool;
        this.d = a2;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.t a(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, com.moloco.sdk.internal.services.A a2) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.t(num, num2, bool, a2);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.t a(com.moloco.sdk.internal.services.bidtoken.providers.t tVar, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, com.moloco.sdk.internal.services.A a2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = tVar.f7244a;
        }
        if ((i & 2) != 0) {
            num2 = tVar.b;
        }
        if ((i & 4) != 0) {
            bool = tVar.c;
        }
        if ((i & 8) != 0) {
            a2 = tVar.d;
        }
        return tVar.a(num, num2, bool, a2);
    }

    public /* synthetic */ t(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, com.moloco.sdk.internal.services.A a2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : a2);
    }
}
