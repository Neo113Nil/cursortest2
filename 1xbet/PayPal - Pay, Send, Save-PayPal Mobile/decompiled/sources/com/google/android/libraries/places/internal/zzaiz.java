package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaiz extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaiz zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        com.google.android.libraries.places.internal.zzaiz zzaizVar = new com.google.android.libraries.places.internal.zzaiz();
        zzi = zzaizVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaiz.class, zzaizVar);
    }

    private zzaiz() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaix.zza, "zzf", com.google.android.libraries.places.internal.zzaiy.zza, "zzg", com.google.android.libraries.places.internal.zzaja.zza, "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaiz();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaiw(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaiz.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
