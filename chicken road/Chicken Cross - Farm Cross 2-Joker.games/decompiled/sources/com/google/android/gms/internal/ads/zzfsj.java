package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfsj extends zzifm implements zzigx {
    private static final zzfsj zzb;
    private static volatile zzihe zzc;
    private zzify zza = zzbM();

    static {
        zzfsj zzfsjVar = new zzfsj();
        zzb = zzfsjVar;
        zzifm.zzbu(zzfsj.class, zzfsjVar);
    }

    private zzfsj() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfsh.class});
        }
        if (ordinal == 3) {
            return new zzfsj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfsi(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzfsj.class) {
                zziheVar = zzc;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzb);
                    zzc = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
