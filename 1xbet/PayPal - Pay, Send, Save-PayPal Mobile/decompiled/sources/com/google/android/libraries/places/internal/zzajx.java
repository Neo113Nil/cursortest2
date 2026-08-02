package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzajx extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzajx zzq;
    private static volatile com.google.android.libraries.places.internal.zzbff zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private com.google.android.libraries.places.internal.zzbea zzm = zzbG();
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        com.google.android.libraries.places.internal.zzajx zzajxVar = new com.google.android.libraries.places.internal.zzajx();
        zzq = zzajxVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzajx.class, zzajxVar);
    }

    private zzajx() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", com.google.android.libraries.places.internal.zzajw.class, "zzn", "zzo", com.google.android.libraries.places.internal.zzaja.zza, "zzp"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzajx();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaju(bArr);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzr;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzajx.class) {
            zzbffVar = zzr;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzq);
                zzr = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
