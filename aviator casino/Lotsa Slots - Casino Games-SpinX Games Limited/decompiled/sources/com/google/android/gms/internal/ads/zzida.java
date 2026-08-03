package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzida implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    public static final com.google.android.gms.internal.ads.zzida zza = new com.google.android.gms.internal.ads.zzicy(com.google.android.gms.internal.ads.zzier.zza);
    private int zzb = 0;

    static {
        int i = com.google.android.gms.internal.ads.zzicn.zza;
    }

    zzida() {
    }

    public static com.google.android.gms.internal.ads.zzicz zzC() {
        return new com.google.android.gms.internal.ads.zzicz(128);
    }

    static /* synthetic */ boolean zzE(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzD(i, i4, bArr.length);
        zzD(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static com.google.android.gms.internal.ads.zzida zzt(byte[] bArr, int i, int i2) {
        try {
            return zzu(bArr, i, i2, false);
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static com.google.android.gms.internal.ads.zzida zzu(byte[] bArr, int i, int i2, boolean z) throws com.google.android.gms.internal.ads.zziet {
        if (i2 == 0) {
            return zza;
        }
        zzD(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.ads.zzicy(bArr2);
    }

    static com.google.android.gms.internal.ads.zzida zzv(byte[] bArr) {
        try {
            return zzw(bArr, false);
        } catch (com.google.android.gms.internal.ads.zziet e) {
            throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    static com.google.android.gms.internal.ads.zzida zzw(byte[] bArr, boolean z) throws com.google.android.gms.internal.ads.zziet {
        return bArr.length == 0 ? zza : new com.google.android.gms.internal.ads.zzicy(bArr);
    }

    public static com.google.android.gms.internal.ads.zzida zzx(java.lang.String str) {
        return str.isEmpty() ? zza : new com.google.android.gms.internal.ads.zzicy(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public static com.google.android.gms.internal.ads.zzida zzy(java.lang.Iterable iterable) {
        int size;
        if (iterable instanceof java.util.Collection) {
            size = ((java.util.Collection) iterable).size();
        } else {
            java.util.Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zza : zzk(iterable.iterator(), size);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzida)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzida zzidaVar = (com.google.android.gms.internal.ads.zzida) obj;
        int zzb = zzb();
        if (zzb != zzidaVar.zzb()) {
            return false;
        }
        if (zzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzidaVar.zzb;
        if (i == 0 || i2 == 0 || i == i2) {
            return zzj(zzidaVar);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzb = zzb();
            i = zzl(zzb, 0, zzb);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzb());
        objArr[2] = zzb() <= 50 ? com.google.android.gms.internal.ads.zzigp.zza(zzA()) : com.google.android.gms.internal.ads.zzigp.zza(zzd(0, 47).zzA()).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int zzb = zzb();
        if (zzb == 0) {
            return com.google.android.gms.internal.ads.zzier.zza;
        }
        byte[] bArr = new byte[zzb];
        zze(bArr, 0, 0, zzb);
        return bArr;
    }

    public final java.lang.String zzB(java.nio.charset.Charset charset) {
        return zzs() ? "" : zzh(charset);
    }

    abstract byte zza(int i);

    public abstract int zzb();

    public abstract com.google.android.gms.internal.ads.zzida zzc(int i, int i2);

    public abstract com.google.android.gms.internal.ads.zzida zzd(int i, int i2);

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract java.nio.ByteBuffer zzf();

    abstract void zzg(com.google.android.gms.internal.ads.zzicr zzicrVar) throws java.io.IOException;

    protected abstract java.lang.String zzh(java.nio.charset.Charset charset);

    public abstract boolean zzi();

    protected abstract boolean zzj(com.google.android.gms.internal.ads.zzida zzidaVar);

    protected abstract int zzl(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.ads.zzide zzm();

    protected abstract int zzp();

    protected abstract boolean zzq();

    @Override // java.lang.Iterable
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.zzicv iterator() {
        return new com.google.android.gms.internal.ads.zzics(this);
    }

    public final boolean zzs() {
        return zzb() == 0;
    }

    @java.lang.Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzD(0, i3, zzb());
        zzD(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    private static com.google.android.gms.internal.ads.zzida zzk(java.util.Iterator it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, "length (%s) must be >= 1", java.lang.Integer.valueOf(i)));
        }
        if (i == 1) {
            return (com.google.android.gms.internal.ads.zzida) it.next();
        }
        int i2 = i >>> 1;
        com.google.android.gms.internal.ads.zzida zzk = zzk(it, i2);
        com.google.android.gms.internal.ads.zzida zzk2 = zzk(it, i - i2);
        if (Integer.MAX_VALUE - zzk.zzb() >= zzk2.zzb()) {
            return com.google.android.gms.internal.ads.zzigg.zzk(zzk, zzk2);
        }
        int zzb = zzk.zzb();
        int zzb2 = zzk2.zzb();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 31 + java.lang.String.valueOf(zzb2).length());
        sb.append("ByteString would be too long: ");
        sb.append(zzb);
        sb.append(org.slf4j.Marker.ANY_NON_NULL_MARKER);
        sb.append(zzb2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static int zzD(int i, int i2, int i3) {
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
