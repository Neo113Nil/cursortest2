package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class x {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7245a;

    public x(java.lang.String str) {
        this.f7245a = str;
    }

    public final java.lang.String a() {
        return this.f7245a;
    }

    public final java.lang.String b() {
        return this.f7245a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.x) && kotlin.jvm.internal.Intrinsics.areEqual(this.f7245a, ((com.moloco.sdk.internal.services.bidtoken.providers.x) obj).f7245a);
    }

    public int hashCode() {
        java.lang.String str = this.f7245a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "TestConfigSignal(configJson=" + this.f7245a + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.x a(java.lang.String str) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.x(str);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.x a(com.moloco.sdk.internal.services.bidtoken.providers.x xVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = xVar.f7245a;
        }
        return xVar.a(str);
    }
}
