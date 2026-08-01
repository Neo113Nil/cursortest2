package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhtt extends zzifm implements zzigx {
    private static final zzhtt zzd;
    private static volatile zzihe zze;
    private String zza = "";
    private zziei zzb = zziei.zza;
    private int zzc;

    static {
        zzhtt zzhttVar = new zzhtt();
        zzd = zzhttVar;
        zzifm.zzbu(zzhtt.class, zzhttVar);
    }

    private zzhtt() {
    }

    public static zzhts zzc() {
        return (zzhts) zzd.zzbn();
    }

    public static zzhtt zzd() {
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
            return new zzhtt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhts(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhtt.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzg(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }

    public final int zzi() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzc = i - 2;
    }
}
