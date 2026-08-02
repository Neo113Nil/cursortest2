package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzark extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzark zzg;
    private static volatile com.google.android.libraries.places.internal.zzbff zzh;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzaqq zzf;

    static {
        com.google.android.libraries.places.internal.zzark zzarkVar = new com.google.android.libraries.places.internal.zzark();
        zzg = zzarkVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzark.class, zzarkVar);
    }

    private zzark() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzarj.zza, "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzark();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzari(bArr);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzh;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzark.class) {
            zzbffVar = zzh;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzg);
                zzh = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
