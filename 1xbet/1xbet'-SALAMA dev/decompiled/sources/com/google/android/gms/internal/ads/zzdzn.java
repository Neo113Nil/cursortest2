package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class zzdzn implements zzfff {
    private final zzdzb zza;
    private final zzdzf zzb;

    public zzdzn(zzdzb zzdzbVar, zzdzf zzdzfVar) {
        this.zza = zzdzbVar;
        this.zzb = zzdzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzd(zzfey zzfeyVar, String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue() && zzfey.RENDERER == zzfeyVar && this.zza.zzc() != 0) {
            zzdzb zzdzbVar = this.zza;
            o.f1952C.j.getClass();
            zzdzbVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdA(zzfey zzfeyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdB(zzfey zzfeyVar, String str, Throwable th) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue() && zzfey.RENDERER == zzfeyVar && this.zza.zzc() != 0) {
            zzdzb zzdzbVar = this.zza;
            o.f1952C.j.getClass();
            zzdzbVar.zzf(SystemClock.elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdC(zzfey zzfeyVar, String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue()) {
            if (zzfey.RENDERER == zzfeyVar) {
                zzdzb zzdzbVar = this.zza;
                o.f1952C.j.getClass();
                zzdzbVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfey.PRELOADED_LOADER == zzfeyVar || zzfey.SERVER_TRANSACTION == zzfeyVar) {
                zzdzb zzdzbVar2 = this.zza;
                o.f1952C.j.getClass();
                zzdzbVar2.zzh(SystemClock.elapsedRealtime());
                final zzdzf zzdzfVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzdzfVar.zza.zza(new zzfei() { // from class: com.google.android.gms.internal.ads.zzdze
                    @Override // com.google.android.gms.internal.ads.zzfei
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzdzfVar.zzf()) {
                            return null;
                        }
                        long j = jZzd;
                        zzbbd.zzaf.zza.C0002zza c0002zzaZzn = zzbbd.zzaf.zza.zzn();
                        c0002zzaZzn.zzP(j);
                        byte[] bArrZzaV = c0002zzaZzn.zzbr().zzaV();
                        zzdzm.zzf(sQLiteDatabase, false, false);
                        zzdzm.zzc(sQLiteDatabase, j, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }
}
