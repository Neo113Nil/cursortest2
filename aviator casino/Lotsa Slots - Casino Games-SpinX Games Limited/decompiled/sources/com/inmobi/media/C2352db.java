package com.inmobi.media;

/* renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2352db {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5159a;
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final com.inmobi.media.ads.network.common.model.InlineParams e;

    public C2352db(boolean z, java.lang.String landingScheme, boolean z2, boolean z3, com.inmobi.media.ads.network.common.model.InlineParams inlineParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f5159a = z;
        this.b = landingScheme;
        this.c = z2;
        this.d = z3;
        this.e = inlineParams;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2352db)) {
            return false;
        }
        com.inmobi.media.C2352db c2352db = (com.inmobi.media.C2352db) obj;
        return this.f5159a == c2352db.f5159a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2352db.b) && this.c == c2352db.c && this.d == c2352db.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c2352db.e);
    }

    public final int hashCode() {
        int m = (kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((this.b.hashCode() + (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f5159a) * 31)) * 31)) * 31)) * 31;
        com.inmobi.media.ads.network.common.model.InlineParams inlineParams = this.e;
        return m + (inlineParams == null ? 0 : inlineParams.hashCode());
    }

    public final java.lang.String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f5159a + ", landingScheme=" + this.b + ", isCCTEnabled=" + this.c + ", isPartialTabsEnabled=" + this.d + ", inlineParams=" + this.e + ")";
    }

    public /* synthetic */ C2352db(boolean z, java.lang.String str, boolean z2, int i) {
        this(z, (i & 2) != 0 ? "DEFAULT" : str, z2, false, null);
    }
}
