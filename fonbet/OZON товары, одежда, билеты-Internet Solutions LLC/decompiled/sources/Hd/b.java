package Hd;

import Bl0.k0;
import Gd.f0;
import je.G0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class b {
    public static char a(long j11) {
        char c11 = (char) j11;
        k0.c(j11, "Out of range: %s", ((long) c11) == j11);
        return c11;
    }

    public static boolean b(char[] cArr, char c11) {
        for (char c12 : cArr) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b11, byte b12) {
        return (char) ((b11 << 8) | (b12 & 255));
    }

    public static a d(G0 g02, boolean z11, f0 f0Var, int i11) {
        boolean z12 = (i11 & 1) != 0 ? false : z11;
        boolean z13 = (i11 & 2) == 0;
        if ((i11 & 4) != 0) {
            f0Var = null;
        }
        Intrinsics.checkNotNullParameter(g02, "<this>");
        return new a(g02, z13, z12, f0Var != null ? e0.h(f0Var) : null, 34);
    }
}
