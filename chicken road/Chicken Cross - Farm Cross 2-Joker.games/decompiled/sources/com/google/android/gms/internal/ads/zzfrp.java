package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfrp extends zzifm implements zzigx {
    private static final zzfrp zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzfrm zzb;

    static {
        zzfrp zzfrpVar = new zzfrp();
        zzc = zzfrpVar;
        zzifm.zzbu(zzfrp.class, zzfrpVar);
    }

    private zzfrp() {
    }

    public static zzfro zza() {
        return (zzfro) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfrm zzfrmVar) {
        zzfrmVar.getClass();
        this.zzb = zzfrmVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfrp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfro(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzfrp.class) {
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
