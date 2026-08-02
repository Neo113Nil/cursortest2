package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaba extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaba zze;
    private static volatile com.google.android.libraries.places.internal.zzbff zzf;
    private com.google.android.libraries.places.internal.zzbea zzb = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaba zzabaVar = new com.google.android.libraries.places.internal.zzaba();
        zze = zzabaVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaba.class, zzabaVar);
    }

    private zzaba() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzb", com.google.android.libraries.places.internal.zzabc.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaba();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaaz(bArr);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzf;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaba.class) {
            zzbffVar = zzf;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zze);
                zzf = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
