package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapi extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapi zzi;
    private static volatile com.google.android.libraries.places.internal.zzbff zzj;
    private int zzb;
    private int zzf;
    private boolean zzh;
    private com.google.android.libraries.places.internal.zzbea zze = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private java.lang.String zzg = "";

    static {
        com.google.android.libraries.places.internal.zzapi zzapiVar = new com.google.android.libraries.places.internal.zzapi();
        zzi = zzapiVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapi.class, zzapiVar);
    }

    private zzapi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new java.lang.Object[]{"zzb", "zze", "zzf", com.google.android.libraries.places.internal.zzapf.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapi();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaph(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzapi.class) {
            zzbffVar = zzj;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzi);
                zzj = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
