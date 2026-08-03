package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class h0 {
    public static volatile com.fyber.inneractive.sdk.protobuf.h0 b;
    public static final com.fyber.inneractive.sdk.protobuf.h0 c = new com.fyber.inneractive.sdk.protobuf.h0();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f4194a = java.util.Collections.emptyMap();

    public static com.fyber.inneractive.sdk.protobuf.h0 a() {
        com.fyber.inneractive.sdk.protobuf.h0 h0Var = b;
        if (h0Var == null) {
            synchronized (com.fyber.inneractive.sdk.protobuf.h0.class) {
                h0Var = b;
                if (h0Var == null) {
                    java.lang.Class cls = com.fyber.inneractive.sdk.protobuf.f0.f4190a;
                    com.fyber.inneractive.sdk.protobuf.h0 h0Var2 = null;
                    if (cls != null) {
                        try {
                            h0Var2 = (com.fyber.inneractive.sdk.protobuf.h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    if (h0Var2 == null) {
                        h0Var2 = c;
                    }
                    b = h0Var2;
                    h0Var = h0Var2;
                }
            }
        }
        return h0Var;
    }

    public final com.fyber.inneractive.sdk.protobuf.x0 a(int i, com.fyber.inneractive.sdk.protobuf.d2 d2Var) {
        return (com.fyber.inneractive.sdk.protobuf.x0) this.f4194a.get(new com.fyber.inneractive.sdk.protobuf.g0(i, d2Var));
    }
}
