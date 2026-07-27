package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0147w abstractC0147w = (AbstractC0147w) obj;
        d0 d0Var = abstractC0147w.unknownFields;
        if (d0Var != d0.f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0147w.unknownFields = d0Var2;
        return d0Var2;
    }

    public static boolean b(int i3, C0136k c0136k, Object obj) {
        int i4 = c0136k.f2258b;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        AbstractC0135j abstractC0135j = c0136k.f2257a;
        if (i6 == 0) {
            c0136k.w(0);
            ((d0) obj).c(i5 << 3, Long.valueOf(abstractC0135j.n()));
            return true;
        }
        if (i6 == 1) {
            c0136k.w(1);
            ((d0) obj).c((i5 << 3) | 1, Long.valueOf(abstractC0135j.k()));
            return true;
        }
        if (i6 == 2) {
            ((d0) obj).c((i5 << 3) | 2, c0136k.e());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw A.b();
            }
            c0136k.w(5);
            ((d0) obj).c(5 | (i5 << 3), Integer.valueOf(abstractC0135j.j()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i7 = i5 << 3;
        int i8 = i7 | 4;
        int i9 = i3 + 1;
        if (i9 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0136k.a() != Integer.MAX_VALUE && b(i9, c0136k, d0Var)) {
        }
        if (i8 != c0136k.f2258b) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f2227e) {
            d0Var.f2227e = false;
        }
        ((d0) obj).c(i7 | 3, d0Var);
        return true;
    }
}
