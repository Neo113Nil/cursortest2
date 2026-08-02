package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzx zzx;
    private static volatile com.google.android.libraries.places.internal.zzbff zzy;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcp zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private float zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private com.google.android.libraries.places.internal.zzbea zzr = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzs = zzbG();
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;

    static {
        com.google.android.libraries.places.internal.zzx zzxVar = new com.google.android.libraries.places.internal.zzx();
        zzx = zzxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzx.class, zzxVar);
    }

    private zzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tခ\b\nဂ\t\u000bင\n\fဇ\u000b\r᠌\f\u000e\u001b\u000f\u001b\u0010င\r\u0011င\u000e\u0012ဂ\u0010\u0013င\u000f", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzw.zza, "zzg", "zzh", com.google.android.libraries.places.internal.zzav.zza, "zzi", com.google.android.libraries.places.internal.zzp.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", com.google.android.libraries.places.internal.zzae.zza, "zzr", com.google.android.libraries.places.internal.zzau.class, "zzs", com.google.android.libraries.places.internal.zzau.class, "zzt", "zzu", "zzw", "zzv"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzv(bArr);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzy;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzx.class) {
            zzbffVar = zzy;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzx);
                zzy = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
