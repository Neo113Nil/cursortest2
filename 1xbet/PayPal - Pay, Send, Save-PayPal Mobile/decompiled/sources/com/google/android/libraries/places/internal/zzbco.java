package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbco {
    public static final /* synthetic */ int zzf = 0;
    private static volatile int zzg = 100;
    int zza;
    int zzb;
    final int zzc = zzg;
    int zzd = Integer.MAX_VALUE;
    java.lang.Object zze;

    public static com.google.android.libraries.places.internal.zzbco zzF(java.io.InputStream inputStream, int i) {
        return new com.google.android.libraries.places.internal.zzbcn(inputStream, 4096, null);
    }

    public static com.google.android.libraries.places.internal.zzbco zzG(byte[] bArr, int i, int i2) {
        return zzH(bArr, 0, i2, false);
    }

    static com.google.android.libraries.places.internal.zzbco zzH(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.libraries.places.internal.zzbcm zzbcmVar = new com.google.android.libraries.places.internal.zzbcm(bArr, 0, i2, z, null);
        try {
            zzbcmVar.zzz(i2);
            return zzbcmVar;
        } catch (com.google.android.libraries.places.internal.zzbed e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zzM(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long zzN(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void zzA(int i);

    public abstract boolean zzB() throws java.io.IOException;

    public abstract int zzC();

    public final void zzI() throws com.google.android.libraries.places.internal.zzbed {
        if (this.zza + this.zzb >= this.zzc) {
            throw new com.google.android.libraries.places.internal.zzbed("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzJ() throws com.google.android.libraries.places.internal.zzbed {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzK() throws java.io.IOException {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            zzI();
            this.zzb++;
            this.zzb--;
        } while (zzc(zza));
    }

    public abstract int zza() throws java.io.IOException;

    public abstract void zzb(int i) throws com.google.android.libraries.places.internal.zzbed;

    public abstract boolean zzc(int i) throws java.io.IOException;

    public abstract double zzd() throws java.io.IOException;

    public abstract float zze() throws java.io.IOException;

    public abstract long zzf() throws java.io.IOException;

    public abstract long zzg() throws java.io.IOException;

    public abstract int zzh() throws java.io.IOException;

    public abstract long zzi() throws java.io.IOException;

    public abstract int zzj() throws java.io.IOException;

    public abstract boolean zzk() throws java.io.IOException;

    public abstract java.lang.String zzl() throws java.io.IOException;

    public abstract java.lang.String zzm() throws java.io.IOException;

    public abstract com.google.android.libraries.places.internal.zzbcl zzn() throws java.io.IOException;

    public abstract int zzo() throws java.io.IOException;

    public abstract int zzp() throws java.io.IOException;

    public abstract int zzq() throws java.io.IOException;

    public abstract long zzr() throws java.io.IOException;

    public abstract int zzs() throws java.io.IOException;

    public abstract long zzt() throws java.io.IOException;

    public abstract int zzz(int i) throws com.google.android.libraries.places.internal.zzbed;

    public final int zzL(int i) {
        int i2 = this.zzd;
        this.zzd = Integer.MAX_VALUE;
        return i2;
    }

    /* synthetic */ zzbco(byte[] bArr) {
    }

    private zzbco() {
    }
}
