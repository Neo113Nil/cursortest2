package com.inmobi.ads;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/inmobi/ads/AdMetaInfo;", "", "", "creativeID", "Lorg/json/JSONObject;", "mTransactionInfo", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "a", "Ljava/lang/String;", "getCreativeID", "()Ljava/lang/String;", "", "getBid", "()D", com.ironsource.M6.f, "getBidInfo", "()Lorg/json/JSONObject;", "bidInfo", "getBidKeyword", "bidKeyword", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdMetaInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String creativeID;
    public final org.json.JSONObject b;

    public AdMetaInfo(java.lang.String creativeID, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeID, "creativeID");
        this.creativeID = creativeID;
        this.b = jSONObject;
    }

    public final double getBid() {
        org.json.JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.optDouble("buyerPrice");
        }
        return 0.0d;
    }

    public final org.json.JSONObject getBidInfo() {
        org.json.JSONObject jSONObject = this.b;
        return jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public final java.lang.String getBidKeyword() {
        org.json.JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    public final java.lang.String getCreativeID() {
        return this.creativeID;
    }
}
