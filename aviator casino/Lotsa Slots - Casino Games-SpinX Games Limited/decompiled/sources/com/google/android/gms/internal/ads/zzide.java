package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzide {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    java.lang.Object zzd;

    private zzide() {
    }

    /* synthetic */ zzide(byte[] bArr) {
    }

    public static com.google.android.gms.internal.ads.zzide zzH(java.io.InputStream inputStream, int i) {
        return inputStream == null ? zzI(com.google.android.gms.internal.ads.zzier.zza, 0, 0, false) : new com.google.android.gms.internal.ads.zzidd(inputStream, 4096, null);
    }

    static com.google.android.gms.internal.ads.zzide zzI(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.ads.zzidc zzidcVar = new com.google.android.gms.internal.ads.zzidc(bArr, i, i2, z, null);
        try {
            zzidcVar.zzB(i2);
            return zzidcVar;
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zzM(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzN(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zzO(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered a malformed varint.");
    }

    public abstract int zzB(int i) throws com.google.android.gms.internal.ads.zziet;

    public abstract void zzC(int i);

    public abstract boolean zzD() throws java.io.IOException;

    public abstract int zzE();

    public final void zzJ() throws com.google.android.gms.internal.ads.zziet {
        if (this.zza + this.zzb >= this.zzc) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzK() throws com.google.android.gms.internal.ads.zziet {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzL() throws java.io.IOException {
        int zza;
        do {
            zza = zza();
            if (zza == 0) {
                return;
            }
            zzJ();
            this.zzb++;
            this.zzb--;
        } while (zzc(zza));
    }

    public abstract int zza() throws java.io.IOException;

    public abstract void zzb(int i) throws com.google.android.gms.internal.ads.zziet;

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

    public abstract com.google.android.gms.internal.ads.zzida zzn() throws java.io.IOException;

    public abstract int zzo() throws java.io.IOException;

    public abstract int zzp() throws java.io.IOException;

    public abstract int zzq() throws java.io.IOException;

    public abstract long zzr() throws java.io.IOException;

    public abstract int zzs() throws java.io.IOException;

    public abstract long zzt() throws java.io.IOException;
}
