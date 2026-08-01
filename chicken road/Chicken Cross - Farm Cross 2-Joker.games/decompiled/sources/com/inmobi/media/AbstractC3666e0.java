package com.inmobi.media;

import android.os.Build;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.U3;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3666e0 {
    public static void a(String str, String str2, AdResponse adResponse, Z9 z9) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (z9 == null) {
            return;
        }
        try {
            int i = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String value = adResponse.getRequestId();
            Intrinsics.checkNotNullParameter(SDKConstants.REQUEST_ID, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            C3685ej c3685ej = z9.f6988a;
            if (c3685ej != null) {
                c3685ej.a(SDKConstants.REQUEST_ID, value);
            }
            String value2 = String.valueOf(adResponse.getPlacementId());
            Intrinsics.checkNotNullParameter(SDKConstants.PARAM_PLACEMENT_ID, "key");
            Intrinsics.checkNotNullParameter(value2, "value");
            C3685ej c3685ej2 = z9.f6988a;
            if (c3685ej2 != null) {
                c3685ej2.a(SDKConstants.PARAM_PLACEMENT_ID, value2);
            }
            String value3 = String.valueOf(str);
            Intrinsics.checkNotNullParameter("adType", "key");
            Intrinsics.checkNotNullParameter(value3, "value");
            C3685ej c3685ej3 = z9.f6988a;
            if (c3685ej3 != null) {
                c3685ej3.a("adType", value3);
            }
            String value4 = String.valueOf(str2);
            Intrinsics.checkNotNullParameter("placementType", "key");
            Intrinsics.checkNotNullParameter(value4, "value");
            C3685ej c3685ej4 = z9.f6988a;
            if (c3685ej4 != null) {
                c3685ej4.a("placementType", value4);
            }
            String value5 = String.valueOf(U1.f6882a);
            Intrinsics.checkNotNullParameter("bundleID", "key");
            Intrinsics.checkNotNullParameter(value5, "value");
            C3685ej c3685ej5 = z9.f6988a;
            if (c3685ej5 != null) {
                c3685ej5.a("bundleID", value5);
            }
            Y5.f6965a.getClass();
            String value6 = (String) Y5.j.getSecond();
            Intrinsics.checkNotNullParameter(U3.j.n, "key");
            Intrinsics.checkNotNullParameter(value6, "value");
            C3685ej c3685ej6 = z9.f6988a;
            if (c3685ej6 != null) {
                c3685ej6.a(U3.j.n, value6);
            }
            String value7 = Y5.o();
            Intrinsics.checkNotNullParameter("networkType", "key");
            Intrinsics.checkNotNullParameter(value7, "value");
            C3685ej c3685ej7 = z9.f6988a;
            if (c3685ej7 != null) {
                c3685ej7.a("networkType", value7);
            }
            String value8 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(value8, "MODEL");
            Intrinsics.checkNotNullParameter("deviceModel", "key");
            Intrinsics.checkNotNullParameter(value8, "value");
            C3685ej c3685ej8 = z9.f6988a;
            if (c3685ej8 != null) {
                c3685ej8.a("deviceModel", value8);
            }
            String value9 = String.valueOf(AbstractC3914mk.c);
            Intrinsics.checkNotNullParameter("publisherID", "key");
            Intrinsics.checkNotNullParameter(value9, "value");
            C3685ej c3685ej9 = z9.f6988a;
            if (c3685ej9 != null) {
                c3685ej9.a("publisherID", value9);
            }
            Intrinsics.checkNotNullParameter("sdkVersion", "key");
            Intrinsics.checkNotNullParameter("11.4.0", "value");
            C3685ej c3685ej10 = z9.f6988a;
            if (c3685ej10 != null) {
                c3685ej10.a("sdkVersion", "11.4.0");
            }
            String value10 = String.valueOf(AbstractC3942nk.b);
            Intrinsics.checkNotNullParameter("tpName", "key");
            Intrinsics.checkNotNullParameter(value10, "value");
            C3685ej c3685ej11 = z9.f6988a;
            if (c3685ej11 != null) {
                c3685ej11.a("tpName", value10);
            }
            String value11 = String.valueOf(AbstractC3942nk.f7270a);
            Intrinsics.checkNotNullParameter("tpVersion", "key");
            Intrinsics.checkNotNullParameter(value11, "value");
            C3685ej c3685ej12 = z9.f6988a;
            if (c3685ej12 != null) {
                c3685ej12.a("tpVersion", value11);
            }
            Intrinsics.checkNotNullParameter("source", "key");
            Intrinsics.checkNotNullParameter("sdk_android", "value");
            C3685ej c3685ej13 = z9.f6988a;
            if (c3685ej13 != null) {
                c3685ej13.a("source", "sdk_android");
            }
            String value12 = AbstractC3942nk.a();
            Intrinsics.checkNotNullParameter("mkVersion", "key");
            Intrinsics.checkNotNullParameter(value12, "value");
            C3685ej c3685ej14 = z9.f6988a;
            if (c3685ej14 != null) {
                c3685ej14.a("mkVersion", value12);
            }
            String value13 = AbstractC3914mk.b();
            Intrinsics.checkNotNullParameter("webViewUserAgent", "key");
            Intrinsics.checkNotNullParameter(value13, "value");
            C3685ej c3685ej15 = z9.f6988a;
            if (c3685ej15 != null) {
                c3685ej15.a("webViewUserAgent", value13);
            }
            String value14 = String.valueOf(adSet.getIsPod());
            Intrinsics.checkNotNullParameter("sdkAdPod", "key");
            Intrinsics.checkNotNullParameter(value14, "value");
            C3685ej c3685ej16 = z9.f6988a;
            if (c3685ej16 != null) {
                c3685ej16.a("sdkAdPod", value14);
            }
            String value15 = String.valueOf(adSet.getLogEnabled());
            Intrinsics.checkNotNullParameter("isServerSideLogging", "key");
            Intrinsics.checkNotNullParameter(value15, "value");
            C3685ej c3685ej17 = z9.f6988a;
            if (c3685ej17 != null) {
                c3685ej17.a("isServerSideLogging", value15);
            }
            String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            Intrinsics.checkNotNullParameter("transactionID", "key");
            Intrinsics.checkNotNullParameter(value16, "value");
            C3685ej c3685ej18 = z9.f6988a;
            if (c3685ej18 != null) {
                c3685ej18.a("transactionID", value16);
            }
            String value17 = a();
            Intrinsics.checkNotNullParameter("configData", "key");
            Intrinsics.checkNotNullParameter(value17, "value");
            C3685ej c3685ej19 = z9.f6988a;
            if (c3685ej19 != null) {
                c3685ej19.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    z9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i, ad.getCreativeId());
                        arrayList2.add(i, ad.getImpressionId());
                        i = i2;
                    }
                    String value18 = CollectionsKt.joinToString$default(arrayList, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("creativeID", "key");
                    Intrinsics.checkNotNullParameter(value18, "value");
                    C3685ej c3685ej20 = z9.f6988a;
                    if (c3685ej20 != null) {
                        c3685ej20.a("creativeID", value18);
                    }
                    String value19 = CollectionsKt.joinToString$default(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("impressionID", "key");
                    Intrinsics.checkNotNullParameter(value19, "value");
                    C3685ej c3685ej21 = z9.f6988a;
                    if (c3685ej21 != null) {
                        c3685ej21.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                z9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad2 = adSet.getAds().get(0);
                String value20 = ad2.getCreativeId();
                Intrinsics.checkNotNullParameter("creativeID", "key");
                Intrinsics.checkNotNullParameter(value20, "value");
                C3685ej c3685ej22 = z9.f6988a;
                if (c3685ej22 != null) {
                    c3685ej22.a("creativeID", value20);
                }
                String value21 = ad2.getImpressionId();
                Intrinsics.checkNotNullParameter("impressionID", "key");
                Intrinsics.checkNotNullParameter(value21, "value");
                C3685ej c3685ej23 = z9.f6988a;
                if (c3685ej23 != null) {
                    c3685ej23.a("impressionID", value21);
                }
            }
        } catch (JSONException e) {
            z9.a("AdLogResponseHandler", "error while update vitals", e);
        }
        a(adResponse, z9);
    }

    public static void a(AdResponse adResponse, Z9 z9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            z9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            z9.a(logEnabled);
        } catch (JSONException e) {
            z9.a("AdLogResponseHandler", "error while setting server-side lever", e);
            z9.a(false);
        }
    }

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        J4 j42 = AbstractC4260z4.f7518a;
        jSONObject.put("root", ((RootConfig) j42.a(RootConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) j42.a(AdConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((TelemetryConfig) j42.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) j42.a(CrashConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) j42.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
