package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ok {
    public static int a(java.lang.String str) {
        if (kotlin.text.StringsKt.startsWith$default(str, "track_", false, 2, (java.lang.Object) null)) {
            str = str.substring(6);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }
}
