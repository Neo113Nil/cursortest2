package com.google.common.math;

/* loaded from: classes4.dex */
public final class f {
    public static void a(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }
}
