package com.google.common.primitives;

import com.google.common.base.k;

/* loaded from: classes4.dex */
public final class a {
    public static char a(long j) {
        char c = (char) j;
        k.b(j, ((long) c) == j, "Out of range: %s");
        return c;
    }
}
