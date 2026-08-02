package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaep extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaep zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private com.google.android.libraries.places.internal.zzya zzk;
    private com.google.android.libraries.places.internal.zzbea zzl = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaep zzaepVar = new com.google.android.libraries.places.internal.zzaep();
        zzm = zzaepVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaep.class, zzaepVar);
    }

    private zzaep() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\b\u001b", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", com.google.android.libraries.places.internal.zzya.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaep();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaeo(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaep.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
