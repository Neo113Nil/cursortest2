package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class zzgwe {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zze = 0;
    int zzb;
    final int zzc = zza;
    zzgwf zzd;

    private zzgwe() {
    }

    public static int zzD(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static int zzE(int i7, InputStream inputStream) {
        if ((i7 & 128) == 0) {
            return i7;
        }
        int i8 = i7 & 127;
        int i9 = 7;
        while (i9 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i8 |= (read & 127) << i9;
            if ((read & 128) == 0) {
                return i8;
            }
            i9 += 7;
        }
        while (i9 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((read2 & 128) == 0) {
                return i8;
            }
            i9 += 7;
        }
        throw new zzgxv("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgwe zzG(InputStream inputStream, int i7) {
        if (inputStream != null) {
            return new zzgwb(inputStream, 4096, null);
        }
        byte[] bArr = zzgxt.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    public static zzgwe zzH(byte[] bArr, int i7, int i8, boolean z4) {
        zzgvz zzgvzVar = new zzgvz(bArr, i7, i8, z4, null);
        try {
            zzgvzVar.zzd(i8);
            return zzgvzVar;
        } catch (zzgxv e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract boolean zzA();

    public abstract boolean zzB();

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzc();

    public abstract int zzd(int i7);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzj();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzs();

    public abstract long zzt();

    public abstract long zzu();

    public abstract zzgvy zzv();

    public abstract String zzw();

    public abstract String zzx();

    public abstract void zzy(int i7);

    public abstract void zzz(int i7);

    public /* synthetic */ zzgwe(zzgwd zzgwdVar) {
    }
}
