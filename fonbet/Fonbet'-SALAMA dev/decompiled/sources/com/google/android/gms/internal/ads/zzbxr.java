package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class zzbxr {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbxd zzd;

    public zzbxr(Context context, zzbxd zzbxdVar) {
        this.zzc = context;
        this.zzd = zzbxdVar;
    }

    public static /* synthetic */ void zzb(zzbxr zzbxrVar, Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            zzbxrVar.zzd.zzd();
        }
    }

    public final synchronized void zzc(String str) {
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzbxq zzbxqVar = new zzbxq(this, str);
            this.zza.put(str, zzbxqVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbxqVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzbxp zzbxpVar) {
        this.zzb.add(zzbxpVar);
    }
}
