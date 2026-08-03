package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public abstract class zzjc implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.drive.zzjc zznq = new com.google.android.gms.internal.drive.zzjm(com.google.android.gms.internal.drive.zzkm.zzsn);
    private static final com.google.android.gms.internal.drive.zzji zznr;
    private static final java.util.Comparator<com.google.android.gms.internal.drive.zzjc> zznt;
    private int zzns = 0;

    zzjc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract int size();

    protected abstract int zza(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.drive.zzjc zza(int i, int i2);

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.drive.zzjb zzjbVar) throws java.io.IOException;

    public abstract boolean zzbu();

    public abstract byte zzs(int i);

    abstract byte zzt(int i);

    public static com.google.android.gms.internal.drive.zzjc zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new com.google.android.gms.internal.drive.zzjm(zznr.zzc(bArr, i, i2));
    }

    public static com.google.android.gms.internal.drive.zzjc zzk(java.lang.String str) {
        return new com.google.android.gms.internal.drive.zzjm(str.getBytes(com.google.android.gms.internal.drive.zzkm.UTF_8));
    }

    public final java.lang.String zzbt() {
        return size() == 0 ? "" : zza(com.google.android.gms.internal.drive.zzkm.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzns;
        if (i == 0) {
            int size = size();
            i = zza(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzns = i;
        }
        return i;
    }

    static com.google.android.gms.internal.drive.zzjk zzu(int i) {
        return new com.google.android.gms.internal.drive.zzjk(i, null);
    }

    protected final int zzbv() {
        return this.zzns;
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.drive.zzjd(this);
    }

    static {
        com.google.android.gms.internal.drive.zzjd zzjdVar = null;
        zznr = com.google.android.gms.internal.drive.zzix.zzbr() ? new com.google.android.gms.internal.drive.zzjn(zzjdVar) : new com.google.android.gms.internal.drive.zzjg(zzjdVar);
        zznt = new com.google.android.gms.internal.drive.zzje();
    }
}
