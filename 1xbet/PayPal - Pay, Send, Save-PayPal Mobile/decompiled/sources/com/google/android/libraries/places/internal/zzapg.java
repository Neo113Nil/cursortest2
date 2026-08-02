package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapg extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapg zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private com.google.android.libraries.places.internal.zzalr zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        com.google.android.libraries.places.internal.zzapg zzapgVar = new com.google.android.libraries.places.internal.zzapg();
        zzm = zzapgVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapg.class, zzapgVar);
    }

    private zzapg() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzals.zza, "zzg", com.google.android.libraries.places.internal.zzapf.zza, "zzh", "zzi", "zzj", com.google.android.libraries.places.internal.zzape.zza, "zzk", "zzl", com.google.android.libraries.places.internal.zzaks.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapg();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzapd(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzapg.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
