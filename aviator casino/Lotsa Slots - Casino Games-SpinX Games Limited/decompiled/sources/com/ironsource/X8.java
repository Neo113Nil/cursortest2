package com.ironsource;

/* loaded from: classes5.dex */
public final class X8 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6074a;
    private final java.lang.String b;
    private com.ironsource.X c;
    private boolean d;
    private java.lang.String e;
    private java.lang.String f;

    public X8(java.lang.String appKey, java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        this.f6074a = appKey;
        this.b = userId;
    }

    public final java.lang.String a() {
        return this.f6074a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final java.lang.String d() {
        return this.f6074a;
    }

    public final com.ironsource.X e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.X8)) {
            return false;
        }
        com.ironsource.X8 x8 = (com.ironsource.X8) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6074a, x8.f6074a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, x8.b);
    }

    public final java.lang.String f() {
        return this.f;
    }

    public final java.lang.String g() {
        return this.e;
    }

    public final java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        return (this.f6074a.hashCode() * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "InitConfig(appKey=" + this.f6074a + ", userId=" + this.b + ")";
    }

    public final com.ironsource.X8 a(java.lang.String appKey, java.lang.String userId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
        return new com.ironsource.X8(appKey, userId);
    }

    public final void b(java.lang.String str) {
        this.e = str;
    }

    public static /* synthetic */ com.ironsource.X8 a(com.ironsource.X8 x8, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = x8.f6074a;
        }
        if ((i & 2) != 0) {
            str2 = x8.b;
        }
        return x8.a(str, str2);
    }

    public final void a(com.ironsource.X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(java.lang.String str) {
        this.f = str;
    }

    public final <T> T a(com.ironsource.Ib<com.ironsource.X8, T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
