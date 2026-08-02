package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzadn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzadn zzB;
    private static volatile com.google.android.libraries.places.internal.zzbff zzC;
    private int zzA;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private com.google.android.libraries.places.internal.zzadu zzt;
    private com.google.android.libraries.places.internal.zzadw zzu;
    private com.google.android.libraries.places.internal.zzadk zzv;
    private com.google.android.libraries.places.internal.zzadp zzw;
    private com.google.android.libraries.places.internal.zzadr zzx;
    private int zzy;
    private int zzz;

    static {
        com.google.android.libraries.places.internal.zzadn zzadnVar = new com.google.android.libraries.places.internal.zzadn();
        zzB = zzadnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzadn.class, zzadnVar);
    }

    private zzadn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဋ\u0001\u0002ဋ\u0002\u0003ဋ\u0003\u0004ဋ\u0004\u0005ဋ\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\b\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဉ\u000f\u0010ဋ\u0000\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015᠌\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new java.lang.Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zze", "zzu", "zzv", "zzw", "zzx", "zzy", com.google.android.libraries.places.internal.zzadm.zza, "zzz", "zzA"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzadn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzadl(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzadn.class) {
            zzbffVar = zzC;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzB);
                zzC = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
