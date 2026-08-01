package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhsk extends zzifm implements zzigx {
    private static final zzhsk zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.zza;

    static {
        zzhsk zzhskVar = new zzhsk();
        zzc = zzhskVar;
        zzifm.zzbu(zzhsk.class, zzhskVar);
    }

    private zzhsk() {
    }

    public static zzhsk zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsk) zzifm.zzbT(zzc, zzieiVar, zziewVar);
    }

    public static zzhsj zzd() {
        return (zzhsj) zzc.zzbn();
    }

    public static zzihe zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zziei zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhsk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsj(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhsk.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }
}
