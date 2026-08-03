package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class o3 {
    public static void a(java.lang.Object obj, java.lang.Object obj2) {
        ((com.fyber.inneractive.sdk.protobuf.z0) obj).unknownFields = (com.fyber.inneractive.sdk.protobuf.n3) obj2;
    }

    public static boolean a(java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.s2 s2Var) {
        int e = s2Var.e();
        int i = e >>> 3;
        int i2 = e & 7;
        if (i2 == 0) {
            ((com.fyber.inneractive.sdk.protobuf.n3) obj).a(i << 3, java.lang.Long.valueOf(s2Var.o()));
            return true;
        }
        if (i2 == 1) {
            ((com.fyber.inneractive.sdk.protobuf.n3) obj).a((i << 3) | 1, java.lang.Long.valueOf(s2Var.g()));
            return true;
        }
        if (i2 == 2) {
            ((com.fyber.inneractive.sdk.protobuf.n3) obj).a((i << 3) | 2, s2Var.a());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                int i3 = com.fyber.inneractive.sdk.protobuf.n1.f4207a;
                throw new com.fyber.inneractive.sdk.protobuf.m1();
            }
            ((com.fyber.inneractive.sdk.protobuf.n3) obj).a((i << 3) | 5, java.lang.Integer.valueOf(s2Var.q()));
            return true;
        }
        com.fyber.inneractive.sdk.protobuf.n3 n3Var = new com.fyber.inneractive.sdk.protobuf.n3();
        int i4 = i << 3;
        int i5 = i4 | 4;
        while (s2Var.s() != Integer.MAX_VALUE && a((java.lang.Object) n3Var, s2Var)) {
        }
        if (i5 == s2Var.e()) {
            n3Var.e = false;
            ((com.fyber.inneractive.sdk.protobuf.n3) obj).a(i4 | 3, n3Var);
            return true;
        }
        throw new com.fyber.inneractive.sdk.protobuf.n1("Protocol message end-group tag did not match expected tag.");
    }
}
