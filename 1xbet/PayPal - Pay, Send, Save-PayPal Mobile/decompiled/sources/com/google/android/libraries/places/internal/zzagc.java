package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzagc extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzagc zzB;
    private static volatile com.google.android.libraries.places.internal.zzbff zzC;
    private boolean zzA;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private float zzh;
    private float zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private float zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private com.google.android.libraries.places.internal.zzbea zzx = zzbG();
    private int zzy;
    private float zzz;

    static {
        com.google.android.libraries.places.internal.zzagc zzagcVar = new com.google.android.libraries.places.internal.zzagc();
        zzB = zzagcVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzagc.class, zzagcVar);
    }

    private zzagc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzagb.zza;
            com.google.android.libraries.places.internal.zzbdw zzbdwVar2 = com.google.android.libraries.places.internal.zzaaa.zza;
            return zzbA(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fဇ\u000b\r᠌\f\u000eခ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011\u0013᠌\u0012\u0014\u001b\u0015င\u0013\u0016ခ\u0014\u0017ဇ\u0015", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzbdwVar, "zzr", "zzs", zzbdwVar2, "zzt", zzbdwVar2, "zzu", zzbdwVar2, "zzv", zzbdwVar2, "zzw", com.google.android.libraries.places.internal.zzaab.zza, "zzx", com.google.android.libraries.places.internal.zzafv.class, "zzy", "zzz", "zzA"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzagc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaga(bArr);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzC;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzagc.class) {
            zzbffVar = zzC;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzB);
                zzC = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
