package com.ironsource;

/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3392z1 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3229q> f6854a;

    public C3392z1(org.json.JSONObject applicationAuctionSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationAuctionSettings, "applicationAuctionSettings");
        com.unity3d.mediation.LevelPlay.AdFormat[] values = com.unity3d.mediation.LevelPlay.AdFormat.values();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(values.length), 16));
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : values) {
            org.json.JSONObject optJSONObject = applicationAuctionSettings.optJSONObject(com.ironsource.Ff.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new com.ironsource.C3229q(optJSONObject));
        }
        this.f6854a = linkedHashMap;
    }

    public final java.util.Map<com.unity3d.mediation.LevelPlay.AdFormat, com.ironsource.C3229q> a() {
        return this.f6854a;
    }
}
