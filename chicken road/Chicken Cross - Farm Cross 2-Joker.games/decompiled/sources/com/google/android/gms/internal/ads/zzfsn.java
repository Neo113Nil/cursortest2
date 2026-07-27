package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfsn extends zzifm implements zzigx {
    private static final zzfsn zzc;
    private static volatile zzihe zzd;
    private boolean zza;
    private boolean zzb;

    static {
        zzfsn zzfsnVar = new zzfsn();
        zzc = zzfsnVar;
        zzifm.zzbu(zzfsn.class, zzfsnVar);
    }

    private zzfsn() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfsn();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfsm(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzfsn.class) {
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
