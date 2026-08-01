package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhsa extends zzifm implements zzigx {
    private static final zzhsa zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsc zzb;
    private int zzc;

    static {
        zzhsa zzhsaVar = new zzhsa();
        zzd = zzhsaVar;
        zzifm.zzbu(zzhsa.class, zzhsaVar);
    }

    private zzhsa() {
    }

    public static zzhrz zzc() {
        return (zzhrz) zzd.zzbn();
    }

    public static zzhsa zzd() {
        return zzd;
    }

    public final zzhsc zza() {
        zzhsc zzhscVar = this.zzb;
        return zzhscVar == null ? zzhsc.zzc() : zzhscVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrz(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhsa.class) {
                zziheVar = zze;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzd);
                    zze = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zzhsc zzhscVar) {
        zzhscVar.getClass();
        this.zzb = zzhscVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
