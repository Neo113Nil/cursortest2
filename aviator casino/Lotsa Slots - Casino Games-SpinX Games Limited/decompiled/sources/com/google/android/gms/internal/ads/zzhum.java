package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhum extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhum zzc;
    private static volatile com.google.android.gms.internal.ads.zzifx zzd;
    private int zza;
    private com.google.android.gms.internal.ads.zzida zzb = com.google.android.gms.internal.ads.zzida.zza;

    static {
        com.google.android.gms.internal.ads.zzhum zzhumVar = new com.google.android.gms.internal.ads.zzhum();
        zzc = zzhumVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhum.class, zzhumVar);
    }

    private zzhum() {
    }

    public static com.google.android.gms.internal.ads.zzhum zzc(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhum) com.google.android.gms.internal.ads.zziee.zzbT(zzc, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhul zzd() {
        return (com.google.android.gms.internal.ads.zzhul) zzc.zzbn();
    }

    public static com.google.android.gms.internal.ads.zzifx zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzida zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new java.lang.Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhum();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhul(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zzd;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhum.class) {
                zzifxVar = zzd;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzc);
                    zzd = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }

    final /* synthetic */ void zzg(com.google.android.gms.internal.ads.zzida zzidaVar) {
        zzidaVar.getClass();
        this.zzb = zzidaVar;
    }
}
