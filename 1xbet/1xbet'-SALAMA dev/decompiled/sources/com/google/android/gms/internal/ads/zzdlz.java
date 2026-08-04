package com.google.android.gms.internal.ads;

import F2.C0254t;

/* JADX INFO: loaded from: classes.dex */
final class zzdlz implements zzgay {
    final /* synthetic */ zzfaf zza;
    final /* synthetic */ zzfai zzb;
    final /* synthetic */ zzcln zzc;
    final /* synthetic */ zzdmf zzd;

    public zzdlz(zzdmf zzdmfVar, zzfaf zzfafVar, zzfai zzfaiVar, zzcln zzclnVar) {
        this.zza = zzfafVar;
        this.zzb = zzfaiVar;
        this.zzc = zzclnVar;
        this.zzd = zzdmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzceb zzcebVar = (zzceb) obj;
        zzcebVar.zzW(this.zza, this.zzb);
        zzcft zzcftVarZzN = zzcebVar.zzN();
        zzbbp zzbbpVar = zzbby.zzke;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzcftVarZzN != null) {
            zzcln zzclnVar = this.zzc;
            zzdmf zzdmfVar = this.zzd;
            zzcftVarZzN.zzK(zzclnVar, zzdmfVar.zzi, zzdmfVar.zzj);
            zzcln zzclnVar2 = this.zzc;
            zzdmf zzdmfVar2 = this.zzd;
            zzcftVarZzN.zzM(zzclnVar2, zzdmfVar2.zzi, zzdmfVar2.zzd);
        }
        if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzmV)).booleanValue() || zzcftVarZzN == null) {
            return;
        }
        zzcftVarZzN.zzN(this.zza);
    }
}
