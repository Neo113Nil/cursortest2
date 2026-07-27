package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbec extends zzifm implements zzigx {
    private static final zzbec zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzben zzb;
    private zzifu zzc = zzbC();

    static {
        zzbec zzbecVar = new zzbec();
        zzd = zzbecVar;
        zzifm.zzbu(zzbec.class, zzbecVar);
    }

    private zzbec() {
    }

    public static zzbec zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzbec) zzifm.zzbV(zzd, bArr, zziewVar);
    }

    public final zzben zza() {
        zzben zzbenVar = this.zzb;
        return zzbenVar == null ? zzben.zze() : zzbenVar;
    }

    public final List zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbec();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbeb(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzbec.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
