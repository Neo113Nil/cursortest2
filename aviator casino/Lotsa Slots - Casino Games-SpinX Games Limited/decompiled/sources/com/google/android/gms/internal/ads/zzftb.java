package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzftb extends com.google.android.gms.ads.internal.client.zzcg {
    private final com.google.android.gms.internal.ads.zzfth zza;
    private final com.google.android.gms.internal.ads.zzfss zzb;

    zzftb(com.google.android.gms.internal.ads.zzfth zzfthVar, com.google.android.gms.internal.ads.zzfss zzfssVar) {
        this.zza = zzfthVar;
        this.zzb = zzfssVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(java.util.List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zza.zza(list, zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(java.lang.String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzcci zzg(java.lang.String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(java.lang.String str) {
        return this.zza.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzbgj zzi(java.lang.String str) {
        return this.zza.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(java.lang.String str) {
        return this.zza.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzk(java.lang.String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(java.lang.String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        return this.zzb.zza(str, zzfpVar, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, java.lang.String str) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzb(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzo(java.lang.String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzbgj zzp(java.lang.String str) {
        return this.zzb.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.internal.ads.zzcci zzq(java.lang.String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzfp zzr(int i, java.lang.String str) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzf(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final android.os.Bundle zzs(int i) {
        java.util.Map zzh = this.zzb.zzh(i);
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : zzh.entrySet()) {
            bundle.putByteArray((java.lang.String) entry.getKey(), com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes((com.google.android.gms.ads.internal.client.zzfp) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, java.lang.String str) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zzg(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, java.lang.String str) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) {
        this.zzb.zzj(i);
    }
}
