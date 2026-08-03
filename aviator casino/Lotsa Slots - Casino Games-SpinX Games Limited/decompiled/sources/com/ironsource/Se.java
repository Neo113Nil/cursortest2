package com.ironsource;

/* loaded from: classes5.dex */
public final class Se {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.P3 f5965a;
    private final com.ironsource.Gd b;
    private final java.util.Map<java.lang.String, com.ironsource.C3185n9> c;

    public Se(com.ironsource.P3 configurations, com.ironsource.Gd providerOrder, java.util.Map<java.lang.String, com.ironsource.C3185n9> providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        this.f5965a = configurations;
        this.b = providerOrder;
        this.c = providerSettings;
    }

    public final com.ironsource.P3 a() {
        return this.f5965a;
    }

    public final com.ironsource.Gd b() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3185n9> c() {
        return this.c;
    }

    public final com.ironsource.P3 d() {
        return this.f5965a;
    }

    public final com.ironsource.Gd e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Se)) {
            return false;
        }
        com.ironsource.Se se = (com.ironsource.Se) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5965a, se.f5965a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, se.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, se.c);
    }

    public final java.util.Map<java.lang.String, com.ironsource.C3185n9> f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.f5965a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public java.lang.String toString() {
        return "ServerResponse2(configurations=" + this.f5965a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    public final com.ironsource.Se a(com.ironsource.P3 configurations, com.ironsource.Gd providerOrder, java.util.Map<java.lang.String, com.ironsource.C3185n9> providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurations, "configurations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        return new com.ironsource.Se(configurations, providerOrder, providerSettings);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.Se a(com.ironsource.Se se, com.ironsource.P3 p3, com.ironsource.Gd gd, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            p3 = se.f5965a;
        }
        if ((i & 2) != 0) {
            gd = se.b;
        }
        if ((i & 4) != 0) {
            map = se.c;
        }
        return se.a(p3, gd, map);
    }
}
