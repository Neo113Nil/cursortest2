package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzilz extends zzifm implements zzigx {
    private static final zzilz zzp;
    private static volatile zzihe zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzify zze = zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzify zzj = zzbM();

    static {
        zzilz zzilzVar = new zzilz();
        zzp = zzilzVar;
        zzifm.zzbu(zzilz.class, zzilzVar);
    }

    private zzilz() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzily.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzilx.class, "zzc", "zzk", zzilv.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (ordinal == 3) {
            return new zzilz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzilu(bArr);
        }
        if (ordinal == 5) {
            return zzp;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzu;
        if (zziheVar == null) {
            synchronized (zzilz.class) {
                zziheVar = zzu;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzp);
                    zzu = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
