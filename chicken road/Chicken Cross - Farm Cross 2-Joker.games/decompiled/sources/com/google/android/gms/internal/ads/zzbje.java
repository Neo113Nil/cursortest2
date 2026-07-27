package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbje implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbjb
                    @Override // com.google.android.gms.internal.ads.zzgvc
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0119, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbji.zza(new com.google.android.gms.internal.ads.zzbjc(r3))).optBoolean("local_flags_enabled") != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x017a, DONT_GENERATE, TRY_ENTER, TryCatch #3 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0013, B:15:0x0015, B:17:0x0027, B:18:0x002b, B:20:0x002d, B:38:0x009d, B:39:0x00a4, B:48:0x00d3, B:49:0x00da, B:56:0x011f, B:57:0x0126, B:70:0x0168, B:71:0x016f, B:93:0x0172, B:94:0x0179, B:23:0x0042, B:28:0x005d, B:30:0x0066, B:31:0x006e, B:33:0x0074, B:35:0x0084, B:37:0x0099, B:41:0x00a6, B:43:0x00aa, B:45:0x00ba, B:47:0x00cf, B:51:0x00dc, B:54:0x011b, B:59:0x0128, B:61:0x0135, B:63:0x0143, B:64:0x014c, B:66:0x015a, B:68:0x015e, B:69:0x0161, B:73:0x00ed, B:75:0x00fb, B:77:0x0103, B:79:0x010e, B:84:0x0049, B:86:0x0053), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #0 {all -> 0x0171, blocks: (B:23:0x0042, B:28:0x005d, B:30:0x0066, B:31:0x006e, B:33:0x0074, B:35:0x0084, B:37:0x0099, B:41:0x00a6, B:43:0x00aa, B:45:0x00ba, B:47:0x00cf, B:51:0x00dc, B:54:0x011b, B:59:0x0128, B:61:0x0135, B:63:0x0143, B:64:0x014c, B:66:0x015a, B:68:0x015e, B:69:0x0161, B:73:0x00ed, B:75:0x00fb, B:77:0x0103, B:79:0x010e, B:84:0x0049, B:86:0x0053), top: B:22:0x0042, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context context3 = this.zzg;
                SharedPreferences sharedPreferences2 = null;
                if (context3 == null) {
                    context3 = null;
                } else {
                    try {
                        context2 = context3.createPackageContext("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        context2 = null;
                    }
                    if (context2 != null || (context2 = context3.getApplicationContext()) != null) {
                        context3 = context2;
                    }
                }
                if (context3 != null) {
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    sharedPreferences2 = zzbiz.zzb(context3);
                }
                if (sharedPreferences2 != null) {
                    zzblz.zzc(new zzbja(this, sharedPreferences2));
                }
                if (!this.zzi) {
                    zzbkq zzbkqVar = zzbkz.zzd;
                    if (((Long) zzbkqVar.zze()).longValue() > 0 && zzbir.zzd(this.zzg) >= ((Long) zzbkqVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbkq zzbkqVar2 = zzbkz.zzf;
                    if (((Long) zzbkqVar2.zze()).longValue() > 0 && zzbir.zzc(this.zzg) >= ((Long) zzbkqVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                Context context4 = this.zzg;
                if (!((Boolean) zzblh.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzblh.zzl.zze()).booleanValue() && (r3 = context4.getSharedPreferences("admob", 0)) != null) {
                    }
                    if (context3 != null) {
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    this.zze = zzbiz.zzb(context3);
                    if (!this.zzi && ((Boolean) zzblh.zze.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                    }
                    if (!((Boolean) zzblh.zzc.zze()).booleanValue() && (sharedPreferences = this.zze) != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context3 = this.zzg;
                if (context3 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbix zzbixVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbixVar.zzf();
            }
        }
        if (zzbixVar.zzm() != 2) {
            return (zzbixVar.zzm() == 1 && this.zzh.has(zzbixVar.zze())) ? zzbixVar.zzc(this.zzh) : zzbji.zza(new zzgvc() { // from class: com.google.android.gms.internal.ads.zzbjd
                @Override // com.google.android.gms.internal.ads.zzgvc
                public final /* synthetic */ Object zza() {
                    return zzbje.this.zzf(zzbixVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbixVar.zzf() : zzbixVar.zza(bundle);
    }

    public final Object zze(zzbix zzbixVar) {
        return (this.zzd || this.zza) ? zzd(zzbixVar) : zzbixVar.zzf();
    }

    final /* synthetic */ Object zzf(zzbix zzbixVar) {
        return zzbixVar.zzd(this.zze);
    }
}
