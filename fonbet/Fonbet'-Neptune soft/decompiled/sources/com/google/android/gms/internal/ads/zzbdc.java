package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbdc implements SharedPreferences.OnSharedPreferenceChangeListener {
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
                this.zzh = new JSONObject((String) zzbdg.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbcz
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
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

    public final Object zzb(final zzbcv zzbcvVar) {
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
                return zzbcvVar.zzl();
            }
        }
        if (zzbcvVar.zze() != 2) {
            return (zzbcvVar.zze() == 1 && this.zzh.has(zzbcvVar.zzm())) ? zzbcvVar.zza(this.zzh) : zzbdg.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbda
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object zza() {
                    Object zzc;
                    zzc = zzbcvVar.zzc(zzbdc.this.zze);
                    return zzc;
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbcvVar.zzl() : zzbcvVar.zzb(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010d, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbdg.zza(new com.google.android.gms.internal.ads.zzbcy(r3))).optBoolean("local_flags_enabled") != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[Catch: all -> 0x0153, TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0009, B:8:0x000d, B:11:0x000f, B:13:0x0014, B:14:0x0016, B:16:0x0028, B:17:0x002c, B:19:0x002e, B:38:0x0098, B:39:0x0117, B:40:0x011a, B:49:0x00cb, B:55:0x0113, B:62:0x0141, B:63:0x0148, B:78:0x014b, B:79:0x0152, B:22:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x0061, B:31:0x0069, B:33:0x006f, B:35:0x007f, B:37:0x0094, B:42:0x009e, B:44:0x00a2, B:46:0x00b2, B:48:0x00c7, B:50:0x00d0, B:53:0x010f, B:56:0x011c, B:58:0x0133, B:60:0x0137, B:61:0x013a, B:65:0x00e1, B:67:0x00ef, B:69:0x00f7, B:71:0x0102), top: B:5:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: all -> 0x014a, TRY_ENTER, TryCatch #3 {all -> 0x014a, blocks: (B:22:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x0061, B:31:0x0069, B:33:0x006f, B:35:0x007f, B:37:0x0094, B:42:0x009e, B:44:0x00a2, B:46:0x00b2, B:48:0x00c7, B:50:0x00d0, B:53:0x010f, B:56:0x011c, B:58:0x0133, B:60:0x0137, B:61:0x013a, B:65:0x00e1, B:67:0x00ef, B:69:0x00f7, B:71:0x0102), top: B:21:0x0043, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ConditionVariable conditionVariable;
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
                Context context2 = this.zzg;
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                    context2 = remoteContext;
                }
                if (context2 != null) {
                    com.google.android.gms.ads.internal.client.zzbd.zzb();
                    sharedPreferences = zzbcx.zza(context2);
                } else {
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    zzbfv.zzc(new zzbdb(this, sharedPreferences));
                }
                if (!this.zzi) {
                    zzbeo zzbeoVar = zzbew.zzd;
                    if (((Long) zzbeoVar.zze()).longValue() > 0 && zzbco.zza(this.zzg) >= ((Long) zzbeoVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        conditionVariable = this.zzc;
                        conditionVariable.open();
                        return;
                    }
                }
                if (!this.zzi) {
                    zzbeo zzbeoVar2 = zzbew.zzf;
                    if (((Long) zzbeoVar2.zze()).longValue() > 0 && zzbco.zzb(this.zzg) >= ((Long) zzbeoVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        this.zza = false;
                        conditionVariable = this.zzc;
                        conditionVariable.open();
                        return;
                    }
                }
                Context context3 = this.zzg;
                if (!((Boolean) zzbfe.zzg.zze()).booleanValue()) {
                    if (((Boolean) zzbfe.zzh.zze()).booleanValue() && (r3 = context3.getSharedPreferences("admob", 0)) != null) {
                    }
                    if (context2 != null) {
                        this.zza = false;
                        conditionVariable = this.zzc;
                        conditionVariable.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbd.zzb();
                    this.zze = zzbcx.zza(context2);
                    if (!((Boolean) zzbfe.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context2 = this.zzg;
                if (context2 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    final boolean zzf() {
        return this.zzi;
    }

    public final Object zzc(zzbcv zzbcvVar) {
        return (this.zzd || this.zza) ? zzb(zzbcvVar) : zzbcvVar.zzl();
    }
}
