package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@zzadh
/* loaded from: classes.dex */
public final class zzafn extends zzaeo {
    private static final Object sLock = new Object();

    @GuardedBy("sLock")
    private static zzafn zzchh;
    private final Context mContext;
    private final zzafm zzchi;
    private final ScheduledExecutorService zzchj = Executors.newSingleThreadScheduledExecutor();

    private zzafn(Context context, zzafm zzafmVar) {
        this.mContext = context;
        this.zzchi = zzafmVar;
    }

    private static zzaej zza(Context context, zzafm zzafmVar, zzaef zzaefVar, ScheduledExecutorService scheduledExecutorService) {
        String string;
        zzakb.zzck("Starting ad request from service using: google.afma.request.getAdDictionary");
        zznx zznxVar = new zznx(((Boolean) zzkb.zzik().zzd(zznk.zzawh)).booleanValue(), "load_ad", zzaefVar.zzacv.zzarb);
        if (zzaefVar.versionCode > 10 && zzaefVar.zzcdl != -1) {
            zznxVar.zza(zznxVar.zzd(zzaefVar.zzcdl), "cts");
        }
        zznv zzjj = zznxVar.zzjj();
        zzanz zza = zzano.zza(zzafmVar.zzche.zzk(context), ((Long) zzkb.zzik().zzd(zznk.zzbdf)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        zzanz zza2 = zzano.zza(zzafmVar.zzchd.zzr(context), ((Long) zzkb.zzik().zzd(zznk.zzbah)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        zzanz<String> zzcl = zzafmVar.zzcgy.zzcl(zzaefVar.zzccw.packageName);
        zzanz<String> zzcm = zzafmVar.zzcgy.zzcm(zzaefVar.zzccw.packageName);
        zzanz<String> zza3 = zzafmVar.zzchf.zza(zzaefVar.zzccx, zzaefVar.zzccw);
        Future<zzaga> zzq = com.google.android.gms.ads.internal.zzbv.zzev().zzq(context);
        zzanz<Location> zzi = zzano.zzi(null);
        Bundle bundle = zzaefVar.zzccv.extras;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzaefVar.zzcdr && !z) {
            zzi = zzafmVar.zzchb.zza(zzaefVar.applicationInfo);
        }
        zzanz zza4 = zzano.zza(zzi, ((Long) zzkb.zzik().zzd(zznk.zzbco)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        Future zzi2 = zzano.zzi(null);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayj)).booleanValue()) {
            zzi2 = zzano.zza(zzafmVar.zzchf.zzae(context), ((Long) zzkb.zzik().zzd(zznk.zzayk)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        }
        Bundle bundle2 = (zzaefVar.versionCode < 4 || zzaefVar.zzcdc == null) ? null : zzaefVar.zzcdc;
        ((Boolean) zzkb.zzik().zzd(zznk.zzawx)).booleanValue();
        com.google.android.gms.ads.internal.zzbv.zzek();
        if (zzakk.zzl(context, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            zzakb.zzck("Device is offline.");
        }
        String uuid = zzaefVar.versionCode >= 7 ? zzaefVar.zzcdi : UUID.randomUUID().toString();
        new zzaft(context, uuid, zzaefVar.applicationInfo.packageName);
        if (zzaefVar.zzccv.extras != null && (string = zzaefVar.zzccv.extras.getString("_ad")) != null) {
            return zzafs.zza(context, zzaefVar, string);
        }
        List<String> zzf = zzafmVar.zzcgz.zzf(zzaefVar.zzcdj);
        String str = uuid;
        Bundle bundle3 = (Bundle) zzano.zza(zza, (Object) null, ((Long) zzkb.zzik().zzd(zznk.zzbdf)).longValue(), TimeUnit.MILLISECONDS);
        zzagk zzagkVar = (zzagk) zzano.zza(zza2, (Object) null);
        Location location = (Location) zzano.zza(zza4, (Object) null);
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) zzano.zza((Future<Object>) zzi2, (Object) null);
        String str2 = (String) zzano.zza(zza3, (Object) null);
        String str3 = (String) zzano.zza(zzcl, (Object) null);
        String str4 = (String) zzano.zza(zzcm, (Object) null);
        zzaga zzagaVar = (zzaga) zzano.zza(zzq, (Object) null);
        if (zzagaVar == null) {
            zzakb.zzdk("Error fetching device info. This is not recoverable.");
            return new zzaej(0);
        }
        zzafl zzaflVar = new zzafl();
        zzaflVar.zzcgs = zzaefVar;
        zzaflVar.zzcgt = zzagaVar;
        zzaflVar.zzcgo = zzagkVar;
        zzaflVar.zzaqe = location;
        zzaflVar.zzcgn = bundle3;
        zzaflVar.zzccx = str2;
        zzaflVar.zzcgr = info;
        if (zzf == null) {
            zzaflVar.zzcdj.clear();
        }
        zzaflVar.zzcdj = zzf;
        zzaflVar.zzcdc = bundle2;
        zzaflVar.zzcgp = str3;
        zzaflVar.zzcgq = str4;
        zzaflVar.zzcgu = zzafmVar.zzcgx.zze(context);
        zzaflVar.zzcgv = zzafmVar.zzcgv;
        JSONObject zza5 = zzafs.zza(context, zzaflVar);
        if (zza5 == null) {
            return new zzaej(0);
        }
        if (zzaefVar.versionCode < 7) {
            try {
                zza5.put("request_id", str);
            } catch (JSONException unused) {
            }
        }
        zznxVar.zza(zzjj, "arc");
        zznxVar.zzjj();
        zzanz zza6 = zzano.zza(zzano.zza(zzafmVar.zzchg.zzof().zzf(zza5), zzafo.zzxn, scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        zzanz<Void> zzop = zzafmVar.zzcha.zzop();
        if (zzop != null) {
            zzanm.zza(zzop, "AdRequestServiceImpl.loadAd.flags");
        }
        zzafz zzafzVar = (zzafz) zzano.zza(zza6, (Object) null);
        if (zzafzVar == null) {
            return new zzaej(0);
        }
        if (zzafzVar.getErrorCode() != -2) {
            return new zzaej(zzafzVar.getErrorCode());
        }
        zznxVar.zzjm();
        zzaej zza7 = !TextUtils.isEmpty(zzafzVar.zzom()) ? zzafs.zza(context, zzaefVar, zzafzVar.zzom()) : null;
        if (zza7 == null && !TextUtils.isEmpty(zzafzVar.getUrl())) {
            zza7 = zza(zzaefVar, context, zzaefVar.zzacr.zzcw, zzafzVar.getUrl(), str3, str4, zzafzVar, zznxVar, zzafmVar);
        }
        if (zza7 == null) {
            zza7 = new zzaej(0);
        }
        zznxVar.zza(zzjj, "tts");
        zza7.zzcfd = zznxVar.zzjk();
        return zza7;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x01ca, TryCatch #4 {all -> 0x01ca, blocks: (B:13:0x004f, B:15:0x0060, B:17:0x0066, B:18:0x0070, B:20:0x0076, B:21:0x0082, B:23:0x008a, B:26:0x0097, B:28:0x00a1, B:33:0x00bc, B:34:0x00cc, B:38:0x00e9, B:43:0x00fd, B:45:0x010b, B:46:0x0114, B:55:0x012e, B:56:0x0131, B:60:0x0132, B:64:0x0140, B:82:0x014c, B:66:0x0162, B:76:0x017b, B:68:0x0191, B:89:0x01a5, B:98:0x00c7, B:99:0x00ca), top: B:12:0x004f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaej zza(zzaef zzaefVar, Context context, String str, String str2, String str3, String str4, zzafz zzafzVar, zznx zznxVar, zzafm zzafmVar) {
        HttpURLConnection httpURLConnection;
        String str5;
        byte[] bArr;
        int responseCode;
        Map<String, List<String>> headerFields;
        InputStreamReader inputStreamReader;
        BufferedOutputStream bufferedOutputStream;
        zzaef zzaefVar2 = zzaefVar;
        zznv zzjj = zznxVar != null ? zznxVar.zzjj() : null;
        try {
            zzafx zzafxVar = new zzafx(zzaefVar2, zzafzVar.zzoi());
            String valueOf = String.valueOf(str2);
            zzakb.zzck(valueOf.length() != 0 ? "AdRequestServiceImpl: Sending request: ".concat(valueOf) : new String("AdRequestServiceImpl: Sending request: "));
            URL url = new URL(str2);
            long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
            boolean z = false;
            int i = 0;
            while (true) {
                if (zzafmVar != null) {
                    zzafmVar.zzchc.zzoq();
                }
                httpURLConnection = (HttpURLConnection) url.openConnection();
                try {
                    com.google.android.gms.ads.internal.zzbv.zzek().zza(context, str, z, httpURLConnection);
                    if (zzafzVar.zzok()) {
                        if (!TextUtils.isEmpty(str3)) {
                            httpURLConnection.addRequestProperty("x-afma-drt-cookie", str3);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            httpURLConnection.addRequestProperty("x-afma-drt-v2-cookie", str4);
                            str5 = zzaefVar2.zzcds;
                            if (!TextUtils.isEmpty(str5)) {
                                zzakb.zzck("Sending webview cookie in ad request header.");
                                httpURLConnection.addRequestProperty("Cookie", str5);
                            }
                            if (zzafzVar != null || TextUtils.isEmpty(zzafzVar.zzoj())) {
                                bArr = null;
                            } else {
                                httpURLConnection.setDoOutput(true);
                                bArr = zzafzVar.zzoj().getBytes();
                                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                                try {
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                    try {
                                        bufferedOutputStream2.write(bArr);
                                        IOUtils.closeQuietly(bufferedOutputStream2);
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        IOUtils.closeQuietly(bufferedOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = null;
                                }
                            }
                            zzamy zzamyVar = new zzamy(zzaefVar2.zzcdi);
                            zzamyVar.zza(httpURLConnection, bArr);
                            responseCode = httpURLConnection.getResponseCode();
                            headerFields = httpURLConnection.getHeaderFields();
                            zzamyVar.zza(httpURLConnection, responseCode);
                            if (responseCode >= 200 || responseCode >= 300) {
                                zza(url.toString(), headerFields, (String) null, responseCode);
                                if (responseCode < 300 || responseCode >= 400) {
                                    break;
                                }
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    zzakb.zzdk("No location header to follow redirect.");
                                    zzaej zzaejVar = new zzaej(0);
                                    httpURLConnection.disconnect();
                                    if (zzafmVar != null) {
                                        zzafmVar.zzchc.zzor();
                                    }
                                    return zzaejVar;
                                }
                                url = new URL(headerField);
                                i++;
                                if (i > ((Integer) zzkb.zzik().zzd(zznk.zzbes)).intValue()) {
                                    zzakb.zzdk("Too many redirects.");
                                    zzaej zzaejVar2 = new zzaej(0);
                                    httpURLConnection.disconnect();
                                    if (zzafmVar != null) {
                                        zzafmVar.zzchc.zzor();
                                    }
                                    return zzaejVar2;
                                }
                                zzafxVar.zzl(headerFields);
                                httpURLConnection.disconnect();
                                if (zzafmVar != null) {
                                    zzafmVar.zzchc.zzor();
                                }
                                zzaefVar2 = zzaefVar;
                                z = false;
                            } else {
                                String url2 = url.toString();
                                try {
                                    InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        com.google.android.gms.ads.internal.zzbv.zzek();
                                        String zza = zzakk.zza(inputStreamReader2);
                                        IOUtils.closeQuietly(inputStreamReader2);
                                        zzamyVar.zzdg(zza);
                                        zza(url2, headerFields, zza, responseCode);
                                        zzafxVar.zza(url2, headerFields, zza);
                                        if (zznxVar != null) {
                                            zznxVar.zza(zzjj, "ufe");
                                        }
                                        return zzafxVar.zza(elapsedRealtime, zzafzVar.zzon());
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStreamReader = inputStreamReader2;
                                        IOUtils.closeQuietly(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = null;
                                }
                            }
                        }
                    }
                    str5 = zzaefVar2.zzcds;
                    if (!TextUtils.isEmpty(str5)) {
                    }
                    if (zzafzVar != null) {
                    }
                    bArr = null;
                    zzamy zzamyVar2 = new zzamy(zzaefVar2.zzcdi);
                    zzamyVar2.zza(httpURLConnection, bArr);
                    responseCode = httpURLConnection.getResponseCode();
                    headerFields = httpURLConnection.getHeaderFields();
                    zzamyVar2.zza(httpURLConnection, responseCode);
                    if (responseCode >= 200) {
                    }
                    zza(url.toString(), headerFields, (String) null, responseCode);
                    if (responseCode < 300) {
                        break;
                    }
                    break;
                } finally {
                    httpURLConnection.disconnect();
                    if (zzafmVar != null) {
                        zzafmVar.zzchc.zzor();
                    }
                }
            }
            StringBuilder sb = new StringBuilder(46);
            sb.append("Received error HTTP response code: ");
            sb.append(responseCode);
            zzakb.zzdk(sb.toString());
            zzaej zzaejVar3 = new zzaej(0);
            httpURLConnection.disconnect();
            if (zzafmVar != null) {
                zzafmVar.zzchc.zzor();
            }
            return zzaejVar3;
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            zzakb.zzdk(valueOf2.length() != 0 ? "Error while connecting to ad server: ".concat(valueOf2) : new String("Error while connecting to ad server: "));
            return new zzaej(2);
        }
    }

    public static zzafn zza(Context context, zzafm zzafmVar) {
        zzafn zzafnVar;
        synchronized (sLock) {
            if (zzchh == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                zznk.initialize(context);
                zzchh = new zzafn(context, zzafmVar);
                if (context.getApplicationContext() != null) {
                    com.google.android.gms.ads.internal.zzbv.zzek().zzal(context);
                }
                zzajz.zzai(context);
            }
            zzafnVar = zzchh;
        }
        return zzafnVar;
    }

    private static void zza(String str, Map<String, List<String>> map, String str2, int i) {
        if (zzakb.isLoggable(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            zzakb.v(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    zzakb.v(sb2.toString());
                    Iterator<String> it = map.get(str3).iterator();
                    while (it.hasNext()) {
                        String valueOf = String.valueOf(it.next());
                        zzakb.v(valueOf.length() != 0 ? "      ".concat(valueOf) : new String("      "));
                    }
                }
            }
            zzakb.v("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    zzakb.v(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                zzakb.v("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            zzakb.v(sb3.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(zzaef zzaefVar, zzaeq zzaeqVar) {
        com.google.android.gms.ads.internal.zzbv.zzeo().zzd(this.mContext, zzaefVar.zzacr);
        zzanz<?> zzb = zzaki.zzb(new zzafp(this, zzaefVar, zzaeqVar));
        com.google.android.gms.ads.internal.zzbv.zzez().zzsa();
        com.google.android.gms.ads.internal.zzbv.zzez().getHandler().postDelayed(new zzafq(this, zzb), 60000L);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zza(zzaey zzaeyVar, zzaet zzaetVar) {
        zzakb.v("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final zzaej zzb(zzaef zzaefVar) {
        return zza(this.mContext, this.zzchi, zzaefVar, this.zzchj);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final void zzb(zzaey zzaeyVar, zzaet zzaetVar) {
        zzakb.v("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }
}
