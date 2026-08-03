package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.C2657p1 f4714a;
    public final com.inmobi.media.D b;
    public final java.lang.String c;
    public final com.inmobi.media.ads.network.common.model.MetaInfo d;
    public final java.lang.String e;
    public final java.util.List f;
    public final java.util.List g;
    public final com.inmobi.media.ads.network.common.model.ContextData h;
    public final java.lang.String i;
    public final long j;
    public final long k;
    public final org.json.JSONObject l;
    public final com.inmobi.media.F m;
    public final com.inmobi.media.E n;

    public G(com.inmobi.media.D adSetContext, java.lang.String markupType, com.inmobi.media.ads.network.common.model.MetaInfo metaInfo, java.lang.String creativeId, java.lang.String tracking, java.util.List trackers, java.util.List trackingInfo, com.inmobi.media.ads.network.common.model.ContextData contextData, java.lang.String str, long j, long j2, org.json.JSONObject transactionInfo, com.inmobi.media.F viewability, com.inmobi.media.E mrc50, com.inmobi.media.C2657p1 adManagerContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSetContext, "adSetContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(markupType, "markupType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracking, "tracking");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewability, "viewability");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mrc50, "mrc50");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f4714a = adManagerContext;
        this.b = adSetContext;
        this.c = markupType;
        this.d = metaInfo;
        this.e = creativeId;
        this.f = trackers;
        this.g = trackingInfo;
        this.h = contextData;
        this.i = str;
        this.j = j;
        this.k = j2;
        this.l = transactionInfo;
        this.m = viewability;
        this.n = mrc50;
    }
}
