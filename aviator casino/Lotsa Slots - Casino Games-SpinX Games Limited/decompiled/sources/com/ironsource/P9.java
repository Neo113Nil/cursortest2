package com.ironsource;

/* loaded from: classes5.dex */
public final class P9 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5922a;
    private final java.lang.String b;

    public P9(java.lang.String advId, java.lang.String advIdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.f5922a = advId;
        this.b = advIdType;
    }

    public final java.lang.String a() {
        return this.f5922a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.f5922a;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.P9)) {
            return false;
        }
        com.ironsource.P9 p9 = (com.ironsource.P9) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5922a, p9.f5922a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, p9.b);
    }

    public int hashCode() {
        return (this.f5922a.hashCode() * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "IronSourceAdvId(advId=" + this.f5922a + ", advIdType=" + this.b + ")";
    }

    public final com.ironsource.P9 a(java.lang.String advId, java.lang.String advIdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advId, "advId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new com.ironsource.P9(advId, advIdType);
    }

    public static /* synthetic */ com.ironsource.P9 a(com.ironsource.P9 p9, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = p9.f5922a;
        }
        if ((i & 2) != 0) {
            str2 = p9.b;
        }
        return p9.a(str, str2);
    }
}
