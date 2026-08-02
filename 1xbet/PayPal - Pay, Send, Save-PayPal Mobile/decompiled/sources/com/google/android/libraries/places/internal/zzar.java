package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzar extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzar zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private int zzk;

    static {
        com.google.android.libraries.places.internal.zzar zzarVar = new com.google.android.libraries.places.internal.zzar();
        zzl = zzarVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzar.class, zzarVar);
    }

    private zzar() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", com.google.android.libraries.places.internal.zzap.zza, "zzi", "zzj", "zzk", com.google.android.libraries.places.internal.zzaq.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzar();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzao(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzar.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
