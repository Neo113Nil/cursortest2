package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzabr extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzabr zzk;
    private static volatile com.google.android.libraries.places.internal.zzbff zzl;
    private int zzb;
    private long zze;
    private com.google.android.libraries.places.internal.zzbcl zzf;
    private double zzg;
    private com.google.android.libraries.places.internal.zzbcl zzh;
    private double zzi;
    private com.google.android.libraries.places.internal.zzbcl zzj;

    static {
        com.google.android.libraries.places.internal.zzabr zzabrVar = new com.google.android.libraries.places.internal.zzabr();
        zzk = zzabrVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzabr.class, zzabrVar);
    }

    private zzabr() {
        com.google.android.libraries.places.internal.zzbcl zzbclVar = com.google.android.libraries.places.internal.zzbcl.zza;
        this.zzf = zzbclVar;
        this.zzh = zzbclVar;
        this.zzj = zzbclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003က\u0002\u0004ည\u0003\u0005က\u0004\u0006ည\u0005", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzabr();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzabq(bArr);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzl;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzabr.class) {
            zzbffVar = zzl;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzk);
                zzl = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
