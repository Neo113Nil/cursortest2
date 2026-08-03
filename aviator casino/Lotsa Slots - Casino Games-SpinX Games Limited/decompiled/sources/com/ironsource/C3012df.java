package com.ironsource;

/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3012df {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.EnumC3030ef f6203a;

    public C3012df(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f6203a = com.ironsource.EnumC3030ef.b.a(config.optInt(com.ironsource.X3.a.t, com.ironsource.EnumC3030ef.CurrentlyLoadedAds.b()));
    }

    public final com.ironsource.EnumC3030ef a() {
        return this.f6203a;
    }
}
