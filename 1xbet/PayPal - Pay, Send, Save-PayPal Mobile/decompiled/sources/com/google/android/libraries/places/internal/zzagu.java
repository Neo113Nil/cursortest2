package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzagu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzagu zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private com.google.android.libraries.places.internal.zzbea zzj = zzbG();
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;

    static {
        com.google.android.libraries.places.internal.zzagu zzaguVar = new com.google.android.libraries.places.internal.zzagu();
        zzv = zzaguVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzagu.class, zzaguVar);
    }

    private zzagu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007င\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0011င\u000f", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", com.google.android.libraries.places.internal.zzagt.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzagu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzagr(bArr);
        }
        if (i2 == 5) {
            return zzv;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzw;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzagu.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
