package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdus {
    private final com.google.android.gms.internal.ads.zzdcp zza;
    private final com.google.android.gms.internal.ads.zzddy zzb;
    private final com.google.android.gms.internal.ads.zzdel zzc;
    private final com.google.android.gms.internal.ads.zzdfc zzd;
    private final com.google.android.gms.internal.ads.zzdhv zze;
    private final com.google.android.gms.internal.ads.zzfkf zzf;
    private final com.google.android.gms.internal.ads.zzfki zzg;
    private final com.google.android.gms.internal.ads.zzctj zzh;

    public zzdus(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzdel zzdelVar, com.google.android.gms.internal.ads.zzdfc zzdfcVar, com.google.android.gms.internal.ads.zzdhv zzdhvVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzctj zzctjVar) {
        this.zza = zzdcpVar;
        this.zzb = zzddyVar;
        this.zzc = zzdelVar;
        this.zzd = zzdfcVar;
        this.zze = zzdhvVar;
        this.zzf = zzfkfVar;
        this.zzg = zzfkiVar;
        this.zzh = zzctjVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzdux zzduxVar) {
        final com.google.android.gms.internal.ads.zzddy zzddyVar = this.zzb;
        com.google.android.gms.internal.ads.zzdul zzk = zzduxVar.zzk();
        java.util.Objects.requireNonNull(zzddyVar);
        zzk.zzm(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdur
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                com.google.android.gms.internal.ads.zzddy.this.zzb();
            }
        });
        zzduxVar.zzg(this.zzf, this.zzg, this.zzh);
    }
}
