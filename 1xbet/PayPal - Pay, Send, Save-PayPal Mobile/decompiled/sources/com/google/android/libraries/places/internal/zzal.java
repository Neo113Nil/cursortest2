package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzal extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzal zzw;
    private static volatile com.google.android.libraries.places.internal.zzbff zzx;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private com.google.android.libraries.places.internal.zzbea zzk = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzl = com.google.android.libraries.places.internal.zzbdq.zzbG();
    private com.google.android.libraries.places.internal.zzbea zzm = zzbG();
    private com.google.android.libraries.places.internal.zzbea zzn = zzbG();
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;

    static {
        com.google.android.libraries.places.internal.zzal zzalVar = new com.google.android.libraries.places.internal.zzal();
        zzw = zzalVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzal.class, zzalVar);
    }

    private zzal() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzw, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0004\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007\u001a\b\u001b\t\u001b\nင\u0006\u000bဂ\r\fင\u000b\rင\u0007\u000eင\b\u000fင\t\u0010င\n\u0011\u001b\u0012င\f", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzav.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", com.google.android.libraries.places.internal.zzau.class, "zzn", com.google.android.libraries.places.internal.zzau.class, "zzo", "zzv", "zzt", "zzp", "zzq", "zzr", "zzs", "zzk", com.google.android.libraries.places.internal.zzcp.class, "zzu"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzal();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzak(bArr);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzx;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzal.class) {
            zzbffVar = zzx;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzw);
                zzx = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
