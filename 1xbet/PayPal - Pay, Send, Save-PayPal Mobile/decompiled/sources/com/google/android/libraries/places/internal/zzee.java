package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzee extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzee zzE;
    private static volatile com.google.android.libraries.places.internal.zzbff zzF;
    private float zzA;
    private float zzB;
    private boolean zzC;
    private int zzD;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;
    private float zzo;
    private float zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private float zzx;
    private float zzy;
    private float zzz;

    static {
        com.google.android.libraries.places.internal.zzee zzeeVar = new com.google.android.libraries.places.internal.zzee();
        zzE = zzeeVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzee.class, zzeeVar);
    }

    private zzee() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzE, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ခ\u0015\u0017ခ\u0016\u0018ခ\u0017\u0019ဇ\u0018\u001aင\u0019", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzee();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzed(bArr);
        }
        if (i2 == 5) {
            return zzE;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzF;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzee.class) {
            zzbffVar = zzF;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzE);
                zzF = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
