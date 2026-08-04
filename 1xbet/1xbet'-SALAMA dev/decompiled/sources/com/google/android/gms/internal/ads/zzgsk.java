package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgsk extends zzgxg implements zzgys {
    private static final zzgsk zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private zzgsa zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgsk zzgskVar = new zzgsk();
        zza = zzgskVar;
        zzgxg.zzbZ(zzgsk.class, zzgskVar);
    }

    private zzgsk() {
    }

    public static zzgsj zzc() {
        return (zzgsj) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzgsk zzgskVar, zzgsa zzgsaVar) {
        zzgsaVar.getClass();
        zzgskVar.zzd = zzgsaVar;
        zzgskVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgsa zzb() {
        zzgsa zzgsaVar = this.zzd;
        return zzgsaVar == null ? zzgsa.zzd() : zzgsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxg
    public final Object zzdc(zzgxf zzgxfVar, Object obj, Object obj2) {
        int iOrdinal = zzgxfVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzgsk();
        }
        zzgsl zzgslVar = null;
        if (iOrdinal == 4) {
            return new zzgsj(zzgslVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgyz zzgxbVar = zzb;
        if (zzgxbVar == null) {
            synchronized (zzgsk.class) {
                try {
                    zzgxbVar = zzb;
                    if (zzgxbVar == null) {
                        zzgxbVar = new zzgxb(zza);
                        zzb = zzgxbVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxbVar;
    }

    public final zzgte zzf() {
        zzgte zzgteVarZzb = zzgte.zzb(this.zzg);
        return zzgteVarZzb == null ? zzgte.UNRECOGNIZED : zzgteVarZzb;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i7 = this.zze;
        int i8 = 2;
        if (i7 != 0) {
            if (i7 == 1) {
                i8 = 3;
            } else if (i7 != 2) {
                i8 = i7 != 3 ? 0 : 5;
            } else {
                i8 = 4;
            }
        }
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }
}
