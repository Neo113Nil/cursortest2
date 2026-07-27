package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfsd extends zzifm implements zzigx {
    private static final zzfsd zzc;
    private static volatile zzihe zzd;
    private zzify zza = zzbM();
    private long zzb;

    static {
        zzfsd zzfsdVar = new zzfsd();
        zzc = zzfsdVar;
        zzifm.zzbu(zzfsd.class, zzfsdVar);
    }

    private zzfsd() {
    }

    public static zzfsc zza() {
        return (zzfsc) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfqt zzfqtVar) {
        zzfqtVar.getClass();
        zzify zzifyVar = this.zza;
        if (!zzifyVar.zza()) {
            this.zza = zzifm.zzbN(zzifyVar);
        }
        this.zza.add(zzfqtVar);
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfqt.class, "zzb"});
        }
        if (ordinal == 3) {
            return new zzfsd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfsc(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzfsd.class) {
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
