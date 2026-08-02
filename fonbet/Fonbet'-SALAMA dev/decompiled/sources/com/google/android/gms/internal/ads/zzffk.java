package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzffk implements zzdbu, zzcvg, zzdby {
    private final zzffy zza;
    private final zzffn zzb;

    public zzffk(Context context, zzffy zzffyVar) {
        this.zza = zzffyVar;
        this.zzb = zzffm.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzb() {
        if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            zzffy zzffyVar = this.zza;
            zzffn zzffnVar = this.zzb;
            zzffnVar.zzg(true);
            zzffyVar.zza(zzffnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzl() {
        if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            zzffy zzffyVar = this.zza;
            zzffn zzffnVar = this.zzb;
            zzffnVar.zzc(zzeVar.j().toString());
            zzffnVar.zzg(false);
            zzffyVar.zza(zzffnVar);
        }
    }
}
