package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.g;
import n3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbbw implements SharedPreferences.OnSharedPreferenceChangeListener {
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
                this.zzh = new JSONObject((String) zzbca.zza(new zzftz() { // from class: com.google.android.gms.internal.ads.zzbbt
                    @Override // com.google.android.gms.internal.ads.zzftz
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

    public final Object zzb(final zzbbp zzbbpVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbbpVar.zzk();
            }
        }
        if (zzbbpVar.zze() != 2) {
            return (zzbbpVar.zze() == 1 && this.zzh.has(zzbbpVar.zzl())) ? zzbbpVar.zza(this.zzh) : zzbca.zza(new zzftz() { // from class: com.google.android.gms.internal.ads.zzbbu
                @Override // com.google.android.gms.internal.ads.zzftz
                public final Object zza() {
                    Object zzc;
                    zzc = zzbbpVar.zzc(zzbbw.this.zze);
                    return zzc;
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbbpVar.zzk() : zzbbpVar.zzb(bundle);
    }

    public final Object zzc(zzbbp zzbbpVar) {
        return (this.zzd || this.zza) ? zzb(zzbbpVar) : zzbbpVar.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011b, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbca.zza(new com.google.android.gms.internal.ads.zzbbs(r3))).optBoolean("local_flags_enabled") != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x0011, B:14:0x0016, B:15:0x0018, B:17:0x002a, B:18:0x002e, B:20:0x0030, B:39:0x009f, B:40:0x00a6, B:49:0x00d5, B:50:0x00dc, B:57:0x0121, B:58:0x0128, B:66:0x0150, B:67:0x0157, B:83:0x0159, B:84:0x0160, B:23:0x0045, B:26:0x004f, B:29:0x005c, B:31:0x0068, B:32:0x0070, B:34:0x0076, B:36:0x0086, B:38:0x009b, B:42:0x00a8, B:44:0x00ac, B:46:0x00bc, B:48:0x00d1, B:52:0x00de, B:55:0x011d, B:60:0x012a, B:62:0x0142, B:64:0x0146, B:65:0x0149, B:69:0x00ef, B:71:0x00fd, B:73:0x0105, B:75:0x0110), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:23:0x0045, B:26:0x004f, B:29:0x005c, B:31:0x0068, B:32:0x0070, B:34:0x0076, B:36:0x0086, B:38:0x009b, B:42:0x00a8, B:44:0x00ac, B:46:0x00bc, B:48:0x00d1, B:52:0x00de, B:55:0x011d, B:60:0x012a, B:62:0x0142, B:64:0x0146, B:65:0x0149, B:69:0x00ef, B:71:0x00fd, B:73:0x0105, B:75:0x0110), top: B:22:0x0045, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
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
                    this.zzf = c.a(context).q(128, this.zzg.getPackageName()).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    Context remoteContext = g.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 != null) {
                        zzbbr zzbbrVar = C0254t.f2723d.f2725b;
                        sharedPreferences = zzbbr.zza(context2);
                    } else {
                        sharedPreferences = null;
                    }
                    if (sharedPreferences != null) {
                        zzbep.zzc(new zzbbv(this, sharedPreferences));
                    }
                    if (!this.zzi) {
                        zzbdi zzbdiVar = zzbdq.zzd;
                        if (((Long) zzbdiVar.zze()).longValue() > 0 && zzbbi.zza(this.zzg) >= ((Long) zzbdiVar.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                    }
                    if (!this.zzi) {
                        zzbdi zzbdiVar2 = zzbdq.zzf;
                        if (((Long) zzbdiVar2.zze()).longValue() > 0 && zzbbi.zzb(this.zzg) >= ((Long) zzbdiVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                    }
                    Context context3 = this.zzg;
                    if (!((Boolean) zzbdy.zzg.zze()).booleanValue()) {
                        if (((Boolean) zzbdy.zzh.zze()).booleanValue() && (r3 = context3.getSharedPreferences("admob", 0)) != null) {
                        }
                        if (context2 != null) {
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        zzbbr zzbbrVar2 = C0254t.f2723d.f2725b;
                        this.zze = zzbbr.zza(context2);
                        if (!((Boolean) zzbdy.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                        }
                        zzg(this.zze);
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    context2 = this.zzg;
                    if (context2 != null) {
                    }
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
