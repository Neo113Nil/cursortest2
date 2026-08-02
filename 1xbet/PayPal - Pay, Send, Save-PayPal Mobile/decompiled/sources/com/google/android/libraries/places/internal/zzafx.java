package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzafx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzafx zzo;
    private static volatile com.google.android.libraries.places.internal.zzbff zzp;
    private int zzb;
    private long zze;
    private long zzf;
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzi = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzj = zzbG();
    private com.google.android.libraries.places.internal.zzagg zzk;
    private com.google.android.libraries.places.internal.zzagg zzl;
    private com.google.android.libraries.places.internal.zzagg zzm;
    private com.google.android.libraries.places.internal.zzagg zzn;

    static {
        com.google.android.libraries.places.internal.zzafx zzafxVar = new com.google.android.libraries.places.internal.zzafx();
        zzo = zzafxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzafx.class, zzafxVar);
    }

    private zzafx() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", com.google.android.libraries.places.internal.zzafz.class, "zzh", com.google.android.libraries.places.internal.zzafz.class, "zzi", com.google.android.libraries.places.internal.zzafz.class, "zzj", com.google.android.libraries.places.internal.zzafz.class, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzafx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzafw(bArr);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzp;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzafx.class) {
            zzbffVar = zzp;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzo);
                zzp = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
