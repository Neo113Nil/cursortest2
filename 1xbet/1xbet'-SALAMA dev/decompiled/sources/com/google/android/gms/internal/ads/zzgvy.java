package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgvy implements Iterable<Byte>, Serializable {
    public static final zzgvy zzb = new zzgvv(zzgxt.zzb);
    private int zza = 0;

    static {
        int i7 = zzgvl.zza;
    }

    private static zzgvy zzc(Iterator it, int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "length (", ") must be >= 1"));
        }
        if (i7 == 1) {
            return (zzgvy) it.next();
        }
        int i8 = i7 >>> 1;
        zzgvy zzgvyVarZzc = zzc(it, i8);
        zzgvy zzgvyVarZzc2 = zzc(it, i7 - i8);
        if (f.API_PRIORITY_OTHER - zzgvyVarZzc.zzd() >= zzgvyVarZzc2.zzd()) {
            return zzgzj.zzC(zzgvyVarZzc, zzgvyVarZzc2);
        }
        throw new IllegalArgumentException(AbstractC0486a1.e(zzgvyVarZzc.zzd(), zzgvyVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzq(int i7, int i8, int i9) {
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

    public static zzgvw zzt() {
        return new zzgvw(128);
    }

    public static zzgvy zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgvy zzv(byte[] bArr, int i7, int i8) {
        zzq(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zzgvv(bArr2);
    }

    public static zzgvy zzw(String str) {
        return new zzgvv(str.getBytes(zzgxt.zza));
    }

    public static void zzy(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(k.d(i7, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strZza = zzd() <= 50 ? zzgzu.zza(this) : zzgzu.zza(zzk(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzd);
        sb.append(" contents=\"");
        return k.i(sb, strZza, "\">");
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgxt.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i7);

    public abstract byte zzb(int i7);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i7, int i8, int i9);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i7, int i8, int i9);

    public abstract int zzj(int i7, int i8, int i9);

    public abstract zzgvy zzk(int i7, int i8);

    public abstract zzgwe zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgvp zzgvpVar);

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgvt iterator() {
        return new zzgvq(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgxt.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i7, int i8, int i9) {
        zzq(0, i9, zzd());
        zzq(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            zze(bArr, 0, i8, i9);
        }
    }
}
