package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzauf extends com.google.android.gms.internal.ads.zzats {
    public zzauf() {
        throw null;
    }

    public zzauf(com.google.android.gms.internal.ads.zzaue zzaueVar, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
    }

    static java.util.List zzb(java.util.Map map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.google.android.gms.internal.ads.zzasw((java.lang.String) entry.getKey(), (java.lang.String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final com.google.android.gms.internal.ads.zzauc zza(com.google.android.gms.internal.ads.zzate zzateVar, java.util.Map map) throws java.io.IOException, com.google.android.gms.internal.ads.zzasm {
        java.lang.String zzh = zzateVar.zzh();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzateVar.zzm());
        java.net.URL url = new java.net.URL(zzh);
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(java.net.HttpURLConnection.getFollowRedirects());
        int zzo = zzateVar.zzo();
        httpURLConnection.setConnectTimeout(zzo);
        httpURLConnection.setReadTimeout(zzo);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        url.getProtocol();
        try {
            for (java.lang.String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (java.lang.String) hashMap.get(str));
            }
            if (zzateVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzn = zzateVar.zzn();
                if (zzn != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzn);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzateVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                com.google.android.gms.internal.ads.zzauc zzaucVar = new com.google.android.gms.internal.ads.zzauc(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzaucVar;
            }
            try {
                return new com.google.android.gms.internal.ads.zzauc(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new com.google.android.gms.internal.ads.zzaud(httpURLConnection));
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
