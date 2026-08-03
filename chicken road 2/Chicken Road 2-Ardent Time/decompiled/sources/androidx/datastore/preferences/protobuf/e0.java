package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class e0 {
    public static androidx.datastore.preferences.protobuf.d0 a(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = (androidx.datastore.preferences.protobuf.AbstractC0086w) obj;
        androidx.datastore.preferences.protobuf.d0 d0Var = abstractC0086w.unknownFields;
        if (d0Var != androidx.datastore.preferences.protobuf.d0.f2292f) {
            return d0Var;
        }
        androidx.datastore.preferences.protobuf.d0 d0Var2 = new androidx.datastore.preferences.protobuf.d0(0, new int[8], new java.lang.Object[8], true);
        abstractC0086w.unknownFields = d0Var2;
        return d0Var2;
    }

    public static void b(java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.d0 d0Var = ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj).unknownFields;
        if (d0Var.f2297e) {
            d0Var.f2297e = false;
        }
    }

    public static boolean c(int i2, androidx.datastore.preferences.protobuf.C0075k c0075k, java.lang.Object obj) {
        int i3 = c0075k.f2331b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        androidx.datastore.preferences.protobuf.AbstractC0074j abstractC0074j = c0075k.f2330a;
        if (i5 == 0) {
            c0075k.w(0);
            ((androidx.datastore.preferences.protobuf.d0) obj).c(i4 << 3, java.lang.Long.valueOf(abstractC0074j.n()));
            return true;
        }
        if (i5 == 1) {
            c0075k.w(1);
            ((androidx.datastore.preferences.protobuf.d0) obj).c((i4 << 3) | 1, java.lang.Long.valueOf(abstractC0074j.k()));
            return true;
        }
        if (i5 == 2) {
            ((androidx.datastore.preferences.protobuf.d0) obj).c((i4 << 3) | 2, c0075k.e());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw androidx.datastore.preferences.protobuf.A.b();
            }
            c0075k.w(5);
            ((androidx.datastore.preferences.protobuf.d0) obj).c(5 | (i4 << 3), java.lang.Integer.valueOf(abstractC0074j.j()));
            return true;
        }
        androidx.datastore.preferences.protobuf.d0 d0Var = new androidx.datastore.preferences.protobuf.d0(0, new int[8], new java.lang.Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new androidx.datastore.preferences.protobuf.A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0075k.a() != Integer.MAX_VALUE && c(i8, c0075k, d0Var)) {
        }
        if (i7 != c0075k.f2331b) {
            throw new androidx.datastore.preferences.protobuf.A("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f2297e) {
            d0Var.f2297e = false;
        }
        ((androidx.datastore.preferences.protobuf.d0) obj).c(i6 | 3, d0Var);
        return true;
    }
}
