package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjj extends zzir {
    private static final Logger zzb = Logger.getLogger(zzjj.class.getName());
    private static final boolean zzc = zzmv.zzx();
    zzjk zza;

    private zzjj() {
    }

    public static int zzA(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzB(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static zzjj zzC(byte[] bArr) {
        return new zzjg(bArr, 0, bArr.length);
    }

    public static int zzt(zzjb zzjbVar) {
        int zzd = zzjbVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i7, zzlj zzljVar, zzlu zzluVar) {
        int zzA = zzA(i7 << 3);
        int i8 = zzA + zzA;
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return i8 + zzbu;
    }

    public static int zzv(int i7) {
        if (i7 >= 0) {
            return zzA(i7);
        }
        return 10;
    }

    public static int zzw(zzkp zzkpVar) {
        int zza = zzkpVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzlj zzljVar, zzlu zzluVar) {
        zzil zzilVar = (zzil) zzljVar;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        return zzA(zzbu) + zzbu;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzna.zzc(str);
        } catch (zzmz unused) {
            length = str.getBytes(zzkk.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i7) {
        return zzA(i7 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzmz zzmzVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmzVar);
        byte[] bytes = str.getBytes(zzkk.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzjh(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b7);

    public abstract void zzd(int i7, boolean z4);

    public abstract void zze(int i7, zzjb zzjbVar);

    public abstract void zzf(int i7, int i8);

    public abstract void zzg(int i7);

    public abstract void zzh(int i7, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i7, int i8);

    public abstract void zzk(int i7);

    public abstract void zzl(byte[] bArr, int i7, int i8);

    public abstract void zzm(int i7, String str);

    public abstract void zzo(int i7, int i8);

    public abstract void zzp(int i7, int i8);

    public abstract void zzq(int i7);

    public abstract void zzr(int i7, long j);

    public abstract void zzs(long j);

    public /* synthetic */ zzjj(zzji zzjiVar) {
    }
}
