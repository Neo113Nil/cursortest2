package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzceu implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcex zza;
    private final String zzb;

    public zzceu(zzcex zzcexVar, String str) {
        Objects.requireNonNull(zzcexVar);
        this.zza = zzcexVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcex zzcexVar = this.zza;
        synchronized (zzcexVar) {
            Iterator it = zzcexVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzcev) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
