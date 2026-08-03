package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgko {
    private final com.google.android.gms.internal.ads.zzgox zza;
    private final com.google.android.gms.internal.ads.zzgme zzb;
    private final com.google.android.gms.internal.ads.zzgmv zzc;
    private final com.google.android.gms.internal.ads.zzgqh zzd;
    private final com.google.android.gms.internal.ads.zzgel zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgko(com.google.android.gms.internal.ads.zzgox zzgoxVar, com.google.android.gms.internal.ads.zzgme zzgmeVar, com.google.android.gms.internal.ads.zzgmv zzgmvVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgel zzgelVar, boolean z, long j, long j2) {
        this.zza = zzgoxVar;
        this.zzb = zzgmeVar;
        this.zzc = zzgmvVar;
        this.zzd = zzgqhVar;
        this.zze = zzgelVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzh(final int i) {
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(com.google.android.gms.internal.ads.zzhbo.zzw(this.zzb.zza()), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgkf
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzgfo zzgfoVar = (com.google.android.gms.internal.ads.zzgfo) obj;
                com.google.android.gms.internal.ads.zzgko.this.zzd(zzgfoVar);
                return zzgfoVar;
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgko.this.zze((com.google.android.gms.internal.ads.zzgfo) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), com.google.android.gms.internal.ads.zzgkh.zza, com.google.android.gms.internal.ads.zzhcn.zza()), com.google.android.gms.internal.ads.zzgka.class, com.google.android.gms.internal.ads.zzgki.zza, com.google.android.gms.internal.ads.zzhcn.zza()), com.google.android.gms.internal.ads.zzgkb.class, com.google.android.gms.internal.ads.zzgkj.zza, com.google.android.gms.internal.ads.zzhcn.zza()), com.google.android.gms.internal.ads.zzgjz.class, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgko.this.zzf(i, (com.google.android.gms.internal.ads.zzgjz) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
        this.zzd.zze(1002, zzhboVar);
        return zzhboVar;
    }

    final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgkm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgko.this.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.internal.ads.zzhbo zzhboVar = (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzg(com.google.android.gms.internal.ads.zzhbo.zzw(this.zzc.zzb()), java.lang.Throwable.class, com.google.android.gms.internal.ads.zzgkd.zza, com.google.android.gms.internal.ads.zzhcn.zza());
        final com.google.android.gms.internal.ads.zzgox zzgoxVar = this.zza;
        java.util.Objects.requireNonNull(zzgoxVar);
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk(zzhboVar, new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzgkc
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return new java.lang.Boolean(com.google.android.gms.internal.ads.zzgox.this.zza((com.google.android.gms.internal.ads.zzgfq) obj));
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza()), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzgke
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzgko.this.zzc((java.lang.Boolean) obj);
            }
        }, com.google.android.gms.internal.ads.zzhcn.zza());
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzgkn.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgfo zzd(com.google.android.gms.internal.ads.zzgfo zzgfoVar) {
        int zzj = zzgfoVar.zzj() - 1;
        if (zzj == 1 || zzj == 2) {
            return zzgfoVar;
        }
        if (zzj == 3) {
            com.google.android.gms.internal.ads.zzgqh zzgqhVar = this.zzd;
            int zzj2 = zzgfoVar.zzj() - 1;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj2).length());
            sb.append(zzj2);
            zzgqhVar.zzc(1004, sb.toString());
            throw new com.google.android.gms.internal.ads.zzgkb(zzgfoVar.zzj() - 1);
        }
        if (zzj != 12) {
            com.google.android.gms.internal.ads.zzgqh zzgqhVar2 = this.zzd;
            int zzj3 = zzgfoVar.zzj() - 1;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length());
            sb2.append(zzj3);
            zzgqhVar2.zzc(1005, sb2.toString());
            throw new com.google.android.gms.internal.ads.zzgka(zzgfoVar.zzj() - 1);
        }
        com.google.android.gms.internal.ads.zzgqh zzgqhVar3 = this.zzd;
        int zzj4 = zzgfoVar.zzj() - 1;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj4).length());
        sb3.append(zzj4);
        zzgqhVar3.zzc(1005, sb3.toString());
        throw new com.google.android.gms.internal.ads.zzgjz(zzgfoVar.zzj() - 1);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzgfo zzgfoVar) {
        if (zzgfoVar.zzj() == 2) {
            return this.zzc.zzd(zzgfoVar.zza(), zzgfoVar.zzb().zzA());
        }
        if (zzgfoVar.zzj() == 3) {
            return this.zzc.zzc(zzgfoVar.zza(), zzgfoVar.zzc().zzA(), zzgfoVar.zzb().zzA());
        }
        throw new java.lang.AssertionError("Unreachable");
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzgkn zzf(final int i, com.google.android.gms.internal.ads.zzgjz zzgjzVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgkl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgko.this.zzg(i);
                }
            }, this.zzh * ((long) java.lang.Math.pow(2.0d, i)));
        }
        return com.google.android.gms.internal.ads.zzgkn.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}
