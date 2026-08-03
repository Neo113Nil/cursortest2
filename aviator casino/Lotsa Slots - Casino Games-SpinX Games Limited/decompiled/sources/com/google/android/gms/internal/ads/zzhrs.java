package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhrs extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    private static final com.google.android.gms.internal.ads.zzhrs zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private int zza;
    private com.google.android.gms.internal.ads.zzhru zzb;
    private int zzc;

    static {
        com.google.android.gms.internal.ads.zzhrs zzhrsVar = new com.google.android.gms.internal.ads.zzhrs();
        zzd = zzhrsVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhrs.class, zzhrsVar);
    }

    private zzhrs() {
    }

    public static com.google.android.gms.internal.ads.zzhrs zzb(com.google.android.gms.internal.ads.zzida zzidaVar, com.google.android.gms.internal.ads.zzido zzidoVar) throws com.google.android.gms.internal.ads.zziet {
        return (com.google.android.gms.internal.ads.zzhrs) com.google.android.gms.internal.ads.zziee.zzbT(zzd, zzidaVar, zzidoVar);
    }

    public static com.google.android.gms.internal.ads.zzhrr zzc() {
        return (com.google.android.gms.internal.ads.zzhrr) zzd.zzbn();
    }

    public final com.google.android.gms.internal.ads.zzhru zza() {
        com.google.android.gms.internal.ads.zzhru zzhruVar = this.zzb;
        return zzhruVar == null ? com.google.android.gms.internal.ads.zzhru.zzc() : zzhruVar;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzhru zzhruVar) {
        zzhruVar.getClass();
        this.zzb = zzhruVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new java.lang.Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhrs();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhrr(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhrs.class) {
                zzifxVar = zze;
                if (zzifxVar == null) {
                    zzifxVar = new com.google.android.gms.internal.ads.zzidz(zzd);
                    zze = zzifxVar;
                }
            }
        }
        return zzifxVar;
    }
}
