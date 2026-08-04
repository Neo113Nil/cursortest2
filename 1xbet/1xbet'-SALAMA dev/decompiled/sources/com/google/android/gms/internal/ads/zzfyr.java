package com.google.android.gms.internal.ads;

import java.io.IOException;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfyr extends zzfyt {
    private zzfyr(zzfyp zzfypVar, Character ch) {
        super(zzfypVar, ch);
        zzfth.zze(zzfypVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt, com.google.android.gms.internal.ads.zzfyu
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzfys {
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzfys(k.d(charSequenceZzg.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequenceZzg.length()) {
            int i9 = i8 + 1;
            int iZzb = (this.zzb.zzb(charSequenceZzg.charAt(i7)) << 18) | (this.zzb.zzb(charSequenceZzg.charAt(i7 + 1)) << 12);
            bArr[i8] = (byte) (iZzb >>> 16);
            int i10 = i7 + 2;
            if (i10 < charSequenceZzg.length()) {
                int i11 = i7 + 3;
                int iZzb2 = iZzb | (this.zzb.zzb(charSequenceZzg.charAt(i10)) << 6);
                int i12 = i8 + 2;
                bArr[i9] = (byte) ((iZzb2 >>> 8) & 255);
                if (i11 < charSequenceZzg.length()) {
                    i7 += 4;
                    i8 += 3;
                    bArr[i12] = (byte) ((iZzb2 | this.zzb.zzb(charSequenceZzg.charAt(i11))) & 255);
                } else {
                    i8 = i12;
                    i7 = i11;
                }
            } else {
                i7 = i10;
                i8 = i9;
            }
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzfyt
    public final zzfyu zzb(zzfyp zzfypVar, Character ch) {
        return new zzfyr(zzfypVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfyt, com.google.android.gms.internal.ads.zzfyu
    public final void zzc(Appendable appendable, byte[] bArr, int i7, int i8) throws IOException {
        int i9 = 0;
        zzfth.zzk(0, i8, bArr.length);
        for (int i10 = i8; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i9] & 255;
            int i12 = ((bArr[i9 + 1] & 255) << 8) | (i11 << 16) | (bArr[i9 + 2] & 255);
            appendable.append(this.zzb.zza(i12 >>> 18));
            appendable.append(this.zzb.zza((i12 >>> 12) & 63));
            appendable.append(this.zzb.zza((i12 >>> 6) & 63));
            appendable.append(this.zzb.zza(i12 & 63));
            i9 += 3;
        }
        if (i9 < i8) {
            zzh(appendable, bArr, i9, i8 - i9);
        }
    }

    public zzfyr(String str, String str2, Character ch) {
        this(new zzfyp(str, str2.toCharArray()), ch);
    }
}
