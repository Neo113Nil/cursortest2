package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzafv extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzafv zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private long zzh;

    static {
        com.google.android.libraries.places.internal.zzafv zzafvVar = new com.google.android.libraries.places.internal.zzafv();
        zzi = zzafvVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzafv.class, zzafvVar);
    }

    private zzafv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဂ\u0003", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzafv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzafu(bArr);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzj;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzafv.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
