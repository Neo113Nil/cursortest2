package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdvc {
    private final com.google.android.gms.internal.ads.zzdcp zza;
    private final com.google.android.gms.internal.ads.zzddy zzb;
    private final com.google.android.gms.internal.ads.zzdel zzc;
    private final com.google.android.gms.internal.ads.zzdfc zzd;
    private final com.google.android.gms.internal.ads.zzdhv zze;
    private final com.google.android.gms.internal.ads.zzdkw zzf;
    private final com.google.android.gms.internal.ads.zzdzl zzg;
    private final com.google.android.gms.internal.ads.zzfsc zzh;
    private final com.google.android.gms.internal.ads.zzekg zzi;
    private final com.google.android.gms.internal.ads.zzctj zzj;

    zzdvc(com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzdel zzdelVar, com.google.android.gms.internal.ads.zzdfc zzdfcVar, com.google.android.gms.internal.ads.zzdhv zzdhvVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzekg zzekgVar, com.google.android.gms.internal.ads.zzctj zzctjVar) {
        this.zza = zzdcpVar;
        this.zzb = zzddyVar;
        this.zzc = zzdelVar;
        this.zzd = zzdfcVar;
        this.zze = zzdhvVar;
        this.zzf = zzdkwVar;
        this.zzg = zzdzlVar;
        this.zzh = zzfscVar;
        this.zzi = zzekgVar;
        this.zzj = zzctjVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzdvd zzdvdVar, com.google.android.gms.internal.ads.zzcku zzckuVar) {
        com.google.android.gms.internal.ads.zzdva zzb = zzdvdVar.zzb();
        final com.google.android.gms.internal.ads.zzddy zzddyVar = this.zzb;
        java.util.Objects.requireNonNull(zzddyVar);
        zzb.zzn(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzad() { // from class: com.google.android.gms.internal.ads.zzdvb
            @Override // com.google.android.gms.ads.internal.overlay.zzad
            public final /* synthetic */ void zzl() {
                com.google.android.gms.internal.ads.zzddy.this.zzb();
            }
        }, this.zzf);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlC)).booleanValue() || zzckuVar == null || zzckuVar.zzP() == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
        com.google.android.gms.internal.ads.zzctj zzctjVar = this.zzj;
        com.google.android.gms.internal.ads.zzekg zzekgVar = this.zzi;
        zzP.zzd(zzctjVar, zzekgVar, this.zzh);
        zzP.zze(zzctjVar, zzekgVar, this.zzg);
    }
}
