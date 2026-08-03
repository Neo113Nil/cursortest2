package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class a {
    public static final int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f7234a;
    public final java.lang.Boolean b;
    public final java.lang.Boolean c;
    public final java.lang.Float d;

    public a() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.Boolean a() {
        return this.f7234a;
    }

    public final java.lang.Boolean b() {
        return this.b;
    }

    public final java.lang.Boolean c() {
        return this.c;
    }

    public final java.lang.Float d() {
        return this.d;
    }

    public final java.lang.Boolean e() {
        return this.f7234a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.a)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.a aVar = (com.moloco.sdk.internal.services.bidtoken.providers.a) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7234a, aVar.f7234a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.d, (java.lang.Object) aVar.d);
    }

    public final java.lang.Boolean f() {
        return this.b;
    }

    public final java.lang.Float g() {
        return this.d;
    }

    public final java.lang.Boolean h() {
        return this.c;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f7234a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Boolean bool2 = this.b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        java.lang.Float f = this.d;
        return hashCode3 + (f != null ? f.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AccessibilitySignal(accessibilityCaptioningEnabled=" + this.f7234a + ", accessibilityLargePointerIcon=" + this.b + ", reduceBrightColorsActivated=" + this.c + ", fontScale=" + this.d + ')';
    }

    public a(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Float f) {
        this.f7234a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = f;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.a a(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Float f) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.a(bool, bool2, bool3, f);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.a a(com.moloco.sdk.internal.services.bidtoken.providers.a aVar, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = aVar.f7234a;
        }
        if ((i & 2) != 0) {
            bool2 = aVar.b;
        }
        if ((i & 4) != 0) {
            bool3 = aVar.c;
        }
        if ((i & 8) != 0) {
            f = aVar.d;
        }
        return aVar.a(bool, bool2, bool3, f);
    }

    public /* synthetic */ a(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : f);
    }
}
