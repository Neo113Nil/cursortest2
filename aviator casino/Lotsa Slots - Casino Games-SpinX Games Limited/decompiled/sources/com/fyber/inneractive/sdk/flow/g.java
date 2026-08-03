package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class g implements com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener, com.fyber.inneractive.sdk.flow.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3702a;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest b;
    public final com.fyber.inneractive.sdk.response.e c;
    public final com.fyber.inneractive.sdk.ui.IFyberAdIdentifier d;

    public g(android.content.Context context, boolean z, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f3702a = context;
        this.b = inneractiveAdRequest;
        this.c = eVar;
        new com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory();
        com.fyber.inneractive.sdk.ui.IFyberAdIdentifier fyberAdIdentifierRemote = z ? new com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote(rVar) : new com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal(rVar);
        this.d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.f4272a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        java.lang.Long l;
        java.lang.String str;
        com.fyber.inneractive.sdk.response.e eVar = this.c;
        java.lang.String str2 = null;
        if (eVar != null) {
            com.fyber.inneractive.sdk.external.ImpressionData impressionData = eVar.r;
            java.lang.String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData2 = this.c.r;
            str = impressionData2 != null ? impressionData2.getDemandSource() : null;
            com.fyber.inneractive.sdk.external.ImpressionData impressionData3 = this.c.r;
            str2 = advertiserDomain;
            l = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            l = null;
            str = null;
        }
        com.fyber.inneractive.sdk.activities.FyberReportAdActivity.start(this.f3702a, this, str2, str, l);
    }
}
