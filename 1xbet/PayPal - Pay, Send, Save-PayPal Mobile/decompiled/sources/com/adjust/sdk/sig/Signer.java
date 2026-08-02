package com.adjust.sdk.sig;

/* loaded from: classes7.dex */
public class Signer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2821a = false;
    public com.adjust.sdk.sig.d b;
    public com.adjust.sdk.sig.a c;
    public com.adjust.sdk.sig.c d;

    public void onResume() {
        synchronized (this) {
            a();
            com.adjust.sdk.sig.a aVar = this.c;
            if (!com.adjust.sdk.sig.d.f2823a) {
                ((com.adjust.sdk.sig.NativeLibHelper) aVar).nOnResume();
            }
        }
    }

    public void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            a();
            com.adjust.sdk.sig.d.a(context, this.d, this.c, map, str, str2);
        }
    }

    public void sign(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        synchronized (this) {
            a();
            com.adjust.sdk.sig.c cVar = this.d;
            com.adjust.sdk.sig.a aVar = this.c;
            if (map != null && map.size() != 0 && map2 != null && map3 != null) {
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                boolean equals = com.adjust.sdk.AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
                if (equals) {
                    simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                com.adjust.sdk.sig.d.a(map.keySet(), map, hashMap);
                java.lang.String str = map2.get("activity_kind");
                java.lang.String str2 = map2.get("client_sdk");
                if (!util.h.xy.cb.b.f1091.equals(map2.get("a"))) {
                    com.adjust.sdk.sig.d.a(context, cVar, aVar, hashMap, str, str2);
                    if (hashMap.containsKey("signature") && hashMap.containsKey("adj_signing_id") && hashMap.containsKey("headers_id") && hashMap.containsKey("algorithm") && hashMap.containsKey("native_version")) {
                        java.lang.String str3 = (java.lang.String) hashMap.get("adj_signing_id");
                        java.lang.String str4 = (java.lang.String) hashMap.get("headers_id");
                        java.lang.String str5 = (java.lang.String) hashMap.get("signature");
                        java.lang.String str6 = (java.lang.String) hashMap.get("algorithm");
                        java.lang.String str7 = (java.lang.String) hashMap.get("native_version");
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("signature=\"");
                        sb.append(str5);
                        sb.append("\"");
                        java.lang.String obj = sb.toString();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("adj_signing_id=\"");
                        sb2.append(str3);
                        sb2.append("\"");
                        java.lang.String obj2 = sb2.toString();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("headers_id=\"");
                        sb3.append(str4);
                        sb3.append("\"");
                        java.lang.String obj3 = sb3.toString();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("algorithm=\"");
                        sb4.append(str6);
                        sb4.append("\"");
                        java.lang.String obj4 = sb4.toString();
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("native_version=\"");
                        sb5.append(str7);
                        sb5.append("\"");
                        java.lang.String obj5 = sb5.toString();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Signature ");
                        sb6.append(obj);
                        sb6.append(",");
                        sb6.append(obj2);
                        sb6.append(",");
                        sb6.append(obj4);
                        sb6.append(",");
                        sb6.append(obj3);
                        sb6.append(",");
                        sb6.append(obj5);
                        map3.put("authorization", sb6.toString());
                    }
                }
                com.adjust.sdk.sig.d.a(map.keySet(), map, map3);
                com.adjust.sdk.sig.d.a(new java.util.HashSet(java.util.Arrays.asList("network_payload", "endpoint")), map2, map3);
                if (equals) {
                    simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis()));
                }
            }
        }
    }

    public final void a() {
        synchronized (this) {
            if (this.f2821a) {
                return;
            }
            this.b = new com.adjust.sdk.sig.d();
            this.d = new com.adjust.sdk.sig.c(android.os.Build.VERSION.SDK_INT);
            this.c = new com.adjust.sdk.sig.NativeLibHelper();
            this.f2821a = true;
        }
    }

    public static java.lang.String getVersion() {
        return "3.62.0";
    }
}
