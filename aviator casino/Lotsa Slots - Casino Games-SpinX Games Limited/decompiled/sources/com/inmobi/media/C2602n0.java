package com.inmobi.media;

/* renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2602n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5345a;
    public final java.util.Map b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.Map f;
    public final java.lang.String g;
    public final boolean h;

    public C2602n0(java.lang.String clientRequestId, java.util.Map map, long j, java.lang.String monetizationContext, java.lang.String str, java.util.Map map2, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientRequestId, "clientRequestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("im", "integrationTypeString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monetizationContext, "monetizationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("unifiedSdkJson", "adFormat");
        this.f5345a = clientRequestId;
        this.b = map;
        this.c = j;
        this.d = monetizationContext;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2602n0)) {
            return false;
        }
        com.inmobi.media.C2602n0 c2602n0 = (com.inmobi.media.C2602n0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5345a, c2602n0.f5345a) && kotlin.jvm.internal.Intrinsics.areEqual("im", "im") && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2602n0.b) && this.c == c2602n0.c && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2602n0.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c2602n0.e) && kotlin.jvm.internal.Intrinsics.areEqual("unifiedSdkJson", "unifiedSdkJson") && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2602n0.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c2602n0.g) && this.h == c2602n0.h && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) null, (java.lang.Object) null);
    }

    public final int hashCode() {
        int hashCode = ((this.f5345a.hashCode() * 31) + 3364) * 31;
        java.util.Map map = this.b;
        int hashCode2 = (this.d.hashCode() + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        java.lang.String str = this.e;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        java.util.Map map2 = this.f;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        java.lang.String str2 = this.g;
        return (kotlin.UByte$$ExternalSyntheticBackport0.m(this.h) + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final java.lang.String toString() {
        return "AdMetaData(clientRequestId=" + this.f5345a + ", integrationTypeString=im, extras=" + this.b + ", imPlacementId=" + this.c + ", monetizationContext=" + this.d + ", adType=" + this.e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f + ", keywords=" + this.g + ", isApplicationMutedByPub=" + this.h + ", extraInfo=null)";
    }
}
