package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Ov extends Qv {
    public Ov(Mv mv, Character ch) {
        super(mv, ch);
        AbstractC1400ot.W(mv.f10744b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final int a(byte[] bArr, CharSequence charSequence) {
        CharSequence e3 = e(charSequence);
        int length = e3.length();
        Mv mv = this.f11287a;
        if (!mv.f10749h[length % mv.f10747e]) {
            throw new Pv(AbstractC2107A.q("Invalid input length ", e3.length()));
        }
        int i = 0;
        int i5 = 0;
        while (i < e3.length()) {
            int i6 = i5 + 1;
            int a5 = (mv.a(e3.charAt(i + 1)) << 12) | (mv.a(e3.charAt(i)) << 18);
            bArr[i5] = (byte) (a5 >>> 16);
            int i7 = i + 2;
            if (i7 < e3.length()) {
                int i8 = i + 3;
                int a6 = a5 | (mv.a(e3.charAt(i7)) << 6);
                int i9 = i5 + 2;
                bArr[i6] = (byte) ((a6 >>> 8) & 255);
                if (i8 < e3.length()) {
                    i += 4;
                    i5 += 3;
                    bArr[i9] = (byte) ((a6 | mv.a(e3.charAt(i8))) & 255);
                } else {
                    i5 = i9;
                    i = i8;
                }
            } else {
                i = i7;
                i5 = i6;
            }
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final Qv b(Mv mv, Character ch) {
        return new Ov(mv, ch);
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i5 = 0;
        AbstractC1400ot.g0(0, i, bArr.length);
        for (int i6 = i; i6 >= 3; i6 -= 3) {
            int i7 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16) | (bArr[i5 + 2] & 255);
            Mv mv = this.f11287a;
            sb.append(mv.f10744b[i7 >>> 18]);
            char[] cArr = mv.f10744b;
            sb.append(cArr[(i7 >>> 12) & 63]);
            sb.append(cArr[(i7 >>> 6) & 63]);
            sb.append(cArr[i7 & 63]);
            i5 += 3;
        }
        if (i5 < i) {
            f(sb, bArr, i5, i - i5);
        }
    }

    public Ov(String str, String str2) {
        this(new Mv(str, str2.toCharArray()), (Character) '=');
    }
}
