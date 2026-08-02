package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaol extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaol zzj;
    private static volatile com.google.android.libraries.places.internal.zzbff zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        com.google.android.libraries.places.internal.zzaol zzaolVar = new com.google.android.libraries.places.internal.zzaol();
        zzj = zzaolVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaol.class, zzaolVar);
    }

    private zzaol() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005᠌\u0004", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.libraries.places.internal.zzald.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaol();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaok(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaol.class) {
            zzbffVar = zzk;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzj);
                zzk = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
