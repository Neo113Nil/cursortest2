package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zziem {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zziem() {
    }

    /* synthetic */ zziem(byte[] bArr) {
    }

    public static zziem zzH(InputStream inputStream, int i) {
        return inputStream == null ? zzI(zzifz.zza, 0, 0, false) : new zziel(inputStream, 4096, null);
    }

    static zziem zzI(byte[] bArr, int i, int i2, boolean z) {
        zziek zziekVar = new zziek(bArr, i, i2, z, null);
        try {
            zziekVar.zzB(i2);
            return zziekVar;
        } catch (zzige e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zzM(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long zzN(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int zzO(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
                throw new zzige("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new zzige("CodedInputStream encountered a malformed varint.");
    }

    public abstract int zzB(int i) throws zzige;

    public abstract void zzC(int i);

    public abstract boolean zzD() throws IOException;

    public abstract int zzE();

    public final void zzJ() throws zzige {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzige("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzK() throws zzige {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzL() throws IOException {
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

    public abstract int zza() throws IOException;

    public abstract void zzb(int i) throws zzige;

    public abstract boolean zzc(int i) throws IOException;

    public abstract double zzd() throws IOException;

    public abstract float zze() throws IOException;

    public abstract long zzf() throws IOException;

    public abstract long zzg() throws IOException;

    public abstract int zzh() throws IOException;

    public abstract long zzi() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract boolean zzk() throws IOException;

    public abstract String zzl() throws IOException;

    public abstract String zzm() throws IOException;

    public abstract zziei zzn() throws IOException;

    public abstract int zzo() throws IOException;

    public abstract int zzp() throws IOException;

    public abstract int zzq() throws IOException;

    public abstract long zzr() throws IOException;

    public abstract int zzs() throws IOException;

    public abstract long zzt() throws IOException;
}
