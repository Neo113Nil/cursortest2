package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import e1.k;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class zziv implements Iterable, Serializable {
    public static final zziv zzb = new zziu(zzla.zzb);
    private int zza = 0;

    static {
        int i7 = zzij.zza;
    }

    public static int zzi(int i7, int i8, int i9) {
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

    public static zziv zzk(byte[] bArr, int i7, int i8) {
        zzi(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zziu(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i7 = this.zza;
        if (i7 == 0) {
            int zzd = zzd();
            i7 = zzf(zzd, 0, zzd);
            if (i7 == 0) {
                i7 = 1;
            }
            this.zza = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        String zza = zzd() <= 50 ? zzmw.zza(this) : zzmw.zza(zzg(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd);
        sb.append(" contents=\"");
        return k.i(sb, zza, "\">");
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i7, int i8, int i9);

    public abstract int zzf(int i7, int i8, int i9);

    public abstract zziv zzg(int i7, int i8);

    public abstract void zzh(zzin zzinVar);

    public final int zzj() {
        return this.zza;
    }

    public final byte[] zzl() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzla.zzb;
        }
        byte[] bArr = new byte[zzd];
        zze(bArr, 0, 0, zzd);
        return bArr;
    }
}
