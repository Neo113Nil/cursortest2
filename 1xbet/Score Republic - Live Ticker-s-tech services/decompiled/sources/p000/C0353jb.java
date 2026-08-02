package p000;

/* JADX INFO: renamed from: jb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0353jb extends C0427lb {
    public C0353jb(String str, String str2) {
        this(new C0280hb(str, str2.toCharArray()), (Character) '=');
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: b */
    public final int mo2583b(byte[] bArr, CharSequence charSequence) throws C0390kb {
        CharSequence charSequenceM3199g = m3199g(charSequence);
        int length = charSequenceM3199g.length();
        C0280hb c0280hb = this.f4751a;
        if (!c0280hb.f3149h[length % c0280hb.f3146e]) {
            throw new C0390kb("Invalid input length " + charSequenceM3199g.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceM3199g.length()) {
            int i3 = i + 2;
            int iM2248a = (c0280hb.m2248a(charSequenceM3199g.charAt(i + 1)) << 12) | (c0280hb.m2248a(charSequenceM3199g.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (iM2248a >>> 16);
            if (i3 < charSequenceM3199g.length()) {
                int i5 = i + 3;
                int iM2248a2 = iM2248a | (c0280hb.m2248a(charSequenceM3199g.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((iM2248a2 >>> 8) & 255);
                if (i5 < charSequenceM3199g.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iM2248a2 | c0280hb.m2248a(charSequenceM3199g.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: e */
    public final void mo2584e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        a90.m130n(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            C0280hb c0280hb = this.f4751a;
            char[] cArr = c0280hb.f3143b;
            char[] cArr2 = c0280hb.f3143b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            m3198d(sb, bArr, i2, i - i2);
        }
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: f */
    public final C0427lb mo2585f(C0280hb c0280hb, Character ch) {
        return new C0353jb(c0280hb, ch);
    }

    public C0353jb(C0280hb c0280hb, Character ch) {
        super(c0280hb, ch);
        a90.m123g(c0280hb.f3143b.length == 64);
    }
}
