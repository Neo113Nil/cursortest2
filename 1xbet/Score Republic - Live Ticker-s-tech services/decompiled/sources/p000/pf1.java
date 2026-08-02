package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 {
    /* JADX INFO: renamed from: a */
    public static nf1 m3902a(Object obj) {
        s70 s70Var = (s70) obj;
        nf1 nf1Var = s70Var.unknownFields;
        if (nf1Var != nf1.f5398f) {
            return nf1Var;
        }
        nf1 nf1Var2 = new nf1(0, new int[8], new Object[8], true);
        s70Var.unknownFields = nf1Var2;
        return nf1Var2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3903b(int i, C0212fi c0212fi, Object obj) throws gf0, hf0 {
        int i2 = c0212fi.f2409b;
        AbstractC0860x0 abstractC0860x0 = (AbstractC0860x0) c0212fi.f2412e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c0212fi.m1813S(0);
            ((nf1) obj).m3535c(i3 << 3, Long.valueOf(abstractC0860x0.mo234q()));
            return true;
        }
        if (i4 == 1) {
            c0212fi.m1813S(1);
            ((nf1) obj).m3535c((i3 << 3) | 1, Long.valueOf(abstractC0860x0.mo228n()));
            return true;
        }
        if (i4 == 2) {
            ((nf1) obj).m3535c((i3 << 3) | 2, c0212fi.m1837i());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw hf0.m2259b();
            }
            c0212fi.m1813S(5);
            ((nf1) obj).m3535c(5 | (i3 << 3), Integer.valueOf(abstractC0860x0.mo226m()));
            return true;
        }
        nf1 nf1Var = new nf1(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new hf0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0212fi.m1823b() != Integer.MAX_VALUE && m3903b(i7, c0212fi, nf1Var)) {
        }
        if (i6 != c0212fi.f2409b) {
            throw new hf0("Protocol message end-group tag did not match expected tag.");
        }
        if (nf1Var.f5403e) {
            nf1Var.f5403e = false;
        }
        ((nf1) obj).m3535c(i5 | 3, nf1Var);
        return true;
    }
}
