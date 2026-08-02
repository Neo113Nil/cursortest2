package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzcf extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzcf zzu;
    private static volatile com.google.android.libraries.places.internal.zzbff zzv;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcp zze;
    private com.google.android.libraries.places.internal.zzby zzf;
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private boolean zzs;
    private boolean zzt;

    static {
        com.google.android.libraries.places.internal.zzcf zzcfVar = new com.google.android.libraries.places.internal.zzcf();
        zzu = zzcfVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzcf.class, zzcfVar);
    }

    private zzcf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\rဂ\n\u000e᠌\u000b\u000fဇ\f\u0010ဇ\r", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", com.google.android.libraries.places.internal.zzcd.class, "zzh", com.google.android.libraries.places.internal.zzcd.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", com.google.android.libraries.places.internal.zzce.zza, "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzcf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzcb(bArr);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzv;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzcf.class) {
            zzbffVar = zzv;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzu);
                zzv = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
