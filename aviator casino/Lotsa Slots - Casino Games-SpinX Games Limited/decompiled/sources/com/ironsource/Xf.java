package com.ironsource;

/* loaded from: classes5.dex */
public final class Xf {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f6083a;

    /* JADX WARN: Multi-variable type inference failed */
    public Xf() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String a() {
        return this.f6083a;
    }

    public final java.lang.String b() {
        return this.f6083a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.Xf) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6083a, ((com.ironsource.Xf) obj).f6083a);
    }

    public int hashCode() {
        java.lang.String str = this.f6083a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.f6083a + ")";
    }

    public Xf(java.lang.String str) {
        this.f6083a = str;
    }

    public final com.ironsource.Xf a(java.lang.String str) {
        return new com.ironsource.Xf(str);
    }

    public final void b(java.lang.String str) {
        this.f6083a = str;
    }

    public /* synthetic */ Xf(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ com.ironsource.Xf a(com.ironsource.Xf xf, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xf.f6083a;
        }
        return xf.a(str);
    }
}
