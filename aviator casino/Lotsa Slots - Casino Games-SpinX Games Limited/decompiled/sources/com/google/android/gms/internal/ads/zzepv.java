package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzepv extends com.google.android.gms.internal.ads.zzeqw {
    private final com.google.android.gms.internal.ads.zzdlh zza;

    public zzepv(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzded zzdedVar, com.google.android.gms.internal.ads.zzdde zzddeVar, com.google.android.gms.internal.ads.zzdhv zzdhvVar, com.google.android.gms.internal.ads.zzdlu zzdluVar, com.google.android.gms.internal.ads.zzdfc zzdfcVar, com.google.android.gms.internal.ads.zzdlh zzdlhVar, com.google.android.gms.internal.ads.zzdhr zzdhrVar) {
        super(zzdcpVar, zzdkwVar, zzddjVar, zzddyVar, zzdedVar, zzdhvVar, zzdfcVar, zzdluVar, zzdhrVar, zzddeVar);
        this.zza = zzdlhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzp(com.google.android.gms.internal.ads.zzccb zzccbVar) {
        this.zza.zzb(zzccbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzr(com.google.android.gms.internal.ads.zzccf zzccfVar) throws android.os.RemoteException {
        this.zza.zzb(new com.google.android.gms.internal.ads.zzccb(zzccfVar.zze(), zzccfVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzt() throws android.os.RemoteException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzz() throws android.os.RemoteException {
        this.zza.zzb(null);
    }
}
