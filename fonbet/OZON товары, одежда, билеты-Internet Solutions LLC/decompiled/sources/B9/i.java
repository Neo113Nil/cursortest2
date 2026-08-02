package B9;

/* loaded from: classes9.dex */
abstract class i extends h {
    protected abstract void g(int i11, StringBuilder sb2);

    protected abstract int h(int i11);

    final void i(StringBuilder sb2, int i11, int i12) {
        int c11 = b().c(i11, i12);
        g(c11, sb2);
        int h11 = h(c11);
        int i13 = 100000;
        for (int i14 = 0; i14 < 5; i14++) {
            if (h11 / i13 == 0) {
                sb2.append('0');
            }
            i13 /= 10;
        }
        sb2.append(h11);
    }
}
