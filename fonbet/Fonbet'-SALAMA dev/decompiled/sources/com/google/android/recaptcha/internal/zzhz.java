package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzhz {
    private static final zzhz zza = new zzhw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzhz zzb = new zzhw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        char[] cArr;
        new zzhy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzhy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzhv zzhvVar = new zzhv("base16()", "0123456789ABCDEF".toCharArray());
        new zzhy(zzhvVar, null);
        char[] cArr2 = new char[512];
        cArr = zzhvVar.zzf;
        zzgx.zza(cArr.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            cArr2[i7] = zzhvVar.zza(i7 >>> 4);
            cArr2[i7 | 256] = zzhvVar.zza(i7 & 15);
        }
    }

    public static zzhz zzg() {
        return zza;
    }

    public static zzhz zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i7, int i8);

    public abstract int zzc(int i7);

    public abstract int zzd(int i7);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i7, int i8) {
        zzgx.zzd(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i8));
        try {
            zzb(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzhx e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
