package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qf1 {
    /* JADX INFO: renamed from: a */
    public static of1 m4094a(Object obj) {
        t70 t70Var = (t70) obj;
        of1 of1Var = t70Var.unknownFields;
        if (of1Var != of1.f5717f) {
            return of1Var;
        }
        of1 of1Var2 = new of1(0, new int[8], new Object[8], true);
        t70Var.unknownFields = of1Var2;
        return of1Var2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4095b(int i, C0212fi c0212fi, Object obj) throws ff0, if0 {
        AbstractC0175ei abstractC0175ei = (AbstractC0175ei) c0212fi.f2412e;
        int i2 = c0212fi.f2409b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c0212fi.m1813S(0);
            ((of1) obj).m3689c(i3 << 3, Long.valueOf(abstractC0175ei.mo689n()));
            return true;
        }
        if (i4 == 1) {
            c0212fi.m1813S(1);
            ((of1) obj).m3689c((i3 << 3) | 1, Long.valueOf(abstractC0175ei.mo686k()));
            return true;
        }
        if (i4 == 2) {
            ((of1) obj).m3689c((i3 << 3) | 2, c0212fi.m1839j());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw if0.m2597b();
            }
            c0212fi.m1813S(5);
            ((of1) obj).m3689c(5 | (i3 << 3), Integer.valueOf(abstractC0175ei.mo685j()));
            return true;
        }
        of1 of1Var = new of1(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new if0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0212fi.m1823b() != Integer.MAX_VALUE && m4095b(i7, c0212fi, of1Var)) {
        }
        if (i6 != c0212fi.f2409b) {
            throw new if0("Protocol message end-group tag did not match expected tag.");
        }
        if (of1Var.f5722e) {
            of1Var.f5722e = false;
        }
        ((of1) obj).m3689c(i5 | 3, of1Var);
        return true;
    }
}
