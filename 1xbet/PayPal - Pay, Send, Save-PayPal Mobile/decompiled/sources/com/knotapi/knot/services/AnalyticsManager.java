package com.knotapi.knot.services;

/* loaded from: classes9.dex */
public class AnalyticsManager {
    private static final java.lang.String TAG = "AnalyticsManager";
    private static com.knotapi.knot.services.AnalyticsManager instance;
    private final com.knotapi.knot.models.Environment environment;

    /* renamed from: com.knotapi.knot.services.AnalyticsManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$models$Environment;

        static {
            int[] iArr = new int[com.knotapi.knot.models.Environment.values().length];
            $SwitchMap$com$knotapi$knot$models$Environment = iArr;
            try {
                iArr[com.knotapi.knot.models.Environment.development.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[com.knotapi.knot.models.Environment.sandbox.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[com.knotapi.knot.models.Environment.production.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public enum AnalyticsEventType {
        IDENTIFY,
        TRACK
    }

    private AnalyticsManager(com.knotapi.knot.models.Environment environment) {
        this.environment = environment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getBaseUrl(com.knotapi.knot.models.Environment environment) {
        int i = com.knotapi.knot.services.AnalyticsManager.AnonymousClass2.$SwitchMap$com$knotapi$knot$models$Environment[environment.ordinal()];
        if (i == 1) {
            return "https://development.knotapi.com";
        }
        if (i == 2) {
            return "https://staging.knotapi.com";
        }
        if (i == 3) {
            return "https://production.knotapi.com";
        }
        throw new java.lang.IllegalArgumentException("Unknown environment: ".concat(java.lang.String.valueOf(environment)));
    }

    public static com.knotapi.knot.services.AnalyticsManager getInstance(com.knotapi.knot.models.Environment environment) {
        if (instance == null) {
            synchronized (com.knotapi.knot.services.AnalyticsManager.class) {
                if (instance == null) {
                    instance = new com.knotapi.knot.services.AnalyticsManager(environment);
                }
            }
        }
        return instance;
    }

    private void sendPayload(final org.json.JSONObject jSONObject) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.knotapi.knot.services.AnalyticsManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    com.knotapi.knot.services.AnalyticsManager analyticsManager = com.knotapi.knot.services.AnalyticsManager.this;
                    sb.append(analyticsManager.getBaseUrl(analyticsManager.environment));
                    sb.append("/events");
                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(sb.toString()).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setDoOutput(true);
                    java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                    java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                    bufferedWriter.write(jSONObject.toString());
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    bufferedOutputStream.close();
                    httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                } catch (java.io.IOException unused) {
                }
            }
        }).start();
    }

    public void identifyAndTrackOpen(java.lang.String str) {
        try {
            identifyUser(str);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    public void identifyUser(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("type", com.knotapi.knot.services.AnalyticsManager.AnalyticsEventType.IDENTIFY.name().toLowerCase());
            jSONObject.put("session_id", str);
            sendPayload(jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    public void trackEvent(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("event", str);
            jSONObject2.put("properties", new org.json.JSONObject(map));
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("traits", new org.json.JSONObject(map2));
            jSONObject2.put("context", jSONObject3);
            jSONObject.put("type", com.knotapi.knot.services.AnalyticsManager.AnalyticsEventType.TRACK.name().toLowerCase());
            jSONObject.put("session_id", str2);
            jSONObject.put("event", jSONObject2);
            sendPayload(jSONObject);
        } catch (org.json.JSONException unused) {
        }
    }

    public void trackSDKOpened(java.lang.String str, android.content.Intent intent, boolean z, boolean z2, int[] iArr) {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("entry_point", intent.getStringExtra("entryPoint"));
            hashMap.put("search_enabled", java.lang.Boolean.valueOf(z));
            hashMap.put("categories_enabled", java.lang.Boolean.valueOf(z2));
            if (iArr != null && iArr.length > 0) {
                hashMap.put("merchant_id", java.lang.Integer.valueOf(iArr[0]));
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
            hashMap2.put("sdk_version", com.knotapi.knot.BuildConfig.VERSION_NAME);
            trackEvent("SDK Opened", str, hashMap, hashMap2);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }
}
