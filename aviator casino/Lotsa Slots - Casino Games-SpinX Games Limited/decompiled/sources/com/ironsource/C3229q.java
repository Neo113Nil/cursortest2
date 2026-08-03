package com.ironsource;

/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3229q {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f6560a;

    public C3229q(org.json.JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f6560a = adFormatAuctionSettings.has(com.ironsource.r.f6576a) ? java.lang.Boolean.valueOf(adFormatAuctionSettings.optBoolean(com.ironsource.r.f6576a)) : null;
    }

    public final java.lang.Boolean a() {
        return this.f6560a;
    }
}
