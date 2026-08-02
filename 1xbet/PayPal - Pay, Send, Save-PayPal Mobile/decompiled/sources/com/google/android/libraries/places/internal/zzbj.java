package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbj extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbj zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private com.google.android.libraries.places.internal.zzaj zze;
    private com.google.android.libraries.places.internal.zzbl zzf;
    private com.google.android.libraries.places.internal.zzcy zzg;

    static {
        com.google.android.libraries.places.internal.zzbj zzbjVar = new com.google.android.libraries.places.internal.zzbj();
        zzh = zzbjVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbj.class, zzbjVar);
    }

    private zzbj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbi(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzi;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbj.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
