package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgzh {
    private static final com.google.android.gms.internal.ads.zzgzh zza;
    private static final com.google.android.gms.internal.ads.zzgzh zzb;
    private static final com.google.android.gms.internal.ads.zzgzh zzc;

    static {
        java.lang.Character valueOf = java.lang.Character.valueOf(com.ironsource.B5.U);
        zza = new com.google.android.gms.internal.ads.zzgze("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new com.google.android.gms.internal.ads.zzgze("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new com.google.android.gms.internal.ads.zzgzg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new com.google.android.gms.internal.ads.zzgzg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzc = new com.google.android.gms.internal.ads.zzgzd("base16()", "0123456789ABCDEF");
    }

    zzgzh() {
    }

    public static com.google.android.gms.internal.ads.zzgzh zzl() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzgzh zzm() {
        return zzb;
    }

    public static com.google.android.gms.internal.ads.zzgzh zzn() {
        return zzc;
    }

    abstract void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException;

    abstract int zzb(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzgzf;

    abstract int zzd(int i);

    abstract int zzf(int i);

    java.lang.CharSequence zzg(java.lang.CharSequence charSequence) {
        throw null;
    }

    public abstract com.google.android.gms.internal.ads.zzgzh zzh();

    public abstract com.google.android.gms.internal.ads.zzgzh zzi();

    public final java.lang.String zzj(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.ads.zzgtj.zzo(0, i2, bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final byte[] zzk(java.lang.CharSequence charSequence) {
        try {
            java.lang.CharSequence zzg = zzg(charSequence);
            int zzf = zzf(zzg.length());
            byte[] bArr = new byte[zzf];
            int zzb2 = zzb(bArr, zzg);
            if (zzb2 == zzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[zzb2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, zzb2);
            return bArr2;
        } catch (com.google.android.gms.internal.ads.zzgzf e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
