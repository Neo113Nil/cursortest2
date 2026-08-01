package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhuo extends zzifm implements zzigx {
    private static final zzhuo zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzhtw zzc;

    static {
        zzhuo zzhuoVar = new zzhuo();
        zzd = zzhuoVar;
        zzifm.zzbu(zzhuo.class, zzhuoVar);
    }

    private zzhuo() {
    }

    public static zzhuo zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhuo) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhun zzd() {
        return (zzhun) zzd.zzbn();
    }

    public static zzhuo zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhtw zzb() {
        zzhtw zzhtwVar = this.zzc;
        return zzhtwVar == null ? zzhtw.zzg() : zzhtwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhuo();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhun(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhuo.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhtw zzhtwVar) {
        zzhtwVar.getClass();
        this.zzc = zzhtwVar;
        this.zza |= 1;
    }
}
