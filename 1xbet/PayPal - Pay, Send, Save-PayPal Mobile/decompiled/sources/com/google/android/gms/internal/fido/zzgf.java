package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzgf {
    private static final com.google.android.gms.internal.fido.zzgf zza = new com.google.android.gms.internal.fido.zzgd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final com.google.android.gms.internal.fido.zzgf zzb = new com.google.android.gms.internal.fido.zzgd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final com.google.android.gms.internal.fido.zzgf zzc = new com.google.android.gms.internal.fido.zzge("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final com.google.android.gms.internal.fido.zzgf zzd = new com.google.android.gms.internal.fido.zzge("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final com.google.android.gms.internal.fido.zzgf zze = new com.google.android.gms.internal.fido.zzgc("base16()", "0123456789ABCDEF");

    abstract void zzb(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract int zzc(int i);

    public abstract com.google.android.gms.internal.fido.zzgf zzd();

    public final java.lang.String zzg(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.fido.zzbm.zze(0, i2, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzc(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static com.google.android.gms.internal.fido.zzgf zzf() {
        return zze;
    }

    zzgf() {
    }
}
