package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhtu extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhtu zzj;
    private static volatile com.google.android.gms.internal.ads.zzifx zzk;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzhtw zzc;
    private com.google.android.gms.internal.ads.zzida zzd;
    private com.google.android.gms.internal.ads.zzida zze;
    private com.google.android.gms.internal.ads.zzida zzf;
    private com.google.android.gms.internal.ads.zzida zzg;
    private com.google.android.gms.internal.ads.zzida zzh;
    private com.google.android.gms.internal.ads.zzida zzi;

    static {
        com.google.android.gms.internal.ads.zzhtu zzhtuVar = new com.google.android.gms.internal.ads.zzhtu();
        zzj = zzhtuVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhtu.class, zzhtuVar);
    }

    private zzhtu() {
        com.google.android.gms.internal.ads.zzida zzidaVar = com.google.android.gms.internal.ads.zzida.zza;
        this.zzd = zzidaVar;
        this.zze = zzidaVar;
        this.zzf = zzidaVar;
        this.zzg = zzidaVar;
        this.zzh = zzidaVar;
        this.zzi = zzidaVar;
    }

    public static com.google.android.gms.internal.ads.zzhtu zzj(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhtu) com.google.android.gms.internal.ads.zziee.zzbT(zzj, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhtt zzk() {
        return (com.google.android.gms.internal.ads.zzhtt) zzj.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzifx zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhtw zzb() {
        com.google.android.gms.internal.ads.zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? com.google.android.gms.internal.ads.zzhtw.zzh() : zzhtwVar;
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
            return zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new java.lang.Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhtu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtt(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzk;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhtu.class) {
                zzifxVar = zzk;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzj);
                    zzk = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    public final com.google.android.gms.internal.ads.zzida zze() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzida zzg() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.ads.zzida zzh() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.ads.zzida zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzhtw zzhtwVar) {
        zzhtwVar.getClass();
        this.zzc = zzhtwVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzd = zzidaVar;
    }

    final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zze = zzidaVar;
    }

    final /* synthetic */ void zzq(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzf = zzidaVar;
    }

    final /* synthetic */ void zzr(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzg = zzidaVar;
    }

    final /* synthetic */ void zzs(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzh = zzidaVar;
    }

    final /* synthetic */ void zzt(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzi = zzidaVar;
    }
}
