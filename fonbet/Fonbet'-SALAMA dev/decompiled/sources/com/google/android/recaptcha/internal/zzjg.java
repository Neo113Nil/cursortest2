package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjg extends zzin {
    private static final Logger zzb = Logger.getLogger(zzjg.class.getName());
    private static final boolean zzc = zzni.zzx();
    zzjh zza;

    private zzjg() {
        throw null;
    }

    @Deprecated
    public static int zzt(int i7, zzlx zzlxVar, zzmk zzmkVar) {
        int zzx = zzx(i7 << 3);
        return ((zzig) zzlxVar).zza(zzmkVar) + zzx + zzx;
    }

    public static int zzu(zzlx zzlxVar) {
        int zzn = zzlxVar.zzn();
        return zzx(zzn) + zzn;
    }

    public static int zzv(zzlx zzlxVar, zzmk zzmkVar) {
        int zza = ((zzig) zzlxVar).zza(zzmkVar);
        return zzx(zza) + zza;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznl.zzc(str);
        } catch (zznk unused) {
            length = str.getBytes(zzla.zza).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int zzy(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzjg zzz(byte[] bArr, int i7, int i8) {
        return new zzjd(bArr, 0, i8);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzB(String str, zznk zznkVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznkVar);
        byte[] bytes = str.getBytes(zzla.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzje(e7);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b7);

    public abstract void zzd(int i7, boolean z4);

    public abstract void zze(int i7, zziv zzivVar);

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

    public /* synthetic */ zzjg(zzjf zzjfVar) {
    }
}
