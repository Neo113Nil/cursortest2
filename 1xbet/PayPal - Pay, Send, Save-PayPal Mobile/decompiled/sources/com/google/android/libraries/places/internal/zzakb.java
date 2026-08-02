package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzakb extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzakb zzx;
    private static volatile com.google.android.libraries.places.internal.zzbff zzy;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private com.google.android.libraries.places.internal.zzbdy zzj = zzbD();
    private int zzk;
    private com.google.android.libraries.places.internal.zzajh zzl;
    private com.google.android.libraries.places.internal.zzajx zzm;
    private com.google.android.libraries.places.internal.zzaii zzn;
    private com.google.android.libraries.places.internal.zzajr zzo;
    private com.google.android.libraries.places.internal.zzajn zzp;
    private com.google.android.libraries.places.internal.zzajt zzq;
    private com.google.android.libraries.places.internal.zzail zzr;
    private com.google.android.libraries.places.internal.zzaiq zzs;
    private com.google.android.libraries.places.internal.zzaki zzt;
    private com.google.android.libraries.places.internal.zzakp zzu;
    private com.google.android.libraries.places.internal.zzaiz zzv;
    private com.google.android.libraries.places.internal.zzaiv zzw;

    static {
        com.google.android.libraries.places.internal.zzakb zzakbVar = new com.google.android.libraries.places.internal.zzakb();
        zzx = zzakbVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzakb.class, zzakbVar);
    }

    private zzakb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new java.lang.Object[]{"zzb", "zzf", com.google.android.libraries.places.internal.zzajz.zza, "zzg", com.google.android.libraries.places.internal.zzaka.zza, "zzh", "zzl", "zzm", "zzn", "zzo", "zzi", "zzp", "zzq", "zzj", "zzk", "zzr", "zzs", "zzt", "zzu", "zze", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzakb();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzajy(bArr);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzy;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzakb.class) {
            zzbffVar = zzy;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzx);
                zzy = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
