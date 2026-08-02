package B9;

/* loaded from: classes9.dex */
abstract class h extends j {
    final void e(int i11, StringBuilder sb2) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        f(sb2, i11, length);
    }

    final void f(StringBuilder sb2, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            int c11 = b().c((i13 * 10) + i11, 10);
            if (c11 / 100 == 0) {
                sb2.append('0');
            }
            if (c11 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(c11);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 13; i15++) {
            int charAt = sb2.charAt(i15 + i12) - '0';
            if ((i15 & 1) == 0) {
                charAt *= 3;
            }
            i14 += charAt;
        }
        int i16 = 10 - (i14 % 10);
        sb2.append(i16 != 10 ? i16 : 0);
    }
}
