package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzays extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzays zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzida zzb;
    private com.google.android.gms.internal.ads.zzida zzc;
    private com.google.android.gms.internal.ads.zzida zzd;
    private com.google.android.gms.internal.ads.zzida zze;

    static {
        com.google.android.gms.internal.ads.zzays zzaysVar = new com.google.android.gms.internal.ads.zzays();
        zzf = zzaysVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzays.class, zzaysVar);
    }

    private zzays() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzb = zzidaVar;
        this.zzc = zzidaVar;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zzays zze(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzays) com.google.android.gms.internal.ads.zziee.zzbV(zzf, bArr, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzayr zzg() {
        return (com.google.android.gms.internal.ads.zzayr) zzf.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzida zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzida zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzida zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzays();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzayr(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzays.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 1;
        this.zzb = zzidaVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 2;
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 4;
        this.zzd = zzidaVar;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 8;
        this.zze = zzidaVar;
    }
}
