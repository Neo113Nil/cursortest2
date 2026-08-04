package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
class zzfyt extends zzfyu {
    private volatile zzfyu zza;
    final zzfyp zzb;
    final Character zzc;

    public zzfyt(zzfyp zzfypVar, Character ch) {
        this.zzb = zzfypVar;
        boolean z4 = true;
        if (ch != null && zzfypVar.zze('=')) {
            z4 = false;
        }
        zzfth.zzi(z4, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyt) {
            zzfyt zzfytVar = (zzfyt) obj;
            if (this.zzb.equals(zzfytVar.zzb) && Objects.equals(this.zzc, zzfytVar.zzc)) {
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
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public int zza(byte[] bArr, CharSequence charSequence) throws zzfys {
        zzfyp zzfypVar;
        CharSequence charSequenceZzg = zzg(charSequence);
        if (!this.zzb.zzd(charSequenceZzg.length())) {
            throw new zzfys(k.d(charSequenceZzg.length(), "Invalid input length "));
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequenceZzg.length()) {
            long jZzb = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                zzfypVar = this.zzb;
                if (i9 >= zzfypVar.zzc) {
                    break;
                }
                jZzb <<= zzfypVar.zzb;
                if (i7 + i9 < charSequenceZzg.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZzg.charAt(i10 + i7));
                    i10++;
                }
                i9++;
            }
            int i11 = zzfypVar.zzd;
            int i12 = i10 * zzfypVar.zzb;
            int i13 = (i11 - 1) * 8;
            while (i13 >= (i11 * 8) - i12) {
                bArr[i8] = (byte) ((jZzb >>> i13) & 255);
                i13 -= 8;
                i8++;
            }
            i7 += this.zzb.zzc;
        }
        return i8;
    }

    public zzfyu zzb(zzfyp zzfypVar, Character ch) {
        return new zzfyt(zzfypVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public void zzc(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzfth.zzk(0, i8, bArr.length);
        while (i9 < i8) {
            zzh(appendable, bArr, i9, Math.min(this.zzb.zzd, i8 - i9));
            i9 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zzd(int i7) {
        return (int) (((((long) this.zzb.zzb) * ((long) i7)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final int zze(int i7) {
        zzfyp zzfypVar = this.zzb;
        return zzfypVar.zzc * zzfzd.zzb(i7, zzfypVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final zzfyu zzf() {
        zzfyu zzfyuVarZzb = this.zza;
        if (zzfyuVarZzb == null) {
            zzfyp zzfypVar = this.zzb;
            zzfyp zzfypVarZzc = zzfypVar.zzc();
            zzfyuVarZzb = zzfypVarZzc == zzfypVar ? this : zzb(zzfypVarZzc, this.zzc);
            this.zza = zzfyuVarZzb;
        }
        return zzfyuVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyu
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
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

    public final void zzh(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzfth.zzk(i7, i7 + i8, bArr.length);
        int i9 = 0;
        zzfth.zze(i8 <= this.zzb.zzd);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | ((long) (bArr[i7 + i10] & 255))) << 8;
        }
        int i11 = (i8 + 1) * 8;
        zzfyp zzfypVar = this.zzb;
        while (i9 < i8 * 8) {
            long j3 = j >>> ((i11 - zzfypVar.zzb) - i9);
            zzfyp zzfypVar2 = this.zzb;
            appendable.append(zzfypVar2.zza(((int) j3) & zzfypVar2.zza));
            i9 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i9 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i9 += this.zzb.zzb;
            }
        }
    }

    public zzfyt(String str, String str2, Character ch) {
        this(new zzfyp(str, str2.toCharArray()), ch);
    }
}
