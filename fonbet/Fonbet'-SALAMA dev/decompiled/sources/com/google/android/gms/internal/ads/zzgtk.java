package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtk extends zzgxg implements zzgys {
    private static final zzgtk zza;
    private static volatile zzgyz zzb;
    private int zzc;
    private int zzd;
    private zzgtq zze;
    private zzgvy zzf = zzgvy.zzb;

    static {
        zzgtk zzgtkVar = new zzgtk();
        zza = zzgtkVar;
        zzgxg.zzbZ(zzgtk.class, zzgtkVar);
    }

    private zzgtk() {
    }

    public static zzgti zzb() {
        return (zzgti) zza.zzaZ();
    }

    public static zzgtk zzd(zzgvy zzgvyVar, zzgwq zzgwqVar) {
        return (zzgtk) zzgxg.zzbr(zza, zzgvyVar, zzgwqVar);
    }

    public static /* synthetic */ void zzi(zzgtk zzgtkVar, zzgtq zzgtqVar) {
        zzgtqVar.getClass();
        zzgtkVar.zze = zzgtqVar;
        zzgtkVar.zzc |= 1;
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
            return new zzgtk();
        }
        zzgtj zzgtjVar = null;
        if (ordinal == 4) {
            return new zzgti(zzgtjVar);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzgyz zzgyzVar = zzb;
        if (zzgyzVar == null) {
            synchronized (zzgtk.class) {
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

    public final zzgtq zzf() {
        zzgtq zzgtqVar = this.zze;
        return zzgtqVar == null ? zzgtq.zzd() : zzgtqVar;
    }

    public final zzgvy zzg() {
        return this.zzf;
    }
}
