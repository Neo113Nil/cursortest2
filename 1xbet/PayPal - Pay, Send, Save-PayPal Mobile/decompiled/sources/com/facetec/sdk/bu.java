package com.facetec.sdk;

/* loaded from: classes8.dex */
final class bu {

    /* renamed from: a, reason: collision with root package name */
    boolean f3437a;
    int b;
    org.json.JSONObject c;
    org.json.JSONObject d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;

    /* renamed from: o, reason: collision with root package name */
    boolean f3438o;
    private final java.lang.String q = "enforceNFC";
    final boolean r;
    boolean s;

    bu(android.content.Context context, java.lang.String str, int i) throws java.lang.Exception {
        this.f3437a = false;
        this.c = null;
        this.d = null;
        this.b = 0;
        this.e = false;
        this.g = false;
        this.f = false;
        this.j = false;
        this.i = false;
        this.h = false;
        this.l = false;
        this.n = false;
        this.m = false;
        this.k = false;
        this.f3438o = false;
        this.s = false;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.c = optJSONObject;
        if (optJSONObject == null) {
            throw new java.lang.Exception();
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("flags");
        this.d = optJSONObject2;
        if (optJSONObject2 == null) {
            throw new java.lang.Exception();
        }
        this.b = optJSONObject2.optInt("nextStep");
        this.e = this.d.optBoolean("isPassport", false);
        this.r = this.d.optBoolean("useNFCCompatMode", false);
        this.g = jSONObject.optBoolean("success");
        org.json.JSONObject optJSONObject3 = this.c.optJSONObject("resultsFlags");
        if (optJSONObject3 != null) {
            this.f = optJSONObject3.optBoolean("matchedHighlyEnough");
            this.j = optJSONObject3.optBoolean("wasFullID");
            this.i = optJSONObject3.optBoolean("idTypeNotSupported");
            this.h = optJSONObject3.optBoolean("overzoomedDocument");
            this.n = optJSONObject3.optBoolean("retryDueToBarcode");
            this.k = optJSONObject3.optBoolean("wasLikelyRealID");
            this.f3438o = optJSONObject3.optBoolean("userScannedFront");
            android.content.SharedPreferences.Editor edit = com.facetec.sdk.bj.g(context).edit();
            if (!com.facetec.sdk.FaceTecSDK.f3366a.i.disableAdditionalReviewScreen) {
                this.l = optJSONObject3.optBoolean("additionalReviewRequired");
            }
            this.f3437a = optJSONObject3.optBoolean("enforceNFC");
            this.m = optJSONObject3.optBoolean("unexpectedMediaEncounteredAtLeastOnce");
            edit.putBoolean(com.facetec.sdk.as.ab, this.m);
            edit.apply();
        }
        this.s = i == 1 || i == 2;
    }
}
