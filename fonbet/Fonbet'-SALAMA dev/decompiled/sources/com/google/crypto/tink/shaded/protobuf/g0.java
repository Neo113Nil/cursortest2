package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0686j;

/* loaded from: classes2.dex */
public final class g0 {
    public static f0 a(Object obj) {
        AbstractC0886w abstractC0886w = (AbstractC0886w) obj;
        f0 f0Var = abstractC0886w.unknownFields;
        if (f0Var != f0.f11769f) {
            return f0Var;
        }
        f0 c3 = f0.c();
        abstractC0886w.unknownFields = c3;
        return c3;
    }

    public static void b(Object obj) {
        ((AbstractC0886w) obj).unknownFields.f11774e = false;
    }

    public static boolean c(Object obj, C0686j c0686j) {
        int i7 = c0686j.f9210b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        L3.e eVar = (L3.e) c0686j.f9213e;
        if (i9 == 0) {
            c0686j.W(0);
            ((f0) obj).d(i8 << 3, Long.valueOf(eVar.v()));
            return true;
        }
        if (i9 == 1) {
            c0686j.W(1);
            ((f0) obj).d((i8 << 3) | 1, Long.valueOf(eVar.s()));
            return true;
        }
        if (i9 == 2) {
            ((f0) obj).d((i8 << 3) | 2, c0686j.n());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw C.c();
            }
            c0686j.W(5);
            ((f0) obj).d((i8 << 3) | 5, Integer.valueOf(eVar.r()));
            return true;
        }
        f0 c3 = f0.c();
        int i10 = i8 << 3;
        int i11 = i10 | 4;
        while (c0686j.a() != Integer.MAX_VALUE && c(c3, c0686j)) {
        }
        if (i11 != c0686j.f9210b) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
        c3.f11774e = false;
        ((f0) obj).d(i10 | 3, c3);
        return true;
    }
}
