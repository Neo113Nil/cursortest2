package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzhto extends com.google.android.gms.internal.ads.zziee implements com.google.android.gms.internal.ads.zzifq {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhto zzd;
    private static volatile com.google.android.gms.internal.ads.zzifx zze;
    private java.lang.String zzb = "";
    private com.google.android.gms.internal.ads.zzieq zzc = zzbM();

    static {
        com.google.android.gms.internal.ads.zzhto zzhtoVar = new com.google.android.gms.internal.ads.zzhto();
        zzd = zzhtoVar;
        com.google.android.gms.internal.ads.zziee.zzbu(com.google.android.gms.internal.ads.zzhto.class, zzhtoVar);
    }

    private zzhto() {
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final java.lang.Object zzdc(com.google.android.gms.internal.ads.zzied zziedVar, java.lang.Object obj, java.lang.Object obj2) {
        int ordinal = zziedVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new java.lang.Object[]{"zzb", "zzc", com.google.android.gms.internal.ads.zzhsv.class});
        }
        if (ordinal == 3) {
            return new com.google.android.gms.internal.ads.zzhto();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new com.google.android.gms.internal.ads.zzhtn(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        com.google.android.gms.internal.ads.zzifx zzifxVar = zze;
        if (zzifxVar == null) {
            synchronized (com.google.android.gms.internal.ads.zzhto.class) {
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
