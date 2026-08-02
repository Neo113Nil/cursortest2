package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgrq extends zzgxg implements zzgys {
    private static final zzgrq zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgrw zze;
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzgrq zzgrqVar = new zzgrq();
        zza = zzgrqVar;
        zzgxg.zzbZ(zzgrq.class, zzgrqVar);
    }

    private zzgrq() {
    }

    public static zzgro zzb() {
        return (zzgro) zza.zzaZ();
    }

    public static zzgrq zzd() {
        return zza;
    }

    public static zzgrq zzf(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgrq) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static zzgyz zzi() {
        return zza.zzbN();
    }

    public static /* synthetic */ void zzk(zzgrq zzgrqVar, zzgrw zzgrwVar) {
        zzgrwVar.getClass();
        zzgrqVar.zze = zzgrwVar;
        zzgrqVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzgrq();
        }
        zzgrp zzgrpVar = null;
        if (ordinal == 4) {
            return new zzgro(zzgrpVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgrq.class) {
                try {
                    zzgyzVar = zzb;
                    if (zzgyzVar == null) {
                        zzgyzVar = new zzgxb(zza);
                        zzb = zzgyzVar;
                    }
                } finally {
                }
            }
        }
        return zzgyzVar;
    }

    public final zzgrw zzg() {
        zzgrw zzgrwVar = this.zze;
        return zzgrwVar == null ? zzgrw.zzf() : zzgrwVar;
    }

    public final zzgvy zzh() {
        return this.zzf;
    }
}
