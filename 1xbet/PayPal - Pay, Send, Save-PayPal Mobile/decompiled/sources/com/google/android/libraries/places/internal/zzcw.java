package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzcw extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static volatile com.google.android.libraries.places.internal.zzbff zzA;
    private static final com.google.android.libraries.places.internal.zzcw zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private float zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private double zzt;
    private int zzu;
    private boolean zzv;
    private int zzw;
    private boolean zzx;
    private int zzy;

    static {
        com.google.android.libraries.places.internal.zzcw zzcwVar = new com.google.android.libraries.places.internal.zzcw();
        zzz = zzcwVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzcw.class, zzcwVar);
    }

    private zzcw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fခ\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010က\u000f\u0011᠌\u0010\u0012ဇ\u0011\u0013᠌\u0012\u0014ဇ\u0013\u0015᠌\u0014", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", com.google.android.libraries.places.internal.zzcv.zza, "zzv", "zzw", com.google.android.libraries.places.internal.zzct.zza, "zzx", "zzy", com.google.android.libraries.places.internal.zzcu.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzcw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzcs(bArr);
        }
        if (i2 == 5) {
            return zzz;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzA;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzcw.class) {
            zzbffVar = zzA;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzz);
                zzA = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
