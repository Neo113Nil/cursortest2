package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziiy extends zzifm implements zzigx {
    private static final zziiy zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzifu zzc = zzbC();

    static {
        zziiy zziiyVar = new zziiy();
        zzd = zziiyVar;
        zzifm.zzbu(zziiy.class, zziiyVar);
    }

    private zziiy() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zziiy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziix(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zziiy.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
