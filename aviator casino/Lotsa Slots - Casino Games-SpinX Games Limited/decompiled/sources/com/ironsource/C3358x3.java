package com.ironsource;

/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3358x3 {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6826a;
    private java.lang.String b;
    private java.lang.String c;

    public C3358x3(java.lang.String cachedAppKey, java.lang.String cachedUserId, java.lang.String cachedSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f6826a = cachedAppKey;
        this.b = cachedUserId;
        this.c = cachedSettings;
    }

    public final java.lang.String a() {
        return this.f6826a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.f6826a;
    }

    public final java.lang.String e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3358x3)) {
            return false;
        }
        com.ironsource.C3358x3 c3358x3 = (com.ironsource.C3358x3) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6826a, c3358x3.f6826a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3358x3.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3358x3.c);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.f6826a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "CachedResponse(cachedAppKey=" + this.f6826a + ", cachedUserId=" + this.b + ", cachedSettings=" + this.c + ")";
    }

    public final com.ironsource.C3358x3 a(java.lang.String cachedAppKey, java.lang.String cachedUserId, java.lang.String cachedSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new com.ironsource.C3358x3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public static /* synthetic */ com.ironsource.C3358x3 a(com.ironsource.C3358x3 c3358x3, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3358x3.f6826a;
        }
        if ((i & 2) != 0) {
            str2 = c3358x3.b;
        }
        if ((i & 4) != 0) {
            str3 = c3358x3.c;
        }
        return c3358x3.a(str, str2, str3);
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f6826a = str;
    }
}
