package com.inmobi.media;

/* renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2268a7 {

    /* renamed from: a, reason: collision with root package name */
    public static org.json.JSONObject f5095a;
    public static org.json.JSONObject b;

    public static final void a(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
        org.json.JSONObject jSONObject2 = f5095a;
        java.util.Objects.toString(jSONObject);
        java.util.Objects.toString(jSONObject2);
        if (jSONObject != null) {
            f5095a = jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final org.json.JSONObject b() {
        org.json.JSONObject jSONObject;
        java.lang.String str;
        int i;
        org.json.JSONObject jSONObject2;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
        android.content.SharedPreferences a2 = com.inmobi.media.AbstractC2490ij.a();
        if (a2 != null) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
                str = a2.getString("IABTCF_TCString", null);
                try {
                    i = a2.getInt(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES, -1);
                } catch (java.lang.Exception unused) {
                    i = -1;
                    if (str != null) {
                    }
                    jSONObject2 = null;
                    if (jSONObject2 == null) {
                    }
                    if (jSONObject2 != null) {
                    }
                    jSONObject = b;
                    if (jSONObject == null) {
                    }
                }
            } catch (java.lang.Exception unused2) {
                str = null;
            }
            if (str != null) {
                try {
                    jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_IAB, str);
                    if (i != -1) {
                        jSONObject2.put(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, java.lang.String.valueOf(i));
                    }
                } catch (org.json.JSONException unused3) {
                }
                if (jSONObject2 == null) {
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
                        str2 = a2.getString("IABConsent_ConsentString", null);
                        try {
                            str3 = a2.getString("IABConsent_SubjectToGDPR", null);
                        } catch (java.lang.Exception unused4) {
                            str3 = null;
                            if (str2 != null) {
                            }
                            jSONObject2 = null;
                            if (jSONObject2 != null) {
                            }
                            jSONObject = b;
                            if (jSONObject == null) {
                            }
                        }
                    } catch (java.lang.Exception unused5) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        try {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                            jSONObject3.put(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_IAB, str2);
                            if (str3 != null) {
                                jSONObject3.put(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, str3);
                            }
                            jSONObject2 = jSONObject3;
                        } catch (org.json.JSONException unused6) {
                        }
                    }
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    return jSONObject2;
                }
            }
            jSONObject2 = null;
            if (jSONObject2 == null) {
            }
            if (jSONObject2 != null) {
            }
        }
        jSONObject = b;
        if (jSONObject == null) {
            return f5095a;
        }
        if (f5095a != null) {
            jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject4 = b;
            java.util.Iterator<java.lang.String> keys = jSONObject4 != null ? jSONObject4.keys() : null;
            if (keys != null) {
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    try {
                        org.json.JSONObject jSONObject5 = b;
                        jSONObject.put(next, jSONObject5 != null ? jSONObject5.opt(next) : null);
                    } catch (org.json.JSONException unused7) {
                    }
                }
            }
            org.json.JSONObject jSONObject6 = f5095a;
            java.util.Iterator<java.lang.String> keys2 = jSONObject6 != null ? jSONObject6.keys() : null;
            if (keys2 != null) {
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    try {
                        org.json.JSONObject jSONObject7 = f5095a;
                        jSONObject.put(next2, jSONObject7 != null ? jSONObject7.opt(next2) : null);
                    } catch (org.json.JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean a() {
        ?? r0;
        org.json.JSONObject b2 = b();
        if (b2 != null) {
            if (b2.has(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_IAB)) {
                r0 = 1;
            } else if (b2.has(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                try {
                    r0 = b2.getBoolean(com.inmobi.sdk.InMobiSdk.IM_GDPR_CONSENT_AVAILABLE);
                } catch (org.json.JSONException unused) {
                }
            }
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            boolean shouldTransmitRequest = ((com.inmobi.media.core.config.models.RootConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.RootConfig.class)).shouldTransmitRequest();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
            return r0 == 1 || shouldTransmitRequest;
        }
        r0 = -1;
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        boolean shouldTransmitRequest2 = ((com.inmobi.media.core.config.models.RootConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.RootConfig.class)).shouldTransmitRequest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("a7", "TAG");
        if (r0 == 1) {
            return true;
        }
    }
}
