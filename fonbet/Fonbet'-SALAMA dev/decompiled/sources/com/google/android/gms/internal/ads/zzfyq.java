package com.google.android.gms.internal.ads;

import e1.k;

/* loaded from: classes.dex */
final class zzfyq extends zzfyt {
    final char[] zza;

    private zzfyq(zzfyp zzfypVar) {
        super(zzfypVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzfypVar.zzf;
        zzfth.zze(cArr.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = zzfypVar.zza(i7 >>> 4);
            this.zza[i7 | 256] = zzfypVar.zza(i7 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyt, com.google.android.gms.internal.ads.zzfyu
    public final int zza(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new zzfys(k.d(charSequence.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            bArr[i8] = (byte) ((this.zzb.zzb(charSequence.charAt(i7)) << 4) | this.zzb.zzb(charSequence.charAt(i7 + 1)));
            i7 += 2;
            i8++;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzfyt
    public final zzfyu zzb(zzfyp zzfypVar, Character ch) {
        return new zzfyq(zzfypVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt, com.google.android.gms.internal.ads.zzfyu
    public final void zzc(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzfth.zzk(0, i8, bArr.length);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i9] & 255;
            appendable.append(this.zza[i10]);
            appendable.append(this.zza[i10 | 256]);
        }
    }

    public zzfyq(String str, String str2) {
        this(new zzfyp("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
