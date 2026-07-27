package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4594q {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8483a;

    public C4594q(JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f8483a = adFormatAuctionSettings.has(r.f8497a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(r.f8497a)) : null;
    }

    public final Boolean a() {
        return this.f8483a;
    }
}
