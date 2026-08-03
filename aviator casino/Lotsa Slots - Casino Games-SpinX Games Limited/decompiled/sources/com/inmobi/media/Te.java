package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Te extends com.inmobi.media.Ue {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4976a;
    public final java.util.Map b;
    public final com.inmobi.media.Gk c;
    public final com.inmobi.media.Hi d;
    public final com.inmobi.media.Ni e;
    public final boolean f;

    public Te(java.lang.String url, java.util.Map map, com.inmobi.media.Gk gk, com.inmobi.media.Hi hi, com.inmobi.media.Ni ni, int i) {
        map = (i & 2) != 0 ? null : map;
        gk = (i & 4) != 0 ? null : gk;
        ni = (i & 16) != 0 ? null : ni;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.f4976a = url;
        this.b = map;
        this.c = gk;
        this.d = hi;
        this.e = ni;
        this.f = true;
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
        return this.f4976a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Te)) {
            return false;
        }
        com.inmobi.media.Te te = (com.inmobi.media.Te) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f4976a, te.f4976a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, te.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, te.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, te.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, te.e) && this.f == te.f;
    }

    public final int hashCode() {
        int hashCode = this.f4976a.hashCode() * 31;
        java.util.Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        com.inmobi.media.Gk gk = this.c;
        int hashCode3 = (hashCode2 + (gk == null ? 0 : gk.hashCode())) * 31;
        com.inmobi.media.Hi hi = this.d;
        int hashCode4 = (hashCode3 + (hi == null ? 0 : hi.hashCode())) * 31;
        com.inmobi.media.Ni ni = this.e;
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.f) + ((hashCode4 + (ni != null ? ni.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "PostRequest(url='" + this.f4976a + "', headers=" + this.b + ", body=" + this.d + ", retryPolicy=" + this.e + ", timeouts=" + this.c + ", followRedirects=" + this.f + ")";
    }
}
