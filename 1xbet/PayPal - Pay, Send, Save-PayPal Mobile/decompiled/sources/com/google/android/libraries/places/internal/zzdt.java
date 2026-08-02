package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdt extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdt zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private int zze;
    private float zzf;
    private int zzg;
    private int zzh;
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
    private float zzs;
    private int zzt;
    private int zzu;

    static {
        com.google.android.libraries.places.internal.zzdt zzdtVar = new com.google.android.libraries.places.internal.zzdt();
        zzv = zzdtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdt.class, zzdtVar);
    }

    private zzdt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eင\r\u000fခ\u000e\u0010င\u000f\u0011င\u0010", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdt();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzds(bArr);
        }
        if (i2 == 5) {
            return zzv;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzw;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzdt.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
