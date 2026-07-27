package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhrq extends zzifm implements zzigx {
    private static final zzhrq zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhrs zzc;

    static {
        zzhrq zzhrqVar = new zzhrq();
        zzd = zzhrqVar;
        zzifm.zzbu(zzhrq.class, zzhrqVar);
    }

    private zzhrq() {
    }

    public static zzhrq zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhrq) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhrp zzd() {
        return (zzhrp) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhrs zzb() {
        zzhrs zzhrsVar = this.zzc;
        return zzhrsVar == null ? zzhrs.zzc() : zzhrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrp(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhrq.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = i;
    }

    final /* synthetic */ void zzg(zzhrs zzhrsVar) {
        zzhrsVar.getClass();
        this.zzc = zzhrsVar;
        this.zza |= 1;
    }
}
