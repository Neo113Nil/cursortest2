package p000;

/* JADX INFO: renamed from: ib */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0317ib extends C0427lb {

    /* JADX INFO: renamed from: g */
    public final char[] f3524g;

    public C0317ib(C0280hb c0280hb) {
        super(c0280hb, (Character) null);
        this.f3524g = new char[512];
        char[] cArr = c0280hb.f3143b;
        a90.m123g(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f3524g;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: b */
    public final int mo2583b(byte[] bArr, CharSequence charSequence) throws C0390kb {
        if (charSequence.length() % 2 == 1) {
            throw new C0390kb("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            C0280hb c0280hb = this.f4751a;
            bArr[i2] = (byte) ((c0280hb.m2248a(cCharAt) << 4) | c0280hb.m2248a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: e */
    public final void mo2584e(StringBuilder sb, byte[] bArr, int i) {
        a90.m130n(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.f3524g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // p000.C0427lb
    /* JADX INFO: renamed from: f */
    public final C0427lb mo2585f(C0280hb c0280hb, Character ch) {
        return new C0317ib(c0280hb);
    }
}
