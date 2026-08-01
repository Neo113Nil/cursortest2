package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhad extends zzhag {
    final char[] zza;

    private zzhad(zzhac zzhacVar) {
        super(zzhacVar, null);
        this.zza = new char[512];
        zzguk.zza(zzhacVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzhacVar.zza(i >>> 4);
            this.zza[i | 256] = zzhacVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    final void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzguk.zzo(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i4]);
            appendable.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhag, com.google.android.gms.internal.ads.zzhah
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new zzhaf(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            zzhac zzhacVar = this.zzb;
            bArr[i2] = (byte) (zzhacVar.zzc(charSequence.charAt(i + 1)) | (zzhacVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhag
    final zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhad(zzhacVar);
    }

    zzhad(String str, String str2) {
        this(new zzhac("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
