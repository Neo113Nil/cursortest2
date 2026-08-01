package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzilt extends zzifm implements zzigx {
    private static final zzilt zzh;
    private static volatile zzihe zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzifu zzd = zzbC();
    private zzify zzf = zzbM();
    private zziei zzg = zziei.zza;

    static {
        zzilt zziltVar = new zzilt();
        zzh = zziltVar;
        zzifm.zzbu(zzilt.class, zziltVar);
    }

    private zzilt() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzilr.class, "zzg"});
        }
        if (ordinal == 3) {
            return new zzilt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzils(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzi;
        if (zziheVar == null) {
            synchronized (zzilt.class) {
                zziheVar = zzi;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzh);
                    zzi = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
