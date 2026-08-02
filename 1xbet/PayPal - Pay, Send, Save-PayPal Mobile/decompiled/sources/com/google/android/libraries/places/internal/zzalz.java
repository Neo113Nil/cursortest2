package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzalz extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzalz zzt;
    private static volatile com.google.android.libraries.places.internal.zzbff zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private com.google.android.libraries.places.internal.zzaln zzj;
    private com.google.android.libraries.places.internal.zzalg zzk;
    private com.google.android.libraries.places.internal.zzalc zzl;
    private com.google.android.libraries.places.internal.zzaqx zzm;
    private com.google.android.libraries.places.internal.zzali zzn;
    private com.google.android.libraries.places.internal.zzall zzo;
    private com.google.android.libraries.places.internal.zzaqz zzp;
    private com.google.android.libraries.places.internal.zzarh zzq;
    private com.google.android.libraries.places.internal.zzard zzr;
    private int zzs;

    static {
        com.google.android.libraries.places.internal.zzalz zzalzVar = new com.google.android.libraries.places.internal.zzalz();
        zzt = zzalzVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzalz.class, zzalzVar);
    }

    private zzalz() {
    }

    public static com.google.android.libraries.places.internal.zzalu zza() {
        return (com.google.android.libraries.places.internal.zzalu) zzt.zzbv();
    }

    final /* synthetic */ void zzd(com.google.android.libraries.places.internal.zzaln zzalnVar) {
        this.zzj = zzalnVar;
        this.zzb |= 32;
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzalc zzalcVar) {
        this.zzl = zzalcVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzali zzaliVar) {
        this.zzn = zzaliVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzarh zzarhVar) {
        this.zzq = zzarhVar;
        this.zzb |= 4096;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzalw.zza, "zzf", com.google.android.libraries.places.internal.zzaly.zza, "zzg", "zzh", com.google.android.libraries.places.internal.zzalv.zza, "zzi", com.google.android.libraries.places.internal.zzalt.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", com.google.android.libraries.places.internal.zzalx.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzalz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzalu(bArr);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzu;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzalz.class) {
            zzbffVar = zzu;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzt);
                zzu = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzi(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }
}
