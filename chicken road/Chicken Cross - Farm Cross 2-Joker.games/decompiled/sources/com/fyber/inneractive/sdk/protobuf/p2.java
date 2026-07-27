package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class p2 {
    public static final p2 c = new p2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final x1 f5868a = new x1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.fyber.inneractive.sdk.protobuf.j2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.fyber.inneractive.sdk.protobuf.j2] */
    public final t2 a(Class cls) {
        i2 a2;
        i2 i2Var;
        Class cls2;
        Charset charset = l1.f5860a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        t2 t2Var = (t2) this.b.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        x1 x1Var = this.f5868a;
        x1Var.getClass();
        Class cls3 = u2.f5878a;
        if (!z0.class.isAssignableFrom(cls) && (cls2 = u2.f5878a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        r2 b = x1Var.f5886a.b(cls);
        if ((b.d & 2) == 2) {
            if (z0.class.isAssignableFrom(cls)) {
                i2Var = new j2(u2.d, k0.f5857a, b.f5872a);
            } else {
                o3 o3Var = u2.b;
                j0 j0Var = k0.b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                i2Var = new j2(o3Var, j0Var, b.f5872a);
            }
            a2 = i2Var;
        } else if (z0.class.isAssignableFrom(cls)) {
            a2 = ((b.d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2 ? i2.a(b, l2.b, t1.b, u2.d, k0.f5857a, a2.b) : i2.a(b, l2.b, t1.b, u2.d, (j0) null, a2.b);
        } else {
            if (((b.d & 1) == 1 ? o2.PROTO2 : o2.PROTO3) == o2.PROTO2) {
                k2 k2Var = l2.f5861a;
                r1 r1Var = t1.f5877a;
                o3 o3Var2 = u2.b;
                j0 j0Var2 = k0.b;
                if (j0Var2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a2 = i2.a(b, k2Var, r1Var, o3Var2, j0Var2, a2.f5833a);
            } else {
                a2 = i2.a(b, l2.f5861a, t1.f5877a, u2.c, (j0) null, a2.f5833a);
            }
        }
        t2 t2Var2 = (t2) this.b.putIfAbsent(cls, a2);
        return t2Var2 != null ? t2Var2 : a2;
    }
}
