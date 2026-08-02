package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaes extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaes zzm;
    private static volatile com.google.android.libraries.places.internal.zzbff zzn;
    private int zzb;
    private int zze;
    private long zzf;
    private com.google.android.libraries.places.internal.zzaee zzg;
    private long zzh;
    private int zzi;
    private com.google.android.libraries.places.internal.zzbdy zzj = zzbD();
    private com.google.android.libraries.places.internal.zzbdy zzk = zzbD();
    private int zzl;

    static {
        com.google.android.libraries.places.internal.zzaes zzaesVar = new com.google.android.libraries.places.internal.zzaes();
        zzm = zzaesVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaes.class, zzaesVar);
    }

    private zzaes() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001᠌\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006\u0016\u0007\u0016\bင\u0005", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzaer.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaes();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaeq(bArr);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzn;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaes.class) {
            zzbffVar = zzn;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzm);
                zzn = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
