package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzbq implements java.lang.Iterable, java.io.Serializable {
    private static final java.util.Comparator zza;
    public static final com.google.android.gms.internal.play_billing.zzbq zzb = new com.google.android.gms.internal.play_billing.zzbn(com.google.android.gms.internal.play_billing.zzda.zzd);
    private static final com.google.android.gms.internal.play_billing.zzbp zzd;
    private int zzc = 0;

    static {
        int i = com.google.android.gms.internal.play_billing.zzbb.zza;
        zzd = new com.google.android.gms.internal.play_billing.zzbp(null);
        zza = new com.google.android.gms.internal.play_billing.zzbh();
    }

    zzbq() {
    }

    public static com.google.android.gms.internal.play_billing.zzbq zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.play_billing.zzbn(bArr2);
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

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.play_billing.zzbg(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.google.android.gms.internal.play_billing.zzfd.zza(this) : com.google.android.gms.internal.play_billing.zzfd.zza(zzf(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.play_billing.zzbq zzf(int i, int i2);

    protected abstract java.lang.String zzg(java.nio.charset.Charset charset);

    abstract void zzh(com.google.android.gms.internal.play_billing.zzbf zzbfVar) throws java.io.IOException;

    public abstract boolean zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final java.lang.String zzm(java.nio.charset.Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
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
}
