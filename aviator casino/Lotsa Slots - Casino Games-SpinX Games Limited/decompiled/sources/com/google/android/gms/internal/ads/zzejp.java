package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzejp implements com.google.android.gms.internal.ads.zzfpl {
    private final com.google.android.gms.internal.ads.zzejd zza;
    private final com.google.android.gms.internal.ads.zzejh zzb;

    zzejp(com.google.android.gms.internal.ads.zzejd zzejdVar, com.google.android.gms.internal.ads.zzejh zzejhVar) {
        this.zza = zzejdVar;
        this.zzb = zzejhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdL(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdM(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue()) {
            if (com.google.android.gms.internal.ads.zzfpe.RENDERER == zzfpeVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (com.google.android.gms.internal.ads.zzfpe.PRELOADED_LOADER == zzfpeVar || com.google.android.gms.internal.ads.zzfpe.SERVER_TRANSACTION == zzfpeVar) {
                com.google.android.gms.internal.ads.zzejd zzejdVar = this.zza;
                zzejdVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final com.google.android.gms.internal.ads.zzejh zzejhVar = this.zzb;
                final long zzb = zzejdVar.zzb();
                zzejhVar.zza.zza(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzejg
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
                        if (com.google.android.gms.internal.ads.zzejh.this.zzf()) {
                            return null;
                        }
                        long j = zzb;
                        com.google.android.gms.internal.ads.zzbhv.zzaf.zza.C0070zza zzz = com.google.android.gms.internal.ads.zzbhv.zzaf.zza.zzz();
                        zzz.zzad(j);
                        byte[] zzaN = zzz.zzbu().zzaN();
                        com.google.android.gms.internal.ads.zzejo.zzf(sQLiteDatabase, false, false);
                        com.google.android.gms.internal.ads.zzejo.zze(sQLiteDatabase, j, zzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdN(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str, java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue() && com.google.android.gms.internal.ads.zzfpe.RENDERER == zzfpeVar) {
            com.google.android.gms.internal.ads.zzejd zzejdVar = this.zza;
            if (zzejdVar.zzh() != 0) {
                zzejdVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejdVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdO(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhh)).booleanValue() && com.google.android.gms.internal.ads.zzfpe.RENDERER == zzfpeVar) {
            com.google.android.gms.internal.ads.zzejd zzejdVar = this.zza;
            if (zzejdVar.zzh() != 0) {
                zzejdVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzejdVar.zzh());
            }
        }
    }
}
