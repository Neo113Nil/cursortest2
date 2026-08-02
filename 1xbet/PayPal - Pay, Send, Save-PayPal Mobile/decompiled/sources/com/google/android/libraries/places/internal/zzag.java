package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzag extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzag zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcy zze;
    private boolean zzf;
    private com.google.android.libraries.places.internal.zzbea zzg = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzh = zzbG();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        com.google.android.libraries.places.internal.zzag zzagVar = new com.google.android.libraries.places.internal.zzag();
        zzn = zzagVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzag.class, zzagVar);
    }

    private zzag() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", com.google.android.libraries.places.internal.zzau.class, "zzh", com.google.android.libraries.places.internal.zzau.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzag();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaf(bArr);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzo;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzag.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
