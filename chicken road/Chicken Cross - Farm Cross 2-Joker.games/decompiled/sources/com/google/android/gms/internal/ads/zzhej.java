package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhej extends zzifm implements zzigx {
    private static final zzhej zzb;
    private static volatile zzihe zzc;
    private zzify zza = zzbM();

    static {
        zzhej zzhejVar = new zzhej();
        zzb = zzhejVar;
        zzifm.zzbu(zzhej.class, zzhejVar);
    }

    private zzhej() {
    }

    public static zzheg zzb() {
        return (zzheg) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(zzhei zzheiVar) {
        zzheiVar.getClass();
        zzify zzifyVar = this.zza;
        if (!zzifyVar.zza()) {
            this.zza = zzifm.zzbN(zzifyVar);
        }
        this.zza.add(zzheiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhei.class});
        }
        if (ordinal == 3) {
            return new zzhej();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzheg(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhej.class) {
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
