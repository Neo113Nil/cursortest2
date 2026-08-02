package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzafi extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzafi zzA;
    private static volatile com.google.android.libraries.places.internal.zzbff zzB;
    private int zzb;
    private long zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private com.google.android.libraries.places.internal.zzaej zzr;
    private long zzs;
    private com.google.android.libraries.places.internal.zzagg zzv;
    private com.google.android.libraries.places.internal.zzagg zzw;
    private com.google.android.libraries.places.internal.zzaea zzz;
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzt = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzu = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzx = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzy = zzbG();

    static {
        com.google.android.libraries.places.internal.zzafi zzafiVar = new com.google.android.libraries.places.internal.zzafi();
        zzA = zzafiVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzafi.class, zzafiVar);
    }

    private zzafi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzA, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0006\u0000\u0001စ\u0000\u0003\u001b\u0004\u001b\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bင\u0004\tင\u0005\nဂ\u0006\u000bဂ\u0007\fင\b\rင\t\u000eဂ\n\u000fဉ\u000b\u0010ဂ\f\u0011\u001b\u0012\u001b\u0013ဉ\r\u0014ဉ\u000e\u0015\u001b\u0016\u001b\u0019ဉ\u000f", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzafp.class, "zzg", com.google.android.libraries.places.internal.zzafr.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", com.google.android.libraries.places.internal.zzafz.class, "zzu", com.google.android.libraries.places.internal.zzafz.class, "zzv", "zzw", "zzx", com.google.android.libraries.places.internal.zzafg.class, "zzy", com.google.android.libraries.places.internal.zzafg.class, "zzz"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzafi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzafh(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzafi.class) {
            zzbffVar = zzB;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzA);
                zzB = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
