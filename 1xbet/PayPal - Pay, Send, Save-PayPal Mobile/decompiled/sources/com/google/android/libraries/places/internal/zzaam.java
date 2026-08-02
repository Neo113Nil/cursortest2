package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaam extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzaam zzv;
    private static volatile com.google.android.libraries.places.internal.zzbff zzw;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private com.google.android.libraries.places.internal.zzbcl zzo;
    private com.google.android.libraries.places.internal.zzbcl zzp;
    private com.google.android.libraries.places.internal.zzbcl zzq;
    private long zzr;
    private double zzs;
    private com.google.android.libraries.places.internal.zzbcl zzt;
    private com.google.android.libraries.places.internal.zzbcl zzu;

    static {
        com.google.android.libraries.places.internal.zzaam zzaamVar = new com.google.android.libraries.places.internal.zzaam();
        zzv = zzaamVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzaam.class, zzaamVar);
    }

    private zzaam() {
        com.google.android.libraries.places.internal.zzbcl zzbclVar = com.google.android.libraries.places.internal.zzbcl.zza;
        this.zzo = zzbclVar;
        this.zzp = zzbclVar;
        this.zzq = zzbclVar;
        this.zzt = zzbclVar;
        this.zzu = zzbclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzbA(zzv, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003ဇ\u0004\u0004ဇ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tင\t\nည\n\u000bည\u000b\fည\f\rဂ\r\u000eက\u000e\u000fည\u000f\u0010ည\u0010\u0011᠌\u0000\u0012ဂ\u0001", new java.lang.Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", com.google.android.libraries.places.internal.zzaax.zza, "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzaam();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzaal(bArr);
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
        synchronized (com.google.android.libraries.places.internal.zzaam.class) {
            zzbffVar = zzw;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzv);
                zzw = zzbffVar;
            }
        }
        return zzbffVar;
    }
}
