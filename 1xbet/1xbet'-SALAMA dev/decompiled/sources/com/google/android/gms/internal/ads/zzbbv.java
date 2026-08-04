package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
final class zzbbv implements zzben {
    final /* synthetic */ SharedPreferences zza;

    public zzbbv(zzbbw zzbbwVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final Boolean zza(String str, boolean z4) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z4));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z4)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final Double zzb(String str, double d7) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d7));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d7)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final Long zzc(String str, long j) {
        try {
            return Long.valueOf(this.zza.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzben
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
