package com.google.protobuf;

import java.util.Map;

/* renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0894b0 {
    public static Y a(Object obj) {
        return ((Z) obj).f12172a;
    }

    public static C0892a0 b(Object obj) {
        return (C0892a0) obj;
    }

    public static int c(int i7, Object obj, Object obj2) {
        C0892a0 c0892a0 = (C0892a0) obj;
        Z z4 = (Z) obj2;
        int i8 = 0;
        if (!c0892a0.isEmpty()) {
            for (Map.Entry entry : c0892a0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                z4.getClass();
                int p02 = AbstractC0923q.p0(i7);
                int a2 = Z.a(z4.f12172a, key, value);
                i8 += AbstractC0923q.r0(a2) + a2 + p02;
            }
        }
        return i8;
    }

    public static boolean d(Object obj) {
        return !((C0892a0) obj).f12175a;
    }

    public static C0892a0 e(Object obj, Object obj2) {
        C0892a0 c0892a0 = (C0892a0) obj;
        C0892a0 c0892a02 = (C0892a0) obj2;
        if (!c0892a02.isEmpty()) {
            if (!c0892a0.f12175a) {
                c0892a0 = c0892a0.c();
            }
            c0892a0.b();
            if (!c0892a02.isEmpty()) {
                c0892a0.putAll(c0892a02);
            }
        }
        return c0892a0;
    }

    public static C0892a0 f() {
        return C0892a0.f12174b.c();
    }

    public static void g(Object obj) {
        ((C0892a0) obj).f12175a = false;
    }
}
