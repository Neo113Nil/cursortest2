package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgze extends com.google.android.gms.internal.ads.zzgzg {
    private zzgze(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.Character ch) {
        super(zzgzcVar, ch);
        com.google.android.gms.internal.ads.zzgtj.zza(zzgzcVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.ads.zzgtj.zzo(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = bArr[i3] & 255;
            int i6 = bArr[i3 + 1] & 255;
            int i7 = bArr[i3 + 2] & 255;
            com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
            int i8 = (i6 << 8) | (i5 << 16) | i7;
            appendable.append(zzgzcVar.zza(i8 >>> 18));
            appendable.append(zzgzcVar.zza((i8 >>> 12) & 63));
            appendable.append(zzgzcVar.zza((i8 >>> 6) & 63));
            appendable.append(zzgzcVar.zza(i8 & 63));
            i3 += 3;
        }
        if (i3 < i2) {
            zze(appendable, bArr, i3, i2 - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzg, com.google.android.gms.internal.ads.zzgzh
    final int zzb(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzgzf {
        java.lang.CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
        if (!zzgzcVar.zzb(length)) {
            int length2 = zzg.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new com.google.android.gms.internal.ads.zzgzf(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < zzg.length()) {
            int i3 = i2 + 1;
            int zzc = (zzgzcVar.zzc(zzg.charAt(i + 1)) << 12) | (zzgzcVar.zzc(zzg.charAt(i)) << 18);
            bArr[i2] = (byte) (zzc >>> 16);
            int i4 = i + 2;
            if (i4 < zzg.length()) {
                int i5 = i + 3;
                int zzc2 = zzc | (zzgzcVar.zzc(zzg.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((zzc2 >>> 8) & 255);
                if (i5 < zzg.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((zzc2 | zzgzcVar.zzc(zzg.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    final com.google.android.gms.internal.ads.zzgzh zzc(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.zzgze(zzgzcVar, ch);
    }

    zzgze(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.zzgzc(str, str2.toCharArray()), ch);
    }
}
