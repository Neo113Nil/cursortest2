package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfrq extends zzifm implements zzigx {
    private static final zzfrq zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzify zzb = zzbM();
    private zziiy zzc;

    static {
        zzfrq zzfrqVar = new zzfrq();
        zzd = zzfrqVar;
        zzifm.zzbu(zzfrq.class, zzfrqVar);
    }

    private zzfrq() {
    }

    public static zzfrn zzb() {
        return (zzfrn) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb.size();
    }

    final /* synthetic */ void zzc(zzfrp zzfrpVar) {
        zzfrpVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzfrpVar);
    }

    final /* synthetic */ void zzd() {
        this.zzb = zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfrp.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzfrq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfrn(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzfrq.class) {
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
