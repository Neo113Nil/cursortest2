package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzeqw extends com.google.android.gms.internal.ads.zzbvh {
    private final com.google.android.gms.internal.ads.zzdcp zza;
    private final com.google.android.gms.internal.ads.zzdkw zzb;
    private final com.google.android.gms.internal.ads.zzddj zzc;
    private final com.google.android.gms.internal.ads.zzddy zzd;
    private final com.google.android.gms.internal.ads.zzded zze;
    private final com.google.android.gms.internal.ads.zzdhv zzf;
    private final com.google.android.gms.internal.ads.zzdfc zzg;
    private final com.google.android.gms.internal.ads.zzdlu zzh;
    private final com.google.android.gms.internal.ads.zzdhr zzi;
    private final com.google.android.gms.internal.ads.zzdde zzj;

    public zzeqw(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzded zzdedVar, com.google.android.gms.internal.ads.zzdhv zzdhvVar, com.google.android.gms.internal.ads.zzdfc zzdfcVar, com.google.android.gms.internal.ads.zzdlu zzdluVar, com.google.android.gms.internal.ads.zzdhr zzdhrVar, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        this.zza = zzdcpVar;
        this.zzb = zzdkwVar;
        this.zzc = zzddjVar;
        this.zzd = zzddyVar;
        this.zze = zzdedVar;
        this.zzf = zzdhvVar;
        this.zzg = zzdfcVar;
        this.zzh = zzdluVar;
        this.zzi = zzdhrVar;
        this.zzj = zzddeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() {
        this.zzg.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(java.lang.String str, java.lang.String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(com.google.android.gms.internal.ads.zzbmv zzbmvVar, java.lang.String str) {
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    public void zzp(com.google.android.gms.internal.ads.zzccb zzccbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() {
        this.zzh.zza();
    }

    public void zzr(com.google.android.gms.internal.ads.zzccf zzccfVar) throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    @java.lang.Deprecated
    public final void zzs(int i) throws android.os.RemoteException {
        zzy(new com.google.android.gms.ads.internal.client.zze(i, "", com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() throws android.os.RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu() throws android.os.RemoteException {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(java.lang.String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(int i, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(com.google.android.gms.internal.ads.zzfma.zzc(8, zzeVar));
    }

    public void zzz() throws android.os.RemoteException {
    }
}
