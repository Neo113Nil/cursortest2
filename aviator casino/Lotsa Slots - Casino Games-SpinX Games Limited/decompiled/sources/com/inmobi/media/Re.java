package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Re extends com.inmobi.media.Ue {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4939a;
    public final java.util.Map b;
    public final com.inmobi.media.Gk c;
    public final java.util.Map d;
    public final com.inmobi.media.Ni e;
    public final boolean f;

    public Re(java.lang.String url, java.util.HashMap hashMap, com.inmobi.media.Gk gk, java.util.Map map, com.inmobi.media.Ni ni, boolean z, int i) {
        hashMap = (i & 2) != 0 ? null : hashMap;
        gk = (i & 4) != 0 ? null : gk;
        map = (i & 8) != 0 ? null : map;
        ni = (i & 16) != 0 ? null : ni;
        z = (i & 32) != 0 ? true : z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f4939a = url;
        this.b = hashMap;
        this.c = gk;
        this.d = map;
        this.e = ni;
        this.f = z;
        java.lang.String a2 = com.inmobi.media.AbstractC2276af.a(url, map);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "<set-?>");
        this.f4939a = a2;
    }

    @Override // com.inmobi.media.Ue
    public final java.util.Map a() {
        return this.b;
    }

    @Override // com.inmobi.media.Ue
    public final com.inmobi.media.Ni b() {
        return this.e;
    }

    @Override // com.inmobi.media.Ue
    public final java.lang.String c() {
        return this.f4939a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Re)) {
            return false;
        }
        com.inmobi.media.Re re = (com.inmobi.media.Re) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4939a, re.f4939a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, re.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, re.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, re.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, re.e) && this.f == re.f;
    }

    public final int hashCode() {
        int hashCode = this.f4939a.hashCode() * 31;
        java.util.Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        com.inmobi.media.Gk gk = this.c;
        int hashCode3 = (hashCode2 + (gk == null ? 0 : gk.hashCode())) * 31;
        java.util.Map map2 = this.d;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        com.inmobi.media.Ni ni = this.e;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f) + ((hashCode4 + (ni != null ? ni.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "GetRequest(url='" + this.f4939a + "', headers=" + this.b + ", queryParams=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
