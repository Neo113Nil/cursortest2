package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4092t1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3923n1 f7385a;
    public final C4142um b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public final C4064s1 k;

    public C4092t1(AbstractC3923n1 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f7385a = adUnit;
        this.b = new C4142um();
        this.k = new C4064s1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad;
        String telemetryMetadataBlob;
        AdSet s = this.f7385a.s();
        return (s == null || (ads = s.getAds()) == null || (ad = (com.inmobi.media.ads.network.common.model.Ad) CollectionsKt.firstOrNull((List) ads)) == null || (telemetryMetadataBlob = ad.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
