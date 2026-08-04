package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaud implements zzfnd {
    final /* synthetic */ zzfmc zza;

    public zzaud(zzfmc zzfmcVar) {
        this.zza = zzfmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final void zza(int i7, long j) {
        this.zza.zzd(i7, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public final void zzb(int i7, long j, String str) {
        this.zza.zze(i7, System.currentTimeMillis() - j, str);
    }
}
