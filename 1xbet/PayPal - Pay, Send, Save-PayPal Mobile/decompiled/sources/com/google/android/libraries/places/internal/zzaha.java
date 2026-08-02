package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaha extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaha zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private long zzf;
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private com.google.android.libraries.places.internal.zzbdy zzg = zzbD();
    private com.google.android.libraries.places.internal.zzbdy zzh = zzbD();

    static {
        com.google.android.libraries.places.internal.zzaha zzahaVar = new com.google.android.libraries.places.internal.zzaha();
        zzi = zzahaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaha.class, zzahaVar);
    }

    private zzaha() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzaab.zza;
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzagz.class, "zzf", "zzg", zzbdwVar, "zzh", zzbdwVar});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaha();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzagx(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaha.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
