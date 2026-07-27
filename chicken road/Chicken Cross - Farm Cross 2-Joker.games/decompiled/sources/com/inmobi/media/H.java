package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4036r1 f6590a;
    public final E b;
    public final String c;
    public final MetaInfo d;
    public final String e;
    public final List f;
    public final List g;
    public final ContextData h;
    public final String i;
    public final long j;
    public final long k;
    public final JSONObject l;
    public final G m;
    public final F n;

    public H(E adSetContext, String markupType, MetaInfo metaInfo, String creativeId, String tracking, List trackers, List trackingInfo, ContextData contextData, String str, long j, long j2, JSONObject transactionInfo, G viewability, F mrc50, C4036r1 adManagerContext) {
        Intrinsics.checkNotNullParameter(adSetContext, "adSetContext");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(transactionInfo, "transactionInfo");
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        Intrinsics.checkNotNullParameter(mrc50, "mrc50");
        Intrinsics.checkNotNullParameter(adManagerContext, "adManagerContext");
        this.f6590a = adManagerContext;
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
