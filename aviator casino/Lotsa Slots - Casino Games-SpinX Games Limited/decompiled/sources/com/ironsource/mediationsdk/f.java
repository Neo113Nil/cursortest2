package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public final class f implements com.ironsource.mediationsdk.g {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3267s2 f6437a;
    private final java.lang.String b;

    public f(com.ironsource.C3267s2 settings, java.lang.String sessionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f6437a = settings;
        this.b = sessionId;
    }

    @Override // com.ironsource.mediationsdk.g
    public com.ironsource.mediationsdk.e.a a(android.content.Context context, com.ironsource.mediationsdk.h auctionRequestParams, com.ironsource.U1 auctionListener) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionListener, "auctionListener");
        org.json.JSONObject a2 = a(context, auctionRequestParams);
        java.lang.String a3 = this.f6437a.a(auctionRequestParams.t());
        return auctionRequestParams.t() ? new com.ironsource.C3142l2(auctionListener, new java.net.URL(a3), a2, auctionRequestParams.u(), this.f6437a) : new com.ironsource.mediationsdk.e.a(auctionListener, new java.net.URL(a3), a2, auctionRequestParams.u(), this.f6437a);
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean b() {
        return this.f6437a.g() > 0;
    }

    @Override // com.ironsource.mediationsdk.g
    public boolean a() {
        return this.f6437a.n();
    }

    private final org.json.JSONObject a(android.content.Context context, com.ironsource.mediationsdk.h hVar) throws org.json.JSONException {
        org.json.JSONObject a2 = com.ironsource.mediationsdk.d.b().a(hVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getInstance().enrichToke…low(auctionRequestParams)");
        return a2;
    }
}
