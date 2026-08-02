package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzau extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzau zzA;
    private static volatile com.google.android.libraries.places.internal.zzbff zzB;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private boolean zzk;
    private float zzl;
    private double zzm;
    private int zzn;
    private long zzo;
    private float zzp;
    private float zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    static {
        com.google.android.libraries.places.internal.zzau zzauVar = new com.google.android.libraries.places.internal.zzau();
        zzA = zzauVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzau.class, zzauVar);
    }

    private zzau() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzat.zza;
            return zzbA(zzA, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bခ\u0007\tက\b\n᠌\t\u000bဂ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzbdwVar, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzbdwVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzau();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzas(bArr);
        }
        if (i2 == 5) {
            return zzA;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzB;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzau.class) {
            zzbffVar = zzB;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzA);
                zzB = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
