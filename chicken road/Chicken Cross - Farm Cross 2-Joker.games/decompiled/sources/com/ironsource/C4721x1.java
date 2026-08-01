package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4721x1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C4594q> f8753a;

    public C4721x1(JSONObject applicationAuctionSettings) {
        Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(Gf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C4594q(optJSONObject));
        }
        this.f8753a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C4594q> a() {
        return this.f8753a;
    }
}
