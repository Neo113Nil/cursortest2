package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class r {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f7243a;
    public final java.lang.Long b;
    public final java.lang.Long c;

    public r() {
        this(null, null, null, 7, null);
    }

    public final java.lang.Boolean a() {
        return this.f7243a;
    }

    public final java.lang.Long b() {
        return this.b;
    }

    public final java.lang.Long c() {
        return this.c;
    }

    public final java.lang.Boolean d() {
        return this.f7243a;
    }

    public final java.lang.Long e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.r)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.r rVar = (com.moloco.sdk.internal.services.bidtoken.providers.r) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7243a, rVar.f7243a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, rVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, rVar.c);
    }

    public final java.lang.Long f() {
        return this.c;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f7243a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.Long l2 = this.c;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.f7243a + ", threshold=" + this.b + ", totalMem=" + this.c + ')';
    }

    public r(java.lang.Boolean bool, java.lang.Long l, java.lang.Long l2) {
        this.f7243a = bool;
        this.b = l;
        this.c = l2;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.r a(java.lang.Boolean bool, java.lang.Long l, java.lang.Long l2) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.r(bool, l, l2);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.r a(com.moloco.sdk.internal.services.bidtoken.providers.r rVar, java.lang.Boolean bool, java.lang.Long l, java.lang.Long l2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = rVar.f7243a;
        }
        if ((i & 2) != 0) {
            l = rVar.b;
        }
        if ((i & 4) != 0) {
            l2 = rVar.c;
        }
        return rVar.a(bool, l, l2);
    }

    public /* synthetic */ r(java.lang.Boolean bool, java.lang.Long l, java.lang.Long l2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }
}
