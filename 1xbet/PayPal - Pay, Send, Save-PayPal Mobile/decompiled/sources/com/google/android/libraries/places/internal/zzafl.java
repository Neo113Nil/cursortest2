package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzafl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzafl zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private com.google.android.libraries.places.internal.zzafi zze;
    private com.google.android.libraries.places.internal.zzaeu zzg;
    private com.google.android.libraries.places.internal.zzaeu zzh;
    private com.google.android.libraries.places.internal.zzzt zzi;
    private int zzj;
    private com.google.android.libraries.places.internal.zzaew zzk;
    private com.google.android.libraries.places.internal.zzaes zzl;
    private com.google.android.libraries.places.internal.zzaep zzm;
    private com.google.android.libraries.places.internal.zzaey zzn;
    private com.google.android.libraries.places.internal.zzaen zzp;
    private com.google.android.libraries.places.internal.zzafa zzq;
    private com.google.android.libraries.places.internal.zzaec zzr;
    private com.google.android.libraries.places.internal.zzagc zzs;
    private com.google.android.libraries.places.internal.zzage zzt;
    private com.google.android.libraries.places.internal.zzaft zzu;
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzo = zzbG();

    static {
        com.google.android.libraries.places.internal.zzafl zzaflVar = new com.google.android.libraries.places.internal.zzafl();
        zzv = zzaflVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzafl.class, zzaflVar);
    }

    private zzafl() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzafn.class, "zzg", "zzh", "zzi", "zzj", com.google.android.libraries.places.internal.zzafk.zza, "zzk", "zzl", "zzm", "zzn", "zzo", com.google.android.libraries.places.internal.zzafe.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzafl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzafj(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzafl.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
