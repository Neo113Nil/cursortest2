package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzaip implements Serializable, Iterable<Byte> {
    public static final zzaip zza = new zzaiw(zzakb.zzb);
    private static final zzais zzb = new zzaiz();
    private int zzc = 0;

    static {
        new zzair();
    }

    public static /* synthetic */ int zza(byte b7) {
        return b7 & 255;
    }

    public static zzaip zzb(byte[] bArr) {
        return new zzaiw(bArr);
    }

    public static zzaiu zzc(int i7) {
        return new zzaiu(i7);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzb = this.zzc;
        if (iZzb == 0) {
            int iZzb2 = zzb();
            iZzb = zzb(iZzb2, 0, iZzb2);
            if (iZzb == 0) {
                iZzb = 1;
            }
            this.zzc = iZzb;
        }
        return iZzb;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzaio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzb = zzb();
        String strZza = zzb() <= 50 ? zzamh.zza(this) : k.e(zzamh.zza(zza(0, 47)), "...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzb);
        sb.append(" contents=\"");
        return k.i(sb, strZza, "\">");
    }

    public abstract byte zza(int i7);

    public abstract zzaip zza(int i7, int i8);

    public abstract void zza(zzaim zzaimVar);

    public abstract void zza(byte[] bArr, int i7, int i8, int i9);

    public abstract byte zzb(int i7);

    public abstract int zzb();

    public abstract int zzb(int i7, int i8, int i9);

    public abstract zzajb zzc();

    public final byte[] zzd() {
        int iZzb = zzb();
        if (iZzb == 0) {
            return zzakb.zzb;
        }
        byte[] bArr = new byte[iZzb];
        zza(bArr, 0, 0, iZzb);
        return bArr;
    }

    public static int zza(int i7, int i8, int i9) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzaip zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzaip zza(byte[] bArr, int i7, int i8) {
        zza(i7, i7 + i8, bArr.length);
        return new zzaiw(zzb.zza(bArr, i7, i8));
    }

    public static zzaip zza(String str) {
        return new zzaiw(str.getBytes(zzakb.zza));
    }
}
