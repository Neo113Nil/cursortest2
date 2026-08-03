package com.ironsource;

/* loaded from: classes5.dex */
public final class Qc {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5939a;
    private final java.lang.String b;

    public Qc(java.lang.String url, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f5939a = url;
        this.b = str;
    }

    public final java.lang.String a() {
        return this.f5939a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final java.lang.String d() {
        return this.f5939a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.Qc)) {
            return false;
        }
        com.ironsource.Qc qc = (com.ironsource.Qc) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5939a, qc.f5939a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, qc.b);
    }

    public int hashCode() {
        int hashCode = this.f5939a.hashCode() * 31;
        java.lang.String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "OpenUrl(url=" + this.f5939a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ Qc(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final com.ironsource.Qc a(java.lang.String url, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.ironsource.Qc(url, str);
    }

    public static /* synthetic */ com.ironsource.Qc a(com.ironsource.Qc qc, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = qc.f5939a;
        }
        if ((i & 2) != 0) {
            str2 = qc.b;
        }
        return qc.a(str, str2);
    }
}
