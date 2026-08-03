package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class s1 extends com.fyber.inneractive.sdk.protobuf.t1 {
    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(java.lang.Object obj, long j) {
        ((com.fyber.inneractive.sdk.protobuf.c) ((com.fyber.inneractive.sdk.protobuf.k1) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j))).f4180a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final java.util.List b(java.lang.Object obj, long j) {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
        if (((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
            return k1Var;
        }
        int size = k1Var.size();
        com.fyber.inneractive.sdk.protobuf.k1 b = k1Var.b(size == 0 ? 10 : size * 2);
        com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, b);
        return b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j, java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.protobuf.k1 k1Var = (com.fyber.inneractive.sdk.protobuf.k1) com.fyber.inneractive.sdk.protobuf.x3.e(obj, j);
        com.fyber.inneractive.sdk.protobuf.k1 k1Var2 = (com.fyber.inneractive.sdk.protobuf.k1) com.fyber.inneractive.sdk.protobuf.x3.e(obj2, j);
        int size = k1Var.size();
        int size2 = k1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((com.fyber.inneractive.sdk.protobuf.c) k1Var).f4180a) {
                k1Var = k1Var.b(size2 + size);
            }
            k1Var.addAll(k1Var2);
        }
        if (size > 0) {
            k1Var2 = k1Var;
        }
        com.fyber.inneractive.sdk.protobuf.x3.a(j, obj, k1Var2);
    }
}
