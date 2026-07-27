package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzayz extends zzifm implements zzigx {
    private static final zzayz zzj;
    private static volatile zzihe zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzayz zzayzVar = new zzayz();
        zzj = zzayzVar;
        zzifm.zzbu(zzayz.class, zzayzVar);
    }

    private zzayz() {
    }

    public static zzayy zza() {
        return (zzayy) zzj.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzayz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayy(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzayz.class) {
                zziheVar = zzk;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzj);
                    zzk = zziheVar;
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }
}
