package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzfyu {
    private static final zzfyu zza;

    static {
        new zzfyr("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
        new zzfyr("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new zzfyt("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzfyt("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zza = new zzfyq("base16()", "0123456789ABCDEF");
    }

    public static zzfyu zzi() {
        return zza;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzc(Appendable appendable, byte[] bArr, int i7, int i8);

    public abstract int zzd(int i7);

    public abstract int zze(int i7);

    public abstract zzfyu zzf();

    public CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public final String zzj(byte[] bArr, int i7, int i8) {
        zzfth.zzk(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(zze(i8));
        try {
            zzc(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzd = zzd(zzg.length());
            byte[] bArr = new byte[zzd];
            int zza2 = zza(bArr, zzg);
            if (zza2 == zzd) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzfys e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
