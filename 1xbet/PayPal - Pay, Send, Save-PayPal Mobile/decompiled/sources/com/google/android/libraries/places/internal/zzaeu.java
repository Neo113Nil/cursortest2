package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaeu extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaeu zzu;
    private static volatile com.google.android.libraries.places.internal.zzbff zzv;
    private int zzb;
    private long zze;
    private com.google.android.libraries.places.internal.zzya zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        com.google.android.libraries.places.internal.zzaeu zzaeuVar = new com.google.android.libraries.places.internal.zzaeu();
        zzu = zzaeuVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaeu.class, zzaeuVar);
    }

    private zzaeu() {
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဇ\t\u000bင\n\fဂ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f", new java.lang.Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaeu();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaet(bArr);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            throw null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzv;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzaeu.class) {
            zzbffVar = zzv;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzu);
                zzv = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
