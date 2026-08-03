package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfo extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgfo zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private com.google.android.gms.internal.ads.zzgfq zzb;
    private com.google.android.gms.internal.ads.zzida zzc;
    private com.google.android.gms.internal.ads.zzida zzd;
    private int zze;

    static {
        com.google.android.gms.internal.ads.zzgfo zzgfoVar = new com.google.android.gms.internal.ads.zzgfo();
        zzf = zzgfoVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgfo.class, zzgfoVar);
    }

    private zzgfo() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzc = zzidaVar;
        this.zzd = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zzgfn zzd() {
        return (com.google.android.gms.internal.ads.zzgfn) zzf.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzgfq zza() {
        com.google.android.gms.internal.ads.zzgfq zzgfqVar = this.zzb;
        return zzgfqVar == null ? com.google.android.gms.internal.ads.zzgfq.zzh() : zzgfqVar;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzida zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", com.google.android.gms.internal.ads.zzgge.zza});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgfo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgfn(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgfo.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgfq zzgfqVar) {
        zzgfqVar.getClass();
        this.zzb = zzgfqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 2;
        this.zzc = zzidaVar;
    }

    final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zza |= 4;
        this.zzd = zzidaVar;
    }

    public final int zzj() {
        int zza = com.google.android.gms.internal.ads.zzggf.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}
