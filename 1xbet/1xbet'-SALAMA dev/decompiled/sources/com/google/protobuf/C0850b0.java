package com.google.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0850b0 {
    public static Y a(Object obj) {
        return ((Z) obj).f12172a;
    }

    public static C0848a0 b(Object obj) {
        return (C0848a0) obj;
    }

    public static int c(int i7, Object obj, Object obj2) {
        C0848a0 c0848a0 = (C0848a0) obj;
        Z z4 = (Z) obj2;
        int iR0 = 0;
        if (!c0848a0.isEmpty()) {
            for (Map.Entry entry : c0848a0.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                z4.getClass();
                int iP0 = AbstractC0879q.p0(i7);
                int iA = Z.a(z4.f12172a, key, value);
                iR0 += AbstractC0879q.r0(iA) + iA + iP0;
            }
        }
        return iR0;
    }

    public static boolean d(Object obj) {
        return !((C0848a0) obj).f12175a;
    }

    public static C0848a0 e(Object obj, Object obj2) {
        C0848a0 c0848a0C = (C0848a0) obj;
        C0848a0 c0848a0 = (C0848a0) obj2;
        if (!c0848a0.isEmpty()) {
            if (!c0848a0C.f12175a) {
                c0848a0C = c0848a0C.c();
            }
            c0848a0C.b();
            if (!c0848a0.isEmpty()) {
                c0848a0C.putAll(c0848a0);
            }
        }
        return c0848a0C;
    }

    public static C0848a0 f() {
        return C0848a0.f12174b.c();
    }

    public static void g(Object obj) {
        ((C0848a0) obj).f12175a = false;
    }
}
