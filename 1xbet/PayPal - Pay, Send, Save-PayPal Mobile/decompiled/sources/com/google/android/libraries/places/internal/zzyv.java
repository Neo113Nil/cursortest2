package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzyv extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzyv zzy;
    private static volatile com.google.android.libraries.places.internal.zzbff zzz;
    private int zzb;
    private boolean zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private boolean zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;

    static {
        com.google.android.libraries.places.internal.zzyv zzyvVar = new com.google.android.libraries.places.internal.zzyv();
        zzy = zzyvVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzyv.class, zzyvVar);
    }

    private zzyv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzy, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007ဇ\u0006\bင\u0007\tဇ\b\nင\t\u000bဇ\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014ဋ\u0013", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzyv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzyu(bArr);
        }
        if (i2 == 5) {
            return zzy;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzz;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzyv.class) {
            zzbffVar = zzz;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzy);
                zzz = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
