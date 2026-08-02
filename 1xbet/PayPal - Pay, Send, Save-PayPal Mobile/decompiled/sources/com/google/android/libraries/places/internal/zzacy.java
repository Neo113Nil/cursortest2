package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzacy extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzacy zzb;
    private static volatile com.google.android.libraries.places.internal.zzbff zze;

    static {
        com.google.android.libraries.places.internal.zzacy zzacyVar = new com.google.android.libraries.places.internal.zzacy();
        zzb = zzacyVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzacy.class, zzacyVar);
    }

    private zzacy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i2 == 2) {
            return zzbA(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzacy();
        }
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzacx(bArr);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zze;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzacy.class) {
            zzbffVar = zze;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzb);
                zze = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
