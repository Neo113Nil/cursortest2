package com.inmobi.media;

/* renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2781ti {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2816v0 f5469a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final boolean h;
    public final int i;
    public final com.inmobi.media.C2684q1 j;
    public final com.inmobi.media.C2911yi k;
    public final java.lang.String l;
    public final com.inmobi.media.ads.network.common.model.InlineParams m;

    public C2781ti(com.inmobi.media.C2816v0 placement, java.lang.String markupType, java.lang.String impressionId, java.lang.String telemetryMetadataBlob, int i, java.lang.String creativeType, java.lang.String creativeId, boolean z, int i2, com.inmobi.media.C2684q1 c2684q1, com.inmobi.media.C2911yi c2911yi, java.lang.String str, com.inmobi.media.ads.network.common.model.InlineParams inlineParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markupType, "markupType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.f5469a = placement;
        this.b = markupType;
        this.c = impressionId;
        this.d = telemetryMetadataBlob;
        this.e = i;
        this.f = creativeType;
        this.g = creativeId;
        this.h = z;
        this.i = i2;
        this.j = c2684q1;
        this.k = c2911yi;
        this.l = str;
        this.m = inlineParams;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2781ti)) {
            return false;
        }
        com.inmobi.media.C2781ti c2781ti = (com.inmobi.media.C2781ti) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5469a, c2781ti.f5469a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2781ti.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2781ti.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2781ti.d) && this.e == c2781ti.e && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2781ti.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c2781ti.g) && this.h == c2781ti.h && this.i == c2781ti.i && kotlin.jvm.internal.Intrinsics.areEqual(this.j, c2781ti.j) && kotlin.jvm.internal.Intrinsics.areEqual(this.k, c2781ti.k) && kotlin.jvm.internal.Intrinsics.areEqual(this.l, c2781ti.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, c2781ti.m);
    }

    public final int hashCode() {
        int a2 = com.inmobi.media.AbstractC2755si.a(this.i, (kotlin.UByte$$ExternalSyntheticBackport0.m(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + com.inmobi.media.AbstractC2755si.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5469a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        com.inmobi.media.C2684q1 c2684q1 = this.j;
        int hashCode = (a2 + (c2684q1 == null ? 0 : c2684q1.hashCode())) * 31;
        com.inmobi.media.C2911yi c2911yi = this.k;
        int i = (hashCode + (c2911yi == null ? 0 : c2911yi.f5573a)) * 31;
        java.lang.String str = this.l;
        int hashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        com.inmobi.media.ads.network.common.model.InlineParams inlineParams = this.m;
        return hashCode2 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "RenderViewMetaData(placement=" + this.f5469a + ", markupType=" + this.b + ", impressionId=" + this.c + ", telemetryMetadataBlob=" + this.d + ", internetAvailabilityAdRetryCount=" + this.e + ", creativeType=" + this.f + ", creativeId=" + this.g + ", isRewarded=" + this.h + ", adIndex=" + this.i + ", adUnitTelemetryData=" + this.j + ", renderViewTelemetryData=" + this.k + ", renderViewId=" + this.l + ", inlineParams=" + this.m + ")";
    }
}
