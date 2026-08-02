package com.google.android.gms.internal.ads;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class zzaqc extends zzapp {
    public zzaqc() {
        throw null;
    }

    public static List zzb(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new zzaot((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzapp
    public final zzapz zza(zzapb zzapbVar, Map map) {
        String zzk = zzapbVar.zzk();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(zzapbVar.zzl());
        URL url = new URL(zzk);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int zzb = zzapbVar.zzb();
        httpURLConnection.setConnectTimeout(zzb);
        httpURLConnection.setReadTimeout(zzb);
        boolean z4 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            if (zzapbVar.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] zzx = zzapbVar.zzx();
                if (zzx != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(zzx);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            zzapbVar.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                zzapz zzapzVar = new zzapz(responseCode, zzb(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return zzapzVar;
            }
            try {
                return new zzapz(responseCode, zzb(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzaqa(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z4 = true;
                if (!z4) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public zzaqc(zzaqb zzaqbVar, SSLSocketFactory sSLSocketFactory) {
    }
}
