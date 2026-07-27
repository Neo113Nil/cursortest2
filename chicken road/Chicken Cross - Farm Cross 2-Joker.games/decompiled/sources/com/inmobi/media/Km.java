package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class Km {
    public static int a(String str) {
        if (StringsKt.startsWith$default(str, "track_", false, 2, (Object) null)) {
            str = str.substring(6);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
