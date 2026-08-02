package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdn zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private float zzf;
    private float zzg;

    static {
        com.google.android.libraries.places.internal.zzdn zzdnVar = new com.google.android.libraries.places.internal.zzdn();
        zzh = zzdnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdn.class, zzdnVar);
    }

    private zzdn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003ခ\u0001", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzdv.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdm(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzdn.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
