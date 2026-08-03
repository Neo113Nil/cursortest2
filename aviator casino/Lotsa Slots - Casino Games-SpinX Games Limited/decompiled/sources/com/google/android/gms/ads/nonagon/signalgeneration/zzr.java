package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzr implements com.google.android.gms.internal.ads.zzdlk {
    private final com.google.android.gms.internal.ads.zzdzg zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzq zzb;
    private final java.lang.String zzc;

    public zzr(com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar, java.lang.String str) {
        this.zza = zzdzgVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(java.lang.String str) {
    }
}
