package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtw extends zzifm implements zzigx {
    private static final zzhtw zzd;
    private static volatile zzihe zze;
    private String zza = "";
    private zziei zzb = zziei.zza;
    private int zzc;

    static {
        zzhtw zzhtwVar = new zzhtw();
        zzd = zzhtwVar;
        zzifm.zzbu(zzhtw.class, zzhtwVar);
    }

    private zzhtw() {
    }

    public static zzhtw zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzhtw) zzifm.zzbV(zzd, bArr, zziewVar);
    }

    public static zzhtv zzd() {
        return (zzhtv) zzd.zzbn();
    }

    public static zzhtv zze(zzhtw zzhtwVar) {
        return (zzhtv) zzd.zzbo(zzhtwVar);
    }

    public static zzhtw zzg() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zziei zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhtw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtv(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhtw.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    public final int zzk() {
        int zzb = zzhup.zzb(this.zzc);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzc = zzhup.zza(i);
    }
}
