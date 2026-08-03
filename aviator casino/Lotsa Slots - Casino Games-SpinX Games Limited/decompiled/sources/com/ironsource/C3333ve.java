package com.ironsource;

/* renamed from: com.ironsource.ve, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3333ve {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6786a;
    private final java.lang.String b;
    private final java.util.List<com.ironsource.mediationsdk.IronSource.a> c;

    public C3333ve(java.lang.String appKey, java.lang.String str, java.util.List<com.ironsource.mediationsdk.IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f6786a = appKey;
        this.b = str;
        this.c = legacyAdFormats;
    }

    public final java.lang.String a() {
        return this.f6786a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.util.List<com.ironsource.mediationsdk.IronSource.a> c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.f6786a;
    }

    public final java.util.List<com.ironsource.mediationsdk.IronSource.a> e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3333ve)) {
            return false;
        }
        com.ironsource.C3333ve c3333ve = (com.ironsource.C3333ve) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6786a, c3333ve.f6786a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3333ve.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3333ve.c);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f6786a.hashCode() * 31;
        java.lang.String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "SdkInitRequest(appKey=" + this.f6786a + ", userId=" + this.b + ", legacyAdFormats=" + this.c + ")";
    }

    public final com.ironsource.C3333ve a(java.lang.String appKey, java.lang.String str, java.util.List<com.ironsource.mediationsdk.IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new com.ironsource.C3333ve(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.C3333ve a(com.ironsource.C3333ve c3333ve, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3333ve.f6786a;
        }
        if ((i & 2) != 0) {
            str2 = c3333ve.b;
        }
        if ((i & 4) != 0) {
            list = c3333ve.c;
        }
        return c3333ve.a(str, str2, list);
    }

    public final void a(java.util.List<? extends com.ironsource.mediationsdk.IronSource.a> adFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.c.clear();
        this.c.addAll(adFormats);
    }

    public /* synthetic */ C3333ve(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }
}
