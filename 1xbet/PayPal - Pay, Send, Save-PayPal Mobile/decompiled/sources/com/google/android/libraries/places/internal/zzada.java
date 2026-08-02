package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzada extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzada zzf;
    private static volatile com.google.android.libraries.places.internal.zzbff zzg;
    private int zzb = 0;
    private java.lang.Object zze;

    static {
        com.google.android.libraries.places.internal.zzada zzadaVar = new com.google.android.libraries.places.internal.zzada();
        zzf = zzadaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzada.class, zzadaVar);
    }

    private zzada() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzf, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"zze", "zzb", com.google.android.libraries.places.internal.zzade.class, com.google.android.libraries.places.internal.zzacy.class, com.google.android.libraries.places.internal.zzadc.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzada();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzacz(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzada.class) {
            zzbffVar = zzg;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzf);
                zzg = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
