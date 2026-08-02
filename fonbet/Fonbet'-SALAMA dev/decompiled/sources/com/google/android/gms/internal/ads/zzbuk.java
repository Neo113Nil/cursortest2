package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.g;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import io.sentry.SentryLockReason;
import org.json.JSONException;
import org.json.JSONObject;
import p3.d;

/* loaded from: classes.dex */
public final class zzbuk extends zzbui {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbng zzd;
    private final VersionInfoParcel zze;

    public zzbuk(Context context, zzbng zzbngVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbngVar;
    }

    public static Void zzb(zzbuk zzbukVar, JSONObject jSONObject) {
        zzbbp zzbbpVar = zzbby.zza;
        C0254t c0254t = C0254t.f2723d;
        zzbbr zzbbrVar = c0254t.f2725b;
        SharedPreferences zza = zzbbr.zza(zzbukVar.zzb);
        if (zza == null) {
            return null;
        }
        SharedPreferences.Editor edit = zza.edit();
        int i7 = zzbdo.zza;
        c0254t.f2724a.zze(edit, 1, jSONObject);
        edit.commit();
        SharedPreferences sharedPreferences = zzbukVar.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        o.f1952C.j.getClass();
        edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
        return null;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbdy.zzb.zze()).booleanValue()) {
                jSONObject.put(SentryLockReason.JsonKeys.PACKAGE_NAME, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.f10834a);
            jSONObject.put("mf", zzbdy.zzc.zze());
            jSONObject.put("cl", "730675337");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final I3.b zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        o.f1952C.j.getClass();
        if (System.currentTimeMillis() - j < ((Long) zzbdy.zzd.zze()).longValue()) {
            return zzgbc.zzh(null);
        }
        return zzgbc.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbuj
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzbuk.zzb(zzbuk.this, (JSONObject) obj);
                return null;
            }
        }, zzbza.zzg);
    }
}
