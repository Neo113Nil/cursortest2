package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzayu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzayu zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbhv zze;
    private com.google.android.libraries.places.internal.zzbhv zzf;
    private com.google.android.libraries.places.internal.zzbas zzg;
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();
    private java.lang.String zzi = "";

    static {
        com.google.android.libraries.places.internal.zzayu zzayuVar = new com.google.android.libraries.places.internal.zzayu();
        zzj = zzayuVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzayu.class, zzayuVar);
    }

    private zzayu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0004\u001b\u0005Ȉ", new java.lang.Object[]{"zzb", "zze", "zzg", "zzf", "zzh", com.google.android.libraries.places.internal.zzaxe.class, "zzi"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzayu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzayt(bArr);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzk;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzayu.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
