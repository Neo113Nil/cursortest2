package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class j implements com.iovation.mobile.android.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.b.k f3933a;
    public java.lang.String b;
    public java.lang.String c;
    public javax.net.ssl.SSLContext d;
    public java.io.InputStream e;
    public javax.net.ssl.HttpsURLConnection f;
    public com.iovation.mobile.android.b.i g;

    public j(com.iovation.mobile.android.b.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "");
        this.f3933a = kVar;
    }

    @Override // com.iovation.mobile.android.a.g
    public final void b(android.content.Context context) {
        java.security.cert.Certificate certificate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (this.b == null) {
            this.b = context.getString(com.iovation.deviceprint.lib.DevicePrint.R.string.ff_sdk_ver);
        }
        if (this.c == null) {
            this.c = context.getString(com.iovation.deviceprint.lib.DevicePrint.R.string.ff_ep);
        }
        if (this.d == null) {
            java.lang.String[] strArr = {"DigiCertHighAssuranceEVRootCA.crt", "entrust_g2_ca.cer"};
            java.security.cert.Certificate[] certificateArr = new java.security.cert.Certificate[2];
            try {
                java.security.cert.CertificateFactory certificateFactory = java.security.cert.CertificateFactory.getInstance("X.509");
                android.content.res.AssetManager assets = context.getResources().getAssets();
                for (int i = 0; i < 2; i++) {
                    java.lang.String str = strArr[i];
                    if (str != null) {
                        try {
                            certificate = certificateFactory.generateCertificate(new java.io.BufferedInputStream(assets.open(str)));
                        } catch (java.io.IOException | java.security.cert.CertificateException unused) {
                            certificate = null;
                        }
                        if (certificate != null) {
                            certificateArr[i] = certificate;
                        }
                    }
                }
            } catch (java.security.cert.CertificateException unused2) {
            }
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
            keyStore.load(null, null);
            for (int i2 = 0; i2 < 2; i2++) {
                keyStore.setCertificateEntry("ca".concat(java.lang.String.valueOf(i2)), certificateArr[i2]);
            }
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sSLContext, "");
            this.d = sSLContext;
        }
        com.iovation.mobile.android.FraudForceManager fraudForceManager = com.iovation.mobile.android.FraudForceManager.INSTANCE;
        com.iovation.mobile.android.FraudForceConfiguration a2 = com.iovation.mobile.android.FraudForceManager.a();
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = a2.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI == null || kotlin.text.StringsKt.isBlank(getHighResolutionOutputSizeshNQ4ISI) || !a2.getGetHighSpeedVideoFpsRanges()) {
            return;
        }
        this.f3933a.a("f87312", new java.util.concurrent.Callable() { // from class: com.iovation.mobile.android.b.j$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.iovation.mobile.android.b.j.a(com.iovation.mobile.android.b.j.this);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.iovation.mobile.android.b.j$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.iovation.mobile.android.b.j.a(com.iovation.mobile.android.b.j.this, (com.iovation.mobile.android.b.i) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.iovation.mobile.android.b.j$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.iovation.mobile.android.b.j.a(com.iovation.mobile.android.b.j.this, (java.lang.Exception) obj);
            }
        });
    }

    @Override // com.iovation.mobile.android.a.g
    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.b.k kVar = this.f3933a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("f87312", "");
        java.util.concurrent.Future future = (java.util.concurrent.Future) kVar.b.get("f87312");
        if (future != null && !future.isCancelled() && !future.isDone()) {
            future.cancel(true);
        }
        java.io.InputStream inputStream = this.e;
        if (inputStream != null) {
            inputStream.close();
        }
        javax.net.ssl.HttpsURLConnection httpsURLConnection = this.f;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
        this.e = null;
        this.f = null;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "f87312";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
    
        r0 = android.os.SystemClock.elapsedRealtime();
        r13 = r13.f;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
        r12 = r13.getResponseCode();
        r13 = new org.json.JSONObject(r4);
        r2 = r13.getJSONObject(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011c, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011e, code lost:
    
        r2 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0123, code lost:
    
        r9 = r13.getString("timestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNull(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0135, code lost:
    
        return new com.iovation.mobile.android.b.h(r2, r9, r0 - r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        r0.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ff, code lost:
    
        if (r0 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.iovation.mobile.android.b.i a(com.iovation.mobile.android.b.j jVar) {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        com.iovation.mobile.android.FraudForceManager fraudForceManager = com.iovation.mobile.android.FraudForceManager.INSTANCE;
        com.iovation.mobile.android.FraudForceConfiguration a2 = com.iovation.mobile.android.FraudForceManager.a();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = jVar.c;
        java.lang.String str2 = null;
        java.lang.String str3 = "";
        if (str == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        sb.append(str);
        sb.append("mobispace/");
        sb.append(java.net.URLEncoder.encode(a2.getGetHighResolutionOutputSizeshNQ4ISI(), "UTF-8"));
        sb.append("/android");
        java.net.URL url = new java.net.URL(sb.toString());
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.net.URLConnection openConnection = url.openConnection();
        kotlin.jvm.internal.Intrinsics.checkNotNull(openConnection, "");
        javax.net.ssl.HttpsURLConnection httpsURLConnection2 = (javax.net.ssl.HttpsURLConnection) openConnection;
        httpsURLConnection2.setReadTimeout(1000);
        httpsURLConnection2.setConnectTimeout(1000);
        httpsURLConnection2.setRequestMethod("POST");
        httpsURLConnection2.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection2.setRequestProperty("Accept", "application/json");
        httpsURLConnection2.setDoInput(true);
        httpsURLConnection2.setDoOutput(true);
        javax.net.ssl.SSLContext sSLContext = jVar.d;
        if (sSLContext == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            sSLContext = null;
        }
        httpsURLConnection2.setSSLSocketFactory(sSLContext.getSocketFactory());
        jVar.f = httpsURLConnection2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(httpsURLConnection2);
        java.io.OutputStream outputStream = httpsURLConnection2.getOutputStream();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStream, "");
        org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
        org.json.JSONStringer key = jSONStringer.object().key("sdkVersion");
        java.lang.String str4 = jVar.b;
        if (str4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str2 = str4;
        }
        key.value(str2).key("configHash").value("").endObject();
        java.lang.String jSONStringer2 = jSONStringer.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONStringer2, "");
        byte[] bytes = jSONStringer2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        outputStream.write(bytes);
        outputStream.close();
        httpsURLConnection2.connect();
        if (httpsURLConnection2.getResponseCode() != 200) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("HTTP error code: ");
            sb2.append(httpsURLConnection2.getResponseCode());
            throw new java.io.IOException(sb2.toString());
        }
        javax.net.ssl.HttpsURLConnection httpsURLConnection3 = jVar.f;
        kotlin.jvm.internal.Intrinsics.checkNotNull(httpsURLConnection3);
        try {
            jVar.e = httpsURLConnection3.getInputStream();
            str3 = jVar.a();
            java.io.InputStream inputStream = jVar.e;
            if (inputStream != null) {
                inputStream.close();
            }
            httpsURLConnection = jVar.f;
        } catch (java.io.IOException unused) {
            java.io.InputStream inputStream2 = jVar.e;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            httpsURLConnection = jVar.f;
        } catch (java.lang.Throwable th) {
            java.io.InputStream inputStream3 = jVar.e;
            if (inputStream3 != null) {
                inputStream3.close();
            }
            javax.net.ssl.HttpsURLConnection httpsURLConnection4 = jVar.f;
            if (httpsURLConnection4 != null) {
                httpsURLConnection4.disconnect();
            }
            throw th;
        }
    }

    public static final kotlin.Unit a(com.iovation.mobile.android.b.j jVar, com.iovation.mobile.android.b.i iVar) {
        jVar.g = iVar;
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.iovation.mobile.android.b.j jVar, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        jVar.g = new com.iovation.mobile.android.b.g(message);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.iovation.mobile.android.FraudForceManager fraudForceManager = com.iovation.mobile.android.FraudForceManager.INSTANCE;
        com.iovation.mobile.android.FraudForceConfiguration a2 = com.iovation.mobile.android.FraudForceManager.a();
        linkedHashMap.put("SKEY", a2.getGetHighResolutionOutputSizeshNQ4ISI());
        a2.getGetHighSpeedVideoFpsRanges();
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = a2.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI != null && !kotlin.text.StringsKt.isBlank(getHighResolutionOutputSizeshNQ4ISI) && a2.getGetHighSpeedVideoFpsRanges()) {
            com.iovation.mobile.android.b.i iVar = this.g;
            if (iVar instanceof com.iovation.mobile.android.b.g) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(iVar, "");
                linkedHashMap.put("PHERR", ((com.iovation.mobile.android.b.g) iVar).f3931a);
                return linkedHashMap;
            }
            try {
                linkedHashMap.put("PHEN", "1");
                com.iovation.mobile.android.b.i iVar2 = this.g;
                com.iovation.mobile.android.b.h hVar = iVar2 instanceof com.iovation.mobile.android.b.h ? (com.iovation.mobile.android.b.h) iVar2 : null;
                if (hVar != null) {
                    org.json.JSONObject jSONObject = hVar.f3932a;
                    java.lang.String str = hVar.b;
                    long j = hVar.c;
                    int i = hVar.d;
                    if (i >= 0) {
                        linkedHashMap.put("PHNSC", java.lang.String.valueOf(i));
                    }
                    linkedHashMap.put("PHNCT", java.lang.String.valueOf(j));
                    linkedHashMap.put("PHUT", str);
                    try {
                        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "");
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                            java.lang.String upperCase = next.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            linkedHashMap.put(upperCase, jSONObject.getString(next));
                        }
                    } catch (org.json.JSONException e) {
                        linkedHashMap.put("PHERR", e.getMessage());
                    }
                }
            } catch (java.lang.Exception e2) {
                linkedHashMap.put("PHERR", e2.getMessage());
            }
            return linkedHashMap;
        }
        linkedHashMap.put("PHEN", "0");
        return linkedHashMap;
    }

    public final java.lang.String a() {
        if (this.e != null) {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(this.e));
            try {
                java.lang.String joinToString$default = kotlin.sequences.SequencesKt.joinToString$default(kotlin.io.TextStreamsKt.lineSequence(bufferedReader), "", null, null, 0, null, null, 62, null);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                return joinToString$default;
            } finally {
            }
        } else {
            return "";
        }
    }
}
