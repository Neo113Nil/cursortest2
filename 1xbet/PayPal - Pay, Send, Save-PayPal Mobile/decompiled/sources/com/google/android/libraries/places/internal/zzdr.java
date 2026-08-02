package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdr extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdr zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        com.google.android.libraries.places.internal.zzdr zzdrVar = new com.google.android.libraries.places.internal.zzdr();
        zzm = zzdrVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdr.class, zzdrVar);
    }

    private zzdr() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.libraries.places.internal.zzdy.zza, "zzj", com.google.android.libraries.places.internal.zzdx.zza, "zzk", com.google.android.libraries.places.internal.zzdw.zza, "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdq(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzdr.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
