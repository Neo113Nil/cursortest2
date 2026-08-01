package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3824jh {
    public static final boolean a(C3628ch c3628ch) {
        Intrinsics.checkNotNullParameter(c3628ch, "<this>");
        int i = c3628ch.b;
        if ((400 <= i && i < 600) || i <= 0) {
            return false;
        }
        String str = c3628ch.c;
        return str == null || str.length() == 0;
    }
}
