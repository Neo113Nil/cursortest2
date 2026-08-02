package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0686j;

/* loaded from: classes2.dex */
public final class C0 {
    public static B0 a(Object obj) {
        C c3 = (C) obj;
        B0 b02 = c3.unknownFields;
        if (b02 != B0.f12098f) {
            return b02;
        }
        B0 c4 = B0.c();
        c3.unknownFields = c4;
        return c4;
    }

    public static void b(Object obj) {
        B0 b02 = ((C) obj).unknownFields;
        if (b02.f12103e) {
            b02.f12103e = false;
        }
    }

    public static boolean c(Object obj, C0686j c0686j) {
        int i7 = c0686j.f9210b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        H6.b bVar = (H6.b) c0686j.f9213e;
        if (i9 == 0) {
            c0686j.W(0);
            ((B0) obj).d(i8 << 3, Long.valueOf(bVar.s()));
            return true;
        }
        if (i9 == 1) {
            c0686j.W(1);
            ((B0) obj).d((i8 << 3) | 1, Long.valueOf(bVar.o()));
            return true;
        }
        if (i9 == 2) {
            ((B0) obj).d((i8 << 3) | 2, c0686j.o());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw M.d();
            }
            c0686j.W(5);
            ((B0) obj).d((i8 << 3) | 5, Integer.valueOf(bVar.n()));
            return true;
        }
        B0 c3 = B0.c();
        int i10 = i8 << 3;
        int i11 = i10 | 4;
        while (c0686j.a() != Integer.MAX_VALUE && c(c3, c0686j)) {
        }
        if (i11 != c0686j.f9210b) {
            throw M.a();
        }
        if (c3.f12103e) {
            c3.f12103e = false;
        }
        ((B0) obj).d(i10 | 3, c3);
        return true;
    }
}
