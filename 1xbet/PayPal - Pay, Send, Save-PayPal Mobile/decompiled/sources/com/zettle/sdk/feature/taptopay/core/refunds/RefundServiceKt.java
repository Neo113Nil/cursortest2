package com.zettle.sdk.feature.taptopay.core.refunds;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lorg/json/JSONObject;", "", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Lorg/json/JSONObject;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundServiceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Boolean getHighSpeedVideoFpsRangesFor(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            return java.lang.Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.json.JSONObject Camera2StreamConfigurationMap(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
