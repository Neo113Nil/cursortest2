package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class z1 {
    public static com.fyber.inneractive.sdk.protobuf.y1 a(java.lang.Object obj, java.lang.Object obj2) {
        com.fyber.inneractive.sdk.protobuf.y1 y1Var = (com.fyber.inneractive.sdk.protobuf.y1) obj;
        com.fyber.inneractive.sdk.protobuf.y1 y1Var2 = (com.fyber.inneractive.sdk.protobuf.y1) obj2;
        if (!y1Var2.isEmpty()) {
            if (!y1Var.f4231a) {
                y1Var = y1Var.isEmpty() ? new com.fyber.inneractive.sdk.protobuf.y1() : new com.fyber.inneractive.sdk.protobuf.y1(y1Var);
            }
            if (!y1Var.f4231a) {
                throw new java.lang.UnsupportedOperationException();
            }
            if (!y1Var2.isEmpty()) {
                y1Var.putAll(y1Var2);
            }
        }
        return y1Var;
    }
}
