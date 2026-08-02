package B9;

/* loaded from: classes9.dex */
final class c extends h {
    @Override // B9.j
    public final String d() throws h9.m, h9.h {
        if (c().j() < 48) {
            throw h9.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        e(8, sb2);
        int c11 = b().c(48, 2);
        sb2.append("(392");
        sb2.append(c11);
        sb2.append(')');
        sb2.append(b().b(50, null).b());
        return sb2.toString();
    }
}
