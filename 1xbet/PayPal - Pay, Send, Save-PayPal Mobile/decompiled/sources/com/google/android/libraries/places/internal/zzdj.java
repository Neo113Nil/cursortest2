package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdj extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdj zzD;
    private static volatile com.google.android.libraries.places.internal.zzbff zzE;
    private int zzA;
    private float zzB;
    private float zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private float zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private float zzz;

    static {
        com.google.android.libraries.places.internal.zzdj zzdjVar = new com.google.android.libraries.places.internal.zzdj();
        zzD = zzdjVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdj.class, zzdjVar);
    }

    private zzdj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011င\u0010\u0012ခ\u0011\u0013င\u0012\u0014င\u0013\u0015င\u0014\u0016ခ\u0015\u0017င\u0016\u0018ခ\u0017\u0019ခ\u0018", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzda.zza(), "zzf", com.google.android.libraries.places.internal.zzdc.zza(), "zzg", com.google.android.libraries.places.internal.zzdi.zza, "zzh", com.google.android.libraries.places.internal.zzdh.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdg(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzdj.class) {
            zzbffVar = zzE;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzD);
                zzE = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
