package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.Y1;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private ListenableFuture zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzbgg zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = Y1.f;
    private int zzm = -1;
    private zzcfq zzn = new zzcfq("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private Set zzs = Collections.emptySet();
    private JSONObject zzt = new JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private String zzw = null;
    private String zzx = "";
    private boolean zzy = false;
    private String zzz = "";
    private String zzA = JsonUtils.EMPTY_JSON;
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;
    private boolean zzE = false;
    private int zzF = 0;
    private int zzG = 0;

    private final void zzX() {
        ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            int i22 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            int i222 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzY() {
        zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zzV();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        zzX();
        synchronized (this.zza) {
            this.zzl = str;
            if (this.zzg != null) {
                if (str.equals(Y1.f)) {
                    this.zzg.remove(AndroidTcfDataSource.TCF_TCSTRING_KEY);
                } else {
                    this.zzg.putString(AndroidTcfDataSource.TCF_TCSTRING_KEY, str);
                }
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzB() {
        zzX();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i) {
        zzX();
        synchronized (this.zza) {
            this.zzm = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzD() {
        zzX();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzC == i) {
                return;
            }
            this.zzC = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzF() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzD;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzD == j) {
                return;
            }
            this.zzD = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzH() {
        String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzx.equals(str)) {
                    return;
                }
                this.zzx = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzJ() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzy;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkK)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzy == z) {
                    return;
                }
                this.zzy = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzL() {
        String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkK)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzN() {
        String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkY)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzA.equals(str)) {
                    return;
                }
                this.zzA = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzE;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzQ(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzE) {
                return;
            }
            this.zzE = true;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_install_referrer_reported", true);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzR() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzF;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzS(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzF == i) {
                return;
            }
            this.zzF = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("total_inflight_ad_limit", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzT() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzG;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzU(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzG == i) {
                return;
            }
            this.zzG = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("default_queue_capacity", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    public final zzbgg zzV() {
        if (!this.zzb) {
            return null;
        }
        if ((zzc() && zze()) || !((Boolean) zzbky.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzbgg();
            }
            this.zze.zza();
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("start fetching content...");
            return this.zze;
        }
    }

    final /* synthetic */ void zzW(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                this.zzf = sharedPreferences;
                this.zzg = edit;
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                this.zzr = this.zzf.getInt("version_code", this.zzr);
                if (((Boolean) zzbkz.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
                    this.zzn = new zzcfq("", 0L);
                } else {
                    this.zzn = new zzcfq(this.zzf.getString("app_settings_json", this.zzn.zzd()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zzb()));
                }
                this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                this.zzw = this.zzf.getString("display_cutout", this.zzw);
                this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                this.zzx = this.zzf.getString("inspector_info", this.zzx);
                this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                this.zzl = this.zzf.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, this.zzl);
                this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                this.zzE = this.zzf.getBoolean("is_install_referrer_reported", this.zzE);
                this.zzF = this.zzf.getInt("total_inflight_ad_limit", this.zzF);
                this.zzG = this.zzf.getInt("default_queue_capacity", this.zzG);
                try {
                    this.zzt = new JSONObject(this.zzf.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                } catch (JSONException e) {
                    int i = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert native advanced settings to json object", e);
                }
                zzY();
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            final String str = "admob";
            this.zzd = zzcgj.zza.submit(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                private final /* synthetic */ Context zzb;
                private final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzj.this.zzW(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzb(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzu == z) {
                return;
            }
            this.zzu = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzc() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzd(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzv == z) {
                return;
            }
            this.zzv = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zze() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzf(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzr == i) {
                return;
            }
            this.zzr = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzg() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzr;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzh(String str) {
        zzX();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (str != null && !str.equals(this.zzn.zzd())) {
                this.zzn = new zzcfq(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzY();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.zzn.zza(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcfq zzi() {
        zzcfq zzcfqVar;
        zzX();
        synchronized (this.zza) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznq)).booleanValue() && this.zzn.zzj()) {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzcfqVar = this.zzn;
        }
        return zzcfqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcfq zzj() {
        zzcfq zzcfqVar;
        synchronized (this.zza) {
            zzcfqVar = this.zzn;
        }
        return zzcfqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzl(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzo == j) {
                return;
            }
            this.zzo = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzm() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzo;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzn(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzq == i) {
                return;
            }
            this.zzq = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzo() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzq;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzp == j) {
                return;
            }
            this.zzp = j;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzp;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(String str, String str2, boolean z) {
        zzX();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzt.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzt.put(str, optJSONArray);
            } catch (JSONException e) {
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzs() {
        JSONObject jSONObject;
        zzX();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        zzX();
        synchronized (this.zza) {
            this.zzt = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzu() {
        String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str) {
        zzX();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzw, str)) {
                return;
            }
            this.zzw = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzx() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbm)).booleanValue()) {
            return false;
        }
        zzX();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z) {
        zzX();
        synchronized (this.zza) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmd)).longValue();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzz() {
        zzX();
        synchronized (this.zza) {
            SharedPreferences sharedPreferences = this.zzf;
            boolean z = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z = true;
            }
            return z;
        }
    }
}
