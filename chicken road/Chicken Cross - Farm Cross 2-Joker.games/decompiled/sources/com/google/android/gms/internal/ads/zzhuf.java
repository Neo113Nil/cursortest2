package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhuf extends zzifm implements zzigx {
    private static final zzhuf zze;
    private static volatile zzihe zzf;
    private String zza = "";
    private int zzb;
    private int zzc;
    private int zzd;

    static {
        zzhuf zzhufVar = new zzhuf();
        zze = zzhufVar;
        zzifm.zzbu(zzhuf.class, zzhufVar);
    }

    private zzhuf() {
    }

    public static zzhue zza() {
        return (zzhue) zze.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhuf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhue(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhuf.class) {
                zziheVar = zzf;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zze);
                    zzf = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = zzhtu.zza(i);
    }

    final /* synthetic */ void zzg(int i) {
        this.zzd = zzhup.zza(i);
    }
}
