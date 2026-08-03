package com.moloco.sdk.acm.db;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f6876a;
    public final java.lang.String b;
    public final long c;
    public final com.moloco.sdk.acm.db.c d;
    public final java.lang.Long e;
    public final java.util.List<java.lang.String> f;

    public b(long j, java.lang.String name, long j2, com.moloco.sdk.acm.db.c eventType, java.lang.Long l, java.util.List<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        this.f6876a = j;
        this.b = name;
        this.c = j2;
        this.d = eventType;
        this.e = l;
        this.f = tags;
    }

    public final long a() {
        return this.f6876a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final com.moloco.sdk.acm.db.c d() {
        return this.d;
    }

    public final java.lang.Long e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.acm.db.b)) {
            return false;
        }
        com.moloco.sdk.acm.db.b bVar = (com.moloco.sdk.acm.db.b) obj;
        return this.f6876a == bVar.f6876a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, bVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, bVar.f);
    }

    public final java.util.List<java.lang.String> f() {
        return this.f;
    }

    public final java.lang.Long g() {
        return this.e;
    }

    public final com.moloco.sdk.acm.db.c h() {
        return this.d;
    }

    public int hashCode() {
        int m = ((((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f6876a) * 31) + this.b.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c)) * 31) + this.d.hashCode()) * 31;
        java.lang.Long l = this.e;
        return ((m + (l == null ? 0 : l.hashCode())) * 31) + this.f.hashCode();
    }

    public final long i() {
        return this.f6876a;
    }

    public final java.lang.String j() {
        return this.b;
    }

    public final java.util.List<java.lang.String> k() {
        return this.f;
    }

    public final long l() {
        return this.c;
    }

    public java.lang.String toString() {
        return "EventEntity(id=" + this.f6876a + ", name=" + this.b + ", timestamp=" + this.c + ", eventType=" + this.d + ", data=" + this.e + ", tags=" + this.f + ')';
    }

    public final com.moloco.sdk.acm.db.b a(long j, java.lang.String name, long j2, com.moloco.sdk.acm.db.c eventType, java.lang.Long l, java.util.List<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "tags");
        return new com.moloco.sdk.acm.db.b(j, name, j2, eventType, l, tags);
    }

    public /* synthetic */ b(long j, java.lang.String str, long j2, com.moloco.sdk.acm.db.c cVar, java.lang.Long l, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, cVar, (i & 16) != 0 ? null : l, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }
}
