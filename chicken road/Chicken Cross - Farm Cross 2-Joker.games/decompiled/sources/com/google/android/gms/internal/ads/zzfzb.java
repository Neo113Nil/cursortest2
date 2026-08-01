package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfzb extends zzifm implements zzigx {
    private static final zzfzb zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzifu zzb = zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfzb zzfzbVar = new zzfzb();
        zzf = zzfzbVar;
        zzifm.zzbu(zzfzb.class, zzfzbVar);
    }

    private zzfzb() {
    }

    public static zzfza zza() {
        return (zzfza) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i) {
        zzifu zzifuVar = this.zzb;
        if (!zzifuVar.zza()) {
            this.zzb = zzifm.zzbD(zzifuVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfyz.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzfzb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfza(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzfzb.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }
}
