package com.google.android.gms.internal.ads;

import A1.x0;
import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.g;
import J2.j;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzdyk implements zzfei {
    protected final Context zza;
    protected final String zzb;

    public zzdyk(Context context, String str, zzbuw zzbuwVar, int i7) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzdyj zza(zzdyi zzdyiVar) {
        String str = zzdyiVar.zza;
        int i7 = zzdyiVar.zzb;
        Map map = zzdyiVar.zzc;
        byte[] bArr = zzdyiVar.zzd;
        String str2 = zzdyiVar.zze;
        o.f1952C.j.getClass();
        return zzc(str, i7, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    public final zzdyj zzc(String str, int i7, Map map, byte[] bArr, String str2, long j) throws zzdus {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        boolean z4 = true;
        try {
            zzdyj zzdyjVar = new zzdyj();
            String str3 = "SDK version: " + this.zzb;
            int i8 = J.f3546b;
            j.f(str3);
            j.b("AdRequestServiceImpl: Sending request: " + str);
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i9 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    try {
                        o.f1952C.f1957c.z(this.zza, this.zzb, httpURLConnection, i7);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        g gVar = new g();
                        try {
                            gVar.a(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            j.e("Network request logging failed.", th);
                            o.f1952C.f1961g.zzv(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(z4);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    c.d(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    c.d(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        gVar.b(httpURLConnection, responseCode);
                        zzdyjVar.zza = responseCode;
                        zzdyjVar.zzb = map2;
                        zzdyjVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    P p5 = o.f1952C.f1957c;
                                    StringBuilder sb = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i10 = inputStreamReader2.read(cArr);
                                        if (i10 == -1) {
                                            break;
                                        }
                                        sb.append(cArr, 0, i10);
                                    }
                                    String string = sb.toString();
                                    c.d(inputStreamReader2);
                                    if (g.c() && string != null) {
                                        gVar.d("onNetworkResponseBody", new x0(string.getBytes(), 5));
                                    }
                                    zzdyjVar.zzc = string;
                                    if (TextUtils.isEmpty(string)) {
                                        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfA)).booleanValue()) {
                                            throw new zzdus(3);
                                        }
                                    }
                                    o.f1952C.j.getClass();
                                    zzdyjVar.zzd = SystemClock.elapsedRealtime() - j;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    c.d(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                j.g("Received error HTTP response code: " + responseCode);
                                throw new zzdus(1, "Received error HTTP response code: " + responseCode);
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                j.g("No location header to follow redirect.");
                                throw new zzdus(1, "No location header to follow redirect");
                            }
                            zzbbp zzbbpVar = zzbby.zzhO;
                            C0254t c0254t = C0254t.f2723d;
                            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e7) {
                                    throw new zzdus(1, e7.getMessage(), e7);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i9++;
                            if (i9 > ((Integer) c0254t.f2726c.zzb(zzbby.zzfj)).intValue()) {
                                j.g("Too many redirects.");
                                throw new zzdus(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            url2 = url;
                            z4 = true;
                        }
                    } catch (zzdus e8) {
                        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzio)).booleanValue()) {
                            throw e8;
                        }
                        o.f1952C.j.getClass();
                        zzdyjVar.zzd = SystemClock.elapsedRealtime() - j;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return zzdyjVar;
        } catch (IOException e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            int i11 = J.f3546b;
            String strConcat = "Error while connecting to ad server: ".concat(strValueOf);
            j.g(strConcat);
            throw new zzdus(1, strConcat, e9);
        }
    }
}
