package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzj extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzj zzn;
    private static volatile com.google.android.libraries.places.internal.zzbff zzo;
    private int zzb;
    private com.google.android.libraries.places.internal.zzcp zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private com.google.android.libraries.places.internal.zzau zzm;

    static {
        com.google.android.libraries.places.internal.zzj zzjVar = new com.google.android.libraries.places.internal.zzj();
        zzn = zzjVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzj.class, zzjVar);
    }

    private zzj() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", com.google.android.libraries.places.internal.zzav.zza, "zzi", com.google.android.libraries.places.internal.zzp.zza, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzj();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzi(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzj.class) {
            zzbffVar = zzo;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzn);
                zzo = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
