package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhef extends zzifm implements zzigx {
    private static final zzhef zzd;
    private static volatile zzihe zze;
    private int zza;
    private long zzb;
    private int zzc;

    static {
        zzhef zzhefVar = new zzhef();
        zzd = zzhefVar;
        zzifm.zzbu(zzhef.class, zzhefVar);
    }

    private zzhef() {
    }

    public static zzhee zza() {
        return (zzhee) zzd.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzc = i - 1;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzhec.zza});
        }
        if (ordinal == 3) {
            return new zzhef();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhee(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhef.class) {
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
