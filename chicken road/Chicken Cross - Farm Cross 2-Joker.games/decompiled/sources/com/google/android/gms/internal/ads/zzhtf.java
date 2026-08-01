package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtf extends zzifm implements zzigx {
    private static final zzhtf zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhtf zzhtfVar = new zzhtf();
        zzb = zzhtfVar;
        zzifm.zzbu(zzhtf.class, zzhtfVar);
    }

    private zzhtf() {
    }

    public static zzhtf zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtf) zzifm.zzbT(zzb, zzieiVar, zziewVar);
    }

    public static zzhtf zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhtf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhte(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhtf.class) {
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
