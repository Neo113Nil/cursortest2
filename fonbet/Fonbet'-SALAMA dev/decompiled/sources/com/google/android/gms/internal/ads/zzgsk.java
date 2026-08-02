package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int ordinal = zzgxfVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzgxg.zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new zzgsk();
        }
        zzgsl zzgslVar = null;
        if (ordinal == 4) {
            return new zzgsj(zzgslVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgsk.class) {
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

    public final zzgte zzf() {
        zzgte zzb2 = zzgte.zzb(this.zzg);
        return zzb2 == null ? zzgte.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i7 = this.zze;
        int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i8 == 0) {
            return 1;
        }
        return i8;
    }
}
