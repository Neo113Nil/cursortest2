package com.google.android.recaptcha.internal;

import e1.k;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes.dex */
class zzhy extends zzhz {
    final zzhv zza;
    final Character zzb;

    public zzhy(zzhv zzhvVar, Character ch) {
        this.zza = zzhvVar;
        if (ch != null && zzhvVar.zzd('=')) {
            throw new IllegalArgumentException(zzha.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhy) {
            zzhy zzhyVar = (zzhy) obj;
            if (this.zza.equals(zzhyVar.zza) && Objects.equals(this.zzb, zzhyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzhv zzhvVar;
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzhx(k.d(zze.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < zze.length()) {
            long j = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                zzhvVar = this.zza;
                if (i9 >= zzhvVar.zzc) {
                    break;
                }
                j <<= zzhvVar.zzb;
                if (i7 + i9 < zze.length()) {
                    j |= this.zza.zzb(zze.charAt(i10 + i7));
                    i10++;
                }
                i9++;
            }
            int i11 = zzhvVar.zzd;
            int i12 = i10 * zzhvVar.zzb;
            int i13 = (i11 - 1) * 8;
            while (i13 >= (i11 * 8) - i12) {
                bArr[i8] = (byte) ((j >>> i13) & 255);
                i13 -= 8;
                i8++;
            }
            i7 += this.zza.zzc;
        }
        return i8;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzgx.zzd(0, i8, bArr.length);
        while (i9 < i8) {
            zzf(appendable, bArr, i9, Math.min(this.zza.zzd, i8 - i9));
            i9 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final int zzc(int i7) {
        return (int) (((this.zza.zzb * i7) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final int zzd(int i7) {
        zzhv zzhvVar = this.zza;
        return zzhvVar.zzc * zzib.zza(i7, zzhvVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzgx.zzd(i7, i7 + i8, bArr.length);
        int i9 = 0;
        zzgx.zza(i8 <= this.zza.zzd);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | (bArr[i7 + i10] & 255)) << 8;
        }
        int i11 = (i8 + 1) * 8;
        zzhv zzhvVar = this.zza;
        while (i9 < i8 * 8) {
            long j3 = j >>> ((i11 - zzhvVar.zzb) - i9);
            zzhv zzhvVar2 = this.zza;
            appendable.append(zzhvVar2.zza(((int) j3) & zzhvVar2.zza));
            i9 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i9 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i9 += this.zza.zzb;
            }
        }
    }

    public zzhy(String str, String str2, Character ch) {
        this(new zzhv(str, str2.toCharArray()), ch);
    }
}
