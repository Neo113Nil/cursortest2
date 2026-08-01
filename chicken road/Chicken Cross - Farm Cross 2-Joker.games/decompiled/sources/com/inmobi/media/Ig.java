package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Ig {
    public static final Hg a(byte b) {
        return b == 1 ? Hg.f6605a : b == 2 ? Hg.c : b == 3 ? Hg.b : b == 4 ? Hg.d : Hg.f6605a;
    }

    public static final boolean b(Hg hg) {
        Intrinsics.checkNotNullParameter(hg, "<this>");
        return hg == Hg.b || hg == Hg.d;
    }

    public static final int a(Hg hg) {
        Intrinsics.checkNotNullParameter(hg, "<this>");
        int ordinal = hg.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 90;
        }
        if (ordinal == 2) {
            return 180;
        }
        if (ordinal == 3) {
            return 270;
        }
        throw new NoWhenBranchMatchedException();
    }
}
