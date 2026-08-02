package F3;

/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f2736d;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f2736d = new char[512];
        char[] cArr = aVar.f2729b;
        p3.f.e(cArr.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.f2736d;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | 256] = cArr[i7 & 15];
        }
    }

    @Override // F3.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
            a aVar = this.f2738a;
            bArr[i8] = (byte) ((aVar.a(charAt) << 4) | aVar.a(charSequence.charAt(i7 + 1)));
            i7 += 2;
            i8++;
        }
        return i8;
    }

    @Override // F3.e
    public final void e(StringBuilder sb, byte[] bArr, int i7) {
        p3.f.o(0, i7, bArr.length);
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = bArr[i8] & 255;
            char[] cArr = this.f2736d;
            sb.append(cArr[i9]);
            sb.append(cArr[i9 | 256]);
        }
    }
}
