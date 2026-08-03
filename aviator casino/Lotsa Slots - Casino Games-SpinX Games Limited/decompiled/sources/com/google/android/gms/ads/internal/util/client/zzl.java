package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private final java.util.List zzg;
    private static final java.lang.Object zzb = new java.lang.Object();
    private static final com.google.android.gms.common.util.Clock zze = com.google.android.gms.common.util.DefaultClock.getInstance();
    private static final java.util.Set zzf = new java.util.HashSet(java.util.Arrays.asList(new java.lang.String[0]));

    public zzl() {
        throw null;
    }

    public zzl(java.lang.String str) {
        java.util.List asList;
        if (zzj()) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            java.lang.String.valueOf(uuid);
            asList = java.util.Arrays.asList("network_request_".concat(java.lang.String.valueOf(uuid)));
        } else {
            asList = new java.util.ArrayList();
        }
        this.zzg = asList;
    }

    public static void zzg() {
        synchronized (zzb) {
            zzc = false;
            zzd = false;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void zzh(boolean z) {
        synchronized (zzb) {
            zzc = true;
            zzd = z;
        }
    }

    public static boolean zzi() {
        boolean z;
        synchronized (zzb) {
            z = zzc;
        }
        return z;
    }

    public static boolean zzj() {
        boolean z;
        synchronized (zzb) {
            z = false;
            if (zzc && zzd) {
                z = true;
            }
        }
        return z;
    }

    static /* synthetic */ void zzk(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr, android.util.JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(com.facebook.share.internal.ShareConstants.MEDIA_URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }

    static /* synthetic */ void zzl(int i, java.util.Map map, android.util.JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zzp(jsonWriter, map);
        jsonWriter.endObject();
    }

    private final void zzm(final java.lang.String str, final java.lang.String str2, final java.util.Map map, final byte[] bArr) {
        zzq("onNetworkRequest", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzj
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(android.util.JsonWriter jsonWriter) {
                com.google.android.gms.ads.internal.util.client.zzl.zzk(str, str2, map, bArr, jsonWriter);
            }
        });
    }

    private final void zzn(final java.util.Map map, final int i) {
        zzq("onNetworkResponse", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzg
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(android.util.JsonWriter jsonWriter) {
                com.google.android.gms.ads.internal.util.client.zzl.zzl(i, map, jsonWriter);
            }
        });
    }

    private final void zzo(final java.lang.String str) {
        zzq("onNetworkRequestError", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzi
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(android.util.JsonWriter jsonWriter) {
                int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
                jsonWriter.name("params").beginObject();
                java.lang.String str2 = str;
                if (str2 != null) {
                    jsonWriter.name(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_DESCRIPTION).value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void zzp(android.util.JsonWriter jsonWriter, java.util.Map map) throws java.io.IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            if (!zzf.contains(str)) {
                if (!(entry.getValue() instanceof java.util.List)) {
                    if (!(entry.getValue() instanceof java.lang.String)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(str);
                    jsonWriter.name("value").value((java.lang.String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (java.lang.String str2 : (java.util.List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void zzq(java.lang.String str, com.google.android.gms.ads.internal.util.client.zzk zzkVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(com.ironsource.C4.a.d).value(zze.currentTimeMillis());
            jsonWriter.name(androidx.core.app.NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            java.util.Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                jsonWriter.value((java.lang.String) it.next());
            }
            jsonWriter.endArray();
            zzkVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (java.io.IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("unable to log", e);
        }
        zzr(stringWriter.toString());
    }

    private static synchronized void zzr(java.lang.String str) {
        synchronized (com.google.android.gms.ads.internal.util.client.zzl.class) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
                java.lang.String substring = str.substring(i, java.lang.Math.min(i2, str.length()));
                java.lang.String.valueOf(substring);
                com.google.android.gms.ads.internal.util.client.zzo.zzh("GMA Debug CONTENT ".concat(java.lang.String.valueOf(substring)));
                i = i2;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzh("GMA Debug FINISH");
        }
    }

    public final void zza(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        if (zzj()) {
            zzm(new java.lang.String(httpURLConnection.getURL().toString()), new java.lang.String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new java.util.HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zzb(java.lang.String str, java.lang.String str2, java.util.Map map, byte[] bArr) {
        if (zzj()) {
            zzm(str, "GET", map, bArr);
        }
    }

    public final void zzc(java.net.HttpURLConnection httpURLConnection, int i) {
        if (zzj()) {
            java.lang.String str = null;
            zzn(httpURLConnection.getHeaderFields() == null ? null : new java.util.HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (java.io.IOException e) {
                    java.lang.String message = e.getMessage();
                    java.lang.String.valueOf(message);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not get error message from error HttpURLConnection\n".concat(java.lang.String.valueOf(message)));
                }
                zzo(str);
            }
        }
    }

    public final void zzd(java.util.Map map, int i) {
        if (zzj()) {
            zzn(map, i);
            if (i < 200 || i >= 300) {
                zzo(null);
            }
        }
    }

    public final void zze(java.lang.String str) {
        if (zzj() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        zzq("onNetworkResponseBody", new com.google.android.gms.ads.internal.util.client.zzk() { // from class: com.google.android.gms.ads.internal.util.client.zzh
            @Override // com.google.android.gms.ads.internal.util.client.zzk
            public final /* synthetic */ void zza(android.util.JsonWriter jsonWriter) {
                int i = com.google.android.gms.ads.internal.util.client.zzl.zza;
                jsonWriter.name("params").beginObject();
                byte[] bArr2 = bArr;
                int length = bArr2.length;
                java.lang.String encode = com.google.android.gms.common.util.Base64Utils.encode(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(encode);
                } else {
                    java.lang.String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(encode);
                    if (zzg != null) {
                        jsonWriter.name("bodydigest").value(zzg);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}
