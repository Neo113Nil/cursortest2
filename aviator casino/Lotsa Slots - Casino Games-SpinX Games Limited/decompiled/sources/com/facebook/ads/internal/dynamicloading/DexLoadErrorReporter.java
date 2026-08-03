package com.facebook.ads.internal.dynamicloading;

/* loaded from: classes2.dex */
public class DexLoadErrorReporter {
    private static final java.lang.String LOGGING_URL = "https://www.facebook.com/adnw_logging/";
    public static final double SAMPLING = 0.1d;
    private static final java.util.concurrent.atomic.AtomicBoolean sAlreadyReported = new java.util.concurrent.atomic.AtomicBoolean();

    /* JADX WARN: Type inference failed for: r6v2, types: [com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter$1] */
    public static void reportDexLoadingIssue(final android.content.Context context, final java.lang.String str, double d) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sAlreadyReported;
        if (atomicBoolean.get() || java.lang.Math.random() >= d) {
            return;
        }
        atomicBoolean.set(true);
        new java.lang.Thread() { // from class: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.1
            /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                java.lang.String str2;
                java.lang.String str3;
                java.io.DataOutputStream dataOutputStream;
                java.net.HttpURLConnection httpURLConnection;
                java.io.InputStream inputStream;
                java.lang.String uuid;
                org.json.JSONObject jSONObject;
                org.json.JSONObject jSONObject2;
                org.json.JSONObject jSONObject3;
                java.lang.StringBuilder sb;
                java.lang.String str4;
                java.lang.String str5;
                super.run();
                try {
                    httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.LOGGING_URL).openConnection();
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.ironsource.B5.M);
                        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_CHARSET, "UTF-8");
                        httpURLConnection.setRequestProperty("user-agent", "[FBAN/AudienceNetworkForAndroid;FBSN/Android]");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.connect();
                        uuid = java.util.UUID.randomUUID().toString();
                        jSONObject = new org.json.JSONObject();
                        jSONObject.put("attempt", "0");
                        com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(context, jSONObject, uuid);
                        jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("subtype", "generic");
                        jSONObject2.put("subtype_code", "1320");
                        jSONObject2.put("caught_exception", "1");
                        jSONObject2.put("stacktrace", str);
                        jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("id", java.util.UUID.randomUUID().toString());
                        jSONObject3.put("type", "debug");
                        sb = new java.lang.StringBuilder("");
                    } catch (java.lang.Throwable th) {
                        th = th;
                        str2 = "Can't close connection.";
                        str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    str2 = "Can't close connection.";
                    str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                    dataOutputStream = null;
                    httpURLConnection = null;
                }
                try {
                    sb.append(java.lang.System.currentTimeMillis() / 1000);
                    jSONObject3.put("session_time", sb.toString());
                    jSONObject3.put("time", "" + (java.lang.System.currentTimeMillis() / 1000));
                    jSONObject3.put("session_id", uuid);
                    jSONObject3.put("data", jSONObject2);
                    jSONObject3.put("attempt", "0");
                    com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.addEnvFields(context, jSONObject2, uuid);
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(jSONObject3);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("data", jSONObject);
                    jSONObject4.put("events", jSONArray);
                    java.lang.String jSONObject5 = jSONObject4.toString();
                    java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                    try {
                        dataOutputStream2.writeBytes("payload=" + java.net.URLEncoder.encode(jSONObject5, "UTF-8"));
                        dataOutputStream2.flush();
                        byte[] bArr = new byte[16384];
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        java.io.InputStream inputStream2 = httpURLConnection.getInputStream();
                        while (true) {
                            try {
                                int read = inputStream2.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                try {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    inputStream = inputStream2;
                                    str2 = "Can't close connection.";
                                    str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                                    dataOutputStream = dataOutputStream2;
                                    try {
                                        android.util.Log.e(str3, "Can't send error.", th);
                                        if (dataOutputStream != null) {
                                            try {
                                                dataOutputStream.close();
                                            } catch (java.lang.Exception e) {
                                                android.util.Log.e(str3, str2, e);
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (java.lang.Exception e2) {
                                                android.util.Log.e(str3, str2, e2);
                                            }
                                        }
                                        if (httpURLConnection == null) {
                                            return;
                                        }
                                        httpURLConnection.disconnect();
                                    } finally {
                                    }
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                str2 = "Can't close connection.";
                                str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                                inputStream = inputStream2;
                            }
                        }
                        byteArrayOutputStream.flush();
                        try {
                            dataOutputStream2.close();
                            str4 = "Can't close connection.";
                            str5 = com.facebook.ads.AudienceNetworkAds.TAG;
                        } catch (java.lang.Exception e3) {
                            str4 = "Can't close connection.";
                            str5 = com.facebook.ads.AudienceNetworkAds.TAG;
                            android.util.Log.e(str5, str4, e3);
                        }
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.lang.Exception e4) {
                                android.util.Log.e(str5, str4, e4);
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        str2 = "Can't close connection.";
                        str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                        dataOutputStream = dataOutputStream2;
                        inputStream = null;
                        android.util.Log.e(str3, "Can't send error.", th);
                        if (dataOutputStream != null) {
                        }
                        if (inputStream != null) {
                        }
                        if (httpURLConnection == null) {
                        }
                        httpURLConnection.disconnect();
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = "Can't close connection.";
                    str3 = com.facebook.ads.AudienceNetworkAds.TAG;
                    dataOutputStream = null;
                    inputStream = null;
                    android.util.Log.e(str3, "Can't send error.", th);
                    if (dataOutputStream != null) {
                    }
                    if (inputStream != null) {
                    }
                    if (httpURLConnection == null) {
                    }
                    httpURLConnection.disconnect();
                }
                httpURLConnection.disconnect();
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addEnvFields(android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", android.os.Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", android.os.Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", com.facebook.ads.internal.api.BuildConfigApi.getVersionName(context));
        jSONObject.put(com.moloco.sdk.acm.b.d, com.ironsource.X3.d);
    }
}
