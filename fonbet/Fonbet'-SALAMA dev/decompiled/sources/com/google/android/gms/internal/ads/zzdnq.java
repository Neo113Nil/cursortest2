package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzdnq {
    private final Context zza;
    private final zzauo zzb;
    private final zzbdf zzc;
    private final VersionInfoParcel zzd;
    private final E2.a zze;
    private final zzbaw zzf;
    private final zzcxi zzg;
    private final zzeaq zzh;
    private final zzfbe zzi;
    private final zzdqq zzj;

    public zzdnq(zzceo zzceoVar, Context context, zzauo zzauoVar, zzbdf zzbdfVar, VersionInfoParcel versionInfoParcel, E2.a aVar, zzbaw zzbawVar, zzcxi zzcxiVar, zzeaq zzeaqVar, zzfbe zzfbeVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = zzauoVar;
        this.zzc = zzbdfVar;
        this.zzd = versionInfoParcel;
        this.zze = aVar;
        this.zzf = zzbawVar;
        this.zzg = zzcxiVar;
        this.zzh = zzeaqVar;
        this.zzi = zzfbeVar;
        this.zzj = zzdqqVar;
    }

    public final zzceb zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfaf zzfafVar, zzfai zzfaiVar) {
        zzcfv zzc = zzcfv.zzc(zzrVar);
        String str = zzrVar.f10771a;
        zzdnf zzdnfVar = new zzdnf(this);
        zzeaq zzeaqVar = this.zzh;
        zzfbe zzfbeVar = this.zzi;
        zzdqq zzdqqVar = this.zzj;
        E2.a aVar = this.zze;
        zzbaw zzbawVar = this.zzf;
        return zzceo.zza(this.zza, zzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdnfVar, aVar, zzbawVar, zzfafVar, zzfaiVar, zzeaqVar, zzfbeVar, zzdqqVar);
    }
}
