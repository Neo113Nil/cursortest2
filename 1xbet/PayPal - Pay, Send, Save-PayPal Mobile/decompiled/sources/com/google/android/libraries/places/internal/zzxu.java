package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzxu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzxu zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private int zzl;
    private com.google.android.libraries.places.internal.zzbdy zze = zzbD();
    private java.lang.String zzf = "";
    private com.google.android.libraries.places.internal.zzbcl zzk = com.google.android.libraries.places.internal.zzbcl.zza;

    static {
        com.google.android.libraries.places.internal.zzxu zzxuVar = new com.google.android.libraries.places.internal.zzxu();
        zzm = zzxuVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzxu.class, zzxuVar);
    }

    private zzxu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ࠬ\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ည\u0005\bင\u0006", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzxt.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzxu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzxs(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzxu.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
