package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c0 {
    public static b0 a(Object obj) {
        AbstractC0696u abstractC0696u = (AbstractC0696u) obj;
        b0 b0Var = abstractC0696u.unknownFields;
        if (b0Var != b0.f9166f) {
            return b0Var;
        }
        b0 b0Var2 = new b0(0, new int[8], new Object[8], true);
        abstractC0696u.unknownFields = b0Var2;
        return b0Var2;
    }

    public static void b(Object obj) {
        b0 b0Var = ((AbstractC0696u) obj).unknownFields;
        if (b0Var.f9171e) {
            b0Var.f9171e = false;
        }
    }

    public static boolean c(int i7, C0686j c0686j, Object obj) {
        int i8 = c0686j.f9210b;
        int i9 = i8 >>> 3;
        int i10 = i8 & 7;
        L3.e eVar = (L3.e) c0686j.f9213e;
        if (i10 == 0) {
            c0686j.W(0);
            ((b0) obj).c(i9 << 3, Long.valueOf(eVar.v()));
            return true;
        }
        if (i10 == 1) {
            c0686j.W(1);
            ((b0) obj).c((i9 << 3) | 1, Long.valueOf(eVar.s()));
            return true;
        }
        if (i10 == 2) {
            ((b0) obj).c((i9 << 3) | 2, c0686j.m());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C0700y.b();
            }
            c0686j.W(5);
            ((b0) obj).c(5 | (i9 << 3), Integer.valueOf(eVar.r()));
            return true;
        }
        b0 b0Var = new b0(0, new int[8], new Object[8], true);
        int i11 = i9 << 3;
        int i12 = i11 | 4;
        int i13 = i7 + 1;
        if (i13 >= 100) {
            throw new C0700y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0686j.a() != Integer.MAX_VALUE && c(i13, c0686j, b0Var)) {
        }
        if (i12 != c0686j.f9210b) {
            throw new C0700y("Protocol message end-group tag did not match expected tag.");
        }
        if (b0Var.f9171e) {
            b0Var.f9171e = false;
        }
        ((b0) obj).c(i11 | 3, b0Var);
        return true;
    }
}
