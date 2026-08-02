package com.google.android.gms.internal.measurement;

import W5.AbstractC0486a1;
import e1.k;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zzjb implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzjb zzb = new zziy(zzkk.zzd);
    private static final zzja zzd;
    private int zzc = 0;

    static {
        int i7 = zzin.zza;
        zzd = new zzja(null);
        zza = new zzit();
    }

    public static int zzj(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.f(i7, "Beginning index: ", " < 0"));
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC0486a1.e(i8, i9, "End index: ", " >= "));
    }

    public static zzjb zzl(byte[] bArr, int i7, int i8) {
        zzj(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zziy(bArr2);
    }

    public static zzjb zzm(String str) {
        return new zziy(str.getBytes(zzkk.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zzc;
        if (i7 == 0) {
            int zzd2 = zzd();
            i7 = zze(zzd2, 0, zzd2);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zzc = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzis(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        String zza2 = zzd() <= 50 ? zzmj.zza(this) : zzmj.zza(zzf(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return k.i(sb, zza2, "\">");
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract int zze(int i7, int i8, int i9);

    public abstract zzjb zzf(int i7, int i8);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzir zzirVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
