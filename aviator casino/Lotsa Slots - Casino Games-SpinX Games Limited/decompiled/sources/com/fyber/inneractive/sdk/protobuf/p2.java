package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public final class p2 {
    public static final com.fyber.inneractive.sdk.protobuf.p2 c = new com.fyber.inneractive.sdk.protobuf.p2();
    public final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.protobuf.x1 f4211a = new com.fyber.inneractive.sdk.protobuf.x1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.fyber.inneractive.sdk.protobuf.j2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.fyber.inneractive.sdk.protobuf.j2] */
    public final com.fyber.inneractive.sdk.protobuf.t2 a(java.lang.Class cls) {
        com.fyber.inneractive.sdk.protobuf.i2 a2;
        com.fyber.inneractive.sdk.protobuf.i2 i2Var;
        java.lang.Class cls2;
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        com.fyber.inneractive.sdk.protobuf.t2 t2Var = (com.fyber.inneractive.sdk.protobuf.t2) this.b.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        com.fyber.inneractive.sdk.protobuf.x1 x1Var = this.f4211a;
        x1Var.getClass();
        java.lang.Class cls3 = com.fyber.inneractive.sdk.protobuf.u2.f4221a;
        if (!com.fyber.inneractive.sdk.protobuf.z0.class.isAssignableFrom(cls) && (cls2 = com.fyber.inneractive.sdk.protobuf.u2.f4221a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        com.fyber.inneractive.sdk.protobuf.r2 b = x1Var.f4229a.b(cls);
        if ((b.d & 2) == 2) {
            if (com.fyber.inneractive.sdk.protobuf.z0.class.isAssignableFrom(cls)) {
                i2Var = new com.fyber.inneractive.sdk.protobuf.j2(com.fyber.inneractive.sdk.protobuf.u2.d, com.fyber.inneractive.sdk.protobuf.k0.f4200a, b.f4215a);
            } else {
                com.fyber.inneractive.sdk.protobuf.o3 o3Var = com.fyber.inneractive.sdk.protobuf.u2.b;
                com.fyber.inneractive.sdk.protobuf.j0 j0Var = com.fyber.inneractive.sdk.protobuf.k0.b;
                if (j0Var == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                i2Var = new com.fyber.inneractive.sdk.protobuf.j2(o3Var, j0Var, b.f4215a);
            }
            a2 = i2Var;
        } else if (com.fyber.inneractive.sdk.protobuf.z0.class.isAssignableFrom(cls)) {
            a2 = ((b.d & 1) == 1 ? com.fyber.inneractive.sdk.protobuf.o2.PROTO2 : com.fyber.inneractive.sdk.protobuf.o2.PROTO3) == com.fyber.inneractive.sdk.protobuf.o2.PROTO2 ? com.fyber.inneractive.sdk.protobuf.i2.a(b, com.fyber.inneractive.sdk.protobuf.l2.b, com.fyber.inneractive.sdk.protobuf.t1.b, com.fyber.inneractive.sdk.protobuf.u2.d, com.fyber.inneractive.sdk.protobuf.k0.f4200a, com.fyber.inneractive.sdk.protobuf.a2.b) : com.fyber.inneractive.sdk.protobuf.i2.a(b, com.fyber.inneractive.sdk.protobuf.l2.b, com.fyber.inneractive.sdk.protobuf.t1.b, com.fyber.inneractive.sdk.protobuf.u2.d, (com.fyber.inneractive.sdk.protobuf.j0) null, com.fyber.inneractive.sdk.protobuf.a2.b);
        } else {
            if (((b.d & 1) == 1 ? com.fyber.inneractive.sdk.protobuf.o2.PROTO2 : com.fyber.inneractive.sdk.protobuf.o2.PROTO3) == com.fyber.inneractive.sdk.protobuf.o2.PROTO2) {
                com.fyber.inneractive.sdk.protobuf.k2 k2Var = com.fyber.inneractive.sdk.protobuf.l2.f4204a;
                com.fyber.inneractive.sdk.protobuf.r1 r1Var = com.fyber.inneractive.sdk.protobuf.t1.f4220a;
                com.fyber.inneractive.sdk.protobuf.o3 o3Var2 = com.fyber.inneractive.sdk.protobuf.u2.b;
                com.fyber.inneractive.sdk.protobuf.j0 j0Var2 = com.fyber.inneractive.sdk.protobuf.k0.b;
                if (j0Var2 == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a2 = com.fyber.inneractive.sdk.protobuf.i2.a(b, k2Var, r1Var, o3Var2, j0Var2, com.fyber.inneractive.sdk.protobuf.a2.f4176a);
            } else {
                a2 = com.fyber.inneractive.sdk.protobuf.i2.a(b, com.fyber.inneractive.sdk.protobuf.l2.f4204a, com.fyber.inneractive.sdk.protobuf.t1.f4220a, com.fyber.inneractive.sdk.protobuf.u2.c, (com.fyber.inneractive.sdk.protobuf.j0) null, com.fyber.inneractive.sdk.protobuf.a2.f4176a);
            }
        }
        com.fyber.inneractive.sdk.protobuf.t2 t2Var2 = (com.fyber.inneractive.sdk.protobuf.t2) this.b.putIfAbsent(cls, a2);
        return t2Var2 != null ? t2Var2 : a2;
    }
}
