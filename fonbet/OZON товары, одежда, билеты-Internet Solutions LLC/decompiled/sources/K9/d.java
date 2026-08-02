package K9;

/* loaded from: classes9.dex */
final class d {
    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z11) {
        int e11 = z11 ? bVar.e() : bVar.h();
        int h11 = z11 ? bVar.h() : bVar.e();
        byte[][] c11 = bVar.c();
        int i11 = 0;
        for (int i12 = 0; i12 < e11; i12++) {
            byte b11 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < h11; i14++) {
                byte b12 = z11 ? c11[i12][i14] : c11[i14][i12];
                if (b12 == b11) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += i13 - 2;
                    }
                    i13 = 1;
                    b11 = b12;
                }
            }
            if (i13 >= 5) {
                i11 = (i13 - 2) + i11;
            }
        }
        return i11;
    }
}
