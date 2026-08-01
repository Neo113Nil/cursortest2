package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzikv extends zzifm implements zzigx {
    private static final zzikv zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zziei zzd;
    private zziei zze;

    static {
        zzikv zzikvVar = new zzikv();
        zzf = zzikvVar;
        zzifm.zzbu(zzikv.class, zzikvVar);
    }

    private zzikv() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
    }

    public static zzikt zzc() {
        return (zzikt) zzf.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = MimeTypes.IMAGE_PNG;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zziku.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzikv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzikt(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzikv.class) {
                zziheVar = zzg;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzf);
                    zzg = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
