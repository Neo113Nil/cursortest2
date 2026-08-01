package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfze extends zzifm implements zzigx {
    private static final zzfze zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private zzfzb zze;

    static {
        zzfze zzfzeVar = new zzfze();
        zzf = zzfzeVar;
        zzifm.zzbu(zzfze.class, zzfzeVar);
    }

    private zzfze() {
    }

    public static zzfzc zza() {
        return (zzfzc) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzc(zzfzb zzfzbVar) {
        zzfzbVar.getClass();
        this.zze = zzfzbVar;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", zzfzd.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfze();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfzc(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzfze.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
