package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzbas extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzbas zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private com.google.android.libraries.places.internal.zzbea zzb = zzbG();
    private com.google.android.libraries.places.internal.zzbea zze = com.google.android.libraries.places.internal.zzbdq.zzbG();

    static {
        com.google.android.libraries.places.internal.zzbas zzbasVar = new com.google.android.libraries.places.internal.zzbas();
        zzf = zzbasVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzbas.class, zzbasVar);
    }

    private zzbas() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new java.lang.Object[]{"zzb", com.google.android.libraries.places.internal.zzbau.class, "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzbas();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzbar(bArr);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzg;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzbas.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
