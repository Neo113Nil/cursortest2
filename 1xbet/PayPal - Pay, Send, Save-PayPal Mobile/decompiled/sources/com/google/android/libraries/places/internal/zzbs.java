package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbs extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbs zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private int zze = 1;
    private com.google.android.libraries.places.internal.zzbu zzf;
    private com.google.android.libraries.places.internal.zzbn zzg;
    private com.google.android.libraries.places.internal.zzcy zzh;
    private com.google.android.libraries.places.internal.zzbp zzi;
    private com.google.android.libraries.places.internal.zzbw zzj;

    static {
        com.google.android.libraries.places.internal.zzbs zzbsVar = new com.google.android.libraries.places.internal.zzbs();
        zzk = zzbsVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbs.class, zzbsVar);
    }

    private zzbs() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzbr.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbs();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbq(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbs.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
