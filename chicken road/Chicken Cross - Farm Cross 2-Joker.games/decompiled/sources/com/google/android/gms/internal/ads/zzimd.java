package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzimd extends zzifm implements zzigx {
    private static final zzimd zzb;
    private static volatile zzihe zzc;
    private zzify zza = zzbM();

    static {
        zzimd zzimdVar = new zzimd();
        zzb = zzimdVar;
        zzifm.zzbu(zzimd.class, zzimdVar);
    }

    private zzimd() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzimb.class});
        }
        if (ordinal == 3) {
            return new zzimd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimc(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzimd.class) {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
