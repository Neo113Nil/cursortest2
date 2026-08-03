package com.ironsource.adapters.ironsource;

/* loaded from: classes5.dex */
public final class LoadAdData {
    private final org.json.JSONObject localAdData;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String adUnitId() {
        java.lang.String it = this.localAdData.optString("adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(org.json.JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(org.json.JSONObject jSONObject, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
