package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzgfq zzf;
    private static volatile com.google.android.gms.internal.ads.zzifx zzg;
    private int zza;
    private java.lang.Object zzc;
    private int zzd;
    private int zzb = 0;
    private com.google.android.gms.internal.ads.zziem zze = zzbC();

    static {
        com.google.android.gms.internal.ads.zzgfq zzgfqVar = new com.google.android.gms.internal.ads.zzgfq();
        zzf = zzgfqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzgfq.class, zzgfqVar);
    }

    private zzgfq() {
    }

    public static com.google.android.gms.internal.ads.zzgfq zze(com.google.android.gms.internal.ads.zzida zzidaVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzgfq) com.google.android.gms.internal.ads.zziee.zzbS(zzf, zzidaVar);
    }

    public static com.google.android.gms.internal.ads.zzgfp zzg() {
        return (com.google.android.gms.internal.ads.zzgfp) zzf.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzgfq zzh() {
        return zzf;
    }

    public final com.google.android.gms.internal.ads.zzbeb zza() {
        return this.zzb == 1 ? (com.google.android.gms.internal.ads.zzbeb) this.zzc : com.google.android.gms.internal.ads.zzbeb.zzj();
    }

    public final com.google.android.gms.internal.ads.zzbdz zzb() {
        return this.zzb == 2 ? (com.google.android.gms.internal.ads.zzbdz) this.zzc : com.google.android.gms.internal.ads.zzbdz.zzd();
    }

    public final com.google.android.gms.internal.ads.zzbds zzc() {
        com.google.android.gms.internal.ads.zzbds zzb = com.google.android.gms.internal.ads.zzbds.zzb(this.zzd);
        return zzb == null ? com.google.android.gms.internal.ads.zzbds.UNSUPPORTED : zzb;
    }

    public final java.util.List zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new java.lang.Object[]{"zzc", "zzb", "zza", com.google.android.gms.internal.ads.zzbeb.class, com.google.android.gms.internal.ads.zzbdz.class, "zzd", com.google.android.gms.internal.ads.zzbds.zzc(), "zze"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzgfq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzgfp(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzg;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzgfq.class) {
                zzifxVar = zzg;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzf);
                    zzg = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzi(com.google.android.gms.internal.ads.zzbeb zzbebVar) {
        zzbebVar.getClass();
        this.zzc = zzbebVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzbdz zzbdzVar) {
        zzbdzVar.getClass();
        this.zzc = zzbdzVar;
        this.zzb = 2;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzbds zzbdsVar) {
        this.zzd = zzbdsVar.zza();
        this.zza |= 1;
    }

    final /* synthetic */ void zzl(java.lang.Iterable iterable) {
        com.google.android.gms.internal.ads.zziem zziemVar = this.zze;
        if (!zziemVar.zza()) {
            this.zze = com.google.android.gms.internal.ads.zziee.zzbD(zziemVar);
        }
        com.google.android.gms.internal.ads.zzicj.zzaW(iterable, this.zze);
    }
}
