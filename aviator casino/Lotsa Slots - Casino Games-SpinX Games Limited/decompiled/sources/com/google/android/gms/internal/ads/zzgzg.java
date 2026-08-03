package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzgzg extends com.google.android.gms.internal.ads.zzgzh {
    private volatile com.google.android.gms.internal.ads.zzgzh zza;
    final com.google.android.gms.internal.ads.zzgzc zzb;
    final java.lang.Character zzc;

    zzgzg(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.Character ch) {
        this.zzb = zzgzcVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzgzcVar.zze(com.ironsource.B5.U)) {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzgtj.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgzg) {
            com.google.android.gms.internal.ads.zzgzg zzgzgVar = (com.google.android.gms.internal.ads.zzgzg) obj;
            if (this.zzb.equals(zzgzgVar.zzb) && java.util.Objects.equals(this.zzc, zzgzgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Character ch = this.zzc;
        return java.util.Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
        sb.append(zzgzcVar);
        if (8 % zzgzcVar.zzb != 0) {
            java.lang.Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.ads.zzgtj.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, java.lang.Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    int zzb(byte[] bArr, java.lang.CharSequence charSequence) throws com.google.android.gms.internal.ads.zzgzf {
        int i;
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
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzg.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzgzcVar.zzc;
                if (i4 >= i) {
                    break;
                }
                j <<= zzgzcVar.zzb;
                if (i2 + i4 < zzg.length()) {
                    j |= zzgzcVar.zzc(zzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzgzcVar.zzd;
            int i7 = i5 * zzgzcVar.zzb;
            int i8 = (i6 - 1) * 8;
            while (i8 >= (i6 * 8) - i7) {
                bArr[i3] = (byte) ((j >>> i8) & 255);
                i8 -= 8;
                i3++;
            }
            i2 += i;
        }
        return i3;
    }

    com.google.android.gms.internal.ads.zzgzh zzc(com.google.android.gms.internal.ads.zzgzc zzgzcVar, java.lang.Character ch) {
        return new com.google.android.gms.internal.ads.zzgzg(zzgzcVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final int zzd(int i) {
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
        return zzgzcVar.zzc * com.google.android.gms.internal.ads.zzgzz.zzb(i, zzgzcVar.zzd, java.math.RoundingMode.CEILING);
    }

    final void zze(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgtj.zzo(i, i + i2, bArr.length);
        com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
        int i3 = zzgzcVar.zzd;
        int i4 = 0;
        com.google.android.gms.internal.ads.zzgtj.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzgzcVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzgzcVar.zza(zzgzcVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        java.lang.Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append(com.ironsource.B5.U);
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final int zzf(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final com.google.android.gms.internal.ads.zzgzh zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final com.google.android.gms.internal.ads.zzgzh zzi() {
        com.google.android.gms.internal.ads.zzgzh zzgzhVar = this.zza;
        if (zzgzhVar == null) {
            com.google.android.gms.internal.ads.zzgzc zzgzcVar = this.zzb;
            com.google.android.gms.internal.ads.zzgzc zzd = zzgzcVar.zzd();
            zzgzhVar = zzd == zzgzcVar ? this : zzc(zzd, this.zzc);
            this.zza = zzgzhVar;
        }
        return zzgzhVar;
    }

    zzgzg(java.lang.String str, java.lang.String str2, java.lang.Character ch) {
        this(new com.google.android.gms.internal.ads.zzgzc(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    final java.lang.CharSequence zzg(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.lang.Character ch = this.zzc;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }
}
