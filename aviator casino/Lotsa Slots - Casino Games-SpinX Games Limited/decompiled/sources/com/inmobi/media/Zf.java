package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Zf {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5085a;
    public final java.lang.String b;
    public final java.util.Map c;
    public final boolean d;
    public final java.lang.String e;
    public final boolean f;
    public final int g;
    public final java.lang.String h;
    public final long i;
    public final java.lang.Long j;
    public final com.inmobi.media.C2781ti k;

    public Zf(java.lang.String url, java.lang.String id, java.util.Map headers, boolean z, java.lang.String priority, boolean z2, int i, java.lang.String ownerId, long j, java.lang.Long l, com.inmobi.media.C2781ti c2781ti) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priority, "priority");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        this.f5085a = url;
        this.b = id;
        this.c = headers;
        this.d = z;
        this.e = priority;
        this.f = z2;
        this.g = i;
        this.h = ownerId;
        this.i = j;
        this.j = l;
        this.k = c2781ti;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Zf)) {
            return false;
        }
        com.inmobi.media.Zf zf = (com.inmobi.media.Zf) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5085a, zf.f5085a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, zf.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, zf.c) && this.d == zf.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, zf.e) && this.f == zf.f && this.g == zf.g && kotlin.jvm.internal.Intrinsics.areEqual(this.h, zf.h) && this.i == zf.i && kotlin.jvm.internal.Intrinsics.areEqual(this.j, zf.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, zf.k);
    }

    public final int hashCode() {
        int m = (kotlin.UByte$$ExternalSyntheticBackport0.m(this.i) + ((this.h.hashCode() + com.inmobi.media.AbstractC2755si.a(this.g, (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f) + ((this.e.hashCode() + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5085a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        java.lang.Long l = this.j;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        com.inmobi.media.C2781ti c2781ti = this.k;
        return hashCode + (c2781ti != null ? c2781ti.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Ping(url=" + this.f5085a + ", id=" + this.b + ", headers=" + this.c + ", allowRedirects=" + this.d + ", priority=" + this.e + ", ackRequired=" + this.f + ", retryCount=" + this.g + ", ownerId=" + this.h + ", createdAt=" + this.i + ", retryAfterTimestamp=" + this.j + ", telemetryData=" + this.k + ")";
    }
}
