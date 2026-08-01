package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhso extends zzifm implements zzigx {
    private static final zzhso zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.zza;

    static {
        zzhso zzhsoVar = new zzhso();
        zzc = zzhsoVar;
        zzifm.zzbu(zzhso.class, zzhsoVar);
    }

    private zzhso() {
    }

    public static zzhso zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhso) zzifm.zzbT(zzc, zzieiVar, zziewVar);
    }

    public static zzhsn zzd() {
        return (zzhsn) zzc.zzbn();
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
            return new zzhso();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsn(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhso.class) {
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
