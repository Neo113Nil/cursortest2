package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbil;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzekn implements zzfqj {
    private final zzekb zza;
    private final zzekf zzb;

    zzekn(zzekb zzekbVar, zzekf zzekfVar) {
        this.zza = zzekbVar;
        this.zzb = zzekfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdL(zzfqc zzfqcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdM(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue()) {
            if (zzfqc.RENDERER == zzfqcVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                return;
            }
            if (zzfqc.PRELOADED_LOADER == zzfqcVar || zzfqc.SERVER_TRANSACTION == zzfqcVar) {
                zzekb zzekbVar = this.zza;
                zzekbVar.zza(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());
                final zzekf zzekfVar = this.zzb;
                final long zzb = zzekbVar.zzb();
                zzekfVar.zza.zza(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzeke
                    @Override // com.google.android.gms.internal.ads.zzfpi
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzekf.this.zzf()) {
                            return null;
                        }
                        long j = zzb;
                        zzbil.zzaf.zza.C0236zza zzz = zzbil.zzaf.zza.zzz();
                        zzz.zzad(j);
                        byte[] zzaN = zzz.zzbu().zzaN();
                        zzekm.zzf(sQLiteDatabase, false, false);
                        zzekm.zze(sQLiteDatabase, j, zzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdN(zzfqc zzfqcVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.zza;
            if (zzekbVar.zzh() != 0) {
                zzekbVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdO(zzfqc zzfqcVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhn)).booleanValue() && zzfqc.RENDERER == zzfqcVar) {
            zzekb zzekbVar = this.zza;
            if (zzekbVar.zzh() != 0) {
                zzekbVar.zzi(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzekbVar.zzh());
            }
        }
    }
}
