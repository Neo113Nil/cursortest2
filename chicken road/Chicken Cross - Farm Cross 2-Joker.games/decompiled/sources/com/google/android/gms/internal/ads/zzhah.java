package com.google.android.gms.internal.ads;

import com.ironsource.C4761z5;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzhah {
    private static final zzhah zza;
    private static final zzhah zzb;
    private static final zzhah zzc;

    static {
        Character valueOf = Character.valueOf(C4761z5.U);
        zza = new zzhae("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzhae("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzhag("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzhag("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzc = new zzhad("base16()", "0123456789ABCDEF");
    }

    zzhah() {
    }

    public static zzhah zzl() {
        return zza;
    }

    public static zzhah zzm() {
        return zzb;
    }

    public static zzhah zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf;

    abstract int zzd(int i);

    abstract int zzf(int i);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzhah zzh();

    public abstract zzhah zzi();

    public final String zzj(byte[] bArr, int i, int i2) {
        zzguk.zzo(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zza(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence zzg = zzg(charSequence);
            int zzf = zzf(zzg.length());
            byte[] bArr = new byte[zzf];
            int zzb2 = zzb(bArr, zzg);
            if (zzb2 == zzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[zzb2];
            System.arraycopy(bArr, 0, bArr2, 0, zzb2);
            return bArr2;
        } catch (zzhaf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
