package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzya extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzya zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private java.lang.String zze = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.libraries.places.internal.zzya zzyaVar = new com.google.android.libraries.places.internal.zzya();
        zzn = zzyaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzya.class, zzyaVar);
    }

    private zzya() {
    }

    public static com.google.android.libraries.places.internal.zzxv zza() {
        return (com.google.android.libraries.places.internal.zzxv) zzn.zzbv();
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", com.google.android.libraries.places.internal.zzxw.zza, "zzk", com.google.android.libraries.places.internal.zzxy.zza, "zzl", com.google.android.libraries.places.internal.zzxx.zza, "zzm", com.google.android.libraries.places.internal.zzxz.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzya();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzxv(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzo;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzya.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb |= 2;
        this.zzf = i;
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        this.zzb |= 1;
        this.zze = str;
    }
}
