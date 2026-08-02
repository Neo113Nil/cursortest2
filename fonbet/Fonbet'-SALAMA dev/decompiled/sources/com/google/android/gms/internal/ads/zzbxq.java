package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes.dex */
final class zzbxq implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbxr zza;
    private final String zzb;

    public zzbxq(zzbxr zzbxrVar, String str) {
        this.zza = zzbxrVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbxp> list;
        synchronized (this.zza) {
            try {
                list = this.zza.zzb;
                for (zzbxp zzbxpVar : list) {
                    zzbxr.zzb(zzbxpVar.zza, zzbxpVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
