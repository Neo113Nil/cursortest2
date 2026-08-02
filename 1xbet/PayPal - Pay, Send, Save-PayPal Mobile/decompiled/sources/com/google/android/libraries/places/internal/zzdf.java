package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzdf extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzdf zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzj = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzk = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzl = zzbG();

    static {
        com.google.android.libraries.places.internal.zzdf zzdfVar = new com.google.android.libraries.places.internal.zzdf();
        zzm = zzdfVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzdf.class, zzdfVar);
    }

    private zzdf() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001✐\b\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b✐᠌\u0000", new java.lang.Object[]{"zzb", "zzf", com.google.android.libraries.places.internal.zzdj.class, "zzg", com.google.android.libraries.places.internal.zzdl.class, "zzh", com.google.android.libraries.places.internal.zzec.class, "zzi", com.google.android.libraries.places.internal.zzdt.class, "zzj", com.google.android.libraries.places.internal.zzee.class, "zzk", com.google.android.libraries.places.internal.zzdr.class, "zzl", com.google.android.libraries.places.internal.zzdp.class, "zze", com.google.android.libraries.places.internal.zzde.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzdf();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzdd(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzdf.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
