package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaht extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaht zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private java.lang.String zzg = "";

    static {
        com.google.android.libraries.places.internal.zzaht zzahtVar = new com.google.android.libraries.places.internal.zzaht();
        zzh = zzahtVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaht.class, zzahtVar);
    }

    private zzaht() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzahs.zza, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaht();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzahr(bArr);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzi;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaht.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
