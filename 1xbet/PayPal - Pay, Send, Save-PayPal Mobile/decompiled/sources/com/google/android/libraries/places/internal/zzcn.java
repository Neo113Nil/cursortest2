package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzcn extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzcn zzl;
    private static volatile com.google.android.libraries.places.internal.zzbff zzm;
    private int zzb;
    private com.google.android.libraries.places.internal.zzbea zze = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzf = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        com.google.android.libraries.places.internal.zzcn zzcnVar = new com.google.android.libraries.places.internal.zzcn();
        zzl = zzcnVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzcn.class, zzcnVar);
    }

    private zzcn() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzl, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007ဂ\u0003\b\u001b", new java.lang.Object[]{"zzb", "zzf", com.google.android.libraries.places.internal.zzcm.class, "zzg", com.google.android.libraries.places.internal.zzck.class, "zzh", "zzi", "zzj", "zzk", "zze", com.google.android.libraries.places.internal.zzby.class});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzcn();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzci(bArr);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzm;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzcn.class) {
            zzbffVar = zzm;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzl);
                zzm = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
