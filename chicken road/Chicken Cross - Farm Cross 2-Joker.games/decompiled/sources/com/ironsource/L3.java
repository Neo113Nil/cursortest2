package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4665u f7729a;
    private final C4665u b;
    private final R2 c;
    private final Qb d;
    private final C4757z1 e;
    private final Map<LevelPlay.AdFormat, C4665u> f;

    public L3(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        C4665u c4665u = new C4665u(a(configurations, "rewarded"));
        this.f7729a = c4665u;
        C4665u c4665u2 = new C4665u(a(configurations, "interstitial"));
        this.b = c4665u2;
        this.c = new R2(a(configurations, "banner"));
        this.d = new Qb(a(configurations, "nativeAd"));
        JSONObject optJSONObject = configurations.optJSONObject("application");
        this.e = new C4757z1(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f = MapsKt.mapOf(TuplesKt.to(LevelPlay.AdFormat.INTERSTITIAL, c4665u2), TuplesKt.to(LevelPlay.AdFormat.REWARDED, c4665u));
    }

    public final Map<LevelPlay.AdFormat, C4665u> a() {
        return this.f;
    }

    public final C4757z1 b() {
        return this.e;
    }

    public final R2 c() {
        return this.c;
    }

    public final Qb d() {
        return this.d;
    }

    private final JSONObject a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("adFormats");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
        return optJSONObject2 == null ? new JSONObject() : optJSONObject2;
    }
}
