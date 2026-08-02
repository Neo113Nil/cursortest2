package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlllllll {
    public final com.microblink.blinkid.secured.lIIIIllllI IlIllIlIIl;
    public com.microblink.blinkid.secured.llIlllIIIl IllIIIllII = com.microblink.blinkid.secured.llIlllIIIl.llIIlIlIIl;
    public final java.util.TreeMap llIIIlllll = new java.util.TreeMap();
    public final com.microblink.blinkid.secured.IIIIIIlIII llIIlIlIIl;

    public IIIlllllll(com.microblink.blinkid.secured.IIIIIIlIII iIIIIIlIII, com.microblink.blinkid.secured.lIIIIllllI liiiilllli) {
        this.llIIlIlIIl = iIIIIIlIII;
        this.IlIllIlIIl = liiiilllli;
    }

    public final java.util.TreeMap llIIlIlIIl(int i) {
        java.lang.String str;
        this.llIIIlllll.put("fileType", "JPEG");
        this.llIIIlllll.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "ANDROID");
        this.llIIIlllll.put(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, "AndroidSDK");
        this.llIIIlllll.put("appVersion", com.caverock.androidsvg.BuildConfig.VERSION_NAME);
        this.llIIIlllll.put("osVersion", android.os.Build.VERSION.RELEASE);
        java.util.TreeMap treeMap = this.llIIIlllll;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(android.os.Build.MANUFACTURER);
        sb.append(" - ");
        sb.append(android.os.Build.MODEL);
        treeMap.put("device", sb.toString());
        java.util.TreeMap treeMap2 = this.llIIIlllll;
        org.json.JSONObject jSONObject = this.llIIlIlIIl.llIIlIlIIl;
        org.json.JSONObject jSONObject2 = null;
        try {
            if (i == 1) {
                str = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT;
            } else if (i == 2) {
                str = com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK;
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "UNKNOWN";
            }
            jSONObject.put("documentSide", str);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        try {
            com.microblink.blinkid.secured.lIIIIllllI liiiilllli = this.IlIllIlIIl;
            if (liiiilllli != null) {
                if (liiiilllli.llIIlIlIIl != null) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    try {
                        jSONObject3.put("userID", liiiilllli.llIIlIlIIl);
                        jSONObject2 = jSONObject3;
                    } catch (org.json.JSONException unused) {
                    }
                }
                jSONObject.put("userData", jSONObject2);
            }
        } catch (org.json.JSONException e2) {
            e2.printStackTrace();
        }
        treeMap2.put("metadata", jSONObject.toString());
        java.lang.String str2 = this.llIIlIlIIl.IllIIIllII;
        if (str2 != null && !str2.isEmpty()) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("recognizerResult", this.llIIlIlIIl.IllIIIllII);
            } catch (org.json.JSONException e3) {
                e3.printStackTrace();
            }
            this.llIIIlllll.put("encMetadata", this.IllIIIllII.llIIlIlIIl(jSONObject4.toString()));
        }
        return this.llIIIlllll;
    }
}
