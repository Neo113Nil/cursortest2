package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzadh
/* loaded from: classes.dex */
public final class zzabv implements Callable<zzajh> {

    @VisibleForTesting
    private static long zzbzx = 10;
    private final Context mContext;
    private final zzacm zzaad;
    private final zzci zzbjc;
    private final zzaji zzbze;
    private final zzalt zzbzy;
    private final com.google.android.gms.ads.internal.zzbc zzbzz;
    private JSONObject zzcac;
    private final zznx zzvr;
    private final Object mLock = new Object();
    private boolean zzcaa = false;
    private int mErrorCode = -2;
    private List<String> zzcab = null;
    private String zzcad = null;

    @Nullable
    private String zzcae = null;

    public zzabv(Context context, com.google.android.gms.ads.internal.zzbc zzbcVar, zzalt zzaltVar, zzci zzciVar, zzaji zzajiVar, zznx zznxVar) {
        this.mContext = context;
        this.zzbzz = zzbcVar;
        this.zzbzy = zzaltVar;
        this.zzbze = zzajiVar;
        this.zzbjc = zzciVar;
        this.zzvr = zznxVar;
        this.zzaad = zzbcVar.zzdr();
    }

    private final zzajh zza(zzpb zzpbVar, boolean z) {
        int i;
        synchronized (this.mLock) {
            i = (zzpbVar == null && this.mErrorCode == -2) ? 0 : this.mErrorCode;
        }
        return new zzajh(this.zzbze.zzcgs.zzccv, null, this.zzbze.zzcos.zzbsn, i, this.zzbze.zzcos.zzbso, this.zzcab, this.zzbze.zzcos.orientation, this.zzbze.zzcos.zzbsu, this.zzbze.zzcgs.zzccy, false, null, null, null, null, null, 0L, this.zzbze.zzacv, this.zzbze.zzcos.zzcep, this.zzbze.zzcoh, this.zzbze.zzcoi, this.zzbze.zzcos.zzcev, this.zzcac, i != -2 ? null : zzpbVar, null, null, null, this.zzbze.zzcos.zzcfh, this.zzbze.zzcos.zzcfi, null, this.zzbze.zzcos.zzbsr, this.zzcad, this.zzbze.zzcoq, this.zzbze.zzcos.zzzl, this.zzbze.zzcor, z, this.zzbze.zzcos.zzbsp, this.zzbze.zzcos.zzzm, this.zzcae);
    }

    private final zzanz<zzon> zza(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String string = z ? jSONObject.getString(ImagesContract.URL) : jSONObject.optString(ImagesContract.URL);
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (!TextUtils.isEmpty(string)) {
            return z2 ? zzano.zzi(new zzon(null, Uri.parse(string), optDouble)) : this.zzbzy.zza(string, new zzacb(this, z, optDouble, optBoolean, string));
        }
        zzd(0, z);
        return zzano.zzi(null);
    }

    private final void zzab(int i) {
        synchronized (this.mLock) {
            this.zzcaa = true;
            this.mErrorCode = i;
        }
    }

    private static zzaqw zzb(zzanz<zzaqw> zzanzVar) {
        try {
            return zzanzVar.get(((Integer) zzkb.zzik().zzd(zznk.zzbby)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzane.zzc("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            zzane.zzc("", e2);
            return null;
        }
    }

    private static Integer zzb(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    static zzaqw zzc(zzanz<zzaqw> zzanzVar) {
        try {
            return zzanzVar.get(((Integer) zzkb.zzik().zzd(zznk.zzbbx)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zzakb.zzc("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            zzakb.zzc("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzqs zzqsVar, String str) {
        try {
            zzrc zzr = this.zzbzz.zzr(zzqsVar.getCustomTemplateId());
            if (zzr != null) {
                zzr.zzb(zzqsVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzakb.zzc(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> List<V> zzk(List<zzanz<V>> list) throws ExecutionException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        Iterator<zzanz<V>> it = list.iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r3.length() != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c2 A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0182 A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0168 A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0093 A[Catch: Exception -> 0x01df, TimeoutException -> 0x01e3, InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TryCatch #2 {InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e7, TimeoutException -> 0x01e3, Exception -> 0x01df, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x002a, B:9:0x0032, B:11:0x003a, B:13:0x0044, B:15:0x005c, B:16:0x006f, B:18:0x0077, B:19:0x00a3, B:23:0x00ad, B:25:0x00bb, B:26:0x00c5, B:28:0x00cd, B:29:0x00d7, B:31:0x00df, B:32:0x014d, B:37:0x0158, B:42:0x0186, B:43:0x01be, B:45:0x01c2, B:46:0x01d1, B:50:0x0182, B:51:0x0168, B:52:0x016f, B:54:0x0175, B:57:0x00e9, B:59:0x00f1, B:60:0x00fb, B:62:0x0103, B:64:0x0122, B:65:0x0128, B:67:0x013a, B:68:0x0145, B:69:0x013f, B:70:0x0149, B:74:0x007d, B:77:0x0086, B:80:0x0093, B:82:0x0040), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    @Override // java.util.concurrent.Callable
    /* renamed from: zznw, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzajh call() {
        String str;
        JSONObject jSONObject;
        boolean optBoolean;
        JSONObject optJSONObject;
        final String optString;
        zzanz zzanzVar;
        zzacd zzacdVar;
        zzpb zzpbVar;
        JSONArray optJSONArray;
        String[] strArr;
        String string;
        try {
            String uuid = this.zzbzz.getUuid();
            if (!zznx()) {
                JSONObject jSONObject2 = new JSONObject(this.zzbze.zzcos.zzceo);
                JSONObject jSONObject3 = new JSONObject(this.zzbze.zzcos.zzceo);
                if (jSONObject3.length() != 0) {
                    JSONArray optJSONArray2 = jSONObject3.optJSONArray("ads");
                    JSONObject optJSONObject2 = optJSONArray2 != null ? optJSONArray2.optJSONObject(0) : null;
                    if (optJSONObject2 != null) {
                    }
                }
                zzab(3);
                JSONObject jSONObject4 = this.zzaad.zzh(jSONObject2).get(zzbzx, TimeUnit.SECONDS);
                if (jSONObject4.optBoolean(FirebaseAnalytics.Param.SUCCESS, false)) {
                    jSONObject = jSONObject4.getJSONObject("json").optJSONArray("ads").getJSONObject(0);
                    optBoolean = jSONObject.optBoolean("enable_omid");
                    if (optBoolean && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
                        optString = optJSONObject.optString("omid_html");
                        if (TextUtils.isEmpty(optString)) {
                            final zzaoj zzaojVar = new zzaoj();
                            zzaoe.zzcvy.execute(new Runnable(this, zzaojVar, optString) { // from class: com.google.android.gms.internal.ads.zzabw
                                private final zzabv zzcaf;
                                private final zzaoj zzcag;
                                private final String zzcah;

                                {
                                    this.zzcaf = this;
                                    this.zzcag = zzaojVar;
                                    this.zzcah = optString;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zzcaf.zza(this.zzcag, this.zzcah);
                                }
                            });
                            zzanzVar = zzaojVar;
                            if (!zznx() && jSONObject != null) {
                                string = jSONObject.getString("template_id");
                                boolean z = this.zzbze.zzcgs.zzadj == null ? this.zzbze.zzcgs.zzadj.zzbjn : false;
                                boolean z2 = this.zzbze.zzcgs.zzadj == null ? this.zzbze.zzcgs.zzadj.zzbjp : false;
                                if (!"2".equals(string)) {
                                    zzacdVar = new zzacn(z, z2, this.zzbze.zzcor);
                                } else if ("1".equals(string)) {
                                    zzacdVar = new zzaco(z, z2, this.zzbze.zzcor);
                                } else if ("3".equals(string)) {
                                    String string2 = jSONObject.getString("custom_template_id");
                                    zzaoj zzaojVar2 = new zzaoj();
                                    zzakk.zzcrm.post(new zzaby(this, zzaojVar2, string2));
                                    if (zzaojVar2.get(zzbzx, TimeUnit.SECONDS) != null) {
                                        zzacdVar = new zzacp(z);
                                    } else {
                                        String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
                                        zzakb.e(valueOf.length() != 0 ? "No handler for custom template: ".concat(valueOf) : new String("No handler for custom template: "));
                                    }
                                } else {
                                    zzab(0);
                                }
                                if (!zznx() && zzacdVar != null && jSONObject != null) {
                                    JSONObject jSONObject5 = jSONObject.getJSONObject("tracking_urls_and_actions");
                                    optJSONArray = jSONObject5.optJSONArray("impression_tracking_urls");
                                    if (optJSONArray != null) {
                                        strArr = null;
                                    } else {
                                        strArr = new String[optJSONArray.length()];
                                        for (int i = 0; i < optJSONArray.length(); i++) {
                                            strArr[i] = optJSONArray.getString(i);
                                        }
                                    }
                                    this.zzcab = strArr != null ? null : Arrays.asList(strArr);
                                    this.zzcac = jSONObject5.optJSONObject("active_view");
                                    this.zzcad = jSONObject.optString("debug_signals");
                                    this.zzcae = jSONObject.optString("omid_settings");
                                    zzpbVar = zzacdVar.zza(this, jSONObject);
                                    zzpbVar.zzb(new zzpd(this.mContext, this.zzbzz, this.zzaad, this.zzbjc, jSONObject, zzpbVar, this.zzbze.zzcgs.zzacr, uuid));
                                    if (zzpbVar instanceof zzos) {
                                        this.zzaad.zza("/nativeAdCustomClick", new zzabz(this, (zzos) zzpbVar));
                                    }
                                    zzajh zza = zza(zzpbVar, optBoolean);
                                    this.zzbzz.zzg(zzb(zzanzVar));
                                    return zza;
                                }
                                zzpbVar = null;
                                if (zzpbVar instanceof zzos) {
                                }
                                zzajh zza2 = zza(zzpbVar, optBoolean);
                                this.zzbzz.zzg(zzb(zzanzVar));
                                return zza2;
                            }
                            zzacdVar = null;
                            if (!zznx()) {
                                JSONObject jSONObject52 = jSONObject.getJSONObject("tracking_urls_and_actions");
                                optJSONArray = jSONObject52.optJSONArray("impression_tracking_urls");
                                if (optJSONArray != null) {
                                }
                                this.zzcab = strArr != null ? null : Arrays.asList(strArr);
                                this.zzcac = jSONObject52.optJSONObject("active_view");
                                this.zzcad = jSONObject.optString("debug_signals");
                                this.zzcae = jSONObject.optString("omid_settings");
                                zzpbVar = zzacdVar.zza(this, jSONObject);
                                zzpbVar.zzb(new zzpd(this.mContext, this.zzbzz, this.zzaad, this.zzbjc, jSONObject, zzpbVar, this.zzbze.zzcgs.zzacr, uuid));
                                if (zzpbVar instanceof zzos) {
                                }
                                zzajh zza22 = zza(zzpbVar, optBoolean);
                                this.zzbzz.zzg(zzb(zzanzVar));
                                return zza22;
                            }
                            zzpbVar = null;
                            if (zzpbVar instanceof zzos) {
                            }
                            zzajh zza222 = zza(zzpbVar, optBoolean);
                            this.zzbzz.zzg(zzb(zzanzVar));
                            return zza222;
                        }
                    }
                    zzanzVar = zzano.zzi(null);
                    if (!zznx()) {
                        string = jSONObject.getString("template_id");
                        if (this.zzbze.zzcgs.zzadj == null) {
                        }
                        if (this.zzbze.zzcgs.zzadj == null) {
                        }
                        if (!"2".equals(string)) {
                        }
                        if (!zznx()) {
                        }
                        zzpbVar = null;
                        if (zzpbVar instanceof zzos) {
                        }
                        zzajh zza2222 = zza(zzpbVar, optBoolean);
                        this.zzbzz.zzg(zzb(zzanzVar));
                        return zza2222;
                    }
                    zzacdVar = null;
                    if (!zznx()) {
                    }
                    zzpbVar = null;
                    if (zzpbVar instanceof zzos) {
                    }
                    zzajh zza22222 = zza(zzpbVar, optBoolean);
                    this.zzbzz.zzg(zzb(zzanzVar));
                    return zza22222;
                }
            }
            jSONObject = null;
            optBoolean = jSONObject.optBoolean("enable_omid");
            if (optBoolean) {
                optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                }
            }
            zzanzVar = zzano.zzi(null);
            if (!zznx()) {
            }
            zzacdVar = null;
            if (!zznx()) {
            }
            zzpbVar = null;
            if (zzpbVar instanceof zzos) {
            }
            zzajh zza222222 = zza(zzpbVar, optBoolean);
            this.zzbzz.zzg(zzb(zzanzVar));
            return zza222222;
        } catch (InterruptedException | CancellationException | ExecutionException | JSONException e) {
            e = e;
            str = "Malformed native JSON response.";
            zzakb.zzc(str, e);
            if (!this.zzcaa) {
                zzab(0);
            }
            return zza((zzpb) null, false);
        } catch (TimeoutException e2) {
            e = e2;
            str = "Timeout when loading native ad.";
            zzakb.zzc(str, e);
            if (!this.zzcaa) {
            }
            return zza((zzpb) null, false);
        } catch (Exception e3) {
            e = e3;
            str = "Error occured while doing native ads initialization.";
            zzakb.zzc(str, e);
            if (!this.zzcaa) {
            }
            return zza((zzpb) null, false);
        }
    }

    private final boolean zznx() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzcaa;
        }
        return z;
    }

    public final zzanz<zzon> zza(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, z, z2);
    }

    public final List<zzanz<zzon>> zza(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            zzd(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(zza(jSONObject2, false, z2));
        }
        return arrayList;
    }

    public final Future<zzon> zza(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return zza(jSONObject2, optBoolean, z);
    }

    final /* synthetic */ void zza(final zzaoj zzaojVar, String str) {
        try {
            com.google.android.gms.ads.internal.zzbv.zzel();
            final zzaqw zza = zzarc.zza(this.mContext, zzasi.zzvq(), "native-omid", false, false, this.zzbjc, this.zzbze.zzcgs.zzacr, this.zzvr, null, this.zzbzz.zzbi(), this.zzbze.zzcoq);
            zza.zzuf().zza(new zzasd(zzaojVar, zza) { // from class: com.google.android.gms.internal.ads.zzabx
                private final zzaoj zzbnu;
                private final zzaqw zzcai;

                {
                    this.zzbnu = zzaojVar;
                    this.zzcai = zza;
                }

                @Override // com.google.android.gms.internal.ads.zzasd
                public final void zze(boolean z) {
                    this.zzbnu.set(this.zzcai);
                }
            });
            zza.loadData(str, "text/html", "UTF-8");
        } catch (Exception e) {
            zzaojVar.set(null);
            zzane.zzc("", e);
        }
    }

    public final zzanz<zzaqw> zzc(JSONObject jSONObject, String str) throws JSONException {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzano.zzi(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            zzakb.zzdk("Required field 'vast_xml' is missing");
            return zzano.zzi(null);
        }
        final zzace zzaceVar = new zzace(this.mContext, this.zzbjc, this.zzbze, this.zzvr, this.zzbzz);
        final zzaoj zzaojVar = new zzaoj();
        zzaoe.zzcvy.execute(new Runnable(zzaceVar, optJSONObject, zzaojVar) { // from class: com.google.android.gms.internal.ads.zzacf
            private final zzaoj zzbns;
            private final zzace zzcbf;
            private final JSONObject zzcbg;

            {
                this.zzcbf = zzaceVar;
                this.zzcbg = optJSONObject;
                this.zzbns = zzaojVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcbf.zza(this.zzcbg, this.zzbns);
            }
        });
        return zzaojVar;
    }

    public final void zzd(int i, boolean z) {
        if (z) {
            zzab(i);
        }
    }

    public final zzanz<zzoj> zzg(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzano.zzi(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer zzb = zzb(optJSONObject, "text_color");
        Integer zzb2 = zzb(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.zzbze.zzcgs.zzadj == null || this.zzbze.zzcgs.zzadj.versionCode < 2) ? 1 : this.zzbze.zzcgs.zzadj.zzbjq;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<zzanz<zzon>> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = zza(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(zza(optJSONObject, "image", false, false));
        }
        zzaoj zzaojVar = new zzaoj();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator<zzanz<zzon>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().zza(new zzacc(atomicInteger, size, zzaojVar, arrayList), zzaki.zzcrj);
            arrayList = arrayList;
        }
        return zzano.zza(zzaojVar, new zzaca(this, optString, zzb2, zzb, optInt, optInt3, optInt2, i, optBoolean), zzaki.zzcrj);
    }
}
