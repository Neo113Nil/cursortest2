package com.inmobi.media;

import android.content.SharedPreferences;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.z7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4263z7 {

    /* renamed from: a, reason: collision with root package name */
    public static JSONObject f7519a;
    public static JSONObject b;

    public static final void a(JSONObject jSONObject) {
        Intrinsics.checkNotNullExpressionValue("z7", "TAG");
        String str = "Setting consent object consentObject=" + jSONObject + " publisherConsentObject=" + f7519a;
        if (jSONObject != null) {
            f7519a = jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject b() {
        JSONObject jSONObject;
        String str;
        int i;
        JSONObject jSONObject2;
        String str2;
        String str3;
        Intrinsics.checkNotNullExpressionValue("z7", "TAG");
        SharedPreferences a2 = Dk.a();
        if (a2 != null) {
            try {
                Intrinsics.checkNotNullExpressionValue("z7", "TAG");
                str = a2.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, null);
                try {
                    i = a2.getInt("IABTCF_gdprApplies", -1);
                } catch (Exception unused) {
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
            } catch (Exception unused2) {
                str = null;
            }
            if (str != null) {
                try {
                    jSONObject2 = new JSONObject();
                    jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_IAB, str);
                    if (i != -1) {
                        jSONObject2.put("gdpr", String.valueOf(i));
                    }
                } catch (JSONException unused3) {
                }
                if (jSONObject2 == null) {
                    try {
                        Intrinsics.checkNotNullExpressionValue("z7", "TAG");
                        str2 = a2.getString("IABConsent_ConsentString", null);
                        try {
                            str3 = a2.getString("IABConsent_SubjectToGDPR", null);
                        } catch (Exception unused4) {
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
                    } catch (Exception unused5) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(InMobiSdk.IM_GDPR_CONSENT_IAB, str2);
                            if (str3 != null) {
                                jSONObject3.put("gdpr", str3);
                            }
                            jSONObject2 = jSONObject3;
                        } catch (JSONException unused6) {
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
            return f7519a;
        }
        if (f7519a != null) {
            jSONObject = new JSONObject();
            JSONObject jSONObject4 = b;
            Iterator<String> keys = jSONObject4 != null ? jSONObject4.keys() : null;
            if (keys != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        JSONObject jSONObject5 = b;
                        jSONObject.put(next, jSONObject5 != null ? jSONObject5.opt(next) : null);
                    } catch (JSONException unused7) {
                    }
                }
            }
            JSONObject jSONObject6 = f7519a;
            Iterator<String> keys2 = jSONObject6 != null ? jSONObject6.keys() : null;
            if (keys2 != null) {
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    try {
                        JSONObject jSONObject7 = f7519a;
                        jSONObject.put(next2, jSONObject7 != null ? jSONObject7.opt(next2) : null);
                    } catch (JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StringBuilder] */
    public static boolean a() {
        ?? r0;
        JSONObject b2 = b();
        if (b2 != null) {
            if (b2.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
                r0 = 1;
            } else if (b2.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                try {
                    r0 = b2.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE);
                } catch (JSONException unused) {
                }
            }
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
            boolean shouldTransmitRequest = ((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).shouldTransmitRequest();
            Intrinsics.checkNotNullExpressionValue("z7", "TAG");
            String str = "userConsent " + r0 + ", configTransmitRequest " + shouldTransmitRequest + ", transmitRequestReservation false";
            return r0 == 1 || shouldTransmitRequest;
        }
        r0 = -1;
        J4 j42 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        boolean shouldTransmitRequest2 = ((RootConfig) AbstractC4260z4.f7518a.a(RootConfig.class)).shouldTransmitRequest();
        Intrinsics.checkNotNullExpressionValue("z7", "TAG");
        String str2 = "userConsent " + r0 + ", configTransmitRequest " + shouldTransmitRequest2 + ", transmitRequestReservation false";
        if (r0 == 1) {
            return true;
        }
    }
}
