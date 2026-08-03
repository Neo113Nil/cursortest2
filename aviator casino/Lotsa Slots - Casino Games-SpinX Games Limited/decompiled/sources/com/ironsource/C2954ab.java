package com.ironsource;

/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2954ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3057g6 f6139a;
    private final com.ironsource.C3057g6 b;
    private final com.ironsource.A2 c;
    private final java.util.Map<java.lang.String, com.ironsource.Bd> d;

    public C2954ab(com.ironsource.C3057g6 c3057g6, com.ironsource.C3057g6 c3057g62, com.ironsource.A2 a2, java.util.Map<java.lang.String, com.ironsource.Bd> providerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        this.f6139a = c3057g6;
        this.b = c3057g62;
        this.c = a2;
        this.d = providerConfig;
    }

    public final com.ironsource.C3057g6 a() {
        return this.f6139a;
    }

    public final com.ironsource.C3057g6 b() {
        return this.b;
    }

    public final com.ironsource.A2 c() {
        return this.c;
    }

    public final java.util.Map<java.lang.String, com.ironsource.Bd> d() {
        return this.d;
    }

    public final com.ironsource.A2 e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C2954ab)) {
            return false;
        }
        com.ironsource.C2954ab c2954ab = (com.ironsource.C2954ab) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6139a, c2954ab.f6139a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2954ab.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2954ab.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2954ab.d);
    }

    public final com.ironsource.C3057g6 f() {
        return this.b;
    }

    public final java.util.Map<java.lang.String, com.ironsource.Bd> g() {
        return this.d;
    }

    public final com.ironsource.C3057g6 h() {
        return this.f6139a;
    }

    public int hashCode() {
        com.ironsource.C3057g6 c3057g6 = this.f6139a;
        int hashCode = (c3057g6 == null ? 0 : c3057g6.hashCode()) * 31;
        com.ironsource.C3057g6 c3057g62 = this.b;
        int hashCode2 = (hashCode + (c3057g62 == null ? 0 : c3057g62.hashCode())) * 31;
        com.ironsource.A2 a2 = this.c;
        return ((hashCode2 + (a2 != null ? a2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public java.lang.String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.f6139a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    public final com.ironsource.C2954ab a(com.ironsource.C3057g6 c3057g6, com.ironsource.C3057g6 c3057g62, com.ironsource.A2 a2, java.util.Map<java.lang.String, com.ironsource.Bd> providerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        return new com.ironsource.C2954ab(c3057g6, c3057g62, a2, providerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.C2954ab a(com.ironsource.C2954ab c2954ab, com.ironsource.C3057g6 c3057g6, com.ironsource.C3057g6 c3057g62, com.ironsource.A2 a2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3057g6 = c2954ab.f6139a;
        }
        if ((i & 2) != 0) {
            c3057g62 = c2954ab.b;
        }
        if ((i & 4) != 0) {
            a2 = c2954ab.c;
        }
        if ((i & 8) != 0) {
            map = c2954ab.d;
        }
        return c2954ab.a(c3057g6, c3057g62, a2, map);
    }
}
