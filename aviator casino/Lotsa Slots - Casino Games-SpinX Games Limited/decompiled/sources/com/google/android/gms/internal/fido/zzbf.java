package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public abstract class zzbf {
    private static final com.google.android.gms.internal.fido.zzbf zza;
    private static final com.google.android.gms.internal.fido.zzbf zzb;
    private static final com.google.android.gms.internal.fido.zzbf zzc;
    private static final com.google.android.gms.internal.fido.zzbf zzd;
    private static final com.google.android.gms.internal.fido.zzbf zze;

    static {
        java.lang.Character valueOf = java.lang.Character.valueOf(com.ironsource.B5.U);
        zza = new com.google.android.gms.internal.fido.zzbd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new com.google.android.gms.internal.fido.zzbd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        zzc = new com.google.android.gms.internal.fido.zzbe("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        zzd = new com.google.android.gms.internal.fido.zzbe("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zze = new com.google.android.gms.internal.fido.zzbc("base16()", "0123456789ABCDEF");
    }

    zzbf() {
    }

    public static com.google.android.gms.internal.fido.zzbf zzd() {
        return zze;
    }

    abstract void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract int zzb(int i);

    public final java.lang.String zze(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.fido.zzam.zze(0, i2, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzb(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
