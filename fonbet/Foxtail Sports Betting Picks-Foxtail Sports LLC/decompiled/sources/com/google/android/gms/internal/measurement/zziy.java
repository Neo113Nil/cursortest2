package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class zziy implements Serializable, Iterable<Byte> {
    public static final zziy zza = new zzjf(zzkj.zzb);
    private static final zzjb zzb = new zzji();
    private int zzc = 0;

    static /* synthetic */ int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract byte zza(int i);

    public abstract zziy zza(int i, int i2);

    abstract void zza(zziv zzivVar) throws IOException;

    abstract byte zzb(int i);

    public abstract int zzb();

    protected abstract int zzb(int i, int i2, int i3);

    static int zza(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzb2 = zzb();
            i = zzb(zzb2, 0, zzb2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    protected final int zza() {
        return this.zzc;
    }

    static zzjd zzc(int i) {
        return new zzjd(i);
    }

    public static zziy zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zziy zza(byte[] bArr, int i, int i2) {
        zza(i, i + i2, bArr.length);
        return new zzjf(zzb.zza(bArr, i, i2));
    }

    public static zziy zza(String str) {
        return new zzjf(str.getBytes(zzkj.zza));
    }

    static zziy zzb(byte[] bArr) {
        return new zzjf(bArr);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(zzb());
        if (zzb() <= 50) {
            str = zzmq.zza(this);
        } else {
            str = zzmq.zza(zza(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzix(this);
    }

    static {
        new zzja();
    }

    zziy() {
    }
}
