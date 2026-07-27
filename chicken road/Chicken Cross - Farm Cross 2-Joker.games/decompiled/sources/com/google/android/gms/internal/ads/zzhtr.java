package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtr extends zzifm implements zzigx {
    private static final zzhtr zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhtr zzhtrVar = new zzhtr();
        zzc = zzhtrVar;
        zzifm.zzbu(zzhtr.class, zzhtrVar);
    }

    private zzhtr() {
    }

    public static zzhtq zzc() {
        return (zzhtq) zzc.zzbn();
    }

    public static zzhtr zzd() {
        return zzc;
    }

    public final zzhtl zza() {
        zzhtl zzb = zzhtl.zzb(this.zza);
        return zzb == null ? zzhtl.UNRECOGNIZED : zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhtr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtq(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhtr.class) {
                zziheVar = zzd;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzc);
                    zzd = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    final /* synthetic */ void zzg(int i) {
        this.zzb = i;
    }
}
