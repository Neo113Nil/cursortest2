package B9;

/* loaded from: classes9.dex */
final class d extends h {
    @Override // B9.j
    public final String d() throws h9.m, h9.h {
        if (c().j() < 48) {
            throw h9.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        e(8, sb2);
        int c11 = b().c(48, 2);
        sb2.append("(393");
        sb2.append(c11);
        sb2.append(')');
        int c12 = b().c(50, 10);
        if (c12 / 100 == 0) {
            sb2.append('0');
        }
        if (c12 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(c12);
        sb2.append(b().b(60, null).b());
        return sb2.toString();
    }
}
