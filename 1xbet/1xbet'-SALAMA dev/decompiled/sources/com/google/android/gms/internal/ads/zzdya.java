package com.google.android.gms.internal.ads;

import I2.J;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
final class zzdya implements zzgay {
    final /* synthetic */ zzbty zza;
    final /* synthetic */ zzbuh zzb;

    public zzdya(zzdyg zzdygVar, zzbuh zzbuhVar, zzbty zzbtyVar) {
        this.zzb = zzbuhVar;
        this.zza = zzbtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        try {
            zzbuh zzbuhVar = this.zzb;
            com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfcb.zza(th);
            zzbuhVar.zze(new com.google.android.gms.ads.internal.util.zzbb(zzfty.zzd(th.getMessage()) ? zzeVarZza.f10721b : th.getMessage(), zzeVarZza.f10720a));
        } catch (RemoteException e7) {
            J.l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e7) {
            J.l("Service can't call client", e7);
        }
    }
}
