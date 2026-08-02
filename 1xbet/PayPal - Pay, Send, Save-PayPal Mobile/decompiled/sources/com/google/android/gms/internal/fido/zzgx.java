package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzgx implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    private static final java.util.Comparator zza;
    public static final com.google.android.gms.internal.fido.zzgx zzb = new com.google.android.gms.internal.fido.zzgu(com.google.android.gms.internal.fido.zzhc.zzd);
    private static final com.google.android.gms.internal.fido.zzgw zzd;
    private int zzc = 0;

    static {
        int i = com.google.android.gms.internal.fido.zzgn.zza;
        zzd = new com.google.android.gms.internal.fido.zzgw(null);
        zza = new com.google.android.gms.internal.fido.zzgp();
    }

    public static com.google.android.gms.internal.fido.zzgx zzl(byte[] bArr, int i, int i2) {
        zzj(0, i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new com.google.android.gms.internal.fido.zzgu(bArr2);
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(zzd()), zzd() <= 50 ? com.google.android.gms.internal.fido.zzhe.zza(this) : com.google.android.gms.internal.fido.zzhe.zza(zzg(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.fido.zzgx zzg(int i, int i2);

    public abstract java.io.InputStream zzh();

    public abstract java.nio.ByteBuffer zzi();

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return com.google.android.gms.internal.fido.zzhc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    protected final int zzk() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.fido.zzgo(this);
    }

    zzgx() {
    }
}
