package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaxs extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaxs zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzaxh zzh;

    static {
        com.google.android.libraries.places.internal.zzaxs zzaxsVar = new com.google.android.libraries.places.internal.zzaxs();
        zzi = zzaxsVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzbau.class, "zzf", com.google.android.libraries.places.internal.zzaym.class, "zzg", com.google.android.libraries.places.internal.zzaxr.class, "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaxs();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaxf(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaxs.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
