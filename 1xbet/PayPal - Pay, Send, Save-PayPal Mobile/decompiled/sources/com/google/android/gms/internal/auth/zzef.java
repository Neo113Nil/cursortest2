package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzef implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza;
    public static final com.google.android.gms.internal.auth.zzef zzb = new com.google.android.gms.internal.auth.zzec(com.google.android.gms.internal.auth.zzfa.zzd);
    private static final com.google.android.gms.internal.auth.zzee zzd;
    private int zzc = 0;

    static {
        int i = com.google.android.gms.internal.auth.zzds.zza;
        zzd = new com.google.android.gms.internal.auth.zzee(null);
        zza = new com.google.android.gms.internal.auth.zzdx();
    }

    public static com.google.android.gms.internal.auth.zzef zzk(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.auth.zzec(bArr2);
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(zzd()), zzd() <= 50 ? com.google.android.gms.internal.auth.zzgx.zza(this) : com.google.android.gms.internal.auth.zzgx.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.auth.zzef zzf(int i, int i2);

    protected abstract java.lang.String zzg(java.nio.charset.Charset charset);

    public abstract boolean zzh();

    public final java.lang.String zzl(java.nio.charset.Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }

    static int zzi(int i, int i2, int i3) {
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

    protected final int zzj() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.auth.zzdw(this);
    }

    zzef() {
    }
}
