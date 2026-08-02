package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzec extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzec zzD;
    private static volatile com.google.android.libraries.places.internal.zzbff zzE;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        com.google.android.libraries.places.internal.zzec zzecVar = new com.google.android.libraries.places.internal.zzec();
        zzD = zzecVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzec.class, zzecVar);
    }

    private zzec() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tင\b\nခ\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ဇ\u0012\u0014င\u0013\u0015င\u0014\u0016᠌\u0015\u0017ဇ\u0016\u0018င\u0017\u0019᠌\u0018", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", com.google.android.libraries.places.internal.zzea.zza, "zzA", "zzB", "zzC", com.google.android.libraries.places.internal.zzeb.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzec();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdz(bArr);
        }
        if (i2 == 5) {
            return zzD;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzE;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzec.class) {
            zzbffVar = zzE;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzD);
                zzE = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
