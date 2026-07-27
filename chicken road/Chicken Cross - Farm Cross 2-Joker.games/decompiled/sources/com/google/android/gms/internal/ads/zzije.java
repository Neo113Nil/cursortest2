package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzije extends zzifm implements zzigx {
    private static final zzije zzd;
    private static volatile zzihe zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzije zzijeVar = new zzije();
        zzd = zzijeVar;
        zzifm.zzbu(zzije.class, zzijeVar);
    }

    private zzije() {
    }

    public static zzijd zzc() {
        return (zzijd) zzd.zzbn();
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzije();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijd(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzije.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzc = j;
    }
}
