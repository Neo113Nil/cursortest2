package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbea extends zzifm implements zzigx {
    private static final zzbea zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzc;
    private long zzf;
    private int zzh;
    private int zzi;
    private zziei zzb = zziei.zza;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";

    static {
        zzbea zzbeaVar = new zzbea();
        zzj = zzbeaVar;
        zzifm.zzbu(zzbea.class, zzbeaVar);
    }

    private zzbea() {
    }

    public static zzbdz zza() {
        return (zzbdz) zzj.zzbn();
    }

    final /* synthetic */ void zzb(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 1;
        this.zzb = zzieiVar;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzbea();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbdz(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzbea.class) {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzh = 1;
        this.zza |= 64;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzi = zzbel.zza(i);
        this.zza |= 128;
    }
}
