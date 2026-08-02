package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzapv extends com.google.android.libraries.places.internal.zzbdq implements com.google.android.libraries.places.internal.zzbey {
    private static final com.google.android.libraries.places.internal.zzapv zzB;
    private static volatile com.google.android.libraries.places.internal.zzbff zzC;
    private int zzb;
    private int zze;
    private com.google.android.libraries.places.internal.zzamo zzh;
    private com.google.android.libraries.places.internal.zzaqm zzi;
    private com.google.android.libraries.places.internal.zzaor zzj;
    private com.google.android.libraries.places.internal.zzanl zzk;
    private com.google.android.libraries.places.internal.zzaop zzl;
    private com.google.android.libraries.places.internal.zzann zzm;
    private com.google.android.libraries.places.internal.zzaon zzn;
    private com.google.android.libraries.places.internal.zzaqo zzo;
    private com.google.android.libraries.places.internal.zzaqo zzp;
    private com.google.android.libraries.places.internal.zzaot zzq;
    private com.google.android.libraries.places.internal.zzaob zzr;
    private com.google.android.libraries.places.internal.zzapx zzs;
    private com.google.android.libraries.places.internal.zzapz zzt;
    private com.google.android.libraries.places.internal.zzapk zzu;
    private com.google.android.libraries.places.internal.zzaoy zzv;
    private com.google.android.libraries.places.internal.zzaqb zzw;
    private com.google.android.libraries.places.internal.zzaqg zzx;
    private com.google.android.libraries.places.internal.zzaqj zzy;
    private com.google.android.libraries.places.internal.zzaop zzz;
    private byte zzA = 2;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.libraries.places.internal.zzapv zzapvVar = new com.google.android.libraries.places.internal.zzapv();
        zzB = zzapvVar;
        com.google.android.libraries.places.internal.zzbdq.zzbz(com.google.android.libraries.places.internal.zzapv.class, zzapvVar);
    }

    private zzapv() {
    }

    public static com.google.android.libraries.places.internal.zzapt zza() {
        return (com.google.android.libraries.places.internal.zzapt) zzB.zzbv();
    }

    final /* synthetic */ void zzc(java.lang.String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zze(com.google.android.libraries.places.internal.zzaop zzaopVar) {
        this.zzl = zzaopVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(com.google.android.libraries.places.internal.zzann zzannVar) {
        this.zzm = zzannVar;
        this.zzb |= 256;
    }

    final /* synthetic */ void zzg(com.google.android.libraries.places.internal.zzaqg zzaqgVar) {
        this.zzx = zzaqgVar;
        this.zzb |= 524288;
    }

    final /* synthetic */ void zzh(com.google.android.libraries.places.internal.zzaqj zzaqjVar) {
        this.zzy = zzaqjVar;
        this.zzb |= 1048576;
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzaop zzaopVar) {
        this.zzz = zzaopVar;
        this.zzb |= 2097152;
    }

    @Override // com.google.android.libraries.places.internal.zzbdq
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.libraries.places.internal.zzbff zzbffVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return zzbA(zzB, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new java.lang.Object[]{"zzb", "zze", com.google.android.libraries.places.internal.zzapu.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new com.google.android.libraries.places.internal.zzapv();
        }
        byte[] bArr = null;
        if (i2 == 4) {
            return new com.google.android.libraries.places.internal.zzapt(bArr);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            this.zzA = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        com.google.android.libraries.places.internal.zzbff zzbffVar2 = zzC;
        if (zzbffVar2 != null) {
            return zzbffVar2;
        }
        synchronized (com.google.android.libraries.places.internal.zzapv.class) {
            zzbffVar = zzC;
            if (zzbffVar == null) {
                zzbffVar = new com.google.android.libraries.places.internal.zzbdl(zzB);
                zzC = zzbffVar;
            }
        }
        return zzbffVar;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
