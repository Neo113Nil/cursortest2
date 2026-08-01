package com.google.android.gms.internal.ads;

import com.ironsource.C4761z5;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
class zzhag extends zzhah {
    private volatile zzhah zza;
    final zzhac zzb;
    final Character zzc;

    zzhag(zzhac zzhacVar, Character ch) {
        this.zzb = zzhacVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            if (zzhacVar.zze(C4761z5.U)) {
                z = false;
            }
        }
        zzguk.zzf(z, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhag) {
            zzhag zzhagVar = (zzhag) obj;
            if (this.zzb.equals(zzhagVar.zzb) && Objects.equals(this.zzc, zzhagVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzhac zzhacVar = this.zzb;
        sb.append(zzhacVar);
        if (8 % zzhacVar.zzb != 0) {
            Character ch = this.zzc;
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

    @Override // com.google.android.gms.internal.ads.zzhah
    void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzguk.zzo(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.zzb.zzd;
            zze(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    int zzb(byte[] bArr, CharSequence charSequence) throws zzhaf {
        int i;
        CharSequence zzg = zzg(charSequence);
        int length = zzg.length();
        zzhac zzhacVar = this.zzb;
        if (!zzhacVar.zzb(length)) {
            int length2 = zzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzhaf(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < zzg.length()) {
            long j = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i = zzhacVar.zzc;
                if (i4 >= i) {
                    break;
                }
                j <<= zzhacVar.zzb;
                if (i2 + i4 < zzg.length()) {
                    j |= zzhacVar.zzc(zzg.charAt(i5 + i2));
                    i5++;
                }
                i4++;
            }
            int i6 = zzhacVar.zzd;
            int i7 = i5 * zzhacVar.zzb;
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

    zzhah zzc(zzhac zzhacVar, Character ch) {
        return new zzhag(zzhacVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final int zzd(int i) {
        zzhac zzhacVar = this.zzb;
        return zzhacVar.zzc * zzhaz.zzb(i, zzhacVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzguk.zzo(i, i + i2, bArr.length);
        zzhac zzhacVar = this.zzb;
        int i3 = zzhacVar.zzd;
        int i4 = 0;
        zzguk.zza(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | (bArr[i + i5] & 255)) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = zzhacVar.zzb;
        while (i4 < i2 * 8) {
            appendable.append(zzhacVar.zza(zzhacVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
            i4 += i7;
        }
        Character ch = this.zzc;
        if (ch != null) {
            while (i4 < i3 * 8) {
                ch.charValue();
                appendable.append(C4761z5.U);
                i4 += i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final int zzf(int i) {
        return (int) (((this.zzb.zzb * i) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final zzhah zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final zzhah zzi() {
        zzhah zzhahVar = this.zza;
        if (zzhahVar == null) {
            zzhac zzhacVar = this.zzb;
            zzhac zzd = zzhacVar.zzd();
            zzhahVar = zzd == zzhacVar ? this : zzc(zzd, this.zzc);
            this.zza = zzhahVar;
        }
        return zzhahVar;
    }

    zzhag(String str, String str2, Character ch) {
        this(new zzhac(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzc;
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
