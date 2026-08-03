package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeim implements com.google.android.gms.internal.ads.zzfok {
    protected final android.content.Context zza;
    protected final java.lang.String zzb;
    private final java.lang.String zzc;

    public zzeim(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzcbl zzcblVar, int i, java.lang.String str2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzeil zza(com.google.android.gms.internal.ads.zzeik zzeikVar) throws com.google.android.gms.internal.ads.zzeed {
        return zzc(zzeikVar.zza, zzeikVar.zzb, zzeikVar.zzc, zzeikVar.zzd, zzeikVar.zze, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x023a, code lost:
    
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r4.append("Received error HTTP response code: ");
        r4.append(r0);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(r4.toString());
        r8 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r8.append("Received error HTTP response code: ");
        r8.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0274, code lost:
    
        throw new com.google.android.gms.internal.ads.zzeed(1, r8.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final com.google.android.gms.internal.ads.zzeil zzc(java.lang.String str, int i, java.util.Map map, byte[] bArr, java.lang.String str2, long j) throws com.google.android.gms.internal.ads.zzeed {
        java.net.URL url;
        java.io.BufferedOutputStream bufferedOutputStream;
        try {
            com.google.android.gms.internal.ads.zzeil zzeilVar = new com.google.android.gms.internal.ads.zzeil();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue() && com.google.android.gms.ads.internal.client.zzay.zze()) {
                zzeilVar.zza = com.ironsource.InterfaceC3141l1.a.b.j;
            } else {
                java.lang.String str3 = this.zzb;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 13);
                sb.append("SDK version: ");
                sb.append(str3);
                java.lang.String sb2 = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 39);
                sb3.append("AdRequestServiceImpl: Sending request: ");
                sb3.append(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3.toString());
                java.net.URL url2 = new java.net.URL(str);
                java.util.HashMap hashMap = new java.util.HashMap();
                int i3 = 0;
                while (true) {
                    int i4 = com.google.android.gms.internal.ads.zzfzr.zzb;
                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url2.openConnection();
                    java.lang.String str4 = this.zzc;
                    if (str4 != null) {
                        httpURLConnection.setRequestMethod(str4);
                    }
                    try {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zza, str3, false, httpURLConnection, false, i);
                            for (java.util.Map.Entry entry : map.entrySet()) {
                                httpURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                            }
                            if (!android.text.TextUtils.isEmpty(str2)) {
                                httpURLConnection.setRequestProperty("Content-Type", str2);
                            }
                            java.io.InputStreamReader inputStreamReader = null;
                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                            try {
                                zzlVar.zza(httpURLConnection, bArr);
                            } catch (java.lang.Throwable th) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Network request logging failed.", th);
                                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "HttpRequestFunction.logAdRequest");
                            }
                            int length = bArr.length;
                            if (length > 0) {
                                httpURLConnection.setDoOutput(true);
                                httpURLConnection.setFixedLengthStreamingMode(length);
                                try {
                                    bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    bufferedOutputStream.write(bArr);
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(bufferedOutputStream);
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    inputStreamReader = bufferedOutputStream;
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                java.lang.String key = entry2.getKey();
                                java.util.List<java.lang.String> value = entry2.getValue();
                                if (hashMap.containsKey(key)) {
                                    ((java.util.List) hashMap.get(key)).addAll(value);
                                } else {
                                    hashMap.put(key, new java.util.ArrayList(value));
                                }
                            }
                            zzlVar.zzc(httpURLConnection, responseCode);
                            zzeilVar.zza = responseCode;
                            zzeilVar.zzb = hashMap;
                            zzeilVar.zzc = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    java.io.InputStreamReader inputStreamReader2 = new java.io.InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(8192);
                                        char[] cArr = new char[2048];
                                        while (true) {
                                            int read = inputStreamReader2.read(cArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            sb4.append(cArr, 0, read);
                                        }
                                        java.lang.String sb5 = sb4.toString();
                                        com.google.android.gms.common.util.IOUtils.closeQuietly(inputStreamReader2);
                                        zzlVar.zze(sb5);
                                        zzeilVar.zzc = sb5;
                                        if (android.text.TextUtils.isEmpty(sb5)) {
                                            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgA)).booleanValue()) {
                                                throw new com.google.android.gms.internal.ads.zzeed(3);
                                            }
                                        }
                                        zzeilVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        inputStreamReader = inputStreamReader2;
                                        com.google.android.gms.common.util.IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                if (responseCode < 300 || responseCode >= 400) {
                                    break;
                                }
                                java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                                if (android.text.TextUtils.isEmpty(headerField)) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("No location header to follow redirect.");
                                    throw new com.google.android.gms.internal.ads.zzeed(1, "No location header to follow redirect");
                                }
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziW)).booleanValue()) {
                                    try {
                                        url = new java.net.URI(headerField).toURL();
                                    } catch (java.net.URISyntaxException e) {
                                        throw new com.google.android.gms.internal.ads.zzeed(1, e.getMessage(), e);
                                    }
                                } else {
                                    url = new java.net.URL(headerField);
                                }
                                int i5 = i3 + 1;
                                if (i5 > ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgj)).intValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Too many redirects.");
                                    throw new com.google.android.gms.internal.ads.zzeed(1, "Too many redirects");
                                }
                                i3 = i5;
                                url2 = url;
                            }
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } catch (com.google.android.gms.internal.ads.zzeed e2) {
                        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjC)).booleanValue()) {
                            throw e2;
                        }
                        zzeilVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
                    }
                }
            }
            return zzeilVar;
        } catch (java.io.IOException e3) {
            java.lang.String message = e3.getMessage();
            java.lang.String.valueOf(message);
            java.lang.String valueOf = java.lang.String.valueOf(message);
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            java.lang.String concat = "Error while connecting to ad server: ".concat(valueOf);
            com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
            throw new com.google.android.gms.internal.ads.zzeed(1, concat, e3);
        }
    }
}
