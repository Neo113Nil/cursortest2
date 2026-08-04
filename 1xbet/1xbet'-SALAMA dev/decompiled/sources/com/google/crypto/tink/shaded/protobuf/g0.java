package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0665j;
import androidx.datastore.preferences.protobuf.C0678x;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    public static f0 a(Object obj) {
        AbstractC0842w abstractC0842w = (AbstractC0842w) obj;
        f0 f0Var = abstractC0842w.unknownFields;
        if (f0Var != f0.f11769f) {
            return f0Var;
        }
        f0 f0VarC = f0.c();
        abstractC0842w.unknownFields = f0VarC;
        return f0VarC;
    }

    public static void b(Object obj) {
        ((AbstractC0842w) obj).unknownFields.f11774e = false;
    }

    public static boolean c(Object obj, C0665j c0665j) throws com.google.protobuf.L, C, C0678x {
        int i7 = c0665j.f9210b;
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        L3.e eVar = (L3.e) c0665j.f9213e;
        if (i9 == 0) {
            c0665j.W(0);
            ((f0) obj).d(i8 << 3, Long.valueOf(eVar.v()));
            return true;
        }
        if (i9 == 1) {
            c0665j.W(1);
            ((f0) obj).d((i8 << 3) | 1, Long.valueOf(eVar.s()));
            return true;
        }
        if (i9 == 2) {
            ((f0) obj).d((i8 << 3) | 2, c0665j.n());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 5) {
                throw C.c();
            }
            c0665j.W(5);
            ((f0) obj).d((i8 << 3) | 5, Integer.valueOf(eVar.r()));
            return true;
        }
        f0 f0VarC = f0.c();
        int i10 = i8 << 3;
        int i11 = i10 | 4;
        while (c0665j.a() != Integer.MAX_VALUE && c(f0VarC, c0665j)) {
        }
        if (i11 != c0665j.f9210b) {
            throw new C("Protocol message end-group tag did not match expected tag.");
        }
        f0VarC.f11774e = false;
        ((f0) obj).d(i10 | 3, f0VarC);
        return true;
    }
}
