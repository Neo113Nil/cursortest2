package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ij {

    /* renamed from: a, reason: collision with root package name */
    public final C4201x0 f6630a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final C4064s1 j;
    public final Nj k;
    public final String l;
    public final InlineParams m;

    public Ij(C4201x0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i, String creativeType, String creativeId, boolean z, int i2, C4064s1 c4064s1, Nj nj, String str, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.f6630a = placement;
        this.b = markupType;
        this.c = impressionId;
        this.d = telemetryMetadataBlob;
        this.e = i;
        this.f = creativeType;
        this.g = creativeId;
        this.h = z;
        this.i = i2;
        this.j = c4064s1;
        this.k = nj;
        this.l = str;
        this.m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ij)) {
            return false;
        }
        Ij ij = (Ij) obj;
        return Intrinsics.areEqual(this.f6630a, ij.f6630a) && Intrinsics.areEqual(this.b, ij.b) && Intrinsics.areEqual(this.c, ij.c) && Intrinsics.areEqual(this.d, ij.d) && this.e == ij.e && Intrinsics.areEqual(this.f, ij.f) && Intrinsics.areEqual(this.g, ij.g) && this.h == ij.h && this.i == ij.i && Intrinsics.areEqual(this.j, ij.j) && Intrinsics.areEqual(this.k, ij.k) && Intrinsics.areEqual(this.l, ij.l) && Intrinsics.areEqual(this.m, ij.m);
    }

    public final int hashCode() {
        int a2 = Hj.a(this.i, (Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + Hj.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6630a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C4064s1 c4064s1 = this.j;
        int hashCode = (a2 + (c4064s1 == null ? 0 : c4064s1.hashCode())) * 31;
        Nj nj = this.k;
        int hashCode2 = (hashCode + (nj == null ? 0 : Integer.hashCode(nj.f6746a))) * 31;
        String str = this.l;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.m;
        return hashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f6630a + ", markupType=" + this.b + ", impressionId=" + this.c + ", telemetryMetadataBlob=" + this.d + ", internetAvailabilityAdRetryCount=" + this.e + ", creativeType=" + this.f + ", creativeId=" + this.g + ", isRewarded=" + this.h + ", adIndex=" + this.i + ", adUnitTelemetryData=" + this.j + ", renderViewTelemetryData=" + this.k + ", renderViewId=" + this.l + ", inlineParams=" + this.m + ")";
    }
}
