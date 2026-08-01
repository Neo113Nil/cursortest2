package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzijk extends zzifm implements zzigx {
    private static final zzijk zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zziei zzd = zziei.zza;

    static {
        zzijk zzijkVar = new zzijk();
        zze = zzijkVar;
        zzifm.zzbu(zzijk.class, zzijkVar);
    }

    private zzijk() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzijj.zza, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzijk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziji(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzijk.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
