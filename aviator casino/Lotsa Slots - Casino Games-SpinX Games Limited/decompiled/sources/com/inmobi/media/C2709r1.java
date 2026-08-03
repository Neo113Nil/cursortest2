package com.inmobi.media;

/* renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2709r1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.AbstractC2551l1 f5416a;
    public final com.inmobi.media.C2913yk b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public final com.inmobi.media.C2684q1 j;

    public C2709r1(com.inmobi.media.AbstractC2551l1 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f5416a = adUnit;
        this.b = new com.inmobi.media.C2913yk();
        this.j = new com.inmobi.media.C2684q1(this);
    }

    public final java.lang.String a() {
        java.util.LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        java.lang.String telemetryMetadataBlob;
        com.inmobi.media.ads.network.common.model.AdSet s = this.f5416a.s();
        return (s == null || (ads = s.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
