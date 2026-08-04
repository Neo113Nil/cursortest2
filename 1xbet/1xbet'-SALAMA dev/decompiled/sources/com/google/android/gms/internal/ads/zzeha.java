package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzeha extends zzbot {
    private final zzcuo zza;
    private final zzdcn zzb;
    private final zzcvi zzc;
    private final zzcvx zzd;
    private final zzcwc zze;
    private final zzczm zzf;
    private final zzcww zzg;
    private final zzddk zzh;
    private final zzczi zzi;
    private final zzcvd zzj;

    public zzeha(zzcuo zzcuoVar, zzdcn zzdcnVar, zzcvi zzcviVar, zzcvx zzcvxVar, zzcwc zzcwcVar, zzczm zzczmVar, zzcww zzcwwVar, zzddk zzddkVar, zzczi zzcziVar, zzcvd zzcvdVar) {
        this.zza = zzcuoVar;
        this.zzb = zzdcnVar;
        this.zzc = zzcviVar;
        this.zzd = zzcvxVar;
        this.zze = zzcwcVar;
        this.zzf = zzczmVar;
        this.zzg = zzcwwVar;
        this.zzh = zzddkVar;
        this.zzi = zzcziVar;
        this.zzj = zzcvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzf() {
        this.zzg.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzg(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzi(int i7, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    @Deprecated
    public final void zzj(int i7) {
        zzk(new com.google.android.gms.ads.internal.client.zze(i7, "", "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfcb.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, "undefined", null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(zzbgd zzbgdVar, String str) {
    }

    public void zzs(zzbvm zzbvmVar) {
    }

    public void zzt(zzbvq zzbvqVar) {
    }

    public void zzu() {
    }

    public void zzv() {
    }

    public void zzw() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzx() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzy() {
        this.zzh.zzc();
    }

    public void zzz() {
        this.zzh.zzd();
    }
}
