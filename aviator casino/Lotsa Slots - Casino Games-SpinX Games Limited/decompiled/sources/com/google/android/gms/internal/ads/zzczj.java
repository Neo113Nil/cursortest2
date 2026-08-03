package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzczj implements com.google.android.gms.internal.ads.zzdef, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzdii {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzcex zzb;

    public zzczj(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzcex zzcexVar) {
        this.zza = clock;
        this.zzb = zzcexVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zzb.zzd(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        this.zzb.zzh(true);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zza(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzj(com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzk(com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzl(com.google.android.gms.internal.ads.zzbhv.zzb zzbVar) {
        this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzm(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzn(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdii
    public final void zzo() {
    }

    public final java.lang.String zzp() {
        return this.zzb.zzj();
    }
}
