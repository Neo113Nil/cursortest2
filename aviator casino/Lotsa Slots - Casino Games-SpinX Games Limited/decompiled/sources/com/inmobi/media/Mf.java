package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Mf {
    public static final com.inmobi.media.Lf a(byte b) {
        return b == 1 ? com.inmobi.media.Lf.f4819a : b == 2 ? com.inmobi.media.Lf.c : b == 3 ? com.inmobi.media.Lf.b : b == 4 ? com.inmobi.media.Lf.d : com.inmobi.media.Lf.f4819a;
    }

    public static final boolean b(com.inmobi.media.Lf lf) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lf, "<this>");
        return lf == com.inmobi.media.Lf.b || lf == com.inmobi.media.Lf.d;
    }

    public static final int a(com.inmobi.media.Lf lf) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lf, "<this>");
        int ordinal = lf.ordinal();
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
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
