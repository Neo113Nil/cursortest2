package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaur extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaur zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private int zzg;
    private int zzh;

    static {
        com.google.android.libraries.places.internal.zzaur zzaurVar = new com.google.android.libraries.places.internal.zzaur();
        zzi = zzaurVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaur.class, zzaurVar);
    }

    private zzaur() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaup.zza, "zzf", com.google.android.libraries.places.internal.zzauq.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaur();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzauo(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaur.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
