package F3;

/* loaded from: classes2.dex */
public final class c extends e {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    @Override // F3.e
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence f7 = f(charSequence);
        int length = f7.length();
        a aVar = this.f2738a;
        if (!aVar.f2735h[length % aVar.f2732e]) {
            throw new d("Invalid input length " + f7.length());
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < f7.length()) {
            int i9 = i7 + 2;
            int a2 = (aVar.a(f7.charAt(i7 + 1)) << 12) | (aVar.a(f7.charAt(i7)) << 18);
            int i10 = i8 + 1;
            bArr[i8] = (byte) (a2 >>> 16);
            if (i9 < f7.length()) {
                int i11 = i7 + 3;
                int a4 = a2 | (aVar.a(f7.charAt(i9)) << 6);
                int i12 = i8 + 2;
                bArr[i10] = (byte) ((a4 >>> 8) & 255);
                if (i11 < f7.length()) {
                    i7 += 4;
                    i8 += 3;
                    bArr[i12] = (byte) ((a4 | aVar.a(f7.charAt(i11))) & 255);
                } else {
                    i8 = i12;
                    i7 = i11;
                }
            } else {
                i8 = i10;
                i7 = i9;
            }
        }
        return i8;
    }

    @Override // F3.e
    public final void e(StringBuilder sb, byte[] bArr, int i7) {
        int i8 = 0;
        p3.f.o(0, i7, bArr.length);
        for (int i9 = i7; i9 >= 3; i9 -= 3) {
            int i10 = i8 + 2;
            int i11 = ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8] & 255) << 16);
            i8 += 3;
            int i12 = i11 | (bArr[i10] & 255);
            a aVar = this.f2738a;
            sb.append(aVar.f2729b[i12 >>> 18]);
            char[] cArr = aVar.f2729b;
            sb.append(cArr[(i12 >>> 12) & 63]);
            sb.append(cArr[(i12 >>> 6) & 63]);
            sb.append(cArr[i12 & 63]);
        }
        if (i8 < i7) {
            d(sb, bArr, i8, i7 - i8);
        }
    }

    public c(a aVar, Character ch) {
        super(aVar, ch);
        p3.f.e(aVar.f2729b.length == 64);
    }
}
