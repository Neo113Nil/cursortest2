package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbl extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbl zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbdy zze = zzbD();
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private float zzk;
    private int zzl;
    private com.google.android.libraries.places.internal.zzbh zzm;

    static {
        com.google.android.libraries.places.internal.zzbl zzblVar = new com.google.android.libraries.places.internal.zzbl();
        zzn = zzblVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbl.class, zzblVar);
    }

    private zzbl() {
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
            com.google.android.libraries.places.internal.zzbdw zzbdwVar2 = com.google.android.libraries.places.internal.zzbf.zza;
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ࠬ\u0002᠌\u0000\u0003᠌\u0001\u0004င\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ခ\u0005\b᠌\u0006\tဉ\u0007", new java.lang.Object[]{"zzb", "zze", zzbdwVar, "zzf", zzbdwVar2, "zzg", zzbdwVar2, "zzh", "zzi", "zzj", "zzk", "zzl", zzbdwVar, "zzm"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbl();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbk(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzo;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbl.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
