package com.inmobi.media;

/* renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2341d0 {
    public static void a(java.lang.String str, java.lang.String str2, com.inmobi.media.ads.network.common.model.AdResponse adResponse, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (c2799u9 == null) {
            return;
        }
        try {
            int i = 0;
            com.inmobi.media.ads.network.common.model.AdSet adSet = adResponse.getAdSets().get(0);
            java.lang.String value = adResponse.getRequestId();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("requestID", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            com.inmobi.media.Ph ph = c2799u9.f5484a;
            if (ph != null) {
                ph.a("requestID", value);
            }
            java.lang.String value2 = java.lang.String.valueOf(adResponse.getPlacementId());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID, com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value2, "value");
            com.inmobi.media.Ph ph2 = c2799u9.f5484a;
            if (ph2 != null) {
                ph2.a(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID, value2);
            }
            java.lang.String value3 = java.lang.String.valueOf(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("adType", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value3, "value");
            com.inmobi.media.Ph ph3 = c2799u9.f5484a;
            if (ph3 != null) {
                ph3.a("adType", value3);
            }
            java.lang.String value4 = java.lang.String.valueOf(str2);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("placementType", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value4, "value");
            com.inmobi.media.Ph ph4 = c2799u9.f5484a;
            if (ph4 != null) {
                ph4.a("placementType", value4);
            }
            java.lang.String value5 = java.lang.String.valueOf(com.inmobi.media.A1.f4591a);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("bundleID", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value5, "value");
            com.inmobi.media.Ph ph5 = c2799u9.f5484a;
            if (ph5 != null) {
                ph5.a("bundleID", value5);
            }
            com.inmobi.media.B5.f4614a.getClass();
            java.lang.String value6 = (java.lang.String) com.inmobi.media.B5.j.getSecond();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.ironsource.X3.j.n, com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value6, "value");
            com.inmobi.media.Ph ph6 = c2799u9.f5484a;
            if (ph6 != null) {
                ph6.a(com.ironsource.X3.j.n, value6);
            }
            java.lang.String value7 = com.inmobi.media.B5.o();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("networkType", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value7, "value");
            com.inmobi.media.Ph ph7 = c2799u9.f5484a;
            if (ph7 != null) {
                ph7.a("networkType", value7);
            }
            java.lang.String value8 = android.os.Build.MODEL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value8, "MODEL");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("deviceModel", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value8, "value");
            com.inmobi.media.Ph ph8 = c2799u9.f5484a;
            if (ph8 != null) {
                ph8.a("deviceModel", value8);
            }
            java.lang.String value9 = java.lang.String.valueOf(com.inmobi.media.Xi.c);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("publisherID", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value9, "value");
            com.inmobi.media.Ph ph9 = c2799u9.f5484a;
            if (ph9 != null) {
                ph9.a("publisherID", value9);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("sdkVersion", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("11.2.0", "value");
            com.inmobi.media.Ph ph10 = c2799u9.f5484a;
            if (ph10 != null) {
                ph10.a("sdkVersion", "11.2.0");
            }
            java.lang.String value10 = java.lang.String.valueOf(com.inmobi.media.Yi.b);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("tpName", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value10, "value");
            com.inmobi.media.Ph ph11 = c2799u9.f5484a;
            if (ph11 != null) {
                ph11.a("tpName", value10);
            }
            java.lang.String value11 = java.lang.String.valueOf(com.inmobi.media.Yi.f5069a);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("tpVersion", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value11, "value");
            com.inmobi.media.Ph ph12 = c2799u9.f5484a;
            if (ph12 != null) {
                ph12.a("tpVersion", value11);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("source", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("sdk_android", "value");
            com.inmobi.media.Ph ph13 = c2799u9.f5484a;
            if (ph13 != null) {
                ph13.a("source", "sdk_android");
            }
            java.lang.String value12 = com.inmobi.media.Yi.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("mkVersion", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value12, "value");
            com.inmobi.media.Ph ph14 = c2799u9.f5484a;
            if (ph14 != null) {
                ph14.a("mkVersion", value12);
            }
            java.lang.String value13 = com.inmobi.media.Xi.c();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("webViewUserAgent", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value13, "value");
            com.inmobi.media.Ph ph15 = c2799u9.f5484a;
            if (ph15 != null) {
                ph15.a("webViewUserAgent", value13);
            }
            java.lang.String value14 = java.lang.String.valueOf(adSet.getIsPod());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("sdkAdPod", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value14, "value");
            com.inmobi.media.Ph ph16 = c2799u9.f5484a;
            if (ph16 != null) {
                ph16.a("sdkAdPod", value14);
            }
            java.lang.String value15 = java.lang.String.valueOf(adSet.getLogEnabled());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("isServerSideLogging", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value15, "value");
            com.inmobi.media.Ph ph17 = c2799u9.f5484a;
            if (ph17 != null) {
                ph17.a("isServerSideLogging", value15);
            }
            java.lang.String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("transactionID", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value16, "value");
            com.inmobi.media.Ph ph18 = c2799u9.f5484a;
            if (ph18 != null) {
                ph18.a("transactionID", value16);
            }
            java.lang.String value17 = a();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("configData", com.ironsource.X3.i.W);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value17, "value");
            com.inmobi.media.Ph ph19 = c2799u9.f5484a;
            if (ph19 != null) {
                ph19.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c2799u9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (java.lang.Object obj : adSet.getAds()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i, ad.getCreativeId());
                        arrayList2.add(i, ad.getImpressionId());
                        i = i2;
                    }
                    java.lang.String value18 = kotlin.collections.CollectionsKt.joinToString$default(arrayList, " , ", null, null, 0, null, null, 62, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("creativeID", com.ironsource.X3.i.W);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value18, "value");
                    com.inmobi.media.Ph ph20 = c2799u9.f5484a;
                    if (ph20 != null) {
                        ph20.a("creativeID", value18);
                    }
                    java.lang.String value19 = kotlin.collections.CollectionsKt.joinToString$default(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("impressionID", com.ironsource.X3.i.W);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value19, "value");
                    com.inmobi.media.Ph ph21 = c2799u9.f5484a;
                    if (ph21 != null) {
                        ph21.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c2799u9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad2 = adSet.getAds().get(0);
                java.lang.String value20 = ad2.getCreativeId();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("creativeID", com.ironsource.X3.i.W);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value20, "value");
                com.inmobi.media.Ph ph22 = c2799u9.f5484a;
                if (ph22 != null) {
                    ph22.a("creativeID", value20);
                }
                java.lang.String value21 = ad2.getImpressionId();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("impressionID", com.ironsource.X3.i.W);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value21, "value");
                com.inmobi.media.Ph ph23 = c2799u9.f5484a;
                if (ph23 != null) {
                    ph23.a("impressionID", value21);
                }
            }
        } catch (org.json.JSONException e) {
            c2799u9.a("AdLogResponseHandler", "error while update vitals", e);
        }
        a(adResponse, c2799u9);
    }

    public static void a(com.inmobi.media.ads.network.common.model.AdResponse adResponse, com.inmobi.media.C2799u9 c2799u9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c2799u9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c2799u9.a(logEnabled);
        } catch (org.json.JSONException e) {
            c2799u9.a("AdLogResponseHandler", "error while setting server-side lever", e);
            c2799u9.a(false);
        }
    }

    public static java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        jSONObject.put("root", ((com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        jSONObject.put("ads", ((com.inmobi.media.core.config.models.AdConfig) c2580m42.a(com.inmobi.media.core.config.models.AdConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        jSONObject.put("telemetry", ((com.inmobi.media.core.config.models.TelemetryConfig) c2580m42.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((com.inmobi.media.core.config.models.CrashConfig) c2580m42.a(com.inmobi.media.core.config.models.CrashConfig.class)).getLastUpdateTimeStamp());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((com.inmobi.media.core.config.models.SignalsConfig) c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class)).getLastUpdateTimeStamp());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
