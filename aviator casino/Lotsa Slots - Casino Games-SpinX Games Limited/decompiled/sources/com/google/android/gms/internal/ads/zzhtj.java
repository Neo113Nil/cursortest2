package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhtj extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhtj zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private int zzb;
    private com.google.android.gms.internal.ads.zzhtl zzc;

    static {
        com.google.android.gms.internal.ads.zzhtj zzhtjVar = new com.google.android.gms.internal.ads.zzhtj();
        zzd = zzhtjVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhtj.class, zzhtjVar);
    }

    private zzhtj() {
    }

    public static com.google.android.gms.internal.ads.zzhtj zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhtj) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhti zzd() {
        return (com.google.android.gms.internal.ads.zzhti) zzd.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzifx zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzhtl zzb() {
        com.google.android.gms.internal.ads.zzhtl zzhtlVar = this.zzc;
        return zzhtlVar == null ? com.google.android.gms.internal.ads.zzhtl.zze() : zzhtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhtj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhti(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhtj.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzhtl zzhtlVar) {
        zzhtlVar.getClass();
        this.zzc = zzhtlVar;
        this.zza |= 1;
    }
}
