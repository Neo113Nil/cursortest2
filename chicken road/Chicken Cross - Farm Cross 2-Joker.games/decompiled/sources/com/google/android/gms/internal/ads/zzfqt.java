package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfqt extends zzifm implements zzigx {
    private static final zzfqt zzc;
    private static volatile zzihe zzd;
    private int zza;
    private long zzb;

    static {
        zzfqt zzfqtVar = new zzfqt();
        zzc = zzfqtVar;
        zzifm.zzbu(zzfqt.class, zzfqtVar);
    }

    private zzfqt() {
    }

    public static zzfqs zza() {
        return (zzfqs) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfqt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqs(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzfqt.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
