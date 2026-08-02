package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbc extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbc zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private com.google.android.libraries.places.internal.zzbdy zzj = zzbD();
    private int zzk;

    static {
        com.google.android.libraries.places.internal.zzbc zzbcVar = new com.google.android.libraries.places.internal.zzbc();
        zzl = zzbcVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbc.class, zzbcVar);
    }

    private zzbc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.libraries.places.internal.zzbdw zzbdwVar = com.google.android.libraries.places.internal.zzav.zza;
            com.google.android.libraries.places.internal.zzbdw zzbdwVar2 = com.google.android.libraries.places.internal.zzbb.zza;
            return zzbA(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ࠞ\u0007᠌\u0005", new java.lang.Object[]{"zzb", "zze", zzbdwVar, "zzf", "zzg", "zzh", "zzi", "zzj", zzbdwVar2, "zzk", zzbdwVar2});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbc();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzba(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbc.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
