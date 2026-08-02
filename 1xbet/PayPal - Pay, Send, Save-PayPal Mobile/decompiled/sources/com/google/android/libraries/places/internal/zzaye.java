package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaye extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaye zze;
    private static volatile com.google.android.libraries.places.internal.zzbff zzf;
    private com.google.android.libraries.places.internal.zzbea zzb = zzbG();

    static {
        com.google.android.libraries.places.internal.zzaye zzayeVar = new com.google.android.libraries.places.internal.zzaye();
        zze = zzayeVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaye.class, zzayeVar);
    }

    private zzaye() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zze, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzb", com.google.android.libraries.places.internal.zzayd.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaye();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaya(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaye.class) {
            zzbffVar = zzf;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zze);
                zzf = zzbffVar;
            }
        }
        return zzbffVar;
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    public static com.google.android.libraries.places.internal.zzaye zzc() {
        return zze;
    }
}
