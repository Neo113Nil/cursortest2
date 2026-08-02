package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbw extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbw zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcp zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        com.google.android.libraries.places.internal.zzbw zzbwVar = new com.google.android.libraries.places.internal.zzbw();
        zzm = zzbwVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbw.class, zzbwVar);
    }

    private zzbw() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0007\bင\u0006", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzk"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbw();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbv(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzn;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbw.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
