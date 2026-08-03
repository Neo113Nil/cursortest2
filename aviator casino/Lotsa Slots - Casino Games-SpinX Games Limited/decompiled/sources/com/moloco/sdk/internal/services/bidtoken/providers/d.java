package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class d {
    public static final int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f7235a;

    public d(java.lang.Long l) {
        this.f7235a = l;
    }

    public final java.lang.Long a() {
        return this.f7235a;
    }

    public final java.lang.Long b() {
        return this.f7235a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.f7235a, ((com.moloco.sdk.internal.services.bidtoken.providers.d) obj).f7235a);
    }

    public int hashCode() {
        java.lang.Long l = this.f7235a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public java.lang.String toString() {
        return "AppDirInfo(appDirSize=" + this.f7235a + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.d a(java.lang.Long l) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.d(l);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.d a(com.moloco.sdk.internal.services.bidtoken.providers.d dVar, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = dVar.f7235a;
        }
        return dVar.a(l);
    }
}
