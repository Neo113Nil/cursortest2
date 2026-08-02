package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzhp implements java.lang.Comparable {
    private final com.google.android.gms.internal.fido.zzhp zzc(java.lang.Class cls) throws com.google.android.gms.internal.fido.zzho {
        if (cls.isInstance(this)) {
            return (com.google.android.gms.internal.fido.zzhp) cls.cast(this);
        }
        throw new com.google.android.gms.internal.fido.zzho("Expected a " + cls.getName() + " value, but got " + getClass().getName());
    }

    static int zzd(byte b) {
        return (b >> 5) & 7;
    }

    public static com.google.android.gms.internal.fido.zzhp zzk(java.io.InputStream inputStream) throws com.google.android.gms.internal.fido.zzhj {
        return com.google.android.gms.internal.fido.zzhq.zza(inputStream, new com.google.android.gms.internal.fido.zzhs(inputStream));
    }

    protected abstract int zza();

    protected int zzb() {
        return 0;
    }

    public final com.google.android.gms.internal.fido.zzhi zze() throws com.google.android.gms.internal.fido.zzho {
        return (com.google.android.gms.internal.fido.zzhi) zzc(com.google.android.gms.internal.fido.zzhi.class);
    }

    public final com.google.android.gms.internal.fido.zzhk zzf() throws com.google.android.gms.internal.fido.zzho {
        return (com.google.android.gms.internal.fido.zzhk) zzc(com.google.android.gms.internal.fido.zzhk.class);
    }

    public final com.google.android.gms.internal.fido.zzhm zzh() throws com.google.android.gms.internal.fido.zzho {
        return (com.google.android.gms.internal.fido.zzhm) zzc(com.google.android.gms.internal.fido.zzhm.class);
    }

    public static com.google.android.gms.internal.fido.zzhp zzj(byte... bArr) throws com.google.android.gms.internal.fido.zzhj {
        bArr.getClass();
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(java.util.Arrays.copyOf(bArr, bArr.length));
        return com.google.android.gms.internal.fido.zzhq.zza(byteArrayInputStream, new com.google.android.gms.internal.fido.zzhs(byteArrayInputStream));
    }

    public static com.google.android.gms.internal.fido.zzhn zzi(java.lang.String str) {
        return new com.google.android.gms.internal.fido.zzhn(str);
    }

    public static com.google.android.gms.internal.fido.zzhk zzg(long j) {
        return new com.google.android.gms.internal.fido.zzhk(j);
    }
}
