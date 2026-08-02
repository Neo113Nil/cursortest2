package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbcl implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.libraries.places.internal.zzbcl zza = new com.google.android.libraries.places.internal.zzbck(com.google.android.libraries.places.internal.zzbeb.zzb);
    private int zzb = 0;

    static com.google.android.libraries.places.internal.zzbcl zzk(byte[] bArr, int i, int i2, boolean z) throws com.google.android.libraries.places.internal.zzbed {
        zzl(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.libraries.places.internal.zzbck(bArr2);
    }

    static /* synthetic */ boolean zzm(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzl(i, i4, bArr.length);
        zzl(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbcl)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzbcl zzbclVar = (com.google.android.libraries.places.internal.zzbcl) obj;
        int zzc = zzc();
        if (zzc != zzbclVar.zzc()) {
            return false;
        }
        if (zzc == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzbclVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzf(zzbclVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzc = zzc();
            i = zzg(zzc, 0, zzc);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.libraries.places.internal.zzbcf(this);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(zzc()), zzc() <= 50 ? com.google.android.libraries.places.internal.zzbfu.zza(this) : com.google.android.libraries.places.internal.zzbfu.zza(zzd(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzc();

    public abstract com.google.android.libraries.places.internal.zzbcl zzd(int i, int i2);

    abstract void zze(com.google.android.libraries.places.internal.zzbce zzbceVar) throws java.io.IOException;

    protected abstract boolean zzf(com.google.android.libraries.places.internal.zzbcl zzbclVar);

    protected abstract int zzg(int i, int i2, int i3);

    public abstract com.google.android.libraries.places.internal.zzbco zzh();

    static int zzl(int i, int i2, int i3) {
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

    zzbcl() {
    }
}
