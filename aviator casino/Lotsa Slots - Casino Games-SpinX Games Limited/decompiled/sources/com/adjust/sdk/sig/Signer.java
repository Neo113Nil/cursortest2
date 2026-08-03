package com.adjust.sdk.sig;

/* loaded from: classes2.dex */
public class Signer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3458a = false;
    public com.adjust.sdk.sig.d b;
    public com.adjust.sdk.sig.a c;
    public com.adjust.sdk.sig.c d;

    public static java.lang.String getVersion() {
        return "3.67.0";
    }

    public final synchronized void a() {
        if (this.f3458a) {
            return;
        }
        this.b = new com.adjust.sdk.sig.d();
        this.d = new com.adjust.sdk.sig.c(android.os.Build.VERSION.SDK_INT);
        this.c = new com.adjust.sdk.sig.NativeLibHelper();
        this.f3458a = true;
    }

    public synchronized void onResume() {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        if (!com.adjust.sdk.sig.d.f3460a) {
            ((com.adjust.sdk.sig.NativeLibHelper) aVar).a();
        }
    }

    public synchronized void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.c cVar = this.d;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        com.adjust.sdk.sig.d.a(context, cVar, aVar, map, str, str2);
    }

    public synchronized void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        a();
        com.adjust.sdk.sig.d dVar = this.b;
        com.adjust.sdk.sig.c cVar = this.d;
        com.adjust.sdk.sig.a aVar = this.c;
        dVar.getClass();
        if (map != null && !map.isEmpty() && map2 != null && map3 != null) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
            boolean equals = com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
            if (equals) {
                android.util.Log.v("SignerInstance", "SDKv5 Signing all the parameters begin: " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            com.adjust.sdk.sig.d.a(map.keySet(), map, hashMap);
            java.lang.String str = map2.get("activity_kind");
            java.lang.String str2 = map2.get("client_sdk");
            if (!"b".equals(map2.get("a"))) {
                com.adjust.sdk.sig.d.a(context, cVar, aVar, hashMap, str, str2);
                if (hashMap.containsKey(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE) && hashMap.containsKey("adj_signing_id") && hashMap.containsKey("headers_id") && hashMap.containsKey("algorithm") && hashMap.containsKey("native_version")) {
                    java.lang.String str3 = (java.lang.String) hashMap.get("adj_signing_id");
                    java.lang.String str4 = (java.lang.String) hashMap.get("headers_id");
                    java.lang.String str5 = (java.lang.String) hashMap.get(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
                    java.lang.String str6 = (java.lang.String) hashMap.get("algorithm");
                    java.lang.String str7 = "algorithm=\"" + str6 + "\"";
                    map3.put("authorization", "Signature " + ("signature=\"" + str5 + "\"") + "," + ("adj_signing_id=\"" + str3 + "\"") + "," + str7 + "," + ("headers_id=\"" + str4 + "\"") + "," + ("native_version=\"" + ((java.lang.String) hashMap.get("native_version")) + "\""));
                }
                android.util.Log.e("SignerInstance", "sign: Signature generation failed. Exiting...");
            }
            com.adjust.sdk.sig.d.a(map.keySet(), map, map3);
            com.adjust.sdk.sig.d.a(new java.util.HashSet(java.util.Arrays.asList("network_payload", com.ironsource.B5.r)), map2, map3);
            if (equals) {
                android.util.Log.v("SignerInstance", "SDKv5 Signing all the parameters end  : " + simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            }
        }
        android.util.Log.e("SignerInstance", "sign: One or more parameters are null");
    }
}
