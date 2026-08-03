package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzlg implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.measurement.zzlg zzb = new com.google.android.gms.internal.measurement.zzlf(com.google.android.gms.internal.measurement.zzmo.zzb);
    private int zza = 0;

    static {
        int i = com.google.android.gms.internal.measurement.zzku.zza;
    }

    zzlg() {
    }

    public static com.google.android.gms.internal.measurement.zzlg zzh(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.measurement.zzlf(bArr2);
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc = zzc();
            i = zzg(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzkz(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? com.google.android.gms.internal.measurement.zzof.zza(this) : com.google.android.gms.internal.measurement.zzof.zza(zze(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    public abstract com.google.android.gms.internal.measurement.zzlg zze(int i, int i2);

    abstract void zzf(com.google.android.gms.internal.measurement.zzky zzkyVar) throws java.io.IOException;

    protected abstract int zzg(int i, int i2, int i3);

    protected final int zzi() {
        return this.zza;
    }

    static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 44 + java.lang.String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15 + java.lang.String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }
}
