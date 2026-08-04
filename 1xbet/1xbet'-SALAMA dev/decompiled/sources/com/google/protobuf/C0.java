package com.google.protobuf;

import androidx.datastore.preferences.protobuf.C0665j;
import androidx.datastore.preferences.protobuf.C0678x;

/* JADX INFO: loaded from: classes2.dex */
public final class C0 {
    public static B0 a(Object obj) {
        C c3 = (C) obj;
        B0 b7 = c3.unknownFields;
        if (b7 != B0.f12098f) {
            return b7;
        }
        B0 b0C = B0.c();
        c3.unknownFields = b0C;
        return b0C;
    }

    public static void b(Object obj) {
        B0 b7 = ((C) obj).unknownFields;
        if (b7.f12103e) {
            b7.f12103e = false;
        }
    }

    public static boolean c(Object obj, C0665j c0665j) throws com.google.crypto.tink.shaded.protobuf.B, M, C0678x {
        int i7 = c0665j.f9210b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        H6.b bVar = (H6.b) c0665j.f9213e;
        if (i9 == 0) {
            c0665j.W(0);
            ((B0) obj).d(i8 << 3, Long.valueOf(bVar.s()));
            return true;
        }
        if (i9 == 1) {
            c0665j.W(1);
            ((B0) obj).d((i8 << 3) | 1, Long.valueOf(bVar.o()));
            return true;
        }
        if (i9 == 2) {
            ((B0) obj).d((i8 << 3) | 2, c0665j.o());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw M.d();
            }
            c0665j.W(5);
            ((B0) obj).d((i8 << 3) | 5, Integer.valueOf(bVar.n()));
            return true;
        }
        B0 b0C = B0.c();
        int i10 = i8 << 3;
        int i11 = i10 | 4;
        while (c0665j.a() != Integer.MAX_VALUE && c(b0C, c0665j)) {
        }
        if (i11 != c0665j.f9210b) {
            throw M.a();
        }
        if (b0C.f12103e) {
            b0C.f12103e = false;
        }
        ((B0) obj).d(i10 | 3, b0C);
        return true;
    }
}
