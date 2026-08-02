package com.google.android.gms.internal.ads;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Nv extends Qv {

    /* renamed from: e, reason: collision with root package name */
    public final char[] f10869e;

    public Nv(Mv mv) {
        super(mv, (Character) null);
        this.f10869e = new char[512];
        char[] cArr = mv.f10744b;
        AbstractC1400ot.W(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f10869e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final int a(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new Pv(AbstractC2107A.q("Invalid input length ", charSequence.length()));
        }
        int i = 0;
        int i5 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            Mv mv = this.f11287a;
            bArr[i5] = (byte) ((mv.a(charAt) << 4) | mv.a(charSequence.charAt(i + 1)));
            i += 2;
            i5++;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final Qv b(Mv mv, Character ch) {
        return new Nv(mv);
    }

    @Override // com.google.android.gms.internal.ads.Qv
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        AbstractC1400ot.g0(0, i, bArr.length);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = bArr[i5] & 255;
            char[] cArr = this.f10869e;
            sb.append(cArr[i6]);
            sb.append(cArr[i6 | 256]);
        }
    }
}
