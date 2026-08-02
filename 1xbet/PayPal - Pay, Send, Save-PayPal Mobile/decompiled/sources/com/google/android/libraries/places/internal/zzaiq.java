package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaiq extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaiq zzh;
    private static volatile com.google.android.libraries.places.internal.zzbff zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.libraries.places.internal.zzaiq zzaiqVar = new com.google.android.libraries.places.internal.zzaiq();
        zzh = zzaiqVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaiq.class, zzaiqVar);
    }

    private zzaiq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzain.zza, "zzf", com.google.android.libraries.places.internal.zzaip.zza, "zzg", com.google.android.libraries.places.internal.zzaio.zza});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaiq();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaim(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaiq.class) {
            zzbffVar = zzi;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzh);
                zzi = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
