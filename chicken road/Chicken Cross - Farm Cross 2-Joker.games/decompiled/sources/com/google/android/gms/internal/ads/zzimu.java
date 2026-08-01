package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzimu extends zzifm implements zzigx {
    private static final zzimu zzj;
    private static volatile zzihe zzk;
    private int zza;
    private zzimd zzh;
    private String zzb = "";
    private String zzc = "";
    private zzify zzd = zzbM();
    private zzify zze = zzbM();
    private zzify zzf = zzbM();
    private int zzg = -1;
    private String zzi = "";

    static {
        zzimu zzimuVar = new zzimu();
        zzj = zzimuVar;
        zzifm.zzbu(zzimu.class, zzimuVar);
    }

    private zzimu() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", zzimh.class, "zze", zzimo.class, "zzg", "zzb", "zzf", zzinb.class, "zzi", "zzh"});
        }
        if (ordinal == 3) {
            return new zzimu();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimt(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzimu.class) {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
