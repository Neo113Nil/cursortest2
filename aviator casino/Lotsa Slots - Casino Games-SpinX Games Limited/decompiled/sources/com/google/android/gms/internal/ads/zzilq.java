package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzilq extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzilq zzl;
    private static volatile com.google.android.gms.internal.ads.zzifx zzm;
    private int zza;
    private long zzd;
    private com.google.android.gms.internal.ads.zzils zzi;
    private com.google.android.gms.internal.ads.zzilu zzj;
    private com.google.android.gms.internal.ads.zzibd zzk;
    private com.google.android.gms.internal.ads.zzida zzb = com.google.android.gms.internal.ads.zzida.zza;
    private com.google.android.gms.internal.ads.zziem zzc = zzbC();
    private com.google.android.gms.internal.ads.zziem zze = zzbC();
    private com.google.android.gms.internal.ads.zzieq zzf = zzbM();
    private java.lang.String zzg = "";
    private com.google.android.gms.internal.ads.zzieq zzh = zzbM();

    static {
        com.google.android.gms.internal.ads.zzilq zzilqVar = new com.google.android.gms.internal.ads.zzilq();
        zzl = zzilqVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzilq.class, zzilqVar);
    }

    private zzilq() {
    }

    public static com.google.android.gms.internal.ads.zzilq zzc(byte[] bArr, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzilq) com.google.android.gms.internal.ads.zziee.zzbV(zzl, bArr, zzidoVar);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new java.lang.Object[]{"zza", "zzc", "zzd", "zze", "zzh", com.google.android.gms.internal.ads.zzilf.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzilq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzilp(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzm;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzilq.class) {
                zzifxVar = zzm;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzl);
                    zzm = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
