package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@Deprecated
/* loaded from: classes9.dex */
public final class zzhur extends zzifm implements zzigx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhur zzd;
    private static volatile zzihe zze;
    private String zzb = "";
    private zzify zzc = zzbM();

    static {
        zzhur zzhurVar = new zzhur();
        zzd = zzhurVar;
        zzifm.zzbu(zzhur.class, zzhurVar);
    }

    private zzhur() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhty.class});
        }
        if (ordinal == 3) {
            return new zzhur();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuq(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhur.class) {
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
